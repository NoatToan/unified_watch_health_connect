package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.fotTws.RaceCmdTwsStoragePartitionErase;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.util.Converter;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_21_TwsDiffFlashPartitionEraseStorage extends FotaStage {
    public static int gRealEraseCmdCount = 0;
    public static int gTotalEraseCmdCount = 0;
    private static final String h = "AirohaFota21_TwsDiff";
    private int f;
    private int g;

    public FotaStage_21_TwsDiffFlashPartitionEraseStorage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.mRaceId = RaceId.RACE_STORAGE_DUAL_DEVICES_PARTITION_ERASE;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsDiffFlashPartitionEraseStorage;
        gTotalEraseCmdCount = 0;
        gRealEraseCmdCount = 0;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        byte[] bArr;
        byte[] bArr2;
        Collection<FotaStage.PARTITION_DATA> collectionValues = FotaStage.gTwsRightDeviceDiffPartitions.values();
        Collection<FotaStage.PARTITION_DATA> collectionValues2 = FotaStage.gTwsLeftDeviceDiffPartitions.values();
        Iterator<FotaStage.PARTITION_DATA> it2 = this.mOtaMgr.checkAgentIsRight() ? collectionValues.iterator() : collectionValues2.iterator();
        Iterator<FotaStage.PARTITION_DATA> it3 = this.mOtaMgr.checkAgentIsRight() ? collectionValues2.iterator() : collectionValues.iterator();
        byte[] bArr3 = {0, 0, 0, 0};
        while (true) {
            if (!it2.hasNext() && !it3.hasNext()) {
                this.f = this.mCmdPacketQueue.size();
                this.g = 0;
                return;
            }
            byte[] bArr4 = {0, 0, 0, 0};
            byte[] bArr5 = {0, 0, 0, 0};
            byte[] bArr6 = null;
            byte[] bArr7 = null;
            while (it2.hasNext() && bArr7 == null) {
                FotaStage.PARTITION_DATA next = it2.next();
                if (next.mIsDiff && !next.mIsErased) {
                    bArr4 = next.mAddr;
                    bArr7 = FotaStage.BYTES_4K;
                }
            }
            while (it3.hasNext() && bArr6 == null) {
                FotaStage.PARTITION_DATA next2 = it3.next();
                if (next2.mIsDiff && !next2.mIsErased) {
                    bArr5 = next2.mAddr;
                    bArr6 = FotaStage.BYTES_4K;
                }
            }
            gTotalEraseCmdCount++;
            if (bArr7 != null || bArr6 != null) {
                if (bArr7 == null) {
                    bArr2 = bArr3;
                    bArr = bArr6;
                } else {
                    bArr = bArr6 == null ? bArr3 : bArr6;
                    bArr2 = bArr7;
                }
                RaceCmdTwsStoragePartitionErase raceCmdTwsStoragePartitionErase = new RaceCmdTwsStoragePartitionErase(this.mOtaMgr.getFotaStorageType(), bArr2, bArr4, this.mOtaMgr.getFotaStorageType(), bArr, bArr5);
                this.mCmdPacketQueue.offer(raceCmdTwsStoragePartitionErase);
                this.mCmdPacketMap.put(Converter.byte2HexStr(bArr4) + Converter.byte2HexStr(bArr5), raceCmdTwsStoragePartitionErase);
                gRealEraseCmdCount = gRealEraseCmdCount + 1;
            }
        }
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (!racePacket.isRespStatusSuccess()) {
                this.mAirohaLink.logToFile(h, "addr is not resp yet: agent addr = " + Converter.byte2HexStr(racePacket.getAddr()) + ", client addr = " + Converter.byte2HexStr(racePacket.getClientAddr()));
                return false;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(h, "resp status: " + ((int) b));
        int i3 = this.g + 1;
        this.g = i3;
        this.mOtaMgr.notifyAppListenerStatus(String.format("Erasing: %d / %d", Integer.valueOf(i3), Integer.valueOf(this.f)));
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 21, bArr3, 0, 4);
        RacePacket racePacket = this.mCmdPacketMap.get(Converter.byte2HexStr(bArr2) + Converter.byte2HexStr(bArr3));
        if (racePacket != null) {
            if (b == 0) {
                this.mAirohaLink.logToFile(h, "cmd.setIsRespStatusSuccess()");
                racePacket.setIsRespStatusSuccess();
                return;
            }
            this.mAirohaLink.logToFile(h, "cmd status = " + Converter.byte2HexStr(b));
        }
    }
}
