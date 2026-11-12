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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J(\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u00050\u0005H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\fH\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\fH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/OutdoorStepSportRecord;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "<init>", "()V", "stepInfoMap", "", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMStepInfo;", "distanceMap", "", "hrMap", "kiloMap", "", "currentHr", "curStride", "curStepFreq", "getTheSportRecordVersion", "getTheSportDataValid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataTypeList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/HMRecordType;", "processAfterHMParse", "", "dataMap", "", "getTheMaxOneRecordByteSize", "recordHeaderPreInfo", "byteBuffer", "Ljava/nio/ByteBuffer;", "recordHeaderPostInfo", "isPause", "intervalInfo", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMIntervalInfo;", "isSupportIntervalTraining", "recordOneSecData", "recordTime", "isStepInfoValid", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutdoorStepSportRecord implements ISportRecord {
    private int curStepFreq;
    private int curStride;
    private int currentHr;

    @Nullable
    private Map<Long, Integer> distanceMap;

    @Nullable
    private Map<Long, Integer> hrMap;

    @Nullable
    private Map<Long, Boolean> kiloMap;

    @Nullable
    private Map<Long, HMStepInfo> stepInfoMap;

    private final boolean isStepInfoValid() {
        Map<Long, HMStepInfo> map = this.stepInfoMap;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            if (!map.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public List<HMRecordType> getDataTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HMRecordType.HR);
        arrayList.add(HMRecordType.GAIT);
        arrayList.add(HMRecordType.DISTANCE);
        arrayList.add(HMRecordType.KILO_PACE);
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getDistanceAccuracy() {
        return ISportRecord.DefaultImpls.getDistanceAccuracy(this);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheMaxOneRecordByteSize() {
        return 18;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    @NotNull
    public byte[] getTheSportDataValid(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        boolean zIsStepInfoValid = isStepInfoValid();
        byte[] bArr = new byte[5];
        bArr[0] = (byte) (zIsStepInfoValid ? 172 : 12);
        bArr[1] = -52;
        bArr[2] = (byte) (zIsStepInfoValid ? 192 : 0);
        bArr[3] = (byte) (zIsStepInfoValid ? 12 : 0);
        bArr[4] = 0;
        return bArr;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public int getTheSportRecordVersion() {
        return 5;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public boolean isSupportIntervalTraining() {
        return true;
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.ISportRecord
    public void processAfterHMParse(@NotNull Map<HMRecordType, ? extends Map<Long, ? extends Object>> dataMap) {
        Intrinsics.checkNotNullParameter(dataMap, "dataMap");
        this.stepInfoMap = (Map) dataMap.get(HMRecordType.GAIT);
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
        boolean zIsStepInfoValid = isStepInfoValid();
        Map<Long, HMStepInfo> map = this.stepInfoMap;
        HMStepInfo hMStepInfo = map != null ? map.get(Long.valueOf(recordTime)) : null;
        byte bIntValue = 0;
        if (zIsStepInfoValid) {
            byteBuffer.put((byte) (hMStepInfo != null ? hMStepInfo.getStep() : 0));
        }
        Map<Long, Integer> map2 = this.hrMap;
        int iIntValue = (map2 == null || (num2 = map2.get(Long.valueOf(recordTime))) == null) ? this.currentHr : num2.intValue();
        this.currentHr = iIntValue;
        byteBuffer.put((byte) iIntValue);
        Map<Long, Boolean> map3 = this.kiloMap;
        byteBuffer.put((byte) ((map3 == null || (bool = map3.get(Long.valueOf(recordTime))) == null || !bool.booleanValue()) ? 0 : 128));
        Map<Long, Integer> map4 = this.distanceMap;
        if (map4 != null && (num = map4.get(Long.valueOf(recordTime))) != null) {
            bIntValue = (byte) num.intValue();
        }
        byteBuffer.put(bIntValue);
        if (zIsStepInfoValid) {
            int cadence = hMStepInfo != null ? hMStepInfo.getCadence() : this.curStride;
            this.curStride = cadence;
            if (cadence > 255) {
                cadence = 255;
            }
            byteBuffer.put((byte) cadence);
            int stepFreq = hMStepInfo != null ? hMStepInfo.getStepFreq() : this.curStepFreq;
            this.curStepFreq = stepFreq;
            byteBuffer.put((byte) (stepFreq <= 255 ? stepFreq : 255));
        }
    }
}
