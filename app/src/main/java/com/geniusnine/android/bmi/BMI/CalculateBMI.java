package com.geniusnine.android.bmi.BMI;

import android.graphics.Color;

/**
 * Created by Dev on 23-02-2017.
 */

public class CalculateBMI {
    float height,weight,bmi,ageinyears;
    String gender;
    float FAT_percentage;

    public CalculateBMI(float height, float weight, float ageinyears, String gender) {
        this.height = height;
        this.weight = weight;
        this.ageinyears = ageinyears;
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getAgeinyears() {
        return ageinyears;
    }

    public void setAgeinyears(float ageinyears) {
        this.ageinyears = ageinyears;
    }

    //Calculate BMI
    public float calculateBMIResult() {

        bmi=(float) (weight / (height * height));
        return bmi;
    }

    // Interpret what BMI means
    public String interpretBMI() {

        if (gender.equals("Male")) {
            if(bmi <16){
                return "Not In Range";
            } else if (bmi >= 16 && bmi <=17) {
                return "Severely underweight";
            } else if (bmi >=17 &&  bmi <=18.5) {
                return "Underweight";
            } else if (bmi >=18.5 && bmi <= 25) {
                return "Normal";
            } else if (bmi >=25 && bmi <= 30) {
                return "Overweight";
            } else if (bmi >=30 && bmi <= 35) {
                return "Obese Class I";
            } else if (bmi >=35 && bmi <= 40) {
                return "Obese Class II";
            } else {
                return "Obese Class III";
            }
        } else if(gender.equals("Children")){
            if (bmi < 5) {
                return "Underweight";
            } else if (bmi >=5 && bmi <= 85) {
                return "Healthy weight";
            } else if (bmi >=85&& bmi <= 95) {
                return "At risk of overweight";
            } else{
                return "Overweight";
            }
        } else{
            if(bmi < 0){
                return "Not In Range";
            } else if (bmi >=0 && bmi <= 17.5) {
                return "Underweight";
            } else if (bmi >=18.5 &&bmi <= 25) {
                return "Normal";
            } else if (bmi >=25 &&bmi <= 40) {
                return "Overweight";
            } else {
                return "Obese Class III";
            }

        }
    }
    // Interpret what BMI COLOR
    public int interpretBMICOLOR() {

        if (gender.equals("Male")) {
            if (bmi < 16) {
                return Color.parseColor("#c41919");
            } else if (bmi >= 16 && bmi <=17) {
                return Color.parseColor("#dc9b22");
            } else if (bmi >=17 &&  bmi <=18.5) {
                return Color.parseColor("#df8b2c");
            } else if (bmi >=18.5 && bmi <= 25) {
                return Color.parseColor("#059733");
            } else if (bmi >=25 && bmi <= 30) {
                return Color.parseColor("#f7262d");
            } else if (bmi >=30 && bmi <= 35) {
                return  Color.parseColor("#c41919");
            } else if (bmi >=35 && bmi <= 40) {
                return  Color.parseColor("#c41919");
            } else {
                return  Color.parseColor("#c41919");
            }
        } else if(gender.equals("Children")){
            if (bmi < 5) {
                return Color.parseColor("#dc9b22");
            } else if (bmi >=5 && bmi <= 85) {
                return Color.parseColor("#059733");
            } else if (bmi >=85&& bmi <= 95) {
                return Color.parseColor("#f7262d");
            } else{
                return Color.parseColor("#c41919");
            }
        } else {
            if(bmi < 0){
                return  Color.parseColor("#c41919");
            }else if (bmi >=0 && bmi <= 17.5) {
                return  Color.parseColor("#df8b2c");
            } else if (bmi >=18.5 &&bmi <= 25) {
                return Color.parseColor("#059733");
            } else if (bmi >=25 &&bmi <= 40) {
                return Color.parseColor("#c41919");
            } else {
                return Color.parseColor("#c41919");
            }

        }
    }
    //Calculate Ideal FAT
    public float calculateFATResult() {

        if(gender.equals("Male")) {
            FAT_percentage= (float) ((1.20 * bmi) + (0.23 * ageinyears) - (10.8 * 1) - 5.4);
        }else if(gender.equals("Children")) {
            FAT_percentage = (float) ((1.20 * bmi) + (0.23 * ageinyears) - (10.8 * 0) - 5.4);
        }
        else {
            FAT_percentage = (float) ((1.20 * bmi) + (0.23 * ageinyears) - (10.8 * 0) - 5.4);
        }
        return (int) (FAT_percentage);
    }

    // Interpret what FAT means
    public String interpretFAT() {

        if (gender.equals("Male")) {
            if (FAT_percentage < 6) {
                return "Not In Range";
            } else if (FAT_percentage >= 6 && FAT_percentage <= 13) {
                return "Athletes";
            } else if (FAT_percentage >= 14 && FAT_percentage <= 17) {
                return "Fitness";
            } else if (FAT_percentage >= 18 && FAT_percentage <= 25) {
                return "Acceptable";
            } else  if (FAT_percentage > 25){
                return "Obese";
            }else{
                return "Not In Range";
            }
        } else {
            if (FAT_percentage< 14 ) {
                return "Not In Range";
            } else  if (FAT_percentage >= 14 && FAT_percentage <= 20) {
                return "Athletes";
            } else if (FAT_percentage >= 21 && FAT_percentage <= 24) {
                return "Fitness";
            } else if (FAT_percentage >= 25 && FAT_percentage <= 31) {
                return "Acceptable";
            } else if ( FAT_percentage > 31) {
                return "Obese";
            }else{
                return "Not In Range";
            }
        }

    }
    // Interpret what FAT COLOR
    public int interpretFATCOLOR() {
        if (gender.equals("Male")) {
            if (FAT_percentage < 6) {
                return Color.parseColor("#c41919");
            } else if (FAT_percentage >= 6 && FAT_percentage <= 13) {
                return Color.parseColor("#dc9b22");
            } else if (FAT_percentage >= 14 && FAT_percentage <= 17) {
                return Color.parseColor("#059733");
            } else if (FAT_percentage >= 18 && FAT_percentage <= 25) {
                return Color.parseColor("#059733");
            } else if (FAT_percentage > 25){
                return Color.parseColor("#c41919");
            }else{
                return Color.parseColor("#c41919");
            }
        } else {
            if (FAT_percentage < 14) {
                return Color.parseColor("#c41919");
            } else if (FAT_percentage >= 14 && FAT_percentage <= 20) {
                return Color.parseColor("#dc9b22");
            } else if (FAT_percentage >= 21 && FAT_percentage <= 24) {
                return Color.parseColor("#059733");
            } else if (FAT_percentage >= 25 && FAT_percentage <= 31) {
                return Color.parseColor("#059733");
            } else if (FAT_percentage > 31) {
                return Color.parseColor("#c41919");
            }else{
                return Color.parseColor("#c41919");
            }
        }
    }

}
