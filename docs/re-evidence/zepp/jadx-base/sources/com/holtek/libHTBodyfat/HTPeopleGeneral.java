package com.holtek.libHTBodyfat;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes4.dex */
public class HTPeopleGeneral {
    public double BMI;
    public int BMR;
    public int VFAL;
    public double ZTwoLegs;
    private int a;
    public int age;
    public int bodyAge;
    public double bodyfatPercentage;
    public double boneKg;
    public double heightCm;
    public double idealWeightKg;
    public double muscleKg;
    public int sex;
    public double waterPercentage;
    public double weightKg;
    public Hashtable<String, String> BMIRatingList = new Hashtable<>();
    public Hashtable<String, String> BMRRatingList = new Hashtable<>();
    public Hashtable<String, String> VFALRatingList = new Hashtable<>();
    public Hashtable<String, String> boneRatingList = new Hashtable<>();
    public Hashtable<String, String> bodyfatRatingList = new Hashtable<>();
    public Hashtable<String, String> waterRatingList = new Hashtable<>();
    public Hashtable<String, String> muscleRatingList = new Hashtable<>();

    public HTPeopleGeneral(double d, double d2, int i, int i2, int i3) {
        this.weightKg = d;
        this.heightCm = d2;
        this.age = i2;
        this.sex = i;
        this.a = i3;
    }

    public int getBodyfatForPeople(double d, double d2, int i, int i2, int i3) {
        this.weightKg = d;
        this.heightCm = d2;
        this.age = i2;
        this.sex = i;
        this.ZTwoLegs = i3;
        return getBodyfatParameters();
    }

    public int getBodyfatParameters() {
        int iNN = HTBodyfat.NN(this.weightKg, this.heightCm, this.age, this.sex, this.a);
        if (iNN == 0) {
            this.bodyfatPercentage = HTBodyfat.CC();
            this.waterPercentage = HTBodyfat.HH();
            this.boneKg = HTBodyfat.DD();
            this.muscleKg = HTBodyfat.FF();
            this.VFAL = (int) HTBodyfat.GG();
            this.BMR = (int) HTBodyfat.BB();
            this.BMI = HTBodyfat.EE();
            this.idealWeightKg = HTBodyfat.QQ();
            double[] dArrII = HTBodyfat.II();
            this.BMIRatingList.put(HTDataType.Standard3LevelA, String.valueOf(dArrII[0]));
            this.BMIRatingList.put(HTDataType.Standard3LevelB, String.valueOf(dArrII[1]));
            this.BMIRatingList.put("偏胖－肥胖", String.valueOf(dArrII[2]));
            double[] dArrJJ = HTBodyfat.JJ();
            Hashtable<String, String> hashtable = new Hashtable<>();
            this.BMRRatingList = hashtable;
            hashtable.put(HTDataType.Standard1LevelA, String.valueOf(dArrJJ[0]));
            double[] dArrKK = HTBodyfat.KK();
            this.bodyfatRatingList.put(HTDataType.Standard4LevelA, String.valueOf(dArrKK[0]));
            this.bodyfatRatingList.put(HTDataType.Standard4LevelB, String.valueOf(dArrKK[1]));
            this.bodyfatRatingList.put(HTDataType.Standard4LevelC, String.valueOf(dArrKK[2]));
            this.bodyfatRatingList.put("偏胖－肥胖", String.valueOf(dArrKK[3]));
            double[] dArrLL = HTBodyfat.LL();
            this.boneRatingList.put(HTDataType.Standard2aLevelA, String.valueOf(dArrLL[0]));
            this.boneRatingList.put(HTDataType.Standard2aLevelB, String.valueOf(dArrLL[1]));
            double[] dArrMM = HTBodyfat.MM();
            this.muscleRatingList.put(HTDataType.Standard2aLevelA, String.valueOf(dArrMM[0]));
            this.muscleRatingList.put(HTDataType.Standard2aLevelB, String.valueOf(dArrMM[1]));
            double[] dArrOO = HTBodyfat.OO();
            this.VFALRatingList.put(HTDataType.Standard2bLevelA, String.valueOf(dArrOO[0]));
            this.VFALRatingList.put(HTDataType.Standard2bLevelB, String.valueOf(dArrOO[1]));
            double[] dArrPP = HTBodyfat.PP();
            this.waterRatingList.put(HTDataType.Standard2aLevelA, String.valueOf(dArrPP[0]));
            this.waterRatingList.put(HTDataType.Standard2aLevelB, String.valueOf(dArrPP[1]));
        } else {
            if (iNN == 4 || iNN == 3) {
                this.BMI = 0.0d;
            } else {
                this.BMI = HTBodyfat.EE();
                this.idealWeightKg = HTBodyfat.QQ();
            }
            this.VFAL = 0;
            this.bodyfatPercentage = 0.0d;
            this.waterPercentage = 0.0d;
            this.muscleKg = 0.0d;
            this.boneKg = 0.0d;
            this.BMR = 0;
        }
        this.ZTwoLegs = HTBodyfat.AA();
        return iNN;
    }
}
