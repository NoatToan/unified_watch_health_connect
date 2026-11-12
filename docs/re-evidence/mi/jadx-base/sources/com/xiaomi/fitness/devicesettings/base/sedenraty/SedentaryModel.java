package com.xiaomi.fitness.devicesettings.base.sedenraty;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.ffp;
import defpackage.st9;
import defpackage.t64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bM\u0018\u0000 g2\u00020\u0001:\u0001gB\t\b\u0007¢\u0006\u0004\bf\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u00100\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\"\u00103\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\"\u00106\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\"\u00109\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\"\u0010<\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\"\u0010?\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010H\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010K\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\"\u0010N\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\"\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\"\u0010Q\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\"\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R\"\u0010T\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\"\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\"\u0010W\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\"\u001a\u0004\bX\u0010$\"\u0004\bY\u0010&R\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\"\u0010]\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\"\u001a\u0004\b^\u0010$\"\u0004\b_\u0010&R\"\u0010`\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\"\u001a\u0004\ba\u0010$\"\u0004\bb\u0010&R\"\u0010c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\"\u001a\u0004\bd\u0010$\"\u0004\be\u0010&¨\u0006h"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel;", "", "Lt64;", "time", "", "setBreakStartTime", "(Lt64;)V", "setBreakEndTime", "setStartTime", "setEndTime", "onSyncSuccess", "()V", "", "isStart", "", "hour", "minute", "updateTimeValue", "(ZII)V", "updateBreakTimeValue", "isSupportBreakTime", "Lst9;", "getBleSedentaryReminder", "(Z)Lst9;", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "getHuaMiSedentaryConfig", "(Z)Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "getHMSedentaryConfig", "()Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "info", "setInfo", "(Lst9;)V", "mStartHour", "I", "getMStartHour", "()I", "setMStartHour", "(I)V", "mStartMin", "getMStartMin", "setMStartMin", "mEndHour", "getMEndHour", "setMEndHour", "mEndMin", "getMEndMin", "setMEndMin", "mBreakStartHour", "getMBreakStartHour", "setMBreakStartHour", "mBreakStartMin", "getMBreakStartMin", "setMBreakStartMin", "mBreakEndHour", "getMBreakEndHour", "setMBreakEndHour", "mBreakEndMin", "getMBreakEndMin", "setMBreakEndMin", "mStretch", "getMStretch", "setMStretch", "mMode", "Z", "getMMode", "()Z", "setMMode", "(Z)V", "mModeCal", "getMModeCal", "setMModeCal", "mSiesta", "getMSiesta", "setMSiesta", "mSiestaCal", "getMSiestaCal", "setMSiestaCal", "mStartHourCal", "getMStartHourCal", "setMStartHourCal", "mStartMinCal", "getMStartMinCal", "setMStartMinCal", "mEndHourCal", "getMEndHourCal", "setMEndHourCal", "mEndMinCal", "getMEndMinCal", "setMEndMinCal", "mBreakStartHourCal", "getMBreakStartHourCal", "setMBreakStartHourCal", "mBreakStartMinCal", "getMBreakStartMinCal", "setMBreakStartMinCal", "mBreakEndHourCal", "getMBreakEndHourCal", "setMBreakEndHourCal", "mBreakEndMinCal", "getMBreakEndMinCal", "setMBreakEndMinCal", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSedentaryModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SedentaryModel.kt\ncom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
public final class SedentaryModel {
    public static final int MINUTE_OF_ONE_HOUR = 60;
    public static final int NO_DISTURB_MINUTE = 0;
    public static final int NO_DISTURB_START_HOUR = 12;
    public static final int NO_DISTURB_STOP_HOUR = 14;
    private int mStretch;
    private int mStartHour = 8;
    private int mEndHour = 22;
    private int mBreakStartHour = 12;
    private int mBreakEndHour = 14;
    private boolean mMode = true;
    private boolean mModeCal = true;
    private boolean mSiesta = true;
    private boolean mSiestaCal = true;
    private int mStartHourCal = 8;
    private int mStartMin;
    private int mStartMinCal = this.mStartMin;
    private int mEndHourCal = 22;
    private int mEndMin;
    private int mEndMinCal = this.mEndMin;
    private int mBreakStartHourCal = 12;
    private int mBreakStartMin;
    private int mBreakStartMinCal = this.mBreakStartMin;
    private int mBreakEndHourCal = 14;
    private int mBreakEndMin;
    private int mBreakEndMinCal = this.mBreakEndMin;

    private final void setBreakEndTime(t64 time) {
        int i = time.c;
        this.mBreakEndHour = i;
        this.mBreakEndHourCal = i;
        int i2 = time.d;
        this.mBreakEndMin = i2;
        this.mBreakEndMinCal = i2;
    }

    private final void setBreakStartTime(t64 time) {
        int i = time.c;
        this.mBreakStartHour = i;
        this.mBreakStartHourCal = i;
        int i2 = time.d;
        this.mBreakStartMin = i2;
        this.mBreakStartMinCal = i2;
    }

