package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageAncOff extends MmiStage {
    public MmiStageAncOff(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = 3590;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(11);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 3590, byteArrayOutputStream.toByteArray());
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (bArr[7] != 11) {
            return;
        }
        this.mAirohaLink.logToFile(this.TAG, "MmiStageAncOff resp status: " + ((int) b));
        this.mMmiMgr.notifyAncTurnOff(b);
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
