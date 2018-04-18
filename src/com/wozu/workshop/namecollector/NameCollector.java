package com.wozu.workshop.namecollector;

public class NameCollector {
	private String[] names = new String[3];
    public NameCollector()
    {
        names[0] = "Steve";
        names[1] = "Abby";
        names[2] = "Luke";
    }

    public void AddName(String newName){
        names[names.length] = newName;
    }

    public void RemoveName(String nameToRemove){
        int i = 1;
        do {
            if (names[i] == nameToRemove){
                names[i] = null;
            }
        } while(i <= names.length);
    }

    public String[] GetNames(){
        return names;
    }
}

