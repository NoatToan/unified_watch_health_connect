package com.xiaomi.fitness.route.track;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.RecorderPoint;
import com.xiaomi.fitness.route.export.track.SegmentRecorderPoint;
import com.xiaomi.fitness.route.export.track.TrackRecorder;
import com.xiaomi.fitness.route.export.track.WptRecorderPoint;
import com.xiaomi.fitness.route.track.TrackDataManager;
import com.xiaomi.fitness.route.track.utils.AMapPathUtils;
import com.xiaomi.fitness.route.track.utils.HexUtilsKt;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.v84;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\"2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002Jk\u0010#\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0\"H\u0002J&\u0010,\u001a\u00020\f2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0\"H\u0002JD\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\"2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0\"2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002J$\u00101\u001a\u0002022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J$\u00103\u001a\u0002022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J \u00104\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00105\u001a\u0002022\u0006\u00106\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackDataManager;", "", "<init>", "()V", "TAG", "", "lonLatRatio", "", "getLonLatRatio", "()I", "routeListNotifyLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getRouteListNotifyLiveData", "()Landroidx/lifecycle/MutableLiveData;", "recorder", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "trackList", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "wptList", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "fileMd5", "fileName", "filePath", "fileExtension", StepsInfo.KEY_DISTANCE, "", "cumulativeClimb", "cumulativeDecrease", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lkotlin/Pair;", "filterInvalidLocation", "", "buildTrackInfo", "Lcom/xiaomi/fitness/route/export/track/RecorderPoint;", "tracklist", "originalDis", "originalClimb", "originalDecrease", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lkotlin/Pair;", "converInvalidValue", "pointList", "buildWptCumulativeInfo", "mWptList", "Lcom/xiaomi/fitness/route/export/track/WptRecorderPoint;", "buildWptBasicInfo", "list", "isAddEndWpt", "", "isAddFirstWpt", "getTypePoint", "isStart", "isEnd", "notifyRouteList", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackDataManager.kt\ncom/xiaomi/fitness/route/track/TrackDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,528:1\n1872#2,3:529\n1863#2,2:532\n1863#2,2:534\n1863#2,2:536\n1863#2,2:538\n*S KotlinDebug\n*F\n+ 1 TrackDataManager.kt\ncom/xiaomi/fitness/route/track/TrackDataManager\n*L\n70#1:529,3\n271#1:532,2\n391#1:534,2\n407#1:536,2\n459#1:538,2\n*E\n"})
public final class TrackDataManager {

    @NotNull
    public static final String TAG = "TrackDataManager";

    @NotNull
    public static final TrackDataManager INSTANCE = new TrackDataManager();
    private static final int lonLatRatio = 3000000;

    @NotNull
    private static final MutableLiveData<Unit> routeListNotifyLiveData = new MutableLiveData<>();

    private TrackDataManager() {
    }

