package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageQueryVPLanguage extends MmiStage {
    public MmiStageQueryVPLanguage(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM, Converter.shortToBytes((short) 2));
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageQueryVPLanguage resp packet: " + Converter.byte2HexStr(bArr));
        if (i == 2305 && bArr[8] == 0) {
            int i3 = bArr[9] * 2;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 10, bArr2, 0, i3);
            this.mMmiMgr.notifyQueryVpLanguage(bArr2);
            RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
            if (b == 0) {
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
