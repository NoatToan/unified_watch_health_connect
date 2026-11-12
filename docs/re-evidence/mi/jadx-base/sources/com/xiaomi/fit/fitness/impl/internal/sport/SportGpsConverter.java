package com.xiaomi.fit.fitness.impl.internal.sport;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import com.xiaomi.wearable.gpsalgorithm.inner.PathConfigParams;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0002J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter;", "", "<init>", "()V", "convertGpsRecord", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gpsList", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "convertGpsData", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "smooth", "trackData", "Lcom/xiaomi/wearable/gpsalgorithm/data/GpsTrackData;", "computeSpeed", "", "locationList", "convertGpsRecordToLocation", "computeGPSDistance", "", "startLocation", "endLocation", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportGpsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGpsConverter.kt\ncom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1863#2,2:150\n*S KotlinDebug\n*F\n+ 1 SportGpsConverter.kt\ncom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter\n*L\n51#1:150,2\n*E\n"})
public final class SportGpsConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SportGpsConverter instance = new SportGpsConverter();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter;", "getInstance", "()Lcom/xiaomi/fit/fitness/impl/internal/sport/SportGpsConverter;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportGpsConverter getInstance() {
            return SportGpsConverter.instance;
        }
    }

    private SportGpsConverter() {
    }

    private final float computeGPSDistance(Location startLocation, Location endLocation) {
        float fComputeDistance = FitnessSportDistanceUtil.computeDistance(startLocation, endLocation);
        double d = fComputeDistance;
        endLocation.distance = d;
        endLocation.total_distance = startLocation.total_distance + d;
        return fComputeDistance;
    }

    private final void computeSpeed(List<? extends Location> locationList) {
        Location location = null;
        for (Location location2 : locationList) {
            if (location != null) {
                double d = location2.total_distance - location.total_distance;
                long j = location2.timeStamp - location.timeStamp;
                if (d > 0.0d && j > 0) {
                    location2.speed = (float) ((d * ((double) 1.0f)) / j);
                }
            }
            location = location2;
        }
    }

    private final GpsTrackData convertGpsRecordToLocation(SportBasicReport sportReport, List<GpsRecord> gpsList) {
        int sportType = sportReport.getSportType();
        LinkedList linkedList = new LinkedList();
        long tzOffsetInSecBy15min = FitnessDateUtils.getTzOffsetInSecBy15min(sportReport.getTzIn15Min()) - FitnessDateUtils.getCurrentTZOffsetInSec();
        GpsTrackData.Builder builderEndTime = new GpsTrackData.Builder().sportType(sportType).timeStamp(sportReport.getTimeStamp() + tzOffsetInSecBy15min).startTime(sportReport.getStartTime() + tzOffsetInSecBy15min).endTime(sportReport.getEndTime() + tzOffsetInSecBy15min);
        Location location = null;
        for (GpsRecord gpsRecord : gpsList) {
            Location location2 = new Location();
            location2.timeStamp = gpsRecord.getTimeStamp() + tzOffsetInSecBy15min;
            location2.latitude = gpsRecord.getLatitude();
            location2.longitude = gpsRecord.getLongitude();
            if (gpsRecord.getAccuracy() != null) {
                Float accuracy = gpsRecord.getAccuracy();
                Intrinsics.checkNotNull(accuracy);
                location2.horizontalAccuracy = accuracy.floatValue();
                builderEndTime.hAccValid(true);
                sportReport.setHAccValid(true);
            }
            if (gpsRecord.getSpeed() != null) {
                Float speed = gpsRecord.getSpeed();
                Intrinsics.checkNotNull(speed);
                float fFloatValue = speed.floatValue();
                location2.speed = fFloatValue;
                if (fFloatValue > 0.0f) {
                    builderEndTime.speedValid(true);
                    sportReport.setSpeedValid(true);
                }
            }
            if (gpsRecord.getGpsSource() != null) {
                Integer gpsSource = gpsRecord.getGpsSource();
                Intrinsics.checkNotNull(gpsSource);
                location2.gpsSource = gpsSource.intValue();
                builderEndTime.gpsSourceValid(true);
                sportReport.setGpsSourceValid(true);
            }
            if (location != null) {
                location2.startTimeStamp = location.timeStamp;
                computeGPSDistance(location, location2);
                location2.flagSegment = PathConfigParams.computeFlagSegment(location2, sportType);
            } else {
                location2.startTimeStamp = location2.timeStamp - 1;
            }
            if (location2.distance > 0.0d || linkedList.isEmpty()) {
                linkedList.add(location2);
            }
            location = location2;
        }
        builderEndTime.locationList(linkedList);
        GpsTrackData gpsTrackDataBuild = builderEndTime.build();
        Intrinsics.checkNotNullExpressionValue(gpsTrackDataBuild, "build(...)");
        return gpsTrackDataBuild;
    }

    private final List<Location> smooth(GpsTrackData trackData) {
        List<Location> listSmoothGpsTrack = FitnessSportAlgo.smoothGpsTrack(trackData, null);
        Intrinsics.checkNotNullExpressionValue(listSmoothGpsTrack, "smoothGpsTrack(...)");
        return listSmoothGpsTrack;
    }

    @NotNull
    public final List<Location> convertGpsData(@NotNull List<GpsRecord> gpsList) {
        Intrinsics.checkNotNullParameter(gpsList, "gpsList");
        ArrayList arrayList = new ArrayList();
        for (GpsRecord gpsRecord : gpsList) {
            Location location = new Location();
            location.timeStamp = gpsRecord.getTimeStamp();
            location.longitude = gpsRecord.getLongitude();
            location.latitude = gpsRecord.getLatitude();
            arrayList.add(location);
        }
        return arrayList;
    }

    @NotNull
    public final Map<SportRecordKey, List<Object>> convertGpsRecord(@NotNull SportBasicReport sportReport, @NotNull List<GpsRecord> gpsList) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(gpsList, "gpsList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GpsTrackData gpsTrackDataConvertGpsRecordToLocation = convertGpsRecordToLocation(sportReport, gpsList);
        ArrayList arrayList = new ArrayList();
        for (Location location : gpsTrackDataConvertGpsRecordToLocation.locationList) {
            arrayList.add(new SportRecordItem(location.startTimeStamp, location.timeStamp, Double.valueOf(location.distance), 0, 0, 24, null));
        }
        if (!arrayList.isEmpty()) {
            linkedHashMap.put(SportRecordKey.Distance, arrayList);
        }
        linkedHashMap.put(SportRecordKey.Gps, gpsTrackDataConvertGpsRecordToLocation.locationList);
        return linkedHashMap;
    }
}
