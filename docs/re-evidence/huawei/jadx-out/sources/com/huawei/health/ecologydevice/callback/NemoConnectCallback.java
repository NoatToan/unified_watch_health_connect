package com.huawei.health.ecologydevice.callback;

import defpackage.elf;

/* JADX INFO: loaded from: classes27.dex */
public interface NemoConnectCallback {
    void connectAndSendSuccess(elf elfVar);

    void connectOrSendError(String str);
}
