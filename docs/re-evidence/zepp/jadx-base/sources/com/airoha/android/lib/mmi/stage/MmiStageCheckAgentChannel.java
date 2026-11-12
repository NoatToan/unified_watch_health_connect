package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdCheckAgentChannel;
import com.airoha.android.lib.mmi.AirohaMmiMgr;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageCheckAgentChannel extends MmiStage {
    private static final String f = "MmiStageCheckAgentChannel";

    public MmiStageCheckAgentChannel(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceRespType = RaceType.RESPONSE;
        this.mRaceId = RaceId.RACE_BLUETOOTH_IS_AGENT_RIGHT_DEVICE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RaceCmdCheckAgentChannel raceCmdCheckAgentChannel = new RaceCmdCheckAgentChannel();
        this.mRaceId = raceCmdCheckAgentChannel.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdCheckAgentChannel);
        this.mCmdPacketMap.put(f, raceCmdCheckAgentChannel);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 91) {
            return;
        }
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mMmiMgr.setAgentIsRight(bArr[7] == 1);
        }
    }
}