    private final void setEndTime(t64 time) {
        int i = time.c;
        this.mEndHour = i;
        this.mEndHourCal = i;
        int i2 = time.d;
        this.mEndMin = i2;
        this.mEndMinCal = i2;
    }

    private final void setStartTime(t64 time) {
        int i = time.c;
        this.mStartHour = i;
        this.mStartHourCal = i;
        int i2 = time.d;
        this.mStartMin = i2;
        this.mStartMinCal = i2;
    }

    @NotNull
    public final st9 getBleSedentaryReminder(boolean isSupportBreakTime) {
        st9 st9Var = new st9();
        st9Var.c = this.mModeCal;
        t64 t64Var = new t64();
        t64Var.c = this.mStartHourCal;
        t64Var.d = this.mStartMinCal;
        st9Var.d = t64Var;
        t64 t64Var2 = new t64();
        t64Var2.c = this.mEndHourCal;
        t64Var2.d = this.mEndMinCal;
        st9Var.e = t64Var2;
        st9Var.f = this.mSiestaCal;
        if (isSupportBreakTime) {
            t64 t64Var3 = new t64();
            t64Var3.c = this.mBreakStartHourCal;
            t64Var3.d = this.mBreakStartMinCal;
            st9Var.g = t64Var3;
            t64 t64Var4 = new t64();
            t64Var4.c = this.mBreakEndHourCal;
            t64Var4.d = this.mBreakEndMinCal;
            st9Var.h = t64Var4;
        }
        int i = this.mStretch;
        if (i != 0) {
            st9Var.i = i;
        }
        return st9Var;
    }

    @NotNull
    public final HMSedentaryConfig getHMSedentaryConfig() {
        HMSedentaryConfig hMSedentaryConfig = new HMSedentaryConfig();
        hMSedentaryConfig.setEnable(this.mModeCal);
        hMSedentaryConfig.setInterval((short) 60);
        hMSedentaryConfig.setPeriodEnable(this.mSiestaCal);
        hMSedentaryConfig.setDndStart(HMSedentaryConfig.INGORE_START_INDEX);
        hMSedentaryConfig.setDndStop(HMSedentaryConfig.INGORE_STOP_INDEX);
        hMSedentaryConfig.setStartIndex((this.mStartHourCal * 60) + this.mStartMinCal);
        hMSedentaryConfig.setStopIndex((this.mEndHourCal * 60) + this.mEndMinCal);
        return hMSedentaryConfig;
    }

    @NotNull
    public final StandAlertConfig getHuaMiSedentaryConfig(boolean isSupportBreakTime) {
        return isSupportBreakTime ? new StandAlertConfig(this.mModeCal, 60, new Time(this.mStartHourCal, this.mStartMinCal), new Time(this.mEndHourCal, this.mEndMinCal), this.mSiestaCal, new Time(this.mBreakStartHourCal, this.mBreakStartMinCal), new Time(this.mBreakEndHourCal, this.mBreakEndMinCal)) : new StandAlertConfig(this.mModeCal, 60, new Time(this.mStartHourCal, this.mStartMinCal), new Time(this.mEndHourCal, this.mEndMinCal), this.mSiestaCal, new Time(12, 0), new Time(14, 0));
    }

    public final int getMBreakEndHour() {
        return this.mBreakEndHour;
    }

    public final int getMBreakEndHourCal() {
        return this.mBreakEndHourCal;
    }

    public final int getMBreakEndMin() {
        return this.mBreakEndMin;
    }

    public final int getMBreakEndMinCal() {
        return this.mBreakEndMinCal;
    }

    public final int getMBreakStartHour() {
        return this.mBreakStartHour;
    }

    public final int getMBreakStartHourCal() {
        return this.mBreakStartHourCal;
    }

    public final int getMBreakStartMin() {
        return this.mBreakStartMin;
    }

    public final int getMBreakStartMinCal() {
        return this.mBreakStartMinCal;
    }

    public final int getMEndHour() {
        return this.mEndHour;
    }

    public final int getMEndHourCal() {
        return this.mEndHourCal;
    }

    public final int getMEndMin() {
        return this.mEndMin;
    }

    public final int getMEndMinCal() {
        return this.mEndMinCal;
    }

    public final boolean getMMode() {
        return this.mMode;
    }

    public final boolean getMModeCal() {
        return this.mModeCal;
    }

    public final boolean getMSiesta() {
        return this.mSiesta;
    }

    public final boolean getMSiestaCal() {
        return this.mSiestaCal;
    }

    public final int getMStartHour() {
        return this.mStartHour;
    }

    public final int getMStartHourCal() {
        return this.mStartHourCal;
    }

    public final int getMStartMin() {
        return this.mStartMin;
    }

    public final int getMStartMinCal() {
        return this.mStartMinCal;
    }

    public final int getMStretch() {
        return this.mStretch;
    }

    public final void onSyncSuccess() {
        this.mStartMin = this.mStartMinCal;
        this.mStartHour = this.mStartHourCal;
        this.mEndMin = this.mEndMinCal;
        this.mEndHour = this.mEndHourCal;
        this.mMode = this.mModeCal;
        this.mSiesta = this.mSiestaCal;
        this.mBreakStartHour = this.mBreakStartHourCal;
        this.mBreakStartMin = this.mBreakStartMinCal;
        this.mBreakEndMin = this.mBreakEndMinCal;
        this.mBreakEndHour = this.mBreakEndHourCal;
    }

