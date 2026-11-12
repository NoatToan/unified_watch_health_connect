package com.airoha.android.lib.logdump.offlinedump;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageGetOfflineDumpAddress extends MmiStage {
    public String f;

    public StageGetOfflineDumpAddress(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.f = "StageGetDumpAddress";
        this.mRaceId = RaceId.RACE_GET_OFFLINE_DUMP_ADDR;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        placeCmd(new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId));
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.f, "RACE_GET_OFFLINE_DUMP_ADDR resp status: " + ((int) b));
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
