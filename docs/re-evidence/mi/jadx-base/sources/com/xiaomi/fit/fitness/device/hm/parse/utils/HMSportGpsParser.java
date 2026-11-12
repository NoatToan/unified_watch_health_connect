package com.xiaomi.fit.fitness.device.hm.parse.utils;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMSportGpsParser;
import com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.onetrack.OneTrack;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0019J9\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0002¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/utils/HMSportGpsParser;", "", "<init>", "()V", "TAG", "", "HM_GPS_BYTES_CAPABILITY", "", "dataProcessor", "Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "getDataProcessor", "()Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "dataProcessor$delegate", "Lkotlin/Lazy;", "parseAndSaveHMGps", "Lcom/xiaomi/fit/fitness/export/data/DataResult;", "context", "Landroid/content/Context;", "did", "startTime", "", OneTrack.Param.TZ, DailyRecordKey.sportType, "timeStr", "latLonStr", "(Landroid/content/Context;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseAndSaveGps", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "file", "Ljava/io/File;", "times", "", "latLons", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/io/File;[Ljava/lang/String;[Ljava/lang/String;)V", "appendBytesToFile", "byteBuffer", "Ljava/nio/ByteBuffer;", "getDataValid", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHMSportGpsParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMSportGpsParser.kt\ncom/xiaomi/fit/fitness/device/hm/parse/utils/HMSportGpsParser\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,112:1\n37#2:113\n36#2,3:114\n37#2:117\n36#2,3:118\n*S KotlinDebug\n*F\n+ 1 HMSportGpsParser.kt\ncom/xiaomi/fit/fitness/device/hm/parse/utils/HMSportGpsParser\n*L\n31#1:113\n31#1:114,3\n32#1:117\n32#1:118,3\n*E\n"})
public final class HMSportGpsParser {

    @NotNull
    public static final HMSportGpsParser INSTANCE = new HMSportGpsParser();

    @NotNull
    private static final String TAG = "HMSportGpsParser";
    private static final int HM_GPS_BYTES_CAPABILITY = 1024;

    /* JADX INFO: renamed from: dataProcessor$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataProcessor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hdb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HMSportGpsParser.dataProcessor_delegate$lambda$0();
        }
    });

    private HMSportGpsParser() {
    }

    private final void appendBytesToFile(ByteBuffer byteBuffer, File file) throws Throwable {
        int iPosition;
        if (byteBuffer == null || (iPosition = byteBuffer.position()) == 0) {
            return;
        }
        byte[] bArr = new byte[iPosition];
        byteBuffer.clear();
        byteBuffer.get(bArr);
        byteBuffer.clear();
        FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataProcessor dataProcessor_delegate$lambda$0() {
        return FitnessDataProcessor.INSTANCE.getInstance();
    }

    private final FitnessDataProcessor getDataProcessor() {
        return (FitnessDataProcessor) dataProcessor.getValue();
    }

    private final byte[] getDataValid() {
        return new byte[]{-32};
    }

    private final void parseAndSaveGps(FitnessDataId dataId, File file, String[] times, String[] latLons) throws Throwable {
        FitnessLogUtils.i(TAG, "parseAndSaveGps dataId = " + dataId);
        byte[] dataHeaderBytes = FitnessDataHeader.INSTANCE.toDataHeaderBytes(dataId, getDataValid());
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(HM_GPS_BYTES_CAPABILITY).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(dataHeaderBytes);
        int length = times.length;
        int length2 = latLons.length;
        if (length >= length2) {
            length = length2;
        }
        long timeStamp = dataId.getTimeStamp();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < length; i++) {
            timeStamp += Long.parseLong(times[i]);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) latLons[i], new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                j += TextUtils.isEmpty((CharSequence) listSplit$default.get(0)) ? 0L : Long.parseLong((String) listSplit$default.get(0));
                j2 += TextUtils.isEmpty((CharSequence) listSplit$default.get(1)) ? 0L : Long.parseLong((String) listSplit$default.get(1));
                if (byteBufferOrder.position() + 12 >= HM_GPS_BYTES_CAPABILITY) {
                    appendBytesToFile(byteBufferOrder, file);
                }
                byteBufferOrder.putInt((int) timeStamp);
                byteBufferOrder.putFloat(j2 / 1.0E8f);
                byteBufferOrder.putFloat(j / 1.0E8f);
            }
        }
        appendBytesToFile(byteBufferOrder, file);
    }

    @Nullable
    public final Object parseAndSaveHMGps(@NotNull Context context, @NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super DataResult> continuation) throws Throwable {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return new DataResult(true);
        }
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
        String[] strArr2 = (String[]) StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (strArr == null || strArr2 == null) {
            return new DataResult(true);
        }
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(j).timeZoneIn15Min(i).sportType(i2).fileType(2).version(1).build();
        File fDSDataFile = FitnessFileUtils.getFDSDataFile(context, str, fitnessDataIdBuild);
        if (fDSDataFile.exists()) {
            fDSDataFile.delete();
        }
        parseAndSaveGps(fitnessDataIdBuild, fDSDataFile, strArr, strArr2);
        FitnessDataProcessor dataProcessor2 = getDataProcessor();
        byte[] file = FitnessFileUtils.INSTANCE.readFile(fDSDataFile);
        if (file == null) {
            file = new byte[0];
        }
        return dataProcessor2.parseAndRecord(str, fitnessDataIdBuild, file, continuation);
    }
}
