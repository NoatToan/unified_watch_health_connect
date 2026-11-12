package com.xiaomi.fitness.sport_manager_export.data;

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
    public float calorie;
    public int currentPace;
    public float currentSpeed;
    public long deviceDuration;
    public int distance;
    public int duration;
    public int gpsAccuracyStatus;
    public int gym_hr;
    public int heart_rate;
    public int impact;
    public Location location;
    public int lowBattery;
    public int maxHr;
    public int minHr;
    public boolean modeChanged;
    public int offGround;
    public int onGround;
    public int onOffRatio;
    public int pace;
    public int reminder_heart_rate;
    public int reminder_kilometre_duration;
    public int reminder_kilometre_pace;
    public int reminder_pace;
    public int revolutionCount;
    public int runStyle;
    public float speed;
    public SportLocationResult sportLocationResult;
    public int sportType;
    public int step;
    public float stepRate;
    public int stride;
    public int stride_frequency;
    public long timeDuration;
    public int timestamp;
    public int verticalAmplitude;
    public int verticalStrideRatio;

    public PhoneSportData() {
    }

    @SuppressLint({"WrongConstant"})
    public void clear() {
        this.location = null;
        this.sportType = 0;
        this.distance = 0;
        this.pace = 0;
        this.gpsAccuracyStatus = 0;
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
        this.modeChanged = false;
        this.lowBattery = 0;
        this.revolutionCount = 0;
        this.runStyle = 0;
        this.impact = 0;
        this.onGround = 0;
        this.offGround = 0;
        this.onOffRatio = 0;
        this.currentPace = 0;
        this.currentSpeed = 0.0f;
        this.timeDuration = 0L;
        this.reminder_kilometre_duration = 0;
        this.reminder_kilometre_pace = 0;
        this.reminder_pace = 0;
        this.reminder_heart_rate = 0;
        this.sportLocationResult = null;
    }

    public PhoneSportData copy() {
        PhoneSportData phoneSportData = new PhoneSportData();
        phoneSportData.timestamp = this.timestamp;
        phoneSportData.sportType = this.sportType;
        phoneSportData.location = this.location;
        phoneSportData.distance = this.distance;
        phoneSportData.pace = this.pace;
        phoneSportData.gpsAccuracyStatus = this.gpsAccuracyStatus;
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
        phoneSportData.modeChanged = this.modeChanged;
        phoneSportData.lowBattery = this.lowBattery;
        phoneSportData.offGround = this.offGround;
        phoneSportData.impact = this.impact;
        phoneSportData.runStyle = this.runStyle;
        phoneSportData.revolutionCount = this.revolutionCount;
        phoneSportData.onGround = this.onGround;
        phoneSportData.speed = this.speed;
        phoneSportData.onOffRatio = this.onOffRatio;
        phoneSportData.verticalAmplitude = this.verticalAmplitude;
        phoneSportData.verticalStrideRatio = this.verticalStrideRatio;
        return phoneSportData;
    }

    public void setStepRate(float f) {
        this.stepRate = f;
    }

    public String toString() {
        return "PhoneSportData{timestamp=" + this.timestamp + "distance=" + this.distance + ", pace=" + this.pace + ", gpsAccuracyStatus=" + this.gpsAccuracyStatus + ", calorie=" + this.calorie + ", step=" + this.step + ", minHr=" + this.minHr + ", maxHr=" + this.maxHr + ", hr=" + this.heart_rate + ", sportStepRate=" + this.stride_frequency + ", stride=" + this.stride + ", location = " + this.location + ", deviceDuration = " + this.deviceDuration + ", appDuration = " + this.duration + ", avePace = " + this.avePace + ", modeChanged = " + this.modeChanged + ", lowBattery = " + this.lowBattery + ", revolutionCount = " + this.revolutionCount + ", runStyle = " + this.runStyle + ", impact = " + this.impact + ", onGround + " + this.onGround + ", offGround + " + this.offGround + ", speed + " + this.speed + ", onOffRatio + " + this.onOffRatio + ", verticalStrideRatio + " + this.verticalStrideRatio + ", verticalAmplitude + " + this.verticalAmplitude + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneSportData(int i, int i2, float f, int i3, int i4) {
        this.distance = i;
        this.pace = i2;
        this.gpsAccuracyStatus = i4;
        this.calorie = f;
        this.step = i3;
    }
}
