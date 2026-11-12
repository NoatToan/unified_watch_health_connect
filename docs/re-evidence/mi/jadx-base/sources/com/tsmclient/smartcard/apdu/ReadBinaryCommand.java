package com.tsmclient.smartcard.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class ReadBinaryCommand extends BaseCommand {
    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getCls() {
        return (byte) 0;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getIns() {
        return (byte) -80;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getP2() {
        return (byte) 0;
    }
}
