package com.huawei.hwcommonmodel.fitnessdatatype;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class HeartRateZoneThreshold {
    private static final int DEFAULT_REST_HEART_RATE = 60;
    private static final String TAG = "HeartRateZoneThreshold";
    private int mAerobicAdvanceThreshold;
    private int mAerobicBaseThreshold;
    private int mAerobicThreshold;
    private int mAnaerobicAdvanceThreshold;
    private int mAnaerobicBaseThreshold;
    private int mAnaerobicThreshold;
    private int mFatBurnThreshold;
    private int mFitnessThreshold;
    private HeartRateZoneMgr mHeartRateZoneMgr;
    private int mLactateThresholdHeartRate;
    private int mLacticAcidThreshold;
    private int mLthrAerobicHighZone;
    private int mLthrAerobicLowZone;
    private int mLthrAnaerobicInterval;
    private int mLthrLactateThreshold;
    private int mLthrRecoveryInterval;
    private int mMaxHeartRateThreshold;
    private int mMaxThreshold;
    int mRestHeartRate = 60;
    int mRestHeartRateDefault = 60;
    private int mWarmUpThreshold;

    public HeartRateZoneThreshold(int i) {
        resetHeartRateZoneThreshold(i);
        resetHrrHeartRateZoneThreshold(i);
        this.mHeartRateZoneMgr = new HeartRateZoneMgr(i);
    }

    public HeartRateZoneMgr getHeartRateZoneMgr() {
        return this.mHeartRateZoneMgr;
    }

    public final void resetHeartRateZoneThreshold(int i) {
        int i2 = 220 - i;
        this.mMaxThreshold = i2;
        this.mFitnessThreshold = Math.round((i2 * 50) / 100.0f);
        this.mWarmUpThreshold = Math.round((this.mMaxThreshold * 60) / 100.0f);
        this.mFatBurnThreshold = Math.round((this.mMaxThreshold * 70) / 100.0f);
        this.mAerobicThreshold = Math.round((this.mMaxThreshold * 80) / 100.0f);
        this.mAnaerobicThreshold = Math.round((this.mMaxThreshold * 90) / 100.0f);
        LogUtil.a(TAG, " resetHeartRateZoneThreshold  mMaxThreshold =", Integer.valueOf(this.mMaxThreshold));
    }

    public final void resetHrrHeartRateZoneThreshold(int i) {
        int i2 = 220 - i;
        this.mMaxHeartRateThreshold = i2;
        int i3 = i2 - this.mRestHeartRate;
        this.mAnaerobicAdvanceThreshold = Math.round((i3 * 95) / 100.0f) + this.mRestHeartRate;
        this.mAnaerobicBaseThreshold = Math.round((i3 * 88) / 100.0f) + this.mRestHeartRate;
        this.mLacticAcidThreshold = Math.round((i3 * 84) / 100.0f) + this.mRestHeartRate;
        this.mAerobicAdvanceThreshold = Math.round((i3 * 74) / 100.0f) + this.mRestHeartRate;
        this.mAerobicBaseThreshold = Math.round((i3 * 59) / 100.0f) + this.mRestHeartRate;
        LogUtil.a(TAG, " resetHrrHeartRateZoneThreshold  mMaxHeartRateThreshold =", Integer.valueOf(this.mMaxHeartRateThreshold));
    }

    public int getFitnessThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mFitnessThreshold))).intValue();
    }

    public void setFitnessThreshold(int i) {
        this.mFitnessThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getWarmUpThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mWarmUpThreshold))).intValue();
    }

    public void setWarmUpThreshold(int i) {
        this.mWarmUpThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getFatBurnThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mFatBurnThreshold))).intValue();
    }

    public void setFatBurnThreshold(int i) {
        this.mFatBurnThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAerobicThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAerobicThreshold))).intValue();
    }

    public void setAerobicThreshold(int i) {
        this.mAerobicThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAnaerobicThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAnaerobicThreshold))).intValue();
    }

    public void setAnaerobicThreshold(int i) {
        this.mAnaerobicThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getMaxThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mMaxThreshold))).intValue();
    }

    public void setMaxThreshold(int i) {
        this.mMaxThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String getThresholdString() {
        return this.mFitnessThreshold + "|" + this.mWarmUpThreshold + "|" + this.mFatBurnThreshold + "|" + this.mAerobicThreshold + "|" + this.mAnaerobicThreshold + "|" + this.mMaxThreshold;
    }

    public void setThreshold(String str) {
        LogUtil.a(TAG, "setThreshold :", str);
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        try {
            if (strArrSplit.length > 5) {
                this.mFitnessThreshold = Integer.parseInt(strArrSplit[0]);
                this.mWarmUpThreshold = Integer.parseInt(strArrSplit[1]);
                this.mFatBurnThreshold = Integer.parseInt(strArrSplit[2]);
                this.mAerobicThreshold = Integer.parseInt(strArrSplit[3]);
                this.mAnaerobicThreshold = Integer.parseInt(strArrSplit[4]);
                this.mMaxThreshold = Integer.parseInt(strArrSplit[5]);
            }
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "getThreshold ", str, " meet e:", e);
        }
    }

    public int getAerobicBaseThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAerobicBaseThreshold))).intValue();
    }

    public void setAerobicBaseThreshold(int i) {
        this.mAerobicBaseThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAerobicAdvanceThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAerobicAdvanceThreshold))).intValue();
    }

    public void setAerobicAdvanceThreshold(int i) {
        this.mAerobicAdvanceThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getLacticAcidThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mLacticAcidThreshold))).intValue();
    }

    public void setLacticAcidThreshold(int i) {
        this.mLacticAcidThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAnaerobicBaseThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAnaerobicBaseThreshold))).intValue();
    }

    public void setAnaerobicBaseThreshold(int i) {
        this.mAnaerobicBaseThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAnaerobicAdvanceThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mAnaerobicAdvanceThreshold))).intValue();
    }

    public void setAnaerobicAdvanceThreshold(int i) {
        this.mAnaerobicAdvanceThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getHrrMaxThreshold() {
        return ((Integer) lst.d(Integer.valueOf(this.mMaxHeartRateThreshold))).intValue();
    }

    public void setHrrMaxThreshold(int i) {
        this.mMaxHeartRateThreshold = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getLactateThresholdHeartRate() {
        return this.mLactateThresholdHeartRate;
    }

    public void setLactateThresholdHeartRate(int i) {
        this.mLactateThresholdHeartRate = i;
    }

    public int getLthrAnaerobicInterval() {
        return this.mLthrAnaerobicInterval;
    }

    public void setLthrAnaerobicInterval(int i) {
        this.mLthrAnaerobicInterval = i;
    }

    public int getLthrLactateThreshold() {
        return this.mLthrLactateThreshold;
    }

    public void setLthrLactateThreshold(int i) {
        this.mLthrLactateThreshold = i;
    }

    public int getLthrAerobicHighZone() {
        return this.mLthrAerobicHighZone;
    }

    public void setLthrAerobicHighZone(int i) {
        this.mLthrAerobicHighZone = i;
    }

    public int getLthrAerobicLowZone() {
        return this.mLthrAerobicLowZone;
    }

    public void setLthrAerobicLowZone(int i) {
        this.mLthrAerobicLowZone = i;
    }

    public int getLthrRecoveryInterval() {
        return this.mLthrRecoveryInterval;
    }

    public void setLthrRecoveryInterval(int i) {
        this.mLthrRecoveryInterval = i;
    }

    public String getHrrThresholdString() {
        return this.mAerobicBaseThreshold + "|" + this.mAerobicAdvanceThreshold + "|" + this.mLacticAcidThreshold + "|" + this.mAnaerobicBaseThreshold + "|" + this.mAnaerobicAdvanceThreshold + "|" + this.mMaxHeartRateThreshold;
    }

    public void setHrrThreshold(String str) {
        LogUtil.a(TAG, "setThreshold :", str);
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        try {
            if (strArrSplit.length > 5) {
                this.mAerobicBaseThreshold = Integer.parseInt(strArrSplit[0]);
                this.mAerobicAdvanceThreshold = Integer.parseInt(strArrSplit[1]);
                this.mLacticAcidThreshold = Integer.parseInt(strArrSplit[2]);
                this.mAnaerobicBaseThreshold = Integer.parseInt(strArrSplit[3]);
                this.mAnaerobicAdvanceThreshold = Integer.parseInt(strArrSplit[4]);
                this.mMaxHeartRateThreshold = Integer.parseInt(strArrSplit[5]);
            }
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "getThreshold ", str, " meet e:", e);
        }
    }

    public int getRestHeartRate() {
        return ((Integer) lst.d(Integer.valueOf(this.mRestHeartRate))).intValue();
    }

    public void setRestHeartRate(int i) {
        this.mRestHeartRate = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getRestHeartRateDefault() {
        return ((Integer) lst.d(Integer.valueOf(this.mRestHeartRateDefault))).intValue();
    }

    public void setRestHeartRateDefault(int i) {
        int iIntValue = ((Integer) lst.d(Integer.valueOf(i))).intValue();
        this.mRestHeartRateDefault = iIntValue;
        this.mRestHeartRate = iIntValue;
    }

    public String toString() {
        return "HeartRateZoneThreshold{mFitnessThreshold=" + this.mFitnessThreshold + ", mWarmUpThreshold=" + this.mWarmUpThreshold + ", mFatBurnThreshold=" + this.mFatBurnThreshold + ", mAerobicThreshold=" + this.mAerobicThreshold + ", mAnaerobicThreshold=" + this.mAnaerobicThreshold + ", mMaxThreshold=" + this.mMaxThreshold + ", mAerobicBaseThreshold=" + this.mAerobicBaseThreshold + ", mAerobicAdvanceThreshold=" + this.mAerobicAdvanceThreshold + ", mLacticAcidThreshold=" + this.mLacticAcidThreshold + ", mAnaerobicBaseThreshold=" + this.mAnaerobicBaseThreshold + ", mAnaerobicAdvanceThreshold=" + this.mAnaerobicAdvanceThreshold + ", mMaxHeartRateThreshold=" + this.mMaxHeartRateThreshold + ", mLthrAnaerobicInterval " + this.mLthrAnaerobicInterval + ", mLthrLactateThreshold " + this.mLthrLactateThreshold + ", mLthrAerobicHighZone " + this.mLthrAerobicHighZone + ", mLthrAerobicLowZone " + this.mLthrAerobicLowZone + ", mLthrRecoveryInterval " + this.mLthrRecoveryInterval + '}';
    }
}
