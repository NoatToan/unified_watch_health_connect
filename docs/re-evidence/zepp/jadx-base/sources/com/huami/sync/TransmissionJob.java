package com.huami.sync;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.fitness.data.Field;
import com.huami.sync.job.Job;
import com.huami.watch.companion.dataflow.Constant;
import com.loc.z;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/sync/TransmissionJob;", "Lcom/huami/sync/job/Job;", "", "component1", "", "component2", "component3", "component4", "", "component5", "time", Constant.KEY_HR_VALUE, GetWatermarkAPI.KEY_NAME_STEPS, Field.NUTRIENT_CALORIES, "repeatFilterKey", "copy", "", "toString", "hashCode", "other", "", "equals", "f", "J", "getTime", "()J", "g", LogUtil.I, "getHeartRate", "()I", "h", "getSteps", "i", "getCalories", z.j, "Ljava/lang/Object;", "getRepeatFilterKey", "()Ljava/lang/Object;", "<init>", "(JIJJLjava/lang/Object;)V", "Companion", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransmissionJob extends Job<TransmissionJob> {

    @NotNull
    public static final String TAG = "RealTimeDataJob";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int heartRate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long steps;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final long calories;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Object repeatFilterKey;

    public /* synthetic */ TransmissionJob(long j, int i, long j2, long j3, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, j2, j3, (i2 & 16) != 0 ? Long.valueOf(j) : obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCalories() {
        return this.calories;
    }

    @Nullable
    public final Object component5() {
        return getRepeatFilterKey();
    }

    @NotNull
    public final TransmissionJob copy(long time, int heartRate, long steps, long calories, @Nullable Object repeatFilterKey) {
        return new TransmissionJob(time, heartRate, steps, calories, repeatFilterKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransmissionJob)) {
            return false;
        }
        TransmissionJob transmissionJob = (TransmissionJob) other;
        return this.time == transmissionJob.time && this.heartRate == transmissionJob.heartRate && this.steps == transmissionJob.steps && this.calories == transmissionJob.calories && Intrinsics.areEqual(getRepeatFilterKey(), transmissionJob.getRepeatFilterKey());
    }

    public final long getCalories() {
        return this.calories;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    @Override // com.huami.sync.job.Job
    @Nullable
    public Object getRepeatFilterKey() {
        return this.repeatFilterKey;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((b.a(this.time) * 31) + this.heartRate) * 31) + b.a(this.steps)) * 31) + b.a(this.calories)) * 31) + (getRepeatFilterKey() == null ? 0 : getRepeatFilterKey().hashCode());
    }

    @NotNull
    public String toString() {
        return "TransmissionJob(time=" + this.time + ", heartRate=" + this.heartRate + ", steps=" + this.steps + ", calories=" + this.calories + ", repeatFilterKey=" + getRepeatFilterKey() + ')';
    }

    public TransmissionJob(long j, int i, long j2, long j3, @Nullable Object obj) {
        this.time = j;
        this.heartRate = i;
        this.steps = j2;
        this.calories = j3;
        this.repeatFilterKey = obj;
    }
}
