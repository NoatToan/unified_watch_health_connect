package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/StartTransferResult;", "", "", "isSuccess", "", "component1", "", "component2", "code", "crc", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "J", "getCrc", "()J", "<init>", "(IJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StartTransferResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long crc;

    public StartTransferResult() {
        this(0, 0L, 3, null);
    }

    public StartTransferResult(int i, long j) {
        this.code = i;
        this.crc = j;
    }

    public static /* synthetic */ StartTransferResult copy$default(StartTransferResult startTransferResult, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = startTransferResult.code;
        }
        if ((i2 & 2) != 0) {
            j = startTransferResult.crc;
        }
        return startTransferResult.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCrc() {
        return this.crc;
    }

    @NotNull
    public final StartTransferResult copy(int code, long crc) {
        return new StartTransferResult(code, crc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartTransferResult)) {
            return false;
        }
        StartTransferResult startTransferResult = (StartTransferResult) other;
        return this.code == startTransferResult.code && this.crc == startTransferResult.crc;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getCrc() {
        return this.crc;
    }

    public int hashCode() {
        return (this.code * 31) + b.a(this.crc);
    }

    public final boolean isSuccess() {
        return GDSPErrorCode.INSTANCE.fromValue(this.code) == GDSPErrorCode.SUCCESS;
    }

    @NotNull
    public String toString() {
        return "StartTransferResult(code=" + this.code + ", crc=" + this.crc + ')';
    }

    public /* synthetic */ StartTransferResult(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }
}
