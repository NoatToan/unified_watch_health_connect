package com.airoha.android.lib.peq;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE.RaceCmdRelayPass;
import com.airoha.android.lib.fota.stage.for153xMCE.RelayRespExtracter;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PeqStage implements IPeqStage {
    public static final /* synthetic */ boolean a = false;
    public AirohaLink mAirohaLink;
    public boolean mIsCompleted;
    public boolean mIsError;
    public AirohaPeqMgr mPeqMgr;
    public int mRaceId = 0;
    public byte mRaceRespType = RaceType.RESPONSE;
    public boolean mIsRelay = false;
    public String TAG = getClass().getSimpleName();

    public PeqStage(AirohaPeqMgr airohaPeqMgr) {
        this.mPeqMgr = airohaPeqMgr;
        this.mAirohaLink = airohaPeqMgr.j();
    }

    public RacePacket createWrappedRelayPacket(RacePacket racePacket) {
        if (racePacket == null) {
            return null;
        }
        return new RaceCmdRelayPass(this.mPeqMgr.getAwsPeerDst(), racePacket);
    }

    public RacePacket genCmd() {
        return null;
    }

    public RacePacket genReadNvKeyPacket(byte[] bArr) {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_READFULLKEY);
        byte[] bArrShortToBytes = Converter.shortToBytes((short) 1000);
        racePacket.setPayload(new byte[]{bArr[0], bArr[1], bArrShortToBytes[0], bArrShortToBytes[1]});
        return racePacket;
    }

    public RacePacket genWriteNvKeyPacket(byte[] bArr, byte[] bArr2) {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY);
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        racePacket.setPayload(bArr3);
        return racePacket;
    }

    @Override // com.airoha.android.lib.peq.IPeqStage
    public void handleRespOrInd(int i, byte[] bArr, int i2) {
        byte bExtractStatus;
        boolean z = this.mIsRelay;
        if (!z || i == 3329) {
            if (z || i == this.mRaceId) {
                if (!z) {
                    bExtractStatus = bArr[6];
                } else {
                    if (i2 != 93) {
                        return;
                    }
                    bArr = RelayRespExtracter.extractRelayRespPacket(bArr);
                    i2 = RelayRespExtracter.extractRaceType(bArr);
                    i = RelayRespExtracter.extractRaceId(bArr);
                    bExtractStatus = RelayRespExtracter.extractStatus(bArr);
                }
                if (i == this.mRaceId || i2 == this.mRaceRespType) {
                    parsePayloadAndCheckCompeted(i, bArr, bExtractStatus, i2);
                }
            }
        }
    }

    @Override // com.airoha.android.lib.peq.IPeqStage
    public boolean isCompleted() {
        this.mAirohaLink.logToFile(this.TAG, "isCompleted: " + this.mIsCompleted);
        return this.mIsCompleted;
    }

    @Override // com.airoha.android.lib.peq.IPeqStage
    public boolean isError() {
        this.mAirohaLink.logToFile(this.TAG, "isError: " + this.mIsError);
        return this.mIsError;
    }

    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (b == 0) {
            this.mIsCompleted = true;
        } else {
            this.mIsError = true;
        }
    }

    @Override // com.airoha.android.lib.peq.IPeqStage
    public void sendCmd() {
        RacePacket racePacketGenCmd = genCmd();
        if (this.mIsRelay) {
            racePacketGenCmd = createWrappedRelayPacket(racePacketGenCmd);
        }
        if (racePacketGenCmd != null) {
            this.mAirohaLink.sendOrEnqueue(racePacketGenCmd.getRaw());
        }
    }
}
