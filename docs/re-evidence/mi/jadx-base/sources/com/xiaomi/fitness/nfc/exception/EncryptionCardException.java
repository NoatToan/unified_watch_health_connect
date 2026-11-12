package com.xiaomi.fitness.nfc.exception;

import com.miui.tsmclient.entity.MifareTag;

/* JADX INFO: loaded from: classes9.dex */
public class EncryptionCardException extends Exception {
    public MifareTag mifareTag;

    public EncryptionCardException(MifareTag mifareTag) {
        this.mifareTag = mifareTag;
    }
}
