package com.xiaomi.hm.health.bt.sdk;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class DailyData implements Serializable {
    private static final long serialVersionUID = 1;
    private int calories;
    private String data;
    private String date;
    private int distance;
    private String stageData;

    public DailyData(String str, String str2, String str3) {
        this.date = str;
        this.data = str2;
        this.stageData = str3;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getData() {
        return this.data;
    }

    public String getDate() {
        return this.date;
    }

    public int getDistance() {
        return this.distance;
    }

    public String getStageData() {
        return this.stageData;
    }

    public void setCalories(int i) {
        this.calories = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setStageData(String str) {
        this.stageData = str;
    }

    public String toString() {
        return "DailyData{date='" + this.date + "', data='" + this.data + "', distance='" + this.distance + "', calories='" + this.calories + "', stageData='" + this.stageData + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
