package com.huami.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/DeviceAuthParams;", "Lcom/huami/account/XiaoaiAuthParams;", "", "component1", "component2", "tpacType", "deviceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTpacType", "()Ljava/lang/String;", "b", "getDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceAuthParams extends XiaoaiAuthParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tpacType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    public DeviceAuthParams(@NotNull String str, @NotNull String str2) {
        super(null);
        this.tpacType = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ DeviceAuthParams copy$default(DeviceAuthParams deviceAuthParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceAuthParams.tpacType;
        }
        if ((i & 2) != 0) {
            str2 = deviceAuthParams.deviceId;
        }
        return deviceAuthParams.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTpacType() {
        return this.tpacType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final DeviceAuthParams copy(@NotNull String tpacType, @NotNull String deviceId) {
        return new DeviceAuthParams(tpacType, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceAuthParams)) {
            return false;
        }
        DeviceAuthParams deviceAuthParams = (DeviceAuthParams) other;
        return Intrinsics.areEqual(this.tpacType, deviceAuthParams.tpacType) && Intrinsics.areEqual(this.deviceId, deviceAuthParams.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getTpacType() {
        return this.tpacType;
    }

    public int hashCode() {
        return (this.tpacType.hashCode() * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceAuthParams(tpacType=" + this.tpacType + ", deviceId=" + this.deviceId + ")";
    }
}
