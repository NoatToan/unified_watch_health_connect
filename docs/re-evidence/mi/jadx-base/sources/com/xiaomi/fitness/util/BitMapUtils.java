package com.xiaomi.fitness.util;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.LatLng;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.sport.TrackShareRoutineView;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.RecorderPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/util/BitMapUtils;", "", "<init>", "()V", "buildBitmap", "Landroid/graphics/Bitmap;", "recorder", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "sportPathView", "Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBitMapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitMapUtils.kt\ncom/xiaomi/fitness/util/BitMapUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1863#2,2:50\n*S KotlinDebug\n*F\n+ 1 BitMapUtils.kt\ncom/xiaomi/fitness/util/BitMapUtils\n*L\n21#1:50,2\n*E\n"})
public final class BitMapUtils {

    @NotNull
    public static final BitMapUtils INSTANCE = new BitMapUtils();

    private BitMapUtils() {
    }

    @NotNull
    public final Bitmap buildBitmap(@NotNull Recorder recorder, @Nullable SportPathMapView sportPathView) {
        List<RecorderPoint> originalPointList;
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        AMap map = sportPathView != null ? sportPathView.getMap() : null;
        TrackShareRoutineView routineView = sportPathView != null ? sportPathView.getRoutineView() : null;
        if (map == null || routineView == null || (originalPointList = recorder.getOriginalPointList()) == null || originalPointList.isEmpty()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(150, 150, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
        ArrayList arrayList = new ArrayList();
        List<RecorderPoint> originalPointList2 = recorder.getOriginalPointList();
        if (originalPointList2 != null) {
            for (RecorderPoint recorderPoint : originalPointList2) {
                Point screenLocation = map.getProjection().toScreenLocation(new LatLng(recorderPoint.getOriginalLat(), recorderPoint.getOriginalLon()));
                Location location = new Location();
                location.longitude = screenLocation != null ? screenLocation.x : 0;
                location.latitude = screenLocation != null ? screenLocation.y : 0;
                ListExtKt.add(arrayList, location);
            }
        }
        Path path = new Path();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Location location2 = (Location) arrayList.get(i);
            if (i == 0) {
                path.moveTo((float) location2.longitude, (float) location2.latitude);
            } else {
                path.lineTo((float) location2.longitude, (float) location2.latitude);
            }
        }
        routineView.setPath(path);
        return routineView.createBitmap(routineView, routineView.getWidth(), routineView.getHeight());
    }
}
