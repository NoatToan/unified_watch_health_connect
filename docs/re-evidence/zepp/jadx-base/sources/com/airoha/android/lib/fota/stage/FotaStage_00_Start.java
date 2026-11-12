package com.airoha.android.lib.fota.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_Start extends FotaStage {
    private static final String g = "AirohaFota00_Start";
    private boolean f;

    public FotaStage_00_Start(AirohaRaceOtaMgr airohaRaceOtaMgr, boolean z) {
        super(airohaRaceOtaMgr);
        this.f = false;
        this.mRaceId = RaceId.RACE_FOTA_START;
        this.f = z;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.Start;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_START, new byte[]{this.f ? (byte) 3 : (byte) 1, !this.mOtaMgr.isLongPacketMode() ? 1 : 0});
        RacePacket.setIsFotaStarted(true);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(g, racePacket);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(g, "RACE_FOTA_START resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(g);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        } else {
            this.mIsErrorOccurred = true;
            RacePacket.setIsFotaStarted(false);
        }
    }
}
