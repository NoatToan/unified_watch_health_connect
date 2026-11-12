package com.huawei.wisesecurity.kfs.crypto.signer;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface KfsSigner {
    SignHandler getSignHandler() throws ynz;

    VerifyHandler getVerifyHandler() throws ynz;
}
