package com.xiaomi.fitness.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Je\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/model/BindHelloInfo;", "", "mode", "", "model", "", "mac", "randomMac", "phone_id", "node_id", "sn", "did", "deviceRandom", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()I", "setMode", "(I)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getMac", "setMac", "getRandomMac", "setRandomMac", "getPhone_id", "setPhone_id", "getNode_id", "setNode_id", "getSn", "setSn", "getDid", "setDid", "getDeviceRandom", "setDeviceRandom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindHelloInfo {

    @SerializedName("random_d")
    @NotNull
    private String deviceRandom;

    @NotNull
    private String did;

    @NotNull
    private String mac;
    private int mode;

    @NotNull
    private String model;

    @NotNull
    private String node_id;

    @NotNull
    private String phone_id;

    @Nullable
    private String randomMac;

    @NotNull
    private String sn;

    public BindHelloInfo(int i, @NotNull String model, @NotNull String mac, @Nullable String str, @NotNull String phone_id, @NotNull String node_id, @NotNull String sn, @NotNull String did, @NotNull String deviceRandom) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(phone_id, "phone_id");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceRandom, "deviceRandom");
        this.mode = i;
        this.model = model;
        this.mac = mac;
        this.randomMac = str;
        this.phone_id = phone_id;
        this.node_id = node_id;
        this.sn = sn;
        this.did = did;
        this.deviceRandom = deviceRandom;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRandomMac() {
        return this.randomMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPhone_id() {
        return this.phone_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceRandom() {
        return this.deviceRandom;
    }

    @NotNull
    public final BindHelloInfo copy(int mode, @NotNull String model, @NotNull String mac, @Nullable String randomMac, @NotNull String phone_id, @NotNull String node_id, @NotNull String sn, @NotNull String did, @NotNull String deviceRandom) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(phone_id, "phone_id");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceRandom, "deviceRandom");
        return new BindHelloInfo(mode, model, mac, randomMac, phone_id, node_id, sn, did, deviceRandom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindHelloInfo)) {
            return false;
        }
        BindHelloInfo bindHelloInfo = (BindHelloInfo) other;
        return this.mode == bindHelloInfo.mode && Intrinsics.areEqual(this.model, bindHelloInfo.model) && Intrinsics.areEqual(this.mac, bindHelloInfo.mac) && Intrinsics.areEqual(this.randomMac, bindHelloInfo.randomMac) && Intrinsics.areEqual(this.phone_id, bindHelloInfo.phone_id) && Intrinsics.areEqual(this.node_id, bindHelloInfo.node_id) && Intrinsics.areEqual(this.sn, bindHelloInfo.sn) && Intrinsics.areEqual(this.did, bindHelloInfo.did) && Intrinsics.areEqual(this.deviceRandom, bindHelloInfo.deviceRandom);
    }

    @NotNull
    public final String getDeviceRandom() {
        return this.deviceRandom;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    public final String getPhone_id() {
        return this.phone_id;
    }

    @Nullable
    public final String getRandomMac() {
        return this.randomMac;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.mode) * 31) + this.model.hashCode()) * 31) + this.mac.hashCode()) * 31;
        String str = this.randomMac;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.phone_id.hashCode()) * 31) + this.node_id.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.did.hashCode()) * 31) + this.deviceRandom.hashCode();
    }

    public final void setDeviceRandom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceRandom = str;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setNode_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.node_id = str;
    }

    public final void setPhone_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone_id = str;
    }

    public final void setRandomMac(@Nullable String str) {
        this.randomMac = str;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    @NotNull
    public String toString() {
        return "BindHelloInfo(mode=" + this.mode + ", model=" + this.model + ", mac=" + this.mac + ", randomMac=" + this.randomMac + ", phone_id=" + this.phone_id + ", node_id=" + this.node_id + ", sn=" + this.sn + ", did=" + this.did + ", deviceRandom=" + this.deviceRandom + ")";
    }

    public /* synthetic */ BindHelloInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, str4, str5, str6, str7, str8);
    }
}
