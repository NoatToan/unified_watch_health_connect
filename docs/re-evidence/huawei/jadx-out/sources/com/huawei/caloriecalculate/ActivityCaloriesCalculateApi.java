package com.huawei.caloriecalculate;

import defpackage.chg;
import defpackage.chh;

/* JADX INFO: loaded from: classes2.dex */
public interface ActivityCaloriesCalculateApi {
    double calculateCalories(long j);

    double calculateCalories(long j, chg chgVar);

    double calculateCaloriesFromSteps(long j, int i);

    float calculateCaloriesOnlyStep(long j);

    long calculateDurationByCalories(float f, int i, int i2);

    double calculateTotalCalories(long j, chg chgVar);

    double calculateTotalCaloriesFromSteps(long j, int i);

    void initCalculateCalories(long j, int i);

    void initUserInfo(chh chhVar);
}
