package com.huawei.wisesecurity.kfs.crypto.cipher;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface KfsCipher {
    DecryptHandler getDecryptHandler() throws ynz;

    EncryptHandler getEncryptHandler() throws ynz;
}
