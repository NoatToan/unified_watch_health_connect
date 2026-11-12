package com.huami.sky.lib.entity;

import com.huami.sky.lib.constant.WebConstant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÆ\u0003J:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/sky/lib/entity/DeviceStatus;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "", "component4", WebConstant.QueryParam.CLIP_ID, "status", "source", ParamKey.createTime, "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)Lcom/huami/sky/lib/entity/DeviceStatus;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getClipId", "()Ljava/lang/String;", "getStatus", "Ljava/lang/Integer;", "getSource", "J", "getCreateTime", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceStatus {

    @NotNull
    private final String clipId;
    private final long createTime;

    @Nullable
    private final Integer source;

    @NotNull
    private final String status;

    public DeviceStatus(@NotNull String str, @NotNull String str2, @Nullable Integer num, long j) {
        this.clipId = str;
        this.status = str2;
        this.source = num;
        this.createTime = j;
    }

    public static /* synthetic */ DeviceStatus copy$default(DeviceStatus deviceStatus, String str, String str2, Integer num, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceStatus.clipId;
        }
        if ((i & 2) != 0) {
            str2 = deviceStatus.status;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = deviceStatus.source;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            j = deviceStatus.createTime;
        }
        return deviceStatus.copy(str, str3, num2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClipId() {
        return this.clipId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final DeviceStatus copy(@NotNull String clipId, @NotNull String status, @Nullable Integer source, long createTime) {
        return new DeviceStatus(clipId, status, source, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) other;
        return Intrinsics.areEqual(this.clipId, deviceStatus.clipId) && Intrinsics.areEqual(this.status, deviceStatus.status) && Intrinsics.areEqual(this.source, deviceStatus.source) && this.createTime == deviceStatus.createTime;
    }

    @NotNull
    public final String getClipId() {
        return this.clipId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getSource() {
        return this.source;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((this.clipId.hashCode() * 31) + this.status.hashCode()) * 31;
        Integer num = this.source;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + b.a(this.createTime);
    }

    @NotNull
    public String toString() {
        return "DeviceStatus(clipId=" + this.clipId + ", status=" + this.status + ", source=" + this.source + ", createTime=" + this.createTime + ")";
    }
}
