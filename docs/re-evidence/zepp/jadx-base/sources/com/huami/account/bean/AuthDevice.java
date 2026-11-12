package com.huami.account.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/account/bean/AuthDevice;", "", "Lcom/huami/account/bean/AuthDeviceSource;", "component1", "", "component2", "component3", "source", "serialNumber", "deviceId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/account/bean/AuthDeviceSource;", "getSource", "()Lcom/huami/account/bean/AuthDeviceSource;", "b", "Ljava/lang/String;", "getSerialNumber", "()Ljava/lang/String;", "c", "getDeviceId", "<init>", "(Lcom/huami/account/bean/AuthDeviceSource;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final AuthDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    public AuthDevice(@NotNull AuthDeviceSource authDeviceSource, @NotNull String str, @NotNull String str2) {
        this.source = authDeviceSource;
        this.serialNumber = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ AuthDevice copy$default(AuthDevice authDevice, AuthDeviceSource authDeviceSource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            authDeviceSource = authDevice.source;
        }
        if ((i & 2) != 0) {
            str = authDevice.serialNumber;
        }
        if ((i & 4) != 0) {
            str2 = authDevice.deviceId;
        }
        return authDevice.copy(authDeviceSource, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthDeviceSource getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AuthDevice copy(@NotNull AuthDeviceSource source, @NotNull String serialNumber, @NotNull String deviceId) {
        return new AuthDevice(source, serialNumber, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthDevice)) {
            return false;
        }
        AuthDevice authDevice = (AuthDevice) other;
        return Intrinsics.areEqual(this.source, authDevice.source) && Intrinsics.areEqual(this.serialNumber, authDevice.serialNumber) && Intrinsics.areEqual(this.deviceId, authDevice.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final AuthDeviceSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((this.source.hashCode() * 31) + this.serialNumber.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthDevice(source=" + this.source + ", serialNumber=" + this.serialNumber + ", deviceId=" + this.deviceId + ")";
    }
}
