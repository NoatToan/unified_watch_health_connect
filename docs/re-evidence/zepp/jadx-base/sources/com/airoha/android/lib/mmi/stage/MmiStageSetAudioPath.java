package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.util.Converter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetAudioPath extends MmiStage {
    public byte[] f;
    public byte g;

    public MmiStageSetAudioPath(AirohaMmiMgr airohaMmiMgr, byte b) {
        super(airohaMmiMgr);
        this.g = b;
        this.mRaceId = 2304;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArrShortToBytes = Converter.shortToBytes((short) 10);
        this.f = bArrShortToBytes;
        byte[] bArr = {0, 0, this.g};
        System.arraycopy(bArrShortToBytes, 0, bArr, 0, 2);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 2304, bArr);
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "MmiStageSetAudioPath resp packet: " + Converter.byte2HexStr(bArr));
        if (i != 2304) {
            return;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 6, 8);
        byte b2 = bArrCopyOfRange[0];
        byte[] bArr2 = this.f;
        if (b2 == bArr2[0] && bArrCopyOfRange[1] == bArr2[1]) {
            this.mMmiMgr.notifySetAudioPath(bArr[8]);
            this.mCmdPacketMap.get(this.TAG).setIsRespStatusSuccess();
        }
    }
}
