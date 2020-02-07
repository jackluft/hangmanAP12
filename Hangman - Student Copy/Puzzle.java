import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    //Guests
    private ArrayList<String> gl = new ArrayList<String>();
    private String word = "starcraft";
    String[] s = new String[word.length()];
    Scanner scanner = new Scanner(System.in);
    
    public Puzzle(){
        for(int i = 0; i < s.length; i++){
            s[i] = "_";
            
            
        }
        
        
        
    }
    
    public void show(){
        
        for(int i = 0; i < s.length; i++){
            
            System.out.print(s[i]);
            System.out.print(" ");
            
        }
        System.out.println();
        System.out.print("Your Guesses: ");
        for(int i = 0; i < gl.size(); i++){
            System.out.print(gl.get(i));
            System.out.print(",");
            
            
        }
        
        
    }
    
    
    
    public boolean isUnsolved(){
        int c = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] == "_"){
                return true;
                
            }
            
            
        }
        
        return false;
    }
    
    public boolean makeGuess(String g){
        boolean found = false;
        while(gl.contains(g) == true){
                System.out.println("U already asked for that Letter!!!! \n Try again");
                g = scanner.nextLine();
                
                
                
            }
        if(gl.contains(g) == false){
            for(int i =0; i < word.length(); i++){
                if(word.charAt(i) == g.charAt(0)){
                    s[i] = word.substring(i,i+1);
                    
                    found = true;
                    
                }
                
                
                
            }
            gl.add(g);
            if(found == true){
                return true;
                
                
            }
            return false;
           
        }else{
            
            
            return false;
            
        }
        
        
        
        
    }
    
    public String getWord(){
        
        return word;
        
        
    }
   
}
