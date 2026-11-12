package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageReloadNvRelay extends MmiStageReloadNv {
    public MmiStageReloadNvRelay(AirohaMmiMgr airohaMmiMgr, short s) {
        super(airohaMmiMgr, s);
        this.mNvkeyId = s;
        this.mRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
        this.mRaceRespType = RaceType.INDICATION;
        this.mRelayRaceId = RaceId.RACE_RELOAD_NVKEY_TO_RAM;
        this.mRelayRaceRespType = RaceType.RESPONSE;
        this.mIsRelay = true;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStageReloadNv, com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacketCreateWrappedRelayPacket = createWrappedRelayPacket(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_RELOAD_NVKEY_TO_RAM, Converter.ShortToBytes(this.mNvkeyId)));
        this.mCmdPacketQueue.offer(racePacketCreateWrappedRelayPacket);
        this.mCmdPacketMap.put(this.TAG, racePacketCreateWrappedRelayPacket);
    }
}
