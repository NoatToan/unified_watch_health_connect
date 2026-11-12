package com.mi.health.appupgrade.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/mi/health/appupgrade/model/AppVersionDetailResult;", "", "package_name", "", "apk_name", "version", "change_log", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackage_name", "()Ljava/lang/String;", "getApk_name", "getVersion", "getChange_log", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppVersionDetailResult {

    @NotNull
    private final String apk_name;

    @NotNull
    private final String change_log;

    @NotNull
    private final String package_name;

    @NotNull
    private final String version;

    public AppVersionDetailResult(@NotNull String package_name, @NotNull String apk_name, @NotNull String version, @NotNull String change_log) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(apk_name, "apk_name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(change_log, "change_log");
        this.package_name = package_name;
        this.apk_name = apk_name;
        this.version = version;
        this.change_log = change_log;
    }

    public static /* synthetic */ AppVersionDetailResult copy$default(AppVersionDetailResult appVersionDetailResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionDetailResult.package_name;
        }
        if ((i & 2) != 0) {
            str2 = appVersionDetailResult.apk_name;
        }
        if ((i & 4) != 0) {
            str3 = appVersionDetailResult.version;
        }
        if ((i & 8) != 0) {
            str4 = appVersionDetailResult.change_log;
        }
        return appVersionDetailResult.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApk_name() {
        return this.apk_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChange_log() {
        return this.change_log;
    }

    @NotNull
    public final AppVersionDetailResult copy(@NotNull String package_name, @NotNull String apk_name, @NotNull String version, @NotNull String change_log) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(apk_name, "apk_name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(change_log, "change_log");
        return new AppVersionDetailResult(package_name, apk_name, version, change_log);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersionDetailResult)) {
            return false;
        }
        AppVersionDetailResult appVersionDetailResult = (AppVersionDetailResult) other;
        return Intrinsics.areEqual(this.package_name, appVersionDetailResult.package_name) && Intrinsics.areEqual(this.apk_name, appVersionDetailResult.apk_name) && Intrinsics.areEqual(this.version, appVersionDetailResult.version) && Intrinsics.areEqual(this.change_log, appVersionDetailResult.change_log);
    }

    @NotNull
    public final String getApk_name() {
        return this.apk_name;
    }

    @NotNull
    public final String getChange_log() {
        return this.change_log;
    }

    @NotNull
    public final String getPackage_name() {
        return this.package_name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((this.package_name.hashCode() * 31) + this.apk_name.hashCode()) * 31) + this.version.hashCode()) * 31) + this.change_log.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppVersionDetailResult(package_name=" + this.package_name + ", apk_name=" + this.apk_name + ", version=" + this.version + ", change_log=" + this.change_log + ")";
    }
}
