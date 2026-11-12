package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public enum TagBatteryEnum {
    BATTERY_FULL(4, 100, "Full"),
    BATTERY_MEDIUM(3, 70, "Medium"),
    BATTERY_LOW(2, 30, "Low"),
    BATTERY_CRITICALLY(1, 10, "Critically low"),
    BATTERY_ILLEGAL(0, 0, "Illegal");

    private String batteryDescription;
    private int batteryLevel;
    private int num;

    public int getNum() {
        return this.num;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getBatteryDescription() {
        return this.batteryDescription;
    }

    public static int getTagBatteryMaxLevel() {
        return BATTERY_FULL.num;
    }

    public static int getTagBatteryLevel(String str) {
        TagBatteryEnum tagBatteryEnum = BATTERY_FULL;
        if (tagBatteryEnum.batteryDescription.equals(str)) {
            return tagBatteryEnum.batteryLevel;
        }
        TagBatteryEnum tagBatteryEnum2 = BATTERY_MEDIUM;
        if (tagBatteryEnum2.batteryDescription.equals(str)) {
            return tagBatteryEnum2.batteryLevel;
        }
        TagBatteryEnum tagBatteryEnum3 = BATTERY_LOW;
        if (tagBatteryEnum3.batteryDescription.equals(str)) {
            return tagBatteryEnum3.batteryLevel;
        }
        TagBatteryEnum tagBatteryEnum4 = BATTERY_CRITICALLY;
        return tagBatteryEnum4.batteryDescription.equals(str) ? tagBatteryEnum4.batteryLevel : BATTERY_ILLEGAL.batteryLevel;
    }

    public static TagBatteryEnum getTagBatteryEnum(int i) {
        if (i == 0) {
            return BATTERY_FULL;
        }
        if (i == 1) {
            return BATTERY_MEDIUM;
        }
        if (i != 2) {
            return i != 3 ? BATTERY_ILLEGAL : BATTERY_CRITICALLY;
        }
        return BATTERY_LOW;
    }

    public static String getTagBatteryDescription(int i) {
        TagBatteryEnum tagBatteryEnum = BATTERY_FULL;
        if (tagBatteryEnum.batteryLevel == i) {
            return tagBatteryEnum.batteryDescription;
        }
        TagBatteryEnum tagBatteryEnum2 = BATTERY_MEDIUM;
        if (tagBatteryEnum2.batteryLevel == i) {
            return tagBatteryEnum2.batteryDescription;
        }
        TagBatteryEnum tagBatteryEnum3 = BATTERY_LOW;
        if (tagBatteryEnum3.batteryLevel == i) {
            return tagBatteryEnum3.batteryDescription;
        }
        TagBatteryEnum tagBatteryEnum4 = BATTERY_CRITICALLY;
        return tagBatteryEnum4.batteryLevel == i ? tagBatteryEnum4.batteryDescription : BATTERY_ILLEGAL.batteryDescription;
    }

    TagBatteryEnum(int i, int i2, String str) {
        this.num = i;
        this.batteryLevel = i2;
        this.batteryDescription = str;
    }
}
