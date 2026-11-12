package com.tsmclient.smartcard.apdu;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseCommand implements ISmartCardCommand {
    private byte mCls;
    private ByteArray mData = ByteArray.EMPTY;
    private byte mIns;
    private byte mP1;
    private byte mP2;

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getCls() {
        return this.mCls;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public ByteArray getData() {
        return this.mData;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getIns() {
        return this.mIns;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public int getLc() {
        return getData().length();
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public int getLe() {
        return 0;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getP1() {
        return this.mP1;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getP2() {
        return this.mP2;
    }

    public void setCls(byte b2) {
        this.mCls = b2;
    }

    public void setData(ByteArray byteArray) {
        this.mData = byteArray;
    }

    public void setIns(byte b2) {
        this.mIns = b2;
    }

    public void setP1(byte b2) {
        this.mP1 = b2;
    }

    public void setP2(byte b2) {
        this.mP2 = b2;
    }

    @Override // com.tsmclient.smartcard.apdu.ISmartCardCommand
    public ByteArray toRawAPDU() {
        ByteArray data = getData();
        byte[] bArr = new byte[data.length() + 5];
        bArr[0] = getCls();
        bArr[1] = getIns();
        bArr[2] = getP1();
        bArr[3] = getP2();
        if (data.length() > 0) {
            bArr[4] = (byte) data.length();
            System.arraycopy(data.toBytes(), 0, bArr, 5, data.length());
        }
        return ByteArray.wrap(bArr);
    }

    public String toString() {
        return Coder.bytesToHexString(toRawAPDU().toBytes());
    }
}
