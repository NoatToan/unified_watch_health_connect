package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.ValueAnimator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorAccuracyRadiusChangedListener;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorBearingChangedListener;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorPositionChangedListener;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.maps.util.MathUtils;
import e23.l;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010 \u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001a2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0017¢\u0006\u0004\b$\u0010#J/\u0010)\u001a\u00020\u00172\n\u0010&\u001a\u00020%\"\u00020\u001d2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a¢\u0006\u0004\b)\u0010*J7\u0010,\u001a\u00020\u00172\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0+\"\u00020\u001b2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a¢\u0006\u0004\b,\u0010-J/\u0010.\u001a\u00020\u00172\n\u0010&\u001a\u00020%\"\u00020\u001d2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a¢\u0006\u0004\b.\u0010*J\u001d\u00102\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001d2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00172\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00172\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00172\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0004\b9\u00108J!\u0010:\u001a\u00020\u00172\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0004\b:\u00108R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R$\u0010F\u001a\u00020@2\u0006\u0010A\u001a\u00020@8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimatorManager;", "", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", "indicatorPositionChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "indicatorBearingChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "indicatorAccuracyRadiusChangedListener", "", "pixelRatio", "<init>", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;F)V", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckBearingAnimator;", "bearingAnimator", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPositionAnimator;", "positionAnimator", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPulsingAnimator;", "pulsingAnimator", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAccuracyRadiusAnimator;", "radiusAnimator", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckBearingAnimator;Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPositionAnimator;Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPulsingAnimator;Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAccuracyRadiusAnimator;F)V", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "renderer", "", "setLocationLayerRenderer", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;)V", "Lkotlin/Function1;", "Lcom/mapbox/geojson/Point;", "onLocationUpdated", "", "onBearingUpdated", "onAccuracyRadiusUpdated", "setUpdateListeners", "(Le23/l;Le23/l;Le23/l;)V", "onStart", "()V", "onStop", "", "targets", "Landroid/animation/ValueAnimator;", "options", "animateBearing", "([DLe23/l;)V", "", "animatePosition", "([Lcom/mapbox/geojson/Point;Le23/l;)V", "animateAccuracyRadius", "target", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "settings", "updatePulsingRadius", "(DLcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "applySettings", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "block", "updateBearingAnimator", "(Le23/l;)V", "updatePositionAnimator", "updateAccuracyRadiusAnimator", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckBearingAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPositionAnimator;", "accuracyRadiusAnimator", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAccuracyRadiusAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPulsingAnimator;", "", "value", "getPuckAnimationEnabled$plugin_locationcomponent_release", "()Z", "setPuckAnimationEnabled$plugin_locationcomponent_release", "(Z)V", "puckAnimationEnabled", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PuckAnimatorManager {
    private PuckAccuracyRadiusAnimator accuracyRadiusAnimator;
    private PuckBearingAnimator bearingAnimator;
    private PuckPositionAnimator positionAnimator;
    private PuckPulsingAnimator pulsingAnimator;

    public PuckAnimatorManager(OnIndicatorPositionChangedListener onIndicatorPositionChangedListener, OnIndicatorBearingChangedListener onIndicatorBearingChangedListener, OnIndicatorAccuracyRadiusChangedListener onIndicatorAccuracyRadiusChangedListener, float f14) {
        onIndicatorPositionChangedListener.getClass();
        onIndicatorBearingChangedListener.getClass();
        onIndicatorAccuracyRadiusChangedListener.getClass();
        this.bearingAnimator = new PuckBearingAnimator(onIndicatorBearingChangedListener);
        this.positionAnimator = new PuckPositionAnimator(onIndicatorPositionChangedListener);
        this.accuracyRadiusAnimator = new PuckAccuracyRadiusAnimator(onIndicatorAccuracyRadiusChangedListener);
        this.pulsingAnimator = new PuckPulsingAnimator(f14);
    }

    public final void animateAccuracyRadius(double[] targets, l<? super ValueAnimator, Unit> options) {
        targets.getClass();
        PuckAccuracyRadiusAnimator puckAccuracyRadiusAnimator = this.accuracyRadiusAnimator;
        Double[] dArrU = s.u(targets);
        puckAccuracyRadiusAnimator.animate(Arrays.copyOf(dArrU, dArrU.length), options);
    }

    public final void animateBearing(double[] targets, l<? super ValueAnimator, Unit> options) {
        targets.getClass();
        PuckBearingAnimator puckBearingAnimator = this.bearingAnimator;
        Double[] dArrU = s.u(MathUtils.INSTANCE.prepareOptimalBearingPath(targets));
        puckBearingAnimator.animate(Arrays.copyOf(dArrU, dArrU.length), options);
    }

    public final void animatePosition(Point[] targets, l<? super ValueAnimator, Unit> options) {
        targets.getClass();
        this.positionAnimator.animate(Arrays.copyOf(targets, targets.length), options);
    }

    public final void applySettings(LocationComponentSettings settings) {
        settings.getClass();
        PuckPulsingAnimator puckPulsingAnimator = this.pulsingAnimator;
        puckPulsingAnimator.setEnabled$plugin_locationcomponent_release(settings.getPulsingEnabled());
        puckPulsingAnimator.setMaxRadius(settings.getPulsingMaxRadius());
        puckPulsingAnimator.setPulsingColor(settings.getPulsingColor());
        if (settings.getPulsingEnabled()) {
            puckPulsingAnimator.animateInfinite();
        } else {
            puckPulsingAnimator.cancelRunning();
        }
        PuckAccuracyRadiusAnimator puckAccuracyRadiusAnimator = this.accuracyRadiusAnimator;
        puckAccuracyRadiusAnimator.setEnabled$plugin_locationcomponent_release(settings.getShowAccuracyRing());
        puckAccuracyRadiusAnimator.setAccuracyCircleColor$plugin_locationcomponent_release(settings.getAccuracyRingColor());
        puckAccuracyRadiusAnimator.setAccuracyCircleBorderColor$plugin_locationcomponent_release(settings.getAccuracyRingBorderColor());
    }

    public final boolean getPuckAnimationEnabled$plugin_locationcomponent_release() {
        return this.bearingAnimator.getEnabled();
    }

    public final void onStart() {
        if (this.pulsingAnimator.getEnabled()) {
            this.pulsingAnimator.animateInfinite();
        }
    }

    public final void onStop() {
        this.bearingAnimator.cancelRunning();
        this.positionAnimator.cancelRunning();
        this.pulsingAnimator.cancelRunning();
        this.accuracyRadiusAnimator.cancelRunning();
    }

    public final void setLocationLayerRenderer(LocationLayerRenderer renderer) {
        renderer.getClass();
        this.bearingAnimator.setLocationLayerRenderer(renderer);
        this.positionAnimator.setLocationLayerRenderer(renderer);
        this.pulsingAnimator.setLocationLayerRenderer(renderer);
        this.accuracyRadiusAnimator.setLocationLayerRenderer(renderer);
    }

    public final void setPuckAnimationEnabled$plugin_locationcomponent_release(boolean z14) {
        this.bearingAnimator.setEnabled$plugin_locationcomponent_release(z14);
    }

    public final void setUpdateListeners(l<? super Point, Unit> onLocationUpdated, l<? super Double, Unit> onBearingUpdated, l<? super Double, Unit> onAccuracyRadiusUpdated) {
        onLocationUpdated.getClass();
        onBearingUpdated.getClass();
        onAccuracyRadiusUpdated.getClass();
        this.positionAnimator.setUpdateListener(onLocationUpdated);
        this.bearingAnimator.setUpdateListener(onBearingUpdated);
        this.accuracyRadiusAnimator.setUpdateListener(onAccuracyRadiusUpdated);
    }

    public final void updateAccuracyRadiusAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.accuracyRadiusAnimator.updateOptions(block);
    }

    public final void updateBearingAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.bearingAnimator.updateOptions(block);
    }

    public final void updatePositionAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.positionAnimator.updateOptions(block);
    }

    public final void updatePulsingRadius(double target, LocationComponentSettings settings) {
        settings.getClass();
        PuckPulsingAnimator puckPulsingAnimator = this.pulsingAnimator;
        puckPulsingAnimator.setEnabled$plugin_locationcomponent_release(settings.getPulsingEnabled());
        if (!settings.getPulsingEnabled()) {
            puckPulsingAnimator.cancelRunning();
        } else {
            puckPulsingAnimator.setMaxRadius(target);
            puckPulsingAnimator.animateInfinite();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PuckAnimatorManager(OnIndicatorPositionChangedListener onIndicatorPositionChangedListener, OnIndicatorBearingChangedListener onIndicatorBearingChangedListener, OnIndicatorAccuracyRadiusChangedListener onIndicatorAccuracyRadiusChangedListener, PuckBearingAnimator puckBearingAnimator, PuckPositionAnimator puckPositionAnimator, PuckPulsingAnimator puckPulsingAnimator, PuckAccuracyRadiusAnimator puckAccuracyRadiusAnimator, float f14) {
        this(onIndicatorPositionChangedListener, onIndicatorBearingChangedListener, onIndicatorAccuracyRadiusChangedListener, f14);
        onIndicatorPositionChangedListener.getClass();
        onIndicatorBearingChangedListener.getClass();
        onIndicatorAccuracyRadiusChangedListener.getClass();
        puckBearingAnimator.getClass();
        puckPositionAnimator.getClass();
        puckPulsingAnimator.getClass();
        puckAccuracyRadiusAnimator.getClass();
        this.bearingAnimator = puckBearingAnimator;
        this.positionAnimator = puckPositionAnimator;
        this.pulsingAnimator = puckPulsingAnimator;
        this.accuracyRadiusAnimator = puckAccuracyRadiusAnimator;
    }
}
