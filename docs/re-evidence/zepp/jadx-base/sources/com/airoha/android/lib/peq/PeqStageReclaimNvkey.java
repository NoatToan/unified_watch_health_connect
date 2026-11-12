package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class PeqStageReclaimNvkey extends PeqStage {
    private static final String d = "PeqStageReclaimNvkey";
    private short b;
    private Option c;

    public enum Option {
        SaveCoef,
        SavePeqPath,
        SaveAudioPath,
        SaveUiData
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Option.values().length];
            a = iArr;
            try {
                iArr[Option.SaveCoef.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Option.SavePeqPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Option.SaveAudioPath.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PeqStageReclaimNvkey(AirohaPeqMgr airohaPeqMgr, Option option) {
        super(airohaPeqMgr);
        this.b = (short) 0;
        this.mRaceId = RaceId.RACE_NVKEY_RECLAIM;
        this.mRaceRespType = RaceType.RESPONSE;
        this.c = option;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public RacePacket genCmd() {
        int length;
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_RECLAIM);
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            length = this.mPeqMgr.o().length;
        } else if (i != 2) {
            length = i != 3 ? 0 : this.mPeqMgr.l().length;
        } else {
            length = this.mPeqMgr.getWriteBackPeqSubsetContent().length;
        }
        racePacket.setPayload(Converter.shortToBytes((short) length));
        return racePacket;
    }

    @Override // com.airoha.android.lib.peq.PeqStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (b != 0) {
            this.mIsCompleted = true;
        } else {
            this.mIsError = true;
        }
    }
}
