package com.huami.utils.easypermission.manager;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/utils/easypermission/manager/AppPermission;", "", "", "component1", "component2", "component3", "component4", "title", "desc", "deniedDesc", PointCategory.PERMISSION, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getDesc", "c", "getDeniedDesc", GoogleApiAvailabilityLight.a, "getPermission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppPermission {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deniedDesc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String permission;

    public AppPermission(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.title = str;
        this.desc = str2;
        this.deniedDesc = str3;
        this.permission = str4;
    }

    public static /* synthetic */ AppPermission copy$default(AppPermission appPermission, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appPermission.title;
        }
        if ((i & 2) != 0) {
            str2 = appPermission.desc;
        }
        if ((i & 4) != 0) {
            str3 = appPermission.deniedDesc;
        }
        if ((i & 8) != 0) {
            str4 = appPermission.permission;
        }
        return appPermission.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeniedDesc() {
        return this.deniedDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    @NotNull
    public final AppPermission copy(@NotNull String title, @NotNull String desc, @NotNull String deniedDesc, @NotNull String permission) {
        return new AppPermission(title, desc, deniedDesc, permission);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppPermission)) {
            return false;
        }
        AppPermission appPermission = (AppPermission) other;
        return Intrinsics.areEqual(this.title, appPermission.title) && Intrinsics.areEqual(this.desc, appPermission.desc) && Intrinsics.areEqual(this.deniedDesc, appPermission.deniedDesc) && Intrinsics.areEqual(this.permission, appPermission.permission);
    }

    @NotNull
    public final String getDeniedDesc() {
        return this.deniedDesc;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getPermission() {
        return this.permission;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.desc.hashCode()) * 31) + this.deniedDesc.hashCode()) * 31) + this.permission.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppPermission(title=" + this.title + ", desc=" + this.desc + ", deniedDesc=" + this.deniedDesc + ", permission=" + this.permission + ')';
    }
}
