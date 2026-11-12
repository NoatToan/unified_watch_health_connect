package com.xiaomi.fitness.sport.route.detail;

import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.RecorderPoint;
import com.xiaomi.fitness.route.export.track.TrackRecorder;
import com.xiaomi.fitness.route.export.track.WptRecorderPoint;
import com.xiaomi.fitness.sport.route.detail.RouteTrackDataManager;
import com.xiaomi.fitness.sport.route.detail.util.HexUtilsKt;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.v84;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019JW\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J&\u0010#\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002JD\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\n\u001a\u00020\rH\u0002J$\u0010(\u001a\u00020)2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J$\u0010*\u001a\u00020)2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J \u0010+\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/RouteTrackDataManager;", "", "<init>", "()V", "TAG", "", "lonLatRatio", "", "getLonLatRatio", "()I", "recorder", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "trackList", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "wptList", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "fileMd5", "fileName", "filePath", "fileExtension", StepsInfo.KEY_DISTANCE, "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lkotlin/Pair;", "buildTrackInfo", "", "Lcom/xiaomi/fitness/route/export/track/RecorderPoint;", "tracklist", "originalDis", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lkotlin/Pair;", "converInvalidValue", "", "pointList", "buildWptCumulativeInfo", "mWptList", "Lcom/xiaomi/fitness/route/export/track/WptRecorderPoint;", "buildWptBasicInfo", "list", "isAddEndWpt", "", "isAddFirstWpt", "getTypePoint", "isStart", "isEnd", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteTrackDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteTrackDataManager.kt\ncom/xiaomi/fitness/sport/route/detail/RouteTrackDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,439:1\n1863#2,2:440\n1863#2,2:442\n1863#2,2:444\n1863#2,2:446\n*S KotlinDebug\n*F\n+ 1 RouteTrackDataManager.kt\ncom/xiaomi/fitness/sport/route/detail/RouteTrackDataManager\n*L\n193#1:440,2\n316#1:442,2\n332#1:444,2\n368#1:446,2\n*E\n"})
public final class RouteTrackDataManager {

    @NotNull
    public static final String TAG = "RouteTrackDataManager";

    @NotNull
    public static final RouteTrackDataManager INSTANCE = new RouteTrackDataManager();
    private static final int lonLatRatio = 3000000;

    private RouteTrackDataManager() {
    }

