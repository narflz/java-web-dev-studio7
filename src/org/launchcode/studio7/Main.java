package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> ghostsContents = new ArrayList<>();
        ghostsContents.add("Wussy - Breakfast in Bed.mp3");
        ghostsContents.add("Wussy - Fly Fly Fly (Green Belt Version).mp3");
        ghostsContents.add("Wussy - Jonah (dj dq Remix).mp3");
        ghostsContents.add("INERT - Whispering.mp3");
        ghostsContents.add("Wussy - Days and Hours.mp3");
        ghostsContents.add("Wussy - She's Out There (Early Rough Mix).mp3");
        ghostsContents.add("Wussy - Shunt (Live on WOXY).mp3");
        ghostsContents.add("The Magic Words - Mayflies.mp3");
        ghostsContents.add("Chuck Cleaver & Lisa Walker - Mountain In Our Backyard.mp3");
        ghostsContents.add("Chuck Cleaver - The Night We Missed the Horror Show.mp3");
        ghostsContents.add("cover.jpg");
        CD wussyGhosts = new CD ("Wussy - Ghosts", ghostsContents, 700, "Audio CD");

        ArrayList<String> potemkinContents = new ArrayList<>();
        potemkinContents.add("battleship_potemkin.mpeg");
        potemkinContents.add("es_subs.srt");
        DVD battleshipPotemkin = new DVD ("Battleship Potemkin", potemkinContents);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        wussyGhosts.spinDisc();
        wussyGhosts.read();
        wussyGhosts.reportDiscInfo();

        battleshipPotemkin.spinDisc();
        battleshipPotemkin.read();
        battleshipPotemkin.reportDiscInfo();

    }
}
