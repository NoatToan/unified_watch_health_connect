package com.xiaomi.eco;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006("}, d2 = {"Lcom/xiaomi/eco/EcoVerifyBindInfo;", "", "deviceKey", "", "oobCode", "", "bindKey", "signShareData", "encShareData", "shaTokenKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceKey", "()Ljava/lang/String;", "setDeviceKey", "(Ljava/lang/String;)V", "getOobCode", "()I", "setOobCode", "(I)V", "getBindKey", "setBindKey", "getSignShareData", "setSignShareData", "getEncShareData", "setEncShareData", "getShaTokenKey", "setShaTokenKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoVerifyBindInfo {

    @SerializedName("bind_key")
    @NotNull
    private String bindKey;

    @SerializedName("device_key")
    @NotNull
    private String deviceKey;

    @Nullable
    private String encShareData;

    @SerializedName("oob_code")
    private int oobCode;

    @Nullable
    private String shaTokenKey;

    @Nullable
    private String signShareData;

    public EcoVerifyBindInfo(@NotNull String deviceKey, int i, @NotNull String bindKey, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        this.deviceKey = deviceKey;
        this.oobCode = i;
        this.bindKey = bindKey;
        this.signShareData = str;
        this.encShareData = str2;
        this.shaTokenKey = str3;
    }

    public static /* synthetic */ EcoVerifyBindInfo copy$default(EcoVerifyBindInfo ecoVerifyBindInfo, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ecoVerifyBindInfo.deviceKey;
        }
        if ((i2 & 2) != 0) {
            i = ecoVerifyBindInfo.oobCode;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = ecoVerifyBindInfo.bindKey;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = ecoVerifyBindInfo.signShareData;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = ecoVerifyBindInfo.encShareData;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = ecoVerifyBindInfo.shaTokenKey;
        }
        return ecoVerifyBindInfo.copy(str, i3, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceKey() {
        return this.deviceKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOobCode() {
        return this.oobCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignShareData() {
        return this.signShareData;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEncShareData() {
        return this.encShareData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShaTokenKey() {
        return this.shaTokenKey;
    }

    @NotNull
    public final EcoVerifyBindInfo copy(@NotNull String deviceKey, int oobCode, @NotNull String bindKey, @Nullable String signShareData, @Nullable String encShareData, @Nullable String shaTokenKey) {
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        return new EcoVerifyBindInfo(deviceKey, oobCode, bindKey, signShareData, encShareData, shaTokenKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoVerifyBindInfo)) {
            return false;
        }
        EcoVerifyBindInfo ecoVerifyBindInfo = (EcoVerifyBindInfo) other;
        return Intrinsics.areEqual(this.deviceKey, ecoVerifyBindInfo.deviceKey) && this.oobCode == ecoVerifyBindInfo.oobCode && Intrinsics.areEqual(this.bindKey, ecoVerifyBindInfo.bindKey) && Intrinsics.areEqual(this.signShareData, ecoVerifyBindInfo.signShareData) && Intrinsics.areEqual(this.encShareData, ecoVerifyBindInfo.encShareData) && Intrinsics.areEqual(this.shaTokenKey, ecoVerifyBindInfo.shaTokenKey);
    }

    @NotNull
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final String getDeviceKey() {
        return this.deviceKey;
    }

    @Nullable
    public final String getEncShareData() {
        return this.encShareData;
    }

    public final int getOobCode() {
        return this.oobCode;
    }

    @Nullable
    public final String getShaTokenKey() {
        return this.shaTokenKey;
    }

    @Nullable
    public final String getSignShareData() {
        return this.signShareData;
    }

    public int hashCode() {
        int iHashCode = ((((this.deviceKey.hashCode() * 31) + Integer.hashCode(this.oobCode)) * 31) + this.bindKey.hashCode()) * 31;
        String str = this.signShareData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encShareData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shaTokenKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBindKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindKey = str;
    }

    public final void setDeviceKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceKey = str;
    }

    public final void setEncShareData(@Nullable String str) {
        this.encShareData = str;
    }

    public final void setOobCode(int i) {
        this.oobCode = i;
    }

    public final void setShaTokenKey(@Nullable String str) {
        this.shaTokenKey = str;
    }

    public final void setSignShareData(@Nullable String str) {
        this.signShareData = str;
    }

    @NotNull
    public String toString() {
        return "EcoVerifyBindInfo(deviceKey=" + this.deviceKey + ", oobCode=" + this.oobCode + ", bindKey=" + this.bindKey + ", signShareData=" + this.signShareData + ", encShareData=" + this.encShareData + ", shaTokenKey=" + this.shaTokenKey + ")";
    }

    public /* synthetic */ EcoVerifyBindInfo(String str, int i, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5);
    }
}
