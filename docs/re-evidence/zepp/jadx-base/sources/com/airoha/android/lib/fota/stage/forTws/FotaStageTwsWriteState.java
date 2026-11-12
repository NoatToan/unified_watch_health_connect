package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaTwsWriteState;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStageTwsWriteState extends FotaStage {
    private static final String g = "AirohaFotaTwsWriteState";
    private int f;

    public FotaStageTwsWriteState(AirohaRaceOtaMgr airohaRaceOtaMgr, int i) {
        super(airohaRaceOtaMgr);
        this.f = i;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsWriteState;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        int i = this.f;
        RaceCmdFotaTwsWriteState raceCmdFotaTwsWriteState = new RaceCmdFotaTwsWriteState(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i >> 8) & 255)});
        this.mRaceId = raceCmdFotaTwsWriteState.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaTwsWriteState);
        this.mCmdPacketMap.put(g, raceCmdFotaTwsWriteState);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(g, "RACE_FOTA_WRITE_STATE resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(g);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
