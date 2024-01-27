package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "Please provide a string to be capitalized: " );
        String str = myObj.nextLine();
        myObj.close();
        str = capitilize(str);
        System.out.println("");
        System.out.println("Your capitilized string is: " + str);
        System.out.println("");
        System.out.println("The MD5Hex is: "+ md5(str));
        System.out.println("");
    }

    public static String capitilize(String str){
        return str.toUpperCase();
    }

    public static String md5(String str) {
        return DigestUtils.md5Hex(str);
    }
}
