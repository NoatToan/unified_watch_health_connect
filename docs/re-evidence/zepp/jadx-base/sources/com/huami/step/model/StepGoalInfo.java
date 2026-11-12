package com.huami.step.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/step/model/StepGoalInfo;", "", "", "a", LogUtil.I, "getMaxReachGoal", "()I", "setMaxReachGoal", "(I)V", "maxReachGoal", "b", "getCurReachGoal", "setCurReachGoal", "curReachGoal", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepGoalInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int maxReachGoal = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int curReachGoal = -1;

    public final int getCurReachGoal() {
        return this.curReachGoal;
    }

    public final int getMaxReachGoal() {
        return this.maxReachGoal;
    }

    public final void setCurReachGoal(int i) {
        this.curReachGoal = i;
    }

    public final void setMaxReachGoal(int i) {
        this.maxReachGoal = i;
    }
}
