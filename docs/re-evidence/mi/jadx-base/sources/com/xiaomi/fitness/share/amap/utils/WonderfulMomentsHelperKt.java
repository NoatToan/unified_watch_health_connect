package com.xiaomi.fitness.share.amap.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.AMapUtils;
import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.share.amap.ext.MapPathDataHelperKt;
import com.xiaomi.fitness.share.amap.ext.MaxHeightData;
import com.xiaomi.fitness.share.amap.ext.MaxPaceData;
import com.xiaomi.fitness.share.amap.ext.MaxRateData;
import com.xiaomi.fitness.share.amap.ext.MaxSpeedData;
import com.xiaomi.fitness.share.amap.utils.WonderfulMomentsHelperKt;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.util.AMapPathUtils;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.bsi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t\u001a4\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a-\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0017\u001a5\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007\u001a\u0016\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007\u001a/\u0010#\u001a\u0004\u0018\u00010$2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(\u001a/\u0010)\u001a\u0004\u0018\u00010$2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"getMaxRateMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "locationList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Ljava/util/ArrayList;", "locationTotalDis", "", DailyRecordKey.sportType, "(Ljava/util/ArrayList;II)Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "maxRateMarker", "item", "maxRate", "Lcom/xiaomi/fitness/share/amap/ext/MaxRateData;", StepsInfo.KEY_DISTANCE, "", "getMaxHeightMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "(Ljava/util/ArrayList;I)Lcom/xiaomi/fitness/share/amap/utils/MaxHeightMarker;", "getMaxPaceMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", FitnessReportKey.maxPace, "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "(Ljava/util/ArrayList;Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;I)Lcom/xiaomi/fitness/share/amap/utils/MaxPaceMarker;", "getMaxSpeedMarker", "Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "maxSpeed", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "(Ljava/util/ArrayList;Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;I)Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "showWonderfulAnimator", "", "target", "Landroid/view/View;", "value", "hideWonderfulAnimaotr", "getChangeItemA", "Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "location", "gpsValues", "Lcom/mi/health/map/data/GpsValues;", "(Ljava/util/ArrayList;Lcom/mi/health/map/data/GpsValues;)Lcom/xiaomi/fitness/share/amap/utils/ChangeItem;", "getChangeItemB", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWonderfulMomentsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WonderfulMomentsHelper.kt\ncom/xiaomi/fitness/share/amap/utils/WonderfulMomentsHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1863#2,2:294\n1863#2,2:296\n1863#2,2:298\n1863#2,2:300\n1863#2,2:302\n*S KotlinDebug\n*F\n+ 1 WonderfulMomentsHelper.kt\ncom/xiaomi/fitness/share/amap/utils/WonderfulMomentsHelperKt\n*L\n86#1:294,2\n121#1:296,2\n153#1:298,2\n257#1:300,2\n273#1:302,2\n*E\n"})
public final class WonderfulMomentsHelperKt {
    @Nullable
    public static final ChangeItem getChangeItemA(@NotNull ArrayList<Location> location, @Nullable GpsValues gpsValues) {
        List<Location> list;
        List<Location> list2;
        Intrinsics.checkNotNullParameter(location, "location");
        if (gpsValues != null && (list = gpsValues.swimLocationList) != null && (!list.isEmpty())) {
            Location location2 = (gpsValues == null || (list2 = gpsValues.swimLocationList) == null) ? null : (Location) CollectionsKt___CollectionsKt.last((List) list2);
            for (Location location3 : location) {
                long j = location3.timeStamp;
                Long lValueOf = location2 != null ? Long.valueOf(location2.timeStamp) : null;
                Intrinsics.checkNotNull(lValueOf);
                if (j > lValueOf.longValue()) {
                    location3.sportLabel = 5;
                    return new ChangeItem(location3.timeStamp);
                }
            }
        }
        return null;
    }

