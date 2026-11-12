package com.xiaomi.hm.health.device.setting.appsort.condition;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/condition/ZeppOSHideCondition;", "", "", "component1", "", "component2", "Lkotlin/Function1;", "Landroid/content/Context;", "", "component3", SDKConstants.PARAM_APP_ID, "canDisable", "actionWhenCannotHide", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getAppID", "()Ljava/lang/String;", "b", "Z", "getCanDisable", "()Z", "c", "Lkotlin/jvm/functions/Function1;", "getActionWhenCannotHide", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ZeppOSHideCondition {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean canDisable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<Context, Unit> actionWhenCannotHide;

    /* JADX WARN: Multi-variable type inference failed */
    public ZeppOSHideCondition(@NotNull String str, boolean z, @Nullable Function1<? super Context, Unit> function1) {
        this.appID = str;
        this.canDisable = z;
        this.actionWhenCannotHide = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZeppOSHideCondition copy$default(ZeppOSHideCondition zeppOSHideCondition, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zeppOSHideCondition.appID;
        }
        if ((i & 2) != 0) {
            z = zeppOSHideCondition.canDisable;
        }
        if ((i & 4) != 0) {
            function1 = zeppOSHideCondition.actionWhenCannotHide;
        }
        return zeppOSHideCondition.copy(str, z, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppID() {
        return this.appID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanDisable() {
        return this.canDisable;
    }

    @Nullable
    public final Function1<Context, Unit> component3() {
        return this.actionWhenCannotHide;
    }

    @NotNull
    public final ZeppOSHideCondition copy(@NotNull String appID, boolean canDisable, @Nullable Function1<? super Context, Unit> actionWhenCannotHide) {
        return new ZeppOSHideCondition(appID, canDisable, actionWhenCannotHide);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZeppOSHideCondition)) {
            return false;
        }
        ZeppOSHideCondition zeppOSHideCondition = (ZeppOSHideCondition) other;
        return Intrinsics.areEqual(this.appID, zeppOSHideCondition.appID) && this.canDisable == zeppOSHideCondition.canDisable && Intrinsics.areEqual(this.actionWhenCannotHide, zeppOSHideCondition.actionWhenCannotHide);
    }

    @Nullable
    public final Function1<Context, Unit> getActionWhenCannotHide() {
        return this.actionWhenCannotHide;
    }

    @NotNull
    public final String getAppID() {
        return this.appID;
    }

    public final boolean getCanDisable() {
        return this.canDisable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.appID.hashCode() * 31;
        boolean z = this.canDisable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Function1<Context, Unit> function1 = this.actionWhenCannotHide;
        return i + (function1 == null ? 0 : function1.hashCode());
    }

    @NotNull
    public String toString() {
        return "ZeppOSHideCondition(appID=" + this.appID + ", canDisable=" + this.canDisable + ", actionWhenCannotHide=" + this.actionWhenCannotHide + ")";
    }

    public /* synthetic */ ZeppOSHideCondition(String str, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : function1);
    }
}
