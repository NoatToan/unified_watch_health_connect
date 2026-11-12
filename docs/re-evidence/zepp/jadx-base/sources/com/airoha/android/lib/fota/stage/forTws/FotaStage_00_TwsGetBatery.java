package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdTwsGetBattery;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_TwsGetBatery extends FotaStage {
    private static final String h = "AirohaFota00_TwsGetBatery";
    private byte f;
    private byte g;

    public FotaStage_00_TwsGetBatery(AirohaRaceOtaMgr airohaRaceOtaMgr, byte b) {
        super(airohaRaceOtaMgr);
        this.f = (byte) 0;
        this.g = (byte) 0;
        this.f = b;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsGetBatery;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdTwsGetBattery raceCmdTwsGetBattery = new RaceCmdTwsGetBattery(new byte[]{this.f});
        this.mRaceId = raceCmdTwsGetBattery.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdTwsGetBattery);
        this.mCmdPacketMap.put(h, raceCmdTwsGetBattery);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(h, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(h);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            byte b2 = bArr[7];
            byte b3 = bArr[8];
            this.mAirohaLink.logToFile(h, String.format("agentOrClient: %d, batteryStatus: %d", Byte.valueOf(b2), Byte.valueOf(b3)));
            int i3 = b3 & 255;
            this.mOtaMgr.notifyBatteryStatus(b2, i3);
            if (i3 >= this.mOtaMgr.getBatteryThrd()) {
                this.mOtaMgr.setFlashOperationAllowed(true);
                return;
            }
            this.mOtaMgr.notifyBatteryLevelLow();
            this.mOtaMgr.setFlashOperationAllowed(false);
            this.mIsErrorOccurred = true;
            this.mErrorCode = ErrorEnum.BATTERY_LOW;
        }
    }
}
