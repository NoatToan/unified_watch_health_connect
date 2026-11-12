package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdStoragePartitionErase extends RacePacket {
    private byte l;
    private byte[] m;
    private byte[] n;

    public RaceCmdStoragePartitionErase(byte b, byte[] bArr, byte[] bArr2) {
        super(RaceType.CMD_NEED_RESP, 1028);
        byte[] bArr3 = new byte[9];
        bArr3[0] = b;
        System.arraycopy(bArr, 0, bArr3, 1, 4);
        System.arraycopy(bArr2, 0, bArr3, 4, 4);
        super.setPayload(bArr3);
        super.setAddr(bArr2);
    }
}
