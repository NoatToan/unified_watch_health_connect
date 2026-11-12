package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdTwsFlashPartitionErase extends RacePacket {
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;

    public RaceCmdTwsFlashPartitionErase(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FLASH_DUAL_DEVICES_PARTITION_ERASE);
        this.l = new byte[4];
        this.m = new byte[4];
        this.n = new byte[4];
        this.o = new byte[4];
        this.l = bArr;
        this.m = bArr2;
        this.n = bArr3;
        this.o = bArr4;
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr, 0, bArr5, 0, 4);
        System.arraycopy(this.m, 0, bArr5, 4, 4);
        System.arraycopy(this.n, 0, bArr5, 8, 4);
        System.arraycopy(this.o, 0, bArr5, 12, 4);
        super.setPayload(bArr5);
        setAddr(bArr2);
        setClientAddr(bArr4);
    }
}
