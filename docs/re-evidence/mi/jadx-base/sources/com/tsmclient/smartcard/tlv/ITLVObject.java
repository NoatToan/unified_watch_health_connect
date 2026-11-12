package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;

/* JADX INFO: loaded from: classes6.dex */
public interface ITLVObject {
    ByteArray getLength();

    ByteArray getTag();

    ITLVValue getValue();
}
