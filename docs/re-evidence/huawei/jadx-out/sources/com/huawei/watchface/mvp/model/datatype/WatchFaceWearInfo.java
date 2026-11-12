package com.huawei.watchface.mvp.model.datatype;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceWearInfo {
    private long clockTypeCapability;
    private long curStyleIndex;
    private int maxStyleNum;
    private int rectRadius;
    private int styleCount;
    private int wearImageOption;
    private int wearStyleType;
    private long wearTypeCapability;
    private int tintClockOption = 1;
    private ArrayList<WearStruct> mWearList = new ArrayList<>();

    public long getClockTypeCapability() {
        return this.clockTypeCapability;
    }

    public long getCurStyleIndex() {
        return this.curStyleIndex;
    }

    public int getMaxStyleNum() {
        return this.maxStyleNum;
    }

    public int getRectRadius() {
        return this.rectRadius;
    }

    public int getStyleCount() {
        return this.styleCount;
    }

    public int getTintClockOption() {
        return this.tintClockOption;
    }

    public int getWearImageOption() {
        return this.wearImageOption;
    }

    public ArrayList<WearStruct> getWearList() {
        return this.mWearList;
    }

    public int getWearStyleType() {
        return this.wearStyleType;
    }

    public long getWearTypeCapability() {
        return this.wearTypeCapability;
    }

    public void setClockTypeCapability(long j) {
        this.clockTypeCapability = j;
    }

    public void setCurStyleIndex(long j) {
        this.curStyleIndex = j;
    }

    public void setMaxStyleNum(int i) {
        this.maxStyleNum = i;
    }

    public void setRectRadius(int i) {
        this.rectRadius = i;
    }

    public void setStyleCount(int i) {
        this.styleCount = i;
    }

    public void setTintClockOption(int i) {
        this.tintClockOption = i;
    }

    public void setWearImageOption(int i) {
        this.wearImageOption = i;
    }

    public void setWearList(ArrayList<WearStruct> arrayList) {
        this.mWearList = arrayList;
    }

    public void setWearStyleType(int i) {
        this.wearStyleType = i;
    }

    public void setWearTypeCapability(long j) {
        this.wearTypeCapability = j;
    }
}
