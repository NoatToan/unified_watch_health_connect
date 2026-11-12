package com.huawei.health.basesport.wearengine;

import defpackage.dey;

/* JADX INFO: loaded from: classes7.dex */
public interface DataReceiver {
    default boolean isMatch(int i) {
        return true;
    }

    void onDataReceived(dey deyVar, int i, byte[] bArr);
}