    private final Pair<List<RecorderPoint>, Recorder> buildTrackInfo(List<CommonTrackData> tracklist, String fileName, String fileMd5, String filePath, String fileExtension, Double originalDis) {
        double d;
        double dAbs;
        double elevation;
        double d2;
        int size = tracklist.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        FitnessLogUtils.d(TAG, "轨迹点-----------------------------------------");
        Iterator it = tracklist.iterator();
        CommonTrackData commonTrackData = null;
        int iMin = Integer.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        int iMax3 = Integer.MIN_VALUE;
        int i2 = 0;
        double elevation2 = 0.0d;
        double d3 = 0.0d;
        double dAbs2 = 0.0d;
        double d4 = 0.0d;
        double dA = 0.0d;
        int iMin2 = Integer.MAX_VALUE;
        boolean z = false;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            CommonTrackData commonTrackData2 = (CommonTrackData) it.next();
            double longitude = commonTrackData2.getLongitude();
            int i4 = lonLatRatio;
            Iterator it2 = it;
            int iMin3 = Math.min(i, (int) (((double) i4) * longitude));
            ArrayList arrayList3 = arrayList2;
            iMin = Math.min(iMin, (int) (commonTrackData2.getLatitude() * ((double) i4)));
            iMax3 = Math.max(iMax3, (int) (commonTrackData2.getLongitude() * ((double) i4)));
            iMax2 = Math.max(iMax2, (int) (commonTrackData2.getLatitude() * ((double) i4)));
            if (commonTrackData2.getElevation() != -100000.0d) {
                iMin2 = Math.min(iMin2, (int) commonTrackData2.getElevation());
            }
            iMax = Math.max(iMax, (int) commonTrackData2.getElevation());
            if (commonTrackData2.getElevation() != -100000.0d) {
                z = true;
            }
            if (commonTrackData2.getElevation() == -100000.0d) {
                d2 = d4;
                dAbs = 0.0d;
                d = 0.0d;
            } else {
                d = 0.0d;
                dAbs = Math.abs(commonTrackData2.getElevation()) + 0.0d;
                elevation2 += commonTrackData2.getElevation();
                if (d4 == 0.0d) {
                    elevation = commonTrackData2.getElevation();
                } else {
                    double elevation3 = commonTrackData2.getElevation() - d4;
                    if (elevation3 > 0.0d) {
                        d3 += elevation3;
                    } else {
                        dAbs2 += Math.abs(elevation3);
                    }
                    elevation = commonTrackData2.getElevation();
                }
                d2 = elevation;
            }
            if (dAbs == d) {
                z = false;
            }
            if (commonTrackData != null) {
                dA += v84.a(commonTrackData2.getLongitude(), commonTrackData2.getLatitude(), commonTrackData.getLongitude(), commonTrackData.getLatitude());
            }
            double d5 = dA;
            ArrayList arrayList4 = arrayList;
            int i5 = (int) d5;
            int i6 = iMin2;
            int i7 = i2;
            arrayList4.add(new RecorderPoint(i7, (int) (((double) i4) * commonTrackData2.getLongitude()), (int) (commonTrackData2.getLatitude() * ((double) i4)), commonTrackData2.getElevation(), getTypePoint(i5, i2 == 0, i2 == tracklist.size() + (-1)), d3, dAbs2, i5, 0.0d, 0.0d, false, 1792, null));
            arrayList3.add(new RecorderPoint(i7, 0, 0, commonTrackData2.getElevation(), 0, 0.0d, 0.0d, 0, commonTrackData2.getLongitude(), commonTrackData2.getLatitude(), false, 1270, null));
            z = z;
            iMin2 = i6;
            commonTrackData = commonTrackData2;
            it = it2;
            i = iMin3;
            d4 = d2;
            dA = d5;
            arrayList2 = arrayList3;
            arrayList = arrayList4;
            i2 = i3;
        }
        boolean z2 = z;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList;
        double d6 = dA;
        double size2 = elevation2 / ((double) tracklist.size());
        converInvalidValue(arrayList6);
        byte b2 = z2 ? (byte) 23 : (byte) 7;
        int i8 = iMax3;
        byte[] bytes = fileName.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bytes, 60);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrHexToByteArray = HexUtilsKt.hexToByteArray(fileMd5);
        int iDoubleValue = originalDis != null ? (int) originalDis.doubleValue() : (int) d6;
        int i9 = (int) size2;
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        Long lCalculateTimeDifference = parserHelper.calculateTimeDifference(tracklist);
        return new Pair<>(arrayList6, new Recorder(b2, z2, 0, bArrCopyOf, fileName, bArrHexToByteArray, fileMd5, iDoubleValue, size, 0, 0, i, iMin, i8, iMax2, iMin2, iMax, i9, d3, dAbs2, arrayList6, null, null, arrayList5, null, filePath, fileExtension, parserHelper.formatMillisToHMS(lCalculateTimeDifference != null ? lCalculateTimeDifference.longValue() : 0L), 23069188, null));
    }

    private final List<WptRecorderPoint> buildWptBasicInfo(List<WayPointData> wptList, List<CommonTrackData> list, List<RecorderPoint> pointList, Recorder recorder) {
        List<WayPointData> list2;
        if (list.isEmpty() || (list2 = wptList) == null || list2.isEmpty()) {
            return null;
        }
        if (wptList != null) {
            for (WayPointData wayPointData : wptList) {
                FitnessLogUtils.d(TAG, "original wpt:" + wayPointData.getName() + " , ele:" + wayPointData.getElevation());
            }
        }
        ArrayList<WptRecorderPoint> arrayList = new ArrayList();
        Intrinsics.checkNotNull(wptList);
        if (isAddFirstWpt(wptList, list)) {
            byte[] bytes = "StartWptPoint".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            double longitude = ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLongitude();
            int i = lonLatRatio;
            arrayList.add(new WptRecorderPoint(0, bytes, (int) (longitude * ((double) i)), (int) (((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLatitude() * ((double) i)), (int) ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getElevation(), 0.0d, 0.0d, 0, 0, 480, null));
        }
        for (WayPointData wayPointData2 : wptList) {
            int i2 = Integer.MAX_VALUE;
            int i3 = 0;
            int no2 = 0;
            for (CommonTrackData commonTrackData : list) {
                int i4 = i3 + 1;
                Double lon = wayPointData2.getLon();
                Intrinsics.checkNotNull(lon);
                double dDoubleValue = lon.doubleValue();
                Double lat = wayPointData2.getLat();
                Intrinsics.checkNotNull(lat);
                double distance = MapUtilsKt.getDistance(dDoubleValue, lat.doubleValue(), commonTrackData.getLongitude(), commonTrackData.getLatitude());
                if (distance < 50.0d && distance < i2) {
                    i2 = (int) distance;
                    no2 = pointList.get(i3).getNo();
                }
                i3 = i4;
            }
            byte[] bytes2 = wayPointData2.getName().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            Double lon2 = wayPointData2.getLon();
            Intrinsics.checkNotNull(lon2);
            double dDoubleValue2 = lon2.doubleValue();
            int i5 = lonLatRatio;
            int i6 = (int) (dDoubleValue2 * ((double) i5));
            Double lat2 = wayPointData2.getLat();
            Intrinsics.checkNotNull(lat2);
            int iDoubleValue = (int) (lat2.doubleValue() * ((double) i5));
            Double elevation = wayPointData2.getElevation();
            arrayList.add(new WptRecorderPoint(no2, bytes2, i6, iDoubleValue, elevation != null ? (int) elevation.doubleValue() : 0, 0.0d, 0.0d, 0, 0, 480, null));
        }
        if (isAddEndWpt(wptList, list)) {
            int size = list.size() - 1;
            byte[] bytes3 = "EndWptPoint".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            double longitude2 = ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLongitude();
            int i7 = lonLatRatio;
            arrayList.add(new WptRecorderPoint(size, bytes3, (int) (longitude2 * ((double) i7)), (int) (((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLatitude() * ((double) i7)), (int) ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getElevation(), 0.0d, 0.0d, 0, 0, 480, null));
        }
        for (WptRecorderPoint wptRecorderPoint : arrayList) {
            int no3 = wptRecorderPoint.getNo();
            if (no3 == 0) {
                pointList.get(0).setType((((PointType.TrackPoint.INSTANCE.getType() | PointType.StartPoint.INSTANCE.getType()) | PointType.WptPoint.INSTANCE.getType()) << 24) | pointList.get(0).getDis());
                FitnessLogUtils.d(TAG, "-------first:" + pointList.get(0).getType());
            } else if (no3 == pointList.size() - 1) {
                ((RecorderPoint) CollectionsKt___CollectionsKt.last((List) pointList)).setType((((PointType.TrackPoint.INSTANCE.getType() | PointType.EndPoint.INSTANCE.getType()) | PointType.WptPoint.INSTANCE.getType()) << 24) | ((RecorderPoint) CollectionsKt___CollectionsKt.last((List) pointList)).getDis());
                FitnessLogUtils.d(TAG, "--------last:" + ((RecorderPoint) CollectionsKt___CollectionsKt.last((List) pointList)).getType());
            } else {
                pointList.get(wptRecorderPoint.getNo()).setType(((PointType.TrackPoint.INSTANCE.getType() | PointType.WptPoint.INSTANCE.getType()) << 24) | pointList.get(wptRecorderPoint.getNo()).getDis());
                FitnessLogUtils.d(TAG, "--------wpt:" + pointList.get(wptRecorderPoint.getNo()).getType());
            }
        }
        final Function2 function2 = new Function2() { // from class: mzk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(RouteTrackDataManager.buildWptBasicInfo$lambda$5((WptRecorderPoint) obj, (WptRecorderPoint) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: nzk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RouteTrackDataManager.buildWptBasicInfo$lambda$6(function2, obj, obj2);
            }
        });
        List listTake = CollectionsKt___CollectionsKt.take(arrayList, 100);
        Intrinsics.checkNotNull(listTake, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.route.export.track.WptRecorderPoint>");
        List<WptRecorderPoint> listAsMutableList = TypeIntrinsics.asMutableList(listTake);
        recorder.setPassPoint(listAsMutableList.size());
        return listAsMutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildWptBasicInfo$lambda$5(WptRecorderPoint wptRecorderPoint, WptRecorderPoint wptRecorderPoint2) {
        return wptRecorderPoint.getNo() - wptRecorderPoint2.getNo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildWptBasicInfo$lambda$6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void buildWptCumulativeInfo(List<WptRecorderPoint> mWptList, List<RecorderPoint> pointList) {
        List<WptRecorderPoint> list = mWptList;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        List<WptRecorderPoint> list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            WptRecorderPoint wptRecorderPoint = (WptRecorderPoint) it.next();
            if (i == 0 || wptRecorderPoint.getEle() == -100000.0d) {
                it = it;
            } else {
                RecorderPoint recorderPoint = pointList.get(wptRecorderPoint.getNo());
                int i3 = i - 1;
                RecorderPoint recorderPoint2 = pointList.get(list.get(i3).getNo());
                WptRecorderPoint wptRecorderPoint2 = list.get(i3);
                FitnessLogUtils.d(TAG, "途经点---------------------------------");
                int no2 = recorderPoint2.getNo();
                int no3 = wptRecorderPoint.getNo();
                if (no2 <= no3) {
                    double ele = Double.MAX_VALUE;
                    while (true) {
                        if (no2 == recorderPoint2.getNo()) {
                            ele = recorderPoint2.getEle();
                            it = it;
                        } else {
                            double ele2 = pointList.get(no2).getEle() - ele;
                            if (ele2 > 0.0d) {
                                wptRecorderPoint2.setCumulativeIncrease(wptRecorderPoint2.getCumulativeIncrease() + ele2);
                            } else {
                                wptRecorderPoint2.setCumulativeDecrease(wptRecorderPoint2.getCumulativeDecrease() + Math.abs(ele2));
                            }
                            ele = pointList.get(no2).getEle();
                        }
                        if (no2 == no3) {
                            break;
                        }
                        no2++;
                        it = it;
                    }
                } else {
                    it = it;
                }
                FitnessLogUtils.d(TAG, "v.dis:" + recorderPoint.getDis() + " , preV.dis:" + recorderPoint2.getDis() + ",v.no:" + recorderPoint.getNo() + " , preV.no:" + recorderPoint2.getNo());
                wptRecorderPoint2.setDisToNextWptPoint(recorderPoint.getDis() - recorderPoint2.getDis());
                wptRecorderPoint2.setDisToStartPoint(recorderPoint2.getDis());
                FitnessLogUtils.d(TAG, "name: " + new String(wptRecorderPoint2.getName(), Charsets.UTF_8) + ",cumulativeIncrease:" + wptRecorderPoint2.getCumulativeIncrease() + " , cumulativeDecrease:" + wptRecorderPoint2.getCumulativeDecrease() + " , disToNextWptPoint:" + wptRecorderPoint2.getDisToNextWptPoint() + " ,disToStartPoint:" + wptRecorderPoint2.getDisToStartPoint() + " ");
            }
            list = mWptList;
            i = i2;
            it = it;
        }
        WptRecorderPoint wptRecorderPoint3 = (WptRecorderPoint) CollectionsKt___CollectionsKt.last((List) mWptList);
        wptRecorderPoint3.setDisToStartPoint(pointList.get(wptRecorderPoint3.getNo()).getDis());
        FitnessLogUtils.d(TAG, "cumulativeIncrease:" + wptRecorderPoint3.getCumulativeIncrease() + " , cumulativeDecrease:" + wptRecorderPoint3.getCumulativeDecrease() + " , disToNextWptPoint:" + wptRecorderPoint3.getDisToNextWptPoint() + " ,disToStartPoint:" + wptRecorderPoint3.getDisToStartPoint() + " ");
        int i4 = 0;
        for (WptRecorderPoint wptRecorderPoint4 : list2) {
            int i5 = i4 + 1;
            if (i4 != 0) {
                WptRecorderPoint wptRecorderPoint5 = mWptList.get(i4 - 1);
                if (wptRecorderPoint4.getCumulativeDecrease() == 0.0d) {
                    double ele3 = ((double) wptRecorderPoint4.getEle()) - (((double) wptRecorderPoint5.getEle()) + wptRecorderPoint4.getCumulativeIncrease());
                    wptRecorderPoint4.setCumulativeIncrease(wptRecorderPoint4.getCumulativeIncrease() + ele3);
                    FitnessLogUtils.d(TAG, "no:" + wptRecorderPoint4.getNo() + " ,cWpt.ele:" + wptRecorderPoint4.getEle() + " , preWpt.ele:" + wptRecorderPoint5.getEle() + " , cWpt.cumulativeIncrease:" + wptRecorderPoint4.getCumulativeIncrease() + ",cumulativeIncresseDiff:" + ele3);
                } else if (wptRecorderPoint4.getCumulativeIncrease() == 0.0d) {
                    double ele4 = ((double) wptRecorderPoint5.getEle()) - (((double) wptRecorderPoint4.getEle()) + wptRecorderPoint4.getCumulativeDecrease());
                    wptRecorderPoint4.setCumulativeDecrease(wptRecorderPoint4.getCumulativeDecrease() + ele4);
                    FitnessLogUtils.d(TAG, "no:" + wptRecorderPoint4.getNo() + " ,cWpt.ele:" + wptRecorderPoint4.getEle() + " , preWpt.ele:" + wptRecorderPoint5.getEle() + " ,cWpt.cumulativeDecrease:" + wptRecorderPoint4.getCumulativeDecrease() + ",cumulativeDecreaseDiff:" + ele4);
                } else {
                    int ele5 = wptRecorderPoint4.getEle() - wptRecorderPoint5.getEle();
                    double cumulativeIncrease = wptRecorderPoint4.getCumulativeIncrease() - wptRecorderPoint4.getCumulativeDecrease();
                    FitnessLogUtils.d(TAG, "no:" + wptRecorderPoint4.getNo() + " ,cWpt.ele:" + wptRecorderPoint4.getEle() + " , preWpt.ele:" + wptRecorderPoint5.getEle() + " , eleDiff:" + ele5 + " , cumulativeDiff:" + cumulativeIncrease);
                    if (ele5 != ((int) cumulativeIncrease)) {
                        double d = ((double) ele5) - cumulativeIncrease;
                        if (wptRecorderPoint4.getCumulativeIncrease() > Math.abs(d)) {
                            wptRecorderPoint4.setCumulativeIncrease(wptRecorderPoint4.getCumulativeIncrease() + d);
                        } else {
                            wptRecorderPoint4.setCumulativeDecrease(wptRecorderPoint4.getCumulativeDecrease() + d);
                        }
                    }
                }
            }
            i4 = i5;
        }
    }

    private final void converInvalidValue(List<RecorderPoint> pointList) {
        double ele = -100000.0d;
        for (RecorderPoint recorderPoint : pointList) {
            if (recorderPoint.getEle() != -100000.0d) {
                ele = recorderPoint.getEle();
            } else if (ele != -100000.0d) {
                recorderPoint.setEle(ele);
            }
        }
        double ele2 = -100000.0d;
        for (int size = pointList.size() - 1; -1 < size; size--) {
            if (pointList.get(size).getEle() == -100000.0d) {
                pointList.get(size).setEle(ele2);
            } else {
                ele2 = pointList.get(size).getEle();
            }
        }
    }

    private final int getTypePoint(int dis, boolean isStart, boolean isEnd) {
        int type;
        int type2;
        int type3;
        if (!isStart) {
            if (isEnd) {
                type2 = PointType.EndPoint.INSTANCE.getType();
                type3 = PointType.TrackPoint.INSTANCE.getType();
            } else {
                type = PointType.TrackPoint.INSTANCE.getType();
            }
            return dis | (type << 24);
        }
        type2 = PointType.StartPoint.INSTANCE.getType();
        type3 = PointType.TrackPoint.INSTANCE.getType();
        type = type2 << type3;
        return dis | (type << 24);
    }

    private final boolean isAddEndWpt(List<WayPointData> wptList, List<CommonTrackData> list) {
        return (!wptList.isEmpty() && Intrinsics.areEqual(((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLongitude(), ((WayPointData) CollectionsKt___CollectionsKt.last((List) wptList)).getLon()) && Intrinsics.areEqual(((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLongitude(), ((WayPointData) CollectionsKt___CollectionsKt.last((List) wptList)).getLat())) ? false : true;
    }

    private final boolean isAddFirstWpt(List<WayPointData> wptList, List<CommonTrackData> list) {
        return (!wptList.isEmpty() && Intrinsics.areEqual(((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLongitude(), ((WayPointData) CollectionsKt___CollectionsKt.first((List) wptList)).getLon()) && Intrinsics.areEqual(((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLatitude(), ((WayPointData) CollectionsKt___CollectionsKt.first((List) wptList)).getLat())) ? false : true;
    }

    public final int getLonLatRatio() {
        return lonLatRatio;
    }

    @Nullable
    public final Pair<byte[], Recorder> recorder(@NotNull List<CommonTrackData> trackList, @Nullable List<WayPointData> wptList, @NotNull String fileMd5, @NotNull String fileName, @NotNull String filePath, @NotNull String fileExtension, @Nullable Double dis) {
        Intrinsics.checkNotNullParameter(trackList, "trackList");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        if (trackList.isEmpty()) {
            FitnessLogUtils.i(TAG, "tracklist isEmpty");
            return null;
        }
        Pair<List<RecorderPoint>, Recorder> pairBuildTrackInfo = buildTrackInfo(trackList, fileName, fileMd5, filePath, fileExtension, dis);
        List<RecorderPoint> listComponent1 = pairBuildTrackInfo.component1();
        Recorder recorderComponent2 = pairBuildTrackInfo.component2();
        List<WptRecorderPoint> listBuildWptBasicInfo = buildWptBasicInfo(wptList, trackList, listComponent1, recorderComponent2);
        buildWptCumulativeInfo(listBuildWptBasicInfo, listComponent1);
        recorderComponent2.setWptList(listBuildWptBasicInfo);
        return TrackRecorder.INSTANCE.recorder(recorderComponent2);
    }
}
