/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author CE181767 Le Nhut Anh
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
       
        System.out.println("expected: 5! = 120; actual: " + result);
        
        //MathUtil.getFactorial(-5);
    
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1;   actual: " + MathUtil.getFactorial(0));
        //Them code sau lan dau tien lam chuyen ay - code len server 18:07 2/2/2024
        System.out.println("expected: 3! = 6;   actual: " + MathUtil.getFactorial(3));
    }
    
}
