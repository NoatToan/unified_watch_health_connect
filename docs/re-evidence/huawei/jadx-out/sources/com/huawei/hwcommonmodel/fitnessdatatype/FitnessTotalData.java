package com.huawei.hwcommonmodel.fitnessdatatype;

import com.huawei.health.device.model.RecordAction;
import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class FitnessTotalData {
    private int calorie;
    private int distance;
    private int duration;
    private int height;
    private int highIntensiveTime;
    private int lowIntensiveTime;
    private int midIntensiveTime;
    private int pushes;
    private int sportType;
    private int standTimes;
    private int steps;

    public FitnessTotalData() {
        this.sportType = FitnessSportType.HW_FITNESS_SPORT_ALL;
        this.steps = 0;
        this.calorie = 0;
        this.distance = 0;
        this.pushes = 0;
    }

    public FitnessTotalData(DataTotalMotion dataTotalMotion) {
        this.sportType = dataTotalMotion.getMotion_type();
        this.steps = dataTotalMotion.getStep();
        this.calorie = dataTotalMotion.getCalorie();
        this.distance = dataTotalMotion.getDistance();
        this.pushes = dataTotalMotion.getPushes();
    }

    public void setSportType(int i) {
        this.sportType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSportType() {
        return ((Integer) lst.d(Integer.valueOf(this.sportType))).intValue();
    }

    public void setSteps(int i) {
        this.steps = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSteps() {
        return ((Integer) lst.d(Integer.valueOf(this.steps))).intValue();
    }

    public void addSteps(int i) {
        this.steps = ((Integer) lst.d(Integer.valueOf(this.steps + i))).intValue();
    }

    public void setCalorie(int i) {
        this.calorie = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setLowIntensiveTime(int i) {
        this.lowIntensiveTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setMidIntensiveTime(int i) {
        this.midIntensiveTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setHighIntensiveTime(int i) {
        this.highIntensiveTime = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setStandTimes(int i) {
        this.standTimes = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getCalorie() {
        return ((Integer) lst.d(Integer.valueOf(this.calorie))).intValue();
    }

    public void addCalorie(int i) {
        this.calorie = ((Integer) lst.d(Integer.valueOf(this.calorie + i))).intValue();
    }

    public void setDistance(int i) {
        this.distance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.distance))).intValue();
    }

    public void addDistance(int i) {
        this.distance = ((Integer) lst.d(Integer.valueOf(this.distance + i))).intValue();
    }

    public void setDuration(int i) {
        this.duration = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDuration() {
        return ((Integer) lst.d(Integer.valueOf(this.duration))).intValue();
    }

    public void setHeight(int i) {
        this.height = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getHeight() {
        return ((Integer) lst.d(Integer.valueOf(this.height))).intValue();
    }

    public int getLowIntensiveTime() {
        return ((Integer) lst.d(Integer.valueOf(this.lowIntensiveTime))).intValue();
    }

    public int getMidIntensiveTime() {
        return ((Integer) lst.d(Integer.valueOf(this.midIntensiveTime))).intValue();
    }

    public int getHighIntensiveTime() {
        return ((Integer) lst.d(Integer.valueOf(this.highIntensiveTime))).intValue();
    }

    public int getStandTimes() {
        return ((Integer) lst.d(Integer.valueOf(this.standTimes))).intValue();
    }

    public int getPushes() {
        return ((Integer) lst.d(Integer.valueOf(this.pushes))).intValue();
    }

    public void addPushes(int i) {
        this.pushes = ((Integer) lst.d(Integer.valueOf(this.pushes + i))).intValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecordAction.ACT_COST_TIME_TAG + getSportType());
        sb.append(",s=" + getSteps());
        sb.append(",d=" + getDistance());
        sb.append(",c=" + getCalorie());
        sb.append(",h=" + getHeight());
        sb.append(",p=" + getPushes());
        sb.append(",du =" + getDuration());
        sb.append(",low=" + getLowIntensiveTime());
        sb.append(",mid=" + getMidIntensiveTime());
        sb.append(",high=" + getHighIntensiveTime());
        sb.append(",st=" + getStandTimes());
        sb.append(" ;");
        return sb.toString();
    }
}
