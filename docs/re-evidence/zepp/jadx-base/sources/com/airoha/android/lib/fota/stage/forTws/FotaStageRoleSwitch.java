package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdRoleSwitch;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStageRoleSwitch extends FotaStage {
    private static final String f = "AirohaFota_RoleSwitch";

    public FotaStageRoleSwitch(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mFotaStageIndex = FotaStageEnum.RoleSwitch;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdRoleSwitch raceCmdRoleSwitch = new RaceCmdRoleSwitch();
        this.mRaceId = raceCmdRoleSwitch.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdRoleSwitch);
        this.mCmdPacketMap.put(f, raceCmdRoleSwitch);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
