package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageSetPeqGrpIdx extends PeqStage {
    public AirohaPeqMgr b;
    public byte c;

    public PeqStageSetPeqGrpIdx(AirohaPeqMgr airohaPeqMgr, byte b) {
        super(airohaPeqMgr);
        this.b = airohaPeqMgr;
        this.c = b;
        this.mRaceId = 2304;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 2304);
        byte[] bArrShortToBytes = Converter.shortToBytes((short) 0);
        byte[] bArr = {bArrShortToBytes[0], bArrShortToBytes[1], this.c};
        racePacket.setPayload(bArr);
        this.mAirohaLink.logToFile(this.TAG, "cmd: " + Converter.byte2HexStr(bArr));
        return racePacket;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "rx packet: " + Converter.byte2HexStr(bArr));
        if (i == 2304 && b == 0) {
            this.mIsCompleted = true;
        }
    }
}
