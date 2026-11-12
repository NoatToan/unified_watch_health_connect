package com.xiaomi.hm.health.device.setting.vo;

import androidx.p010navigation.NavController;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JS\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/WatchAppItemVo;", "", "", "component1", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "component2", "component3", "", "component4", "component5", "Lkotlin/Function1;", "Landroidx/navigation/NavController;", "", "component6", "index", "type", "iconRes", "enable", "titleRes", "action", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "getType", "()Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "c", "getIconRes", GoogleApiAvailabilityLight.a, "Z", "getEnable", "()Z", "setEnable", "(Z)V", "e", "getTitleRes", "f", "Lkotlin/jvm/functions/Function1;", "getAction", "()Lkotlin/jvm/functions/Function1;", "setAction", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "(ILcom/xiaomi/hm/health/device/setting/SoftFeature;IZILkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchAppItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final SoftFeature type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int iconRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean enable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int titleRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Function1<? super NavController, Unit> action;

    public WatchAppItemVo(int i, @NotNull SoftFeature softFeature, int i2, boolean z, int i3, @Nullable Function1<? super NavController, Unit> function1) {
        this.index = i;
        this.type = softFeature;
        this.iconRes = i2;
        this.enable = z;
        this.titleRes = i3;
        this.action = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchAppItemVo copy$default(WatchAppItemVo watchAppItemVo, int i, SoftFeature softFeature, int i2, boolean z, int i3, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = watchAppItemVo.index;
        }
        if ((i4 & 2) != 0) {
            softFeature = watchAppItemVo.type;
        }
        SoftFeature softFeature2 = softFeature;
        if ((i4 & 4) != 0) {
            i2 = watchAppItemVo.iconRes;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            z = watchAppItemVo.enable;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            i3 = watchAppItemVo.titleRes;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            function1 = watchAppItemVo.action;
        }
        return watchAppItemVo.copy(i, softFeature2, i5, z2, i6, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SoftFeature getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    @Nullable
    public final Function1<NavController, Unit> component6() {
        return this.action;
    }

    @NotNull
    public final WatchAppItemVo copy(int index, @NotNull SoftFeature type, int iconRes, boolean enable, int titleRes, @Nullable Function1<? super NavController, Unit> action) {
        return new WatchAppItemVo(index, type, iconRes, enable, titleRes, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchAppItemVo)) {
            return false;
        }
        WatchAppItemVo watchAppItemVo = (WatchAppItemVo) other;
        return this.index == watchAppItemVo.index && this.type == watchAppItemVo.type && this.iconRes == watchAppItemVo.iconRes && this.enable == watchAppItemVo.enable && this.titleRes == watchAppItemVo.titleRes && Intrinsics.areEqual(this.action, watchAppItemVo.action);
    }

    @Nullable
    public final Function1<NavController, Unit> getAction() {
        return this.action;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    @NotNull
    public final SoftFeature getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.index * 31) + this.type.hashCode()) * 31) + this.iconRes) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode + r1) * 31) + this.titleRes) * 31;
        Function1<? super NavController, Unit> function1 = this.action;
        return i + (function1 == null ? 0 : function1.hashCode());
    }

    public final void setAction(@Nullable Function1<? super NavController, Unit> function1) {
        this.action = function1;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public String toString() {
        return "WatchAppItemVo(index=" + this.index + ", type=" + this.type + ", iconRes=" + this.iconRes + ", enable=" + this.enable + ", titleRes=" + this.titleRes + ", action=" + this.action + ")";
    }

    public /* synthetic */ WatchAppItemVo(int i, SoftFeature softFeature, int i2, boolean z, int i3, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, softFeature, i2, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? null : function1);
    }
}
