package com.huami.watch.dataflow.model.health.process;

import com.huami.watch.util.DateDay;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class SleepInfo implements IAnalysis {
    private static final String C = "SleepInfo";
    private final String a;
    private final Date b;
    private final Date c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    private double v;
    private double w;
    private int x;
    private int y;
    private int z;
    private int l = 0;
    private boolean m = false;
    private ArrayList<StageSleep> A = new ArrayList<>();
    private ArrayList<StageSleep> B = new ArrayList<>();

    public SleepInfo(String str) {
        this.a = str;
        long jTimeInMillis = DateDay.from(str).timeInMillis();
        this.b = new Date(jTimeInMillis);
        this.c = new Date(jTimeInMillis);
    }

    public int getAwakeCount() {
        return this.j;
    }

    public double getAwakeDurationScore() {
        return this.q;
    }

    public int getAwakeNum() {
        return this.k;
    }

    public double getAwakeNumScore() {
        return this.r;
    }

    public double getDeepSleepRatioScore() {
        return this.p;
    }

    public int getMinutesOfNonRem() {
        return this.i;
    }

    public int getMinutesOfRem() {
        return this.h;
    }

    public int getNoRestHeartRateReason() {
        return this.y;
    }

    public int getNosleepReason() {
        return this.l;
    }

    public double getQuestionaireScore() {
        return this.t;
    }

    public double getRemRatioScore() {
        return this.s;
    }

    public int getRestHeartRate() {
        return this.x;
    }

    public int getSleepCount() {
        return this.g;
    }

    public double getSleepDurationScore() {
        return this.n;
    }

    public double getSleepQualityIndex() {
        return this.w;
    }

    public double getSleepStartScore() {
        return this.o;
    }

    public ArrayList<StageSleep> getStageSleep() {
        return this.A;
    }

    public ArrayList<StageSleep> getStageSleepAll() {
        return this.B;
    }

    public Date getStartDate() {
        return this.b;
    }

    public int getStartDateMin() {
        return (this.b.getHours() * 60) + this.b.getMinutes();
    }

    public String getStartDateStr() {
        return String.format("%02d:%02d", Integer.valueOf(this.b.getHours()), Integer.valueOf(this.b.getMinutes()));
    }

    public int getStartIndex() {
        return this.e;
    }

    public int getStatusCode() {
        return this.d;
    }

    public Date getStopDate() {
        return this.c;
    }

    public int getStopDateMin() {
        return (this.c.getHours() * 60) + this.c.getMinutes();
    }

    public String getStopDateStr() {
        return String.format("%02d:%02d", Integer.valueOf(this.c.getHours()), Integer.valueOf(this.c.getMinutes()));
    }

    public int getStopIndex() {
        return this.f;
    }

    public int getTurnOverTimes() {
        return this.z;
    }

    public boolean hasSleep() {
        return this.m;
    }

    @Override // com.huami.watch.dataflow.model.health.process.IAnalysis
    public boolean isSuccess() {
        return this.d == 0;
    }

    @NoProguard
    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i11, int i12, int i13, ArrayList<StageSleep> arrayList, ArrayList<StageSleep> arrayList2) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10 == 1;
        this.n = d;
        this.o = d2;
        this.p = d3;
        this.q = d4;
        this.r = d5;
        this.s = d6;
        this.t = d7;
        this.w = d8;
        this.x = i11;
        this.y = i12;
        this.z = i13;
        setStageSleeps(arrayList);
        setStageSleepsAll(arrayList2);
        Utils.updateDateAsIndex(this.b, i2);
        Utils.updateDateAsIndex(this.c, i3);
    }

    @NoProguard
    public void setSleepScoreInfo(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.n = d;
        this.o = d2;
        this.p = d3;
        this.q = d4;
        this.r = d5;
        this.s = d6;
        this.t = d7;
        this.u = d8;
        this.v = d9;
        this.w = d10;
    }

    public void setStageSleeps(ArrayList<StageSleep> arrayList) {
        if (arrayList == null) {
            return;
        }
        this.A.clear();
        this.A.addAll(arrayList);
    }

    public void setStageSleepsAll(ArrayList<StageSleep> arrayList) {
        if (arrayList == null) {
            return;
        }
        this.B.clear();
        this.B.addAll(arrayList);
    }

    public String toString() {
        return "SleepInfo{Day=" + this.a + ", mStartDate=" + this.b + ", mStopDate=" + this.c + ", statusCode=" + this.d + ", startIndex=" + this.e + ", stopIndex=" + this.f + ", sleepCount=" + this.g + ", minutesOfRem=" + this.h + ", minutesOfNonRem=" + this.i + ", awakeCount=" + this.j + ", awakeNum=" + this.k + ", nosleepReason=" + this.l + ", hasSleep=" + this.m + ", sleepDurationScore=" + this.n + ", sleepStartScore=" + this.o + ", deepSleepRatioScore=" + this.p + ", awakeDurationScore=" + this.q + ", awakeNumScore=" + this.r + ", remRatioScore=" + this.s + ", questionaireScore=" + this.t + ", sleepQualityIndex=" + this.w + ", restHeartRate=" + this.x + ", turnOverTimes=" + this.z + ", stageSleeps=" + this.A + ", stageSleepAll=" + this.B + '}';
    }
}
