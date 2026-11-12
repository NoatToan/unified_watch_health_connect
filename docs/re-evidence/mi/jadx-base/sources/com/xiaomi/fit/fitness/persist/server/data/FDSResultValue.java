package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/FDSResultValue;", "", "url", "", "objectName", "objectKey", "method", Constants.KEY_EXPIRED_TIME, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getObjectName", "getObjectKey", "getMethod", "getExpireTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FDSResultValue {

    @SerializedName("expires_time")
    private final long expireTime;

    @SerializedName("method")
    @NotNull
    private final String method;

    @SerializedName("obj_key")
    @Nullable
    private final String objectKey;

    @SerializedName("obj_name")
    @NotNull
    private final String objectName;

    @SerializedName("url")
    @NotNull
    private final String url;

    public FDSResultValue(@NotNull String url, @NotNull String objectName, @Nullable String str, @NotNull String method, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(objectName, "objectName");
        Intrinsics.checkNotNullParameter(method, "method");
        this.url = url;
        this.objectName = objectName;
        this.objectKey = str;
        this.method = method;
        this.expireTime = j;
    }

    public static /* synthetic */ FDSResultValue copy$default(FDSResultValue fDSResultValue, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fDSResultValue.url;
        }
        if ((i & 2) != 0) {
            str2 = fDSResultValue.objectName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = fDSResultValue.objectKey;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = fDSResultValue.method;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = fDSResultValue.expireTime;
        }
        return fDSResultValue.copy(str, str5, str6, str7, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getObjectName() {
        return this.objectName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getObjectKey() {
        return this.objectKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final FDSResultValue copy(@NotNull String url, @NotNull String objectName, @Nullable String objectKey, @NotNull String method, long expireTime) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(objectName, "objectName");
        Intrinsics.checkNotNullParameter(method, "method");
        return new FDSResultValue(url, objectName, objectKey, method, expireTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FDSResultValue)) {
            return false;
        }
        FDSResultValue fDSResultValue = (FDSResultValue) other;
        return Intrinsics.areEqual(this.url, fDSResultValue.url) && Intrinsics.areEqual(this.objectName, fDSResultValue.objectName) && Intrinsics.areEqual(this.objectKey, fDSResultValue.objectKey) && Intrinsics.areEqual(this.method, fDSResultValue.method) && this.expireTime == fDSResultValue.expireTime;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getObjectKey() {
        return this.objectKey;
    }

    @NotNull
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.objectName.hashCode()) * 31;
        String str = this.objectKey;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode()) * 31) + Long.hashCode(this.expireTime);
    }

    @NotNull
    public String toString() {
        return "FDSResultValue(url=" + this.url + ", objectName=" + this.objectName + ", objectKey=" + this.objectKey + ", method=" + this.method + ", expireTime=" + this.expireTime + ")";
    }
}
