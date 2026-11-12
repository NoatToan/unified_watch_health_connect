package com.mapbox.maps.plugin.viewport.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import com.mapbox.maps.plugin.viewport.data.DefaultViewportTransitionOptions;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.MathUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J*\u0010'\u001a\u00020\u0016*\u00020\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0019H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/mapbox/maps/plugin/viewport/transition/DefaultViewportTransitionImpl;", "Lcom/mapbox/maps/plugin/viewport/transition/DefaultViewportTransition;", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "options", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "transitionFactory", "Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;Lcom/mapbox/maps/plugin/viewport/transition/MapboxViewportTransitionFactory;)V", "cachedAnchor", "Lcom/mapbox/maps/ScreenCoordinate;", "cameraDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "cameraPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "getOptions", "()Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "setOptions", "(Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;)V", "runningAnimation", "Landroid/animation/AnimatorSet;", "cancelAnimation", "", "createAnimatorSet", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "maxDurationMs", "", "finishAnimation", "animatorSet", "run", "Lcom/mapbox/common/Cancelable;", "to", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "completionListener", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "startAnimation", "instant", "", "updateTargetCameraOptions", "completedChildAnimators", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "startCamera", "Lcom/mapbox/maps/CameraState;", "targetCamera", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultViewportTransitionImpl implements DefaultViewportTransition {
    private ScreenCoordinate cachedAnchor;
    private final MapCameraManagerDelegate cameraDelegate;
    private final CameraAnimationsPlugin cameraPlugin;
    private DefaultViewportTransitionOptions options;
    private AnimatorSet runningAnimation;
    private final MapboxViewportTransitionFactory transitionFactory;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraAnimatorType.values().length];
            try {
                iArr[CameraAnimatorType.ANCHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraAnimatorType.BEARING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraAnimatorType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraAnimatorType.ZOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraAnimatorType.PITCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CameraAnimatorType.PADDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultViewportTransitionImpl(MapDelegateProvider mapDelegateProvider, DefaultViewportTransitionOptions defaultViewportTransitionOptions, MapboxViewportTransitionFactory mapboxViewportTransitionFactory) {
        mapDelegateProvider.getClass();
        defaultViewportTransitionOptions.getClass();
        mapboxViewportTransitionFactory.getClass();
        this.options = defaultViewportTransitionOptions;
        this.transitionFactory = mapboxViewportTransitionFactory;
        this.cameraPlugin = CameraAnimationsUtils.getCamera(mapDelegateProvider.getMapPluginProviderDelegate());
        this.cameraDelegate = mapDelegateProvider.getMapCameraManagerDelegate();
    }

    private final void cancelAnimation() {
        AnimatorSet animatorSet = this.runningAnimation;
        if (animatorSet != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new DefaultViewportTransitionImpl$cancelAnimation$1$1(animatorSet, this));
            this.runningAnimation = null;
        }
    }

    private final AnimatorSet createAnimatorSet(CameraOptions cameraOptions, long maxDurationMs) {
        double zoom = this.cameraDelegate.getCameraState().getZoom();
        MapboxViewportTransitionFactory mapboxViewportTransitionFactory = this.transitionFactory;
        Double zoom2 = cameraOptions.getZoom();
        if (zoom2 == null) {
            zoom2 = Double.valueOf(zoom);
        }
        return zoom < zoom2.doubleValue() ? mapboxViewportTransitionFactory.transitionFromLowZoomToHighZoom(cameraOptions, maxDurationMs) : mapboxViewportTransitionFactory.transitionFromHighZoomToLowZoom(cameraOptions, maxDurationMs);
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
        this.cameraPlugin.setAnchor(this.cachedAnchor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, android.animation.Animator, android.animation.AnimatorSet] */
    public static final boolean run$lambda$3(r0 r0Var, final DefaultViewportTransitionImpl defaultViewportTransitionImpl, final Set set, CameraState cameraState, m0 m0Var, final m0 m0Var2, final CompletionListener completionListener, CameraOptions cameraOptions) {
        Unit unit;
        final m0 m0Var3;
        r0Var.getClass();
        defaultViewportTransitionImpl.getClass();
        set.getClass();
        cameraState.getClass();
        m0Var.getClass();
        m0Var2.getClass();
        completionListener.getClass();
        cameraOptions.getClass();
        AnimatorSet animatorSet = (AnimatorSet) r0Var.f105810a;
        if (animatorSet != null) {
            defaultViewportTransitionImpl.updateTargetCameraOptions(animatorSet, set, cameraState, cameraOptions);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            final ?? CreateAnimatorSet = defaultViewportTransitionImpl.createAnimatorSet(cameraOptions, defaultViewportTransitionImpl.getOptions().getMaxDurationMs());
            m0Var3 = m0Var;
            CreateAnimatorSet.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransitionImpl$run$cancelable$1$1$initialAnimatorSet$1$1
                private boolean isCanceled;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    animation.getClass();
                    this.isCanceled = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    animation.getClass();
                    m0Var3.f105804a = false;
                    if (!m0Var2.f105804a) {
                        completionListener.onComplete(!this.isCanceled);
                    }
                    defaultViewportTransitionImpl.finishAnimation(CreateAnimatorSet);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    animation.getClass();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    animation.getClass();
                }
            });
            ArrayList<Animator> childAnimations = CreateAnimatorSet.getChildAnimations();
            childAnimations.getClass();
            for (Animator animator : childAnimations) {
                animator.getClass();
                final CameraAnimator cameraAnimator = (CameraAnimator) animator;
                cameraAnimator.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransitionImpl$run$cancelable$1$1$1$1
                    private boolean isCanceled;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator p14) {
                        p14.getClass();
                        this.isCanceled = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator p14) {
                        p14.getClass();
                        if (this.isCanceled) {
                            return;
                        }
                        set.add(cameraAnimator.getType());
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator p14) {
                        p14.getClass();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator p14) {
                        p14.getClass();
                    }
                });
            }
            defaultViewportTransitionImpl.startAnimation(CreateAnimatorSet, false);
            r0Var.f105810a = CreateAnimatorSet;
        } else {
            m0Var3 = m0Var;
        }
        return m0Var3.f105804a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$4(m0 m0Var, m0 m0Var2, DefaultViewportTransitionImpl defaultViewportTransitionImpl, Cancelable cancelable) {
        m0Var.getClass();
        m0Var2.getClass();
        defaultViewportTransitionImpl.getClass();
        cancelable.getClass();
        m0Var.f105804a = true;
        m0Var2.f105804a = false;
        defaultViewportTransitionImpl.cancelAnimation();
        cancelable.cancel();
    }

    private final void startAnimation(AnimatorSet animatorSet, boolean instant) {
        cancelAnimation();
        this.cachedAnchor = this.cameraPlugin.getAnchor();
        this.cameraPlugin.setAnchor(null);
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
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass2(animatorSet, this));
    }

    private final void updateTargetCameraOptions(AnimatorSet animatorSet, Set<? extends CameraAnimatorType> set, CameraState cameraState, CameraOptions cameraOptions) {
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        for (Animator animator : childAnimations) {
            animator.getClass();
            CameraAnimator cameraAnimator = (CameraAnimator) animator;
            switch (WhenMappings.$EnumSwitchMapping$0[cameraAnimator.getType().ordinal()]) {
                case 2:
                    if (set.contains(CameraAnimatorType.BEARING)) {
                        MapCameraManagerDelegate mapCameraManagerDelegate = this.cameraDelegate;
                        CameraOptions.Builder builder = new CameraOptions.Builder();
                        builder.bearing(cameraOptions.getBearing());
                        CameraOptions cameraOptionsBuild = builder.build();
                        cameraOptionsBuild.getClass();
                        mapCameraManagerDelegate.setCamera(cameraOptionsBuild);
                    } else {
                        Double bearing = cameraOptions.getBearing();
                        if (bearing != null) {
                            Double[] dArrU = p13.s.u(MathUtils.INSTANCE.prepareOptimalBearingPath(new double[]{cameraState.getBearing(), bearing.doubleValue()}));
                            cameraAnimator.setObjectValues(Arrays.copyOf(dArrU, dArrU.length));
                        }
                    }
                    break;
                case 3:
                    if (set.contains(CameraAnimatorType.CENTER)) {
                        MapCameraManagerDelegate mapCameraManagerDelegate2 = this.cameraDelegate;
                        CameraOptions.Builder builder2 = new CameraOptions.Builder();
                        builder2.center(cameraOptions.getCenter());
                        CameraOptions cameraOptionsBuild2 = builder2.build();
                        cameraOptionsBuild2.getClass();
                        mapCameraManagerDelegate2.setCamera(cameraOptionsBuild2);
                    } else {
                        cameraAnimator.setObjectValues(cameraState.getCenter(), cameraOptions.getCenter());
                    }
                    break;
                case 4:
                    if (set.contains(CameraAnimatorType.ZOOM)) {
                        MapCameraManagerDelegate mapCameraManagerDelegate3 = this.cameraDelegate;
                        CameraOptions.Builder builder3 = new CameraOptions.Builder();
                        builder3.zoom(cameraOptions.getZoom());
                        CameraOptions cameraOptionsBuild3 = builder3.build();
                        cameraOptionsBuild3.getClass();
                        mapCameraManagerDelegate3.setCamera(cameraOptionsBuild3);
                    } else {
                        cameraAnimator.setObjectValues(Double.valueOf(cameraState.getZoom()), cameraOptions.getZoom());
                    }
                    break;
                case 5:
                    if (set.contains(CameraAnimatorType.PITCH)) {
                        MapCameraManagerDelegate mapCameraManagerDelegate4 = this.cameraDelegate;
                        CameraOptions.Builder builder4 = new CameraOptions.Builder();
                        builder4.pitch(cameraOptions.getPitch());
                        CameraOptions cameraOptionsBuild4 = builder4.build();
                        cameraOptionsBuild4.getClass();
                        mapCameraManagerDelegate4.setCamera(cameraOptionsBuild4);
                    } else {
                        cameraAnimator.setObjectValues(Double.valueOf(cameraState.getPitch()), cameraOptions.getPitch());
                    }
                    break;
                case 6:
                    if (set.contains(CameraAnimatorType.PADDING)) {
                        MapCameraManagerDelegate mapCameraManagerDelegate5 = this.cameraDelegate;
                        CameraOptions.Builder builder5 = new CameraOptions.Builder();
                        builder5.padding(cameraOptions.getPadding());
                        CameraOptions cameraOptionsBuild5 = builder5.build();
                        cameraOptionsBuild5.getClass();
                        mapCameraManagerDelegate5.setCamera(cameraOptionsBuild5);
                    } else {
                        cameraAnimator.setObjectValues(cameraState.getPadding(), cameraOptions.getPadding());
                    }
                    break;
            }
        }
    }

    @Override // com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransition
    public DefaultViewportTransitionOptions getOptions() {
        return this.options;
    }

    @Override // com.mapbox.maps.plugin.viewport.transition.ViewportTransition
    public Cancelable run(ViewportState to3, final CompletionListener completionListener) {
        to3.getClass();
        completionListener.getClass();
        final m0 m0Var = new m0();
        final r0 r0Var = new r0();
        final CameraState cameraState = this.cameraDelegate.getCameraState();
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final m0 m0Var2 = new m0();
        m0Var2.f105804a = true;
        final Cancelable cancelableObserveDataSource = to3.observeDataSource(new ViewportStateDataObserver() { // from class: com.mapbox.maps.plugin.viewport.transition.a
            @Override // com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver
            public final boolean onNewData(CameraOptions cameraOptions) {
                return DefaultViewportTransitionImpl.run$lambda$3(r0Var, this, linkedHashSet, cameraState, m0Var2, m0Var, completionListener, cameraOptions);
            }
        });
        return new Cancelable() { // from class: com.mapbox.maps.plugin.viewport.transition.b
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                DefaultViewportTransitionImpl.run$lambda$4(m0Var, m0Var2, this, cancelableObserveDataSource);
            }
        };
    }

    @Override // com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransition
    public void setOptions(DefaultViewportTransitionOptions defaultViewportTransitionOptions) {
        defaultViewportTransitionOptions.getClass();
        this.options = defaultViewportTransitionOptions;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransitionImpl$startAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.a<Unit> {
        final /* synthetic */ AnimatorSet $animatorSet;
        final /* synthetic */ DefaultViewportTransitionImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnimatorSet animatorSet, DefaultViewportTransitionImpl defaultViewportTransitionImpl) {
            super(0);
            this.$animatorSet = animatorSet;
            this.this$0 = defaultViewportTransitionImpl;
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

    public /* synthetic */ DefaultViewportTransitionImpl(MapDelegateProvider mapDelegateProvider, DefaultViewportTransitionOptions defaultViewportTransitionOptions, MapboxViewportTransitionFactory mapboxViewportTransitionFactory, int i14, j jVar) {
        this(mapDelegateProvider, defaultViewportTransitionOptions, (i14 & 4) != 0 ? new MapboxViewportTransitionFactory(mapDelegateProvider) : mapboxViewportTransitionFactory);
    }
}
