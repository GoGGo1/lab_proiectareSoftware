package ro.ulbs.paradigme.lab3.util;

import java.util.Arrays;

public class PasswordMaker extends StringRandomizer {
    private static final int MAGIC_NUMBER=5 + (int)(Math.random() * ((10 - 5) + 1));
    private String password;
    private final String magicString=new String(new StringRandomizer(20).randomString);

    public PasswordMaker(String name){
        super(MAGIC_NUMBER);
        char[] aux_magicString=new char[10];
        int rand;
        for(int i=0;i<aux_magicString.length;i++){
            rand=(int)(Math.random()*20);
            aux_magicString[i]=magicString.charAt(rand);
        }
        password=new String(super.randomString) + new String (aux_magicString) + String.valueOf(name.length()) + (int)(Math.random() * (50 + 1)) ;

    }

    public String getPassword(){
        return password;
    }

}
