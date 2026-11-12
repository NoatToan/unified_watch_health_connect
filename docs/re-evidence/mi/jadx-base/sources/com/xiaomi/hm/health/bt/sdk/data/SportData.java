package com.xiaomi.hm.health.bt.sdk.data;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class SportData implements Serializable {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private int hr = -1;
    private float distance = -1.0f;
    private float pace = -1.0f;
    private float avePace = -1.0f;
    private float stepFreq = -1.0f;
    private int step = -1;
    private int cal = -1;
    private int stepLen = -1;
    private int elapsedTime = -1;
    private SportType sportType = SportType.SPORT_TYPE_ODRUN;

    public float getAvePace() {
        return this.avePace;
    }

    public int getCal() {
        return this.cal;
    }

    public float getDistance() {
        return this.distance;
    }

    public int getElapsedTime() {
        return this.elapsedTime;
    }

    public int getHr() {
        return this.hr;
    }

    public float getPace() {
        return this.pace;
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public int getStep() {
        return this.step;
    }

    public float getStepFreq() {
        return this.stepFreq;
    }

    public int getStepLen() {
        return this.stepLen;
    }

    public void setAvePace(float f) {
        this.avePace = f;
    }

    public void setCal(int i) {
        this.cal = i;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void setElapsedTime(int i) {
        this.elapsedTime = i;
    }

    public void setHr(int i) {
        this.hr = i;
    }

    public void setPace(float f) {
        this.pace = f;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public void setStepFreq(float f) {
        this.stepFreq = f;
    }

    public void setStepLen(int i) {
        this.stepLen = i;
    }
}
