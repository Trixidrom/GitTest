package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    static ArrayList<BigInteger> arrBigInt= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addMass(6, 500);
        addMass(5, 1000);
        Collections.sort(arrBigInt);
        System.out.println("венрну как я как было, олух");
        System.out.println("венрну как я как было, олух");
    }

    public void addMass(int n, int size){
        BigInteger koef = new BigInteger("10");
        BigInteger koef2 = new BigInteger("10");
        BigInteger sum;
        String strMult;
        arrBigInt.add(BigInteger.valueOf(n-5));
        arrBigInt.add(BigInteger.valueOf(n));
        int i = arrBigInt.size(), l1, l2;
        while (arrBigInt.size()<=size) {
            sum = arrBigInt.get(i-1).add(koef); //
            strMult = sum.multiply(sum).toString();
            l1 = sum.toString().length();//длина бига
            l2 = strMult.length();//длина бига произведения
            strMult = strMult.substring(l2 - l1);

            if (strMult.equals(sum.toString())) {

                arrBigInt.add(sum);
                koef = BigInteger.TEN.pow(l1);
                koef2 = BigInteger.TEN.pow(l1);
                i++;
            }else {
                koef = koef.add(koef2);
            }
        }
    }

    public void da(){
        System.out.println("да что ты делашеь, олух!");
    }
}

