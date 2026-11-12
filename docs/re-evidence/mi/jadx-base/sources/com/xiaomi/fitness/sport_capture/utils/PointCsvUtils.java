package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fit.fitness.parser.utils.DebugFileCsvUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0014\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/PointCsvUtils;", "", "<init>", "()V", "TAG", "", "SPLIT", "getOriginLocationColumnName", "point", "Lcom/xiaomi/fitness/sport_capture/utils/RoutePoint;", "getCoorColumnName", "Lcom/xiaomi/fitness/sport_capture/utils/CoordinatePoint;", "getCsvFile", "Ljava/io/File;", "fileName", "writeCSV", "", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointCsvUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointCsvUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/PointCsvUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1863#2,2:68\n1863#2,2:70\n*S KotlinDebug\n*F\n+ 1 PointCsvUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/PointCsvUtils\n*L\n49#1:68,2\n57#1:70,2\n*E\n"})
public final class PointCsvUtils {

    @NotNull
    public static final PointCsvUtils INSTANCE = new PointCsvUtils();

    @NotNull
    private static final String SPLIT = ",";

    @NotNull
    private static final String TAG = "PointCsvUtils";

    private PointCsvUtils() {
    }

    private final String getCoorColumnName(CoordinatePoint point) {
        Object objValueOf;
        boolean z = point == null;
        StringBuilder sb = new StringBuilder();
        Object objValueOf2 = null;
        if (z) {
            objValueOf = "x";
        } else {
            objValueOf = point != null ? Float.valueOf(point.getX()) : null;
        }
        sb.append(objValueOf);
        String str = SPLIT;
        sb.append(str);
        if (z) {
            objValueOf2 = "y";
        } else if (point != null) {
            objValueOf2 = Float.valueOf(point.getY());
        }
        sb.append(objValueOf2);
        sb.append(str);
        sb.append("\n");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String getCoorColumnName$default(PointCsvUtils pointCsvUtils, CoordinatePoint coordinatePoint, int i, Object obj) {
        if ((i & 1) != 0) {
            coordinatePoint = null;
        }
        return pointCsvUtils.getCoorColumnName(coordinatePoint);
    }

    private final File getCsvFile(String fileName) {
        File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir(null), "/sport_capture/csv");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, fileName + ".csv");
    }

    private final String getOriginLocationColumnName(RoutePoint point) {
        Object objValueOf;
        boolean z = point == null;
        StringBuilder sb = new StringBuilder();
        Object objValueOf2 = null;
        if (z) {
            objValueOf = "lon";
        } else {
            objValueOf = point != null ? Float.valueOf((float) point.getLon()) : null;
        }
        sb.append(objValueOf);
        String str = SPLIT;
        sb.append(str);
        if (z) {
            objValueOf2 = "lat";
        } else if (point != null) {
            objValueOf2 = Float.valueOf((float) point.getLat());
        }
        sb.append(objValueOf2);
        sb.append(str);
        sb.append("\n");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String getOriginLocationColumnName$default(PointCsvUtils pointCsvUtils, RoutePoint routePoint, int i, Object obj) {
        if ((i & 1) != 0) {
            routePoint = null;
        }
        return pointCsvUtils.getOriginLocationColumnName(routePoint);
    }

    public final void writeCSV() {
        try {
            ArrayList<RoutePoint> originPoints = RoutePointManager.INSTANCE.getOriginPoints();
            long jCurrentTimeMillis = System.currentTimeMillis();
            File csvFile = getCsvFile(jCurrentTimeMillis + "-origin");
            DebugFileCsvUtils.INSTANCE.writeCSV(csvFile, getOriginLocationColumnName$default(this, null, 1, null), false);
            if (originPoints != null) {
                Iterator<T> it = originPoints.iterator();
                while (it.hasNext()) {
                    DebugFileCsvUtils.INSTANCE.writeCSV(csvFile, INSTANCE.getOriginLocationColumnName((RoutePoint) it.next()), true);
                }
            }
            ArrayList<CoordinatePoint> points = RoutePointManager.INSTANCE.getPoints();
            File csvFile2 = getCsvFile(jCurrentTimeMillis + "-coor");
            DebugFileCsvUtils.INSTANCE.writeCSV(csvFile2, getCoorColumnName$default(this, null, 1, null), false);
            if (points != null) {
                Iterator<T> it2 = points.iterator();
                while (it2.hasNext()) {
                    DebugFileCsvUtils.INSTANCE.writeCSV(csvFile2, INSTANCE.getCoorColumnName((CoordinatePoint) it2.next()), true);
                }
            }
            Logger.i(TAG, "finish writeCSV");
        } catch (Exception e) {
            Logger.e(TAG, "writeCSV", e);
        }
    }
}
