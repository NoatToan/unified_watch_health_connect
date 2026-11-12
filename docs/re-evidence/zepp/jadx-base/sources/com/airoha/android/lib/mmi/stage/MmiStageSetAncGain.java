package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetAncGain extends MmiStage {
    public short f;

    public MmiStageSetAncGain(AirohaMmiMgr airohaMmiMgr, short s) {
        super(airohaMmiMgr);
        this.f = (short) 0;
        this.f = s;
        this.mRaceId = 3590;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArr = {0, 15, 0, 0};
        System.arraycopy(Converter.shortToBytes(this.f), 0, bArr, 2, 2);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 3590, bArr);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageSetAncPassThruGain resp packet: " + Converter.byte2HexStr(bArr));
        if (i == 3590 && bArr[6] == 0 && bArr[7] == 15) {
            this.mMmiMgr.notifySetAncPassThruGain(Converter.BytesToShort(bArr[9], bArr[8]));
            RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
            if (b == 0) {
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
