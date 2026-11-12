package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageReadAudiPath extends PeqStage {
    public PeqStageReadAudiPath(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.mRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_READFULLKEY);
        byte[] bArrShortToBytes = Converter.shortToBytes((short) -3533);
        byte[] bArrShortToBytes2 = Converter.shortToBytes((short) 1000);
        byte[] bArr = {bArrShortToBytes[0], bArrShortToBytes[1], bArrShortToBytes2[0], bArrShortToBytes2[1]};
        racePacket.setPayload(bArr);
        this.mAirohaLink.logToFile(this.TAG, "cmd: " + Converter.byte2HexStr(bArr));
        return racePacket;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        boolean z;
        this.mAirohaLink.logToFile(this.TAG, "rx packet: " + Converter.byte2HexStr(bArr));
        int iBytesToU16 = Converter.BytesToU16(bArr[7], bArr[6]);
        byte[] bArr2 = new byte[iBytesToU16];
        System.arraycopy(bArr, 8, bArr2, 0, iBytesToU16);
        int i3 = 0;
        while (true) {
            if (i3 >= iBytesToU16) {
                z = true;
                break;
            } else {
                if (bArr2[i3] != 0) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        if (z) {
            this.mAirohaLink.logToFile(this.TAG, "no default audio path, use 0xF234");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArrShortToBytes = Converter.shortToBytes((short) -3532);
            try {
                byteArrayOutputStream.write(new byte[]{1, 0});
                byteArrayOutputStream.write(new byte[]{0, 0});
                byteArrayOutputStream.write(bArrShortToBytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mPeqMgr.s(bArrShortToBytes);
            this.mPeqMgr.t(byteArrayOutputStream.toByteArray());
        } else {
            this.mPeqMgr.s(new byte[]{bArr2[4], bArr2[5]});
            this.mPeqMgr.t(bArr2);
        }
        this.mIsCompleted = true;
    }
}
