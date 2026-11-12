package com.airoha.android.lib.AntennaUT;

import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_GetAvaDst;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaRFMgr extends AirohaRaceOtaMgr {
    private static final String P = "AirohaRFMgr";
    private OnRfStatusUiListener L;
    private boolean M;
    private boolean N;
    private OnRacePacketListener O;

    public class AntennaInfo {
        public short a;
        public byte b;
        public byte c;
        public long d;
        public long e;
        public long f;
        public long g;
        public byte h;
        public byte i;
        public short j;
        public short k;

        public AntennaInfo() {
        }

        public short getAagcGain() {
            return this.j;
        }

        public byte getAagcRssi() {
            return this.h;
        }

        public long getAclErrCnt() {
            return this.e;
        }

        public long getAudioPktNum() {
            return this.f;
        }

        public long getDspLostCnt() {
            return this.g;
        }

        public long getIfpErrCnt() {
            return this.d;
        }

        public short getPhoneAagcGain() {
            return this.k;
        }

        public byte getPhoneAagcRssi() {
            return this.i;
        }

        public byte getPhoneRssi() {
            return this.c;
        }

        public byte getRssi() {
            return this.b;
        }

        public short getStatus() {
            return this.a;
        }
    }

    public interface OnRfStatusUiListener {
        void OnActionCompleted(int i, byte[] bArr, int i2);
    }

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            if (AirohaRFMgr.this.N || AirohaRFMgr.this.M) {
                AirohaRFMgr.this.L.OnActionCompleted(i, bArr, i2);
                return;
            }
            if (AirohaRFMgr.this.M || bArr.length <= 8) {
                return;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 8, bArr.length);
            AirohaRFMgr.this.L.OnActionCompleted((bArrCopyOfRange[4] + bArrCopyOfRange[5]) << 8, bArrCopyOfRange, bArrCopyOfRange[1]);
        }
    }

    public AirohaRFMgr(AirohaLink airohaLink, OnRfStatusUiListener onRfStatusUiListener) {
        super(airohaLink);
        this.N = true;
        a aVar = new a();
        this.O = aVar;
        this.L = onRfStatusUiListener;
        this.mAirohaLink.registerOnRacePacketListener(P, aVar);
    }

    private int F(byte b, byte b2) {
        return (b & 255) + 0 + ((b2 & 255) << 8);
    }

    private long G(byte b, byte b2, byte b3, byte b4) {
        return (((long) b) & 255) + 0 + ((((long) b2) & 255) << 8) + ((((long) b3) & 255) << 16) + ((((long) b4) & 255) << 24);
    }

    private short H(byte b) {
        return (short) ((b & 255) + 0);
    }

    public void checkPartnerStatus() {
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_GetAvaDst(this));
        startPollStagetQueue();
    }

    public void getAntennaReport(boolean z) {
        renewStageQueue();
        this.N = false;
        this.M = z;
        if (z) {
            this.mStagesQueue.offer(new AntennaInfoRpt(this));
        } else {
            this.mStagesQueue.offer(new FotaStage_00_GetAvaDst(this));
            this.mStagesQueue.offer(new AntennaInfoRptRelay(this));
        }
        startPollStagetQueue();
    }

    public AntennaInfo parseAntennaReport(byte[] bArr) {
        AntennaInfo antennaInfo = new AntennaInfo();
        if (bArr.length != 31) {
            antennaInfo.a = (short) -1;
            return antennaInfo;
        }
        antennaInfo.a = H(bArr[6]);
        antennaInfo.b = bArr[7];
        antennaInfo.c = bArr[8];
        antennaInfo.d = G(bArr[9], bArr[10], bArr[11], bArr[12]);
        antennaInfo.e = G(bArr[13], bArr[14], bArr[15], bArr[16]);
        antennaInfo.f = G(bArr[17], bArr[18], bArr[19], bArr[20]);
        antennaInfo.g = G(bArr[21], bArr[22], bArr[23], bArr[24]);
        antennaInfo.h = bArr[25];
        antennaInfo.i = bArr[26];
        antennaInfo.j = H(bArr[27]);
        antennaInfo.k = H(bArr[28]);
        return antennaInfo;
    }
}
