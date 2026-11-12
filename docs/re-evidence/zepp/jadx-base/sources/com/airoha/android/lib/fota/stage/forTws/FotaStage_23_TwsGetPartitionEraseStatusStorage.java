package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.RaceCmdStorageGetPartitionErasedStatus;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;
import com.airoha.android.lib.util.Converter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_23_TwsGetPartitionEraseStatusStorage extends FotaStage {
    private static final String p = "AirohaFota23_GetEraseStatus";
    private int f;
    private int g;
    private String h;
    private String i;
    private int j;
    private int k;
    private byte[] l;
    private byte[] m;
    private int n;
    private int o;

    public FotaStage_23_TwsGetPartitionEraseStatusStorage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.mRaceId = 1075;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsGetPartitionEraseStatusStorage;
    }

    public boolean b(InputStream inputStream, boolean z) {
        int fotaPartitionStartAddress = this.mOtaMgr.getFotaPartitionStartAddress();
        byte[] bArrIntToByteArray = Converter.intToByteArray(fotaPartitionStartAddress);
        String strByte2HexStr = Converter.byte2HexStr(bArrIntToByteArray);
        byte[] bArr = new byte[4096];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                i += 4096;
                byte[] bArrIntToByteArray2 = Converter.intToByteArray(fotaPartitionStartAddress);
                String strByte2HexStr2 = Converter.byte2HexStr(bArrIntToByteArray2);
                if (this.mOtaMgr.checkAgentIsRight()) {
                    if (z) {
                        FotaStage.gTwsRightDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                    } else {
                        FotaStage.gTwsLeftDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                    }
                } else if (z) {
                    FotaStage.gTwsLeftDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                } else {
                    FotaStage.gTwsRightDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                }
                fotaPartitionStartAddress += 4096;
            } catch (Exception e) {
                ErrorEnum errorEnum = ErrorEnum.EXCEPTION;
                this.mErrorCode = errorEnum;
                this.mOtaMgr.notifyAppListenerError(this.mFotaStageIndex, errorEnum, e.getMessage());
                return false;
            }
        }
        byte[] bArrIntToByteArray3 = Converter.intToByteArray(i);
        if (z) {
            this.h = strByte2HexStr + Converter.byte2HexStr((byte) 0);
            RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus = new RaceCmdStorageGetPartitionErasedStatus((byte) 0, this.mOtaMgr.getFotaStorageType(), bArrIntToByteArray, bArrIntToByteArray3);
            this.mCmdPacketQueue.offer(raceCmdStorageGetPartitionErasedStatus);
            this.mCmdPacketMap.put(this.h, raceCmdStorageGetPartitionErasedStatus);
        } else {
            this.i = strByte2HexStr + Converter.byte2HexStr((byte) 1);
            RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus2 = new RaceCmdStorageGetPartitionErasedStatus((byte) 1, this.mOtaMgr.getFotaStorageType(), bArrIntToByteArray, bArrIntToByteArray3);
            this.mCmdPacketQueue.offer(raceCmdStorageGetPartitionErasedStatus2);
            this.mCmdPacketMap.put(this.i, raceCmdStorageGetPartitionErasedStatus2);
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        int fotaPartitionStartAddress = this.mOtaMgr.getFotaPartitionStartAddress();
        byte[] bArrIntToByteArray = Converter.intToByteArray(fotaPartitionStartAddress);
        String strByte2HexStr = Converter.byte2HexStr(bArrIntToByteArray);
        InputStream fotaInputStream = this.mOtaMgr.getFotaInputStream();
        InputStream fotaInputStreamAgent = this.mOtaMgr.getFotaInputStreamAgent();
        InputStream inputStream = this.mOtaMgr.getmFotaInputStream_Partner();
        FotaStage.gTwsRightDeviceDiffPartitions = new LinkedHashMap<>();
        FotaStage.gTwsLeftDeviceDiffPartitions = new LinkedHashMap<>();
        if (fotaInputStream != null) {
            byte[] bArr = new byte[4096];
            Arrays.fill(bArr, (byte) -1);
            int i = 0;
            while (true) {
                try {
                    int i2 = fotaInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    i += 4096;
                    byte[] bArrIntToByteArray2 = Converter.intToByteArray(fotaPartitionStartAddress);
                    String strByte2HexStr2 = Converter.byte2HexStr(bArrIntToByteArray2);
                    FotaStage.gTwsRightDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                    FotaStage.gTwsLeftDeviceDiffPartitions.put(strByte2HexStr2, new FotaStage.PARTITION_DATA(bArrIntToByteArray2, bArr, i2));
                    fotaPartitionStartAddress += 4096;
                } catch (IOException e) {
                    ErrorEnum errorEnum = ErrorEnum.EXCEPTION;
                    this.mErrorCode = errorEnum;
                    this.mOtaMgr.notifyAppListenerError(this.mFotaStageIndex, errorEnum, e.getMessage());
                    return;
                }
            }
            byte[] bArrIntToByteArray3 = Converter.intToByteArray(i);
            this.h = strByte2HexStr + Converter.byte2HexStr((byte) 0);
            RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus = new RaceCmdStorageGetPartitionErasedStatus((byte) 0, this.mOtaMgr.getFotaStorageType(), bArrIntToByteArray, bArrIntToByteArray3);
            this.mCmdPacketQueue.offer(raceCmdStorageGetPartitionErasedStatus);
            this.mCmdPacketMap.put(this.h, raceCmdStorageGetPartitionErasedStatus);
            this.i = strByte2HexStr + Converter.byte2HexStr((byte) 1);
            RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus2 = new RaceCmdStorageGetPartitionErasedStatus((byte) 1, this.mOtaMgr.getFotaStorageType(), bArrIntToByteArray, bArrIntToByteArray3);
            this.mCmdPacketQueue.offer(raceCmdStorageGetPartitionErasedStatus2);
            this.mCmdPacketMap.put(this.i, raceCmdStorageGetPartitionErasedStatus2);
        } else if (!b(fotaInputStreamAgent, true)) {
            this.mAirohaLink.logToFile(p, "failed to gen Agent partitions!");
            return;
        } else if (!b(inputStream, false)) {
            this.mAirohaLink.logToFile(p, "failed to gen Partner partitions!");
            return;
        }
        this.f = this.mCmdPacketQueue.size();
        this.g = 0;
        this.mAirohaLink.logToFile(p, "mInitialQueuedSize: " + String.valueOf(this.f));
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (!racePacket.isRespStatusSuccess()) {
                RaceCmdStorageGetPartitionErasedStatus raceCmdStorageGetPartitionErasedStatus = (RaceCmdStorageGetPartitionErasedStatus) racePacket;
                this.mAirohaLink.logToFile(p, "addr is not resp yet: addr = " + Converter.byte2HexStr(raceCmdStorageGetPartitionErasedStatus.getAddr()) + ", role = " + Converter.byte2HexStr(raceCmdStorageGetPartitionErasedStatus.getRole()));
                return false;
            }
        }
        this.mAirohaLink.logToFile(p, "all resp collected");
        ArrayList arrayList = new ArrayList(FotaStage.gTwsLeftDeviceDiffPartitions.values());
        ArrayList arrayList2 = new ArrayList(FotaStage.gTwsRightDeviceDiffPartitions.values());
        if (this.n == this.j && this.o == this.k) {
            this.mAirohaLink.logToFile(p, "SKIP_TYPE.CompareErase_stages");
            this.mSkipType = IAirohaFotaStage.SKIP_TYPE.CompareErase_stages;
            return true;
        }
        if (!((FotaStage.PARTITION_DATA) arrayList.get(0)).mIsErased || !((FotaStage.PARTITION_DATA) arrayList2.get(0)).mIsErased) {
            return true;
        }
        this.mAirohaLink.logToFile(p, "SKIP_TYPE.Compare_stages");
        this.mSkipType = IAirohaFotaStage.SKIP_TYPE.Compare_stages;
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(p, "resp status: " + ((int) b));
        int i3 = this.g + 1;
        this.g = i3;
        this.mOtaMgr.notifyAppListenerStatus(String.format("GetPartitionEraseStatus: %d / %d", Integer.valueOf(i3), Integer.valueOf(this.f)));
        byte b2 = bArr[7];
        byte b3 = bArr[8];
        this.mAirohaLink.logToFile(p, "role: " + Converter.byte2HexStr(b3));
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        this.mAirohaLink.logToFile(p, "partitionAddress: " + Converter.byte2HexStr(bArr2));
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 13, bArr3, 0, 4);
        this.mAirohaLink.logToFile(p, "partitionLength: " + Converter.byte2HexStr(bArr3));
        int iBytesToInt32 = Converter.bytesToInt32(bArr3) / 4096;
        this.mAirohaLink.logToFile(p, "totalBitNum: " + String.valueOf(iBytesToInt32));
        byte[] bArr4 = new byte[2];
        System.arraycopy(bArr, 17, bArr4, 0, 2);
        this.mAirohaLink.logToFile(p, "eraseStatusSize: " + Converter.byte2HexStr(bArr4));
        int iBytesToU16 = Converter.BytesToU16(bArr4[1], bArr4[0]);
        this.mAirohaLink.logToFile(p, "eraseStatusByteLen: " + String.valueOf(iBytesToU16));
        byte[] bArr5 = new byte[iBytesToU16];
        System.arraycopy(bArr, 19, bArr5, 0, iBytesToU16);
        this.mAirohaLink.logToFile(p, "eraseStatus: " + Converter.byte2HexStr(bArr5));
        String str = Converter.byte2HexStr(bArr2) + Converter.byte2HexStr(b3);
        this.mAirohaLink.logToFile(p, "mapKey: " + str);
        LinkedHashMap<String, FotaStage.PARTITION_DATA> linkedHashMap = (b3 == 0) ^ this.mOtaMgr.checkAgentIsRight() ? FotaStage.gTwsLeftDeviceDiffPartitions : FotaStage.gTwsRightDeviceDiffPartitions;
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        int i4 = 0;
        for (int i5 = 0; i5 < iBytesToInt32; i5++) {
            int i6 = 128 >> (i5 % 8);
            boolean z = (bArr5[i5 / 8] & i6) == i6;
            ((FotaStage.PARTITION_DATA) arrayList.get(i5)).mIsErased = z;
            if (z) {
                i4++;
            }
            this.mAirohaLink.logToFile(p, "partition " + String.valueOf(i5) + " isErased = " + String.valueOf(z));
        }
        if (b3 == 0) {
            this.j = linkedHashMap.size();
            this.n = i4;
        } else {
            this.k = linkedHashMap.size();
            this.o = i4;
        }
        RacePacket racePacket = this.mCmdPacketMap.get(str);
        if (racePacket == null || b != 0) {
            return;
        }
        racePacket.setIsRespStatusSuccess();
        this.mAirohaLink.logToFile(p, "cmd success");
    }
}
