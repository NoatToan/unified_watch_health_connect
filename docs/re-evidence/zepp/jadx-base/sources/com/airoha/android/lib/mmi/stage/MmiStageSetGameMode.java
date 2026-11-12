package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetGameMode extends MmiStage {
    public boolean f;

    public MmiStageSetGameMode(AirohaMmiMgr airohaMmiMgr, boolean z) {
        super(airohaMmiMgr);
        this.f = z;
        this.mRaceId = RaceId.RACE_MMI_KEY_COMMAND;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.f) {
            byteArrayOutputStream.write(-92);
            byteArrayOutputStream.write(0);
        } else {
            byteArrayOutputStream.write(-91);
            byteArrayOutputStream.write(0);
        }
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId, byteArrayOutputStream.toByteArray());
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        byte b2 = bArr[6];
        this.mAirohaLink.logToFile(this.TAG, "MmiStageSetGameMode resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b2 != 0) {
            this.mMmiMgr.notifyGameModeStatueChanged(!this.f);
        } else {
            this.mMmiMgr.notifyGameModeStatueChanged(this.f);
            racePacket.setIsRespStatusSuccess();
        }
    }
}
