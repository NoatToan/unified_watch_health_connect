package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdCheckAgentChannel;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_CheckAgentChannel extends FotaStage {
    private static final String f = "AirohaFota00_CheckAgentChannel";

    public FotaStage_00_CheckAgentChannel(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mFotaStageIndex = FotaStageEnum.CheckAgentChannel;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdCheckAgentChannel raceCmdCheckAgentChannel = new RaceCmdCheckAgentChannel();
        this.mRaceId = raceCmdCheckAgentChannel.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdCheckAgentChannel);
        this.mCmdPacketMap.put(f, raceCmdCheckAgentChannel);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 91) {
            return;
        }
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mOtaMgr.setAgentIsRight(bArr[7] == 1);
        }
    }
}
