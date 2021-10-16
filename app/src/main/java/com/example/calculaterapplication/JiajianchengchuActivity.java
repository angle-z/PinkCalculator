package com.example.calculaterapplication;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/*
 * Java实现实数四则运算：
 * 输入格式：
 * 2
 * +
 * 3
 *
 * 输出格式：
 * 5*/
import java.util.*;


public class JiajianchengchuActivity extends AppCompatActivity {

    static boolean flag;
    final TextView textView1 = (TextView)findViewById(R.id.TextView1);
    final TextView textView2 = (TextView)findViewById(R.id.TextView2);
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner scan=new Scanner(System.in);
//        double a=scan.nextDouble();
//        String str=scan.next();
//        double b=scan.nextDouble();
//        scan.close();
//        print(a,b,str);
//        System.out.println();
//
//    }
    public int Hex2Dec(String hex) {
    //                BigInteger lngNum=new BigInteger(hex,16);
    //                return lngNum.intValue();
        int value = Integer.valueOf(hex, 16);//16（string）进制转10进制（int）
        return value;
    }

        //10进制转16进制
    public int Dec2Hex(String dec){
        String a=String.format("%X",Integer.valueOf(dec,10));//10（string）进制转16进制（string）
        return Integer.valueOf(a).intValue();//16(String)进制转16（int）进制


    }


    public static int Result(int a,int b,String str) {
        int c=0;
        if(str.equals("+")) {
            c=a+b;
        }else if(str.equals("-")) {
            c=a-b;
        }else if(str.equals("*")) {
            c=a*b;
        }else if(str.equals("/")) {
            if(b!=0) {
                c=a/b;
            }else {
                //System.out.println("error");
                flag=true;
            }
        }
        if(!flag) {
            return c;
            }
        return 0;
        }
    }



