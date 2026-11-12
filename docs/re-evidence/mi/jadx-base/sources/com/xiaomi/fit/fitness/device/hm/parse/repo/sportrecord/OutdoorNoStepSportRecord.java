package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J(\u0010\u0015\u001a\u00020\u00162\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u00050\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/OutdoorNoStepSportRecord;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "<init>", "()V", "distanceMap", "", "", "", "hrMap", "kiloMap", "", "currentHr", "getDistanceAccuracy", "getTheSportRecordVersion", "getTheSportDataValid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataTypeList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/HMRecordType;", "processAfterHMParse", "", "dataMap", "", "getTheMaxOneRecordByteSize", "recordHeaderPreInfo", "byteBuffer", "Ljava/nio/ByteBuffer;", "recordHeaderPostInfo", "isPause", "intervalInfo", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMIntervalInfo;", "isSupportIntervalTraining", "recordOneSecData", "recordTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutdoorNoStepSportRecord implements ISportRecord {
    private int currentHr;

    @Nullable
    private Map<Long, Integer> distanceMap;

    @Nullable
    private Map<Long, Integer> hrMap;

    @Nullable
    private Map<Long, Boolean> kiloMap;

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public List<HMRecordType> getDataTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HMRecordType.HR);
        arrayList.add(HMRecordType.DISTANCE);
        arrayList.add(HMRecordType.KILO_PACE);
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getDistanceAccuracy() {
        return 100;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheMaxOneRecordByteSize() {
        return 16;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public byte[] getTheSportDataValid(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new byte[]{AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, -52};
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheSportRecordVersion() {
        return 2;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public boolean isSupportIntervalTraining() {
        return true;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void processAfterHMParse(@NotNull Map<HMRecordType, ? extends Map<Long, ? extends Object>> dataMap) {
        Intrinsics.checkNotNullParameter(dataMap, "dataMap");
        this.distanceMap = (Map) dataMap.get(HMRecordType.DISTANCE);
        this.hrMap = (Map) dataMap.get(HMRecordType.HR);
        this.kiloMap = (Map) dataMap.get(HMRecordType.KILO_PACE);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @Nullable
    public Object record(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull Continuation<? super DataResult> continuation) {
        return ISportRecord.DefaultImpls.record(this, str, j, i, i2, str2, continuation);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordHeaderPostInfo(@NotNull ByteBuffer byteBuffer, boolean isPause, @Nullable HMIntervalInfo intervalInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        int totalDistance = 0;
        if (!isPause && intervalInfo != null) {
            totalDistance = intervalInfo.getTotalDistance();
        }
        byteBuffer.putInt(totalDistance);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordHeaderPreInfo(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        byteBuffer.putInt(0);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void recordOneSecData(@NotNull ByteBuffer byteBuffer, long recordTime) {
        Integer num;
        Boolean bool;
        Integer num2;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Map<Long, Integer> map = this.hrMap;
        int iIntValue = (map == null || (num2 = map.get(Long.valueOf(recordTime))) == null) ? this.currentHr : num2.intValue();
        this.currentHr = iIntValue;
        byteBuffer.put((byte) iIntValue);
        Map<Long, Boolean> map2 = this.kiloMap;
        byte bIntValue = 0;
        byteBuffer.put((byte) ((map2 == null || (bool = map2.get(Long.valueOf(recordTime))) == null || !bool.booleanValue()) ? 0 : 128));
        Map<Long, Integer> map3 = this.distanceMap;
        if (map3 != null && (num = map3.get(Long.valueOf(recordTime))) != null) {
            bIntValue = (byte) num.intValue();
        }
        byteBuffer.put(bIntValue);
    }
}
