package com.airoha.android.lib.logdump.airdump;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageAirDump extends MmiStage {
    private byte[] f;
    public byte[] payload;

    public StageAirDump(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.payload = new byte[1];
        this.mRaceId = RaceId.RACE_AIRDUMP_ONOFF;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId, this.payload);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
        this.f = racePacket.getRaw();
    }

    public byte[] getRaw() {
        return this.f;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_AIRDUMP_ONOFF resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
