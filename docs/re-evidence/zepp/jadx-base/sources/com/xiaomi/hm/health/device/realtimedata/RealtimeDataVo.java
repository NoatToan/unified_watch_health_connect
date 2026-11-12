package com.xiaomi.hm.health.device.realtimedata;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/realtimedata/RealtimeDataVo;", "", "", "component1", "component2", "support", "enable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSupport", "()Z", "b", "getEnable", "<init>", "(ZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RealtimeDataVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean support;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean enable;

    public RealtimeDataVo(boolean z, boolean z2) {
        this.support = z;
        this.enable = z2;
    }

    public static /* synthetic */ RealtimeDataVo copy$default(RealtimeDataVo realtimeDataVo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = realtimeDataVo.support;
        }
        if ((i & 2) != 0) {
            z2 = realtimeDataVo.enable;
        }
        return realtimeDataVo.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSupport() {
        return this.support;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final RealtimeDataVo copy(boolean support, boolean enable) {
        return new RealtimeDataVo(support, enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtimeDataVo)) {
            return false;
        }
        RealtimeDataVo realtimeDataVo = (RealtimeDataVo) other;
        return this.support == realtimeDataVo.support && this.enable == realtimeDataVo.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getSupport() {
        return this.support;
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
        boolean z = this.support;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enable;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "RealtimeDataVo(support=" + this.support + ", enable=" + this.enable + ")";
    }
}
