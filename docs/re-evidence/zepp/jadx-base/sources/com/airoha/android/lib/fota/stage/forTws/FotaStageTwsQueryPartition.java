package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdFotaTwsQueryPartition;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStageTwsQueryPartition extends FotaStage {
    private static final String f = "AirohaFota_TwsQueryPartition";

    public FotaStageTwsQueryPartition(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsQueryPartition;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaTwsQueryPartition raceCmdFotaTwsQueryPartition = new RaceCmdFotaTwsQueryPartition(new byte[]{0});
        this.mRaceId = raceCmdFotaTwsQueryPartition.getRaceId();
        this.mCmdPacketQueue.offer(raceCmdFotaTwsQueryPartition);
        this.mCmdPacketMap.put(f, raceCmdFotaTwsQueryPartition);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(f, "resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            byte b2 = bArr[7];
            byte b3 = bArr[8];
            this.mOtaMgr.setFotaStorageType(b3);
            this.mAirohaLink.logToFile(f, "agent storageType: " + ((int) b3));
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 9, bArr2, 0, 4);
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr, 13, bArr3, 0, 4);
            byte b4 = bArr[17];
            System.arraycopy(bArr, 18, new byte[4], 0, 4);
            System.arraycopy(bArr, 22, new byte[4], 0, 4);
            int iBytesToInt32 = Converter.bytesToInt32(bArr2);
            int iBytesToInt33 = Converter.bytesToInt32(bArr3);
            if (b3 == 1 || iBytesToInt32 != 0) {
                this.mOtaMgr.setFotaPartitionStartAddress(iBytesToInt32);
                this.mOtaMgr.setFotaPartitionLength(iBytesToInt33);
            } else {
                this.mAirohaLink.logToFile(f, "WRONG_PARTITION_ADDR");
                this.mIsErrorOccurred = true;
                this.mErrorCode = ErrorEnum.WRONG_PARTITION_ADDR;
            }
        }
    }
}
