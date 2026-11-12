package com.xiaomi.hm.health.device.setting.vo;

import com.huami.hid.takepic.TakePicSettingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/ShowFindingVo;", "", "", "component1", "component2", "show", TakePicSettingActivity.KEY_IS_WATCH, "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getShow", "()Z", "b", "<init>", "(ZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShowFindingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean show;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isWatch;

    public ShowFindingVo(boolean z, boolean z2) {
        this.show = z;
        this.isWatch = z2;
    }

    public static /* synthetic */ ShowFindingVo copy$default(ShowFindingVo showFindingVo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = showFindingVo.show;
        }
        if ((i & 2) != 0) {
            z2 = showFindingVo.isWatch;
        }
        return showFindingVo.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWatch() {
        return this.isWatch;
    }

    @NotNull
    public final ShowFindingVo copy(boolean show, boolean isWatch) {
        return new ShowFindingVo(show, isWatch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowFindingVo)) {
            return false;
        }
        ShowFindingVo showFindingVo = (ShowFindingVo) other;
        return this.show == showFindingVo.show && this.isWatch == showFindingVo.isWatch;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isWatch;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isWatch() {
        return this.isWatch;
    }

    @NotNull
    public String toString() {
        return "ShowFindingVo(show=" + this.show + ", isWatch=" + this.isWatch + ")";
    }

    public /* synthetic */ ShowFindingVo(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2);
    }
}
