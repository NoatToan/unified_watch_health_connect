package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdWriteNv extends RacePacket {
    public RaceCmdWriteNv(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY, bArr);
    }

    public RaceCmdWriteNv(int i, byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY, (byte[]) null);
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) ((i >> 8) & 255);
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        super.setPayload(bArr2);
    }
}
