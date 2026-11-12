package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.fotaError.StopReason;
import com.airoha.android.lib.mmi.AirohaMmiMgr;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetVaIndexRelay extends MmiStageSetVaIndex {
    public MmiStageSetVaIndexRelay(AirohaMmiMgr airohaMmiMgr, byte b) {
        super(airohaMmiMgr, b);
        this.mRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
        this.mRaceRespType = RaceType.INDICATION;
        this._index = b;
        this.mRelayRaceId = RaceId.RACE_NVKEY_WRITEFULLKEY;
        this.mRelayRaceRespType = RaceType.RESPONSE;
        this.mIsRelay = true;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStageSetVaIndex, com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacketCreateWrappedRelayPacket = createWrappedRelayPacket(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY, new byte[]{-22, StopReason.BtOff, this._index}));
        this.mCmdPacketQueue.offer(racePacketCreateWrappedRelayPacket);
        this.mCmdPacketMap.put(this.TAG, racePacketCreateWrappedRelayPacket);
    }
}
