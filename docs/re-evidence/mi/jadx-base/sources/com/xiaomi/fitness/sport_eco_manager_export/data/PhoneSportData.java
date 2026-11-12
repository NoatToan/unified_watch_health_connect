package com.xiaomi.fitness.sport_eco_manager_export.data;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.data.sport.Location;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class PhoneSportData implements Serializable {
    public double accX;
    public double accY;
    public double accZ;
    public int avePace;
    public int bike_below_target;
    public int bike_mode;
    public int bike_power;
    public int bike_resistance_level;
    public int bike_rpm;
    public float calorie;
    public long deviceDuration;
    public int distance;
    public int duration;
    public int gpsAccuracyStatus;
    public int gym_hr;
    public int heart_rate;
    public int jumpCount;
    public int jumpDuration;
    public int jumpFrequency;
    public long jumpStartTime;
    public Location location;
    public int maxHr;
    public int minHr;
    public int pace;
    public int reminder_heart_rate;
    public int reminder_kilometre_duration;
    public int reminder_kilometre_pace;
    public int reminder_pace;
    public int revolutionCount;
    public float speed;
    public int sportType;
    public int step;
    public float stepRate;
    public int stride;
    public int stride_frequency;
    public int stumbleCount;
    public int stumbleDuration;
    public long timeDuration;
    public int timestamp;
    public int type;

    public PhoneSportData() {
    }

    @SuppressLint({"WrongConstant"})
    public void clear() {
        this.location = null;
        this.sportType = 0;
        this.distance = 0;
        this.pace = 0;
        this.calorie = 0.0f;
        this.step = 0;
        this.stepRate = 0.0f;
        this.duration = 0;
        this.heart_rate = 0;
        this.stride = 0;
        this.stride_frequency = 0;
        this.avePace = 0;
        this.maxHr = 0;
        this.minHr = 0;
        this.accX = 0.0d;
        this.accY = 0.0d;
        this.accZ = 0.0d;
        this.bike_rpm = 0;
        this.bike_resistance_level = 0;
        this.bike_power = 0;
        this.bike_mode = 0;
        this.revolutionCount = 0;
        this.jumpStartTime = 0L;
        this.jumpDuration = 0;
        this.jumpCount = 0;
        this.type = 0;
        this.jumpFrequency = 0;
        this.stumbleCount = 0;
        this.stumbleDuration = 0;
        this.timeDuration = 0L;
        this.reminder_kilometre_duration = 0;
        this.reminder_kilometre_pace = 0;
        this.reminder_pace = 0;
        this.reminder_heart_rate = 0;
    }

    public PhoneSportData copy() {
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.timestamp = this.timestamp;
        phoneSportData.sportType = this.sportType;
        phoneSportData.location = this.location;
        phoneSportData.distance = this.distance;
        phoneSportData.pace = this.pace;
        phoneSportData.calorie = this.calorie;
        phoneSportData.step = this.step;
        phoneSportData.stepRate = this.stepRate;
        phoneSportData.duration = this.duration;
        phoneSportData.heart_rate = this.heart_rate;
        phoneSportData.stride = this.stride;
        phoneSportData.stride_frequency = this.stride_frequency;
        phoneSportData.avePace = this.avePace;
        phoneSportData.maxHr = this.maxHr;
        phoneSportData.minHr = this.minHr;
        phoneSportData.accX = this.accX;
        phoneSportData.accY = this.accY;
        phoneSportData.accZ = this.accZ;
        phoneSportData.timeDuration = this.timeDuration;
        phoneSportData.reminder_kilometre_duration = this.reminder_kilometre_duration;
        phoneSportData.reminder_kilometre_pace = this.reminder_kilometre_pace;
        phoneSportData.reminder_pace = this.reminder_pace;
        phoneSportData.reminder_heart_rate = this.reminder_heart_rate;
        phoneSportData.deviceDuration = this.deviceDuration;
        phoneSportData.bike_mode = this.bike_mode;
        phoneSportData.bike_rpm = this.bike_rpm;
        phoneSportData.bike_power = this.bike_power;
        phoneSportData.bike_below_target = this.bike_below_target;
        phoneSportData.bike_resistance_level = this.bike_resistance_level;
        phoneSportData.jumpStartTime = this.jumpStartTime;
        phoneSportData.jumpDuration = this.jumpDuration;
        phoneSportData.jumpCount = this.jumpCount;
        phoneSportData.type = this.type;
        phoneSportData.jumpFrequency = this.jumpFrequency;
        phoneSportData.stumbleCount = this.stumbleCount;
        phoneSportData.stumbleDuration = this.stumbleDuration;
        return phoneSportData;
    }

    public void setStepRate(float f) {
        this.stepRate = f;
    }

    public String toString() {
        return "PhoneSportData{distance=" + this.distance + ", pace=" + this.pace + ", calorie=" + this.calorie + ", step=" + this.step + ", minHr=" + this.minHr + ", maxHr=" + this.maxHr + ", hr=" + this.heart_rate + ", sportStepRate=" + this.stride_frequency + ", stride=" + this.stride + ", location = " + this.location + ", deviceDuration = " + this.deviceDuration + ", appDuration = " + this.duration + ", avePace = " + this.avePace + ", bike_rpm = " + this.bike_rpm + ", bike_resistance_level = " + this.bike_resistance_level + ", bike_power = " + this.bike_power + ", jumpStartTime = " + this.jumpStartTime + ", jumpDuration = " + this.jumpDuration + ", jumpCount = " + this.jumpCount + ", type = " + this.type + ", jumpFrequency = " + this.jumpFrequency + ", stumbleCount = " + this.stumbleCount + ", stumbleDuration = " + this.stumbleDuration + ", sportType = " + this.sportType + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneSportData(int i, int i2, float f, int i3, int i4) {
        this.distance = i;
        this.pace = i2;
        this.calorie = f;
        this.step = i3;
    }
}
