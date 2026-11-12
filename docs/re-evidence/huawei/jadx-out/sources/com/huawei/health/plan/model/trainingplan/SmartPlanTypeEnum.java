package com.huawei.health.plan.model.trainingplan;

/* JADX INFO: loaded from: classes.dex */
public enum SmartPlanTypeEnum {
    SMART_NA_PLAN(0),
    SMART_TRAINING_PLAN(1),
    SMART_WEIGHT_PLAN(2);

    private final int value;

    SmartPlanTypeEnum(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
