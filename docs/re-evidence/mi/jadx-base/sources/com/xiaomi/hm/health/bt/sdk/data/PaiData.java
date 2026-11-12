package com.xiaomi.hm.health.bt.sdk.data;

import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import defpackage.t5t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PaiData implements Serializable {
    public static final String DAILY_PAI = "dailyPai";
    public static final String EVENT_TYPE = "eventType";
    public static final String HIGH_ZONE_MINUTES = "highZoneMinutes";
    public static final String HIGH_ZONE_PAI = "highZonePai";
    public static final String LAST_SYNC_TIME = "lastSyncTime";
    public static final String LOW_ZONE_MINUTES = "lowZoneMinutes";
    public static final String LOW_ZONE_PAI = "lowZonePai";
    public static final String MEDIUM_ZONE_MINUTES = "mediumZoneMinutes";
    public static final String MEDIUM_ZONE_PAI = "mediumZonePai";
    private static final String TAG = "PaiData";
    public static final String TIMESTAMP = "timestamp";
    public static final String TIME_ZONE = "timeZone";
    public static final String TOTAL_PAI = "totalPai";
    public static final String USER_Id = "userId";
    private static final long serialVersionUID = 1;
    private float dailyPai;
    private int highZoneMinutes;
    private float highZonePai;
    private int index;
    private boolean isDaily;
    private int lowZoneMinutes;
    private float lowZonePai;
    private int maxHr;
    private int mediumZoneMinutes;
    private float mediumZonePai;
    private int restHr;
    private long time;
    private long timezone;
    private float totalPai;
    private float[] activityScores = new float[7];
    private int version = 0;
    private float[] nextActivityScores = new float[7];
    private int gender = 0;
    private int age = 0;
    private int lowZoneLimit = -1;
    private int mediumZoneLimit = -1;
    private int highZoneLimit = -1;

    public float[] getActivityScores() {
        return this.activityScores;
    }

    public int getAge() {
        return this.age;
    }

    public float getDailyPai() {
        return this.dailyPai;
    }

    public int getGender() {
        return this.gender;
    }

    public int getHighZoneLimit() {
        return this.highZoneLimit;
    }

    public int getHighZoneMinutes() {
        return this.highZoneMinutes;
    }

    public float getHighZonePai() {
        return this.highZonePai;
    }

    public int getIndex() {
        return this.index;
    }

    public JSONObject getItemJson(UserInfoExt userInfoExt, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", String.valueOf(userInfoExt.getUid()));
            jSONObject.put("eventType", "PaiHealthInfo");
            jSONObject.put("timestamp", this.time);
            jSONObject.put(LAST_SYNC_TIME, j);
            jSONObject.put("timeZone", ProfileUtils.getTimezoneKey(Calendar.getInstance().getTimeZone()));
            jSONObject.put(HIGH_ZONE_PAI, this.highZonePai);
            jSONObject.put(MEDIUM_ZONE_PAI, this.mediumZonePai);
            jSONObject.put(LOW_ZONE_PAI, this.lowZonePai);
            jSONObject.put(HIGH_ZONE_MINUTES, this.highZoneMinutes);
            jSONObject.put(MEDIUM_ZONE_MINUTES, this.mediumZoneMinutes);
            jSONObject.put(LOW_ZONE_MINUTES, this.lowZoneMinutes);
            jSONObject.put(DAILY_PAI, this.dailyPai);
            jSONObject.put(TOTAL_PAI, this.totalPai);
        } catch (JSONException e) {
            t5t.d(TAG, e.getMessage());
        }
        return jSONObject;
    }

    public int getLowZoneLimit() {
        return this.lowZoneLimit;
    }

    public int getLowZoneMinutes() {
        return this.lowZoneMinutes;
    }

    public float getLowZonePai() {
        return this.lowZonePai;
    }

    public int getMaxHr() {
        return this.maxHr;
    }

    public int getMediumZoneLimit() {
        return this.mediumZoneLimit;
    }

    public int getMediumZoneMinutes() {
        return this.mediumZoneMinutes;
    }

    public float getMediumZonePai() {
        return this.mediumZonePai;
    }

    public float[] getNextActivityScores() {
        return this.nextActivityScores;
    }

    public int getRestHr() {
        return this.restHr;
    }

    public long getTime() {
        return this.time;
    }

    public long getTimezone() {
        return this.timezone;
    }

    public float getTotalPai() {
        return this.totalPai;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isDaily() {
        return this.isDaily;
    }

    public void setActivityScores(float[] fArr) {
        this.activityScores = fArr;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setDaily(boolean z) {
        this.isDaily = z;
    }

    public void setDailyPai(float f) {
        this.dailyPai = f;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setHighZoneLimit(int i) {
        this.highZoneLimit = i;
    }

    public void setHighZoneMinutes(int i) {
        this.highZoneMinutes = i;
    }

    public void setHighZonePai(float f) {
        this.highZonePai = f;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLowZoneLimit(int i) {
        this.lowZoneLimit = i;
    }

    public void setLowZoneMinutes(int i) {
        this.lowZoneMinutes = i;
    }

    public void setLowZonePai(float f) {
        this.lowZonePai = f;
    }

    public void setMaxHr(int i) {
        this.maxHr = i;
    }

    public void setMediumZoneLimit(int i) {
        this.mediumZoneLimit = i;
    }

    public void setMediumZoneMinutes(int i) {
        this.mediumZoneMinutes = i;
    }

    public void setMediumZonePai(float f) {
        this.mediumZonePai = f;
    }

    public void setNextActivityScores(float[] fArr) {
        this.nextActivityScores = fArr;
    }

    public void setRestHr(int i) {
        this.restHr = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTimezone(long j) {
        this.timezone = j;
    }

    public void setTotalPai(float f) {
        this.totalPai = f;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "HMPaiData{time=" + this.time + ", timezone=" + this.timezone + ", activityScores=" + Arrays.toString(this.activityScores) + ", lowZonePai=" + this.lowZonePai + ", mediumZonePai=" + this.mediumZonePai + ", highZonePai=" + this.highZonePai + ", lowZoneMinutes=" + this.lowZoneMinutes + ", mediumZoneMinutes=" + this.mediumZoneMinutes + ", highZoneMinutes=" + this.highZoneMinutes + ", dailyPai=" + this.dailyPai + ", totalPai=" + this.totalPai + ", restHr=" + this.restHr + ", maxHr=" + this.maxHr + ", index=" + this.index + ", isDaily=" + this.isDaily + ", version=" + this.version + ", nextActivityScores=" + Arrays.toString(this.nextActivityScores) + ", gender=" + this.gender + ", age=" + this.age + ", lowZoneLimit=" + this.lowZoneLimit + ", mediumZoneLimit=" + this.mediumZoneLimit + ", highZoneLimit=" + this.highZoneLimit + AbstractJsonLexerKt.END_OBJ;
    }
}
