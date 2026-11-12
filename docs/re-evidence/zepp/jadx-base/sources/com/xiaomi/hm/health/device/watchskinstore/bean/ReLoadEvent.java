package com.xiaomi.hm.health.device.watchskinstore.bean;

import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/ReLoadEvent;", "", "", "component1", WebAPI.PARAM_IS_REFRESH, "copy", "", "toString", "", "hashCode", "other", "equals", "Z", "()Z", "setRefresh", "(Z)V", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReLoadEvent {
    private boolean isRefresh;

    public ReLoadEvent(boolean z) {
        this.isRefresh = z;
    }

    public static /* synthetic */ ReLoadEvent copy$default(ReLoadEvent reLoadEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reLoadEvent.isRefresh;
        }
        return reLoadEvent.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    @NotNull
    public final ReLoadEvent copy(boolean isRefresh) {
        return new ReLoadEvent(isRefresh);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReLoadEvent) && this.isRefresh == ((ReLoadEvent) other).isRefresh;
    }

    public int hashCode() {
        boolean z = this.isRefresh;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final void setRefresh(boolean z) {
        this.isRefresh = z;
    }

    @NotNull
    public String toString() {
        return "ReLoadEvent(isRefresh=" + this.isRefresh + ")";
    }
}
