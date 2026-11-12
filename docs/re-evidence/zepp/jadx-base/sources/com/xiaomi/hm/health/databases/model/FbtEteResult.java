package com.xiaomi.hm.health.databases.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes20.dex */
@Keep
public class FbtEteResult {
    private int aerobicFeedbackNumber;
    private int artifactPercent;
    private int correctedHR;
    private int cumulativeEnergyExpenditure;
    private int dailyPerformance;
    private long endTime;
    private int energyExpenditure;
    private int exerciseType;
    private Long id;
    private int maximalHR;
    private int maximalMet;
    private int maximalMetMinutes;
    private int minimalHR;
    private int percentAchieved;
    private int phraseNumber;
    private int phraseVariableOne;
    private int phraseVariableTwo;
    private int recoveryTime;
    private int source;
    private int syncState;
    private long timeStamp;
    private long trackId;
    private int trainingEffect;
    private int trainingLoadPeak;

    public FbtEteResult(Long l, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j2, long j3, int i19, int i20) {
        this.id = l;
        this.trackId = j;
        this.source = i;
        this.correctedHR = i2;
        this.artifactPercent = i3;
        this.minimalHR = i4;
        this.maximalHR = i5;
        this.trainingLoadPeak = i6;
        this.trainingEffect = i7;
        this.percentAchieved = i8;
        this.phraseNumber = i9;
        this.phraseVariableOne = i10;
        this.phraseVariableTwo = i11;
        this.energyExpenditure = i12;
        this.cumulativeEnergyExpenditure = i13;
        this.maximalMet = i14;
        this.maximalMetMinutes = i15;
        this.recoveryTime = i16;
        this.dailyPerformance = i17;
        this.aerobicFeedbackNumber = i18;
        this.timeStamp = j2;
        this.endTime = j3;
        this.exerciseType = i19;
        this.syncState = i20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FbtEteResult fbtEteResult = (FbtEteResult) obj;
        return this.trackId == fbtEteResult.trackId && this.source == fbtEteResult.source;
    }

    public int getAerobicFeedbackNumber() {
        return this.aerobicFeedbackNumber;
    }

    public int getArtifactPercent() {
        return this.artifactPercent;
    }

    public int getCorrectedHR() {
        return this.correctedHR;
    }

    public int getCumulativeEnergyExpenditure() {
        return this.cumulativeEnergyExpenditure;
    }

    public int getDailyPerformance() {
        return this.dailyPerformance;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getEnergyExpenditure() {
        return this.energyExpenditure;
    }

    public int getExerciseType() {
        return this.exerciseType;
    }

    public Long getId() {
        return this.id;
    }

    public int getMaximalHR() {
        return this.maximalHR;
    }

    public int getMaximalMet() {
        return this.maximalMet;
    }

    public int getMaximalMetMinutes() {
        return this.maximalMetMinutes;
    }

    public int getMinimalHR() {
        return this.minimalHR;
    }

    public int getPercentAchieved() {
        return this.percentAchieved;
    }

    public int getPhraseNumber() {
        return this.phraseNumber;
    }

    public int getPhraseVariableOne() {
        return this.phraseVariableOne;
    }

    public int getPhraseVariableTwo() {
        return this.phraseVariableTwo;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public int getSource() {
        return this.source;
    }

    public int getSyncState() {
        return this.syncState;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public int getTrainingEffect() {
        return this.trainingEffect;
    }

    public int getTrainingLoadPeak() {
        return this.trainingLoadPeak;
    }

    public int hashCode() {
        long j = this.trackId;
        return (((int) (j ^ (j >>> 32))) * 31) + this.source;
    }

    public void setAerobicFeedbackNumber(int i) {
        this.aerobicFeedbackNumber = i;
    }

    public void setArtifactPercent(int i) {
        this.artifactPercent = i;
    }

    public void setCorrectedHR(int i) {
        this.correctedHR = i;
    }

    public void setCumulativeEnergyExpenditure(int i) {
        this.cumulativeEnergyExpenditure = i;
    }

    public void setDailyPerformance(int i) {
        this.dailyPerformance = i;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setEnergyExpenditure(int i) {
        this.energyExpenditure = i;
    }

    public void setExerciseType(int i) {
        this.exerciseType = i;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setMaximalHR(int i) {
        this.maximalHR = i;
    }

    public void setMaximalMet(int i) {
        this.maximalMet = i;
    }

    public void setMaximalMetMinutes(int i) {
        this.maximalMetMinutes = i;
    }

    public void setMinimalHR(int i) {
        this.minimalHR = i;
    }

    public void setPercentAchieved(int i) {
        this.percentAchieved = i;
    }

    public void setPhraseNumber(int i) {
        this.phraseNumber = i;
    }

    public void setPhraseVariableOne(int i) {
        this.phraseVariableOne = i;
    }

    public void setPhraseVariableTwo(int i) {
        this.phraseVariableTwo = i;
    }

    public void setRecoveryTime(int i) {
        this.recoveryTime = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSyncState(int i) {
        this.syncState = i;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public void setTrainingEffect(int i) {
        this.trainingEffect = i;
    }

    public void setTrainingLoadPeak(int i) {
        this.trainingLoadPeak = i;
    }

    public FbtEteResult() {
    }
}