    public final void setInfo(@NotNull st9 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z = info.c;
        this.mMode = z;
        this.mModeCal = z;
        t64 t64Var = info.d;
        if (t64Var != null) {
            setStartTime(t64Var);
        }
        t64 t64Var2 = info.e;
        if (t64Var2 != null) {
            setEndTime(t64Var2);
        }
        boolean z2 = info.f;
        this.mSiestaCal = z2;
        this.mSiesta = z2;
        int i = info.i;
        if (i != 0) {
            this.mStretch = i;
        }
        t64 t64Var3 = info.g;
        if (t64Var3 != null) {
            setBreakStartTime(t64Var3);
        }
        t64 t64Var4 = info.h;
        if (t64Var4 != null) {
            setBreakEndTime(t64Var4);
        }
    }

    public final void setMBreakEndHour(int i) {
        this.mBreakEndHour = i;
    }

    public final void setMBreakEndHourCal(int i) {
        this.mBreakEndHourCal = i;
    }

    public final void setMBreakEndMin(int i) {
        this.mBreakEndMin = i;
    }

    public final void setMBreakEndMinCal(int i) {
        this.mBreakEndMinCal = i;
    }

    public final void setMBreakStartHour(int i) {
        this.mBreakStartHour = i;
    }

    public final void setMBreakStartHourCal(int i) {
        this.mBreakStartHourCal = i;
    }

    public final void setMBreakStartMin(int i) {
        this.mBreakStartMin = i;
    }

    public final void setMBreakStartMinCal(int i) {
        this.mBreakStartMinCal = i;
    }

    public final void setMEndHour(int i) {
        this.mEndHour = i;
    }

    public final void setMEndHourCal(int i) {
        this.mEndHourCal = i;
    }

    public final void setMEndMin(int i) {
        this.mEndMin = i;
    }

    public final void setMEndMinCal(int i) {
        this.mEndMinCal = i;
    }

    public final void setMMode(boolean z) {
        this.mMode = z;
    }

    public final void setMModeCal(boolean z) {
        this.mModeCal = z;
    }

    public final void setMSiesta(boolean z) {
        this.mSiesta = z;
    }

    public final void setMSiestaCal(boolean z) {
        this.mSiestaCal = z;
    }

    public final void setMStartHour(int i) {
        this.mStartHour = i;
    }

    public final void setMStartHourCal(int i) {
        this.mStartHourCal = i;
    }

    public final void setMStartMin(int i) {
        this.mStartMin = i;
    }

    public final void setMStartMinCal(int i) {
        this.mStartMinCal = i;
    }

    public final void setMStretch(int i) {
        this.mStretch = i;
    }

    public final void updateBreakTimeValue(boolean isStart, int hour, int minute) {
        this.mBreakStartHourCal = this.mBreakStartHour;
        this.mBreakStartMinCal = this.mBreakStartMin;
        this.mBreakEndMinCal = this.mBreakEndMin;
        this.mBreakEndHourCal = this.mBreakEndHour;
        if (isStart) {
            this.mBreakStartHourCal = hour;
            this.mBreakStartMinCal = minute;
        } else {
            this.mBreakEndHourCal = hour;
            this.mBreakEndMinCal = minute;
        }
        long jA = ffp.a(this.mBreakStartHourCal, this.mBreakStartMinCal, this.mBreakEndHourCal, this.mBreakEndMinCal);
        Logger.d(SedentaryFragment.TAG, "selectTime: left = " + jA);
        if (jA < 3600000) {
            if (isStart) {
                this.mBreakEndHourCal = (this.mBreakStartHourCal + 1) % 24;
                this.mBreakEndMinCal = this.mBreakStartMinCal;
            } else {
                this.mBreakStartHourCal = (this.mBreakEndHourCal + 23) % 24;
                this.mBreakStartMinCal = this.mBreakEndMinCal;
            }
        }
    }

    public final void updateTimeValue(boolean isStart, int hour, int minute) {
        this.mStartMinCal = this.mStartMin;
        this.mStartHourCal = this.mStartHour;
        this.mEndMinCal = this.mEndMin;
        this.mEndHourCal = this.mEndHour;
        if (isStart) {
            this.mStartHourCal = hour;
            this.mStartMinCal = minute;
        } else {
            this.mEndHourCal = hour;
            this.mEndMinCal = minute;
        }
        long jA = ffp.a(this.mStartHourCal, this.mStartMinCal, this.mEndHourCal, this.mEndMinCal);
        Logger.d(SedentaryFragment.TAG, "selectTime: left = " + jA);
        if (jA < 3600000) {
            if (isStart) {
                this.mEndHourCal = (this.mStartHourCal + 1) % 24;
                this.mEndMinCal = this.mStartMinCal;
            } else {
                this.mStartHourCal = (this.mEndHourCal + 23) % 24;
                this.mStartMinCal = this.mEndMinCal;
            }
        }
    }
}
