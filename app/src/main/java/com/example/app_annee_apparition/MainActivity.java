package com.example.app_annee_apparition;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lp = findViewById(R.id.listPro);
        SimpleAdapter myadapter = new
                SimpleAdapter(this, this.getData(), R.layout.design_list, new String[]{"langage", "annee", "icone"}, new
                        int[]{R.id.txtL, R.id.txtAnnee, R.id.icone});
        lp.setAdapter(myadapter);
    }

    public ArrayList<HashMap<String, String>> getData() {
        ArrayList<HashMap<String, String>> listH = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("langage", "Python");
        hm.put("annee", "1994");
        hm.put("icone", String.valueOf(R.drawable.python));
        listH.add(hm);

        hm = new HashMap<>();
        hm.put("langage", "Java");
        hm.put("annee", "1994");
        hm.put("icone", String.valueOf(R.drawable.java));
        listH.add(hm);

        hm = new HashMap<>();
        hm.put("langage", "Kotlin");
        hm.put("annee", "2000");
        hm.put("icone", String.valueOf(R.drawable.kotlinicon));
        listH.add(hm);

        hm = new HashMap<>();
        hm.put("langage", "C#");
        hm.put("annee", "2001");
        hm.put("icone", String.valueOf(R.drawable.cshap));
        listH.add(hm);
        return listH;

    }

}
