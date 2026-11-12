package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdFotaGetVersion extends RacePacket {
    public RaceCmdFotaGetVersion(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_GET_VERSION, bArr);
    }
}
