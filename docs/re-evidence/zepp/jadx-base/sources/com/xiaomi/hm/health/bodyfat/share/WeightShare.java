package com.xiaomi.hm.health.bodyfat.share;

import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class WeightShare implements Serializable {
    public static final int TYPE_COMPARE_LASTTIME = 1;
    private long a;
    private String b;
    private String c;
    private String d = "0";
    private String e;
    private String f;
    private int g;
    private long h;
    private String i;
    private int j;

    public String getBmi() {
        return this.e;
    }

    public String getBodyFat() {
        return this.i;
    }

    public String getCompareValue() {
        return this.d;
    }

    public String getFigure() {
        return this.f;
    }

    public int getScore() {
        return this.j;
    }

    public int getType() {
        return this.g;
    }

    public long getUserid() {
        return this.a;
    }

    public long getWeightTime() {
        return this.h;
    }

    public String getWeightUnitStr() {
        return this.b;
    }

    public String getWeightValue() {
        return this.c;
    }

    public void setBmi(String str) {
        this.e = str;
    }

    public void setBodyFat(String str) {
        this.i = str;
    }

    public void setCompareValue(String str) {
        this.d = str;
    }

    public void setFigure(String str) {
        this.f = str;
    }

    public void setScore(int i) {
        this.j = i;
    }

    public void setType(int i) {
        this.g = i;
    }

    public void setUserid(long j) {
        this.a = j;
    }

    public void setWeightTime(long j) {
        this.h = j;
    }

    public void setWeightUnitStr(String str) {
        this.b = str;
    }

    public void setWeightValue(String str) {
        this.c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("uid = ");
        sb.append(this.a);
        sb.append(" , time : ");
        sb.append(HMWeightUtils.parseMonthHourDate(this.h));
        sb.append(" , weightValue = ");
        sb.append(this.c);
        sb.append(", unit : ");
        sb.append(this.b);
        sb.append(" , compareType = ");
        sb.append(this.g == 1 ? "比上次" : "比目标");
        sb.append(", compareValue = ");
        sb.append(this.d);
        sb.append(", bmi = ");
        sb.append(this.e);
        sb.append(" , figure = ");
        sb.append(this.f);
        sb.append(", bodyFat = ");
        sb.append(this.i);
        sb.append(", score = ");
        sb.append(this.j);
        return sb.toString();
    }
}
