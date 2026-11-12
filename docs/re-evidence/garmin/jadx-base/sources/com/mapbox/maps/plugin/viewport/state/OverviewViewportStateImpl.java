package com.mapbox.maps.plugin.viewport.state;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.core.view.j;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.i;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.viewport.data.OverviewViewportStateOptions;
import com.mapbox.maps.plugin.viewport.transition.MapboxViewportTransitionFactory;
import com.mapbox.maps.threading.AnimationThreadController;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.j0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00102\u001a\b\u0012\u0004\u0012\u00020$018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010\f\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u00109\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR*\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/state/OverviewViewportStateImpl;", "Lcom/mapbox/maps/plugin/viewport/state/OverviewViewportState;", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "mapDelegateProvider", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "initialOptions", "Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;", "transitionFactory", "<init>", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;)V", "", "handleNewData", "()V", "Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions;", "callback", "Lcom/mapbox/common/Cancelable;", "evaluateViewportData", "(Le23/l;)Lcom/mapbox/common/Cancelable;", "cancelAnimation", "Landroid/animation/AnimatorSet;", "animatorSet", "", "instant", "startAnimation", "(Landroid/animation/AnimatorSet;Z)V", "finishAnimation", "(Landroid/animation/AnimatorSet;)V", "cameraOptions", "updateFrame", "(Lcom/mapbox/maps/CameraOptions;Z)V", "Lcom/mapbox/geojson/Geometry;", "", "Lcom/mapbox/geojson/Point;", "extractCoordinates", "(Lcom/mapbox/geojson/Geometry;)Ljava/util/List;", "Lcom/mapbox/maps/plugin/viewport/state/ViewportStateDataObserver;", "viewportStateDataObserver", "observeDataSource", "(Lcom/mapbox/maps/plugin/viewport/state/ViewportStateDataObserver;)Lcom/mapbox/common/Cancelable;", "startUpdatingCamera", "stopUpdatingCamera", "Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "cameraPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "cameraDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "dataSourceUpdateObservers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getDataSourceUpdateObservers$plugin_viewport_release", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "getDataSourceUpdateObservers$plugin_viewport_release$annotations", "runningAnimation", "Landroid/animation/AnimatorSet;", "isOverviewStateRunning", "Z", "isOverviewStateRunning$plugin_viewport_release", "()Z", "setOverviewStateRunning$plugin_viewport_release", "(Z)V", "isOverviewStateRunning$plugin_viewport_release$annotations", "evaluateViewportDataCancelable", "Lcom/mapbox/common/Cancelable;", "latestViewportData", "Lcom/mapbox/maps/CameraOptions;", "value", "options", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "getOptions", "()Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "setOptions", "(Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;)V", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OverviewViewportStateImpl implements OverviewViewportState {
    private final MapCameraManagerDelegate cameraDelegate;
    private final CameraAnimationsPlugin cameraPlugin;
    private final CopyOnWriteArraySet<ViewportStateDataObserver> dataSourceUpdateObservers;
    private Cancelable evaluateViewportDataCancelable;
    private boolean isOverviewStateRunning;
    private CameraOptions latestViewportData;
    private OverviewViewportStateOptions options;
    private AnimatorSet runningAnimation;
    private final MapboxViewportTransitionFactory transitionFactory;

    public OverviewViewportStateImpl(MapDelegateProvider mapDelegateProvider, OverviewViewportStateOptions overviewViewportStateOptions, MapboxViewportTransitionFactory mapboxViewportTransitionFactory) {
        mapDelegateProvider.getClass();
        overviewViewportStateOptions.getClass();
        mapboxViewportTransitionFactory.getClass();
        this.transitionFactory = mapboxViewportTransitionFactory;
        this.cameraPlugin = CameraAnimationsUtils.getCamera(mapDelegateProvider.getMapPluginProviderDelegate());
        this.cameraDelegate = mapDelegateProvider.getMapCameraManagerDelegate();
        this.dataSourceUpdateObservers = new CopyOnWriteArraySet<>();
        this.options = overviewViewportStateOptions;
        handleNewData();
    }

    private final void cancelAnimation() {
        AnimatorSet animatorSet = this.runningAnimation;
        if (animatorSet != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new OverviewViewportStateImpl$cancelAnimation$1$1(animatorSet, this));
            this.runningAnimation = null;
        }
    }

    private final Cancelable evaluateViewportData(l<? super CameraOptions, Unit> callback) {
        m0 m0Var = new m0();
        MapCameraManagerDelegate mapCameraManagerDelegate = this.cameraDelegate;
        List<Point> listExtractCoordinates = extractCoordinates(getOptions().getGeometry());
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.padding(getOptions().getPadding());
        builder.bearing(getOptions().getBearing());
        builder.pitch(getOptions().getPitch());
        Unit unit = Unit.INSTANCE;
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        mapCameraManagerDelegate.cameraForCoordinates(listExtractCoordinates, cameraOptionsBuild, getOptions().getGeometryPadding(), getOptions().getMaxZoom(), getOptions().getOffset(), new AnonymousClass2(m0Var, callback));
        return new com.mapbox.maps.plugin.viewport.a(m0Var, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateViewportData$lambda$1(m0 m0Var) {
        m0Var.getClass();
        m0Var.f105804a = true;
    }

    private final List<Point> extractCoordinates(Geometry geometry) {
        if (geometry instanceof Point) {
            return w.c(geometry);
        }
        if (geometry instanceof LineString) {
            List<Point> listCoordinates2 = ((LineString) geometry).coordinates();
            listCoordinates2.getClass();
            return listCoordinates2;
        }
        if (geometry instanceof Polygon) {
            List<List<Point>> listCoordinates3 = ((Polygon) geometry).coordinates();
            listCoordinates3.getClass();
            return y.s(listCoordinates3);
        }
        if (geometry instanceof MultiPoint) {
            List<Point> listCoordinates4 = ((MultiPoint) geometry).coordinates();
            listCoordinates4.getClass();
            return listCoordinates4;
        }
        if (geometry instanceof MultiLineString) {
            List<List<Point>> listCoordinates5 = ((MultiLineString) geometry).coordinates();
            listCoordinates5.getClass();
            return y.s(listCoordinates5);
        }
        if (geometry instanceof MultiPolygon) {
            List<List<List<Point>>> listCoordinates6 = ((MultiPolygon) geometry).coordinates();
            listCoordinates6.getClass();
            return y.s(y.s(listCoordinates6));
        }
        if (!(geometry instanceof GeometryCollection)) {
            return j0.f134944a;
        }
        List<Geometry> listGeometries = ((GeometryCollection) geometry).geometries();
        ArrayList arrayListL = j.l(listGeometries);
        for (Geometry geometry2 : listGeometries) {
            geometry2.getClass();
            d0.v(arrayListL, extractCoordinates(geometry2));
        }
        return arrayListL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAnimation(AnimatorSet animatorSet) {
        ArrayList<Animator> childAnimations;
        if (animatorSet != null && (childAnimations = animatorSet.getChildAnimations()) != null) {
            for (Animator animator : childAnimations) {
                CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
                animator.getClass();
                CameraAnimationsPlugin.DefaultImpls.unregisterAnimators$default(cameraAnimationsPlugin, new ValueAnimator[]{(ValueAnimator) animator}, false, 2, null);
            }
        }
        if (s.g(this.runningAnimation, animatorSet)) {
            this.runningAnimation = null;
        }
    }

    public static /* synthetic */ void getDataSourceUpdateObservers$plugin_viewport_release$annotations() {
    }

    private final void handleNewData() {
        this.latestViewportData = null;
        Cancelable cancelable = this.evaluateViewportDataCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.evaluateViewportDataCancelable = evaluateViewportData(new AnonymousClass1());
    }

    public static /* synthetic */ void isOverviewStateRunning$plugin_viewport_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDataSource$lambda$3(OverviewViewportStateImpl overviewViewportStateImpl, ViewportStateDataObserver viewportStateDataObserver) {
        overviewViewportStateImpl.getClass();
        viewportStateDataObserver.getClass();
        overviewViewportStateImpl.dataSourceUpdateObservers.remove(viewportStateDataObserver);
    }

    private final void startAnimation(AnimatorSet animatorSet, boolean instant) {
        cancelAnimation();
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        for (Animator animator : childAnimations) {
            CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
            animator.getClass();
            cameraAnimationsPlugin.registerAnimators((ValueAnimator) animator);
        }
        if (instant) {
            animatorSet.setDuration(0L);
        }
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C42472(animatorSet, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFrame(CameraOptions cameraOptions, boolean instant) {
        final AnimatorSet animatorSetTransitionLinear = this.transitionFactory.transitionLinear(cameraOptions, getOptions().getAnimationDurationMs());
        animatorSetTransitionLinear.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl$updateFrame$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                this.this$0.finishAnimation(animatorSetTransitionLinear);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        });
        startAnimation(animatorSetTransitionLinear, instant);
    }

    public static /* synthetic */ void updateFrame$default(OverviewViewportStateImpl overviewViewportStateImpl, CameraOptions cameraOptions, boolean z14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        overviewViewportStateImpl.updateFrame(cameraOptions, z14);
    }

    public final CopyOnWriteArraySet<ViewportStateDataObserver> getDataSourceUpdateObservers$plugin_viewport_release() {
        return this.dataSourceUpdateObservers;
    }

    @Override // com.mapbox.maps.plugin.viewport.state.OverviewViewportState
    public OverviewViewportStateOptions getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: isOverviewStateRunning$plugin_viewport_release, reason: from getter */
    public final boolean getIsOverviewStateRunning() {
        return this.isOverviewStateRunning;
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public Cancelable observeDataSource(ViewportStateDataObserver viewportStateDataObserver) {
        viewportStateDataObserver.getClass();
        CameraOptions cameraOptions = this.latestViewportData;
        if (cameraOptions == null || viewportStateDataObserver.onNewData(cameraOptions)) {
            this.dataSourceUpdateObservers.add(viewportStateDataObserver);
        }
        return new i(2, this, viewportStateDataObserver);
    }

    @Override // com.mapbox.maps.plugin.viewport.state.OverviewViewportState
    public void setOptions(OverviewViewportStateOptions overviewViewportStateOptions) {
        overviewViewportStateOptions.getClass();
        this.options = overviewViewportStateOptions;
        handleNewData();
    }

    public final void setOverviewStateRunning$plugin_viewport_release(boolean z14) {
        this.isOverviewStateRunning = z14;
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public void startUpdatingCamera() {
        this.isOverviewStateRunning = true;
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public void stopUpdatingCamera() {
        this.isOverviewStateRunning = false;
        cancelAnimation();
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl$startAnimation$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42472 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        final /* synthetic */ AnimatorSet $animatorSet;
        final /* synthetic */ OverviewViewportStateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42472(AnimatorSet animatorSet, OverviewViewportStateImpl overviewViewportStateImpl) {
            super(0);
            this.$animatorSet = animatorSet;
            this.this$0 = overviewViewportStateImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$animatorSet.start();
            this.this$0.runningAnimation = this.$animatorSet;
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl$evaluateViewportData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/CameraOptions;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends p005kotlin.jvm.internal.w implements l<CameraOptions, Unit> {
        final /* synthetic */ l<CameraOptions, Unit> $callback;
        final /* synthetic */ m0 $cancelled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(m0 m0Var, l<? super CameraOptions, Unit> lVar) {
            super(1);
            this.$cancelled = m0Var;
            this.$callback = lVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraOptions cameraOptions) {
            cameraOptions.getClass();
            if (this.$cancelled.f105804a) {
                return;
            }
            this.$callback.invoke(cameraOptions);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
            invoke2(cameraOptions);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OverviewViewportStateImpl(MapDelegateProvider mapDelegateProvider, OverviewViewportStateOptions overviewViewportStateOptions, MapboxViewportTransitionFactory mapboxViewportTransitionFactory, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mapDelegateProvider, overviewViewportStateOptions, (i14 & 4) != 0 ? new MapboxViewportTransitionFactory(mapDelegateProvider) : mapboxViewportTransitionFactory);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl$handleNewData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements l<CameraOptions, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraOptions cameraOptions) {
            cameraOptions.getClass();
            OverviewViewportStateImpl.this.latestViewportData = cameraOptions;
            if (OverviewViewportStateImpl.this.getIsOverviewStateRunning()) {
                OverviewViewportStateImpl.this.updateFrame(cameraOptions, false);
            }
            CopyOnWriteArraySet<ViewportStateDataObserver> dataSourceUpdateObservers$plugin_viewport_release = OverviewViewportStateImpl.this.getDataSourceUpdateObservers$plugin_viewport_release();
            OverviewViewportStateImpl overviewViewportStateImpl = OverviewViewportStateImpl.this;
            for (ViewportStateDataObserver viewportStateDataObserver : dataSourceUpdateObservers$plugin_viewport_release) {
                if (!viewportStateDataObserver.onNewData(cameraOptions)) {
                    overviewViewportStateImpl.getDataSourceUpdateObservers$plugin_viewport_release().remove(viewportStateDataObserver);
                }
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
            invoke2(cameraOptions);
            return Unit.INSTANCE;
        }
    }
}
