package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/PrepareResponse;", "", "", "toString", "", "isOk", "", "a", LogUtil.I, "getCode", "()I", "code", "b", "getReceiveSize", "receiveSize", "", "c", "J", "getReceiveDataCrc", "()J", "receiveDataCrc", "<init>", "(IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PrepareResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int receiveSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long receiveDataCrc;

    public PrepareResponse(int i, int i2, long j) {
        this.code = i;
        this.receiveSize = i2;
        this.receiveDataCrc = j;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getReceiveDataCrc() {
        return this.receiveDataCrc;
    }

    public final int getReceiveSize() {
        return this.receiveSize;
    }

    public final boolean isOk() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "PrepareResponse(code=" + this.code + ", receiveSize=" + this.receiveSize + ", receiveDataCrc=" + this.receiveDataCrc + ')';
    }
}
