package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceFotaGetPartitionEraseStatus extends RacePacket {
    private byte l;
    private byte[] m;
    private byte[] n;
    private byte o;

    public RaceFotaGetPartitionEraseStatus(byte b, byte b2, byte[] bArr, byte[] bArr2) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_GET_PARTITION_ERASE_STATUS, (byte[]) null);
        this.m = new byte[4];
        this.n = new byte[4];
        this.l = b2;
        this.m = bArr;
        this.n = bArr2;
        this.o = b;
        byte[] bArr3 = new byte[10];
        bArr3[0] = b;
        bArr3[1] = b2;
        System.arraycopy(bArr, 0, bArr3, 2, 4);
        System.arraycopy(this.n, 0, bArr3, 6, 4);
        super.setPayload(bArr3);
        setAddr(bArr);
    }

    public byte getRole() {
        return this.o;
    }
}
