package com.example.dictionaryone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView meaning,sentence,word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //text views
        meaning = findViewById(R.id.meaning);
        sentence = findViewById(R.id.sentence);
        word = findViewById(R.id.word);
        //intent to get extras
        Intent mIntent = getIntent();
        int pos = mIntent.getIntExtra("position", 0);
        String word1 = mIntent.getStringExtra("Word");
        switch (pos)
        {
            case 0:
                word.setText(""+word1);
                meaning.setText("an unpleasant mixture of sounds; harsh noise; discord");
                sentence.setText("A cacophony of bleats, chomping and scuffling of hooves drowned out her words.");
                break;
            case 1:
                word.setText(""+word1);
                meaning.setText("bad tempered and uncooperative");
                sentence.setText("Jessie's husband passed away and she moved in with her cantankerous father-in-laws");
                break;
            case 2:
                word.setText(""+word1);
                meaning.setText("resist or disobey; challenge or dare");
                sentence.setText("Defy me, and you will suffer my wrath");
                break;
            case 3:
                word.setText(""+word1);
                meaning.setText("friendly; generous; helpful");
                sentence.setText("Long Cross Farm is reputedly haunted by a very benevolent spirit");
                break;
            case 4:
                word.setText(""+word1);
                meaning.setText("full of life and excitement");
                sentence.setText("Sparklers from Champagne offer flavors of vanilla, biscuits and citrus, bubbling up with a refreshing effervescence.");
                break;
            case 5:
                word.setText(""+word1);
                meaning.setText("flabby; limp; soft");
                sentence.setText("This causes the muscles to become limp or soft, and they cannot contract, a condition called flaccid paralysis and is the type found in polio.");
                break;
            case 6:
                word.setText(""+word1);
                meaning.setText("showy; overly decorated");
                sentence.setText("Finally, stir and garnish with an orange slice and a cocktail cherry");
                break;
            case 7:
                word.setText(""+word1);
                meaning.setText("a break in continuity; a gap in a series");
                sentence.setText("After a three year hiatus, Simple Minds came back with a new CD.");
                break;
            case 8:
                word.setText(""+word1);
                meaning.setText("to depart secretly");
                sentence.setText("But the governor of Syria had sent a demand for Herod's acquittal, and so Hyrcanus adjourned the trial and persuaded the accused to abscond.");
                break;
            case 9:
                word.setText(""+word1);
                meaning.setText("without flavor; tasteless");
                sentence.setText("It's jealous and insipid comments like these, some would argue, that contribute to the unhealthy attitude towards food and body image so prevalent in our culture today.");
                break;
            case 10:
                word.setText(""+word1);
                meaning.setText("carefree; jolly");
                sentence.setText("Look for candy necklaces, glow-in-the-dark bracelets, tie-dyed purses, and jaunty hats");
                break;
            case 11:
                word.setText(""+word1);
                meaning.setText(" to light a fire");
                sentence.setText("Kindle in all hearts the flame of virtue.");
                break;
            case 12:
                word.setText(""+word1);
                meaning.setText("Easy and pleasant to speak to; approachable");
                sentence.setText("Her grandfather has always been the most affable man around");
                break;
            case 13:
                word.setText(""+word1);
                meaning.setText("The definition of laconic refers to someone who doesn't talk a lot or uses very few words.");
                sentence.setText("He raised both eyebrows with a laconic grin.");
                break;
            case 14:
                word.setText(""+word1);
                meaning.setText("The definition of magnanimous is big-hearted, noble and generous of spirit");
                sentence.setText("I must be magnanimous and truly great");
                break;
            case 15:
                word.setText(""+word1);
                meaning.setText("Neophyte is a beginner, a recent convert to something and not yet very familiar with it.");
                sentence.setText("Many people-especially many neophyte entrepreneurs-believe that the idea is everything.");
                break;
            case 16:
                word.setText(""+word1);
                meaning.setText("The definition of judicious is having good judgment");
                sentence.setText("This criticism needs judicious qualification");
                break;
            case 17:
                word.setText(""+word1);
                meaning.setText("The definition of nostalgic is someone or something who has a longing for the past or who looks back and remembers the past wistfully.");
                sentence.setText("When the old song came on the radio, Harold suddenly felt nostalgic for his high school years.");
                break;


        }
        }
    }

