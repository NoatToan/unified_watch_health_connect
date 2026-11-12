package com.xiaomi.hm.health.bt.profile.feature;

import java.util.BitSet;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
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
    public static final int SWF_SUPPORT_CONTINUE_SPO2_DETECT = 59;
    public static final int SWF_SUPPORT_HR_DETECTION_FREQUENCY_TEN_MIN = 53;
    public static final int SWF_SUPPORT_HR_WARNING_DATA = 54;
    public static final int SWF_SUPPORT_LOW_OSA_DATA = 55;
    public static final int SWF_SUPPORT_MIUI_ALARM = 60;
    public static final int SWF_SUPPORT_PACE_STRATEGY = 58;
    public static final int SWF_SUPPORT_SPORT_ROUTE = 57;
    public static final int SWF_SUPPORT_TRAINING_TEMPLATE = 56;
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
    private byte[] allDatas;
    private int group;
    private int version;
    private HashMap<Integer, BitSet> featuresHm = new HashMap<>();
    private HashMap<Integer, Integer> algHm = new HashMap<>();

    public void add(int i, BitSet bitSet) {
        this.featuresHm.put(Integer.valueOf(i), bitSet);
    }

    public int get(int i) {
        if (this.algHm.containsKey(Integer.valueOf(i))) {
            return this.algHm.get(Integer.valueOf(i)).intValue();
        }
        return -1;
    }

    public byte[] getAllDatas() {
        return this.allDatas;
    }

    public int getGroup() {
        return this.group;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean has(int i) {
        return this.featuresHm.containsKey(Integer.valueOf(i));
    }

    public boolean hasAlg(int i) {
        return this.algHm.containsKey(Integer.valueOf(i));
    }

    public boolean hasBase(int i) {
        BitSet bitSet = this.featuresHm.get(1);
        return bitSet != null && bitSet.get(i);
    }

    public boolean hasHeadset(int i) {
        BitSet bitSet = this.featuresHm.get(16);
        return bitSet != null && bitSet.get(i);
    }

    public boolean hasHw(int i) {
        BitSet bitSet = this.featuresHm.get(4);
        return bitSet != null && bitSet.get(i);
    }

    public boolean hasSw(int i) {
        BitSet bitSet = this.featuresHm.get(2);
        return bitSet != null && bitSet.get(i);
    }

    public void setAllDatas(byte[] bArr) {
        this.allDatas = bArr;
    }

    public void setGroup(int i) {
        this.group = i;
    }

    public void setSw(int i) {
        BitSet bitSet = this.featuresHm.get(2);
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "Feature{version=" + this.version + ", group=" + this.group + ", featuresHm=" + this.featuresHm + ", algHm=" + this.algHm + AbstractJsonLexerKt.END_OBJ;
    }

    public void add(int i, int i2) {
        this.algHm.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean has(int i, int i2) {
        if (i == 8) {
            return hasAlg(i);
        }
        BitSet bitSet = this.featuresHm.get(Integer.valueOf(i));
        return bitSet != null && bitSet.get(i2);
    }
}
