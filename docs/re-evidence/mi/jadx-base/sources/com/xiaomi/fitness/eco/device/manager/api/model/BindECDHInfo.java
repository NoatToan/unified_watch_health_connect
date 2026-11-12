package com.xiaomi.fitness.eco.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/api/model/BindECDHInfo;", "", "bindIndex", "", "bindDid", "devicePublicKey", "deviceSign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindIndex", "()Ljava/lang/String;", "setBindIndex", "(Ljava/lang/String;)V", "getBindDid", "setBindDid", "getDevicePublicKey", "setDevicePublicKey", "getDeviceSign", "setDeviceSign", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindECDHInfo {

    @SerializedName("bind_did")
    @NotNull
    private String bindDid;

    @SerializedName("bind_index")
    @NotNull
    private String bindIndex;

    @SerializedName("pub_d")
    @NotNull
    private String devicePublicKey;

    @SerializedName("sign_d")
    @NotNull
    private String deviceSign;

    public BindECDHInfo(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String devicePublicKey, @NotNull String deviceSign) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(devicePublicKey, "devicePublicKey");
        Intrinsics.checkNotNullParameter(deviceSign, "deviceSign");
        this.bindIndex = bindIndex;
        this.bindDid = bindDid;
        this.devicePublicKey = devicePublicKey;
        this.deviceSign = deviceSign;
    }

    public static /* synthetic */ BindECDHInfo copy$default(BindECDHInfo bindECDHInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindECDHInfo.bindIndex;
        }
        if ((i & 2) != 0) {
            str2 = bindECDHInfo.bindDid;
        }
        if ((i & 4) != 0) {
            str3 = bindECDHInfo.devicePublicKey;
        }
        if ((i & 8) != 0) {
            str4 = bindECDHInfo.deviceSign;
        }
        return bindECDHInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevicePublicKey() {
        return this.devicePublicKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceSign() {
        return this.deviceSign;
    }

    @NotNull
    public final BindECDHInfo copy(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String devicePublicKey, @NotNull String deviceSign) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(devicePublicKey, "devicePublicKey");
        Intrinsics.checkNotNullParameter(deviceSign, "deviceSign");
        return new BindECDHInfo(bindIndex, bindDid, devicePublicKey, deviceSign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindECDHInfo)) {
            return false;
        }
        BindECDHInfo bindECDHInfo = (BindECDHInfo) other;
        return Intrinsics.areEqual(this.bindIndex, bindECDHInfo.bindIndex) && Intrinsics.areEqual(this.bindDid, bindECDHInfo.bindDid) && Intrinsics.areEqual(this.devicePublicKey, bindECDHInfo.devicePublicKey) && Intrinsics.areEqual(this.deviceSign, bindECDHInfo.deviceSign);
    }

    @NotNull
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    public final String getDevicePublicKey() {
        return this.devicePublicKey;
    }

    @NotNull
    public final String getDeviceSign() {
        return this.deviceSign;
    }

    public int hashCode() {
        return (((((this.bindIndex.hashCode() * 31) + this.bindDid.hashCode()) * 31) + this.devicePublicKey.hashCode()) * 31) + this.deviceSign.hashCode();
    }

    public final void setBindDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindDid = str;
    }

    public final void setBindIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindIndex = str;
    }

    public final void setDevicePublicKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.devicePublicKey = str;
    }

    public final void setDeviceSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceSign = str;
    }

    @NotNull
    public String toString() {
        return "BindECDHInfo(bindIndex=" + this.bindIndex + ", bindDid=" + this.bindDid + ", devicePublicKey=" + this.devicePublicKey + ", deviceSign=" + this.deviceSign + ")";
    }
}
