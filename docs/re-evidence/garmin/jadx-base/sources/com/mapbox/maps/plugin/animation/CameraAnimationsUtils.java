package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.g;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import e23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0007\u001a\u00020\u0003H\u0007\u001a$\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002\u001a&\u0010\u000f\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a(\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007\u001a<\u0010\u0015\u001a\u0004\u0018\u00010\u0016\"\f\b\u0000\u0010\u001c*\u0006\u0012\u0002\b\u00030\u000b*\b\u0012\u0004\u0012\u0002H\u001c0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007\u001aB\u0010\u0015\u001a\u0004\u0018\u00010\u0016\"\f\b\u0000\u0010\u001c*\u0006\u0012\u0002\b\u00030\u000b*\b\u0012\u0004\u0012\u0002H\u001c0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002\u001a\f\u0010\u001d\u001a\u00020\u0010*\u00020\u0014H\u0002\u001a,\u0010\u001e\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\u001a,\u0010&\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\u001a\f\u0010'\u001a\u00020(*\u00020\u0003H\u0007\u001a,\u0010)\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010*\u001a\u00020+2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\u001a,\u0010,\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010-\u001a\u00020.2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\u001a4\u0010/\u001a\u00020\u0001*\u00020\u001f2\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020+2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\u001a\f\u00102\u001a\u00020\r*\u000203H\u0002\u001a6\u00104\u001a\u00020\u0001*\u00020\u001f2\u0006\u00105\u001a\u00020.2\b\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u00066"}, d2 = {"emptyCancelable", "Lcom/mapbox/common/Cancelable;", "camera", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getCamera", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "createCameraAnimationPlugin", "getRelativeFraction", "", "cameraAnimator", "Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "totalDuration", "", "totalFraction", "updateCameraValue", "", "animatedValue", "", "cameraOptionsBuilder", "Lcom/mapbox/maps/CameraOptions$Builder;", "calculateCameraAnimationHint", "Lcom/mapbox/maps/CameraAnimationHint;", "Landroid/animation/AnimatorSet;", "fractions", "", "startCameraState", "Lcom/mapbox/maps/CameraState;", "T", "clear", "easeTo", "Lcom/mapbox/maps/plugin/delegates/MapPluginExtensionsDelegate;", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "animationOptions", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "flyTo", "getCameraAnimatorsFactory", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;", "moveBy", "screenCoordinate", "Lcom/mapbox/maps/ScreenCoordinate;", "pitchBy", "pitch", "", "rotateBy", "first", "second", "safeTotalDuration", "Landroid/animation/Animator;", "scaleBy", "amount", "plugin-animation_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimationsUtils {
    private static final Cancelable emptyCancelable = new g(6);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$easeTo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ CameraOptions $cameraOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$cameraOptions = cameraOptions;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.easeTo(this.$cameraOptions, this.$animationOptions, this.$animatorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$flyTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42111 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ CameraOptions $cameraOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42111(CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$cameraOptions = cameraOptions;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.flyTo(this.$cameraOptions, this.$animationOptions, this.$animatorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$moveBy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42121 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ ScreenCoordinate $screenCoordinate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42121(ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$screenCoordinate = screenCoordinate;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.moveBy(this.$screenCoordinate, this.$animationOptions, this.$animatorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$pitchBy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42131 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ double $pitch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42131(double d14, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$pitch = d14;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.pitchBy(this.$pitch, this.$animationOptions, this.$animatorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$rotateBy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42141 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ ScreenCoordinate $first;
        final /* synthetic */ ScreenCoordinate $second;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42141(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$first = screenCoordinate;
            this.$second = screenCoordinate2;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.rotateBy(this.$first, this.$second, this.$animationOptions, this.$animatorListener);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$scaleBy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42151 extends w implements l<CameraAnimationsPlugin, Object> {
        final /* synthetic */ double $amount;
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ Animator.AnimatorListener $animatorListener;
        final /* synthetic */ ScreenCoordinate $screenCoordinate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42151(double d14, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
            super(1);
            this.$amount = d14;
            this.$screenCoordinate = screenCoordinate;
            this.$animationOptions = mapAnimationOptions;
            this.$animatorListener = animatorListener;
        }

        @Override // e23.l
        public final Object invoke(CameraAnimationsPlugin cameraAnimationsPlugin) {
            cameraAnimationsPlugin.getClass();
            return cameraAnimationsPlugin.scaleBy(this.$amount, this.$screenCoordinate, this.$animationOptions, this.$animatorListener);
        }
    }

    private static final <T extends CameraAnimator<?>> CameraAnimationHint calculateCameraAnimationHint(List<? extends T> list, List<Float> list2, long j8, CameraState cameraState) {
        if (list.isEmpty() || j8 == 0) {
            return null;
        }
        if (j8 != -1) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((CameraAnimator) it.next()).getDuration() == -1) {
                    }
                }
            }
            CameraOptions.Builder builder = new CameraOptions.Builder();
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                float fFloatValue = ((Number) it3.next()).floatValue();
                clear(builder);
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    CameraAnimator cameraAnimator = (CameraAnimator) it4.next();
                    try {
                        updateCameraValue(cameraAnimator, cameraAnimator.getAnimatedValueAt$plugin_animation_release(getRelativeFraction(cameraAnimator, j8, fFloatValue), cameraState), builder);
                    } catch (UnsupportedOperationException e4) {
                        MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "Unable to calculate animated value ahead of time for " + cameraAnimator.getType().name() + ": " + e4.getMessage());
                    }
                    arrayList2.add(Unit.INSTANCE);
                }
                arrayList.add(new CameraAnimationHintStage.Builder().camera(builder.build()).progress((long) (j8 * fFloatValue)).build());
            }
            return new CameraAnimationHint.Builder().stages(arrayList).build();
        }
        MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "Animators with infinite duration are not supported. Please use finite duration for all animators.");
        return null;
    }

    public static /* synthetic */ CameraAnimationHint calculateCameraAnimationHint$default(AnimatorSet animatorSet, List list, CameraState cameraState, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            cameraState = null;
        }
        return calculateCameraAnimationHint(animatorSet, list, cameraState);
    }

    private static final void clear(CameraOptions.Builder builder) {
        builder.center(null).padding(null).anchor(null).zoom(null).bearing(null).pitch(null);
    }

    public static final /* synthetic */ CameraAnimationsPlugin createCameraAnimationPlugin() {
        return new CameraAnimationsPluginImpl();
    }

    public static final Cancelable easeTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new AnonymousClass1(cameraOptions, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable easeTo$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            animatorListener = null;
        }
        return easeTo(mapPluginExtensionsDelegate, cameraOptions, mapAnimationOptions, animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void emptyCancelable$lambda$0() {
    }

    public static final Cancelable flyTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new C42111(cameraOptions, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable flyTo$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            animatorListener = null;
        }
        return flyTo(mapPluginExtensionsDelegate, cameraOptions, mapAnimationOptions, animatorListener);
    }

    public static final CameraAnimationsPlugin getCamera(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_CAMERA_PLUGIN_ID);
        plugin.getClass();
        return (CameraAnimationsPlugin) plugin;
    }

    public static final /* synthetic */ CameraAnimatorsFactory getCameraAnimatorsFactory(CameraAnimationsPlugin cameraAnimationsPlugin) {
        cameraAnimationsPlugin.getClass();
        return ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getCameraAnimationsFactory();
    }

    private static final float getRelativeFraction(CameraAnimator<?> cameraAnimator, long j8, float f14) {
        long duration = cameraAnimator.getDuration();
        if (duration <= 0) {
            return 1.0f;
        }
        return t.d(((f14 * j8) - cameraAnimator.getStartDelay()) / duration, 0.0f, 1.0f);
    }

    public static final Cancelable moveBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new C42121(screenCoordinate, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable moveBy$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            animatorListener = null;
        }
        return moveBy(mapPluginExtensionsDelegate, screenCoordinate, mapAnimationOptions, animatorListener);
    }

    public static final Cancelable pitchBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new C42131(d14, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable pitchBy$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            animatorListener = null;
        }
        return pitchBy(mapPluginExtensionsDelegate, d14, mapAnimationOptions, animatorListener);
    }

    public static final Cancelable rotateBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new C42141(screenCoordinate, screenCoordinate2, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable rotateBy$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 8) != 0) {
            animatorListener = null;
        }
        return rotateBy(mapPluginExtensionsDelegate, screenCoordinate, screenCoordinate2, mapAnimationOptions, animatorListener);
    }

    private static final long safeTotalDuration(Animator animator) {
        return animator.getTotalDuration();
    }

    public static final Cancelable scaleBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        mapPluginExtensionsDelegate.getClass();
        Object objCameraAnimationsPlugin = mapPluginExtensionsDelegate.cameraAnimationsPlugin(new C42151(d14, screenCoordinate, mapAnimationOptions, animatorListener));
        Cancelable cancelable = objCameraAnimationsPlugin instanceof Cancelable ? (Cancelable) objCameraAnimationsPlugin : null;
        return cancelable == null ? emptyCancelable : cancelable;
    }

    public static /* synthetic */ Cancelable scaleBy$default(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 8) != 0) {
            animatorListener = null;
        }
        return scaleBy(mapPluginExtensionsDelegate, d14, screenCoordinate, mapAnimationOptions, animatorListener);
    }

    public static final void updateCameraValue(CameraAnimator<?> cameraAnimator, Object obj, CameraOptions.Builder builder) {
        cameraAnimator.getClass();
        builder.getClass();
        if (cameraAnimator instanceof CameraCenterAnimator) {
            builder.center(obj instanceof Point ? (Point) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraZoomAnimator) {
            builder.zoom(obj instanceof Double ? (Double) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraAnchorAnimator) {
            builder.anchor(obj instanceof ScreenCoordinate ? (ScreenCoordinate) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraPaddingAnimator) {
            builder.padding(obj instanceof EdgeInsets ? (EdgeInsets) obj : null);
        } else if (cameraAnimator instanceof CameraBearingAnimator) {
            builder.bearing(obj instanceof Double ? (Double) obj : null);
        } else if (cameraAnimator instanceof CameraPitchAnimator) {
            builder.pitch(obj instanceof Double ? (Double) obj : null);
        }
    }

    public static /* synthetic */ CameraAnimationHint calculateCameraAnimationHint$default(List list, List list2, CameraState cameraState, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            cameraState = null;
        }
        return calculateCameraAnimationHint(list, list2, cameraState);
    }

    public static final Cancelable pitchBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        return pitchBy$default(mapPluginExtensionsDelegate, d14, mapAnimationOptions, null, 4, null);
    }

    public static final Cancelable pitchBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14) {
        mapPluginExtensionsDelegate.getClass();
        return pitchBy$default(mapPluginExtensionsDelegate, d14, null, null, 6, null);
    }

    public static final Cancelable easeTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        return easeTo$default(mapPluginExtensionsDelegate, cameraOptions, mapAnimationOptions, null, 4, null);
    }

    public static final Cancelable flyTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        return flyTo$default(mapPluginExtensionsDelegate, cameraOptions, mapAnimationOptions, null, 4, null);
    }

    public static final Cancelable moveBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        return moveBy$default(mapPluginExtensionsDelegate, screenCoordinate, mapAnimationOptions, null, 4, null);
    }

    public static final Cancelable easeTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        return easeTo$default(mapPluginExtensionsDelegate, cameraOptions, null, null, 6, null);
    }

    public static final Cancelable flyTo(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, CameraOptions cameraOptions) {
        mapPluginExtensionsDelegate.getClass();
        cameraOptions.getClass();
        return flyTo$default(mapPluginExtensionsDelegate, cameraOptions, null, null, 6, null);
    }

    public static final Cancelable moveBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        return moveBy$default(mapPluginExtensionsDelegate, screenCoordinate, null, null, 6, null);
    }

    public static final Cancelable scaleBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        return scaleBy$default(mapPluginExtensionsDelegate, d14, screenCoordinate, mapAnimationOptions, null, 8, null);
    }

    public static final Cancelable scaleBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, double d14, ScreenCoordinate screenCoordinate) {
        mapPluginExtensionsDelegate.getClass();
        return scaleBy$default(mapPluginExtensionsDelegate, d14, screenCoordinate, null, null, 12, null);
    }

    public static final Cancelable rotateBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, MapAnimationOptions mapAnimationOptions) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        return rotateBy$default(mapPluginExtensionsDelegate, screenCoordinate, screenCoordinate2, mapAnimationOptions, null, 8, null);
    }

    public static final Cancelable rotateBy(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        mapPluginExtensionsDelegate.getClass();
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        return rotateBy$default(mapPluginExtensionsDelegate, screenCoordinate, screenCoordinate2, null, null, 12, null);
    }

    public static final /* synthetic */ CameraAnimationHint calculateCameraAnimationHint(List list, List list2, CameraState cameraState) {
        list.getClass();
        list2.getClass();
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            long jSafeTotalDuration = safeTotalDuration((CameraAnimator) it.next());
            while (it.hasNext()) {
                long jSafeTotalDuration2 = safeTotalDuration((CameraAnimator) it.next());
                if (jSafeTotalDuration < jSafeTotalDuration2) {
                    jSafeTotalDuration = jSafeTotalDuration2;
                }
            }
            return calculateCameraAnimationHint(list, list2, jSafeTotalDuration, cameraState);
        }
        c22.t.g();
        return null;
    }

    public static final /* synthetic */ CameraAnimationHint calculateCameraAnimationHint(AnimatorSet animatorSet, List list, CameraState cameraState) {
        long jSafeTotalDuration;
        animatorSet.getClass();
        list.getClass();
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childAnimations) {
            if (obj instanceof CameraAnimator) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != animatorSet.getChildAnimations().size()) {
            MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "Incompatible animators: all should be instances of CameraAnimator");
            return null;
        }
        if (animatorSet.getStartDelay() != 0) {
            MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "AnimatorSets with non-zero startDelay are not supported.");
            return null;
        }
        if (animatorSet.getChildAnimations().isEmpty()) {
            MapboxLogger.logW(CameraAnimationsPluginImpl.TAG, "AnimatorSet has no child animations.");
            return null;
        }
        if (animatorSet.getDuration() >= 0) {
            jSafeTotalDuration = animatorSet.getDuration();
        } else {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            jSafeTotalDuration = safeTotalDuration((CameraAnimator) it.next());
            while (it.hasNext()) {
                long jSafeTotalDuration2 = safeTotalDuration((CameraAnimator) it.next());
                if (jSafeTotalDuration < jSafeTotalDuration2) {
                    jSafeTotalDuration = jSafeTotalDuration2;
                }
            }
        }
        return calculateCameraAnimationHint(arrayList, list, jSafeTotalDuration, cameraState);
    }
}
