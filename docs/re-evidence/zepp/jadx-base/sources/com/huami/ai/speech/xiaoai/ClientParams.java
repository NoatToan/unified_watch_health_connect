package com.huami.ai.speech.xiaoai;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0014\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/huami/ai/speech/xiaoai/ClientParams;", "", "", "component1", "component2", "component3", "", "component4", "Lcom/huami/ai/speech/xiaoai/Location;", "component5", "Lcom/huami/ai/speech/xiaoai/DeviceInfo;", "component6", "", "component7", "clientID", "clientSecret", "clientOauthRedirectUrl", "capabilityVersion", "location", "deviceInfo", "authType", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getClientID", "()Ljava/lang/String;", "b", "getClientSecret", "c", "getClientOauthRedirectUrl", GoogleApiAvailabilityLight.a, "J", "getCapabilityVersion", "()J", "e", "Lcom/huami/ai/speech/xiaoai/Location;", "getLocation", "()Lcom/huami/ai/speech/xiaoai/Location;", "f", "Lcom/huami/ai/speech/xiaoai/DeviceInfo;", "getDeviceInfo", "()Lcom/huami/ai/speech/xiaoai/DeviceInfo;", "g", LogUtil.I, "getAuthType", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/huami/ai/speech/xiaoai/Location;Lcom/huami/ai/speech/xiaoai/DeviceInfo;I)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ClientParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String clientID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String clientSecret;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String clientOauthRedirectUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long capabilityVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Location location;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int authType;

    public ClientParams(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @Nullable Location location, @NotNull DeviceInfo deviceInfo, int i) {
        this.clientID = str;
        this.clientSecret = str2;
        this.clientOauthRedirectUrl = str3;
        this.capabilityVersion = j;
        this.location = location;
        this.deviceInfo = deviceInfo;
        this.authType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientID() {
        return this.clientID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientOauthRedirectUrl() {
        return this.clientOauthRedirectUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCapabilityVersion() {
        return this.capabilityVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAuthType() {
        return this.authType;
    }

    @NotNull
    public final ClientParams copy(@NotNull String clientID, @NotNull String clientSecret, @NotNull String clientOauthRedirectUrl, long capabilityVersion, @Nullable Location location, @NotNull DeviceInfo deviceInfo, int authType) {
        return new ClientParams(clientID, clientSecret, clientOauthRedirectUrl, capabilityVersion, location, deviceInfo, authType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientParams)) {
            return false;
        }
        ClientParams clientParams = (ClientParams) other;
        return Intrinsics.areEqual(this.clientID, clientParams.clientID) && Intrinsics.areEqual(this.clientSecret, clientParams.clientSecret) && Intrinsics.areEqual(this.clientOauthRedirectUrl, clientParams.clientOauthRedirectUrl) && this.capabilityVersion == clientParams.capabilityVersion && Intrinsics.areEqual(this.location, clientParams.location) && Intrinsics.areEqual(this.deviceInfo, clientParams.deviceInfo) && this.authType == clientParams.authType;
    }

    public final int getAuthType() {
        return this.authType;
    }

    public final long getCapabilityVersion() {
        return this.capabilityVersion;
    }

    @NotNull
    public final String getClientID() {
        return this.clientID;
    }

    @NotNull
    public final String getClientOauthRedirectUrl() {
        return this.clientOauthRedirectUrl;
    }

    @NotNull
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    public final Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iHashCode = ((((((this.clientID.hashCode() * 31) + this.clientSecret.hashCode()) * 31) + this.clientOauthRedirectUrl.hashCode()) * 31) + b.a(this.capabilityVersion)) * 31;
        Location location = this.location;
        return ((((iHashCode + (location == null ? 0 : location.hashCode())) * 31) + this.deviceInfo.hashCode()) * 31) + this.authType;
    }

    @NotNull
    public String toString() {
        return "ClientParams(clientID=" + this.clientID + ", clientSecret=" + this.clientSecret + ", clientOauthRedirectUrl=" + this.clientOauthRedirectUrl + ", capabilityVersion=" + this.capabilityVersion + ", location=" + this.location + ", deviceInfo=" + this.deviceInfo + ", authType=" + this.authType + ')';
    }

    public /* synthetic */ ClientParams(String str, String str2, String str3, long j, Location location, DeviceInfo deviceInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, (i2 & 16) != 0 ? null : location, deviceInfo, i);
    }
}
