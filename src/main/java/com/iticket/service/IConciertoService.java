/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iticket.service;

import com.iticket.entity.Concierto;
import java.util.List;

/**
 *
 * @author ricky
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoByID (long id);
    public void saveConcierto(Concierto concierto);
    public void delete (long id);
}
