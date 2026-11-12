package com.xiaomi.hm.health.bt.sdk.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class ShortcutItem implements Serializable {
    public static final int ALARM = 9;
    public static final int ALIPAY = 17;
    public static final int BREATH_TRAIN = 51;
    public static final int CALENDAR = 32;
    public static final int COMPASS = 22;
    public static final int COUNTDOWN = 13;
    public static final int DEFAULT_PAGE = -1;
    public static final int DIAL = 18;
    public static final int DND = 8;
    public static final int EVENT_REMIND = 21;
    public static final int FEMALE_HEALTH = 29;
    public static final int FIND_PHONE = 14;
    public static final int HR = 2;
    public static final int MI = 5;
    public static final int MORE = 7;
    public static final int MUSIC = 11;
    public static final int NFC = 16;
    public static final int NOTIFICATION = 6;
    public static final int PAI = 25;
    public static final int PHONE_MUTE = 15;
    public static final int PHOTOGRAPH = 10;
    public static final int PRESSURE = 28;
    public static final int SETTING = 19;
    public static final int SPO2 = 36;
    public static final int SPORT = 3;
    public static final int SPORT_RECORD = 20;
    public static final int SPORT_STATE = 30;
    public static final int STATUS = 1;
    public static final int TIMER = 12;
    public static final int TIMER_COUNTDOWN = 27;
    public static final int TOMATO_CLOCK = 56;
    public static final int VOICE = 31;
    public static final int WEATHER = 4;
    public static final int WORLD_CLOCK = 26;
    private static final long serialVersionUID = 1;
    private int index;
    private boolean isHide;
    private int type;

    public int getIndex() {
        return this.index;
    }

    public int getType() {
        return this.type;
    }

    public boolean isHide() {
        return this.isHide;
    }

    public void setHide(boolean z) {
        this.isHide = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
