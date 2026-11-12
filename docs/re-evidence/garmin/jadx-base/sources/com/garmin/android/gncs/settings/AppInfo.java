package com.garmin.android.gncs.settings;

import android.graphics.drawable.Drawable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/gncs/settings/AppInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "displayName", "icon", "Landroid/graphics/drawable/Drawable;", "enabled", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AppInfo {
    public final String displayName;
    public boolean enabled;
    public final Drawable icon;
    public final String packageName;

    public AppInfo(String str, String str2, Drawable drawable, boolean z14) {
        str.getClass();
        str2.getClass();
        this.packageName = str;
        this.displayName = str2;
        this.icon = drawable;
        this.enabled = z14;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, Drawable drawable, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = appInfo.packageName;
        }
        if ((i14 & 2) != 0) {
            str2 = appInfo.displayName;
        }
        if ((i14 & 4) != 0) {
            drawable = appInfo.icon;
        }
        if ((i14 & 8) != 0) {
            z14 = appInfo.enabled;
        }
        return appInfo.copy(str, str2, drawable, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final AppInfo copy(String packageName, String displayName, Drawable icon, boolean enabled) {
        packageName.getClass();
        displayName.getClass();
        return new AppInfo(packageName, displayName, icon, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return s.g(this.packageName, appInfo.packageName) && s.g(this.displayName, appInfo.displayName) && s.g(this.icon, appInfo.icon) && this.enabled == appInfo.enabled;
    }

    public int hashCode() {
        int iJ = g.j(this.packageName.hashCode() * 31, 31, this.displayName);
        Drawable drawable = this.icon;
        return Boolean.hashCode(this.enabled) + ((iJ + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.displayName;
        Drawable drawable = this.icon;
        boolean z14 = this.enabled;
        StringBuilder sbI = p6.b.i("AppInfo(packageName=", str, ", displayName=", str2, ", icon=");
        sbI.append(drawable);
        sbI.append(", enabled=");
        sbI.append(z14);
        sbI.append(")");
        return sbI.toString();
    }
}
