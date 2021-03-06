package com.example.android.quizapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static int QUESTION_NUMBER = 8;
    private EditText answer1EditText;
    private EditText answer2EditText;
    private RadioGroup answer3RadioGroup;
    private RadioGroup answer4RadioGroup;
    private RadioGroup answer5RadioGroup;
    private RadioGroup answer6RadioGroup;
    private RadioGroup answer7RadioGroup;
    private RadioGroup answer8RadioGroup;
    private CheckBox answer9CheckBox1, answer9CheckBox2, answer9CheckBox3, answer9CheckBox4;
    private CheckBox answer10CheckBox1, answer10CheckBox2, answer10CheckBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Button event click
     *
     * @param v
     */
    public void checkQuiz(View v) {
        int score = 0;
        if (checkQuestion1() && checkQuestion2()) {
            if (checkQuestion3())
                score++;
            if (checkQuestion4())
                score++;
            if (checkQuestion5())
                score++;
            if (checkQuestion6())
                score++;
            if (checkQuestion7())
                score++;
            if (checkQuestion8())
                score++;
            if (checkQuestion9())
                score++;
            if (checkQuestion10())
                score++;

            if (score == QUESTION_NUMBER) {
                String str1 = String.format(getString(R.string.good_answer), answer1EditText.getText().toString());
                String str2 = String.format(getString(R.string.count_answer), score, QUESTION_NUMBER);
                messageToast(str1 + " " + str2);
            } else {
                messageToast(String.format(getString(R.string.count_answer), score, QUESTION_NUMBER));
            }
        } else {
            messageToast(getString(R.string.be_nice));
        }


    }

    /**
     * This function make a toast
     *
     * @param message - string
     */
    public void messageToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * This function checks if the user put any input - assumption - 1 char at least
     *
     * @return
     */
    public boolean checkQuestion1() {
        answer1EditText = (EditText) findViewById(R.id.edit_text_question_1_answer);
        if (answer1EditText.length() > 0) {
            return true;
        }
        return false;
    }

    /**
     * This function checks if the user put any input - assumption - 1 char at least
     *
     * @return
     */
    public boolean checkQuestion2() {
        answer2EditText = (EditText) findViewById(R.id.edit_text_question_2_answer);
        if (answer2EditText.length() > 0) {
            return true;
        }
        return false;
    }

    /**
     * This function calc question number 3
     *
     * @return
     */
    public boolean checkQuestion3() {
        answer3RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_3_answer);
        int selectedId = answer3RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);

            if (answerRadioButton.getText().equals(getString(R.string.question_3_option_1))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 4
     *
     * @return
     */
    public boolean checkQuestion4() {
        answer4RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_4_answer);
        int selectedId = answer4RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);
            if (answerRadioButton.getText().equals(getString(R.string.question_4_option_2))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 5
     *
     * @return
     */
    public boolean checkQuestion5() {
        answer5RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_5_answer);
        int selectedId = answer5RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);
            if (answerRadioButton.getText().equals(getString(R.string.question_5_option_1))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 6
     *
     * @return
     */
    public boolean checkQuestion6() {
        answer6RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_6_answer);
        int selectedId = answer6RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);
            if (answerRadioButton.getText().equals(getString(R.string.question_6_option_1))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 7
     *
     * @return
     */
    public boolean checkQuestion7() {
        answer7RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_7_answer);
        int selectedId = answer7RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);
            if (answerRadioButton.getText().equals(getString(R.string.question_7_option_3))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 8
     *
     * @return
     */
    public boolean checkQuestion8() {
        answer8RadioGroup = (RadioGroup) findViewById(R.id.radio_group_question_8_answer);
        int selectedId = answer8RadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton answerRadioButton = (RadioButton) findViewById(selectedId);
            if (answerRadioButton.getText().equals(getString(R.string.question_8_option_1))) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * This function calc question number 9
     *
     * @return
     */
    public boolean checkQuestion9() {
        answer9CheckBox1 = (CheckBox) findViewById(R.id.check_box_question_9_1);
        answer9CheckBox2 = (CheckBox) findViewById(R.id.check_box_question_9_2);
        answer9CheckBox3 = (CheckBox) findViewById(R.id.check_box_question_9_3);
        answer9CheckBox4 = (CheckBox) findViewById(R.id.check_box_question_9_4);
        if (!answer9CheckBox1.isChecked() && answer9CheckBox2.isChecked() && !answer9CheckBox3.isChecked() && answer9CheckBox4.isChecked()) {
            return true;
        }
        return false;
    }

    /**
     * This function calc question number 10
     *
     * @return
     */
    public boolean checkQuestion10() {
        answer10CheckBox1 = (CheckBox) findViewById(R.id.check_box_question_10_1);
        answer10CheckBox2 = (CheckBox) findViewById(R.id.check_box_question_10_2);
        answer10CheckBox3 = (CheckBox) findViewById(R.id.check_box_question_10_3);
        if (answer10CheckBox1.isChecked() && answer10CheckBox2.isChecked() && answer10CheckBox3.isChecked()) {
            return true;
        }
        return false;
    }
}
