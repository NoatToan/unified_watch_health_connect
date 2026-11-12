package com.xiaomi.xms.wearable.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Entity(tableName = "watch_app_capability")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/xms/wearable/db/entity/WatchAppCapability;", "", "packageName", "", "appName", "hasNotificationPermission", "", "hasObserveStatePermission", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getPackageName", "()Ljava/lang/String;", "getAppName", "getHasNotificationPermission", "()Z", "setHasNotificationPermission", "(Z)V", "getHasObserveStatePermission", "setHasObserveStatePermission", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchAppCapability {

    @NotNull
    private final String appName;
    private boolean hasNotificationPermission;
    private boolean hasObserveStatePermission;

    @PrimaryKey
    @NotNull
    private final String packageName;

    public WatchAppCapability(@NotNull String packageName, @NotNull String appName, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.packageName = packageName;
        this.appName = appName;
        this.hasNotificationPermission = z;
        this.hasObserveStatePermission = z2;
    }

    public static /* synthetic */ WatchAppCapability copy$default(WatchAppCapability watchAppCapability, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchAppCapability.packageName;
        }
        if ((i & 2) != 0) {
            str2 = watchAppCapability.appName;
        }
        if ((i & 4) != 0) {
            z = watchAppCapability.hasNotificationPermission;
        }
        if ((i & 8) != 0) {
            z2 = watchAppCapability.hasObserveStatePermission;
        }
        return watchAppCapability.copy(str, str2, z, z2);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasNotificationPermission() {
        return this.hasNotificationPermission;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasObserveStatePermission() {
        return this.hasObserveStatePermission;
    }

    @NotNull
    public final WatchAppCapability copy(@NotNull String packageName, @NotNull String appName, boolean hasNotificationPermission, boolean hasObserveStatePermission) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new WatchAppCapability(packageName, appName, hasNotificationPermission, hasObserveStatePermission);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchAppCapability)) {
            return false;
        }
        WatchAppCapability watchAppCapability = (WatchAppCapability) other;
        return Intrinsics.areEqual(this.packageName, watchAppCapability.packageName) && Intrinsics.areEqual(this.appName, watchAppCapability.appName) && this.hasNotificationPermission == watchAppCapability.hasNotificationPermission && this.hasObserveStatePermission == watchAppCapability.hasObserveStatePermission;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final boolean getHasNotificationPermission() {
        return this.hasNotificationPermission;
    }

    public final boolean getHasObserveStatePermission() {
        return this.hasObserveStatePermission;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (((((this.packageName.hashCode() * 31) + this.appName.hashCode()) * 31) + Boolean.hashCode(this.hasNotificationPermission)) * 31) + Boolean.hashCode(this.hasObserveStatePermission);
    }

    public final void setHasNotificationPermission(boolean z) {
        this.hasNotificationPermission = z;
    }

    public final void setHasObserveStatePermission(boolean z) {
        this.hasObserveStatePermission = z;
    }

    @NotNull
    public String toString() {
        return "WatchAppCapability(packageName=" + this.packageName + ", appName=" + this.appName + ", hasNotificationPermission=" + this.hasNotificationPermission + ", hasObserveStatePermission=" + this.hasObserveStatePermission + ")";
    }
}
