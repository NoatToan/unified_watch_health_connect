package com.huami.bluetooth.profile.ecf;

import com.alipay.sdk.m.f0.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfState;", "", "", "getValue", "value", "B", "code", "<init>", "(Ljava/lang/String;IB)V", "RESERVED", c.p, "INVALID_STATE", "OPERATION_FAILED", "UNKNOW_COMMAND", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum EcfState {
    RESERVED((byte) 0),
    SUCCESS((byte) 1),
    INVALID_STATE((byte) 2),
    OPERATION_FAILED((byte) 3),
    UNKNOW_COMMAND((byte) 5);

    private final byte value;

    EcfState(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
