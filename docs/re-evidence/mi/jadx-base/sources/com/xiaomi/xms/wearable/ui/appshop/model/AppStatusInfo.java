package com.xiaomi.xms.wearable.ui.appshop.model;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.x1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J'\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\t¨\u0006&"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "", "packageName", "", "status", "", "statusValue", "<init>", "(Ljava/lang/String;II)V", "(Ljava/lang/String;)V", "appInfo", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;)V", "getPackageName", "()Ljava/lang/String;", "getStatus", "()I", "setStatus", "(I)V", "getStatusValue", "setStatusValue", "statusText", "getStatusText", "statusEnable", "", "getStatusEnable", "()Z", "errMsg", "getErrMsg", "setErrMsg", "toString", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppStatusInfo {
    public static final int DOWNLOADING = 4;
    public static final int DOWNLOAD_COMPLETE = 5;
    public static final int DOWNLOAD_FAILED = 6;
    public static final int DOWNLOAD_REJECTED = 17;
    public static final int INSTALLED = 1;
    public static final int INSTALLING = 10;
    public static final int INSTALL_FAILED = 12;
    public static final int INSTALL_SUCCESS = 11;
    public static final int NEED_UPDATE = 2;
    public static final int ON_TRANSMISSION = 8;
    public static final int TRANSMIT_FAILED = 9;
    public static final int UNINSTALLED = 0;
    public static final int UNINSTALLING = 14;
    public static final int UNINSTALL_FAILED = 16;
    public static final int UNINSTALL_SUCCESS = 15;
    public static final int WAITING_DOWNLOAD = 3;
    public static final int WAITING_TRANSMISSION = 7;
    public static final int WAITING_UNINSTALL = 13;
    public static final int sDownLoadFull = 18;

    @Nullable
    private String errMsg;

    @NotNull
    private final String packageName;
    private int status;
    private int statusValue;

    public AppStatusInfo(@NotNull String packageName, int i, int i2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.status = i;
        this.statusValue = i2;
    }

    public static /* synthetic */ AppStatusInfo copy$default(AppStatusInfo appStatusInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appStatusInfo.packageName;
        }
        if ((i3 & 2) != 0) {
            i = appStatusInfo.status;
        }
        if ((i3 & 4) != 0) {
            i2 = appStatusInfo.statusValue;
        }
        return appStatusInfo.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatusValue() {
        return this.statusValue;
    }

    @NotNull
    public final AppStatusInfo copy(@NotNull String packageName, int status, int statusValue) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new AppStatusInfo(packageName, status, statusValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStatusInfo)) {
            return false;
        }
        AppStatusInfo appStatusInfo = (AppStatusInfo) other;
        return Intrinsics.areEqual(this.packageName, appStatusInfo.packageName) && this.status == appStatusInfo.status && this.statusValue == appStatusInfo.statusValue;
    }

    @Nullable
    public final String getErrMsg() {
        return this.errMsg;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean getStatusEnable() {
        int i = this.status;
        return i == 0 || i == 1 || i == 2;
    }

    @Nullable
    public final String getStatusText() {
        switch (this.status) {
            case 0:
                return ResourceExtKt.getString(x1j.h);
            case 1:
                return ResourceExtKt.getString(x1j.t);
            case 2:
                return ResourceExtKt.getString(x1j.v);
            case 3:
                return ResourceExtKt.getString(x1j.y);
            case 4:
                return ResourceExtKt.getString(x1j.i);
            case 5:
            case 7:
                return ResourceExtKt.getString(x1j.y);
            case 6:
            case 9:
            case 11:
            case 12:
            default:
                return null;
            case 8:
                return ResourceExtKt.getString(x1j.y);
            case 10:
                return ResourceExtKt.getString(x1j.y);
            case 13:
                return ResourceExtKt.getString(x1j.y);
            case 14:
                return ResourceExtKt.getString(x1j.y);
        }
    }

    public final int getStatusValue() {
        return this.statusValue;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.statusValue);
    }

    public final void setErrMsg(@Nullable String str) {
        this.errMsg = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setStatusValue(int i) {
        this.statusValue = i;
    }

    @NotNull
    public String toString() {
        return "AppStatusInfo(packageName='" + this.packageName + "', status=" + this.status + ", statusValue=" + this.statusValue + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppStatusInfo(@NotNull String packageName) {
        this(packageName, 0, 0);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppStatusInfo(@NotNull AppStatusInfo appInfo) {
        this(appInfo.packageName, appInfo.status, appInfo.statusValue);
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
    }
}
