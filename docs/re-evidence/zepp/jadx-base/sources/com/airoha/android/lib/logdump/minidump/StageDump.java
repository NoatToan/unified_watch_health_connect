package com.airoha.android.lib.logdump.minidump;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageDump extends MmiStage {
    public String f;
    public byte[] payload;

    public StageDump(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.f = "StageDump";
        this.payload = new byte[6];
        this.mRaceId = 1027;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        placeCmd(new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId, this.payload));
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.f, "RACE_FLASH_PAGE_READ resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }

    public void placeCmd(RacePacket racePacket) {
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.f, racePacket);
    }
}
