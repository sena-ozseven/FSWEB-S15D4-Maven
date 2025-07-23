package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            System.out.println("Listede zaten var.");
            return false;
        } else {
            super.add(o);
            System.out.println("listeye eklendi.");
            return true;
        }
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        sort();
        return super.remove(o);
    }
}
