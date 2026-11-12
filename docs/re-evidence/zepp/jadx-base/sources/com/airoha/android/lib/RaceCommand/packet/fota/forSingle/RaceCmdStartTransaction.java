package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdStartTransaction extends RacePacket {
    public RaceCmdStartTransaction() {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_START_TRANSCATION, (byte[]) null);
    }
}
