package com.example.brom.activitiesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.
    private ArrayList<String>listData;
    private ArrayAdapter <String> adapter;
    private ArrayList<Mountain>MountainData=new ArrayList<>();
    private ArrayAdapter<Mountain>MountainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listData=new ArrayList<>(Arrays.asList(mountainNames));

        MountainData.add(new Mountain(mountainNames[0], mountainLocations[0],mountainHeights[0]));
        MountainAdapter= new ArrayAdapter<Mountain>(this, R.layout. list_item_textview, R.id.list_item_textview, MountainData);


        adapter= new ArrayAdapter<String>(this, R.layout. list_item_textview, R.id.list_item_textview, listData);

        ListView my_listview=(ListView) findViewById(R.id.my_listview);
        my_listview.setAdapter(MountainAdapter);

        my_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //Skapar en variabel som hämtar datan som ska fram i toasten.
               /* String test = " "       + mountainNames[i] + " "
                        + mountainLocations [i] +" "
                        + mountainHeights [i] + " ";*/
               String test= MountainData.get(i).info();
                Toast.makeText(MainActivity.this, test, Toast.LENGTH_SHORT).show();
            }
        });



        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "Mountain
        // 3. Create a new Layout file for the Mountain called
        //    "activity_mountaindetails". Mountain must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the Mountain with the data from the Intent created in step
        //    6
        // 8. From the Mountain you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    Mountain.
    }
}



