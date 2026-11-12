package com.huami.stress.domain.data.local.bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Entity(tableName = "SingleStress")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003Jc\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0012\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0013\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\u0015\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "timestamp", "userId", "value", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "syncStatus", "copy", "toString", "hashCode", "other", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", LogUtil.I, "getValue", "()I", GoogleApiAvailabilityLight.a, "getDeviceSource", "e", "getDeviceType", "f", "getDeviceId", "g", "getDeviceMac", "h", "getDeviceSn", "i", "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "<init>", "(JLjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleStressDaoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @ColumnInfo(name = "timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "userId")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "value")
    private final int value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceSource")
    private final int deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceType")
    private final int deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceId")
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = ParamKey.deviceMac)
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = ParamKey.deviceSn)
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "syncStatus")
    private boolean syncStatus;

    public SingleStressDaoBean(long j, @NotNull String str, int i, int i2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        this.timestamp = j;
        this.userId = str;
        this.value = i;
        this.deviceSource = i2;
        this.deviceType = i3;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.syncStatus = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final SingleStressDaoBean copy(long timestamp, @NotNull String userId, int value, int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, boolean syncStatus) {
        return new SingleStressDaoBean(timestamp, userId, value, deviceSource, deviceType, deviceId, deviceMac, deviceSn, syncStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleStressDaoBean)) {
            return false;
        }
        SingleStressDaoBean singleStressDaoBean = (SingleStressDaoBean) other;
        return this.timestamp == singleStressDaoBean.timestamp && Intrinsics.areEqual(this.userId, singleStressDaoBean.userId) && this.value == singleStressDaoBean.value && this.deviceSource == singleStressDaoBean.deviceSource && this.deviceType == singleStressDaoBean.deviceType && Intrinsics.areEqual(this.deviceId, singleStressDaoBean.deviceId) && Intrinsics.areEqual(this.deviceMac, singleStressDaoBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleStressDaoBean.deviceSn) && this.syncStatus == singleStressDaoBean.syncStatus;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        int iA = ((((((((((((((b.a(this.timestamp) * 31) + this.userId.hashCode()) * 31) + this.value) * 31) + this.deviceSource) * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31;
        boolean z = this.syncStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "SingleStressDaoBean(timestamp=" + this.timestamp + ", userId=" + this.userId + ", value=" + this.value + ", deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", syncStatus=" + this.syncStatus + ')';
    }
}
