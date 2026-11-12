package com.xiaomi.hm.health.device.setting.realtime;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\f¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/realtime/RealtimeDataHandler;", "", "", "totalStep", "getStepDelta", "totalCalories", "getCaloriesDelta", "a", LogUtil.I, "getFirstTotalStep", "()I", "setFirstTotalStep", "(I)V", "firstTotalStep", "b", "getFirstTotalCalories", "setFirstTotalCalories", "firstTotalCalories", "c", "getCurrentHr", "setCurrentHr", "currentHr", GoogleApiAvailabilityLight.a, "getCurrentSteps", "setCurrentSteps", "currentSteps", "e", "getCurrentCalories", "setCurrentCalories", "currentCalories", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RealtimeDataHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int firstTotalStep = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int firstTotalCalories = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentSteps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentCalories;

    public final int getCaloriesDelta(int totalCalories) {
        if (this.firstTotalCalories < 0) {
            this.firstTotalCalories = totalCalories;
        }
        return totalCalories - this.firstTotalCalories;
    }

    public final int getCurrentCalories() {
        return this.currentCalories;
    }

    public final int getCurrentHr() {
        return this.currentHr;
    }

    public final int getCurrentSteps() {
        return this.currentSteps;
    }

    public final int getFirstTotalCalories() {
        return this.firstTotalCalories;
    }

    public final int getFirstTotalStep() {
        return this.firstTotalStep;
    }

    public final int getStepDelta(int totalStep) {
        if (this.firstTotalStep < 0) {
            this.firstTotalStep = totalStep;
        }
        return totalStep - this.firstTotalStep;
    }

    public final void setCurrentCalories(int i) {
        this.currentCalories = i;
    }

    public final void setCurrentHr(int i) {
        this.currentHr = i;
    }

    public final void setCurrentSteps(int i) {
        this.currentSteps = i;
    }

    public final void setFirstTotalCalories(int i) {
        this.firstTotalCalories = i;
    }

    public final void setFirstTotalStep(int i) {
        this.firstTotalStep = i;
    }
}
