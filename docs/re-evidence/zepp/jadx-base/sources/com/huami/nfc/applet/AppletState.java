package com.huami.nfc.applet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/nfc/applet/AppletState;", "", "", "a", "toString", "", "component1", "component2", "isActive", "aid", "copy", "", "hashCode", "other", "equals", "Z", "()Z", "b", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/String;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppletState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isActive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String aid;

    public AppletState(boolean z, @NotNull String str) {
        this.isActive = z;
        this.aid = str;
    }

    private final String a() {
        try {
            return BusCardExtensions.fromAid(this.aid).getName();
        } catch (Exception unused) {
            return BusCardExtensions.getSnowballAccessDoorAidList().contains(this.aid) ? "雪球门禁" : "未知Applet";
        }
    }

    public static /* synthetic */ AppletState copy$default(AppletState appletState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appletState.isActive;
        }
        if ((i & 2) != 0) {
            str = appletState.aid;
        }
        return appletState.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final AppletState copy(boolean isActive, @NotNull String aid) {
        return new AppletState(isActive, aid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppletState)) {
            return false;
        }
        AppletState appletState = (AppletState) other;
        return this.isActive == appletState.isActive && Intrinsics.areEqual(this.aid, appletState.aid);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isActive;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.aid.hashCode();
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "AppletState(isActive=" + this.isActive + ", aid='" + this.aid + "', name='" + a() + "')";
    }
}
