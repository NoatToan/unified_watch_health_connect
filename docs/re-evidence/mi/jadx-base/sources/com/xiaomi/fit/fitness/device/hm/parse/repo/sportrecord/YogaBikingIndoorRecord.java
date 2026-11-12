package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J(\u0010\u0011\u001a\u00020\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00050\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/YogaBikingIndoorRecord;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "<init>", "()V", "hrMap", "", "", "", "currentHr", "getTheSportRecordVersion", "getTheSportDataValid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataTypeList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/HMRecordType;", "processAfterHMParse", "", "dataMap", "", "getTheMaxOneRecordByteSize", "recordOneSecData", "byteBuffer", "Ljava/nio/ByteBuffer;", "recordTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YogaBikingIndoorRecord implements ISportRecord {
    private int currentHr;

    @Nullable
    private Map<Long, Integer> hrMap;

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public List<HMRecordType> getDataTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HMRecordType.HR);
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getDistanceAccuracy() {
        return ISportRecord.DefaultImpls.getDistanceAccuracy(this);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheMaxOneRecordByteSize() {
        return 10;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public byte[] getTheSportDataValid(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new byte[]{-128};
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
        this.hrMap = (Map) dataMap.get(HMRecordType.HR);
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
        Integer num;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Map<Long, Integer> map = this.hrMap;
        int iIntValue = (map == null || (num = map.get(Long.valueOf(recordTime))) == null) ? this.currentHr : num.intValue();
        this.currentHr = iIntValue;
        byteBuffer.put((byte) iIntValue);
        byteBuffer.put((byte) 0);
    }
}
