package com.huami.step.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\"\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR\"\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0007\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000b¨\u00064"}, d2 = {"Lcom/huami/step/model/StepInfo;", "", "clone", "", "toString", "", "a", LogUtil.I, "getRunTime", "()I", "setRunTime", "(I)V", "runTime", "b", "getCal", "setCal", "cal", "c", "getRunDistance", "setRunDistance", "runDistance", GoogleApiAvailabilityLight.a, "getWalkTime", "setWalkTime", "walkTime", "e", "getSteps", "setSteps", GetWatermarkAPI.KEY_NAME_STEPS, "f", "getRunCal", "setRunCal", StepsInfo.KEY_STEP_RUN_CALORIES, "g", "getDistance", "setDistance", "distance", "", "h", "J", "getTime", "()J", "setTime", "(J)V", "time", "i", "getDaysHasData", "setDaysHasData", "daysHasData", "<init>", "()V", "Stage", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int runTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int cal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int runDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int walkTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int steps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int runCal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int distance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long time;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int daysHasData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/step/model/StepInfo$Stage;", "", "<init>", "(Lcom/huami/step/model/StepInfo;)V", "step_release"}, k = 1, mv = {1, 5, 1})
    public final class Stage {
        public Stage() {
        }
    }

    @NotNull
    public final StepInfo clone() {
        StepInfo stepInfo = new StepInfo();
        stepInfo.walkTime = this.walkTime;
        stepInfo.steps = this.steps;
        stepInfo.cal = this.cal;
        stepInfo.runCal = this.runCal;
        stepInfo.distance = this.distance;
        stepInfo.time = this.time;
        stepInfo.runDistance = this.runDistance;
        stepInfo.runTime = this.runTime;
        stepInfo.daysHasData = this.daysHasData;
        return stepInfo;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getDaysHasData() {
        return this.daysHasData;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getRunCal() {
        return this.runCal;
    }

    public final int getRunDistance() {
        return this.runDistance;
    }

    public final int getRunTime() {
        return this.runTime;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getWalkTime() {
        return this.walkTime;
    }

    public final void setCal(int i) {
        this.cal = i;
    }

    public final void setDaysHasData(int i) {
        this.daysHasData = i;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setRunCal(int i) {
        this.runCal = i;
    }

    public final void setRunDistance(int i) {
        this.runDistance = i;
    }

    public final void setRunTime(int i) {
        this.runTime = i;
    }

    public final void setSteps(int i) {
        this.steps = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setWalkTime(int i) {
        this.walkTime = i;
    }

    @NotNull
    public String toString() {
        return "runTime=" + this.runTime + ",cal=" + this.cal + ",runDistance=" + this.runDistance + ",walkTime=" + this.walkTime + ",steps=" + this.steps + ",runCal=" + this.runCal + ",distance=" + this.distance + ",time=" + this.time + ",daysHasData=" + this.daysHasData;
    }
}
