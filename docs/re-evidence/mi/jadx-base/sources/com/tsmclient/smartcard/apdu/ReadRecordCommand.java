package com.tsmclient.smartcard.apdu;

import com.tsmclient.smartcard.ByteArray;

/* JADX INFO: loaded from: classes6.dex */
public class ReadRecordCommand extends BaseCommand {
    private byte mSfi = 0;

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getCls() {
        return (byte) 0;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getIns() {
        return (byte) -78;
    }

    public byte getSfi() {
        return this.mSfi;
    }

    public void setSfi(byte b2) {
        this.mSfi = b2;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public ByteArray toRawAPDU() {
        return getData().length() > 0 ? super.toRawAPDU() : ByteArray.wrap(new byte[]{getCls(), getIns(), getP1(), getP2(), getSfi()});
    }
}
