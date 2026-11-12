package com.airoha.android.lib.fota.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaActiveFotaPreparation;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_TwsActiveFotaPreparation extends FotaStage {
    private static String g = "AirohaFota00_TwsActiveFotaPreparation";
    private byte f;

    public FotaStage_00_TwsActiveFotaPreparation(AirohaRaceOtaMgr airohaRaceOtaMgr, byte b) {
        super(airohaRaceOtaMgr);
        this.f = (byte) 0;
        this.f = b;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsActiveFotaPreparation;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaActiveFotaPreparation raceCmdFotaActiveFotaPreparation = new RaceCmdFotaActiveFotaPreparation(this.f);
        this.mRaceId = raceCmdFotaActiveFotaPreparation.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaActiveFotaPreparation);
        this.mCmdPacketMap.put(g, raceCmdFotaActiveFotaPreparation);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != this.mRaceRespType) {
            return;
        }
        this.mAirohaLink.logToFile(g, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(g);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mAirohaLink.logToFile(g, String.format("agentOrClient: %d", Byte.valueOf(bArr[7])));
        }
    }
}
