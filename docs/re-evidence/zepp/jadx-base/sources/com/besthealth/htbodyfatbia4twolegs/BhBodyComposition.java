package com.besthealth.htbodyfatbia4twolegs;

/* JADX INFO: loaded from: classes2.dex */
public class BhBodyComposition {
    public int bhAerobic;
    public int bhAge;
    public float bhBMI;
    public float bhBMIListNormalOrOver;
    public float bhBMIListOverOrObese;
    public float bhBMIListUnderOrNormal;
    public int bhBMR;
    public int bhBMRListUnderOrStandard;
    public int bhBadminton;
    public int bhBasketball;
    public int bhBicycle;
    public int bhBodyAge;
    public float bhBodyFatFreeMassKg;
    public float bhBodyFatKg;
    public float bhBodyFatRate;
    public float bhBodyFatRateListOverFatOrObese;
    public float bhBodyFatRateListStandardMinusOrStandardPlus;
    public float bhBodyFatRateListStandardPlusOrOverFat;
    public float bhBodyFatRateListUnderFatOrStandardMinus;
    public float bhBodyFatSubCutKg;
    public float bhBodyFatSubCutRate;
    public float bhBodyFatSubCutRateListStandardOrOver;
    public float bhBodyFatSubCutRateListUnderOrStandard;
    public int bhBodyScore;
    public int bhBodyType;
    public float bhBoneKg;
    public float bhBoneKgListStandardOrExcellent;
    public float bhBoneKgListUnderOrStandard;
    public int bhFootball;
    public int bhGateBall;
    public int bhGolf;
    public float bhHeightCm;
    public float bhIdealWeightKg;
    public float bhImpedance;
    public int bhJogging;
    public int bhMountainClimbing;
    public float bhMuscleKg;
    public float bhMuscleKgListStandardOrExcellent;
    public float bhMuscleKgListUnderOrStandard;
    public float bhMuscleRate;
    public int bhOrientalFencing;
    public int bhPeopleType;
    public float bhProteinRate;
    public float bhProteinRateListStandardOrExcellent;
    public float bhProteinRateListUnderOrStandard;
    public int bhRacketBall;
    public int bhRopeJumping;
    public int bhSex;
    public float bhSkeletalMuscleKg;
    public float bhSkeletalMuscleKgListStandardOrExcellent;
    public float bhSkeletalMuscleKgListUnderOrStandard;
    public int bhSquash;
    public int bhSwim;
    public int bhTableTennis;
    public int bhTaekwondo;
    public int bhTennis;
    public int bhVFAL;
    public int bhVFALListAlertOrDanger;
    public int bhVFALListStandardOrAlert;
    public int bhWalking;
    public float bhWaterRate;
    public float bhWaterRateListStandardOrExcellent;
    public float bhWaterRateListUnderOrStandard;
    public float bhWeightKg;
    public float bhZTwoLegs;

    static {
        System.loadLibrary("htBodyfatBia4TwoLegs");
    }

    public native int bhGetBodyFat(float f, float f2, int i, int i2, float f3, int i3);
}
