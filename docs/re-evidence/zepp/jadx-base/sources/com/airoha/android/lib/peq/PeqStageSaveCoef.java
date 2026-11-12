package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageSaveCoef extends PeqStage {
    public PeqStageSaveCoef(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.mRaceId = RaceId.RACE_NVKEY_WRITEFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        byte[] raw = genWriteNvKeyPacket(this.mPeqMgr.m(), this.mPeqMgr.o()).getRaw();
        this.mAirohaLink.logToFile(this.TAG, "coef: " + Converter.byte2HexStr(raw));
        return genWriteNvKeyPacket(this.mPeqMgr.m(), this.mPeqMgr.o());
    }
}
