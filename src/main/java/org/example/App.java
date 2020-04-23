package org.example;


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        String str1 = "Java";
        String str2 = "Long example sentence";
        String str3 = "Even longer example sentence";
        String str4 ="Ok this is not as long!";
        String str5 = "CAPS EQUALS CREAMING";
        String str6 = "Java is the worst programming language!";
        String str7 = " J   a   v   a   ";
        //1
        System.out.println(str1.length());
        //1 again
        System.out.println(str2.charAt(6));
        //2
        System.out.println(str3.indexOf('o'));
        //3
        System.out.println(str4.substring(11,str4.length()-1));
        //4
        str5 = str5.toLowerCase();
        System.out.println(str5);
        str5 = str5.toUpperCase();
        System.out.println(str5);
        //5
        System.out.println(str6.replace("worst", "best"));
        //6
        System.out.println(str7.trim());

        //7
        int a = 20;
        String str8 = String.valueOf(a);
        str8 = str8.concat("20");
        System.out.println(str8);

        //8
        String str9 = "Oil and Water";
        String[] arrayStr9 = str9.split("\\s");
        String[] array = new String[2];
        array[0] = arrayStr9[0];
        array[1] = arrayStr9[2];
        System.out.println(Arrays.toString(array));

        //9
        String str10 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arrayStr10 = str10.split(",");
        for (String s : arrayStr10) {
            System.out.println(s);
        }

        //10
        String str11 = "ThisShouldBeConverted";
        char[] arrayStr11 = str11.toCharArray();
        for (char c : arrayStr11) {
            System.out.println(c);
        }

        //11
        char[] arrayChar = {'J','a','v','a'};
        String str12 = Arrays.toString(arrayChar);
        System.out.println(str12);
    }
}
