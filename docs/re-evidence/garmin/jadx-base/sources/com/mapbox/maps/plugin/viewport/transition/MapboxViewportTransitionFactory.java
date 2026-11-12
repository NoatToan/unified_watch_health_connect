package com.mapbox.maps.plugin.viewport.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.viewport.ViewportPluginImpl;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\u0016\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;", "", "mapDelegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "cameraManager", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "cameraPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "createBearingAnimator", "Landroid/animation/Animator;", "rotation", "", "startDelay", "", "duration", "interpolator", "Landroid/view/animation/Interpolator;", "createCenterAnimator", TtmlNode.CENTER, "Lcom/mapbox/geojson/Point;", "createPaddingAnimator", "padding", "Lcom/mapbox/maps/EdgeInsets;", "createPitchAnimator", "pitch", "createZoomAnimator", "zoom", "transitionFromHighZoomToLowZoom", "Landroid/animation/AnimatorSet;", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "transitionMaxDurationMs", "transitionFromLowZoomToHighZoom", "transitionLinear", "transitionDurationMs", "Companion", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxViewportTransitionFactory {

    @Deprecated
    private static final long LINEAR_ANIMATION_DURATION_MS = 1000;

    @Deprecated
    private static final long MAXIMUM_LOW_TO_HIGH_DURATION_MS = 3000;
    private final MapCameraManagerDelegate cameraManager;
    private final CameraAnimationsPlugin cameraPlugin;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Interpolator LINEAR_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);

    @Deprecated
    private static final Interpolator SLOW_OUT_SLOW_IN_INTERPOLATOR = new PathInterpolator(0.4f, 0.0f, 0.4f, 1.0f);

    public MapboxViewportTransitionFactory(MapDelegateProvider mapDelegateProvider) {
        mapDelegateProvider.getClass();
        this.cameraManager = mapDelegateProvider.getMapCameraManagerDelegate();
        this.cameraPlugin = CameraAnimationsUtils.getCamera(mapDelegateProvider.getMapPluginProviderDelegate());
    }

    private final Animator createBearingAnimator(double rotation, long startDelay, long duration, Interpolator interpolator) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(rotation)}, 1));
        builder.owner(ViewportPluginImpl.VIEWPORT_CAMERA_OWNER);
        return CameraAnimationsPlugin.DefaultImpls.createBearingAnimator$default(cameraAnimationsPlugin, builder.build(), false, new AnonymousClass2(startDelay, duration, interpolator), 2, null);
    }

    public static /* synthetic */ Animator createBearingAnimator$default(MapboxViewportTransitionFactory mapboxViewportTransitionFactory, double d14, long j8, long j14, Interpolator interpolator, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        return mapboxViewportTransitionFactory.createBearingAnimator(d14, j8, j14, (i14 & 8) != 0 ? SLOW_OUT_SLOW_IN_INTERPOLATOR : interpolator);
    }

    private final Animator createCenterAnimator(Point center, long startDelay, long duration, Interpolator interpolator) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Point[]{center}, 1));
        builder.owner(ViewportPluginImpl.VIEWPORT_CAMERA_OWNER);
        return cameraAnimationsPlugin.createCenterAnimator(builder.build(), true, new C42482(startDelay, duration, interpolator));
    }

    public static /* synthetic */ Animator createCenterAnimator$default(MapboxViewportTransitionFactory mapboxViewportTransitionFactory, Point point, long j8, long j14, Interpolator interpolator, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        long j15 = j8;
        if ((i14 & 8) != 0) {
            interpolator = SLOW_OUT_SLOW_IN_INTERPOLATOR;
        }
        return mapboxViewportTransitionFactory.createCenterAnimator(point, j15, j14, interpolator);
    }

    private final Animator createPaddingAnimator(EdgeInsets padding, long startDelay, long duration, Interpolator interpolator) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new EdgeInsets[]{padding}, 1));
        builder.owner(ViewportPluginImpl.VIEWPORT_CAMERA_OWNER);
        return cameraAnimationsPlugin.createPaddingAnimator(builder.build(), new C42492(startDelay, duration, interpolator));
    }

    public static /* synthetic */ Animator createPaddingAnimator$default(MapboxViewportTransitionFactory mapboxViewportTransitionFactory, EdgeInsets edgeInsets, long j8, long j14, Interpolator interpolator, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        long j15 = j8;
        if ((i14 & 8) != 0) {
            interpolator = SLOW_OUT_SLOW_IN_INTERPOLATOR;
        }
        return mapboxViewportTransitionFactory.createPaddingAnimator(edgeInsets, j15, j14, interpolator);
    }

    private final Animator createPitchAnimator(double pitch, long startDelay, long duration, Interpolator interpolator) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(pitch)}, 1));
        builder.owner(ViewportPluginImpl.VIEWPORT_CAMERA_OWNER);
        return cameraAnimationsPlugin.createPitchAnimator(builder.build(), new C42502(startDelay, duration, interpolator));
    }

    public static /* synthetic */ Animator createPitchAnimator$default(MapboxViewportTransitionFactory mapboxViewportTransitionFactory, double d14, long j8, long j14, Interpolator interpolator, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        return mapboxViewportTransitionFactory.createPitchAnimator(d14, j8, j14, (i14 & 8) != 0 ? SLOW_OUT_SLOW_IN_INTERPOLATOR : interpolator);
    }

    private final Animator createZoomAnimator(double zoom, long startDelay, long duration, Interpolator interpolator) {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(zoom)}, 1));
        builder.owner(ViewportPluginImpl.VIEWPORT_CAMERA_OWNER);
        return cameraAnimationsPlugin.createZoomAnimator(builder.build(), new C42512(startDelay, duration, interpolator));
    }

    public static /* synthetic */ Animator createZoomAnimator$default(MapboxViewportTransitionFactory mapboxViewportTransitionFactory, double d14, long j8, long j14, Interpolator interpolator, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            j8 = 0;
        }
        return mapboxViewportTransitionFactory.createZoomAnimator(d14, j8, j14, (i14 & 8) != 0 ? SLOW_OUT_SLOW_IN_INTERPOLATOR : interpolator);
    }

    public final AnimatorSet transitionFromHighZoomToLowZoom(CameraOptions cameraOptions, long transitionMaxDurationMs) {
        cameraOptions.getClass();
        ArrayList arrayList = new ArrayList();
        CameraState cameraState = this.cameraManager.getCameraState();
        Point center = cameraOptions.getCenter();
        if (center != null) {
            arrayList.add(createCenterAnimator$default(this, center, 800L, 1000L, null, 8, null));
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            arrayList.add(createZoomAnimator$default(this, zoom.doubleValue(), 0L, 1800L, null, 10, null));
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            arrayList.add(createBearingAnimator$default(this, TransitionUtilsKt.normalizeBearing(cameraState.getBearing(), bearing.doubleValue()), 600L, 1200L, null, 8, null));
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            arrayList.add(createPitchAnimator$default(this, pitch.doubleValue(), 0L, 1000L, null, 10, null));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            arrayList.add(createPaddingAnimator$default(this, padding, 0L, 1200L, null, 10, null));
        }
        return TransitionUtilsKt.constrainDurationTo(TransitionUtilsKt.createAnimatorSet(arrayList), transitionMaxDurationMs);
    }

    public final AnimatorSet transitionFromLowZoomToHighZoom(CameraOptions cameraOptions, long transitionMaxDurationMs) {
        long j8;
        long j14;
        long j15;
        cameraOptions.getClass();
        ArrayList arrayList = new ArrayList();
        CameraState cameraState = this.cameraManager.getCameraState();
        Point center = cameraOptions.getCenter();
        if (center != null) {
            MapCameraManagerDelegate mapCameraManagerDelegate = this.cameraManager;
            Point center2 = cameraState.getCenter();
            center2.getClass();
            long jScreenDistanceFromMapCenterToTarget = (long) ((TransitionUtilsKt.screenDistanceFromMapCenterToTarget(mapCameraManagerDelegate, center2, center) / 500) * 1000);
            j8 = jScreenDistanceFromMapCenterToTarget > 3000 ? 3000L : jScreenDistanceFromMapCenterToTarget;
            arrayList.add(createCenterAnimator$default(this, center, 0L, j8, null, 10, null));
        } else {
            j8 = 0;
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            long j16 = j8 / 2;
            long jAbs = (long) ((Math.abs(zoom.doubleValue() - cameraState.getZoom()) / 2.2d) * 1000);
            long j17 = jAbs > 3000 ? 3000L : jAbs;
            arrayList.add(createZoomAnimator$default(this, zoom.doubleValue(), j16, j17, null, 8, null));
            j14 = j16;
            j15 = j17;
        } else {
            j14 = 0;
            j15 = 0;
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            long j18 = (j14 + j15) - 1800;
            arrayList.add(createBearingAnimator$default(this, TransitionUtilsKt.normalizeBearing(cameraState.getBearing(), bearing.doubleValue()), j18 < 0 ? 0L : j18, 1800L, null, 8, null));
        }
        long j19 = (j14 + j15) - 1100;
        long j24 = j19 < 0 ? 0L : j19;
        Double pitch = cameraOptions.getPitch();
        long j25 = 1200;
        if (pitch != null) {
            long j26 = j24;
            j24 = j26;
            j25 = 1200;
            arrayList.add(createPitchAnimator$default(this, pitch.doubleValue(), j26, 1200L, null, 8, null));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            arrayList.add(createPaddingAnimator$default(this, padding, j24, j25, null, 8, null));
        }
        return TransitionUtilsKt.constrainDurationTo(TransitionUtilsKt.createAnimatorSet(arrayList), transitionMaxDurationMs);
    }

    public final AnimatorSet transitionLinear(CameraOptions cameraOptions, long transitionDurationMs) {
        cameraOptions.getClass();
        ArrayList arrayList = new ArrayList();
        CameraState cameraState = this.cameraManager.getCameraState();
        Point center = cameraOptions.getCenter();
        if (center != null) {
            arrayList.add(createCenterAnimator$default(this, center, 0L, transitionDurationMs, LINEAR_INTERPOLATOR, 2, null));
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            arrayList.add(createZoomAnimator$default(this, zoom.doubleValue(), 0L, transitionDurationMs, LINEAR_INTERPOLATOR, 2, null));
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            arrayList.add(createBearingAnimator$default(this, TransitionUtilsKt.normalizeBearing(cameraState.getBearing(), bearing.doubleValue()), 0L, 1000L, LINEAR_INTERPOLATOR, 2, null));
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            arrayList.add(createPitchAnimator$default(this, pitch.doubleValue(), 0L, transitionDurationMs, LINEAR_INTERPOLATOR, 2, null));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            arrayList.add(createPaddingAnimator$default(this, padding, 0L, transitionDurationMs, LINEAR_INTERPOLATOR, 2, null));
        }
        return TransitionUtilsKt.createAnimatorSet(arrayList);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory$Companion;", "", "()V", "LINEAR_ANIMATION_DURATION_MS", "", "LINEAR_INTERPOLATOR", "Landroid/view/animation/Interpolator;", "MAXIMUM_LOW_TO_HIGH_DURATION_MS", "SLOW_OUT_SLOW_IN_INTERPOLATOR", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory$createBearingAnimator$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<ValueAnimator, Unit> {
        final /* synthetic */ long $duration;
        final /* synthetic */ Interpolator $interpolator;
        final /* synthetic */ long $startDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j8, long j14, Interpolator interpolator) {
            super(1);
            this.$startDelay = j8;
            this.$duration = j14;
            this.$interpolator = interpolator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setStartDelay(this.$startDelay);
            valueAnimator.setDuration(this.$duration);
            valueAnimator.setInterpolator(this.$interpolator);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory$createCenterAnimator$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42482 extends w implements l<ValueAnimator, Unit> {
        final /* synthetic */ long $duration;
        final /* synthetic */ Interpolator $interpolator;
        final /* synthetic */ long $startDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42482(long j8, long j14, Interpolator interpolator) {
            super(1);
            this.$startDelay = j8;
            this.$duration = j14;
            this.$interpolator = interpolator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setStartDelay(this.$startDelay);
            valueAnimator.setDuration(this.$duration);
            valueAnimator.setInterpolator(this.$interpolator);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory$createPaddingAnimator$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42492 extends w implements l<ValueAnimator, Unit> {
        final /* synthetic */ long $duration;
        final /* synthetic */ Interpolator $interpolator;
        final /* synthetic */ long $startDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42492(long j8, long j14, Interpolator interpolator) {
            super(1);
            this.$startDelay = j8;
            this.$duration = j14;
            this.$interpolator = interpolator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setStartDelay(this.$startDelay);
            valueAnimator.setDuration(this.$duration);
            valueAnimator.setInterpolator(this.$interpolator);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory$createPitchAnimator$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42502 extends w implements l<ValueAnimator, Unit> {
        final /* synthetic */ long $duration;
        final /* synthetic */ Interpolator $interpolator;
        final /* synthetic */ long $startDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42502(long j8, long j14, Interpolator interpolator) {
            super(1);
            this.$startDelay = j8;
            this.$duration = j14;
            this.$interpolator = interpolator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setStartDelay(this.$startDelay);
            valueAnimator.setDuration(this.$duration);
            valueAnimator.setInterpolator(this.$interpolator);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory$createZoomAnimator$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42512 extends w implements l<ValueAnimator, Unit> {
        final /* synthetic */ long $duration;
        final /* synthetic */ Interpolator $interpolator;
        final /* synthetic */ long $startDelay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42512(long j8, long j14, Interpolator interpolator) {
            super(1);
            this.$startDelay = j8;
            this.$duration = j14;
            this.$interpolator = interpolator;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setStartDelay(this.$startDelay);
            valueAnimator.setDuration(this.$duration);
            valueAnimator.setInterpolator(this.$interpolator);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }
}
