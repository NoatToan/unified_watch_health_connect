package com.xiaomi.fitness.notify.data;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.zwh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "", "packageName", "", "appName", "appIcon", "Landroid/graphics/drawable/Drawable;", "isCheck", "", "appNamePinYin", "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLjava/lang/String;I)V", "getPackageName", "()Ljava/lang/String;", "getAppName", "getAppIcon", "()Landroid/graphics/drawable/Drawable;", "()Z", "setCheck", "(Z)V", "getAppNamePinYin", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstallApplicationInfo {

    @Nullable
    private final Drawable appIcon;

    @NotNull
    private final String appName;

    @NotNull
    private final String appNamePinYin;
    private boolean isCheck;
    private final int order;

    @NotNull
    private final String packageName;

    public InstallApplicationInfo(@NotNull String packageName, @NotNull String appName, @Nullable Drawable drawable, boolean z, @NotNull String appNamePinYin, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appNamePinYin, "appNamePinYin");
        this.packageName = packageName;
        this.appName = appName;
        this.appIcon = drawable;
        this.isCheck = z;
        this.appNamePinYin = appNamePinYin;
        this.order = i;
    }

    public static /* synthetic */ InstallApplicationInfo copy$default(InstallApplicationInfo installApplicationInfo, String str, String str2, Drawable drawable, boolean z, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = installApplicationInfo.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = installApplicationInfo.appName;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            drawable = installApplicationInfo.appIcon;
        }
        Drawable drawable2 = drawable;
        if ((i2 & 8) != 0) {
            z = installApplicationInfo.isCheck;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = installApplicationInfo.appNamePinYin;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            i = installApplicationInfo.order;
        }
        return installApplicationInfo.copy(str, str4, drawable2, z2, str5, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppNamePinYin() {
        return this.appNamePinYin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final InstallApplicationInfo copy(@NotNull String packageName, @NotNull String appName, @Nullable Drawable appIcon, boolean isCheck, @NotNull String appNamePinYin, int order) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appNamePinYin, "appNamePinYin");
        return new InstallApplicationInfo(packageName, appName, appIcon, isCheck, appNamePinYin, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallApplicationInfo)) {
            return false;
        }
        InstallApplicationInfo installApplicationInfo = (InstallApplicationInfo) other;
        return Intrinsics.areEqual(this.packageName, installApplicationInfo.packageName) && Intrinsics.areEqual(this.appName, installApplicationInfo.appName) && Intrinsics.areEqual(this.appIcon, installApplicationInfo.appIcon) && this.isCheck == installApplicationInfo.isCheck && Intrinsics.areEqual(this.appNamePinYin, installApplicationInfo.appNamePinYin) && this.order == installApplicationInfo.order;
    }

    @Nullable
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAppNamePinYin() {
        return this.appNamePinYin;
    }

    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        int iHashCode = ((this.packageName.hashCode() * 31) + this.appName.hashCode()) * 31;
        Drawable drawable = this.appIcon;
        return ((((((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Boolean.hashCode(this.isCheck)) * 31) + this.appNamePinYin.hashCode()) * 31) + Integer.hashCode(this.order);
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    @NotNull
    public String toString() {
        return "InstallApplicationInfo(packageName=" + this.packageName + ", appName=" + this.appName + ", appIcon=" + this.appIcon + ", isCheck=" + this.isCheck + ", appNamePinYin=" + this.appNamePinYin + ", order=" + this.order + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstallApplicationInfo(String str, String str2, Drawable drawable, boolean z, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        int i4;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        String strA = (i2 & 16) != 0 ? zwh.a(str2) : str3;
        if ((i2 & 32) != 0) {
            if (NotifyHelperExtKt.getNotificationManagerExport().isTelApp(str)) {
                i4 = 0;
            } else if (Intrinsics.areEqual("com.android.mms", str) || TextUtils.equals("com.google.android.apps.messaging", str)) {
                i4 = 1;
            } else if (Intrinsics.areEqual("com.tencent.mm", str)) {
                i4 = 2;
            } else {
                i4 = Intrinsics.areEqual(CommonConstants.ALIPAY_PACKAGE_NAME, str) ? 3 : -1;
            }
            i3 = i4;
        } else {
            i3 = i;
        }
        this(str, str2, drawable, z2, strA, i3);
    }
}
