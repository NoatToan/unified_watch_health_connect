package com.mi.health.appupgrade.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mi/health/appupgrade/model/AppUpgradeRequestParams;", "", "package_name", "", "version_name", "version_code", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getPackage_name", "()Ljava/lang/String;", "getVersion_name", "getVersion_code", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppUpgradeRequestParams {

    @NotNull
    private final String package_name;
    private final long version_code;

    @NotNull
    private final String version_name;

    public AppUpgradeRequestParams(@NotNull String package_name, @NotNull String version_name, long j) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(version_name, "version_name");
        this.package_name = package_name;
        this.version_name = version_name;
        this.version_code = j;
    }

    public static /* synthetic */ AppUpgradeRequestParams copy$default(AppUpgradeRequestParams appUpgradeRequestParams, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appUpgradeRequestParams.package_name;
        }
        if ((i & 2) != 0) {
            str2 = appUpgradeRequestParams.version_name;
        }
        if ((i & 4) != 0) {
            j = appUpgradeRequestParams.version_code;
        }
        return appUpgradeRequestParams.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion_name() {
        return this.version_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getVersion_code() {
        return this.version_code;
    }

    @NotNull
    public final AppUpgradeRequestParams copy(@NotNull String package_name, @NotNull String version_name, long version_code) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(version_name, "version_name");
        return new AppUpgradeRequestParams(package_name, version_name, version_code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgradeRequestParams)) {
            return false;
        }
        AppUpgradeRequestParams appUpgradeRequestParams = (AppUpgradeRequestParams) other;
        return Intrinsics.areEqual(this.package_name, appUpgradeRequestParams.package_name) && Intrinsics.areEqual(this.version_name, appUpgradeRequestParams.version_name) && this.version_code == appUpgradeRequestParams.version_code;
    }

    @NotNull
    public final String getPackage_name() {
        return this.package_name;
    }

    public final long getVersion_code() {
        return this.version_code;
    }

    @NotNull
    public final String getVersion_name() {
        return this.version_name;
    }

    public int hashCode() {
        return (((this.package_name.hashCode() * 31) + this.version_name.hashCode()) * 31) + Long.hashCode(this.version_code);
    }

    @NotNull
    public String toString() {
        return "AppUpgradeRequestParams(package_name=" + this.package_name + ", version_name=" + this.version_name + ", version_code=" + this.version_code + ")";
    }
}
