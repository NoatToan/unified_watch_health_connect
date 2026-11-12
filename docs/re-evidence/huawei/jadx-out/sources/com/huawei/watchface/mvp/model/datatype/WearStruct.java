package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class WearStruct {
    private int clockBackgroundColor;
    private String clockColor;
    private String clockResource;
    private int clockType;
    private int clockTypeCapability;
    private long curStyleIndex;
    private String wearPreviewName;
    private long wearStyleId;
    private int wearStyleType;
    private int wearTypeCapability;

    public WearStruct() {
    }

    public int getClockBackgroundColor() {
        return this.clockBackgroundColor;
    }

    public String getClockColor() {
        return this.clockColor;
    }

    public String getClockResource() {
        return this.clockResource;
    }

    public int getClockType() {
        return this.clockType;
    }

    public int getClockTypeCapability() {
        return this.clockTypeCapability;
    }

    public long getCurStyleIndex() {
        return this.curStyleIndex;
    }

    public String getWearPreviewName() {
        return this.wearPreviewName;
    }

    public long getWearStyleId() {
        return this.wearStyleId;
    }

    public int getWearStyleType() {
        return this.wearStyleType;
    }

    public int getWearTypeCapability() {
        return this.wearTypeCapability;
    }

    public void setClockBackgroundColor(int i) {
        this.clockBackgroundColor = i;
    }

    public void setClockColor(String str) {
        this.clockColor = str;
    }

    public void setClockResource(String str) {
        this.clockResource = str;
    }

    public void setClockType(int i) {
        this.clockType = i;
    }

    public void setClockTypeCapability(int i) {
        this.clockTypeCapability = i;
    }

    public void setCurStyleIndex(long j) {
        this.curStyleIndex = j;
    }

    public void setWearPreviewName(String str) {
        this.wearPreviewName = str;
    }

    public void setWearStyleId(long j) {
        this.wearStyleId = j;
    }

    public void setWearStyleType(int i) {
        this.wearStyleType = i;
    }

    public void setWearTypeCapability(int i) {
        this.wearTypeCapability = i;
    }

    public String toString() {
        return "WearStruct{wearStyleId=" + this.wearStyleId + ", wearPreviewName='" + this.wearPreviewName + "'}";
    }

    public WearStruct(String str) {
        this.wearPreviewName = str;
    }

    public WearStruct(long j, String str) {
        this.curStyleIndex = j;
        this.wearPreviewName = str;
        this.wearStyleId = j;
    }

    public WearStruct(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, int i6, int i7) {
        this.wearStyleId = i;
        this.wearPreviewName = str;
        this.clockResource = str2;
        this.clockType = i2;
        this.clockBackgroundColor = i3;
        this.clockColor = str3;
        this.wearStyleType = i4;
        this.wearTypeCapability = i5;
        this.clockTypeCapability = i6;
        this.curStyleIndex = i7;
    }
}
