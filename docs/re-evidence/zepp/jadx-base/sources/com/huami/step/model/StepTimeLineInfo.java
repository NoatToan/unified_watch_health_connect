package com.huami.step.model;

import android.graphics.drawable.Drawable;
import com.alipay.sdk.m.x.d;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b2\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010-\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\"\u00105\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\"\u00109\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0018\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\"\u0010=\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0018\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\"\u0010A\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0018\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\"\u0010E\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0018\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001c¨\u0006H"}, d2 = {"Lcom/huami/step/model/StepTimeLineInfo;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "c", "getTitle", d.o, "title", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getStep", "()I", "setStep", "(I)V", "step", "e", "getStepUnit", "setStepUnit", "stepUnit", "f", "getDistance", "setDistance", "distance", "g", "getDistanceUnit", "setDistanceUnit", "distanceUnit", "h", "getCalorie", "setCalorie", "calorie", "i", "getCalorieUnit", "setCalorieUnit", "calorieUnit", z.j, "getDurationHour", "setDurationHour", "durationHour", hl.k, "getDurationMin", "setDurationMin", "durationMin", "l", "getStartTime", "setStartTime", "startTime", "m", "getEndTime", "setEndTime", "endTime", GoogleApiAvailabilityLight.b, "getMode", "setMode", "mode", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepTimeLineInfo {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Drawable icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int step;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int distance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int calorie;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int durationHour;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int durationMin;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int startTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int endTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mode;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String name = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String title = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String stepUnit = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String distanceUnit = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String calorieUnit = "";

    public final int getCalorie() {
        return this.calorie;
    }

    @NotNull
    public final String getCalorieUnit() {
        return this.calorieUnit;
    }

    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    public final int getDurationHour() {
        return this.durationHour;
    }

    public final int getDurationMin() {
        return this.durationMin;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Drawable getIcon() {
        return this.icon;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getStep() {
        return this.step;
    }

    @NotNull
    public final String getStepUnit() {
        return this.stepUnit;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setCalorieUnit(@NotNull String str) {
        this.calorieUnit = str;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDistanceUnit(@NotNull String str) {
        this.distanceUnit = str;
    }

    public final void setDurationHour(int i) {
        this.durationHour = i;
    }

    public final void setDurationMin(int i) {
        this.durationMin = i;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.icon = drawable;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final void setStepUnit(@NotNull String str) {
        this.stepUnit = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }
}
