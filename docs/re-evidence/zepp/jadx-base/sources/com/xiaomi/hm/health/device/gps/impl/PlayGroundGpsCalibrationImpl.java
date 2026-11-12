package com.xiaomi.hm.health.device.gps.impl;

import com.huami.algo.sportapp.CurrentPlaygroundSportParam;
import com.huami.algo.sportapp.GPSDeltaCoordinatePoint;
import com.huami.algo.sportapp.PlaygroundTemplateParam;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PlaygroundInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model.GPSPointCoorInt32;
import com.xiaomi.hm.health.device.gps.GPSCalibrationApi;
import com.xiaomi.hm.health.device.gps.PlaygroundReviseApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/gps/impl/PlayGroundGpsCalibrationImpl;", "Lcom/xiaomi/hm/health/device/gps/GPSCalibrationApi;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", "Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "a", "", "gpsPoints", "calibrate", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PlaygroundInfo;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PlaygroundInfo;", "playgroundTemplatePara", "Lcom/xiaomi/hm/health/device/gps/PlaygroundReviseApi;", "Lcom/xiaomi/hm/health/device/gps/PlaygroundReviseApi;", "playgroundReviseApi", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PlaygroundInfo;Lcom/xiaomi/hm/health/device/gps/PlaygroundReviseApi;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayGroundGpsCalibrationImpl implements GPSCalibrationApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PlaygroundInfo playgroundTemplatePara;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PlaygroundReviseApi playgroundReviseApi;

    public PlayGroundGpsCalibrationImpl(@NotNull PlaygroundInfo playgroundInfo, @NotNull PlaygroundReviseApi playgroundReviseApi) {
        this.playgroundTemplatePara = playgroundInfo;
        this.playgroundReviseApi = playgroundReviseApi;
    }

    private final GPSDeltaCoordinatePoint a(GpsPoint gpsPoint) {
        return new GPSDeltaCoordinatePoint((int) (gpsPoint.getLatitude() * 3000000.0d), (int) (gpsPoint.getLongitude() * 3000000.0d), gpsPoint.getTime());
    }

    private final GPSDeltaCoordinatePoint b(GPSPointCoorInt32 gPSPointCoorInt32) {
        return new GPSDeltaCoordinatePoint(gPSPointCoorInt32.getLatitude(), gPSPointCoorInt32.getLongitude(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.device.gps.GPSCalibrationApi
    @NotNull
    public List<GpsPoint> calibrate(@NotNull List<? extends GpsPoint> gpsPoints) {
        int i;
        CurrentPlaygroundSportParam currentPlaygroundSportParam = new CurrentPlaygroundSportParam(this.playgroundTemplatePara.getLoopDistance(), this.playgroundTemplatePara.getToleranceDistance(), this.playgroundTemplatePara.getGpsDistance());
        float radius = this.playgroundTemplatePara.getPlaygroundTemplatePara().getRadius();
        float straightwayLength = this.playgroundTemplatePara.getPlaygroundTemplatePara().getStraightwayLength();
        GPSDeltaCoordinatePoint gPSDeltaCoordinatePointB = b(this.playgroundTemplatePara.getPlaygroundTemplatePara().getCenterPoint());
        List<GPSPointCoorInt32> boundPoints = this.playgroundTemplatePara.getPlaygroundTemplatePara().getBoundPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(boundPoints, 10));
        Iterator<T> it2 = boundPoints.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((GPSPointCoorInt32) it2.next()));
        }
        PlaygroundTemplateParam playgroundTemplateParam = new PlaygroundTemplateParam(radius, straightwayLength, gPSDeltaCoordinatePointB, new ArrayList(arrayList), b(this.playgroundTemplatePara.getPlaygroundTemplatePara().getCircleCenterPoint1()), b(this.playgroundTemplatePara.getPlaygroundTemplatePara().getCircleCenterPoint2()), this.playgroundTemplatePara.getPlaygroundTemplatePara().getLatitudeBound(), this.playgroundTemplatePara.getPlaygroundTemplatePara().getDirection());
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = gpsPoints.iterator();
        while (true) {
            i = 0;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if ((((GpsPoint) next).getTime() <= this.playgroundTemplatePara.getTime() ? 1 : 0) != 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(a((GpsPoint) it4.next()));
        }
        List<GPSDeltaCoordinatePoint> listRevise = this.playgroundReviseApi.revise(arrayList3, currentPlaygroundSportParam, playgroundTemplateParam);
        arrayList3.size();
        listRevise.size();
        for (Object obj : listRevise) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint = (GPSDeltaCoordinatePoint) obj;
            ((GpsPoint) gpsPoints.get(i)).setLatitude(((double) gPSDeltaCoordinatePoint.getLatitude()) / 3000000.0d);
            ((GpsPoint) gpsPoints.get(i)).setLongitude(((double) gPSDeltaCoordinatePoint.getLongitude()) / 3000000.0d);
            i = i2;
        }
        return gpsPoints;
    }
}
