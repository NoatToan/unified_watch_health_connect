package com.xiaomi.hm.health.device.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/model/EarbudDeviceLeftSizeResult;", "", "", "isSuccess", "", "component1", "component2", "leftSize", "status", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getLeftSize", "()I", "b", "getStatus", "<init>", "(II)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarbudDeviceLeftSizeResult {
    public static final int LEFT_SIZE_ERROR = 2;
    public static final int NET_ERROR = 3;
    public static final int STATUS_SUCCESS = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int leftSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int status;

    public EarbudDeviceLeftSizeResult(int i, int i2) {
        this.leftSize = i;
        this.status = i2;
    }

    public static /* synthetic */ EarbudDeviceLeftSizeResult copy$default(EarbudDeviceLeftSizeResult earbudDeviceLeftSizeResult, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = earbudDeviceLeftSizeResult.leftSize;
        }
        if ((i3 & 2) != 0) {
            i2 = earbudDeviceLeftSizeResult.status;
        }
        return earbudDeviceLeftSizeResult.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeftSize() {
        return this.leftSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final EarbudDeviceLeftSizeResult copy(int leftSize, int status) {
        return new EarbudDeviceLeftSizeResult(leftSize, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarbudDeviceLeftSizeResult)) {
            return false;
        }
        EarbudDeviceLeftSizeResult earbudDeviceLeftSizeResult = (EarbudDeviceLeftSizeResult) other;
        return this.leftSize == earbudDeviceLeftSizeResult.leftSize && this.status == earbudDeviceLeftSizeResult.status;
    }

    public final int getLeftSize() {
        return this.leftSize;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.leftSize * 31) + this.status;
    }

    public final boolean isSuccess() {
        return this.status == 1;
    }

    @NotNull
    public String toString() {
        return "EarbudDeviceLeftSizeResult(leftSize=" + this.leftSize + ", status=" + this.status + ")";
    }

    public /* synthetic */ EarbudDeviceLeftSizeResult(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 1 : i2);
    }
}
