package com.mi.health.appupgrade.model;

import androidx.annotation.Keep;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "", "new_version", "", "new_version_name", "", "new_version_code", "download_url", "change_log", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getNew_version", "()I", "getNew_version_name", "()Ljava/lang/String;", "getNew_version_code", "getDownload_url", "getChange_log", "apkName", "getApkName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppUpgradeResult {
    public static final int APP_UPGRADE_NEW = 0;
    public static final int APP_UPGRADE_NEW_FORCING = 2;
    public static final int APP_UPGRADE_NEW_SUGGEST = 1;
    public static final int APP_UPGRADE_NO_NEW = -1;

    @Nullable
    private final String change_log;

    @Nullable
    private final String download_url;
    private final int new_version;
    private final int new_version_code;

    @Nullable
    private final String new_version_name;

    public AppUpgradeResult(int i, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
        this.new_version = i;
        this.new_version_name = str;
        this.new_version_code = i2;
        this.download_url = str2;
        this.change_log = str3;
    }

    public static /* synthetic */ AppUpgradeResult copy$default(AppUpgradeResult appUpgradeResult, int i, String str, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appUpgradeResult.new_version;
        }
        if ((i3 & 2) != 0) {
            str = appUpgradeResult.new_version_name;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i2 = appUpgradeResult.new_version_code;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = appUpgradeResult.download_url;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = appUpgradeResult.change_log;
        }
        return appUpgradeResult.copy(i, str4, i4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNew_version() {
        return this.new_version;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNew_version_name() {
        return this.new_version_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNew_version_code() {
        return this.new_version_code;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownload_url() {
        return this.download_url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChange_log() {
        return this.change_log;
    }

    @NotNull
    public final AppUpgradeResult copy(int new_version, @Nullable String new_version_name, int new_version_code, @Nullable String download_url, @Nullable String change_log) {
        return new AppUpgradeResult(new_version, new_version_name, new_version_code, download_url, change_log);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgradeResult)) {
            return false;
        }
        AppUpgradeResult appUpgradeResult = (AppUpgradeResult) other;
        return this.new_version == appUpgradeResult.new_version && Intrinsics.areEqual(this.new_version_name, appUpgradeResult.new_version_name) && this.new_version_code == appUpgradeResult.new_version_code && Intrinsics.areEqual(this.download_url, appUpgradeResult.download_url) && Intrinsics.areEqual(this.change_log, appUpgradeResult.change_log);
    }

    @NotNull
    public final String getApkName() {
        return ApplicationExtKt.getApplication().getPackageName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.new_version_name + ".apk";
    }

    @Nullable
    public final String getChange_log() {
        return this.change_log;
    }

    @Nullable
    public final String getDownload_url() {
        return this.download_url;
    }

    public final int getNew_version() {
        return this.new_version;
    }

    public final int getNew_version_code() {
        return this.new_version_code;
    }

    @Nullable
    public final String getNew_version_name() {
        return this.new_version_name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.new_version) * 31;
        String str = this.new_version_name;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.new_version_code)) * 31;
        String str2 = this.download_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.change_log;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppUpgradeResult(new_version=" + this.new_version + ", new_version_name=" + this.new_version_name + ", new_version_code=" + this.new_version_code + ", download_url=" + this.download_url + ", change_log=" + this.change_log + ")";
    }
}
