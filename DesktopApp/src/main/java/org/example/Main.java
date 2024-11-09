package org.example;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        String appName = CommonUtility.getAppName();

        System.out.println("Desktop welcome " + appName);
    }
}