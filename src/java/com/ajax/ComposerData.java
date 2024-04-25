package com.ajax;

import java.util.HashMap;

/**
 *
 * @author nbuser
 */
public class ComposerData {
    
    private HashMap composers = new HashMap();
    

    public HashMap getComposers() {
        return composers;
    }
    
    public ComposerData() {
        
        composers.put("1", new Composer("1", "Sebuoeng", "Phera", "Baroque"));
        composers.put("2", new Composer("2", "Bohlokoa", "Mpota", "Baroque"));
        composers.put("3", new Composer("3", "Mamello", "Lehlokoa", "Baroque"));
        composers.put("4", new Composer("4", "Realeboha", "Matela", "Baroque"));
        composers.put("5", new Composer("5", "Malechesa", "Pule", "Baroque"));
        composers.put("6", new Composer("6", "Lerato", "Tlali", "Baroque"));
        composers.put("7", new Composer("7", "Thato", "Lerotholi", "Baroque"));
        
        composers.put("8", new Composer("8", "Tsoakae", "Khalla", "Classical"));
        composers.put("9", new Composer("9", "Makoatle", "Lepekola", "Classical"));
        composers.put("10", new Composer("10", "Nteboheng", "Moloantoa", "Classical"));
        composers.put("11", new Composer("11", "Lineo", "Sibi", "Classical"));
        composers.put("12", new Composer("12", "Amohelang", "Mosebetsane", "Classical"));
        composers.put("13", new Composer("13", "Senzo", "Makhamba", "Classical"));
        composers.put("14", new Composer("14", "Moletsane", "Mokhena", "Classical"));
        composers.put("15", new Composer("15", "Katleho", "Ntho", "Classical"));
        composers.put("16", new Composer("16", "Kopano", "Khatleli", "Classical"));
        composers.put("17", new Composer("17", "Karabelo", "Rocina", "Classical"));
        composers.put("18", new Composer("18", "Mokheba", "Mokheba", "Classical"));
        composers.put("19", new Composer("19", "Sanele", "Leteba", "Classical"));
        
        composers.put("20", new Composer("20", "Mpuoeng", "Pheko", "Romantic"));
        composers.put("21", new Composer("21", "Leabuoa", "Phera", "Romantic"));
        composers.put("22", new Composer("22", "Reabetsoe", "Khali", "Romantic"));
        composers.put("23", new Composer("23", "Relebohile", "Mohlekoa", "Romantic"));
        composers.put("24", new Composer("24", "Liteboho", "Lehlakeng", "Romantic"));
        composers.put("25", new Composer("25", "Mpho", "Makoatleng", "Romantic"));
        composers.put("26", new Composer("26", "Nteboheleng", "Mokoatleng", "Romantic"));
        composers.put("27", new Composer("27", "Matshiliso", "Sebilo", "Romantic"));
        composers.put("28", new Composer("28", "Atang", "Nthontho", "Romantic"));
        composers.put("29", new Composer("29", "Lethato", "Rantsho", "Romantic"));  
        
        composers.put("30", new Composer("30", "Khutlang", "Moabi", "Romantic"));
        composers.put("31", new Composer("31", "Nthabiseng", "Mokati", "Romantic"));
        composers.put("32", new Composer("32", "Nteliseng", "Khatleli", "Romantic"));
        composers.put("33", new Composer("33", "Matee", "Matee", "Romantic"));
        composers.put("34", new Composer("34", "Fako", "Lillo", "Romantic"));
        composers.put("35", new Composer("35", "Khetheng", "Mapake", "Romantic"));
        composers.put("36", new Composer("36", "Jean", "Sibelius", "Romantic"));
        composers.put("37", new Composer("37", "Lehlohonolo", "Mapesela", "Romantic"));
        composers.put("38", new Composer("38", "Lineo", "Ramokheseng", "Romantic"));
        composers.put("39", new Composer("39", "Felleng", "Phera", "Romantic"));
        composers.put("40", new Composer("40", "Botle", "Molupi", "Romantic"));

        composers.put("41", new Composer("41", "Bolae", "Bartok", "Post-Romantic"));
        composers.put("42", new Composer("42", "Likhabiso", "Remo", "Post-Romantic"));
        composers.put("43", new Composer("43", "Maama", "Maama", "Post-Romantic"));
        composers.put("44", new Composer("44", "Matsela", "Matee", "Post-Romantic"));
        composers.put("45", new Composer("45", "Mapake", "Lieketseng", "Post-Romantic"));
        composers.put("46", new Composer("46", "Tlaleng", "Sethuntsha", "Post-Romantic"));
        composers.put("47", new Composer("47", "Lehlohonolo", "Mpesi", "Post-Romantic"));
        composers.put("48", new Composer("48", "Mapalesa", "Mapesela", "Post-Romantic"));
        composers.put("49", new Composer("49", "Katiso", "Khutlisi", "Post-Romantic"));
        composers.put("50", new Composer("50", "Nthateleng", "Phera", "Post-Romantic"));

    }

}
