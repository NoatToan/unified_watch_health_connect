package com.huami.device.feature.notification.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/device/feature/notification/data/AppChosen;", "", "", "toString", "component1", "", "component2", "pkg", "on", "copy", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "b", "Z", "getOn", "()Z", "<init>", "(Ljava/lang/String;Z)V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppChosen {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("AppPkg")
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("AppOn")
    private final boolean on;

    public AppChosen(@NotNull String str, boolean z) {
        this.pkg = str;
        this.on = z;
    }

    public static /* synthetic */ AppChosen copy$default(AppChosen appChosen, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appChosen.pkg;
        }
        if ((i & 2) != 0) {
            z = appChosen.on;
        }
        return appChosen.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOn() {
        return this.on;
    }

    @NotNull
    public final AppChosen copy(@NotNull String pkg, boolean on) {
        return new AppChosen(pkg, on);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppChosen)) {
            return false;
        }
        AppChosen appChosen = (AppChosen) other;
        return Intrinsics.areEqual(this.pkg, appChosen.pkg) && this.on == appChosen.on;
    }

    public final boolean getOn() {
        return this.on;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.pkg.hashCode() * 31;
        boolean z = this.on;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "{\"AppPkg\": " + this.pkg + ", \"AppOn\": " + this.on + '}';
    }

    public /* synthetic */ AppChosen(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
