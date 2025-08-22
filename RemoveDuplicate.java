

public class RemoveDuplicate {
    public static boolean[] map=new boolean[26];

    public static void removeifduplicate(String a,int index,String newstring){
        if(index==a.length()){
            System.out.println("the duplicate free string is : "+newstring);
            return;
        }


        char current= a.charAt(index);
        if(map[current-'a']==true){
            removeifduplicate(a, index+1, newstring);
        }
        else{
            map[current-'a']=true;
            removeifduplicate(a, index+1, newstring+current);
        }

    }

    public static void main(String[] args) {
        removeifduplicate("abcdefabcdefg",0,"");
    }
    
}
