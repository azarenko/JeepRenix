package com.jeep.renix.app;

import javax.swing.*;
import com.fazecast.jSerialComm.SerialPort;

public class App {
    private JPanel panel;
    private JComboBox _comport;

    public static void main(String[] args)
    {
        var app = new App();
        var frame = new JFrame("Jeep Renix Ecu Diagnostic software. Created by Azarenko S.A.");
        frame.setContentPane(app.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 600);

        var portList = SerialPort.getCommPorts();

        if(portList.length == 0)
        {
            return;
        }

        for (var port : portList)
        {
            app._comport.addItem(port.getSystemPortName());
        }
    }
}
