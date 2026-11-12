package com.tsmclient.smartcard.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class SelectCommand extends BaseCommand {
    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getIns() {
        return (byte) -92;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getP2() {
        return (byte) 0;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand
    public void setCls(byte b2) {
        super.setCls(b2);
    }
}
