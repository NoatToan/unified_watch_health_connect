package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetVpIndex extends MmiStage {
    public byte f;

    public MmiStageSetVpIndex(AirohaMmiMgr airohaMmiMgr, byte b) {
        super(airohaMmiMgr);
        this.f = (byte) 0;
        this.f = b;
        this.mRaceId = 2304;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArr = {0, 0, this.f};
        System.arraycopy(Converter.shortToBytes((short) 4), 0, bArr, 0, 2);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 2304, bArr);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageSetVpIndex resp packet: " + Converter.byte2HexStr(bArr));
        if (i == 2304 && bArr[8] == 0) {
            this.mMmiMgr.notifySetVpIndex(bArr[8]);
            RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
            if (b == 0) {
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
