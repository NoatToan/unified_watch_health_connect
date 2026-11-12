package com.huami.watch.companion.watchface.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/ReceiveState;", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "component1", "", "component2", "data", "state", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "getData", "()Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", LogUtil.I, "getState", "()I", "<init>", "(Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;I)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReceiveState {

    @Nullable
    private final WatchFaceBean data;
    private final int state;

    public ReceiveState(@Nullable WatchFaceBean watchFaceBean, int i) {
        this.data = watchFaceBean;
        this.state = i;
    }

    public static /* synthetic */ ReceiveState copy$default(ReceiveState receiveState, WatchFaceBean watchFaceBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            watchFaceBean = receiveState.data;
        }
        if ((i2 & 2) != 0) {
            i = receiveState.state;
        }
        return receiveState.copy(watchFaceBean, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WatchFaceBean getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final ReceiveState copy(@Nullable WatchFaceBean data, int state) {
        return new ReceiveState(data, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiveState)) {
            return false;
        }
        ReceiveState receiveState = (ReceiveState) other;
        return Intrinsics.areEqual(this.data, receiveState.data) && this.state == receiveState.state;
    }

    @Nullable
    public final WatchFaceBean getData() {
        return this.data;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        WatchFaceBean watchFaceBean = this.data;
        return ((watchFaceBean == null ? 0 : watchFaceBean.hashCode()) * 31) + this.state;
    }

    @NotNull
    public String toString() {
        return "ReceiveState(data=" + this.data + ", state=" + this.state + ")";
    }
}
