package com.xiaomi.hm.health.bt.profile.gdsp;

import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/RawData;", "", "", "component1", "Ljava/util/Calendar;", "component2", "rawData", "timeStam", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "[B", "getRawData", "()[B", "b", "Ljava/util/Calendar;", "getTimeStam", "()Ljava/util/Calendar;", "<init>", "([BLjava/util/Calendar;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] rawData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar timeStam;

    public RawData(@NotNull byte[] bArr, @NotNull Calendar calendar) {
        this.rawData = bArr;
        this.timeStam = calendar;
    }

    public static /* synthetic */ RawData copy$default(RawData rawData, byte[] bArr, Calendar calendar, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = rawData.rawData;
        }
        if ((i & 2) != 0) {
            calendar = rawData.timeStam;
        }
        return rawData.copy(bArr, calendar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Calendar getTimeStam() {
        return this.timeStam;
    }

    @NotNull
    public final RawData copy(@NotNull byte[] rawData, @NotNull Calendar timeStam) {
        return new RawData(rawData, timeStam);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawData)) {
            return false;
        }
        RawData rawData = (RawData) other;
        return Intrinsics.areEqual(this.rawData, rawData.rawData) && Intrinsics.areEqual(this.timeStam, rawData.timeStam);
    }

    @NotNull
    public final byte[] getRawData() {
        return this.rawData;
    }

    @NotNull
    public final Calendar getTimeStam() {
        return this.timeStam;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.rawData) * 31) + this.timeStam.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawData(rawData=" + Arrays.toString(this.rawData) + ", timeStam=" + this.timeStam + ')';
    }
}
