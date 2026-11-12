package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data.HMRecordType;
import com.xiaomi.fit.fitness.export.data.DataResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J(\u0010\u0013\u001a\u00020\u00142\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00050\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/SwimmingRecord;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "<init>", "()V", "paceMap", "", "", "", "strokeFreqMap", "", "getTheSportRecordVersion", "", "getTheSportDataValid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataTypeList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/HMRecordType;", "processAfterHMParse", "", "dataMap", "", "getTheMaxOneRecordByteSize", "recordOneSecData", "byteBuffer", "Ljava/nio/ByteBuffer;", "recordTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwimmingRecord implements ISportRecord {

    @Nullable
    private Map<Long, Short> paceMap;

    @Nullable
    private Map<Long, Byte> strokeFreqMap;

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public List<HMRecordType> getDataTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HMRecordType.SWIMMING_PACE);
        arrayList.add(HMRecordType.SWIMMING_STROKE_FREQ);
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getDistanceAccuracy() {
        return ISportRecord.DefaultImpls.getDistanceAccuracy(this);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheMaxOneRecordByteSize() {
        return 26;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public byte[] getTheSportDataValid(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new byte[]{DKFRequestService.o, -128};
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheSportRecordVersion() {
        return 1;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public boolean isSupportIntervalTraining() {
        return ISportRecord.DefaultImpls.isSupportIntervalTraining(this);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void processAfterHMParse(@NotNull Map<HMRecordType, ? extends Map<Long, ? extends Object>> dataMap) {
        Intrinsics.checkNotNullParameter(dataMap, "dataMap");
        this.paceMap = (Map) dataMap.get(HMRecordType.SWIMMING_PACE);
        this.strokeFreqMap = (Map) dataMap.get(HMRecordType.SWIMMING_STROKE_FREQ);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @Nullable
    public Object record(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull Continuation<? super DataResult> continuation) {
        return ISportRecord.DefaultImpls.record(this, str, j, i, i2, str2, continuation);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordHeaderPostInfo(@NotNull ByteBuffer byteBuffer, boolean z, @Nullable HMIntervalInfo hMIntervalInfo) {
        ISportRecord.DefaultImpls.recordHeaderPostInfo(this, byteBuffer, z, hMIntervalInfo);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordHeaderPreInfo(@NotNull ByteBuffer byteBuffer) {
        ISportRecord.DefaultImpls.recordHeaderPreInfo(this, byteBuffer);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordOneSecData(@NotNull ByteBuffer byteBuffer, long recordTime) {
        Short sh;
        Byte b2;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        for (int i = 0; i < 15; i++) {
            switch (i) {
                case 1:
                    byteBuffer.putInt(((int) recordTime) + 1);
                    break;
                case 2:
                default:
                    byteBuffer.put((byte) 0);
                    break;
                case 3:
                    Map<Long, Short> map = this.paceMap;
                    byteBuffer.putShort((map == null || (sh = map.get(Long.valueOf(recordTime))) == null) ? (short) 0 : sh.shortValue());
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    byteBuffer.putShort((short) 0);
                    break;
                case 9:
                    Map<Long, Byte> map2 = this.strokeFreqMap;
                    byteBuffer.put((map2 == null || (b2 = map2.get(Long.valueOf(recordTime))) == null) ? (byte) 0 : b2.byteValue());
                    break;
            }
        }
    }
}
