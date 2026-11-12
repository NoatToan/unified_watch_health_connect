package com.xiaomi.fitness.devicesettings.base.cta;

import defpackage.w69;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u0004\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "", "", "component1", "()Z", "Lw69;", "component2", "()Lw69;", "isSelect", "appInfo", "copy", "(ZLw69;)Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setSelect", "(Z)V", "Lw69;", "getAppInfo", "<init>", "(ZLw69;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class CTABehaviorApp {

    @NotNull
    private final w69 appInfo;
    private boolean isSelect;

    public CTABehaviorApp(boolean z, @NotNull w69 appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        this.isSelect = z;
        this.appInfo = appInfo;
    }

    public static /* synthetic */ CTABehaviorApp copy$default(CTABehaviorApp cTABehaviorApp, boolean z, w69 w69Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cTABehaviorApp.isSelect;
        }
        if ((i & 2) != 0) {
            w69Var = cTABehaviorApp.appInfo;
        }
        return cTABehaviorApp.copy(z, w69Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final w69 getAppInfo() {
        return this.appInfo;
    }

    @NotNull
    public final CTABehaviorApp copy(boolean isSelect, @NotNull w69 appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        return new CTABehaviorApp(isSelect, appInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CTABehaviorApp)) {
            return false;
        }
        CTABehaviorApp cTABehaviorApp = (CTABehaviorApp) other;
        return this.isSelect == cTABehaviorApp.isSelect && Intrinsics.areEqual(this.appInfo, cTABehaviorApp.appInfo);
    }

    @NotNull
    public final w69 getAppInfo() {
        return this.appInfo;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSelect) * 31) + this.appInfo.hashCode();
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @NotNull
    public String toString() {
        return "CTABehaviorApp(isSelect=" + this.isSelect + ", appInfo=" + this.appInfo + ")";
    }

    public /* synthetic */ CTABehaviorApp(boolean z, w69 w69Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, w69Var);
    }
}
