package com.xiaomi.hm.health.bt.debug;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogAction;", "", "", "isWrite", "", "a", LogUtil.I, "action", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class BleLogAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int action;

    public BleLogAction(int i) {
        this.action = i;
    }

    public final boolean isWrite() {
        return this.action == 1;
    }
}
