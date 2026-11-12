package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/TransferContinueResponse;", "", "", "isRetry", "", "component1", "component2", "component3", "size", "retry", "receivedData", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getSize", "()I", "b", "getRetry", "c", "getReceivedData", "<init>", "(III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransferContinueResponse {
    public static final int RETRY = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int retry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int receivedData;

    public TransferContinueResponse(int i, int i2, int i3) {
        this.size = i;
        this.retry = i2;
        this.receivedData = i3;
    }

    public static /* synthetic */ TransferContinueResponse copy$default(TransferContinueResponse transferContinueResponse, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = transferContinueResponse.size;
        }
        if ((i4 & 2) != 0) {
            i2 = transferContinueResponse.retry;
        }
        if ((i4 & 4) != 0) {
            i3 = transferContinueResponse.receivedData;
        }
        return transferContinueResponse.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRetry() {
        return this.retry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getReceivedData() {
        return this.receivedData;
    }

    @NotNull
    public final TransferContinueResponse copy(int size, int retry, int receivedData) {
        return new TransferContinueResponse(size, retry, receivedData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferContinueResponse)) {
            return false;
        }
        TransferContinueResponse transferContinueResponse = (TransferContinueResponse) other;
        return this.size == transferContinueResponse.size && this.retry == transferContinueResponse.retry && this.receivedData == transferContinueResponse.receivedData;
    }

    public final int getReceivedData() {
        return this.receivedData;
    }

    public final int getRetry() {
        return this.retry;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.size * 31) + this.retry) * 31) + this.receivedData;
    }

    public final boolean isRetry() {
        return this.retry == 1;
    }

    @NotNull
    public String toString() {
        return "TransferContinueResponse(size=" + this.size + ", retry=" + this.retry + ", receivedData=" + this.receivedData + ')';
    }

    public /* synthetic */ TransferContinueResponse(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
