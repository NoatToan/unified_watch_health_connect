package com.xiaomi.hm.health.device.setting.vo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DisplayItemVo;", "", "", "component1", "isSupport", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    public DisplayItemVo(boolean z) {
        this.isSupport = z;
    }

    public static /* synthetic */ DisplayItemVo copy$default(DisplayItemVo displayItemVo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = displayItemVo.isSupport;
        }
        return displayItemVo.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    public final DisplayItemVo copy(boolean isSupport) {
        return new DisplayItemVo(isSupport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DisplayItemVo) && this.isSupport == ((DisplayItemVo) other).isSupport;
    }

    public int hashCode() {
        boolean z = this.isSupport;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "DisplayItemVo(isSupport=" + this.isSupport + ")";
    }
}
