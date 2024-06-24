package com.example.proyecto2_p8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner spp1, spp2;
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spp1 = findViewById(R.id.spp1);
        spp2 = findViewById(R.id.spp2);
        iv1 = findViewById(R.id.iv1);

        String[] options = {"Vertebrados", "Invertebrados"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, options);
        spp1.setAdapter(adapter);

        spp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selec = parent.getItemAtPosition(position).toString();
                if (selec.equals("Vertebrados")) {

                    String[] options2 = {"León", "Águila", "Tiburon", "Rana", "Serpiente"};
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, options2);
                    spp2.setAdapter(adapter2);

                    spp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String selec2 = parent.getItemAtPosition(position).toString();
                            if (selec2.equals("León")) {
                                iv1.setImageResource(R.drawable.leon);
                            } else if (selec2.equals("Águila")) {
                                iv1.setImageResource(R.drawable.aguila);
                            } else if (selec2.equals("Tiburon")) {
                                iv1.setImageResource(R.drawable.tiburon);
                            }else if (selec2.equals("Rana")) {
                                iv1.setImageResource(R.drawable.rana);
                            }else if (selec2.equals("Serpiente")) {
                                iv1.setImageResource(R.drawable.serpiente);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                } else if (selec.equals("Invertebrados")) {

                    String[] options2 = {"Mariposa", "Medusa", "Caracol", "Arana", "Estrella de Mar"};
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, options2);
                    spp2.setAdapter(adapter2);

                    spp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String selec2 = parent.getItemAtPosition(position).toString();
                            if (selec2.equals("Mariposa")) {
                                iv1.setImageResource(R.drawable.mariposa);
                            } else if (selec2.equals("Medusa")) {
                                iv1.setImageResource(R.drawable.medusa);
                            } else if (selec2.equals("Caracol")) {
                                iv1.setImageResource(R.drawable.caracol);
                            }else if (selec2.equals("Arana")) {
                                iv1.setImageResource(R.drawable.arana);
                            }else if (selec2.equals("Estrella de Mar")) {
                                iv1.setImageResource(R.drawable.estrella);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}