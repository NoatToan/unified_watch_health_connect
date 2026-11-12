package com.huami.rawdata_uploader.vo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;", "", "", "component1", "component2", "userId", "appName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getAppName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataUserInfo {

    @NotNull
    private final String appName;

    @NotNull
    private final String userId;

    public RawDataUserInfo(@NotNull String str, @NotNull String str2) {
        this.userId = str;
        this.appName = str2;
    }

    public static /* synthetic */ RawDataUserInfo copy$default(RawDataUserInfo rawDataUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawDataUserInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = rawDataUserInfo.appName;
        }
        return rawDataUserInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final RawDataUserInfo copy(@NotNull String userId, @NotNull String appName) {
        return new RawDataUserInfo(userId, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataUserInfo)) {
            return false;
        }
        RawDataUserInfo rawDataUserInfo = (RawDataUserInfo) other;
        return Intrinsics.areEqual(this.userId, rawDataUserInfo.userId) && Intrinsics.areEqual(this.appName, rawDataUserInfo.appName);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.appName.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataUserInfo(userId=" + this.userId + ", appName=" + this.appName + ")";
    }
}
