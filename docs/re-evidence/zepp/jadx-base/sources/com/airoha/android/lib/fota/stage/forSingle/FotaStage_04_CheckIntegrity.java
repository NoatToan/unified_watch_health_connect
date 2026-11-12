package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdFotaIntegrityCheck;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_04_CheckIntegrity extends FotaStage {
    private static final String f = "AirohaFota04_CheckIntegrity";

    public FotaStage_04_CheckIntegrity(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FOTA_INTEGRITY_CHECK;
        this.mFotaStageIndex = FotaStageEnum.CheckIntegrity;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaIntegrityCheck raceCmdFotaIntegrityCheck = new RaceCmdFotaIntegrityCheck(new byte[]{this.mOtaMgr.getFotaStorageType()});
        this.mCmdPacketQueue.offer(raceCmdFotaIntegrityCheck);
        this.mCmdPacketMap.put(f, raceCmdFotaIntegrityCheck);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "RACE_FOTA_INTEGRITY_CHECK resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            byte b2 = bArr[7];
            this.mAirohaLink.logToFile(f, "storageType:" + ((int) b2));
        }
    }
}