    @Nullable
    public static final ChangeItem getChangeItemB(@NotNull ArrayList<Location> location, @Nullable GpsValues gpsValues) {
        List<Location> list;
        List<Location> list2;
        Intrinsics.checkNotNullParameter(location, "location");
        if (gpsValues != null && (list = gpsValues.cycleLocationList) != null && (!list.isEmpty())) {
            Location location2 = (gpsValues == null || (list2 = gpsValues.cycleLocationList) == null) ? null : (Location) CollectionsKt___CollectionsKt.last((List) list2);
            for (Location location3 : location) {
                long j = location3.timeStamp;
                Long lValueOf = location2 != null ? Long.valueOf(location2.timeStamp) : null;
                Intrinsics.checkNotNull(lValueOf);
                if (j > lValueOf.longValue()) {
                    location3.sportLabel = 6;
                    return new ChangeItem(location3.timeStamp);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, com.xiaomi.fitness.share.amap.utils.MaxHeightMarker] */
    @Nullable
    public static final MaxHeightMarker getMaxHeightMarker(@NotNull ArrayList<Location> locationList, int i) {
        Ref.ObjectRef objectRef;
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        MaxHeightData maxHeight = MapPathDataHelperKt.getMaxHeight();
        Double d = null;
        if (maxHeight == null) {
            return null;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Location location = locationList.get(0);
        Intrinsics.checkNotNullExpressionValue(location, "get(...)");
        double distance = 0.0d;
        for (Location location2 : locationList) {
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            double d2 = location2.longitude;
            double d3 = location2.latitude;
            Location location3 = location;
            Double dValueOf = location3 != null ? Double.valueOf(location3.longitude) : d;
            Intrinsics.checkNotNull(dValueOf);
            double dDoubleValue = dValueOf.doubleValue();
            Intrinsics.checkNotNull(location);
            Ref.ObjectRef objectRef3 = objectRef2;
            distance += (double) ((float) aMapPathUtils.getDistance(d2, d3, dDoubleValue, location3.latitude));
            if (location2.timeStamp >= maxHeight.getStartTime()) {
                objectRef = objectRef3;
                if (objectRef.element == 0) {
                    location2.sportLabel = 2;
                    ?? maxHeightMarker = new MaxHeightMarker(null, null, maxHeight.getMaxHeight(), maxHeight.getStartTime());
                    maxHeightMarker.setMaxHeightMarkerPosition(aMapPathUtils.createLatLng(location2));
                    maxHeightMarker.setMaxHeightMarkerDisRatio(Float.valueOf(((float) distance) / i));
                    objectRef.element = maxHeightMarker;
                }
            } else {
                objectRef = objectRef3;
            }
            objectRef2 = objectRef;
            location = location2;
            d = null;
        }
        return (MaxHeightMarker) objectRef2.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.xiaomi.fitness.share.amap.utils.MaxPaceMarker] */
    @Nullable
    public static final MaxPaceMarker getMaxPaceMarker(@NotNull ArrayList<Location> locationList, @NotNull MaxPaceData maxPace, int i) {
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        Intrinsics.checkNotNullParameter(maxPace, "maxPace");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Location location = locationList.get(0);
        Intrinsics.checkNotNullExpressionValue(location, "get(...)");
        Iterator it = locationList.iterator();
        double distance = 0.0d;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            Location location3 = location;
            Iterator it2 = it;
            distance += (double) ((float) aMapPathUtils.getDistance(location2.longitude, location2.latitude, location3.longitude, location3.latitude));
            if (location2.timeStamp >= maxPace.getStartTime() && objectRef.element == 0) {
                location2.sportLabel = 3;
                ?? maxPaceMarker = new MaxPaceMarker(null, null, maxPace.getMaxPace(), maxPace.getStartTime());
                maxPaceMarker.setMaxPaceMarkerPosition(aMapPathUtils.createLatLng(location2));
                maxPaceMarker.setMaxPaceMarkerDisRatio(Float.valueOf(((float) distance) / i));
                objectRef.element = maxPaceMarker;
            }
            it = it2;
            location = location2;
        }
        return (MaxPaceMarker) objectRef.element;
    }

    @Nullable
    public static final MaxRateMarker getMaxRateMarker(@NotNull ArrayList<Location> locationList, int i, int i2) {
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        MaxRateData maxRate = MapPathDataHelperKt.getMaxRate(i2);
        Location location = locationList.get(0);
        Intrinsics.checkNotNullExpressionValue(location, "get(...)");
        location = location;
        double d = 0.0d;
        MaxRateMarker maxRateMarker = null;
        for (Location location2 : locationList) {
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            double dCalculateLineDistance = d + ((double) ((int) AMapUtils.calculateLineDistance(aMapPathUtils.createLatLng(location2), aMapPathUtils.createLatLng(location2))));
            if (location2.timeStamp < maxRate.getStartTime() || maxRateMarker != null) {
                d = dCalculateLineDistance;
            } else {
                d = dCalculateLineDistance;
                maxRateMarker = maxRateMarker(location2, maxRateMarker, maxRate, d, i);
            }
        }
        return maxRateMarker == null ? maxRateMarker((Location) CollectionsKt___CollectionsKt.last((List) locationList), maxRateMarker, maxRate, d, i) : maxRateMarker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.xiaomi.fitness.share.amap.utils.MaxSpeedMarker] */
    @Nullable
    public static final MaxSpeedMarker getMaxSpeedMarker(@NotNull ArrayList<Location> locationList, @NotNull MaxSpeedData maxSpeed, int i) {
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        Intrinsics.checkNotNullParameter(maxSpeed, "maxSpeed");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Location location = locationList.get(0);
        Iterator it = locationList.iterator();
        double distance = 0.0d;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            AMapPathUtils aMapPathUtils = AMapPathUtils.INSTANCE;
            double d = location2.longitude;
            double d2 = location2.latitude;
            Double dValueOf = location != null ? Double.valueOf(location.longitude) : null;
            Intrinsics.checkNotNull(dValueOf);
            double dDoubleValue = dValueOf.doubleValue();
            Intrinsics.checkNotNull(location);
            Iterator it2 = it;
            distance += (double) ((float) aMapPathUtils.getDistance(d, d2, dDoubleValue, location.latitude));
            if (location2.timeStamp >= maxSpeed.getStartTime() && objectRef.element == 0) {
                location2.sportLabel = 4;
                ?? maxSpeedMarker = new MaxSpeedMarker(null, null, maxSpeed.getMaxSpeed(), maxSpeed.getStartTime());
                maxSpeedMarker.setMaxSpeedMarkerPosition(aMapPathUtils.createLatLng(location2));
                maxSpeedMarker.setMaxSpeedMarkerDisRatio(Float.valueOf(((float) distance) / i));
                objectRef.element = maxSpeedMarker;
            }
            it = it2;
            location = location2;
        }
        return (MaxSpeedMarker) objectRef.element;
    }

    public static final void hideWonderfulAnimaotr(@NotNull final View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        final TextView textView = (TextView) target.findViewById(bsi.f4);
        final TextView textView2 = (TextView) target.findViewById(bsi.k4);
        Intrinsics.checkNotNull(textView);
        final ViewWidthWrapper viewWidthWrapper = new ViewWidthWrapper(textView);
        final ViewHeightWrapper viewHeightWrapper = new ViewHeightWrapper(target);
        textView.post(new Runnable() { // from class: com.xiaomi.fitness.share.amap.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                WonderfulMomentsHelperKt.hideWonderfulAnimaotr$lambda$11(viewWidthWrapper, textView2, textView, viewHeightWrapper, target);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWonderfulAnimaotr$lambda$11(ViewWidthWrapper viewWrapper, TextView textView, TextView textView2, ViewHeightWrapper targetWrapper, final View target) {
        Intrinsics.checkNotNullParameter(viewWrapper, "$viewWrapper");
        Intrinsics.checkNotNullParameter(targetWrapper, "$targetWrapper");
        Intrinsics.checkNotNullParameter(target, "$target");
        ObjectAnimator duration = ObjectAnimator.ofInt(viewWrapper, "width", textView.getWidth(), 0).setDuration(1000L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        Intrinsics.checkNotNullExpressionValue(ObjectAnimator.ofFloat(textView2, SleepAnalyzerAlpha.NAME_ALPHA, 1.0f, 0.0f).setDuration(600L), "setDuration(...)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, SleepAnalyzerAlpha.NAME_ALPHA, 1.0f, 0.0f).setDuration(600L);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(targetWrapper, "height", textView.getHeight(), ExtUtilsKt.getDp(20));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, objectAnimatorOfInt);
        animatorSet.start();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lmr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WonderfulMomentsHelperKt.hideWonderfulAnimaotr$lambda$11$lambda$10(target, valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWonderfulAnimaotr$lambda$11$lambda$10(View target, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getAnimatedFraction() >= 0.9f) {
            target.setVisibility(8);
        }
    }

    private static final MaxRateMarker maxRateMarker(Location location, MaxRateMarker maxRateMarker, MaxRateData maxRateData, double d, int i) {
        location.sportLabel = 1;
        MaxRateMarker maxRateMarker2 = new MaxRateMarker(null, null, maxRateData.getMaxRate(), location.timeStamp);
        maxRateMarker2.setMaxRateMarkerPosition(AMapPathUtils.INSTANCE.createLatLng(location));
        maxRateMarker2.setMaxRateMarkerRatioByDis(Float.valueOf(((float) d) / i));
        return maxRateMarker2;
    }

    public static final void showWonderfulAnimator(@NotNull final View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        final TextView textView = (TextView) target.findViewById(bsi.f4);
        final TextView textView2 = (TextView) target.findViewById(bsi.k4);
        Intrinsics.checkNotNull(textView);
        final ViewWidthWrapper viewWidthWrapper = new ViewWidthWrapper(textView);
        target.setVisibility(4);
        textView.post(new Runnable() { // from class: com.xiaomi.fitness.share.amap.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                WonderfulMomentsHelperKt.showWonderfulAnimator$lambda$8(viewWidthWrapper, textView2, textView, target);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWonderfulAnimator$lambda$8(ViewWidthWrapper viewWrapper, TextView textView, TextView textView2, View target) {
        Intrinsics.checkNotNullParameter(viewWrapper, "$viewWrapper");
        Intrinsics.checkNotNullParameter(target, "$target");
        ObjectAnimator duration = ObjectAnimator.ofInt(viewWrapper, "width", 50, textView.getWidth()).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        Intrinsics.checkNotNullExpressionValue(ObjectAnimator.ofFloat(textView2, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f).setDuration(300L), "setDuration(...)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f).setDuration(700L);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        ObjectAnimator duration3 = ObjectAnimator.ofInt(textView, "height", ExtUtilsKt.getDp(20), textView.getHeight()).setDuration(900L);
        Intrinsics.checkNotNullExpressionValue(duration3, "setDuration(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        animatorSet.start();
        target.setVisibility(0);
    }
}
