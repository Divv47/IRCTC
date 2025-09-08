/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;


class Train {
    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String , Time> StationTimes;
    
    private List<Stations> stations;
}
