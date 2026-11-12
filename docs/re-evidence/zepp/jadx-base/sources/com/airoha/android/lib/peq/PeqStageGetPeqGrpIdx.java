package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageGetPeqGrpIdx extends PeqStage {
    public AirohaPeqMgr b;

    public PeqStageGetPeqGrpIdx(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.b = airohaPeqMgr;
        this.mRaceId = RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_HOSTAUDIO_MMI_GET_ENUM);
        byte[] bArrShortToBytes = Converter.shortToBytes((short) 0);
        byte[] bArr = {bArrShortToBytes[0], bArrShortToBytes[1]};
        racePacket.setPayload(bArr);
        this.mAirohaLink.logToFile(this.TAG, "cmd: " + Converter.byte2HexStr(bArr));
        return racePacket;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "rx packet: " + Converter.byte2HexStr(bArr));
        if (i == 2305 && b == 0) {
            this.b.mPEQIdx = bArr[9];
            this.mIsCompleted = true;
        }
    }
}
