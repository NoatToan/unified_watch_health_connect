package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.RaceCmdStoragePageProgram;
import com.airoha.android.lib.RaceCommand.packet.fota.forSingle.StoragePageData;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.util.CRC8;
import com.airoha.android.lib.util.ContentChecker;
import com.airoha.android.lib.util.Converter;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_12_ProgramDiffFotaStorage extends FotaStage {
    public static int gRealProgramCmdCount = 0;
    public static int gTotalProgramCmdCount = 0;
    private static final String i = "AirohaFota12_Program";
    private static final int j = 256;
    public static final /* synthetic */ boolean k = false;
    private int f;
    private int g;
    private byte h;

    public FotaStage_12_ProgramDiffFotaStorage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.h = (byte) 1;
        this.mRaceId = 1026;
        this.mFotaStageIndex = FotaStageEnum.ProgramDiffFotaStorage;
        gTotalProgramCmdCount = 0;
        gRealProgramCmdCount = 0;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        for (FotaStage.PARTITION_DATA partition_data : FotaStage.gSingleDeviceDiffPartitions.values()) {
            gTotalProgramCmdCount += 16;
            if (partition_data.mIsDiff) {
                int iBytesToInt32 = Converter.bytesToInt32(partition_data.mAddr);
                int i2 = partition_data.mDataLen + iBytesToInt32;
                int i3 = 0;
                while (iBytesToInt32 < i2) {
                    LinkedList linkedList = new LinkedList();
                    byte[] bArr = new byte[261];
                    Arrays.fill(bArr, (byte) 0);
                    int i4 = iBytesToInt32 + 256;
                    int i5 = i4 > i2 ? i2 - iBytesToInt32 : 256;
                    byte[] bArr2 = new byte[256];
                    Arrays.fill(bArr2, (byte) -1);
                    System.arraycopy(partition_data.mData, i3, bArr2, 0, i5);
                    if (!ContentChecker.isAllDummyHexFF(bArr2)) {
                        CRC8 crc8 = new CRC8((byte) 0);
                        crc8.update(bArr2);
                        byte value = (byte) crc8.getValue();
                        bArr[0] = value;
                        byte[] bArrIntToByteArray = Converter.intToByteArray(iBytesToInt32);
                        System.arraycopy(bArrIntToByteArray, 0, bArr, 1, 4);
                        System.arraycopy(bArr2, 0, bArr, 5, 256);
                        linkedList.add(new StoragePageData(value, bArrIntToByteArray, bArr2));
                    }
                    i3 += 256;
                    StoragePageData[] storagePageDataArr = (StoragePageData[]) linkedList.toArray(new StoragePageData[linkedList.size()]);
                    if (storagePageDataArr.length != 0) {
                        RaceCmdStoragePageProgram raceCmdStoragePageProgram = new RaceCmdStoragePageProgram(this.mOtaMgr.getFotaStorageType(), (byte) storagePageDataArr.length, storagePageDataArr);
                        this.mCmdPacketQueue.offer(raceCmdStoragePageProgram);
                        this.mCmdPacketMap.put(Converter.byte2HexStr(storagePageDataArr[0].StorageAddress), raceCmdStoragePageProgram);
                        gRealProgramCmdCount++;
                    }
                    iBytesToInt32 = i4;
                }
            }
        }
        this.f = this.mCmdPacketQueue.size();
        this.g = 0;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (!racePacket.isRespStatusSuccess()) {
                this.mAirohaLink.logToFile(i, "addr is not resp yet: " + Converter.byte2HexStr(racePacket.getAddr()));
                return false;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i2, byte[] bArr, byte b, int i3) {
        this.mAirohaLink.logToFile(i, "RACE_STORAGE_PAGE_PROGRAM resp status: " + ((int) b));
        if (b != 0) {
            return;
        }
        byte b2 = bArr[7];
        int i4 = bArr[8];
        int i5 = i4 * 4;
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 9, bArr2, 0, i5);
        int i6 = this.g + 1;
        this.g = i6;
        this.mOtaMgr.notifyAppListenerStatus(String.format("Programming: %d / %d", Integer.valueOf(i6), Integer.valueOf(this.f)));
        this.mAirohaLink.logToFile(i, String.format("Programming: %d / %d", Integer.valueOf(this.g), Integer.valueOf(this.f)));
        this.mAirohaLink.logToFile(i, String.format("Current queue size: %d", Integer.valueOf(this.mCmdPacketQueue.size())));
        for (int i7 = 0; i7 < i4; i7++) {
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr2, i7 * 4, bArr3, 0, 4);
            RacePacket racePacket = this.mCmdPacketMap.get(Converter.byte2HexStr(bArr3));
            if (racePacket != null) {
                if (b != 0) {
                    this.mAirohaLink.logToFile(i, "cmd status = " + Converter.byte2HexStr(b));
                    return;
                }
                this.mAirohaLink.logToFile(i, "cmd.setIsRespStatusSuccess()");
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
