package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.animation.animator.a;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/Evaluators;", "", "()V", "DOUBLE", "Landroid/animation/TypeEvaluator;", "", "getDOUBLE", "()Landroid/animation/TypeEvaluator;", "POINT", "Lcom/mapbox/geojson/Point;", "getPOINT", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Evaluators {
    public static final Evaluators INSTANCE = new Evaluators();
    private static final TypeEvaluator<Point> POINT = new a(4);
    private static final TypeEvaluator<Double> DOUBLE = new a(5);

    private Evaluators() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double DOUBLE$lambda$1(float f14, Double d14, Double d15) {
        return Double.valueOf(((d15.doubleValue() - d14.doubleValue()) * ((double) f14)) + d14.doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point POINT$lambda$0(float f14, Point point, Point point2) {
        double d14 = f14;
        double dLongitude = ((point2.longitude() - point.longitude()) * d14) + point.longitude();
        double dLatitude = ((point2.latitude() - point.latitude()) * d14) + point.latitude();
        if (!point.hasAltitude() || !point2.hasAltitude()) {
            return Point.fromLngLat(dLongitude, dLatitude);
        }
        return Point.fromLngLat(dLongitude, dLatitude, ((point2.altitude() - point.altitude()) * d14) + point.altitude());
    }

    public final TypeEvaluator<Double> getDOUBLE() {
        return DOUBLE;
    }

    public final TypeEvaluator<Point> getPOINT() {
        return POINT;
    }
}
