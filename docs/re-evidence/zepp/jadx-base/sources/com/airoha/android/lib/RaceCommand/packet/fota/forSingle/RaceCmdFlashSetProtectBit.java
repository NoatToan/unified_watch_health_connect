package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdFlashSetProtectBit extends RacePacket {
    public static final byte PROTECT_BIT_LOCK = 15;
    public static final byte PROTECT_BIT_UNLOCK = 0;

    public RaceCmdFlashSetProtectBit(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FLASH_SET_PROTECT_BIT, bArr);
    }
}
