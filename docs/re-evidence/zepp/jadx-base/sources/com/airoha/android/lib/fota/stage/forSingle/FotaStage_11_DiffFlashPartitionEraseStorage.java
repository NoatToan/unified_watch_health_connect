package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.util.Converter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_11_DiffFlashPartitionEraseStorage extends FotaStage {
    public static int gRealEraseCmdCount = 0;
    public static int gTotalEraseCmdCount = 0;
    private static final String h = "AirohaFota11_Diff";
    private int f;
    private int g;

    public FotaStage_11_DiffFlashPartitionEraseStorage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.mRaceId = 1028;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.DiffFlashPartitionEraseStorage;
        gTotalEraseCmdCount = 0;
        gRealEraseCmdCount = 0;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        for (FotaStage.PARTITION_DATA partition_data : FotaStage.gSingleDeviceDiffPartitions.values()) {
            gTotalEraseCmdCount++;
            if (partition_data.mIsDiff && !partition_data.mIsErased) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(this.mOtaMgr.getFotaStorageType());
                try {
                    byteArrayOutputStream.write(Converter.intToByteArray(4096));
                    byteArrayOutputStream.write(partition_data.mAddr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, 1028);
                racePacket.setPayload(byteArray);
                this.mCmdPacketQueue.offer(racePacket);
                this.mCmdPacketMap.put(Converter.byte2HexStr(partition_data.mAddr), racePacket);
                gRealEraseCmdCount++;
            }
        }
        this.f = this.mCmdPacketQueue.size();
        this.g = 0;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (!racePacket.isRespStatusSuccess()) {
                this.mAirohaLink.logToFile(h, "addr is not resp yet: " + Converter.byte2HexStr(racePacket.getAddr()));
                return false;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        this.mAirohaLink.logToFile(h, "FotaStage_11_DiffFlashPartitionEraseStorage resp status: " + ((int) b));
        if (b != 0) {
            return;
        }
        int i3 = this.g + 1;
        this.g = i3;
        this.mOtaMgr.notifyAppListenerStatus(String.format("Erasing: %d / %d", Integer.valueOf(i3), Integer.valueOf(this.f)));
        byte b2 = bArr[7];
        Arrays.copyOfRange(bArr, 8, 12);
        RacePacket racePacket = this.mCmdPacketMap.get(Converter.byte2HexStr(Arrays.copyOfRange(bArr, 12, 16)));
        if (racePacket == null || b != 0) {
            return;
        }
        racePacket.setIsRespStatusSuccess();
    }
}
