package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdTwsGetBattery;
import com.airoha.android.lib.mmi.AirohaMmiMgr;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageTwsGetBattery extends MmiStage {
    private byte f;
    private byte g;

    public MmiStageTwsGetBattery(AirohaMmiMgr airohaMmiMgr, byte b) {
        super(airohaMmiMgr);
        this.f = (byte) 0;
        this.g = (byte) 0;
        this.f = b;
        this.mRaceRespType = RaceType.INDICATION;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RaceCmdTwsGetBattery raceCmdTwsGetBattery = new RaceCmdTwsGetBattery(new byte[]{this.f});
        this.mRaceId = raceCmdTwsGetBattery.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdTwsGetBattery);
        this.mCmdPacketMap.put(this.TAG, raceCmdTwsGetBattery);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            byte b2 = bArr[7];
            byte b3 = bArr[8];
            this.mAirohaLink.logToFile(this.TAG, String.format("agentOrClient: %d, batteryStatus: %d", Byte.valueOf(b2), Byte.valueOf(b3)));
            this.mMmiMgr.notifyBattery(b2, b3);
        }
    }
}
