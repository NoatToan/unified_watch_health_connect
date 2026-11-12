package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdWriteState;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_WriteState extends FotaStage {
    private static final String g = "AirohaFota_WriteState";
    private int f;

    public FotaStage_WriteState(AirohaRaceOtaMgr airohaRaceOtaMgr, int i) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FOTA_WRITE_STATE;
        this.f = i;
        this.mFotaStageIndex = FotaStageEnum.WriteState;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        int i = this.f;
        RaceCmdWriteState raceCmdWriteState = new RaceCmdWriteState(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)});
        this.mCmdPacketQueue.offer(raceCmdWriteState);
        this.mCmdPacketMap.put(g, raceCmdWriteState);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(g, "RACE_FOTA_WRITE_STATE resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(g);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
