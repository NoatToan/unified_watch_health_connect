package com.airoha.android.lib.fota.stage.forSingle;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.RaceCmdStorageGetPartitionErasedStatus;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;
import com.airoha.android.lib.util.Converter;
import io.netty.util.internal.StringUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_13_GetPartitionEraseStatusStorage extends FotaStage {
    private static final String i = "AirohaFota13_GetEraseStatus";
    private int f;
    private int g;
    private int h;

    public FotaStage_13_GetPartitionEraseStatusStorage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.mRaceId = 1075;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.GetPartitionEraseStatusStorage;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        int fotaPartitionStartAddress = this.mOtaMgr.getFotaPartitionStartAddress();
        byte[] bArrIntToByteArray = Converter.intToByteArray(fotaPartitionStartAddress);
        String strByte2HexStr = Converter.byte2HexStr(bArrIntToByteArray);
        InputStream fotaInputStream = this.mOtaMgr.getFotaInputStream();
        FotaStage.gSingleDeviceDiffPartitions = new LinkedHashMap<>();
        byte[] bArr = new byte[4096];
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        while (true) {
            try {
                int i3 = fotaInputStream.read(bArr);
                if (i3 == -1) {
                    RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus = new RaceCmdStorageGetPartitionErasedStatus((byte) 0, this.mOtaMgr.getFotaStorageType(), bArrIntToByteArray, Converter.intToByteArray(i2));
                    this.mCmdPacketQueue.offer(raceCmdStorageGetPartitionErasedStatus);
                    this.mCmdPacketMap.put(strByte2HexStr + Converter.byte2HexStr((byte) 0), raceCmdStorageGetPartitionErasedStatus);
                    this.f = this.mCmdPacketQueue.size();
                    this.g = 0;
                    return;
                }
                i2 += 4096;
                byte[] bArrIntToByteArray2 = Converter.intToByteArray(fotaPartitionStartAddress);
                FotaStage.gSingleDeviceDiffPartitions.put(Converter.byte2HexStr(bArrIntToByteArray2), new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i3));
                fotaPartitionStartAddress += 4096;
            } catch (Exception e) {
                ErrorEnum errorEnum = ErrorEnum.EXCEPTION;
                this.mErrorCode = errorEnum;
                this.mOtaMgr.notifyAppListenerError(this.mFotaStageIndex, errorEnum, e.getMessage());
                return;
            }
        }
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i2, byte[] bArr, byte b, int i3) {
        if (i3 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(i, "resp status: " + ((int) b));
        int i4 = this.g + 1;
        this.g = i4;
        this.mOtaMgr.notifyAppListenerStatus(String.format("GetPartitionEraseStatus: %d / %d", Integer.valueOf(i4), Integer.valueOf(this.f)));
        byte b2 = bArr[7];
        byte b3 = bArr[8];
        this.mAirohaLink.logToFile(i, "role: " + Converter.byte2HexStr(b3));
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        this.mAirohaLink.logToFile(i, "partitionAddress: " + Converter.byte2HexStr(bArr2));
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 13, bArr3, 0, 4);
        this.mAirohaLink.logToFile(i, "partitionLength: " + Converter.byte2HexStr(bArr3));
        int iBytesToInt32 = Converter.bytesToInt32(bArr3) / 4096;
        this.mAirohaLink.logToFile(i, "totalBitNum: " + String.valueOf(iBytesToInt32));
        byte[] bArr4 = new byte[2];
        System.arraycopy(bArr, 17, bArr4, 0, 2);
        this.mAirohaLink.logToFile(i, "eraseStatusSize: " + Converter.byte2HexStr(bArr4));
        int iBytesToU16 = Converter.BytesToU16(bArr4[1], bArr4[0]);
        this.mAirohaLink.logToFile(i, "eraseStatusByteLen: " + String.valueOf(iBytesToU16));
        byte[] bArr5 = new byte[iBytesToU16];
        System.arraycopy(bArr, 19, bArr5, 0, iBytesToU16);
        this.mAirohaLink.logToFile(i, "eraseStatus: " + Converter.byte2HexStr(bArr5));
        this.h = 0;
        ArrayList arrayList = new ArrayList(FotaStage.gSingleDeviceDiffPartitions.values());
        for (int i5 = 0; i5 < iBytesToInt32; i5++) {
            int i6 = 128 >> (i5 % 8);
            boolean z = (bArr5[i5 / 8] & i6) == i6;
            ((FotaStage.PARTITION_DATA) arrayList.get(i5)).mIsErased = z;
            if (z) {
                this.h++;
            }
        }
        for (int i7 = 0; i7 < iBytesToU16; i7++) {
            byte b4 = bArr5[i7];
            this.mAirohaLink.logToFile(i, "eraseStatus: " + Integer.toBinaryString(b4 & 255).replace(StringUtil.SPACE, '0'));
        }
        if (this.h == FotaStage.gSingleDeviceDiffPartitions.size()) {
            this.mSkipType = IAirohaFotaStage.SKIP_TYPE.CompareErase_stages;
        } else if (((FotaStage.PARTITION_DATA) arrayList.get(0)).mIsErased) {
            this.mSkipType = IAirohaFotaStage.SKIP_TYPE.Compare_stages;
        }
        String strByte2HexStr = Converter.byte2HexStr(bArr2);
        RacePacket racePacket = this.mCmdPacketMap.get(strByte2HexStr + Converter.byte2HexStr(b3));
        if (racePacket != null) {
            if (b != 0) {
                this.mAirohaLink.logToFile(i, "cmd error");
            } else {
                this.mAirohaLink.logToFile(i, "cmd success");
                racePacket.setIsRespStatusSuccess();
            }
        }
    }
}
