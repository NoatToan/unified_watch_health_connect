package com.xiaomi.fitness.nfc.bean;

import com.miui.tsmclient.common.util.Coder;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.vqg;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public class NfcResponse {
    public byte[] mData;
    public int mStatus;

    public NfcResponse() {
        this.mStatus = -1;
    }

    public String getMsg() {
        byte[] bArr = this.mData;
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public boolean isSuccess() {
        int i = this.mStatus;
        return i == 224 || i == 1;
    }

    public NfcResponse(SyncResult syncResult) {
        this.mStatus = -1;
        if (syncResult == null || syncResult.getPacket() == null || syncResult.getPacket().B() == null || syncResult.getPacket().B().v() == null) {
            return;
        }
        byte[] bArrV = syncResult.getPacket().B().v();
        vqg.d("Sender receive data = " + Coder.byteArrayToString(bArrV, true));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrV);
        this.mStatus = byteBufferWrap.getInt();
        byte[] bArr = new byte[byteBufferWrap.getShort()];
        this.mData = bArr;
        byteBufferWrap.get(bArr);
    }
}
