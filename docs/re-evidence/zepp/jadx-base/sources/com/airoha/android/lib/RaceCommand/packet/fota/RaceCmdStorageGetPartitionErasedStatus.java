package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdStorageGetPartitionErasedStatus extends RacePacket {
    private byte l;
    private byte[] m;
    private byte[] n;
    private byte o;

    public RaceCmdStorageGetPartitionErasedStatus(byte b, byte b2, byte[] bArr, byte[] bArr2) {
        super(RaceType.CMD_NEED_RESP, 1075);
        this.m = new byte[4];
        this.n = new byte[4];
        this.l = b2;
        this.m = bArr;
        this.n = bArr2;
        this.o = b;
        byte[] bArr3 = new byte[10];
        bArr3[0] = b2;
        bArr3[1] = b;
        System.arraycopy(bArr, 0, bArr3, 2, 4);
        System.arraycopy(this.n, 0, bArr3, 6, 4);
        super.setPayload(bArr3);
        setAddr(bArr);
    }

    public byte getRole() {
        return this.o;
    }
}
