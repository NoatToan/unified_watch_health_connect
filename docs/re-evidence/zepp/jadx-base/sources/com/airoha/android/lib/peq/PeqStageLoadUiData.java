package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageLoadUiData extends PeqStage {
    private byte[] b;

    public PeqStageLoadUiData(AirohaPeqMgr airohaPeqMgr, byte[] bArr) {
        super(airohaPeqMgr);
        this.b = bArr;
        this.mRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        return genReadNvKeyPacket(this.b);
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(this.TAG, Converter.byte2HexStr(bArr));
        try {
            if (bArr.length < 21) {
                this.mPeqMgr.r(null);
                this.mIsCompleted = true;
                return;
            }
            int length = bArr.length - 8;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 8, bArr2, 0, length);
            this.mPeqMgr.r(new PeqUiDataStru(bArr2));
            this.mIsCompleted = true;
        } catch (IndexOutOfBoundsException unused) {
            this.mPeqMgr.r(null);
        }
    }
}
