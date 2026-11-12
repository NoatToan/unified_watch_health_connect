package com.xiaomi.fitness.research.upgrade;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/research/upgrade/AppUpgradeResult;", "", "newVersion", "", "newVersionName", "", "newVersionCode", "downloadUrl", "changeLog", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getNewVersion", "()I", "getNewVersionName", "()Ljava/lang/String;", "getNewVersionCode", "getDownloadUrl", "getChangeLog", "apkName", "getApkName", "setApkName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppUpgradeResult {

    @NotNull
    private String apkName = "";

    @SerializedName("change_log")
    @Nullable
    private final String changeLog;

    @SerializedName("download_url")
    @Nullable
    private final String downloadUrl;

    @SerializedName("new_version")
    private final int newVersion;

    @SerializedName("new_version_code")
    private final int newVersionCode;

    @SerializedName("new_version_name")
    @Nullable
    private final String newVersionName;

    public AppUpgradeResult(int i, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
        this.newVersion = i;
        this.newVersionName = str;
        this.newVersionCode = i2;
        this.downloadUrl = str2;
        this.changeLog = str3;
    }

    public static /* synthetic */ AppUpgradeResult copy$default(AppUpgradeResult appUpgradeResult, int i, String str, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appUpgradeResult.newVersion;
        }
        if ((i3 & 2) != 0) {
            str = appUpgradeResult.newVersionName;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i2 = appUpgradeResult.newVersionCode;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = appUpgradeResult.downloadUrl;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = appUpgradeResult.changeLog;
        }
        return appUpgradeResult.copy(i, str4, i4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNewVersion() {
        return this.newVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewVersionName() {
        return this.newVersionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNewVersionCode() {
        return this.newVersionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChangeLog() {
        return this.changeLog;
    }

    @NotNull
    public final AppUpgradeResult copy(int newVersion, @Nullable String newVersionName, int newVersionCode, @Nullable String downloadUrl, @Nullable String changeLog) {
        return new AppUpgradeResult(newVersion, newVersionName, newVersionCode, downloadUrl, changeLog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgradeResult)) {
            return false;
        }
        AppUpgradeResult appUpgradeResult = (AppUpgradeResult) other;
        return this.newVersion == appUpgradeResult.newVersion && Intrinsics.areEqual(this.newVersionName, appUpgradeResult.newVersionName) && this.newVersionCode == appUpgradeResult.newVersionCode && Intrinsics.areEqual(this.downloadUrl, appUpgradeResult.downloadUrl) && Intrinsics.areEqual(this.changeLog, appUpgradeResult.changeLog);
    }

    @NotNull
    public final String getApkName() {
        return this.apkName;
    }

    @Nullable
    public final String getChangeLog() {
        return this.changeLog;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final int getNewVersion() {
        return this.newVersion;
    }

    public final int getNewVersionCode() {
        return this.newVersionCode;
    }

    @Nullable
    public final String getNewVersionName() {
        return this.newVersionName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.newVersion) * 31;
        String str = this.newVersionName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.newVersionCode)) * 31;
        String str2 = this.downloadUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changeLog;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setApkName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkName = str;
    }

    @NotNull
    public String toString() {
        return "AppUpgradeResult(newVersion=" + this.newVersion + ", newVersionName=" + this.newVersionName + ", newVersionCode=" + this.newVersionCode + ", downloadUrl=" + this.downloadUrl + ", changeLog=" + this.changeLog + ")";
    }
}
