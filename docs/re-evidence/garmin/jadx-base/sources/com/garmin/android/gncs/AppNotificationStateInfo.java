package com.garmin.android.gncs;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/gncs/AppNotificationStateInfo;", "", "packageId", "", "appDisplayName", "enabled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAppDisplayName", "()Ljava/lang/String;", "getEnabled", "()Z", "getPackageId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AppNotificationStateInfo {
    private final String appDisplayName;
    private final boolean enabled;
    private final String packageId;

    public AppNotificationStateInfo(String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        this.packageId = str;
        this.appDisplayName = str2;
        this.enabled = z14;
    }

    public static /* synthetic */ AppNotificationStateInfo copy$default(AppNotificationStateInfo appNotificationStateInfo, String str, String str2, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = appNotificationStateInfo.packageId;
        }
        if ((i14 & 2) != 0) {
            str2 = appNotificationStateInfo.appDisplayName;
        }
        if ((i14 & 4) != 0) {
            z14 = appNotificationStateInfo.enabled;
        }
        return appNotificationStateInfo.copy(str, str2, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppDisplayName() {
        return this.appDisplayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final AppNotificationStateInfo copy(String packageId, String appDisplayName, boolean enabled) {
        packageId.getClass();
        appDisplayName.getClass();
        return new AppNotificationStateInfo(packageId, appDisplayName, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppNotificationStateInfo)) {
            return false;
        }
        AppNotificationStateInfo appNotificationStateInfo = (AppNotificationStateInfo) other;
        return s.g(this.packageId, appNotificationStateInfo.packageId) && s.g(this.appDisplayName, appNotificationStateInfo.appDisplayName) && this.enabled == appNotificationStateInfo.enabled;
    }

    public final String getAppDisplayName() {
        return this.appDisplayName;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + wr.g.j(this.packageId.hashCode() * 31, 31, this.appDisplayName);
    }

    public String toString() {
        String str = this.packageId;
        String str2 = this.appDisplayName;
        return hb.a.k(p6.b.i("AppNotificationStateInfo(packageId=", str, ", appDisplayName=", str2, ", enabled="), this.enabled, ")");
    }
}
