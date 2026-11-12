package com.xiaomi.hm.health.ui.information.modle;

/* JADX INFO: loaded from: classes22.dex */
public class StepTimeLineInfo extends BaseTimeLineInfo {
    public int calorie;
    public String calorieUnit;
    public String distance;
    public String distanceUnit;
    public int durationHour;
    public int durationMin;
    public int step;
    public String stepUnit;
    public String title;

    public String toString() {
        return "\n    time: " + this.title + "\nduration: " + this.durationHour + ":" + this.durationMin + "\n    step: " + this.step + this.stepUnit + "\ndistance: " + this.distance + this.distanceUnit + "\n calorie: " + this.calorie + this.calorieUnit + "\n";
    }
}
