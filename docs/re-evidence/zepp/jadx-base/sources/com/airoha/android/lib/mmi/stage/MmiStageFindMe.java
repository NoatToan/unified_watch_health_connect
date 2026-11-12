package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageFindMe extends MmiStage {
    private byte f;
    private byte g;
    private byte h;

    public MmiStageFindMe(AirohaMmiMgr airohaMmiMgr, byte b, byte b2, byte b3) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_FIND_ME;
        this.mRaceRespType = RaceType.RESPONSE;
        this.f = b;
        this.g = b2;
        this.h = b3;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.f);
        byteArrayOutputStream.write(this.g);
        byteArrayOutputStream.write(this.h);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_FIND_ME, byteArrayOutputStream.toByteArray());
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_FIND_ME resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }
}
