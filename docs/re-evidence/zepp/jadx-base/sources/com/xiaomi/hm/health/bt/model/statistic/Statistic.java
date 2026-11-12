package com.xiaomi.hm.health.bt.model.statistic;

/* JADX INFO: loaded from: classes19.dex */
public class Statistic {
    private int upTime = -1;
    private int ppgTime = -1;
    private int vibTime = -1;
    private int lcdTime = -1;
    private int flashTime = -1;
    private int connTime = -1;
    private int runTime = -1;
    private int algTime = -1;
    private int rebootCount = -1;
    private int disconnectCount = -1;
    private int keyCount = -1;
    private int liftWristCount = -1;
    private int appNotifyCount = -1;
    private int phoneCount = -1;
    private int sedCount = -1;
    private int alarmsCount = -1;

    public int getAlarmsCount() {
        return this.alarmsCount;
    }

    public int getAlgTime() {
        return this.algTime;
    }

    public int getAppNotifyCount() {
        return this.appNotifyCount;
    }

    public int getConnTime() {
        return this.connTime;
    }

    public int getDisconnectCount() {
        return this.disconnectCount;
    }

    public int getFlashTime() {
        return this.flashTime;
    }

    public int getKeyCount() {
        return this.keyCount;
    }

    public int getLcdTime() {
        return this.lcdTime;
    }

    public int getLiftWristCount() {
        return this.liftWristCount;
    }

    public int getPhoneCount() {
        return this.phoneCount;
    }

    public int getPpgTime() {
        return this.ppgTime;
    }

    public int getRebootCount() {
        return this.rebootCount;
    }

    public int getRunTime() {
        return this.runTime;
    }

    public int getSedCount() {
        return this.sedCount;
    }

    public int getUpTime() {
        return this.upTime;
    }

    public int getVibTime() {
        return this.vibTime;
    }

    public void setAlarmsCount(int alarmsCount) {
        this.alarmsCount = alarmsCount;
    }

    public void setAlgTime(int algTime) {
        this.algTime = algTime;
    }

    public void setAppNotifyCount(int appNotifyCount) {
        this.appNotifyCount = appNotifyCount;
    }

    public void setConnTime(int connTime) {
        this.connTime = connTime;
    }

    public void setDisconnectCount(int disconnectCount) {
        this.disconnectCount = disconnectCount;
    }

    public void setFlashTime(int flashTime) {
        this.flashTime = flashTime;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    public void setLcdTime(int lcdTime) {
        this.lcdTime = lcdTime;
    }

    public void setLiftWristCount(int liftWristCount) {
        this.liftWristCount = liftWristCount;
    }

    public void setPhoneCount(int phoneCount) {
        this.phoneCount = phoneCount;
    }

    public void setPpgTime(int ppgTime) {
        this.ppgTime = ppgTime;
    }

    public void setRebootCount(int rebootCount) {
        this.rebootCount = rebootCount;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public void setSedCount(int sedCount) {
        this.sedCount = sedCount;
    }

    public void setUpTime(int upTime) {
        this.upTime = upTime;
    }

    public void setVibTime(int vibTime) {
        this.vibTime = vibTime;
    }

    public String toString() {
        return "Statistic{upTime=" + this.upTime + ", ppgTime=" + this.ppgTime + ", vibTime=" + this.vibTime + ", lcdTime=" + this.lcdTime + ", flashTime=" + this.flashTime + ", connTime=" + this.connTime + ", runTime=" + this.runTime + ", algTime=" + this.algTime + ", rebootCount=" + this.rebootCount + ", disconnectCount=" + this.disconnectCount + ", keyCount=" + this.keyCount + ", liftWristCount=" + this.liftWristCount + ", appNotifyCount=" + this.appNotifyCount + ", phoneCount=" + this.phoneCount + ", sedCount=" + this.sedCount + ", alarmsCount=" + this.alarmsCount + '}';
    }
}
