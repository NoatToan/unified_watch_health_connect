package com.xiaomi.fitness.health.ecg.web;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/web/EcgAuthData;", "", "openId", "", "hlwAccessToken", "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getOpenId", "()Ljava/lang/String;", "getHlwAccessToken", "getErrorCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgAuthData {

    @SerializedName("errorCode")
    private final int errorCode;

    @SerializedName("hlwAccessToken")
    @NotNull
    private final String hlwAccessToken;

    @SerializedName("openId")
    @NotNull
    private final String openId;

    public EcgAuthData(@NotNull String openId, @NotNull String hlwAccessToken, int i) {
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(hlwAccessToken, "hlwAccessToken");
        this.openId = openId;
        this.hlwAccessToken = hlwAccessToken;
        this.errorCode = i;
    }

    public static /* synthetic */ EcgAuthData copy$default(EcgAuthData ecgAuthData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ecgAuthData.openId;
        }
        if ((i2 & 2) != 0) {
            str2 = ecgAuthData.hlwAccessToken;
        }
        if ((i2 & 4) != 0) {
            i = ecgAuthData.errorCode;
        }
        return ecgAuthData.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHlwAccessToken() {
        return this.hlwAccessToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final EcgAuthData copy(@NotNull String openId, @NotNull String hlwAccessToken, int errorCode) {
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(hlwAccessToken, "hlwAccessToken");
        return new EcgAuthData(openId, hlwAccessToken, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgAuthData)) {
            return false;
        }
        EcgAuthData ecgAuthData = (EcgAuthData) other;
        return Intrinsics.areEqual(this.openId, ecgAuthData.openId) && Intrinsics.areEqual(this.hlwAccessToken, ecgAuthData.hlwAccessToken) && this.errorCode == ecgAuthData.errorCode;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getHlwAccessToken() {
        return this.hlwAccessToken;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    public int hashCode() {
        return (((this.openId.hashCode() * 31) + this.hlwAccessToken.hashCode()) * 31) + Integer.hashCode(this.errorCode);
    }

    @NotNull
    public String toString() {
        return "EcgAuthData(openId=" + this.openId + ", hlwAccessToken=" + this.hlwAccessToken + ", errorCode=" + this.errorCode + ")";
    }

    public /* synthetic */ EcgAuthData(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i);
    }
}
