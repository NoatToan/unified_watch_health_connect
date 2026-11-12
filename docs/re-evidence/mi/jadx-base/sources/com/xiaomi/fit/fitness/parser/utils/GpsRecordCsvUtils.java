package com.xiaomi.fit.fitness.parser.utils;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import com.xiaomi.fit.fitness.parser.utils.GpsRecordCsvUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0014\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/utils/GpsRecordCsvUtils;", "", "<init>", "()V", "SPLIT", "", "writeFile", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", DailyRecordKey.sportType, "", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "writeLocationListCSV", "getLocationColumnName", "gpsRecord", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGpsRecordCsvUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/GpsRecordCsvUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1863#2,2:48\n*S KotlinDebug\n*F\n+ 1 GpsRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/GpsRecordCsvUtils\n*L\n27#1:48,2\n*E\n"})
public final class GpsRecordCsvUtils {

    @NotNull
    public static final GpsRecordCsvUtils INSTANCE = new GpsRecordCsvUtils();

    @NotNull
    private static final String SPLIT = DebugFileCsvUtils.INSTANCE.getSPLIT();

    private GpsRecordCsvUtils() {
    }

    private final String getLocationColumnName(GpsRecord gpsRecord) {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        Object speed;
        Object accuracy;
        Object gpsSource;
        Object altitude;
        boolean z = gpsRecord == null;
        StringBuilder sb = new StringBuilder();
        Object hdop = null;
        if (z) {
            objValueOf = "time";
        } else {
            objValueOf = gpsRecord != null ? Long.valueOf(gpsRecord.getTimeStamp()) : null;
        }
        sb.append(objValueOf);
        String str = SPLIT;
        sb.append(str);
        if (z) {
            objValueOf2 = "longitude";
        } else {
            objValueOf2 = gpsRecord != null ? Float.valueOf(gpsRecord.getLongitude()) : null;
        }
        sb.append(objValueOf2);
        sb.append(str);
        if (z) {
            objValueOf3 = "latitude";
        } else {
            objValueOf3 = gpsRecord != null ? Float.valueOf(gpsRecord.getLatitude()) : null;
        }
        sb.append(objValueOf3);
        sb.append(str);
        if (z) {
            speed = "speed";
        } else {
            speed = gpsRecord != null ? gpsRecord.getSpeed() : null;
        }
        sb.append(speed);
        sb.append(str);
        if (z) {
            accuracy = "horizontal_acc";
        } else {
            accuracy = gpsRecord != null ? gpsRecord.getAccuracy() : null;
        }
        sb.append(accuracy);
        sb.append(str);
        if (z) {
            gpsSource = FitnessGpsKey.gpsSource;
        } else {
            gpsSource = gpsRecord != null ? gpsRecord.getGpsSource() : null;
        }
        sb.append(gpsSource);
        sb.append(str);
        if (z) {
            altitude = "altitude";
        } else {
            altitude = gpsRecord != null ? gpsRecord.getAltitude() : null;
        }
        sb.append(altitude);
        sb.append(str);
        if (z) {
            hdop = FitnessGpsKey.hdop;
        } else if (gpsRecord != null) {
            hdop = gpsRecord.getHdop();
        }
        sb.append(hdop);
        sb.append(str);
        sb.append("\n");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String getLocationColumnName$default(GpsRecordCsvUtils gpsRecordCsvUtils, GpsRecord gpsRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            gpsRecord = null;
        }
        return gpsRecordCsvUtils.getLocationColumnName(gpsRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeFile$lambda$0(FitnessDataId dataId, int i, List recordList) {
        Intrinsics.checkNotNullParameter(dataId, "$dataId");
        Intrinsics.checkNotNullParameter(recordList, "$recordList");
        INSTANCE.writeLocationListCSV(dataId, i, recordList);
    }

    private final void writeLocationListCSV(FitnessDataId dataId, int sportType, List<GpsRecord> recordList) {
        DebugFileCsvUtils debugFileCsvUtils = DebugFileCsvUtils.INSTANCE;
        File theCsvStorageFile = debugFileCsvUtils.getTheCsvStorageFile(dataId, sportType);
        if (debugFileCsvUtils.writeCSV(theCsvStorageFile, getLocationColumnName$default(this, null, 1, null), false)) {
            Iterator<T> it = recordList.iterator();
            while (it.hasNext()) {
                DebugFileCsvUtils.INSTANCE.writeCSV(theCsvStorageFile, INSTANCE.getLocationColumnName((GpsRecord) it.next()), true);
            }
        }
    }

    public final void writeFile(@NotNull final FitnessDataId dataId, final int sportType, @NotNull final List<GpsRecord> recordList) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            return;
        }
        ExecutorHelper.INSTANCE.getIoThreadPool().execute(new Runnable() { // from class: t2b
            @Override // java.lang.Runnable
            public final void run() {
                GpsRecordCsvUtils.writeFile$lambda$0(dataId, sportType, recordList);
            }
        });
    }
}
