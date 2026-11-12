package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdFlashSetProtectBit;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_01_Unlock extends FotaStage {
    private static final String f = "AirohaFota01_Unlock";

    public FotaStage_01_Unlock(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FLASH_SET_PROTECT_BIT;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFlashSetProtectBit raceCmdFlashSetProtectBit = new RaceCmdFlashSetProtectBit(new byte[]{0});
        this.mCmdPacketQueue.offer(raceCmdFlashSetProtectBit);
        this.mCmdPacketMap.put(f, raceCmdFlashSetProtectBit);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "RACE_FLASH_SET_PROTECT_BIT resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
