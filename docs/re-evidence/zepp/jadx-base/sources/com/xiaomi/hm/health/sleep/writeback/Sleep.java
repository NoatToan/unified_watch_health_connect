package com.xiaomi.hm.health.sleep.writeback;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Ja\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0013\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\u0014\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b'\u0010#R!\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00058@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/sleep/writeback/Sleep;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "", "Lcom/xiaomi/hm/health/sleep/writeback/SleepStage;", "component8", UserDataStore.STATE, "ed", Constant.PAI_KEY_DAILY_PAI, "lt", "dt", "rhr", "ss", StepsInfo.KEY_STAGE, "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getSt", "()J", "getEd", LogUtil.I, "getDp", "()I", "getLt", "getDt", "getRhr", "getSs", "Ljava/util/List;", "getStage", "()Ljava/util/List;", "getDuration$app_midongPlayRelease", "duration", "<init>", "(JJIIIIILjava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Sleep {
    private final int dp;
    private final int dt;
    private final long ed;
    private final int lt;
    private final int rhr;
    private final int ss;
    private final long st;

    @Nullable
    private final List<SleepStage> stage;

    public Sleep(long j, long j2, int i, int i2, int i3, int i4, int i5, @Nullable List<SleepStage> list) {
        this.st = j;
        this.ed = j2;
        this.dp = i;
        this.lt = i2;
        this.dt = i3;
        this.rhr = i4;
        this.ss = i5;
        this.stage = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSt() {
        return this.st;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEd() {
        return this.ed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLt() {
        return this.lt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDt() {
        return this.dt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRhr() {
        return this.rhr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSs() {
        return this.ss;
    }

    @Nullable
    public final List<SleepStage> component8() {
        return this.stage;
    }

    @NotNull
    public final Sleep copy(long st, long ed, int dp, int lt, int dt, int rhr, int ss, @Nullable List<SleepStage> stage) {
        return new Sleep(st, ed, dp, lt, dt, rhr, ss, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sleep)) {
            return false;
        }
        Sleep sleep = (Sleep) other;
        return this.st == sleep.st && this.ed == sleep.ed && this.dp == sleep.dp && this.lt == sleep.lt && this.dt == sleep.dt && this.rhr == sleep.rhr && this.ss == sleep.ss && Intrinsics.areEqual(this.stage, sleep.stage);
    }

    public final int getDp() {
        return this.dp;
    }

    public final int getDt() {
        return this.dt;
    }

    public final int getDuration$app_midongPlayRelease() {
        return this.dp + this.lt + this.dt;
    }

    public final long getEd() {
        return this.ed;
    }

    public final int getLt() {
        return this.lt;
    }

    public final int getRhr() {
        return this.rhr;
    }

    public final int getSs() {
        return this.ss;
    }

    public final long getSt() {
        return this.st;
    }

    @Nullable
    public final List<SleepStage> getStage() {
        return this.stage;
    }

    public int hashCode() {
        int iA = ((((((((((((b.a(this.st) * 31) + b.a(this.ed)) * 31) + this.dp) * 31) + this.lt) * 31) + this.dt) * 31) + this.rhr) * 31) + this.ss) * 31;
        List<SleepStage> list = this.stage;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "Sleep(st=" + this.st + ", ed=" + this.ed + ", dp=" + this.dp + ", lt=" + this.lt + ", dt=" + this.dt + ", rhr=" + this.rhr + ", ss=" + this.ss + ", stage=" + this.stage + ")";
    }
}
