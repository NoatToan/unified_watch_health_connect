package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetKeyMapRelay extends MmiStageSetKeyMap {
    public MmiStageSetKeyMapRelay(AirohaMmiMgr airohaMmiMgr, byte[] bArr) {
        super(airohaMmiMgr, bArr);
        this.mNvkeyValue = bArr;
        this.mRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
        this.mRaceRespType = RaceType.INDICATION;
        this.mRelayRaceId = RaceId.RACE_NVKEY_WRITEFULLKEY;
        this.mRelayRaceRespType = RaceType.RESPONSE;
        this.mIsRelay = true;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStageSetKeyMap, com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArr = this.mNvkeyValue;
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = (byte) 231;
        bArr2[1] = (byte) 242;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        RacePacket racePacketCreateWrappedRelayPacket = createWrappedRelayPacket(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY, bArr2));
        this.mCmdPacketQueue.offer(racePacketCreateWrappedRelayPacket);
        this.mCmdPacketMap.put(this.TAG, racePacketCreateWrappedRelayPacket);
    }
}
