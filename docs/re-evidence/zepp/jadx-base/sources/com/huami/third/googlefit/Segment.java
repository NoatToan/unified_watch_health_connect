package com.huami.third.googlefit;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003JC\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"¨\u0006)"}, d2 = {"Lcom/huami/third/googlefit/Segment;", "", "", "toString", "Lcom/huami/third/googlefit/FieldPair;", "component1", "Lcom/huami/third/googlefit/ActivityField;", "component2", "", "component3", "component4", "component5", "filed", "activityFiled", "startTime", "endTime", "timestamp", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/third/googlefit/FieldPair;", "getFiled", "()Lcom/huami/third/googlefit/FieldPair;", "b", "Lcom/huami/third/googlefit/ActivityField;", "getActivityFiled", "()Lcom/huami/third/googlefit/ActivityField;", "c", "J", "getStartTime", "()J", GoogleApiAvailabilityLight.a, "getEndTime", "e", "getTimestamp", "<init>", "(Lcom/huami/third/googlefit/FieldPair;Lcom/huami/third/googlefit/ActivityField;JJJ)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class Segment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final FieldPair<?> filed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final ActivityField activityFiled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long timestamp;

    public Segment() {
        this(null, null, 0L, 0L, 0L, 31, null);
    }

    public Segment(@Nullable FieldPair<?> fieldPair, @Nullable ActivityField activityField, long j, long j2, long j3) {
        this.filed = fieldPair;
        this.activityFiled = activityField;
        this.startTime = j;
        this.endTime = j2;
        this.timestamp = j3;
    }

    @Nullable
    public final FieldPair<?> component1() {
        return this.filed;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivityField getActivityFiled() {
        return this.activityFiled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final Segment copy(@Nullable FieldPair<?> filed, @Nullable ActivityField activityFiled, long startTime, long endTime, long timestamp) {
        return new Segment(filed, activityFiled, startTime, endTime, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return Intrinsics.areEqual(this.filed, segment.filed) && Intrinsics.areEqual(this.activityFiled, segment.activityFiled) && this.startTime == segment.startTime && this.endTime == segment.endTime && this.timestamp == segment.timestamp;
    }

    @Nullable
    public final ActivityField getActivityFiled() {
        return this.activityFiled;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final FieldPair<?> getFiled() {
        return this.filed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        FieldPair<?> fieldPair = this.filed;
        int iHashCode = (fieldPair != null ? fieldPair.hashCode() : 0) * 31;
        ActivityField activityField = this.activityFiled;
        int iHashCode2 = (iHashCode + (activityField != null ? activityField.hashCode() : 0)) * 31;
        long j = this.startTime;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.endTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.timestamp;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "Segment(filed=" + this.filed + ", activityFiled=" + this.activityFiled + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timestamp=" + this.timestamp + ')';
    }

    public /* synthetic */ Segment(FieldPair fieldPair, ActivityField activityField, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fieldPair, (i & 2) == 0 ? activityField : null, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L);
    }
}
