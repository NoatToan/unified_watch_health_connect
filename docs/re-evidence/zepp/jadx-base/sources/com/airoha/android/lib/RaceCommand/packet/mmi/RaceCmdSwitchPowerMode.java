package com.airoha.android.lib.RaceCommand.packet.mmi;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdSwitchPowerMode extends RacePacket {
    public RaceCmdSwitchPowerMode(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_SWITCH_POWER_MODE, bArr);
    }
}
