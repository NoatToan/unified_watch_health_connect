package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "", "", "component1", "Ljava/util/Calendar;", "component2", "", "component3", "component4", "dataType", "cal", "rawData", "headerExpansionData", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDataType", "()I", "b", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "c", "[B", "getRawData", "()[B", GoogleApiAvailabilityLight.a, "getHeaderExpansionData", "<init>", "(ILjava/util/Calendar;[B[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HmGdspRawData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar cal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] rawData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final byte[] headerExpansionData;

    public HmGdspRawData(int i, @NotNull Calendar calendar, @NotNull byte[] bArr, @Nullable byte[] bArr2) {
        this.dataType = i;
        this.cal = calendar;
        this.rawData = bArr;
        this.headerExpansionData = bArr2;
    }

    public static /* synthetic */ HmGdspRawData copy$default(HmGdspRawData hmGdspRawData, int i, Calendar calendar, byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hmGdspRawData.dataType;
        }
        if ((i2 & 2) != 0) {
            calendar = hmGdspRawData.cal;
        }
        if ((i2 & 4) != 0) {
            bArr = hmGdspRawData.rawData;
        }
        if ((i2 & 8) != 0) {
            bArr2 = hmGdspRawData.headerExpansionData;
        }
        return hmGdspRawData.copy(i, calendar, bArr, bArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Calendar getCal() {
        return this.cal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getHeaderExpansionData() {
        return this.headerExpansionData;
    }

    @NotNull
    public final HmGdspRawData copy(int dataType, @NotNull Calendar cal, @NotNull byte[] rawData, @Nullable byte[] headerExpansionData) {
        return new HmGdspRawData(dataType, cal, rawData, headerExpansionData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmGdspRawData)) {
            return false;
        }
        HmGdspRawData hmGdspRawData = (HmGdspRawData) other;
        return this.dataType == hmGdspRawData.dataType && Intrinsics.areEqual(this.cal, hmGdspRawData.cal) && Intrinsics.areEqual(this.rawData, hmGdspRawData.rawData) && Intrinsics.areEqual(this.headerExpansionData, hmGdspRawData.headerExpansionData);
    }

    @NotNull
    public final Calendar getCal() {
        return this.cal;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final byte[] getHeaderExpansionData() {
        return this.headerExpansionData;
    }

    @NotNull
    public final byte[] getRawData() {
        return this.rawData;
    }

    public int hashCode() {
        int iHashCode = ((((this.dataType * 31) + this.cal.hashCode()) * 31) + Arrays.hashCode(this.rawData)) * 31;
        byte[] bArr = this.headerExpansionData;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "HmGdspRawData(dataType=" + this.dataType + ", cal=" + this.cal + ", rawData=" + Arrays.toString(this.rawData) + ", headerExpansionData=" + Arrays.toString(this.headerExpansionData) + ')';
    }

    public /* synthetic */ HmGdspRawData(int i, Calendar calendar, byte[] bArr, byte[] bArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, calendar, bArr, (i2 & 8) != 0 ? null : bArr2);
    }
}
