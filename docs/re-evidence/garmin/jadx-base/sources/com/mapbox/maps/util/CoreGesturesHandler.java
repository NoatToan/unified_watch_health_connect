package com.mapbox.maps.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.threading.AnimationThreadController;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/util/CoreGesturesHandler;", "", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "(Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;)V", "cachedCenterAltitudeMode", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "coreGestureAnimatorHandler", "Landroid/animation/AnimatorListenerAdapter;", "getCoreGestureAnimatorHandler", "()Landroid/animation/AnimatorListenerAdapter;", "gestureAnimationStarted", "", "gestureStarted", "isSetCenterAltitudeModeNeeded", "notifyCoreGestureStarted", "", "notifyCoreTouchEnded", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CoreGesturesHandler {
    private MapCenterAltitudeMode cachedCenterAltitudeMode;
    private final AnimatorListenerAdapter coreGestureAnimatorHandler;
    private boolean gestureAnimationStarted;
    private boolean gestureStarted;
    private final MapCameraManagerDelegate mapCameraManagerDelegate;
    private final MapTransformDelegate mapTransformDelegate;

    public CoreGesturesHandler(MapTransformDelegate mapTransformDelegate, MapCameraManagerDelegate mapCameraManagerDelegate) {
        mapTransformDelegate.getClass();
        mapCameraManagerDelegate.getClass();
        this.mapTransformDelegate = mapTransformDelegate;
        this.mapCameraManagerDelegate = mapCameraManagerDelegate;
        this.cachedCenterAltitudeMode = mapCameraManagerDelegate.getCenterAltitudeMode();
        this.coreGestureAnimatorHandler = new AnimatorListenerAdapter() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.getClass();
                super.onAnimationEnd(animation);
                AnimationThreadController.INSTANCE.postOnMainThread(new CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1(this.this$0));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                animation.getClass();
                super.onAnimationStart(animation);
                AnimationThreadController.INSTANCE.postOnMainThread(new CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationStart$1(this.this$0));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetCenterAltitudeModeNeeded() {
        return this.cachedCenterAltitudeMode != MapCenterAltitudeMode.SEA;
    }

    public final AnimatorListenerAdapter getCoreGestureAnimatorHandler() {
        return this.coreGestureAnimatorHandler;
    }

    public final void notifyCoreGestureStarted() {
        if (this.gestureStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new AnonymousClass1());
    }

    public final void notifyCoreTouchEnded() {
        if (!this.gestureStarted || this.gestureAnimationStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new C42521());
    }

    /* JADX INFO: renamed from: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreTouchEnded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42521 extends w implements a<Unit> {
        public C42521() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(CoreGesturesHandler.this.cachedCenterAltitudeMode);
            }
            CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(false);
            CoreGesturesHandler.this.gestureStarted = false;
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreGestureStarted$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements a<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
            coreGesturesHandler.cachedCenterAltitudeMode = coreGesturesHandler.mapCameraManagerDelegate.getCenterAltitudeMode();
            CoreGesturesHandler.this.gestureStarted = true;
            CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(true);
            if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
