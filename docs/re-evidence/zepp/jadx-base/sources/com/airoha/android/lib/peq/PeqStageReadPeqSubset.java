package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageReadPeqSubset extends PeqStage {
    private static final String b = "PeqStageReadPeqSubset";

    public PeqStageReadPeqSubset(AirohaPeqMgr airohaPeqMgr) {
        super(airohaPeqMgr);
        this.mRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        return genReadNvKeyPacket(this.mPeqMgr.k());
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b2, int i2) {
        boolean z;
        this.mAirohaLink.logToFile(b, "rx packet: " + Converter.byte2HexStr(bArr));
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
            this.mAirohaLink.logToFile(b, "no default peq subset");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(new byte[]{1, 0});
                byteArrayOutputStream.write(new byte[]{1, 0, 0, 0});
                byteArrayOutputStream.write(this.mPeqMgr.m());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mPeqMgr.u(byteArrayOutputStream.toByteArray());
        } else if (Converter.byte2HexStrWithoutSeperator(bArr2).contains(Converter.byte2HexStrWithoutSeperator(this.mPeqMgr.m()))) {
            this.mAirohaLink.logToFile(b, "target subset existing");
            this.mPeqMgr.u(bArr2);
        } else {
            this.mAirohaLink.logToFile(b, "append target subset to write back");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int iBytesToU17 = Converter.BytesToU16(bArr2[1], bArr2[0]) + 1;
            this.mAirohaLink.logToFile(b, "number of sets: " + iBytesToU17);
            byte[] bArrShortToBytes = Converter.shortToBytes((short) iBytesToU17);
            bArr2[0] = bArrShortToBytes[0];
            bArr2[1] = bArrShortToBytes[1];
            try {
                byteArrayOutputStream2.write(bArr2);
                byteArrayOutputStream2.write(new byte[]{1, 0, 0, 0});
                byteArrayOutputStream2.write(this.mPeqMgr.m());
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.mPeqMgr.u(byteArrayOutputStream2.toByteArray());
        }
        this.mPeqMgr.setPEQGrpNum(Converter.BytesToU16(bArr2[1], bArr2[0]));
        this.mIsCompleted = true;
    }
}
