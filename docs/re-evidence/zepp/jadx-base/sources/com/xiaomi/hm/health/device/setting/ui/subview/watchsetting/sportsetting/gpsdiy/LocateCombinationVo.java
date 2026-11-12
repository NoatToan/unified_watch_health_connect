package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocateCombinationVo;", "", "", "component1", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "component2", "selected", "combination", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSelected", "()Z", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "getCombination", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "<init>", "(ZLcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LocateCombinationVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean selected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final LocationCombination combination;

    public LocateCombinationVo(boolean z, @NotNull LocationCombination locationCombination) {
        this.selected = z;
        this.combination = locationCombination;
    }

    public static /* synthetic */ LocateCombinationVo copy$default(LocateCombinationVo locateCombinationVo, boolean z, LocationCombination locationCombination, int i, Object obj) {
        if ((i & 1) != 0) {
            z = locateCombinationVo.selected;
        }
        if ((i & 2) != 0) {
            locationCombination = locateCombinationVo.combination;
        }
        return locateCombinationVo.copy(z, locationCombination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocationCombination getCombination() {
        return this.combination;
    }

    @NotNull
    public final LocateCombinationVo copy(boolean selected, @NotNull LocationCombination combination) {
        return new LocateCombinationVo(selected, combination);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocateCombinationVo)) {
            return false;
        }
        LocateCombinationVo locateCombinationVo = (LocateCombinationVo) other;
        return this.selected == locateCombinationVo.selected && this.combination == locateCombinationVo.combination;
    }

    @NotNull
    public final LocationCombination getCombination() {
        return this.combination;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.selected;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.combination.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocateCombinationVo(selected=" + this.selected + ", combination=" + this.combination + ")";
    }
}
