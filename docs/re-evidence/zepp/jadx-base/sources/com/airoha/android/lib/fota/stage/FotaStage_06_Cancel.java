package com.airoha.android.lib.fota.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_06_Cancel extends FotaStage {
    private static final String h = "AirohaFota06_Cancel";
    private boolean f;
    private byte g;

    public FotaStage_06_Cancel(AirohaRaceOtaMgr airohaRaceOtaMgr, boolean z, byte b) {
        super(airohaRaceOtaMgr);
        this.f = false;
        this.mRaceId = RaceId.RACE_FOTA_STOP;
        this.f = z;
        this.g = b;
        this.mFotaStageIndex = FotaStageEnum.Cancel;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_STOP, new byte[]{7, this.f ? (byte) 3 : (byte) 1, this.g});
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(h, racePacket);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(h, "RACE_FOTA_STOP resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(h);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            RacePacket.setIsFotaStarted(false);
            this.mOtaMgr.notifyAppListenerError(FotaStageEnum.None, ErrorEnum.USER_CANCELLED);
        }
    }
}
