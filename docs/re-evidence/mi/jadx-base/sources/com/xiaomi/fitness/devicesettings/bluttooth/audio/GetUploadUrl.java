package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "", "url", "", "name", "method", "expiresTime", "", "secretKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getName", "getMethod", "getExpiresTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSecretKey", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetUploadUrl {

    @SerializedName("expires_time")
    @Nullable
    private final Long expiresTime;

    @Nullable
    private final String method;

    @SerializedName("obj_name")
    @Nullable
    private final String name;

    @SerializedName("secret_key")
    @Nullable
    private final String secretKey;

    @Nullable
    private final String url;

    public GetUploadUrl(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable String str4) {
        this.url = str;
        this.name = str2;
        this.method = str3;
        this.expiresTime = l;
        this.secretKey = str4;
    }

    public static /* synthetic */ GetUploadUrl copy$default(GetUploadUrl getUploadUrl, String str, String str2, String str3, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUploadUrl.url;
        }
        if ((i & 2) != 0) {
            str2 = getUploadUrl.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = getUploadUrl.method;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            l = getUploadUrl.expiresTime;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str4 = getUploadUrl.secretKey;
        }
        return getUploadUrl.copy(str, str5, str6, l2, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getExpiresTime() {
        return this.expiresTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public final GetUploadUrl copy(@Nullable String url, @Nullable String name, @Nullable String method, @Nullable Long expiresTime, @Nullable String secretKey) {
        return new GetUploadUrl(url, name, method, expiresTime, secretKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUploadUrl)) {
            return false;
        }
        GetUploadUrl getUploadUrl = (GetUploadUrl) other;
        return Intrinsics.areEqual(this.url, getUploadUrl.url) && Intrinsics.areEqual(this.name, getUploadUrl.name) && Intrinsics.areEqual(this.method, getUploadUrl.method) && Intrinsics.areEqual(this.expiresTime, getUploadUrl.expiresTime) && Intrinsics.areEqual(this.secretKey, getUploadUrl.secretKey);
    }

    @Nullable
    public final Long getExpiresTime() {
        return this.expiresTime;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSecretKey() {
        return this.secretKey;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.method;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expiresTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.secretKey;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetUploadUrl(url=" + this.url + ", name=" + this.name + ", method=" + this.method + ", expiresTime=" + this.expiresTime + ", secretKey=" + this.secretKey + ")";
    }
}
