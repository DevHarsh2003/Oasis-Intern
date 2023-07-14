package com.example.application2temperatureconeversionbetweenunits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText input, output;
    Spinner input_spinner, output_spinner;
    Button convert;
    TextView update_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        input_spinner = findViewById(R.id.input_spinner);
        output_spinner = findViewById(R.id.output_spinner);
        convert = findViewById(R.id.convert);
        update_view=findViewById(R.id.textView3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        input_spinner.setAdapter(adapter);
        output_spinner.setAdapter(adapter);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputstring = input.getText().toString();
                if (TextUtils.isEmpty(inputstring)){
                    update_view.setText("Please Enter A Value");
                }
                else{
                    double input_value = Double.parseDouble(inputstring);
                    String i_unit = input_spinner.getSelectedItem().toString();
                    String o_unit = output_spinner.getSelectedItem().toString();
                    double output_value;

                    switch (i_unit) {
                        case "Centimeters":
                            if (o_unit.equals("Centimeters")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Centimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Meters")) {
                                output_value = input_value / 100;
                                output.setText(String.format("%.2f Meters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Kilometers")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Kilometers", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters")) {
                                output_value = input_value * 100;
                                output.setText(String.format("%.2f Millimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams") || o_unit.equals("Grams")|| o_unit.equals("Milligrams")) {
                                update_view.setText("Length Cannot Be Converted To Weigth");
                            }
                            break;

                        case "Meters":
                            if (o_unit.equals("Meters")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Meters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Centimeters")) {
                                output_value = input_value * 100;
                                output.setText(String.format("%.2f Centimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Kilometers")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Kilometers", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Millimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams") || o_unit.equals("Grams")|| o_unit.equals("Milligrams")) {
                                update_view.setText("Length Cannot Be Converted To Weigth");
                            }
                            break;

                        case "Kilometers":
                            if (o_unit.equals("Kilometers")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Kilometers", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Centimeters")) {
                                output_value = input_value * 100000;
                                output.setText(String.format("%.2f Centimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Meters")) {
                                output_value = input_value * 1000;
                                output.setText(String.format("%.2f Meters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters")) {
                                output_value = input_value * 1000000;
                                output.setText(String.format("%.2f Millimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams") || o_unit.equals("Grams")|| o_unit.equals("Milligrams")) {
                                update_view.setText("Length Cannot Be Converted To Weigth");
                            }
                            break;

                        case "Millimeters":
                            if (o_unit.equals("Millimeters")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Millimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Centimeters")) {
                                output_value = input_value / 10;
                                output.setText(String.format("%.2f Centimeters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Kilometers")) {
                                output_value = input_value / 1000000;
                                output.setText(String.format("%.2f Kilometers", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Meters")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Meters", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams") || o_unit.equals("Grams")|| o_unit.equals("Milligrams")) {
                                update_view.setText("Length Cannot Be Converted To Weigth");
                            }
                            break;

                        case "Milligrams":
                            if (o_unit.equals("Milligrams")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Milligrams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Grams")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Grams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Kilograms")) {
                                output_value = input_value / 1000000;
                                output.setText(String.format("%.2f Kilograms", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters") || o_unit.equals("Meters")|| o_unit.equals("Centimeters") || o_unit.equals("Kilometers")) {
                                update_view.setText("Weight Cannot Be Converted To Length");
                            }
                            break;

                        case "Grams":
                            if (o_unit.equals("Grams")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Grams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams")) {
                                output_value = input_value * 1000;
                                output.setText(String.format("%.2f Milligrams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Kilograms")) {
                                output_value = input_value / 1000;
                                output.setText(String.format("%.2f Kilograms", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters") || o_unit.equals("Meters")|| o_unit.equals("Centimeters") || o_unit.equals("Kilometers")) {
                            update_view.setText("Weight Cannot Be Converted To Length");
                        }
                            break;
                        case "Kilograms":
                            if (o_unit.equals("Kilograms")) {
                                output_value = input_value;
                                output.setText(String.format("%.2f Kilograms", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Grams")) {
                                output_value = input_value * 1000;
                                output.setText(String.format("%.2f Grams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Milligrams")) {
                                output_value = input_value * 1000000;
                                output.setText(String.format("%.2f Milligrams", output_value));
                                update_view.setText("");
                            } else if (o_unit.equals("Millimeters") || o_unit.equals("Meters")|| o_unit.equals("Centimeters") || o_unit.equals("Kilometers")) {
                            update_view.setText("Weight Cannot Be Converted To Length");
                        }
                            break;

                    }
                }
            }
        });

    }
}

