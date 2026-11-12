package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdFotaCommit;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_05_Commit extends FotaStage implements IAirohaFotaStage {
    private static final String f = "AirohaFota05_Commit";

    public FotaStage_05_Commit(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FOTA_COMMIT;
        this.mFotaStageIndex = FotaStageEnum.Commit;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaCommit raceCmdFotaCommit = new RaceCmdFotaCommit();
        this.mCmdPacketQueue.offer(raceCmdFotaCommit);
        this.mCmdPacketMap.put(f, raceCmdFotaCommit);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mOtaMgr.notifySingleAction(SingleActionEnum.FotaComplete);
        }
    }
}
