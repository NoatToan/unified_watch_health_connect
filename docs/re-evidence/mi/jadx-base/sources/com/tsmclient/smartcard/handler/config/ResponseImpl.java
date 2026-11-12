package com.tsmclient.smartcard.handler.config;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class ResponseImpl implements ScResponse {
    private ByteArray mData;
    private byte[] mResponseBytes;
    private ByteArray mStatus;

    public ResponseImpl(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length < 2) {
            throw new IOException("response length is illegal");
        }
        this.mResponseBytes = bArr;
        ByteArray byteArrayWrap = ByteArray.wrap(bArr);
        this.mData = byteArrayWrap.duplicate(0, byteArrayWrap.length() - 2);
        this.mStatus = byteArrayWrap.duplicate(byteArrayWrap.length() - 2, 2);
    }

    @Override // com.tsmclient.smartcard.terminal.response.ScResponse
    public ByteArray getData() {
        return this.mData;
    }

    @Override // com.tsmclient.smartcard.terminal.response.ScResponse
    public ByteArray getStatus() {
        return this.mStatus;
    }

    @Override // com.tsmclient.smartcard.terminal.response.ScResponse
    public byte[] toBytes() {
        return this.mResponseBytes;
    }

    public String toString() {
        return Coder.bytesToHexString(this.mResponseBytes);
    }
}
