package com.huami.treadmill.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/data/ConnectStatus;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "CONNECTING", "CONNECTED", "DISCONNECTED", "CONNECTING_TIMEOUT", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public enum ConnectStatus {
    CONNECTING(0),
    CONNECTED(1),
    DISCONNECTED(2),
    CONNECTING_TIMEOUT(3);

    ConnectStatus(int i) {
    }
}
