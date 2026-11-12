package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/StopTransferResult;", "", "", "a", LogUtil.I, "getCode", "()I", "code", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class StopTransferResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    public StopTransferResult() {
        this(0, 1, null);
    }

    public StopTransferResult(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public /* synthetic */ StopTransferResult(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
