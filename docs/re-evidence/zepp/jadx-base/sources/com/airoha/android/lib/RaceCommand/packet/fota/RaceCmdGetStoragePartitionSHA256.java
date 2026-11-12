package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdGetStoragePartitionSHA256 extends RacePacket {
    private byte[] l;
    private byte[] m;
    private byte n;
    private byte o;

    public RaceCmdGetStoragePartitionSHA256(byte b, byte b2, byte[] bArr, byte[] bArr2) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_STORAGE_GET_PARTITION_SHA256, (byte[]) null);
        this.l = new byte[4];
        this.m = new byte[4];
        this.l = bArr;
        this.m = bArr2;
        this.n = b;
        this.o = b2;
        byte[] bArr3 = new byte[10];
        bArr3[0] = b2;
        bArr3[1] = b;
        System.arraycopy(bArr, 0, bArr3, 2, 4);
        System.arraycopy(this.m, 0, bArr3, 6, 4);
        super.setPayload(bArr3);
        setAddr(bArr);
    }

    public byte getRole() {
        return this.n;
    }

    public byte getStorageType() {
        return this.o;
    }
}
