package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdFotaActiveFotaPreparation extends RacePacket {
    public RaceCmdFotaActiveFotaPreparation(byte b) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_ACTIVE_FOTA_PREPARATION, new byte[]{b});
    }
}
