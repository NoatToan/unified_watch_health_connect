package com.huami.heartrate.repository.entity;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/heartrate/repository/entity/RemoteHeartRateItem;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "type", "generatedTime", "deviceSource", "timeZone", ParamKey.heartRateData, "deviceId", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getType", "()I", "J", "getGeneratedTime", "()J", "getDeviceSource", "Ljava/lang/String;", "getTimeZone", "()Ljava/lang/String;", "getHeartRateData", "getDeviceId", "<init>", "(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RemoteHeartRateItem {

    @NotNull
    private final String deviceId;
    private final int deviceSource;
    private final long generatedTime;

    @NotNull
    private final String heartRateData;

    @NotNull
    private final String timeZone;
    private final int type;

    public RemoteHeartRateItem(int i, long j, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.type = i;
        this.generatedTime = j;
        this.deviceSource = i2;
        this.timeZone = str;
        this.heartRateData = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ RemoteHeartRateItem copy$default(RemoteHeartRateItem remoteHeartRateItem, int i, long j, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = remoteHeartRateItem.type;
        }
        if ((i3 & 2) != 0) {
            j = remoteHeartRateItem.generatedTime;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i2 = remoteHeartRateItem.deviceSource;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str = remoteHeartRateItem.timeZone;
        }
        String str4 = str;
        if ((i3 & 16) != 0) {
            str2 = remoteHeartRateItem.heartRateData;
        }
        String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = remoteHeartRateItem.deviceId;
        }
        return remoteHeartRateItem.copy(i, j2, i4, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeartRateData() {
        return this.heartRateData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final RemoteHeartRateItem copy(int type, long generatedTime, int deviceSource, @NotNull String timeZone, @NotNull String heartRateData, @NotNull String deviceId) {
        return new RemoteHeartRateItem(type, generatedTime, deviceSource, timeZone, heartRateData, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteHeartRateItem)) {
            return false;
        }
        RemoteHeartRateItem remoteHeartRateItem = (RemoteHeartRateItem) other;
        return this.type == remoteHeartRateItem.type && this.generatedTime == remoteHeartRateItem.generatedTime && this.deviceSource == remoteHeartRateItem.deviceSource && Intrinsics.areEqual(this.timeZone, remoteHeartRateItem.timeZone) && Intrinsics.areEqual(this.heartRateData, remoteHeartRateItem.heartRateData) && Intrinsics.areEqual(this.deviceId, remoteHeartRateItem.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    @NotNull
    public final String getHeartRateData() {
        return this.heartRateData;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type * 31) + b.a(this.generatedTime)) * 31) + this.deviceSource) * 31) + this.timeZone.hashCode()) * 31) + this.heartRateData.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "RemoteHeartRateItem(type=" + this.type + ", generatedTime=" + this.generatedTime + ", deviceSource=" + this.deviceSource + ", timeZone=" + this.timeZone + ", heartRateData=" + this.heartRateData + ", deviceId=" + this.deviceId + ")";
    }
}
