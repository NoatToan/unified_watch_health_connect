package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import com.miui.circulate.device.api.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/IpData;", "", DeviceInfo.Builder.PrivateDataKey.IP, "", "<init>", "(Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "setIp", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IpData {

    @SerializedName(DeviceInfo.Builder.PrivateDataKey.IP)
    @Nullable
    private String ip;

    /* JADX WARN: Multi-variable type inference failed */
    public IpData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IpData copy$default(IpData ipData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipData.ip;
        }
        return ipData.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @NotNull
    public final IpData copy(@Nullable String ip) {
        return new IpData(ip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IpData) && Intrinsics.areEqual(this.ip, ((IpData) other).ip);
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    public int hashCode() {
        String str = this.ip;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setIp(@Nullable String str) {
        this.ip = str;
    }

    @NotNull
    public String toString() {
        return "IpData(ip=" + this.ip + ")";
    }

    public IpData(@Nullable String str) {
        this.ip = str;
    }

    public /* synthetic */ IpData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
