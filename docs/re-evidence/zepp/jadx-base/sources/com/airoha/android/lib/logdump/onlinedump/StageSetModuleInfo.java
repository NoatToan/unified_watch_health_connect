package com.airoha.android.lib.logdump.onlinedump;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.logdump.LogDumpMgr;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageSetModuleInfo extends MmiStage {
    private LogDumpMgr.OnStatusUiListener f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;

    public StageSetModuleInfo(AirohaMmiMgr airohaMmiMgr, byte b, byte b2, byte b3, byte b4) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_ONLINE_LOG_SET_MODULE_INFO;
        this.mRaceRespType = RaceType.RESPONSE;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArr = {-85, 0, 7, 0, 5, 0, 15, 0, 1, 0, 2};
        bArr[7] = this.g;
        bArr[8] = this.h;
        bArr[9] = this.i;
        bArr[10] = this.j;
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId, bArr);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_ONLINE_LOG_SET_MODULE_INFO resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
        }
    }

    public void passInfoToMgr(byte[] bArr) {
        this.f.OnUpdateModuleInfo(bArr, true);
    }
}
