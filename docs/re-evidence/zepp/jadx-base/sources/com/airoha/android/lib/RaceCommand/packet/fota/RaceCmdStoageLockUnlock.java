package com.airoha.android.lib.RaceCommand.packet.fota;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdStoageLockUnlock extends RacePacket {
    public RaceCmdStoageLockUnlock(byte b, byte b2, byte b3) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_STORAGE_LOCK_UNLOCK);
        super.setPayload(new byte[]{b, b2, b3});
    }
}
