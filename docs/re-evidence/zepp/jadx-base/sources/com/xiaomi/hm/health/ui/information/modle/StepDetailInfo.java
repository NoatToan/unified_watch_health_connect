package com.xiaomi.hm.health.ui.information.modle;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class StepDetailInfo {
    private static final String a = "StepDetailInfo";
    public String calorie;
    public String calorieFat;
    public String calorieUnit;
    public String distance;
    public String distanceOil;
    public String distanceUnit;
    public boolean isEmpty;
    public String stepCount;
    public String stepUnit;
    public ArrayList<StepTimeLineInfo> timeLineInfo;

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append("     //======================||\n");
        sb.append("    ||     day step: ");
        sb.append(this.stepCount);
        sb.append(this.stepUnit);
        sb.append("  ||\n");
        sb.append("    || day distance: ");
        sb.append(this.distance);
        sb.append(this.distanceUnit);
        sb.append("; oil = ");
        sb.append(this.distanceOil);
        sb.append("  ||\n");
        sb.append("    ||  day calorie: ");
        sb.append(this.calorie);
        sb.append(this.calorieUnit);
        sb.append("; fat = ");
        sb.append(this.calorieFat);
        sb.append("  ||\n");
        sb.append("    ||=======================||\n");
        for (StepTimeLineInfo stepTimeLineInfo : this.timeLineInfo) {
            sb.append(" >>>==========================<<<\n");
            sb.append(" active item: ");
            sb.append(stepTimeLineInfo.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
