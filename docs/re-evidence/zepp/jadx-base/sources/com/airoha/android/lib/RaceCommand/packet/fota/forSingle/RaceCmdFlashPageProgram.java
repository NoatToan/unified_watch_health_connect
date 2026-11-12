package com.airoha.android.lib.RaceCommand.packet.fota.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdFlashPageProgram extends RacePacket {
    public RaceCmdFlashPageProgram(byte[] bArr) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_FLASH_PAGE_PROGRAM, bArr);
        setAddr(new byte[]{bArr[1], bArr[2], bArr[3], bArr[4]});
    }
}
