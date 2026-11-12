package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/plugin/animation/animator/CameraCenterAnimator;", "Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "Lcom/mapbox/geojson/Point;", "Landroid/animation/TypeEvaluator;", "evaluator", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "options", "", "useShortestPath", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "block", "<init>", "(Landroid/animation/TypeEvaluator;Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;ZLe23/l;)V", "Z", "getUseShortestPath", "()Z", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "getType", "()Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraCenterAnimator extends CameraAnimator<Point> {
    private final CameraAnimatorType type;
    private final boolean useShortestPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraCenterAnimator(TypeEvaluator<Point> typeEvaluator, CameraAnimatorOptions<Point> cameraAnimatorOptions, boolean z14, l<? super ValueAnimator, Unit> lVar) {
        super(typeEvaluator, cameraAnimatorOptions);
        typeEvaluator.getClass();
        cameraAnimatorOptions.getClass();
        this.useShortestPath = z14;
        if (lVar != null) {
            lVar.invoke(this);
        }
        this.type = CameraAnimatorType.CENTER;
    }

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public CameraAnimatorType getType() {
        return this.type;
    }

    public final boolean getUseShortestPath() {
        return this.useShortestPath;
    }

    public /* synthetic */ CameraCenterAnimator(TypeEvaluator typeEvaluator, CameraAnimatorOptions cameraAnimatorOptions, boolean z14, l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? Evaluators.INSTANCE.getPOINT() : typeEvaluator, cameraAnimatorOptions, z14, (i14 & 8) != 0 ? null : lVar);
    }
}
