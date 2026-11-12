package com.airoha.android.lib.fota.stage.forTws;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.RaceCmdGetStoragePartitionSHA256;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;
import com.airoha.android.lib.util.ContentConcatenater;
import com.airoha.android.lib.util.Converter;
import com.airoha.android.lib.util.SHA256;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage_24_TwsComparePartitionV2Storage extends FotaStage {
    private static final String q = "AirohaFota24_TwsCompare";
    private int f;
    private int g;
    private HashMap<Byte, String> h;
    private HashMap<Byte, String> i;
    private HashMap<Byte, ArrayList<FotaStage.PARTITION_DATA>> j;
    private HashMap<Byte, FotaStage.PARTITION_DATA> k;
    private HashMap<Byte, FotaStage.PARTITION_DATA> l;
    private HashMap<Byte, byte[]> m;
    private HashMap<Byte, byte[]> n;
    private HashMap<Byte, byte[]> o;
    private HashMap<Byte, byte[]> p;

    public FotaStage_24_TwsComparePartitionV2Storage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        super(airohaRaceOtaMgr);
        this.f = 0;
        this.g = 0;
        this.mRaceId = RaceId.RACE_STORAGE_GET_PARTITION_SHA256;
        this.mRaceRespType = RaceType.INDICATION;
        this.mFotaStageIndex = FotaStageEnum.TwsComparePartitionV2Storage;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void b(Byte b, ArrayList<FotaStage.PARTITION_DATA> arrayList) {
        int size = arrayList.size() - 1;
        this.l.put(b, arrayList.get(size));
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (!arrayList.get(size).mIsErased) {
                break;
            } else {
                size--;
            }
        }
        if (size >= 0) {
            FotaStage.PARTITION_DATA partition_data = arrayList.get(size);
            this.k.put(b, partition_data);
            byte[] bArr = partition_data.mAddr;
            String strByte2HexStr = Converter.byte2HexStr(bArr);
            this.i.put(b, strByte2HexStr + Converter.byte2HexStr(b.byteValue()));
            this.n.put(b, partition_data.mSHA256);
            byte[] bArrIntToByteArray = Converter.intToByteArray(partition_data.mDataLen);
            this.mAirohaLink.logToFile(q, "target role: " + Converter.byte2HexStr(b.byteValue()));
            this.mAirohaLink.logToFile(q, "target sha256_2_addr: " + Converter.byte2HexStr(bArr));
            this.mAirohaLink.logToFile(q, "target sha256_2_byteLen: " + Converter.byte2HexStr(bArrIntToByteArray));
            this.mAirohaLink.logToFile(q, "target targetSHA256_2: " + Converter.byte2HexStr(partition_data.mSHA256));
            RaceCmdGetStoragePartitionSHA256 raceCmdGetStoragePartitionSHA256 = new RaceCmdGetStoragePartitionSHA256(b.byteValue(), this.mOtaMgr.getFotaStorageType(), bArr, bArrIntToByteArray);
            this.mCmdPacketQueue.offer(raceCmdGetStoragePartitionSHA256);
            this.mCmdPacketMap.put(this.i.get(b), raceCmdGetStoragePartitionSHA256);
        }
        if (size > 0) {
            ArrayList<FotaStage.PARTITION_DATA> arrayList2 = new ArrayList<>();
            this.j.put(b, arrayList2);
            byte[] bArrConcatenateByteArrays = new byte[0];
            for (int i = 0; i < size; i++) {
                FotaStage.PARTITION_DATA partition_data2 = arrayList.get(i);
                if (partition_data2.mIsErased) {
                    break;
                }
                arrayList2.add(partition_data2);
                bArrConcatenateByteArrays = ContentConcatenater.concatenateByteArrays(bArrConcatenateByteArrays, partition_data2.mData);
            }
            this.m.put(b, SHA256.calculate(bArrConcatenateByteArrays));
            byte[] bArr2 = arrayList.get(0).mAddr;
            String strByte2HexStr2 = Converter.byte2HexStr(bArr2);
            this.h.put(b, strByte2HexStr2 + Converter.byte2HexStr(b.byteValue()));
            Iterator<FotaStage.PARTITION_DATA> it2 = this.j.get(b).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += it2.next().mDataLen;
            }
            if (i2 == 0) {
                this.m.put(b, new byte[0]);
                this.o.put(b, new byte[0]);
                return;
            }
            byte[] bArrIntToByteArray2 = Converter.intToByteArray(i2);
            RaceCmdGetStoragePartitionSHA256 raceCmdGetStoragePartitionSHA257 = new RaceCmdGetStoragePartitionSHA256(b.byteValue(), this.mOtaMgr.getFotaStorageType(), bArr2, bArrIntToByteArray2);
            this.mCmdPacketQueue.offer(raceCmdGetStoragePartitionSHA257);
            this.mCmdPacketMap.put(this.h.get(b), raceCmdGetStoragePartitionSHA257);
            this.mAirohaLink.logToFile(q, "target role: " + Converter.byte2HexStr(b.byteValue()));
            this.mAirohaLink.logToFile(q, "target sha256_1_addr: " + Converter.byte2HexStr(bArr2));
            this.mAirohaLink.logToFile(q, "target sha256_1_byteLen: " + Converter.byte2HexStr(bArrIntToByteArray2));
            this.mAirohaLink.logToFile(q, "target targetSHA256_1: " + Converter.byte2HexStr(this.m.get(b)));
        }
    }

    public IAirohaFotaStage.SKIP_TYPE c(Byte b) {
        IAirohaFotaStage.SKIP_TYPE skip_type = IAirohaFotaStage.SKIP_TYPE.None;
        if (!this.n.containsKey(b)) {
            return IAirohaFotaStage.SKIP_TYPE.Erase_stages;
        }
        this.mAirohaLink.logToFile(q, "mTargetSHA256_2_" + String.valueOf(b) + Converter.byte2HexStr(this.n.get(b)));
        this.mAirohaLink.logToFile(q, "mRealSHA256_2" + String.valueOf(b) + Converter.byte2HexStr(this.p.get(b)));
        if (Arrays.equals(this.n.get(b), this.p.get(b))) {
            this.k.get(b).mIsDiff = false;
        }
        if (!this.m.containsKey(b)) {
            return !this.k.get(b).mIsDiff ? IAirohaFotaStage.SKIP_TYPE.Erase_stages : skip_type;
        }
        this.mAirohaLink.logToFile(q, "mTargetSHA256_1: " + Converter.byte2HexStr(this.m.get(b)));
        this.mAirohaLink.logToFile(q, "mRealSHA256_1: " + Converter.byte2HexStr(this.o.get(b)));
        if (!Arrays.equals(this.m.get(b), this.o.get(b))) {
            return skip_type;
        }
        Iterator<FotaStage.PARTITION_DATA> it2 = this.j.get(b).iterator();
        while (it2.hasNext()) {
            it2.next().mIsDiff = false;
        }
        if (this.k.get(b).mIsDiff) {
            return skip_type;
        }
        return Arrays.equals(this.l.get(b).mAddr, this.k.get(b).mAddr) ? IAirohaFotaStage.SKIP_TYPE.All_stages : IAirohaFotaStage.SKIP_TYPE.Erase_stages;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
        ArrayList<FotaStage.PARTITION_DATA> arrayList;
        ArrayList<FotaStage.PARTITION_DATA> arrayList2;
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        Arrays.fill(new byte[4096], (byte) -1);
        try {
            if (this.mOtaMgr.checkAgentIsRight()) {
                arrayList = new ArrayList<>(FotaStage.gTwsRightDeviceDiffPartitions.values());
                arrayList2 = new ArrayList<>(FotaStage.gTwsLeftDeviceDiffPartitions.values());
            } else {
                arrayList = new ArrayList<>(FotaStage.gTwsLeftDeviceDiffPartitions.values());
                arrayList2 = new ArrayList<>(FotaStage.gTwsRightDeviceDiffPartitions.values());
            }
            if (!arrayList.get(0).mIsErased) {
                b((byte) 0, arrayList);
            }
            if (!arrayList2.get(0).mIsErased) {
                b((byte) 1, arrayList2);
            }
            this.f = this.mCmdPacketQueue.size();
            this.g = 0;
        } catch (Exception e) {
            ErrorEnum errorEnum = ErrorEnum.EXCEPTION;
            this.mErrorCode = errorEnum;
            this.mOtaMgr.notifyAppListenerError(this.mFotaStageIndex, errorEnum, e.getMessage());
        }
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (!racePacket.isRespStatusSuccess()) {
                RaceCmdGetStoragePartitionSHA256 raceCmdGetStoragePartitionSHA256 = (RaceCmdGetStoragePartitionSHA256) racePacket;
                this.mAirohaLink.logToFile(q, "addr is not resp yet: addr = " + Converter.byte2HexStr(raceCmdGetStoragePartitionSHA256.getAddr()) + ", role = " + Converter.byte2HexStr(raceCmdGetStoragePartitionSHA256.getRole()));
                return false;
            }
        }
        IAirohaFotaStage.SKIP_TYPE skip_typeC = c((byte) 0);
        IAirohaFotaStage.SKIP_TYPE skip_typeC2 = c((byte) 1);
        this.mSkipType = IAirohaFotaStage.SKIP_TYPE.Sinlge_StateUpdate_stages;
        IAirohaFotaStage.SKIP_TYPE skip_type = IAirohaFotaStage.SKIP_TYPE.All_stages;
        if (skip_typeC == skip_type) {
            this.mSkipType = skip_type;
        } else if (skip_typeC2 == skip_type || skip_typeC2 == IAirohaFotaStage.SKIP_TYPE.Erase_stages) {
            IAirohaFotaStage.SKIP_TYPE skip_type2 = IAirohaFotaStage.SKIP_TYPE.Erase_stages;
            if (skip_typeC == skip_type2) {
                this.mSkipType = skip_type2;
            } else {
                this.mSkipType = IAirohaFotaStage.SKIP_TYPE.Client_Erase_stages;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.FotaStage, com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        if (i2 != 93) {
            return;
        }
        this.mAirohaLink.logToFile(q, "resp status: " + ((int) b));
        int i3 = this.g + 1;
        this.g = i3;
        this.mOtaMgr.notifyAppListenerStatus(String.format("Comparing: %d / %d", Integer.valueOf(i3), Integer.valueOf(this.f)));
        byte b2 = bArr[7];
        byte b3 = bArr[8];
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 13, bArr3, 0, 4);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr, 17, bArr4, 0, 32);
        this.mAirohaLink.logToFile(q, "resp storageType " + Converter.byte2HexStr(b2));
        this.mAirohaLink.logToFile(q, "resp role: " + Converter.byte2HexStr(b3));
        this.mAirohaLink.logToFile(q, "resp partitionAddress: " + Converter.byte2HexStr(bArr2));
        this.mAirohaLink.logToFile(q, "resp partitionLength: " + Converter.byte2HexStr(bArr3));
        this.mAirohaLink.logToFile(q, "resp sha256: " + Converter.byte2HexStr(bArr4));
        String str = Converter.byte2HexStr(bArr2) + Converter.byte2HexStr(b3);
        if (str.equals(this.h.get(Byte.valueOf(b3)))) {
            this.o.put(Byte.valueOf(b3), bArr4);
        } else if (str.equals(this.i.get(Byte.valueOf(b3)))) {
            this.p.put(Byte.valueOf(b3), bArr4);
        }
        RacePacket racePacket = this.mCmdPacketMap.get(str);
        if (racePacket == null || b != 0) {
            return;
        }
        racePacket.setIsRespStatusSuccess();
    }
}
