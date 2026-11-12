package com.huami.health.afppg.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/health/afppg/model/AtrialFibrillation;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "duration", "eventTime", "endTime", "ecgAbnormalResults", "deviceSource", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getDuration", "()I", "J", "getEventTime", "()J", "getEndTime", "Ljava/lang/String;", "getEcgAbnormalResults", "()Ljava/lang/String;", "getDeviceSource", "<init>", "(IJJLjava/lang/String;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AtrialFibrillation {
    private final int deviceSource;
    private final int duration;

    @NotNull
    private final String ecgAbnormalResults;
    private final long endTime;
    private final long eventTime;

    public AtrialFibrillation() {
        this(0, 0L, 0L, null, 0, 31, null);
    }

    public AtrialFibrillation(int i, long j, long j2, @NotNull String str, int i2) {
        this.duration = i;
        this.eventTime = j;
        this.endTime = j2;
        this.ecgAbnormalResults = str;
        this.deviceSource = i2;
    }

    public static /* synthetic */ AtrialFibrillation copy$default(AtrialFibrillation atrialFibrillation, int i, long j, long j2, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = atrialFibrillation.duration;
        }
        if ((i3 & 2) != 0) {
            j = atrialFibrillation.eventTime;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            j2 = atrialFibrillation.endTime;
        }
        long j4 = j2;
        if ((i3 & 8) != 0) {
            str = atrialFibrillation.ecgAbnormalResults;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            i2 = atrialFibrillation.deviceSource;
        }
        return atrialFibrillation.copy(i, j3, j4, str2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEcgAbnormalResults() {
        return this.ecgAbnormalResults;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final AtrialFibrillation copy(int duration, long eventTime, long endTime, @NotNull String ecgAbnormalResults, int deviceSource) {
        return new AtrialFibrillation(duration, eventTime, endTime, ecgAbnormalResults, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtrialFibrillation)) {
            return false;
        }
        AtrialFibrillation atrialFibrillation = (AtrialFibrillation) other;
        return this.duration == atrialFibrillation.duration && this.eventTime == atrialFibrillation.eventTime && this.endTime == atrialFibrillation.endTime && Intrinsics.areEqual(this.ecgAbnormalResults, atrialFibrillation.ecgAbnormalResults) && this.deviceSource == atrialFibrillation.deviceSource;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEcgAbnormalResults() {
        return this.ecgAbnormalResults;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public int hashCode() {
        return (((((((this.duration * 31) + b.a(this.eventTime)) * 31) + b.a(this.endTime)) * 31) + this.ecgAbnormalResults.hashCode()) * 31) + this.deviceSource;
    }

    @NotNull
    public String toString() {
        return "AtrialFibrillation(duration=" + this.duration + ", eventTime=" + this.eventTime + ", endTime=" + this.endTime + ", ecgAbnormalResults=" + this.ecgAbnormalResults + ", deviceSource=" + this.deviceSource + ')';
    }

    public /* synthetic */ AtrialFibrillation(int i, long j, long j2, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) == 0 ? j2 : 0L, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? 0 : i2);
    }
}
