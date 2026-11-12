package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageGetAudioPath extends MmiStage {
    public byte[] f;

    public MmiStageGetAudioPath(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        this.f = Converter.shortToBytes((short) 10);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM, this.f);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageGetAudioPath resp packet: " + Converter.byte2HexStr(bArr));
        if (i == 2305 && bArr[8] == 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 6, 8);
            byte b2 = bArrCopyOfRange[0];
            byte[] bArr2 = this.f;
            if (b2 == bArr2[0] && bArrCopyOfRange[1] == bArr2[1]) {
                this.mMmiMgr.notifyAudioPath(bArr[9]);
                this.mCmdPacketMap.get(this.TAG).setIsRespStatusSuccess();
            }
        }
    }
}
