package com.huawei.health.plan.aicoach;

/* JADX INFO: loaded from: classes8.dex */
public enum ControlTypeEnum {
    PARALLEL_CONTROL("parallelControl"),
    INPUT_GUIDE_TEXT_CONTROL("inputGuideTextControl"),
    PARALLEL_SUB_CONTROL("parallelSubControl"),
    SUMMARY_CONTROL("summaryControl"),
    CONTROL_RESULT("result");

    private final String controlType;

    ControlTypeEnum(String str) {
        this.controlType = str;
    }

    public String getControlType() {
        return this.controlType;
    }
}
