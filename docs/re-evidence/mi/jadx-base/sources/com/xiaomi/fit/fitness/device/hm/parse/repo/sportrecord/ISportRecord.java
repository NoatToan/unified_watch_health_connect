package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data.HMRecordType;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data.PauseItem;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J(\u0010\u000b\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e0\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J6\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020 H\u0096@¢\u0006\u0002\u0010%J2\u0010&\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002JL\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e0\u000e2\u0006\u0010!\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\t2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\nH\u0002J(\u00100\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002J)\u00103\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u0082@¨\u00067"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/ISportRecord;", "", "getTheSportRecordVersion", "", "getTheSportDataValid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getDataTypeList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/HMRecordType;", "processAfterHMParse", "", "dataMap", "", "", "getTheMaxOneRecordByteSize", "recordOneSecData", "byteBuffer", "Ljava/nio/ByteBuffer;", "recordTime", "recordHeaderPreInfo", "recordHeaderPostInfo", "isPause", "", "intervalInfo", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMIntervalInfo;", "isSupportIntervalTraining", "getDistanceAccuracy", "record", "Lcom/xiaomi/fit/fitness/export/data/DataResult;", "sid", "", "startTime", "tzIn15min", DailyRecordKey.sportType, "data", "(Ljava/lang/String;JIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordSportHeader", "recordCount", "parseHMDataByGivenType", "pauseList", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/PauseItem;", "dataJson", "Lorg/json/JSONObject;", "recordTypes", "getHMRecordTypeKey", "recordType", "getRecordDataId", "tzIn15Min", "recordVersion", "recordRecordFDSData", "dataFile", "Ljava/io/File;", "dataValid", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportRecord {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int getDistanceAccuracy(@NotNull ISportRecord iSportRecord) {
            return 10;
        }

        private static String getHMRecordTypeKey(ISportRecord iSportRecord, HMRecordType hMRecordType) {
            switch (WhenMappings.$EnumSwitchMapping$0[hMRecordType.ordinal()]) {
                case 1:
                    return "heart_rate";
                case 2:
                    return "gait";
                case 3:
                case 6:
                    return "speed";
                case 4:
                    return "kilo_pace";
                case 5:
                    return "pressure";
                case 7:
                    return "stroke_speed";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private static FitnessDataId getRecordDataId(ISportRecord iSportRecord, long j, int i, int i2, int i3) {
            FitnessDataId.Builder builder = new FitnessDataId.Builder();
            builder.setFileType(0);
            builder.setVersion(i3);
            builder.setDataType(1);
            builder.setTzIn15Min(i);
            builder.setTimeStamp(j);
            builder.setSportType(i2);
            return builder.build();
        }

        public static boolean isSupportIntervalTraining(@NotNull ISportRecord iSportRecord) {
            return false;
        }

        private static Map<HMRecordType, Map<Long, Object>> parseHMDataByGivenType(ISportRecord iSportRecord, long j, List<PauseItem> list, JSONObject jSONObject, List<? extends HMRecordType> list2) {
            Object hr;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (HMRecordType hMRecordType : list2) {
                String hMRecordTypeKey = getHMRecordTypeKey(iSportRecord, hMRecordType);
                if (jSONObject.has(hMRecordTypeKey)) {
                    String strOptString = jSONObject.optString(hMRecordTypeKey);
                    switch (WhenMappings.$EnumSwitchMapping$0[hMRecordType.ordinal()]) {
                        case 1:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseHr(strOptString, j);
                            break;
                        case 2:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseStepInfo(strOptString, j);
                            break;
                        case 3:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseSpeedDistance(strOptString, j, iSportRecord.getDistanceAccuracy());
                            break;
                        case 4:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseWholeKilo(strOptString, j, list);
                            break;
                        case 5:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseStress(strOptString, j);
                            break;
                        case 6:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseSwimmingPace(strOptString, j);
                            break;
                        case 7:
                            Intrinsics.checkNotNull(strOptString);
                            hr = RecordHelperKt.parseStrokeFreq(strOptString, j);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNull(hr, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.Any>");
                    linkedHashMap.put(hMRecordType, hr);
                }
            }
            return linkedHashMap;
        }

        /* JADX WARN: Code duplicated, block: B:63:0x0166 A[PHI: r21 r27 r28
          0x0166: PHI (r21v2 long) = (r21v1 long), (r21v7 long) binds: [B:52:0x0136, B:61:0x0159] A[DONT_GENERATE, DONT_INLINE]
          0x0166: PHI (r27v2 com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.HMIntervalInfo) = 
          (r27v1 com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.HMIntervalInfo)
          (r27v6 com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.HMIntervalInfo)
         binds: [B:52:0x0136, B:61:0x0159] A[DONT_GENERATE, DONT_INLINE]
          0x0166: PHI (r28v2 int) = (r28v1 int), (r28v5 int) binds: [B:52:0x0136, B:61:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x016e  */
        /* JADX WARN: Code duplicated, block: B:68:0x017b  */
        /* JADX WARN: Code duplicated, block: B:70:0x017f  */
        /* JADX WARN: Code duplicated, block: B:71:0x018a  */
        /* JADX WARN: Code duplicated, block: B:76:0x016a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x019f A[SYNTHETIC] */
        @Nullable
        public static Object record(@NotNull ISportRecord iSportRecord, @NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull Continuation<? super DataResult> continuation) throws Throwable {
            ArrayList<HMIntervalInfo> intervalInfo;
            HMIntervalInfo hMIntervalInfo;
            int i3;
            long endTime;
            long j2;
            boolean z;
            FitnessDataId recordDataId = getRecordDataId(iSportRecord, j, i, i2, iSportRecord.getTheSportRecordVersion());
            File cacheDataFile = FitnessFileUtils.getCacheDataFile(ApplicationExtKt.getApplication(), str, recordDataId);
            if (cacheDataFile.exists()) {
                cacheDataFile.delete();
            }
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
            JSONObject jSONObject = new JSONObject(str2);
            long jOptLong = jSONObject.optLong(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            String strOptString = jSONObject.optString("pause");
            Intrinsics.checkNotNull(strOptString);
            ArrayList<PauseItem> pauseTime = RecordHelperKt.parsePauseTime(strOptString);
            String strOptString2 = jSONObject.optString("lap");
            if (TextUtils.isEmpty(strOptString2)) {
                intervalInfo = null;
            } else {
                Intrinsics.checkNotNull(strOptString2);
                intervalInfo = RecordHelperKt.parseIntervalInfo(strOptString2, j);
            }
            ArrayList<HMIntervalInfo> arrayList = intervalInfo;
            iSportRecord.processAfterHMParse(parseHMDataByGivenType(iSportRecord, j, pauseTime, jSONObject, iSportRecord.getDataTypeList()));
            int size = pauseTime.size();
            boolean z2 = false;
            long startTime = size > 0 ? pauseTime.get(0).getStartTime() : 0L;
            long endTime2 = size > 0 ? pauseTime.get(0).getEndTime() : 0L;
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size2 > 0) {
                Intrinsics.checkNotNull(arrayList);
                hMIntervalInfo = arrayList.get(0);
            } else {
                hMIntervalInfo = null;
            }
            long startTime2 = j;
            long startTime3 = startTime;
            long j3 = endTime2;
            int i4 = 0;
            int i5 = 0;
            HMIntervalInfo hMIntervalInfo2 = hMIntervalInfo;
            long j4 = startTime2;
            while (j4 <= jOptLong) {
                if (byteBufferOrder.position() + iSportRecord.getTheMaxOneRecordByteSize() > 1024) {
                    HMParseUtilKt.appendBytesToFile(byteBufferOrder, cacheDataFile);
                }
                long endTime3 = hMIntervalInfo2 != null ? hMIntervalInfo2.getEndTime() : 0L;
                if (j4 == startTime2) {
                    if (endTime3 <= 0 || ((startTime3 <= 0 || 1 > endTime3 || endTime3 >= startTime3) && startTime3 > 0)) {
                        j2 = startTime3 > 0 ? startTime3 - startTime2 : jOptLong - j4;
                        z = true;
                    } else {
                        j2 = endTime3 - startTime2;
                        z = z2;
                    }
                    Intrinsics.checkNotNull(byteBufferOrder);
                    recordSportHeader(iSportRecord, byteBufferOrder, startTime2, j2, z, hMIntervalInfo2);
                }
                if (j4 == endTime3) {
                    int i6 = i4 + 1;
                    if (size2 > i6) {
                        Intrinsics.checkNotNull(arrayList);
                        hMIntervalInfo2 = arrayList.get(i6);
                    } else {
                        hMIntervalInfo2 = null;
                    }
                    startTime2 = hMIntervalInfo2 != null ? hMIntervalInfo2.getStartTime() : j4;
                    i4 = i6;
                    if (j4 == j3) {
                        if (j4 == startTime3) {
                            i3 = i5 + 1;
                            if (size > i3) {
                                startTime3 = pauseTime.get(i3).getStartTime();
                            } else {
                                startTime3 = 0;
                            }
                            if (size > i3) {
                                endTime = pauseTime.get(i3).getEndTime();
                            } else {
                                endTime = 0;
                            }
                            i5 = i3;
                            j4 = j3;
                            startTime2 = j4;
                            j3 = endTime;
                        } else {
                            long j5 = j4 + 1;
                            Intrinsics.checkNotNull(byteBufferOrder);
                            iSportRecord.recordOneSecData(byteBufferOrder, j5);
                            j4 = j5;
                        }
                    }
                } else if (j4 == startTime3) {
                    i3 = i5 + 1;
                    if (size > i3) {
                        startTime3 = pauseTime.get(i3).getStartTime();
                    } else {
                        startTime3 = 0;
                    }
                    if (size > i3) {
                        endTime = pauseTime.get(i3).getEndTime();
                    } else {
                        endTime = 0;
                    }
                    i5 = i3;
                    j4 = j3;
                    startTime2 = j4;
                    j3 = endTime;
                } else {
                    long j6 = j4 + 1;
                    Intrinsics.checkNotNull(byteBufferOrder);
                    iSportRecord.recordOneSecData(byteBufferOrder, j6);
                    j4 = j6;
                }
            }
            HMParseUtilKt.appendBytesToFile(byteBufferOrder, cacheDataFile);
            return recordRecordFDSData(iSportRecord, str, recordDataId, cacheDataFile, iSportRecord.getTheSportDataValid(recordDataId), continuation);
        }

        public static void recordHeaderPostInfo(@NotNull ISportRecord iSportRecord, @NotNull ByteBuffer byteBuffer, boolean z, @Nullable HMIntervalInfo hMIntervalInfo) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        }

        public static void recordHeaderPreInfo(@NotNull ISportRecord iSportRecord, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object recordRecordFDSData(ISportRecord iSportRecord, String str, FitnessDataId fitnessDataId, File file, byte[] bArr, Continuation<? super DataResult> continuation) {
            byte[] dataHeaderBytes = FitnessDataHeader.INSTANCE.toDataHeaderBytes(fitnessDataId, bArr);
            byte[] file2 = FitnessFileUtils.INSTANCE.readFile(file);
            if (file2 == null) {
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportRecordParse: no data(" + fitnessDataId + ")");
                return new DataResult(false);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataHeaderBytes.length + file2.length);
            byteBufferAllocate.put(dataHeaderBytes);
            byteBufferAllocate.put(file2);
            file.deleteOnExit();
            FitnessDataProcessor companion = FitnessDataProcessor.INSTANCE.getInstance();
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            return companion.parseAndRecord(str, fitnessDataId, bArrArray, continuation);
        }

        private static void recordSportHeader(ISportRecord iSportRecord, ByteBuffer byteBuffer, long j, long j2, boolean z, HMIntervalInfo hMIntervalInfo) {
            int state = hMIntervalInfo != null ? hMIntervalInfo.getState() : 127;
            iSportRecord.recordHeaderPreInfo(byteBuffer);
            byteBuffer.putInt((int) j2);
            byteBuffer.putInt((int) j);
            if (iSportRecord.isSupportIntervalTraining()) {
                byteBuffer.put((byte) ((z ? 0 : 128) + state));
            }
            iSportRecord.recordHeaderPostInfo(byteBuffer, z, hMIntervalInfo);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMRecordType.values().length];
            try {
                iArr[HMRecordType.HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMRecordType.GAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMRecordType.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HMRecordType.KILO_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HMRecordType.STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HMRecordType.SWIMMING_PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HMRecordType.SWIMMING_STROKE_FREQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    List<HMRecordType> getDataTypeList();

    int getDistanceAccuracy();

    int getTheMaxOneRecordByteSize();

    @NotNull
    byte[] getTheSportDataValid(@NotNull FitnessDataId dataId);

    int getTheSportRecordVersion();

    boolean isSupportIntervalTraining();

    void processAfterHMParse(@NotNull Map<HMRecordType, ? extends Map<Long, ? extends Object>> dataMap);

    @Nullable
    Object record(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull Continuation<? super DataResult> continuation);

    void recordHeaderPostInfo(@NotNull ByteBuffer byteBuffer, boolean isPause, @Nullable HMIntervalInfo intervalInfo);

    void recordHeaderPreInfo(@NotNull ByteBuffer byteBuffer);

    void recordOneSecData(@NotNull ByteBuffer byteBuffer, long recordTime);
}
