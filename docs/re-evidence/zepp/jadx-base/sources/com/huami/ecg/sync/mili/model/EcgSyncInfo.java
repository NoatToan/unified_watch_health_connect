package com.huami.ecg.sync.mili.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u0006."}, d2 = {"Lcom/huami/ecg/sync/mili/model/EcgSyncInfo;", "", "", "component1", "Ljava/util/Calendar;", "component2", "", "component3", "component4", "", "component5", "component6", "dataType", "time", "data", "deviceSource", ParamKey.deviceSn, "deviceId", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDataType", "()I", "b", "Ljava/util/Calendar;", "getTime", "()Ljava/util/Calendar;", "c", "[B", "getData", "()[B", GoogleApiAvailabilityLight.a, "getDeviceSource", "e", "Ljava/lang/String;", "getDeviceSn", "()Ljava/lang/String;", "f", "getDeviceId", "<init>", "(ILjava/util/Calendar;[BILjava/lang/String;Ljava/lang/String;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgSyncInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    public EcgSyncInfo(int i, @NotNull Calendar calendar, @NotNull byte[] bArr, int i2, @NotNull String str, @NotNull String str2) {
        this.dataType = i;
        this.time = calendar;
        this.data = bArr;
        this.deviceSource = i2;
        this.deviceSn = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ EcgSyncInfo copy$default(EcgSyncInfo ecgSyncInfo, int i, Calendar calendar, byte[] bArr, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ecgSyncInfo.dataType;
        }
        if ((i3 & 2) != 0) {
            calendar = ecgSyncInfo.time;
        }
        Calendar calendar2 = calendar;
        if ((i3 & 4) != 0) {
            bArr = ecgSyncInfo.data;
        }
        byte[] bArr2 = bArr;
        if ((i3 & 8) != 0) {
            i2 = ecgSyncInfo.deviceSource;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str = ecgSyncInfo.deviceSn;
        }
        String str3 = str;
        if ((i3 & 32) != 0) {
            str2 = ecgSyncInfo.deviceId;
        }
        return ecgSyncInfo.copy(i, calendar2, bArr2, i4, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Calendar getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final EcgSyncInfo copy(int dataType, @NotNull Calendar time, @NotNull byte[] data, int deviceSource, @NotNull String deviceSn, @NotNull String deviceId) {
        return new EcgSyncInfo(dataType, time, data, deviceSource, deviceSn, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgSyncInfo)) {
            return false;
        }
        EcgSyncInfo ecgSyncInfo = (EcgSyncInfo) other;
        return this.dataType == ecgSyncInfo.dataType && Intrinsics.areEqual(this.time, ecgSyncInfo.time) && Intrinsics.areEqual(this.data, ecgSyncInfo.data) && this.deviceSource == ecgSyncInfo.deviceSource && Intrinsics.areEqual(this.deviceSn, ecgSyncInfo.deviceSn) && Intrinsics.areEqual(this.deviceId, ecgSyncInfo.deviceId);
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final Calendar getTime() {
        return this.time;
    }

    public int hashCode() {
        int i = this.dataType * 31;
        Calendar calendar = this.time;
        int iHashCode = (i + (calendar != null ? calendar.hashCode() : 0)) * 31;
        byte[] bArr = this.data;
        int iHashCode2 = (((iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.deviceSource) * 31;
        String str = this.deviceSn;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.deviceId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EcgSyncInfo(dataType=" + this.dataType + ", time=" + this.time + ", data=" + Arrays.toString(this.data) + ", deviceSource=" + this.deviceSource + ", deviceSn=" + this.deviceSn + ", deviceId=" + this.deviceId + ")";
    }
}
