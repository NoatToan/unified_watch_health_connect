package com.xiaomi.fitness.nfc.exception;

import com.miui.tsmclient.sesdk.MifareClassicTag;

/* JADX INFO: loaded from: classes9.dex */
public class SupperCardException extends Exception {
    public MifareClassicTag mifareClassicTag;

    public SupperCardException(MifareClassicTag mifareClassicTag) {
        this.mifareClassicTag = mifareClassicTag;
    }
}
