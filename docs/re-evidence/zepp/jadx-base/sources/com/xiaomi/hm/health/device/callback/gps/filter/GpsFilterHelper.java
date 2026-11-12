package com.xiaomi.hm.health.device.callback.gps.filter;

import com.google.android.exoplayer2.text.ttml.b;
import com.huami.core.device.feature.gps.filter.GpsPointFilterHelper;
import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PauseInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PlaygroundInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrokeSpeedInfo;
import com.xiaomi.hm.health.device.gps.impl.PlayGroundGpsCalibrationImpl;
import com.xiaomi.hm.health.device.gps.impl.PlaygroundReviseApiImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001e\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/gps/filter/GpsFilterHelper;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "detail", "a", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "records", "filter", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsFilterHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = GpsFilterHelper.class.getSimpleName();

    private final SportDetail a(SportDetail detail) {
        SportDetail sportDetail = new SportDetail();
        Iterator<T> it2 = detail.getKmPaceInfos().iterator();
        while (it2.hasNext()) {
            sportDetail.addKmPaceInfo((KmPaceInfo) it2.next());
        }
        Iterator<T> it3 = detail.getMilePaceInfos().iterator();
        while (it3.hasNext()) {
            sportDetail.addMilePaceInfo((MilePaceInfo) it3.next());
        }
        Iterator<T> it4 = detail.getHeartRateInfos().iterator();
        while (it4.hasNext()) {
            sportDetail.addHeartRateInfo((HeartRateInfo) it4.next());
        }
        Iterator<T> it5 = detail.getPauseInfos().iterator();
        while (it5.hasNext()) {
            sportDetail.addPauseInfo((PauseInfo) it5.next());
        }
        Iterator<T> it6 = detail.getStrokeSpeedInfos().iterator();
        while (it6.hasNext()) {
            sportDetail.addStrokeSpeedInfo((StrokeSpeedInfo) it6.next());
        }
        Iterator<T> it7 = detail.getRtPaceInfos().iterator();
        while (it7.hasNext()) {
            sportDetail.addRtPaceInfo((RtPaceInfo) it7.next());
        }
        long time = ((GpsPoint) CollectionsKt.first((List) detail.getGpsPoints())).getTime();
        for (GpsPoint gpsPoint : detail.getGpsPoints()) {
            gpsPoint.setTime(gpsPoint.getTime() - time);
        }
        ArrayList<GpsPoint> gpsPoints = detail.getGpsPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(gpsPoints, 10));
        Iterator<T> it8 = gpsPoints.iterator();
        while (it8.hasNext()) {
            arrayList.add(new GpsDecoration((GpsPoint) it8.next(), time));
        }
        HMLog.d(this.tag, " before filter : [" + arrayList.size() + "]", new Object[0]);
        List<GpsPointWrapper> listFilterPoints = GpsPointFilterHelper.INSTANCE.filterPoints(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFilterPoints, 10));
        Iterator<T> it9 = listFilterPoints.iterator();
        while (it9.hasNext()) {
            arrayList2.add(GpsDecoration.INSTANCE.convertToGpsPoint((GpsPointWrapper) it9.next(), time));
        }
        Iterator it10 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.hm.health.device.callback.gps.filter.GpsFilterHelper$filterDetail$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((GpsPoint) t).getTime()), Long.valueOf(((GpsPoint) t2).getTime()));
            }
        }).iterator();
        while (it10.hasNext()) {
            sportDetail.addGpsPoint((GpsPoint) it10.next());
        }
        HMLog.d(this.tag, "filter out data size : [" + sportDetail.getGpsPoints().size() + "]", new Object[0]);
        GpxHelper gpxHelper = GpxHelper.INSTANCE;
        String gPXFilePath = gpxHelper.getGPXFilePath(b.c0);
        if (gPXFilePath != null) {
            gpxHelper.createGPXFile(detail.getGpsPoints(), gPXFilePath);
        }
        String gPXFilePath2 = gpxHelper.getGPXFilePath(b.d0);
        if (gPXFilePath2 != null) {
            gpxHelper.createGPXFile(sportDetail.getGpsPoints(), gPXFilePath2);
        }
        return sportDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<GpsRecord> filter(@NotNull List<? extends GpsRecord> records) {
        try {
            for (GpsRecord gpsRecord : records) {
                ArrayList<GpsPoint> gpsPoints = gpsRecord.getDetail().getGpsPoints();
                if (!gpsRecord.getDetail().getPlaygroundInfos().isEmpty()) {
                    new PlayGroundGpsCalibrationImpl((PlaygroundInfo) CollectionsKt.first((List) gpsRecord.getDetail().getPlaygroundInfos()), new PlaygroundReviseApiImpl()).calibrate(gpsPoints);
                }
            }
        } catch (Exception e) {
            HMLog.e(this.tag, e);
        }
        return records;
    }
}
