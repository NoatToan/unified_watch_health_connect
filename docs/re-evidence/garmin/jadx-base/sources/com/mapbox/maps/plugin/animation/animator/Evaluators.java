package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/animation/animator/Evaluators;", "", "()V", "DOUBLE", "Landroid/animation/TypeEvaluator;", "", "getDOUBLE", "()Landroid/animation/TypeEvaluator;", "EDGE_INSET", "Lcom/mapbox/maps/EdgeInsets;", "kotlin.jvm.PlatformType", "getEDGE_INSET", "POINT", "Lcom/mapbox/geojson/Point;", "getPOINT", "SCREEN_COORDINATE", "Lcom/mapbox/maps/ScreenCoordinate;", "getSCREEN_COORDINATE", "zeroEdgeInsets", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Evaluators {
    public static final Evaluators INSTANCE = new Evaluators();
    private static final TypeEvaluator<Point> POINT = new a(0);
    private static final TypeEvaluator<Double> DOUBLE = new a(1);
    private static final EdgeInsets zeroEdgeInsets = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
    private static final TypeEvaluator<EdgeInsets> EDGE_INSET = new a(2);
    private static final TypeEvaluator<ScreenCoordinate> SCREEN_COORDINATE = new a(3);

    private Evaluators() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double DOUBLE$lambda$1(float f14, Double d14, Double d15) {
        if (f14 == 1.0f) {
            return d15;
        }
        if (f14 == 0.0f) {
            return d14;
        }
        double dDoubleValue = d15.doubleValue();
        d14.getClass();
        double dDoubleValue2 = dDoubleValue - d14.doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return d14;
        }
        return Double.valueOf((((double) f14) * dDoubleValue2) + d14.doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EdgeInsets EDGE_INSET$lambda$2(float f14, EdgeInsets edgeInsets, EdgeInsets edgeInsets2) {
        EdgeInsets edgeInsets3;
        EdgeInsets edgeInsets4;
        if (edgeInsets2 != null) {
            edgeInsets3 = edgeInsets2;
        } else {
            MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "End edge insets are null (fraction: " + f14 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            edgeInsets3 = zeroEdgeInsets;
        }
        if (f14 == 1.0f) {
            return edgeInsets3;
        }
        if (edgeInsets != null) {
            edgeInsets4 = edgeInsets;
        } else {
            MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "Start edge insets are null (fraction: " + f14 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            edgeInsets4 = zeroEdgeInsets;
        }
        if (f14 == 0.0f) {
            return edgeInsets4;
        }
        double top = edgeInsets3.getTop() - edgeInsets4.getTop();
        double left = edgeInsets3.getLeft() - edgeInsets4.getLeft();
        double bottom = edgeInsets3.getBottom() - edgeInsets4.getBottom();
        double right = edgeInsets3.getRight() - edgeInsets4.getRight();
        if (top == 0.0d && left == 0.0d && bottom == 0.0d && right == 0.0d) {
            return edgeInsets4;
        }
        double d14 = f14;
        return new EdgeInsets(edgeInsets4.getTop() + (top * d14), (left * d14) + edgeInsets4.getLeft(), (bottom * d14) + edgeInsets4.getBottom(), (d14 * right) + edgeInsets4.getRight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point POINT$lambda$0(float f14, Point point, Point point2) {
        if (f14 == 1.0f) {
            return point2;
        }
        if (f14 == 0.0f) {
            return point;
        }
        double dLongitude = point2.longitude() - point.longitude();
        double dLatitude = point2.latitude() - point.latitude();
        if (dLongitude == 0.0d && dLatitude == 0.0d) {
            return point;
        }
        double d14 = f14;
        return Point.fromLngLat((dLongitude * d14) + point.longitude(), (d14 * dLatitude) + point.latitude());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenCoordinate SCREEN_COORDINATE$lambda$3(float f14, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        if (f14 == 1.0f) {
            return screenCoordinate2;
        }
        if (f14 == 0.0f) {
            return screenCoordinate;
        }
        double x14 = screenCoordinate2.getX() - screenCoordinate.getX();
        double y14 = screenCoordinate2.getY() - screenCoordinate.getY();
        if (x14 == 0.0d && y14 == 0.0d) {
            return screenCoordinate;
        }
        double d14 = f14;
        return new ScreenCoordinate((x14 * d14) + screenCoordinate.getX(), (d14 * y14) + screenCoordinate.getY());
    }

    public final TypeEvaluator<Double> getDOUBLE() {
        return DOUBLE;
    }

    public final TypeEvaluator<EdgeInsets> getEDGE_INSET() {
        return EDGE_INSET;
    }

    public final TypeEvaluator<Point> getPOINT() {
        return POINT;
    }

    public final TypeEvaluator<ScreenCoordinate> getSCREEN_COORDINATE() {
        return SCREEN_COORDINATE;
    }
}
