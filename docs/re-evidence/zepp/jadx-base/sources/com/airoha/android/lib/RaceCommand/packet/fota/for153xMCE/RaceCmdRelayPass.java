package com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.stage.for153xMCE.Dst;

/* JADX INFO: loaded from: classes2.dex */
public class RaceCmdRelayPass extends RacePacket {
    public RaceCmdRelayPass() {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_RELAY_PASS_TO_DST);
    }

    public RaceCmdRelayPass(Dst dst, RacePacket racePacket) {
        super(RaceType.CMD_NEED_RESP, RaceId.RACE_RELAY_PASS_TO_DST);
        byte[] raw = racePacket.getRaw();
        byte[] bArr = new byte[raw.length + 2];
        System.arraycopy(dst.toRaw(), 0, bArr, 0, 2);
        System.arraycopy(raw, 0, bArr, 2, raw.length);
        setPayload(bArr);
    }
}
