package com.xiaomi.fitness.sport_capture.utils;

import android.location.Location;
import androidx.health.connect.client.records.CervicalMucusRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nJ\u001f\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\t¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\t¢\u0006\u0002\u0010\u0018J)\u0010\u001a\u001a\u00020\u00132\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\tH\u0002¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0006\u0010\u001f\u001a\u00020\u0013J\u0006\u0010 \u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR$\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/RoutePointManager;", "", "<init>", "()V", "TAG", "", "MAX_DISTANCE", "", "routePoints", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/sport_capture/utils/RoutePoint;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "coordinatePoints", "Lcom/xiaomi/fitness/sport_capture/utils/CoordinatePoint;", "radius", "", "scale", "updateRadius", "", "r", "addPoint", "routePoint", "getPoints", "()Ljava/util/ArrayList;", "getOriginPoints", "filterRoutePoint", "(Ljava/util/ArrayList;)V", "calcCoordinatePointByRoutePoint", "centerPoint", "curPoint", "printRouteInfo", CervicalMucusRecord.Appearance.CLEAR, "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoutePointManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutePointManager.kt\ncom/xiaomi/fitness/sport_capture/utils/RoutePointManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1863#2,2:152\n1863#2,2:154\n*S KotlinDebug\n*F\n+ 1 RoutePointManager.kt\ncom/xiaomi/fitness/sport_capture/utils/RoutePointManager\n*L\n32#1:152,2\n43#1:154,2\n*E\n"})
public final class RoutePointManager {
    private static final float MAX_DISTANCE = 200.0f;

    @NotNull
    private static final String TAG = "RoutePointManager";
    private static float scale;

    @NotNull
    public static final RoutePointManager INSTANCE = new RoutePointManager();

    @Nullable
    private static ArrayList<RoutePoint> routePoints = new ArrayList<>();

    @Nullable
    private static ArrayList<CoordinatePoint> coordinatePoints = new ArrayList<>();
    private static int radius = -1;

    private RoutePointManager() {
    }

    private final CoordinatePoint calcCoordinatePointByRoutePoint(RoutePoint centerPoint, RoutePoint curPoint) {
        BigDecimal bigDecimal = new BigDecimal(curPoint.getLat());
        BigDecimal bigDecimal2 = new BigDecimal(curPoint.getLon());
        BigDecimal bigDecimal3 = new BigDecimal(centerPoint.getLat());
        int i = new BigDecimal(centerPoint.getLon()).compareTo(bigDecimal2) > 0 ? -1 : 1;
        int i2 = bigDecimal3.compareTo(bigDecimal) > 0 ? 1 : -1;
        RoutePoint routePoint = new RoutePoint(curPoint.getTimeStamp(), centerPoint.getLon(), curPoint.getLat());
        RoutePoint routePoint2 = new RoutePoint(curPoint.getTimeStamp(), curPoint.getLon(), centerPoint.getLat());
        float[] fArr = new float[1];
        Location.distanceBetween(routePoint.getLat(), routePoint.getLon(), centerPoint.getLat(), centerPoint.getLon(), fArr);
        float fAbs = Math.abs(fArr[0]) * scale;
        float[] fArr2 = new float[1];
        Location.distanceBetween(routePoint2.getLat(), routePoint2.getLon(), centerPoint.getLat(), centerPoint.getLon(), fArr2);
        return new CoordinatePoint(Math.abs(fArr2[0]) * scale * i, fAbs * i2);
    }

    private final void filterRoutePoint(ArrayList<RoutePoint> routePoints2) {
        if (routePoints2 == null || !(!routePoints2.isEmpty())) {
            return;
        }
        RoutePoint routePoint = routePoints2.get(0);
        Intrinsics.checkNotNullExpressionValue(routePoint, "get(...)");
        RoutePoint routePoint2 = routePoint;
        float[] fArr = new float[1];
        Iterator<T> it = routePoints2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            RoutePoint routePoint3 = (RoutePoint) it.next();
            Location.distanceBetween(routePoint2.getLat(), routePoint2.getLon(), routePoint3.getLat(), routePoint3.getLon(), fArr);
            if (Math.abs((int) fArr[0]) > 200.0f) {
                break;
            } else {
                i = i2;
            }
        }
        if (i > 0) {
            routePoints2.subList(i, routePoints2.size() - 1).clear();
        }
    }

    public final void addPoint(@NotNull RoutePoint routePoint) {
        Intrinsics.checkNotNullParameter(routePoint, "routePoint");
        ArrayList<RoutePoint> arrayList = routePoints;
        if (arrayList != null) {
            arrayList.add(0, routePoint);
        }
        filterRoutePoint(routePoints);
        if (radius <= 0 || scale <= 0.0f) {
            return;
        }
        ArrayList<CoordinatePoint> arrayList2 = coordinatePoints;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<RoutePoint> arrayList3 = routePoints;
        if (arrayList3 != null) {
            for (RoutePoint routePoint2 : arrayList3) {
                ArrayList<CoordinatePoint> arrayList4 = coordinatePoints;
                if (arrayList4 != null) {
                    arrayList4.add(INSTANCE.calcCoordinatePointByRoutePoint(routePoint, routePoint2));
                }
            }
        }
    }

    public final void clear() {
        ArrayList<RoutePoint> arrayList = routePoints;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<CoordinatePoint> arrayList2 = coordinatePoints;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    @Nullable
    public final ArrayList<RoutePoint> getOriginPoints() {
        return routePoints;
    }

    @Nullable
    public final ArrayList<CoordinatePoint> getPoints() {
        return coordinatePoints;
    }

    public final void printRouteInfo() {
    }

    public final void updateRadius(int r2) {
        radius = r2;
        scale = r2 / 200.0f;
        ArrayList<CoordinatePoint> arrayList = coordinatePoints;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<CoordinatePoint> arrayList2 = coordinatePoints;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<RoutePoint> arrayList3 = routePoints;
        if (arrayList3 == null || !(!arrayList3.isEmpty())) {
            return;
        }
        ArrayList<RoutePoint> arrayList4 = routePoints;
        RoutePoint routePoint = arrayList4 != null ? arrayList4.get(0) : null;
        ArrayList<RoutePoint> arrayList5 = routePoints;
        if (arrayList5 != null) {
            for (RoutePoint routePoint2 : arrayList5) {
                ArrayList<CoordinatePoint> arrayList6 = coordinatePoints;
                if (arrayList6 != null) {
                    RoutePointManager routePointManager = INSTANCE;
                    Intrinsics.checkNotNull(routePoint);
                    arrayList6.add(routePointManager.calcCoordinatePointByRoutePoint(routePoint, routePoint2));
                }
            }
        }
    }
}
