package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

/* JADX INFO: loaded from: classes2.dex */
public class StoragePageData {
    public byte CRC;
    public byte[] Data;
    public byte[] StorageAddress;

    public StoragePageData(byte b, byte[] bArr, byte[] bArr2) {
        this.CRC = b;
        this.StorageAddress = bArr;
        this.Data = bArr2;
    }

    public byte[] getAddress() {
        return this.StorageAddress;
    }

    public byte[] toRaw() {
        byte[] bArr = new byte[261];
        bArr[0] = this.CRC;
        byte[] bArr2 = this.StorageAddress;
        System.arraycopy(bArr2, 0, bArr, 1, bArr2.length);
        byte[] bArr3 = this.Data;
        System.arraycopy(bArr3, 0, bArr, 5, bArr3.length);
        return bArr;
    }
}
