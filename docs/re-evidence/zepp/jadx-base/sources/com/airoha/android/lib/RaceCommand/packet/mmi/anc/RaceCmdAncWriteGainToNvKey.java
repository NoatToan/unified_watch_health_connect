package com.airoha.android.lib.RaceCommand.packet.mmi.anc;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdAncWriteGainToNvKey extends RacePacket {
    public RaceCmdAncWriteGainToNvKey(byte b, byte b2) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_ANC_WRITE_GAIN_TO_NVKEY);
        super.setPayload(new byte[]{b, b2});
    }
}
