package com.xiaomi.xms.wearable.bean;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/xms/wearable/bean/AppInfo;", "", "packageName", "", "appIcon", "Landroid/graphics/drawable/Drawable;", "appName", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getAppIcon", "()Landroid/graphics/drawable/Drawable;", "getAppName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppInfo {

    @NotNull
    private final Drawable appIcon;

    @NotNull
    private final String appName;

    @NotNull
    private final String packageName;

    public AppInfo(@NotNull String packageName, @NotNull Drawable appIcon, @NotNull String appName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.packageName = packageName;
        this.appIcon = appIcon;
        this.appName = appName;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, Drawable drawable, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.packageName;
        }
        if ((i & 2) != 0) {
            drawable = appInfo.appIcon;
        }
        if ((i & 4) != 0) {
            str2 = appInfo.appName;
        }
        return appInfo.copy(str, drawable, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final AppInfo copy(@NotNull String packageName, @NotNull Drawable appIcon, @NotNull String appName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new AppInfo(packageName, appIcon, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return Intrinsics.areEqual(this.packageName, appInfo.packageName) && Intrinsics.areEqual(this.appIcon, appInfo.appIcon) && Intrinsics.areEqual(this.appName, appInfo.appName);
    }

    @NotNull
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + this.appIcon.hashCode()) * 31) + this.appName.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppInfo(packageName=" + this.packageName + ", appIcon=" + this.appIcon + ", appName=" + this.appName + ")";
    }
}
