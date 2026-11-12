package com.huami.bluetooth.profile.gdsp;

import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "", "", "component1", "", "Lcom/huami/bluetooth/profile/gdsp/HeadsetHealthMetadata;", "component2", "saveScoreRtcTime", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getSaveScoreRtcTime", "()J", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(JLjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingHealthDayData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long saveScoreRtcTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<HeadsetHealthMetadata> data;

    public HearingHealthDayData(long j, @NotNull List<HeadsetHealthMetadata> list) {
        this.saveScoreRtcTime = j;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HearingHealthDayData copy$default(HearingHealthDayData hearingHealthDayData, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = hearingHealthDayData.saveScoreRtcTime;
        }
        if ((i & 2) != 0) {
            list = hearingHealthDayData.data;
        }
        return hearingHealthDayData.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSaveScoreRtcTime() {
        return this.saveScoreRtcTime;
    }

    @NotNull
    public final List<HeadsetHealthMetadata> component2() {
        return this.data;
    }

    @NotNull
    public final HearingHealthDayData copy(long saveScoreRtcTime, @NotNull List<HeadsetHealthMetadata> data) {
        return new HearingHealthDayData(saveScoreRtcTime, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingHealthDayData)) {
            return false;
        }
        HearingHealthDayData hearingHealthDayData = (HearingHealthDayData) other;
        return this.saveScoreRtcTime == hearingHealthDayData.saveScoreRtcTime && Intrinsics.areEqual(this.data, hearingHealthDayData.data);
    }

    @NotNull
    public final List<HeadsetHealthMetadata> getData() {
        return this.data;
    }

    public final long getSaveScoreRtcTime() {
        return this.saveScoreRtcTime;
    }

    public int hashCode() {
        return (b.a(this.saveScoreRtcTime) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "HearingHealthDayData(saveScoreRtcTime=" + this.saveScoreRtcTime + ", data=" + this.data + ')';
    }
}
