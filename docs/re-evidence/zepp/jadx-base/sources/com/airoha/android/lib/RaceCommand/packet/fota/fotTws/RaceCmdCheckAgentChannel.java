package com.airoha.android.lib.RaceCommand.packet.fota.fotTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdCheckAgentChannel extends RacePacket {
    public RaceCmdCheckAgentChannel() {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_BLUETOOTH_IS_AGENT_RIGHT_DEVICE, (byte[]) null);
    }
}
