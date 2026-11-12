package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\u008b\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0010HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/HuamiTrackUpData;", "", "device_id", "", "sn", "model", "device_version", "sku", "phone_model", OneTrack.Param.INSTANCE_ID, "oaid", "os_version", "app_version", "user_id", "event_data", "event_timezone", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDevice_id", "()Ljava/lang/String;", "setDevice_id", "(Ljava/lang/String;)V", "getSn", "setSn", "getModel", "setModel", "getDevice_version", "setDevice_version", "getSku", "setSku", "getPhone_model", "setPhone_model", "getInstance_id", "setInstance_id", "getOaid", "setOaid", "getOs_version", "setOs_version", "getApp_version", "setApp_version", "getUser_id", "setUser_id", "getEvent_data", "setEvent_data", "getEvent_timezone", "()I", "setEvent_timezone", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HuamiTrackUpData {

    @SerializedName("app_version")
    @NotNull
    private String app_version;

    @SerializedName("device_id")
    @NotNull
    private String device_id;

    @SerializedName("device_version")
    @NotNull
    private String device_version;

    @SerializedName("event_data")
    @NotNull
    private String event_data;

    @SerializedName("event_timezone")
    private int event_timezone;

    @SerializedName(OneTrack.Param.INSTANCE_ID)
    @NotNull
    private String instance_id;

    @SerializedName("model")
    @NotNull
    private String model;

    @SerializedName("oaid")
    @NotNull
    private String oaid;

    @SerializedName("os_version")
    @NotNull
    private String os_version;

    @SerializedName("phone_model")
    @NotNull
    private String phone_model;

    @SerializedName("sku")
    @NotNull
    private String sku;

    @SerializedName("sn")
    @NotNull
    private String sn;

    @SerializedName("user_id")
    @NotNull
    private String user_id;

    public HuamiTrackUpData(@NotNull String device_id, @NotNull String sn, @NotNull String model, @NotNull String device_version, @NotNull String sku, @NotNull String phone_model, @NotNull String instance_id, @NotNull String oaid, @NotNull String os_version, @NotNull String app_version, @NotNull String user_id, @NotNull String event_data, int i) {
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(device_version, "device_version");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(phone_model, "phone_model");
        Intrinsics.checkNotNullParameter(instance_id, "instance_id");
        Intrinsics.checkNotNullParameter(oaid, "oaid");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(event_data, "event_data");
        this.device_id = device_id;
        this.sn = sn;
        this.model = model;
        this.device_version = device_version;
        this.sku = sku;
        this.phone_model = phone_model;
        this.instance_id = instance_id;
        this.oaid = oaid;
        this.os_version = os_version;
        this.app_version = app_version;
        this.user_id = user_id;
        this.event_data = event_data;
        this.event_timezone = i;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEvent_data() {
        return this.event_data;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getEvent_timezone() {
        return this.event_timezone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDevice_version() {
        return this.device_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhone_model() {
        return this.phone_model;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstance_id() {
        return this.instance_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOaid() {
        return this.oaid;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOs_version() {
        return this.os_version;
    }

    @NotNull
    public final HuamiTrackUpData copy(@NotNull String device_id, @NotNull String sn, @NotNull String model, @NotNull String device_version, @NotNull String sku, @NotNull String phone_model, @NotNull String instance_id, @NotNull String oaid, @NotNull String os_version, @NotNull String app_version, @NotNull String user_id, @NotNull String event_data, int event_timezone) {
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(device_version, "device_version");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(phone_model, "phone_model");
        Intrinsics.checkNotNullParameter(instance_id, "instance_id");
        Intrinsics.checkNotNullParameter(oaid, "oaid");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(event_data, "event_data");
        return new HuamiTrackUpData(device_id, sn, model, device_version, sku, phone_model, instance_id, oaid, os_version, app_version, user_id, event_data, event_timezone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuamiTrackUpData)) {
            return false;
        }
        HuamiTrackUpData huamiTrackUpData = (HuamiTrackUpData) other;
        return Intrinsics.areEqual(this.device_id, huamiTrackUpData.device_id) && Intrinsics.areEqual(this.sn, huamiTrackUpData.sn) && Intrinsics.areEqual(this.model, huamiTrackUpData.model) && Intrinsics.areEqual(this.device_version, huamiTrackUpData.device_version) && Intrinsics.areEqual(this.sku, huamiTrackUpData.sku) && Intrinsics.areEqual(this.phone_model, huamiTrackUpData.phone_model) && Intrinsics.areEqual(this.instance_id, huamiTrackUpData.instance_id) && Intrinsics.areEqual(this.oaid, huamiTrackUpData.oaid) && Intrinsics.areEqual(this.os_version, huamiTrackUpData.os_version) && Intrinsics.areEqual(this.app_version, huamiTrackUpData.app_version) && Intrinsics.areEqual(this.user_id, huamiTrackUpData.user_id) && Intrinsics.areEqual(this.event_data, huamiTrackUpData.event_data) && this.event_timezone == huamiTrackUpData.event_timezone;
    }

    @NotNull
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    public final String getDevice_version() {
        return this.device_version;
    }

    @NotNull
    public final String getEvent_data() {
        return this.event_data;
    }

    public final int getEvent_timezone() {
        return this.event_timezone;
    }

    @NotNull
    public final String getInstance_id() {
        return this.instance_id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOaid() {
        return this.oaid;
    }

    @NotNull
    public final String getOs_version() {
        return this.os_version;
    }

    @NotNull
    public final String getPhone_model() {
        return this.phone_model;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.device_id.hashCode() * 31) + this.sn.hashCode()) * 31) + this.model.hashCode()) * 31) + this.device_version.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.phone_model.hashCode()) * 31) + this.instance_id.hashCode()) * 31) + this.oaid.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.app_version.hashCode()) * 31) + this.user_id.hashCode()) * 31) + this.event_data.hashCode()) * 31) + Integer.hashCode(this.event_timezone);
    }

    public final void setApp_version(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_version = str;
    }

    public final void setDevice_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_id = str;
    }

    public final void setDevice_version(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_version = str;
    }

    public final void setEvent_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event_data = str;
    }

    public final void setEvent_timezone(int i) {
        this.event_timezone = i;
    }

    public final void setInstance_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.instance_id = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOaid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oaid = str;
    }

    public final void setOs_version(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_version = str;
    }

    public final void setPhone_model(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone_model = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final void setUser_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.user_id = str;
    }

    @NotNull
    public String toString() {
        return "HuamiTrackUpData(device_id=" + this.device_id + ", sn=" + this.sn + ", model=" + this.model + ", device_version=" + this.device_version + ", sku=" + this.sku + ", phone_model=" + this.phone_model + ", instance_id=" + this.instance_id + ", oaid=" + this.oaid + ", os_version=" + this.os_version + ", app_version=" + this.app_version + ", user_id=" + this.user_id + ", event_data=" + this.event_data + ", event_timezone=" + this.event_timezone + ")";
    }
}
