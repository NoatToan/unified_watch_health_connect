package com.xiaomi.hm.health.bt.profile.gdsp.ppg;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/PPGData;", "", "", "", "component1", "Ljava/util/Calendar;", "component2", "data", "timeStamp", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "b", "Ljava/util/Calendar;", "getTimeStamp", "()Ljava/util/Calendar;", "<init>", "(Ljava/util/List;Ljava/util/Calendar;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PPGData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Float> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar timeStamp;

    public PPGData(@NotNull List<Float> list, @NotNull Calendar calendar) {
        this.data = list;
        this.timeStamp = calendar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PPGData copy$default(PPGData pPGData, List list, Calendar calendar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pPGData.data;
        }
        if ((i & 2) != 0) {
            calendar = pPGData.timeStamp;
        }
        return pPGData.copy(list, calendar);
    }

    @NotNull
    public final List<Float> component1() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Calendar getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final PPGData copy(@NotNull List<Float> data, @NotNull Calendar timeStamp) {
        return new PPGData(data, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PPGData)) {
            return false;
        }
        PPGData pPGData = (PPGData) other;
        return Intrinsics.areEqual(this.data, pPGData.data) && Intrinsics.areEqual(this.timeStamp, pPGData.timeStamp);
    }

    @NotNull
    public final List<Float> getData() {
        return this.data;
    }

    @NotNull
    public final Calendar getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.timeStamp.hashCode();
    }

    @NotNull
    public String toString() {
        return "PPGData(data=" + this.data + ", timeStamp=" + this.timeStamp + ')';
    }
}
