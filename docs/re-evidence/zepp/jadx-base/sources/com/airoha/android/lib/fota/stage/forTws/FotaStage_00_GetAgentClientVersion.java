package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaGetVersion;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_GetAgentClientVersion extends FotaStage {
    private static final String g = "AirohaFota00_GetAgentClientVersion";
    private byte f;

    public FotaStage_00_GetAgentClientVersion(AirohaRaceOtaMgr airohaRaceOtaMgr, byte b) {
        super(airohaRaceOtaMgr);
        this.f = (byte) 0;
        this.f = b;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.GetAgentClientVersion;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaGetVersion raceCmdFotaGetVersion = new RaceCmdFotaGetVersion(new byte[]{this.f});
        this.mRaceId = raceCmdFotaGetVersion.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaGetVersion);
        this.mCmdPacketMap.put(g, raceCmdFotaGetVersion);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(g, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(g);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            char c = bArr[7];
            int i3 = bArr[8];
            if (i3 == 0) {
                return;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 9, bArr2, 0, i3);
            if (c == 0) {
                this.mOtaMgr.setAgentVersion(bArr2);
            } else if (c == 1) {
                this.mOtaMgr.setClientVersion(bArr2);
            }
        }
    }
}
