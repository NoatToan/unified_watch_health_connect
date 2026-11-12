package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageAncOn extends MmiStage {
    private byte f;
    private byte g;
    private boolean h;

    public MmiStageAncOn(AirohaMmiMgr airohaMmiMgr, byte b) {
        super(airohaMmiMgr);
        this.h = false;
        this.h = false;
        this.f = b;
        this.mRaceId = 3590;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(this.f);
        if (this.h) {
            byteArrayOutputStream.write(this.g);
        }
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 3590, byteArrayOutputStream.toByteArray());
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (bArr[7] != 10) {
            return;
        }
        this.mAirohaLink.logToFile(this.TAG, "MmiStageAncOn resp status: " + ((int) b));
        if (this.f == 5) {
            this.mMmiMgr.notifyPassThrough(b);
        } else {
            this.mMmiMgr.notifyAncTurnOn(b);
        }
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }

    public MmiStageAncOn(AirohaMmiMgr airohaMmiMgr, byte b, byte b2) {
        super(airohaMmiMgr);
        this.h = false;
        this.h = true;
        this.f = b;
        this.g = b2;
        this.mRaceId = 3590;
        this.mRaceRespType = RaceType.RESPONSE;
    }
}
