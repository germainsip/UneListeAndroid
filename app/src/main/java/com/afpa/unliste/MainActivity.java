package com.afpa.unliste;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // récup listview
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        UserAcount francois = new UserAcount("François", "admin");
        UserAcount germain = new UserAcount("Germain", "user");
        UserAcount cedric = new UserAcount("Cédric", "guest", false);

        UserAcount[] users = new UserAcount[]{francois, germain, cedric};

        ArrayAdapter<UserAcount> arrayAdapter = new ArrayAdapter<UserAcount>(this, android.R.layout.simple_list_item_checked, users);

        listView.setAdapter(arrayAdapter);
        for (int i = 0; i < users.length; i++) {
            listView.setItemChecked(i, users[i].isActive());
        }


    }
}
