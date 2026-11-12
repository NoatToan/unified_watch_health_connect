package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdSoftReset extends RacePacket {
    public RaceCmdSoftReset() {
        super(RaceType.CMD_NO_RESP, RaceId.RACE_SOFTWARE_RESET, (byte[]) null);
    }
}
