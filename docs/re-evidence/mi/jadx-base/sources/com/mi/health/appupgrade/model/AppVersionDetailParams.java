package com.mi.health.appupgrade.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/mi/health/appupgrade/model/AppVersionDetailParams;", "", "package_name", "", "version", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackage_name", "()Ljava/lang/String;", "getVersion", "getLocale", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppVersionDetailParams {

    @NotNull
    private final String locale;

    @NotNull
    private final String package_name;

    @NotNull
    private final String version;

    public AppVersionDetailParams(@NotNull String package_name, @NotNull String version, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.package_name = package_name;
        this.version = version;
        this.locale = locale;
    }

    public static /* synthetic */ AppVersionDetailParams copy$default(AppVersionDetailParams appVersionDetailParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionDetailParams.package_name;
        }
        if ((i & 2) != 0) {
            str2 = appVersionDetailParams.version;
        }
        if ((i & 4) != 0) {
            str3 = appVersionDetailParams.locale;
        }
        return appVersionDetailParams.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final AppVersionDetailParams copy(@NotNull String package_name, @NotNull String version, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(package_name, "package_name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new AppVersionDetailParams(package_name, version, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersionDetailParams)) {
            return false;
        }
        AppVersionDetailParams appVersionDetailParams = (AppVersionDetailParams) other;
        return Intrinsics.areEqual(this.package_name, appVersionDetailParams.package_name) && Intrinsics.areEqual(this.version, appVersionDetailParams.version) && Intrinsics.areEqual(this.locale, appVersionDetailParams.locale);
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
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
        return (((this.package_name.hashCode() * 31) + this.version.hashCode()) * 31) + this.locale.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppVersionDetailParams(package_name=" + this.package_name + ", version=" + this.version + ", locale=" + this.locale + ")";
    }
}
