package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageUpdatePeqSubset extends PeqStage {
    public PeqStageUpdatePeqSubset(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.mRaceId = RaceId.RACE_NVKEY_WRITEFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        return genWriteNvKeyPacket(this.mPeqMgr.k(), this.mPeqMgr.getWriteBackPeqSubsetContent());
    }
}
