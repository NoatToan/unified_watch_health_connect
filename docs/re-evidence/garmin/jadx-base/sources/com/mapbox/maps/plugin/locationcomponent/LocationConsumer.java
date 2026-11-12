package com.mapbox.maps.plugin.locationcomponent;

import android.animation.ValueAnimator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.location.LocationError;
import com.mapbox.geojson.Point;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\u00072\n\u0010\r\u001a\u00020\u000b\"\u00020\f2\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0012\u0010\u0011J3\u0010\u0014\u001a\u00020\u00072\n\u0010\u0013\u001a\u00020\u000b\"\u00020\f2\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;", "", "", "Lcom/mapbox/geojson/Point;", FirebaseAnalytics.Param.LOCATION, "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "options", "onLocationUpdated", "([Lcom/mapbox/geojson/Point;Le23/l;)V", "", "", "bearing", "onBearingUpdated", "([DLe23/l;)V", "onPuckLocationAnimatorDefaultOptionsUpdated", "(Le23/l;)V", "onPuckBearingAnimatorDefaultOptionsUpdated", "radius", "onHorizontalAccuracyRadiusUpdated", "onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated", "Lcom/mapbox/common/location/LocationError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "(Lcom/mapbox/common/location/LocationError;)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LocationConsumer {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onBearingUpdated$default(LocationConsumer locationConsumer, double[] dArr, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: onBearingUpdated");
                return;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            locationConsumer.onBearingUpdated(dArr, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onHorizontalAccuracyRadiusUpdated$default(LocationConsumer locationConsumer, double[] dArr, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: onHorizontalAccuracyRadiusUpdated");
                return;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            locationConsumer.onHorizontalAccuracyRadiusUpdated(dArr, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onLocationUpdated$default(LocationConsumer locationConsumer, Point[] pointArr, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: onLocationUpdated");
                return;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            locationConsumer.onLocationUpdated(pointArr, lVar);
        }
    }

    void onBearingUpdated(double[] bearing, l<? super ValueAnimator, Unit> options);

    void onError(LocationError error);

    void onHorizontalAccuracyRadiusUpdated(double[] radius, l<? super ValueAnimator, Unit> options);

    void onLocationUpdated(Point[] location, l<? super ValueAnimator, Unit> options);

    void onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options);

    void onPuckBearingAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options);

    void onPuckLocationAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options);
}
