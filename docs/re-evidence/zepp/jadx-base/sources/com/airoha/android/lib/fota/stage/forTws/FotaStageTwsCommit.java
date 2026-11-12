package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaTwsCommit;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.actionEnum.DualActionEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStageTwsCommit extends FotaStage {
    private static final String f = "AirohaFota_TwsCommit";

    public FotaStageTwsCommit(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mFotaStageIndex = FotaStageEnum.TwsCommit;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaTwsCommit raceCmdFotaTwsCommit = new RaceCmdFotaTwsCommit();
        this.mRaceId = raceCmdFotaTwsCommit.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaTwsCommit);
        this.mCmdPacketMap.put(f, raceCmdFotaTwsCommit);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mOtaMgr.notifyDualAction(DualActionEnum.FotaComplete);
        }
    }
}
