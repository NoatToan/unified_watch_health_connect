package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54534a;

    public /* synthetic */ a(int i14) {
        this.f54534a = i14;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f14, Object obj, Object obj2) {
        switch (this.f54534a) {
            case 0:
                return Evaluators.POINT$lambda$0(f14, (Point) obj, (Point) obj2);
            case 1:
                return Evaluators.DOUBLE$lambda$1(f14, (Double) obj, (Double) obj2);
            case 2:
                return Evaluators.EDGE_INSET$lambda$2(f14, (EdgeInsets) obj, (EdgeInsets) obj2);
            case 3:
                return Evaluators.SCREEN_COORDINATE$lambda$3(f14, (ScreenCoordinate) obj, (ScreenCoordinate) obj2);
            case 4:
                return com.mapbox.maps.plugin.locationcomponent.animators.Evaluators.POINT$lambda$0(f14, (Point) obj, (Point) obj2);
            default:
                return com.mapbox.maps.plugin.locationcomponent.animators.Evaluators.DOUBLE$lambda$1(f14, (Double) obj, (Double) obj2);
        }
    }
}
