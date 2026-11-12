package com.xiaomi.hm.health.bt.profile.feature;

import androidx.annotation.NonNull;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class Feature {
    public static final int ALG_ACTIVITY_SIZE = 0;
    public static final int BASE_API_LEVEL = 2;
    public static final int BASE_CONTINUOUS_UPGRADE = 1;
    public static final int GRP_ALG = 8;
    public static final int GRP_BASE = 1;
    public static final int GRP_EAR = 16;
    public static final int GRP_HW = 4;
    public static final int GRP_RESERVED = 0;
    public static final int GRP_SW = 2;
    public static final int HEADSET_CHANNEL_V2 = 6;
    public static final int HEADSET_HEARING_INFO_REPORT = 2;
    public static final int HEADSET_HNOCK_NEW = 0;
    public static final int HEADSET_WEAR_CHECK = 5;
    public static final int NOT_SUPPORT = -1;
    public static final int SUPPORT_NEW_FIRMWARE_INFO_PROTOCOL = 1;
    public static final int SWF_ALEXA = 16;
    public static final int SWF_BODY_TEMPERATURE = 33;
    public static final int SWF_BTPHONE_MIX_PHONE_ALERT = 44;
    public static final int SWF_BT_PHONE = 20;
    public static final int SWF_CALL_SMS_REPLY = 26;
    public static final int SWF_CAMERA = 6;
    public static final int SWF_CONTACT = 36;
    public static final int SWF_DIAL_STORAGE = 15;
    public static final int SWF_EPO = 37;
    public static final int SWF_FEMALE_HEALTH = 5;
    public static final int SWF_FIRSTBEAT = 10;
    public static final int SWF_FLASH_LIGHT = 48;
    public static final int SWF_GLONASS_ALMANAC = 8;
    public static final int SWF_GPS_SONY_LLE = 22;
    public static final int SWF_HEADSET_HNOCK_NEW = 35;
    public static final int SWF_HEALTH_DETECT = 34;
    public static final int SWF_HIGH_LOW_HR = 38;
    public static final int SWF_HR_SLEEP = 7;
    public static final int SWF_LANGUAGE_LIST = 0;
    public static final int SWF_MIAI = 17;
    public static final int SWF_MULTI_GOAL = 9;
    public static final int SWF_OFF_WIST = 11;
    public static final int SWF_OSA = 21;
    public static final int SWF_PRESSURE = 3;
    public static final int SWF_PRESSURE_SWITCH_INDEPENDENT = 32;
    public static final int SWF_SET_ATRIAL_FIB = 31;
    public static final int SWF_SET_HR_DETECTION_INTERVAL = 28;
    public static final int SWF_SLEEP_WRITE_BACK = 47;
    public static final int SWF_SNORING_DETECTION = 25;
    public static final int SWF_SP02 = 4;
    public static final int SWF_SPORADIC_NAP = 12;
    public static final int SWF_SPORT_ITEM_DATA_SETTING = 14;
    public static final int SWF_SPORT_TYPE_SORT = 13;
    public static final int SWF_STAND_HOUR = 18;
    public static final int SWF_STAR_SKY = 51;
    public static final int SWF_SUPPORT_HR_DETECTION_FREQUENCY_TEN_MIN = 53;
    public static final int SWF_SUPPORT_HR_WARNING_DATA = 54;
    public static final int SWF_SUPPORT_LOW_OSA_DATA = 55;
    public static final int SWF_SUPPORT_XIAOPENG = 24;
    public static final int SWF_SYNC_DATA_IN_BLOCKS = 40;
    public static final int SWF_SYNC_REST_HEART_RATE = 49;
    public static final int SWF_TODO_LIST = 30;
    public static final int SWF_TODO_LIST_APPLICATION = 39;
    public static final int SWF_TOMATO_CLOCK = 43;
    public static final int SWF_TOOL_APP_SORT = 27;
    public static final int SWF_UNLOCK = 2;
    public static final int SWF_VOICE_VERSION = 46;
    public static final int SWF_WATCH_SYSTEM_SETTING = 19;
    public static final int SWF_WEXIN_PAY = 45;
    public static final int SWF_WORD_TIME = 1;
    public static final int SWF_WRITE_BACK_PAI_INFO = 42;
    private int a;
    private int b;
    private byte[] c;
    private HashMap<Integer, BitSet> d = new HashMap<>();
    private HashMap<Integer, Integer> e = new HashMap<>();

    public void a(int group, BitSet features) {
        this.d.put(Integer.valueOf(group), features);
    }

    public void add(int group, int value) {
        this.e.put(Integer.valueOf(group), Integer.valueOf(value));
    }

    public int get(int feature) {
        if (this.e.containsKey(Integer.valueOf(feature))) {
            return this.e.get(Integer.valueOf(feature)).intValue();
        }
        return -1;
    }

    public byte[] getAllDatas() {
        return this.c;
    }

    public int getGroup() {
        return this.b;
    }

    public int getVersion() {
        return this.a;
    }

    public boolean has(int group) {
        return this.d.containsKey(Integer.valueOf(group));
    }

    public boolean hasAlg(int feature) {
        return this.e.containsKey(Integer.valueOf(feature));
    }

    public boolean hasBase(int feature) {
        BitSet bitSet = this.d.get(1);
        return bitSet != null && bitSet.get(feature);
    }

    public boolean hasHeadset(int feature) {
        BitSet bitSet = this.d.get(16);
        return bitSet != null && bitSet.get(feature);
    }

    public boolean hasHw(int feature) {
        BitSet bitSet = this.d.get(4);
        return bitSet != null && bitSet.get(feature);
    }

    public boolean hasSw(int feature) {
        BitSet bitSet = this.d.get(2);
        return bitSet != null && bitSet.get(feature);
    }

    public void setAllDatas(byte[] allDatas) {
        this.c = allDatas;
    }

    public void setGroup(int group) {
        this.b = group;
    }

    public void setSw(int feature) {
        BitSet bitSet = this.d.get(2);
        if (bitSet != null) {
            bitSet.set(feature);
        }
    }

    public void setVersion(int version) {
        this.a = version;
    }

    @NonNull
    public String toString() {
        return "Feature{version=" + this.a + ", group=" + this.b + ", featuresHm=" + this.d + ", algHm=" + this.e + '}';
    }

    public boolean has(int group, int feature) {
        if (group == 8) {
            return hasAlg(group);
        }
        BitSet bitSet = this.d.get(Integer.valueOf(group));
        return bitSet != null && bitSet.get(feature);
    }
}
