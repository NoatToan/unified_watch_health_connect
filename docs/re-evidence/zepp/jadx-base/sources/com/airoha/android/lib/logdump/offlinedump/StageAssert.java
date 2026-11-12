package com.airoha.android.lib.logdump.offlinedump;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageAssert extends MmiStage {
    public String f;

    public StageAssert(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.f = "StageAssert";
        this.mRaceId = RaceId.RACE_TOOL_ASSERT;
        this.mRaceRespType = RaceType.CMD_NO_RESP;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        placeCmd(new RacePacket(RaceType.CMD_NO_RESP, this.mRaceId));
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
    }

    public void placeCmd(RacePacket racePacket) {
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.f, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void poolCmdToSend() {
        RacePacket racePacketPoll = this.mCmdPacketQueue.poll();
        if (racePacketPoll != null) {
            this.mAirohaLink.sendCommand(racePacketPoll.getRaw());
            if (racePacketPoll.isNeedResp()) {
                this.mMmiMgr.startRespTimer();
            } else {
                this.mMmiMgr.cancelCurrentStage();
            }
        }
    }
}
