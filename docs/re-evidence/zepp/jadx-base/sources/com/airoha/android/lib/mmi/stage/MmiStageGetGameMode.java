package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageGetGameMode extends MmiStage {
    public MmiStageGetGameMode(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM, Converter.shortToBytes((short) 6));
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageGetGameMode resp packet: " + Converter.byte2HexStr(bArr));
        if (i == 2305 && bArr[8] == 0 && bArr[6] == 6) {
            this.mMmiMgr.notifyGameModeState(bArr[9]);
            RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
            if (b == 0) {
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
