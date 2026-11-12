package com.huami.watch.dataflow.model.health.process;

import android.util.Log;
import android.util.SparseArray;
import com.huami.watch.util.DateDay;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class StepsInfo implements IAnalysis {
    private static final String B = "StepsInfo";
    private final String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private ArrayList<StageSteps> y = new ArrayList<>();
    private ArrayList<ActiveItem> z = new ArrayList<>();
    private ArrayList<ActiveItem> A = new ArrayList<>();

    public StepsInfo(String str) {
        this.a = str;
    }

    public int getActMinutes() {
        return this.f;
    }

    public ArrayList<ActiveItem> getActiveList() {
        return this.z;
    }

    public double getBasalCalories() {
        return this.h;
    }

    public double getBasalCaloriesNow() {
        return DateDay.from(this.a).isToday() ? (this.h * ((double) TimeHelper.getCurrMinutesToday())) / 1440.0d : this.h;
    }

    public double getCalories() {
        return getCaloriesNow();
    }

    public double getCaloriesNow() {
        return this.j + getBasalCaloriesNow();
    }

    public int getContinuesActive() {
        return this.g;
    }

    public double getDefaultDailyCaloriesGoal() {
        return this.i;
    }

    public int getDistance() {
        return this.r;
    }

    public double getRunCalories() {
        return this.m;
    }

    public int getRunDistance() {
        return this.s;
    }

    public int getRunTimeCount() {
        return this.d;
    }

    public ArrayList<StageSteps> getStageSteps() {
        return this.y;
    }

    public int getStepsCount() {
        return this.q;
    }

    public double getWalkCalories() {
        return this.o;
    }

    public int getWalkDistance() {
        return this.t;
    }

    public int getWalkTimeCount() {
        return this.c;
    }

    @Override // com.huami.watch.dataflow.model.health.process.IAnalysis
    public boolean isSuccess() {
        return this.b == 0;
    }

    public void setActiveList(ArrayList<ActiveItem> arrayList) {
        if (arrayList == null) {
            return;
        }
        this.z.clear();
        this.z.addAll(arrayList);
    }

    public void setDistance(int i) {
        this.r = i;
    }

    public void setFullActiveList(ArrayList<ActiveItem> arrayList) {
        if (arrayList == null) {
            return;
        }
        this.A.clear();
        this.A.addAll(arrayList);
    }

    @NoProguard
    public void setInfos(int i, int i2, int i3, int i4, int i5, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, ArrayList<StageSteps> arrayList, ArrayList<ActiveItem> arrayList2, ArrayList<ActiveItem> arrayList3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = i4;
        this.g = i5;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = d4;
        this.l = d5;
        this.m = d6;
        this.n = d7;
        this.o = d8;
        this.p = d9;
        this.q = i6;
        this.r = i7;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.w = i12;
        this.x = i13;
        setStageSteps(arrayList);
        setActiveList(arrayList2);
        setFullActiveList(arrayList3);
    }

    public void setStageSteps(ArrayList<StageSteps> arrayList) {
        this.y.clear();
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        SparseArray sparseArray = new SparseArray(24);
        for (StageSteps stageSteps : arrayList) {
            sparseArray.append(stageSteps.time, stageSteps);
        }
        for (int i = 0; i < 24; i++) {
            StageSteps stageSteps2 = (StageSteps) sparseArray.get(i);
            if (stageSteps2 == null) {
                Log.w(B, "Add zero StageSteps, hour:" + i + ", >>day:" + this.a + ", minute:" + this.c);
            }
            ArrayList<StageSteps> arrayList2 = this.y;
            if (stageSteps2 == null) {
                stageSteps2 = new StageSteps(i);
            }
            arrayList2.add(stageSteps2);
        }
    }

    public String toString() {
        return "StepsInfo{Day=" + this.a + ", statusCode=" + this.b + ", walktime=" + this.c + ", runtime=" + this.d + ", physicalActivityIndex=" + this.e + ", activeMinutes=" + this.f + ", continusActive=" + this.g + ", basalCalories=" + this.h + ", defaultDailyCaloriesGoal=" + this.i + ", pureSportCalories=" + this.j + ", basalCaloriesDuringSport=" + this.k + ", basalCaloriesNonSport=" + this.l + ", pureRunSportCalories=" + this.m + ", basalCaloriesDuringRun=" + this.n + ", pureWalkSportCalories=" + this.o + ", basalCaloriesDuringWalk=" + this.p + ", steps=" + this.q + ", distance=" + this.r + ", runDistance=" + this.s + ", walkDistance=" + this.t + ", mifit_steps=" + this.u + ", mifit_distance=" + this.v + ", mifit_runDistance=" + this.w + ", mifit_walkDistance=" + this.x + ", stageList=" + this.y + ", activeList=" + this.z + ", fullActiveList=" + this.A + '}';
    }
}
