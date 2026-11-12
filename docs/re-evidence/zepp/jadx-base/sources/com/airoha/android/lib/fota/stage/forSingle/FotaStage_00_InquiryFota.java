package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdFotaPartitionInfoQuery;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_00_InquiryFota extends FotaStage {
    private static final String f = "AirohaFota00_InquiryFota";

    public FotaStage_00_InquiryFota(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.mRaceId = RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
        this.mFotaStageIndex = FotaStageEnum.InquiryFota;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        RaceCmdFotaPartitionInfoQuery raceCmdFotaPartitionInfoQuery = new RaceCmdFotaPartitionInfoQuery(new byte[]{0});
        this.mCmdPacketQueue.offer(raceCmdFotaPartitionInfoQuery);
        this.mCmdPacketMap.put(f, raceCmdFotaPartitionInfoQuery);
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(f, "RACE_FOTA_PARTITION_INFO_QUERY resp status: " + ((int) b));
        RacePacket racePacket = this.mCmdPacketMap.get(f);
        if (b == 0) {
            racePacket.setIsRespStatusSuccess();
            byte b2 = bArr[7];
            this.mOtaMgr.setPartitionId(b2);
            this.mAirohaLink.logToFile(f, "partition ID: " + ((int) b2));
            byte b3 = bArr[8];
            this.mOtaMgr.setFotaStorageType(b3);
            this.mAirohaLink.logToFile(f, "storageType: " + ((int) b3));
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 9, bArr2, 0, 4);
            int iBytesToInt32 = Converter.bytesToInt32(bArr2);
            this.mOtaMgr.setFotaPartitionStartAddress(iBytesToInt32);
            this.mAirohaLink.logToFile(f, "partitionAddress : " + Converter.byte2HexStr(bArr2) + " =  " + iBytesToInt32);
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr, 13, bArr3, 0, 4);
            int iBytesToInt33 = Converter.bytesToInt32(bArr3);
            this.mOtaMgr.setFotaPartitionLength(iBytesToInt33);
            this.mAirohaLink.logToFile(f, "partitionLength: " + Converter.byte2HexStr(bArr3) + "  = " + iBytesToInt33);
        }
    }
}
