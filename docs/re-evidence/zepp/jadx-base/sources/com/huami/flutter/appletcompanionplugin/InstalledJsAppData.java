package com.huami.flutter.appletcompanionplugin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/InstalledJsAppData;", "", "", "component1", "component2", "appId", "version", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "getVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class InstalledJsAppData {

    @NotNull
    private final String appId;

    @NotNull
    private final String version;

    public InstalledJsAppData(@NotNull String str, @NotNull String str2) {
        this.appId = str;
        this.version = str2;
    }

    public static /* synthetic */ InstalledJsAppData copy$default(InstalledJsAppData installedJsAppData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installedJsAppData.appId;
        }
        if ((i & 2) != 0) {
            str2 = installedJsAppData.version;
        }
        return installedJsAppData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final InstalledJsAppData copy(@NotNull String appId, @NotNull String version) {
        return new InstalledJsAppData(appId, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstalledJsAppData)) {
            return false;
        }
        InstalledJsAppData installedJsAppData = (InstalledJsAppData) other;
        return Intrinsics.areEqual(this.appId, installedJsAppData.appId) && Intrinsics.areEqual(this.version, installedJsAppData.version);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.appId.hashCode() * 31) + this.version.hashCode();
    }

    @NotNull
    public String toString() {
        return "InstalledJsAppData(appId=" + this.appId + ", version=" + this.version + ')';
    }
}
