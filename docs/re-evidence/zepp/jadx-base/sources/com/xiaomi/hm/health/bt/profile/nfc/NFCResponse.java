package com.xiaomi.hm.health.bt.profile.nfc;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/NFCResponse;", "", "", "isSuccessful", "isBlackList", "isFailure", "isOverdraftNegative", "isAllPositive", "", "a", LogUtil.I, "errorCode", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NFCResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorCode;

    public NFCResponse(int i) {
        this.errorCode = i;
    }

    public final boolean isAllPositive() {
        return this.errorCode == -103;
    }

    public final boolean isBlackList() {
        return this.errorCode == -101;
    }

    public final boolean isFailure() {
        return this.errorCode == -100;
    }

    public final boolean isOverdraftNegative() {
        return this.errorCode == -102;
    }

    public final boolean isSuccessful() {
        return this.errorCode == 0;
    }
}
