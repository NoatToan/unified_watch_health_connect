package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "", "", "isOk", "", "toString", "", "a", LogUtil.I, "getCode", "()I", "code", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UpgradeResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    public UpgradeResponse(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean isOk() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "UpgradeResponse(code=" + this.code + ')';
    }
}