    private final Pair<List<RecorderPoint>, Recorder> buildTrackInfo(List<CommonTrackData> tracklist, String fileName, String fileMd5, String filePath, String fileExtension, Double originalDis, Double originalClimb, Double originalDecrease) {
        double d;
        double elevation;
        double d2;
        double d3;
        double d4;
        ArrayList arrayList;
        int i;
        double d5;
        TrackDataManager trackDataManager = this;
        int size = tracklist.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        FitnessLogUtils.d(TAG, "轨迹点-----------------------------------------");
        Iterator it = tracklist.iterator();
        int i2 = Integer.MIN_VALUE;
        CommonTrackData commonTrackData = null;
        int iMin = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        ArrayList arrayList5 = arrayList4;
        boolean z = false;
        int i6 = 0;
        double dDoubleValue = 0.0d;
        double elevation2 = 0.0d;
        double dDoubleValue2 = 0.0d;
        double dDoubleValue3 = 0.0d;
        double d6 = 0.0d;
        boolean z2 = false;
        int i7 = 0;
        double d7 = 0.0d;
        while (it.hasNext()) {
            int i8 = i6 + 1;
            CommonTrackData commonTrackData2 = (CommonTrackData) it.next();
            double longitude = commonTrackData2.getLongitude();
            Iterator it2 = it;
            int i9 = lonLatRatio;
            int iMin3 = Math.min(i3, (int) (((double) i9) * longitude));
            int i10 = size;
            iMin2 = Math.min(iMin2, (int) (commonTrackData2.getLatitude() * ((double) i9)));
            int iMax = Math.max(i5, (int) (commonTrackData2.getLongitude() * ((double) i9)));
            int iMax2 = Math.max(i2, (int) (commonTrackData2.getLatitude() * ((double) i9)));
            if (commonTrackData2.getElevation() != -100000.0d) {
                iMin = Math.min(iMin, (int) commonTrackData2.getElevation());
            }
            int iMax3 = Math.max(i4, (int) commonTrackData2.getElevation());
            if (commonTrackData2.getElevation() != -100000.0d) {
                z = true;
            }
            if (commonTrackData2.getElevation() == -100000.0d) {
                d2 = dDoubleValue2;
                d3 = dDoubleValue3;
                d4 = d6;
                d = 0.0d;
            } else {
                elevation2 += commonTrackData2.getElevation();
                d = 0.0d;
                if (d6 == 0.0d) {
                    elevation = commonTrackData2.getElevation();
                } else {
                    double elevation3 = commonTrackData2.getElevation() - d6;
                    if (elevation3 > 0.0d) {
                        dDoubleValue2 += elevation3;
                    } else {
                        dDoubleValue3 += Math.abs(elevation3);
                    }
                    elevation = commonTrackData2.getElevation();
                }
                d2 = dDoubleValue2;
                d3 = dDoubleValue3;
                d4 = elevation;
            }
            if (commonTrackData != null) {
                dDoubleValue += v84.a(commonTrackData2.getLongitude(), commonTrackData2.getLatitude(), commonTrackData.getLongitude(), commonTrackData.getLatitude());
            }
            boolean z3 = z;
            int i11 = iMin;
            int i12 = (int) dDoubleValue;
            arrayList2.add(new RecorderPoint(i6, (int) (((double) i9) * commonTrackData2.getLongitude()), (int) (((double) i9) * commonTrackData2.getLatitude()), commonTrackData2.getElevation(), getTypePoint(i12, i6 == 0, i6 == tracklist.size() + (-1)), d2, d3, i12, 0.0d, 0.0d, commonTrackData2.getFlagSegment(), 768, null));
            int i13 = i7 + 1;
            double d8 = d7 + dDoubleValue;
            if (commonTrackData == null || !commonTrackData.getFlagSegment()) {
                arrayList = arrayList5;
                i = i13;
                d5 = d8;
            } else {
                arrayList = arrayList5;
                arrayList.add(new SegmentRecorderPoint(i6, (int) (commonTrackData2.getLongitude() * ((double) i9)), (int) (commonTrackData2.getLatitude() * ((double) i9)), commonTrackData2.getElevation(), 0, 0));
                d5 = d;
                i = 0;
            }
            if (commonTrackData2.getFlagSegment()) {
                if (!arrayList.isEmpty()) {
                    ((SegmentRecorderPoint) CollectionsKt___CollectionsKt.last((List) arrayList)).setSize(i);
                    ((SegmentRecorderPoint) CollectionsKt___CollectionsKt.last((List) arrayList)).setDistance((int) d5);
                }
                arrayList.add(new SegmentRecorderPoint(i6, (int) (((double) i9) * commonTrackData2.getLongitude()), (int) (((double) i9) * commonTrackData2.getLatitude()), commonTrackData2.getElevation(), i, (int) d5));
                d7 = d;
                i = 0;
                z2 = true;
            } else {
                d7 = d5;
            }
            arrayList3.add(new RecorderPoint(i6, 0, 0, commonTrackData2.getElevation(), 0, 0.0d, 0.0d, 0, commonTrackData2.getLongitude(), commonTrackData2.getLatitude(), commonTrackData2.getFlagSegment(), 246, null));
            dDoubleValue2 = d2;
            i6 = i8;
            it = it2;
            size = i10;
            i3 = iMin3;
            dDoubleValue3 = d3;
            d6 = d4;
            i2 = iMax2;
            z = z3;
            iMin = i11;
            i4 = iMax3;
            i7 = i;
            arrayList5 = arrayList;
            trackDataManager = this;
            commonTrackData = commonTrackData2;
            i5 = iMax;
        }
        int i14 = size;
        ArrayList arrayList6 = arrayList5;
        double size2 = elevation2 / ((double) tracklist.size());
        trackDataManager.converInvalidValue(arrayList2);
        int i15 = z ? 23 : 7;
        if (z2) {
            i15 += 32;
        }
        int i16 = iMin2;
        byte b2 = (byte) i15;
        byte[] bytes = fileName.getBytes(Charsets.UTF_8);
        int i17 = i2;
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bytes, 60);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrHexToByteArray = HexUtilsKt.hexToByteArray(fileMd5);
        if (originalDis != null) {
            dDoubleValue = originalDis.doubleValue();
        }
        int i18 = (int) dDoubleValue;
        int i19 = (int) size2;
        if (originalClimb != null) {
            dDoubleValue2 = originalClimb.doubleValue();
        }
        if (originalDecrease != null) {
            dDoubleValue3 = originalDecrease.doubleValue();
        }
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        Long lCalculateTimeDifference = parserHelper.calculateTimeDifference(tracklist);
        int i20 = 0;
        return new Pair<>(arrayList2, new Recorder(b2, z, 0, bArrCopyOf, fileName, bArrHexToByteArray, fileMd5, i18, i14, i20, i20, i3, i16, i5, i17, iMin, i4, i19, dDoubleValue2, dDoubleValue3, arrayList2, null, arrayList6, arrayList3, null, filePath, fileExtension, parserHelper.formatMillisToHMS(lCalculateTimeDifference != null ? lCalculateTimeDifference.longValue() : 0L), 18874884, null));
    }

    private final List<WptRecorderPoint> buildWptBasicInfo(List<WayPointData> wptList, List<CommonTrackData> list, List<RecorderPoint> pointList, Recorder recorder) {
        int i;
        double dDoubleValue;
        if (list.isEmpty()) {
            return null;
        }
        if (wptList != null) {
            for (WayPointData wayPointData : wptList) {
                FitnessLogUtils.d(TAG, "original wpt:" + wayPointData.getName() + " , ele:" + wayPointData.getElevation());
            }
        }
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(wptList);
        if (isAddFirstWpt(wptList, list)) {
            byte[] bytes = "StartWptPoint".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            double longitude = ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLongitude();
            int i2 = lonLatRatio;
            arrayList.add(new WptRecorderPoint(0, bytes, (int) (longitude * ((double) i2)), (int) (((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getLatitude() * ((double) i2)), (int) ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) list)).getElevation(), 0.0d, 0.0d, 0, 0, 480, null));
        }
        for (WayPointData wayPointData2 : wptList) {
            Iterator it = list.iterator();
            double ele = 0.0d;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            int no2 = 0;
            while (it.hasNext()) {
                i4++;
                CommonTrackData commonTrackData = (CommonTrackData) it.next();
                AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
                Double lon = wayPointData2.getLon();
                Intrinsics.checkNotNull(lon);
                double dDoubleValue2 = lon.doubleValue();
                Double lat = wayPointData2.getLat();
                Intrinsics.checkNotNull(lat);
                Iterator it2 = it;
                double distance = aMapPathUtils.getDistance(dDoubleValue2, lat.doubleValue(), commonTrackData.getLongitude(), commonTrackData.getLatitude());
                double d = ele;
                if (distance >= 100.0d || distance >= i3) {
                    ele = d;
                } else {
                    i3 = (int) distance;
                    no2 = pointList.get(i4).getNo();
                    ele = pointList.get(i4).getEle();
                }
                it = it2;
            }
            double d2 = ele;
            if (i3 != Integer.MAX_VALUE) {
                byte[] bytes2 = wayPointData2.getName().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                Double lon2 = wayPointData2.getLon();
                Intrinsics.checkNotNull(lon2);
                double dDoubleValue3 = lon2.doubleValue();
                int i5 = lonLatRatio;
                int i6 = (int) (dDoubleValue3 * ((double) i5));
                Double lat2 = wayPointData2.getLat();
                Intrinsics.checkNotNull(lat2);
                int iDoubleValue = (int) (lat2.doubleValue() * ((double) i5));
                if (Intrinsics.areEqual(-100000.0d, wayPointData2.getElevation())) {
                    dDoubleValue = d2;
                } else {
                    Double elevation = wayPointData2.getElevation();
                    if (elevation != null) {
                        dDoubleValue = elevation.doubleValue();
                    } else {
                        i = 0;
                    }
                    arrayList.add(new WptRecorderPoint(no2, bytes2, i6, iDoubleValue, i, 0.0d, 0.0d, 0, 0, 480, null));
                }
                i = (int) dDoubleValue;
                arrayList.add(new WptRecorderPoint(no2, bytes2, i6, iDoubleValue, i, 0.0d, 0.0d, 0, 0, 480, null));
            }
        }
        if (isAddEndWpt(wptList, list)) {
            int size = list.size() - 1;
            byte[] bytes3 = "EndWptPoint".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            double longitude2 = ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLongitude();
            int i7 = lonLatRatio;
            arrayList.add(new WptRecorderPoint(size, bytes3, (int) (longitude2 * ((double) i7)), (int) (((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getLatitude() * ((double) i7)), (int) ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) list)).getElevation(), 0.0d, 0.0d, 0, 0, 480, null));
        }
        final Function2 function2 = new Function2() { // from class: llp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(TrackDataManager.buildWptBasicInfo$lambda$5((WptRecorderPoint) obj, (WptRecorderPoint) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: mlp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackDataManager.buildWptBasicInfo$lambda$6(function2, obj, obj2);
            }
        });
        List listTake = CollectionsKt___CollectionsKt.take(arrayList, 100);
        Intrinsics.checkNotNull(listTake, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.route.export.track.WptRecorderPoint>");
        List<WptRecorderPoint> listAsMutableList = TypeIntrinsics.asMutableList(listTake);
        recorder.setPassPoint(listAsMutableList.size());
        for (WptRecorderPoint wptRecorderPoint : listAsMutableList) {
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
        FitnessLogUtils.i(TAG, "original wpt size :" + arrayList.size() + " , wpt size:" + listAsMutableList.size());
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
                RecorderPoint recorderPoint2 = pointList.get(list.get(i - 1).getNo());
                WptRecorderPoint wptRecorderPoint2 = list.get(i);
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
        int i3 = 0;
        for (WptRecorderPoint wptRecorderPoint4 : list2) {
            int i4 = i3 + 1;
            if (i3 != 0) {
                WptRecorderPoint wptRecorderPoint5 = mWptList.get(i3 - 1);
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
            i3 = i4;
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

    private final List<CommonTrackData> filterInvalidLocation(List<CommonTrackData> trackList) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : trackList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CommonTrackData commonTrackData = (CommonTrackData) obj;
            if (commonTrackData.getElevation() == -100000.0d) {
                FitnessLogUtils.d(TAG, "commonTrackData:" + commonTrackData);
            } else {
                arrayList.add(commonTrackData);
            }
            i = i2;
        }
        return arrayList;
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

    @NotNull
    public final MutableLiveData<Unit> getRouteListNotifyLiveData() {
        return routeListNotifyLiveData;
    }

    public final void notifyRouteList() {
        routeListNotifyLiveData.postValue(Unit.INSTANCE);
        Logger.i(TAG, "create route success,notify route list");
    }

    @Nullable
    public final Pair<byte[], Recorder> recorder(@NotNull List<CommonTrackData> trackList, @NotNull List<WayPointData> wptList, @NotNull String fileMd5, @NotNull String fileName, @NotNull String filePath, @NotNull String fileExtension, @Nullable Double dis, @Nullable Double cumulativeClimb, @Nullable Double cumulativeDecrease) {
        Intrinsics.checkNotNullParameter(trackList, "trackList");
        Intrinsics.checkNotNullParameter(wptList, "wptList");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        if (trackList.isEmpty()) {
            FitnessLogUtils.i(TAG, "tracklist isEmpty");
            return null;
        }
        Pair<List<RecorderPoint>, Recorder> pairBuildTrackInfo = buildTrackInfo(trackList, fileName, fileMd5, filePath, fileExtension, dis, cumulativeClimb, cumulativeDecrease);
        List<RecorderPoint> listComponent1 = pairBuildTrackInfo.component1();
        Recorder recorderComponent2 = pairBuildTrackInfo.component2();
        List<WptRecorderPoint> listBuildWptBasicInfo = buildWptBasicInfo(wptList, trackList, listComponent1, recorderComponent2);
        buildWptCumulativeInfo(listBuildWptBasicInfo, listComponent1);
        recorderComponent2.setWptList(listBuildWptBasicInfo);
        return TrackRecorder.INSTANCE.recorder(recorderComponent2);
    }
}
