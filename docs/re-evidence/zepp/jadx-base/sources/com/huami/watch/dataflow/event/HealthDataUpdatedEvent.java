package com.huami.watch.dataflow.event;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDataUpdatedEvent {
    public final String date;
    public boolean onlyUpdateHR;
    public boolean onlyUpdateHRIsAllDay;
    public boolean onlyUpdateStepCal;
    public boolean onlyUpdateStepGoal;

    public HealthDataUpdatedEvent() {
        this.date = null;
    }

    public String toString() {
        return "<Date: '" + this.date + "', OnlyUpdateStepGoal: " + this.onlyUpdateStepGoal + ", OnlyUpdateStepCal: " + this.onlyUpdateStepCal + ", OnlyUpdateHR: " + this.onlyUpdateHR + ", OnlyUpdateHRIsAllDay: " + this.onlyUpdateHRIsAllDay + Typography.greater;
    }

    public HealthDataUpdatedEvent(String str) {
        this.date = str;
    }
}
