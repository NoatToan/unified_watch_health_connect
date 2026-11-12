package com.xiaomi.hm.health.device.setting.vo;

import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/WearStyleSettingVo;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Boolean;", "isSupport", "style", SportAnalytics.ParamValue.TrackVideo.SAVE_SUCCESS, "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/xiaomi/hm/health/device/setting/vo/WearStyleSettingVo;", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "getSaveSuccess", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WearStyleSettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean saveSuccess;

    public WearStyleSettingVo(boolean z, @NotNull String str, @Nullable Boolean bool) {
        this.isSupport = z;
        this.style = str;
        this.saveSuccess = bool;
    }

    public static /* synthetic */ WearStyleSettingVo copy$default(WearStyleSettingVo wearStyleSettingVo, boolean z, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wearStyleSettingVo.isSupport;
        }
        if ((i & 2) != 0) {
            str = wearStyleSettingVo.style;
        }
        if ((i & 4) != 0) {
            bool = wearStyleSettingVo.saveSuccess;
        }
        return wearStyleSettingVo.copy(z, str, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSaveSuccess() {
        return this.saveSuccess;
    }

    @NotNull
    public final WearStyleSettingVo copy(boolean isSupport, @NotNull String style, @Nullable Boolean saveSuccess) {
        return new WearStyleSettingVo(isSupport, style, saveSuccess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WearStyleSettingVo)) {
            return false;
        }
        WearStyleSettingVo wearStyleSettingVo = (WearStyleSettingVo) other;
        return this.isSupport == wearStyleSettingVo.isSupport && Intrinsics.areEqual(this.style, wearStyleSettingVo.style) && Intrinsics.areEqual(this.saveSuccess, wearStyleSettingVo.saveSuccess);
    }

    @Nullable
    public final Boolean getSaveSuccess() {
        return this.saveSuccess;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.style.hashCode()) * 31;
        Boolean bool = this.saveSuccess;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "WearStyleSettingVo(isSupport=" + this.isSupport + ", style=" + this.style + ", saveSuccess=" + this.saveSuccess + ")";
    }

    public /* synthetic */ WearStyleSettingVo(boolean z, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : bool);
    }
}
