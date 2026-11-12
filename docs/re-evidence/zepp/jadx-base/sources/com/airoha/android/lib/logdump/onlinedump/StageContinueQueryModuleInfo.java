package com.airoha.android.lib.logdump.onlinedump;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.logdump.LogDumpMgr;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.mmi.stage.MmiStage;

/* JADX INFO: loaded from: classes2.dex */
public class StageContinueQueryModuleInfo extends MmiStage {
    private LogDumpMgr.OnStatusUiListener f;

    public StageContinueQueryModuleInfo(AirohaMmiMgr airohaMmiMgr, LogDumpMgr.OnStatusUiListener onStatusUiListener) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_ONLINE_LOG_QUERY_MODULE_INFO;
        this.mRaceRespType = RaceType.RESPONSE;
        this.f = onStatusUiListener;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, this.mRaceId, new byte[]{-85, 0, 3, 0, 4, -1, 0});
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "RACE_ONLINE_LOG_QUERY_MODULE_INFO resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            int length = bArr.length - 15;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 15, bArr2, 0, length);
            passInfoToMgr(bArr2, bArr[13] == -16);
        }
    }

    public void passInfoToMgr(byte[] bArr, boolean z) {
        this.f.OnUpdateModuleInfo(bArr, z);
    }
}
