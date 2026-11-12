package com.xiaomi.fit.fitness.persist.process;

import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0010H\u0002J&\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J<\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020(0'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils;", "", "<init>", "()V", "TAG", "", "VERSION_SLEEP_PROTO", "", "convertAndUploadDecibelData", "", "sid", "dateTimeInMilli", "", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "convertSnoreDecibelBytes", "", "uploadSnoreDecibelBytes", "", "dataBytes", "convertDecibelToNewProtoBytes", "report", "list", "", "Lcom/xiaomi/fit/fitness/persist/process/SnoreDecibelData;", "getSnoreDecibelFile", "Ljava/io/File;", "dateTime", "parseOldDecibelFile", "file", "isLittleEndian", "bytes", "processSleepDecibelToBytes", "sleepBedTime", "sleepWakeupTime", "convertDecibelToBytes", "startTime", "endTime", "map", "", "", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSnoreDecibelUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepSnoreDecibelUtils instance = new SleepSnoreDecibelUtils();

    @NotNull
    private final String TAG = "SleepSnoreDecibelUtils";
    private final int VERSION_SLEEP_PROTO = 3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/process/SleepSnoreDecibelUtils;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepSnoreDecibelUtils getInstance() {
            return SleepSnoreDecibelUtils.instance;
        }
    }

    private SleepSnoreDecibelUtils() {
    }

    private final byte[] convertDecibelToBytes(long sleepBedTime, long sleepWakeupTime, long startTime, long endTime, Map<Long, Float> map) {
        float fFloatValue;
        long j = startTime;
        long j2 = 60;
        short s = (short) (((endTime / j2) - (j / j2)) + 1);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((s * 4) + 17).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.putInt((int) sleepBedTime);
        byteBufferOrder.putInt((int) sleepWakeupTime);
        byteBufferOrder.putShort((short) 60);
        byteBufferOrder.putShort(s);
        byteBufferOrder.putInt((int) j);
        while (j <= endTime) {
            if (map.get(Long.valueOf(j)) == null) {
                fFloatValue = 0.0f;
            } else {
                Float f = map.get(Long.valueOf(j));
                Intrinsics.checkNotNull(f);
                fFloatValue = f.floatValue();
            }
            byteBufferOrder.putFloat(fFloatValue);
            j += j2;
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final byte[] convertDecibelToNewProtoBytes(SleepSegmentReport report, List<SnoreDecibelData> list) {
        return processSleepDecibelToBytes(report.getBedTime(), report.getWakeupTime(), list);
    }

    private final byte[] convertSnoreDecibelBytes(long dateTimeInMilli, SleepSegmentReport segmentReport) {
        File snoreDecibelFile = getSnoreDecibelFile(dateTimeInMilli);
        if (!snoreDecibelFile.exists()) {
            FitnessLogUtils.i(this.TAG, "convertSnoreDecibelBytes: file(" + snoreDecibelFile.getPath() + ") not exist");
            return null;
        }
        List<SnoreDecibelData> oldDecibelFile = parseOldDecibelFile(snoreDecibelFile);
        FitnessLogUtils.i(this.TAG, "convertSnoreDecibelBytes: file(" + snoreDecibelFile.getPath() + ")--decibelListSize(" + oldDecibelFile.size() + ")");
        if (oldDecibelFile.isEmpty()) {
            return null;
        }
        return convertDecibelToNewProtoBytes(segmentReport, oldDecibelFile);
    }

    private final File getSnoreDecibelFile(long dateTime) {
        return new File(SnoreConfiguration.getAudioRootPath(ApplicationExtKt.getApplication()) + File.separator + SnoreConfiguration.getAudioResultRelativeDir(dateTime), "snore_info.dat");
    }

    private final boolean isLittleEndian(byte[] bytes) {
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bytes, 0, 4);
        byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(bytes, 4, 8);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrCopyOfRange);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        int i = byteBufferWrap.order(byteOrder).getInt();
        float f = ByteBuffer.wrap(bArrCopyOfRange2).order(byteOrder).getFloat();
        return i <= 0 || ((double) f) <= 0.0d || f > 10000.0f;
    }

    private final List<SnoreDecibelData> parseOldDecibelFile(File file) {
        byte[] file2 = FitnessFileUtils.INSTANCE.readFile(file);
        if (file2 == null || file2.length == 0 || file2.length < 8) {
            FitnessLogUtils.i(this.TAG, "parseOldDecibelFile: no valid bytes");
            List<SnoreDecibelData> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }
        ByteOrder byteOrder = isLittleEndian(file2) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(file2).order(byteOrder);
        int iCapacity = byteBufferOrder.capacity();
        FitnessLogUtils.i(this.TAG, "parseOldDecibelFile: byteSize(" + iCapacity + ")");
        while (byteBufferOrder.position() + 8 <= iCapacity) {
            arrayList.add(new SnoreDecibelData(((long) byteBufferOrder.getInt()) & 4294967295L, byteBufferOrder.getFloat()));
        }
        return arrayList;
    }

    private final byte[] processSleepDecibelToBytes(long sleepBedTime, long sleepWakeupTime, List<SnoreDecibelData> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = 0;
        long j2 = 0;
        for (SnoreDecibelData snoreDecibelData : list) {
            long j3 = 60;
            long time = (snoreDecibelData.getTime() / j3) * j3;
            if (linkedHashMap.get(Long.valueOf(time)) == null) {
                linkedHashMap.put(Long.valueOf(time), new ArrayList());
            }
            Object obj = linkedHashMap.get(Long.valueOf(time));
            Intrinsics.checkNotNull(obj);
            ListExtKt.add((List) obj, Float.valueOf(snoreDecibelData.getValue()));
            if (j2 < time) {
                j2 = time;
            }
            if (j <= 0 || j > time) {
                j = time;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                Iterator it = ((List) entry.getValue()).iterator();
                int i = 0;
                float f = 0.0f;
                while (it.hasNext()) {
                    float fFloatValue = ((Number) it.next()).floatValue();
                    if (fFloatValue > 0.0f) {
                        f += fFloatValue;
                        i++;
                    }
                }
                linkedHashMap2.put(entry.getKey(), Float.valueOf(i != 0 ? f / i : 0.0f));
            }
        }
        return convertDecibelToBytes(sleepBedTime, sleepWakeupTime, j, j2, linkedHashMap2);
    }

    private final boolean uploadSnoreDecibelBytes(String sid, byte[] dataBytes, SleepSegmentReport segmentReport) {
        segmentReport.setVersion(Integer.valueOf(this.VERSION_SLEEP_PROTO));
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(segmentReport.getWakeupTime()).timeZoneIn15Min(segmentReport.getTzIn15Min()).dailyType(8).fileType(0).version(this.VERSION_SLEEP_PROTO).build();
        byte[] dataHeaderBytes = FitnessDataHeader.INSTANCE.toDataHeaderBytes(fitnessDataIdBuild, new byte[]{8});
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataHeaderBytes.length + dataBytes.length);
        byteBufferAllocate.put(dataHeaderBytes);
        byteBufferAllocate.put(dataBytes);
        FitnessLogUtils.i(this.TAG, "uploadSnoreDecibelBytes(" + fitnessDataIdBuild + ")- byteSize(" + byteBufferAllocate.position() + ")");
        FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return fitnessDataExtKt.recordFDSData(sid, fitnessDataIdBuild, bArrArray);
    }

    public final void convertAndUploadDecibelData(@NotNull String sid, long dateTimeInMilli, @NotNull SleepSegmentReport segmentReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        byte[] bArrConvertSnoreDecibelBytes = convertSnoreDecibelBytes(dateTimeInMilli, segmentReport);
        if (bArrConvertSnoreDecibelBytes == null || bArrConvertSnoreDecibelBytes.length == 0) {
            FitnessLogUtils.i(this.TAG, "convertAndUploadDecibelData: no bytes");
            return;
        }
        boolean zUploadSnoreDecibelBytes = uploadSnoreDecibelBytes(sid, bArrConvertSnoreDecibelBytes, segmentReport);
        FitnessLogUtils.i(this.TAG, "uploadSnoreDecibelBytes result = (" + zUploadSnoreDecibelBytes + ")");
    }
}
