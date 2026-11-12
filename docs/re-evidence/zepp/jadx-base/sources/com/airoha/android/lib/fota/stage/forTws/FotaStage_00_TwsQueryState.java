package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaTwsQueryState;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_TwsQueryState extends FotaStage {
    private static final String f = "AirohaFota00_TwsQueryState";

    public FotaStage_00_TwsQueryState(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FOTA_DUAL_DEVICES_QUERY_STATE;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsQueryState;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaTwsQueryState raceCmdFotaTwsQueryState = new RaceCmdFotaTwsQueryState();
        this.mRaceId = raceCmdFotaTwsQueryState.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaTwsQueryState);
        this.mCmdPacketMap.put(f, raceCmdFotaTwsQueryState);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            this.mOtaMgr.setAgentClientFotaState(new byte[]{bArr[7], bArr[8]}, new byte[]{bArr[9], bArr[10]});
        }
    }
}
