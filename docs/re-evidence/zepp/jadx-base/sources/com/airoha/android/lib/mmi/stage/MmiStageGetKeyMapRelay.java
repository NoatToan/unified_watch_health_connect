package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageGetKeyMapRelay extends MmiStageGetKeyMap {
    public MmiStageGetKeyMapRelay(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
        this.mRaceRespType = RaceType.INDICATION;
        this.mRelayRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRelayRaceRespType = RaceType.RESPONSE;
        this.mIsRelay = true;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStageGetKeyMap, com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArrShortToBytes = Converter.ShortToBytes((short) -3353);
        byte[] bArrShortToBytes2 = Converter.shortToBytes((short) 100);
        RacePacket racePacketCreateWrappedRelayPacket = createWrappedRelayPacket(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_READFULLKEY, new byte[]{bArrShortToBytes[0], bArrShortToBytes[1], bArrShortToBytes2[0], bArrShortToBytes2[1]}));
        this.mCmdPacketQueue.offer(racePacketCreateWrappedRelayPacket);
        this.mCmdPacketMap.put(this.TAG, racePacketCreateWrappedRelayPacket);
    }
}
