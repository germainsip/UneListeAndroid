package com.afpa.unliste;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

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

       List<UserAcount> listCli = new ArrayList<UserAcount>();
       listCli.add(francois);
       listCli.add(germain);
       listCli.add(cedric);

        listView.setAdapter(new CustomListAdpater(listCli, this));



    }
}
