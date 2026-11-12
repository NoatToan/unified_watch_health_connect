package com.tsmclient.smartcard.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class GetDataCommand extends BaseCommand {
    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getCls() {
        return (byte) -128;
    }

    @Override // com.tsmclient.smartcard.apdu.BaseCommand, com.tsmclient.smartcard.apdu.ISmartCardCommand
    public byte getIns() {
        return (byte) -54;
    }
}
