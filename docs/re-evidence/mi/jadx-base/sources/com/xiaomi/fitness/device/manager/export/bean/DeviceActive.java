package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import defpackage.xpd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;", "", "userInfo", "Lcom/google/gson/JsonObject;", "devInfo", "appInfo", "positionInfo", "eventData", "", "<init>", "(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "getUserInfo", "()Lcom/google/gson/JsonObject;", "setUserInfo", "(Lcom/google/gson/JsonObject;)V", "getDevInfo", "setDevInfo", "getAppInfo", "setAppInfo", "getPositionInfo", "setPositionInfo", "getEventData", "()Ljava/lang/String;", "setEventData", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceActive {

    @SerializedName("app_info")
    @NotNull
    private JsonObject appInfo;

    @SerializedName("dev_info")
    @Nullable
    private JsonObject devInfo;

    @SerializedName("event_data")
    @Nullable
    private String eventData;

    @SerializedName("position_info")
    @NotNull
    private JsonObject positionInfo;

    @SerializedName("user_info")
    @NotNull
    private JsonObject userInfo;

    public DeviceActive() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DeviceActive copy$default(DeviceActive deviceActive, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = deviceActive.userInfo;
        }
        if ((i & 2) != 0) {
            jsonObject2 = deviceActive.devInfo;
        }
        JsonObject jsonObject5 = jsonObject2;
        if ((i & 4) != 0) {
            jsonObject3 = deviceActive.appInfo;
        }
        JsonObject jsonObject6 = jsonObject3;
        if ((i & 8) != 0) {
            jsonObject4 = deviceActive.positionInfo;
        }
        JsonObject jsonObject7 = jsonObject4;
        if ((i & 16) != 0) {
            str = deviceActive.eventData;
        }
        return deviceActive.copy(jsonObject, jsonObject5, jsonObject6, jsonObject7, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getDevInfo() {
        return this.devInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getAppInfo() {
        return this.appInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getPositionInfo() {
        return this.positionInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEventData() {
        return this.eventData;
    }

    @NotNull
    public final DeviceActive copy(@NotNull JsonObject userInfo, @Nullable JsonObject devInfo, @NotNull JsonObject appInfo, @NotNull JsonObject positionInfo, @Nullable String eventData) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        return new DeviceActive(userInfo, devInfo, appInfo, positionInfo, eventData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceActive)) {
            return false;
        }
        DeviceActive deviceActive = (DeviceActive) other;
        return Intrinsics.areEqual(this.userInfo, deviceActive.userInfo) && Intrinsics.areEqual(this.devInfo, deviceActive.devInfo) && Intrinsics.areEqual(this.appInfo, deviceActive.appInfo) && Intrinsics.areEqual(this.positionInfo, deviceActive.positionInfo) && Intrinsics.areEqual(this.eventData, deviceActive.eventData);
    }

    @NotNull
    public final JsonObject getAppInfo() {
        return this.appInfo;
    }

    @Nullable
    public final JsonObject getDevInfo() {
        return this.devInfo;
    }

    @Nullable
    public final String getEventData() {
        return this.eventData;
    }

    @NotNull
    public final JsonObject getPositionInfo() {
        return this.positionInfo;
    }

    @NotNull
    public final JsonObject getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = this.userInfo.hashCode() * 31;
        JsonObject jsonObject = this.devInfo;
        int iHashCode2 = (((((iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + this.appInfo.hashCode()) * 31) + this.positionInfo.hashCode()) * 31;
        String str = this.eventData;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setAppInfo(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.appInfo = jsonObject;
    }

    public final void setDevInfo(@Nullable JsonObject jsonObject) {
        this.devInfo = jsonObject;
    }

    public final void setEventData(@Nullable String str) {
        this.eventData = str;
    }

    public final void setPositionInfo(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.positionInfo = jsonObject;
    }

    public final void setUserInfo(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.userInfo = jsonObject;
    }

    @NotNull
    public String toString() {
        return "DeviceActive(userInfo=" + this.userInfo + ", devInfo=" + this.devInfo + ", appInfo=" + this.appInfo + ", positionInfo=" + this.positionInfo + ", eventData=" + this.eventData + ")";
    }

    public DeviceActive(@NotNull JsonObject userInfo, @Nullable JsonObject jsonObject, @NotNull JsonObject appInfo, @NotNull JsonObject positionInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        this.userInfo = userInfo;
        this.devInfo = jsonObject;
        this.appInfo = appInfo;
        this.positionInfo = positionInfo;
        this.eventData = str;
    }

    public /* synthetic */ DeviceActive(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? xpd.b(new UserInfoData(null, 0, 3, null)) : jsonObject, (i & 2) != 0 ? new JsonObject() : jsonObject2, (i & 4) != 0 ? xpd.b(new AppInfoData(null, null, null, null, 15, null)) : jsonObject3, (i & 8) != 0 ? xpd.b(new IpData(null, 1, null)) : jsonObject4, (i & 16) != 0 ? "" : str);
    }
}
