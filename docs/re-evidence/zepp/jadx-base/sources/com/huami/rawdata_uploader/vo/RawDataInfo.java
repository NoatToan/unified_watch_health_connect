package com.huami.rawdata_uploader.vo;

import androidx.annotation.Keep;
import defpackage.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/rawdata_uploader/vo/RawDataInfo;", "", "", "component1", "", "component2", "generateTime", "rawData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getGenerateTime", "()J", "[B", "getRawData", "()[B", "<init>", "(J[B)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataInfo {
    private final long generateTime;

    @NotNull
    private final byte[] rawData;

    public RawDataInfo(long j, @NotNull byte[] bArr) {
        this.generateTime = j;
        this.rawData = bArr;
    }

    public static /* synthetic */ RawDataInfo copy$default(RawDataInfo rawDataInfo, long j, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rawDataInfo.generateTime;
        }
        if ((i & 2) != 0) {
            bArr = rawDataInfo.rawData;
        }
        return rawDataInfo.copy(j, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    @NotNull
    public final RawDataInfo copy(long generateTime, @NotNull byte[] rawData) {
        return new RawDataInfo(generateTime, rawData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataInfo)) {
            return false;
        }
        RawDataInfo rawDataInfo = (RawDataInfo) other;
        return this.generateTime == rawDataInfo.generateTime && Intrinsics.areEqual(this.rawData, rawDataInfo.rawData);
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final byte[] getRawData() {
        return this.rawData;
    }

    public int hashCode() {
        return (b.a(this.generateTime) * 31) + Arrays.hashCode(this.rawData);
    }

    @NotNull
    public String toString() {
        return "RawDataInfo(generateTime=" + this.generateTime + ", rawData=" + Arrays.toString(this.rawData) + ")";
    }
}
