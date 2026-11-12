package com.huami.bluetooth.profile.channel.module.openapp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.thanosfisherman.wifiutils.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/RealtimeHrState;", "", "", "state", LogUtil.I, "getState", "()I", "<init>", "(Ljava/lang/String;II)V", "STOP", a.a, "KEEP", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum RealtimeHrState {
    STOP(0),
    OPEN(1),
    KEEP(2);

    private final int state;

    RealtimeHrState(int i) {
        this.state = i;
    }

    public final int getState() {
        return this.state;
    }
}
