package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdGetInternalFlashPartitionSHA256 extends RacePacket {
    private byte[] l;
    private byte[] m;
    private byte n;

    public RaceCmdGetInternalFlashPartitionSHA256(byte[] bArr, byte[] bArr2, byte b) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_GET_INTERNAL_FLASH_PARTITION_SHA256, (byte[]) null);
        this.l = new byte[4];
        this.m = new byte[4];
        this.l = bArr;
        this.m = bArr2;
        this.n = b;
        byte[] bArr3 = new byte[9];
        System.arraycopy(bArr, 0, bArr3, 0, 4);
        System.arraycopy(this.m, 0, bArr3, 4, 4);
        bArr3[8] = this.n;
        super.setPayload(bArr3);
        setAddr(bArr);
    }

    public byte getRole() {
        return this.n;
    }
}
