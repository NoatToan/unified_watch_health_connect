package com.airoha.android.lib.RaceCommand.packet.mmi.anc;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdAncOn extends RacePacket {
    public RaceCmdAncOn() {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_ANC_ON, new byte[]{1});
    }
}
