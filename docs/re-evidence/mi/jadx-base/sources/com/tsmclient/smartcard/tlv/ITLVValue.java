package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ITLVValue {
    ITLVObject findTLV(ByteArray byteArray) throws TagNotFoundException;

    List<ITLVObject> findTLVList(ByteArray byteArray) throws TagNotFoundException;

    ByteArray toBytes();
}
