package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.l;
import java.util.List;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u001a\u0010\nJ5\u0010!\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b!\u0010\"J5\u0010#\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b#\u0010\"J?\u0010&\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\b\b\u0002\u0010%\u001a\u00020$2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b&\u0010'J5\u0010(\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b(\u0010\"J5\u0010*\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b*\u0010\"J5\u0010,\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020+0\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH\u0017¢\u0006\u0004\b,\u0010\"J=\u0010,\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020+0\u001b2\u0006\u0010%\u001a\u00020$2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH&¢\u0006\u0004\b,\u0010'J#\u0010/\u001a\u00020\u001f2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0-\"\u00020\u001eH&¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u001f2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020201H&¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u001f2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0-\"\u00020\u001e2\b\b\u0002\u00106\u001a\u00020$H&¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH&¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\b@\u0010?J\u001d\u0010A\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\bA\u0010?J\u001d\u0010B\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\bB\u0010?J\u001d\u0010C\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020+0<H&¢\u0006\u0004\bC\u0010?J\u001d\u0010D\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020+0<H&¢\u0006\u0004\bD\u0010?J\u001d\u0010E\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020)0<H&¢\u0006\u0004\bE\u0010?J\u001d\u0010F\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020)0<H&¢\u0006\u0004\bF\u0010?J\u001f\u0010H\u001a\u00020\u001f2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0GH&¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u001f2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0GH&¢\u0006\u0004\bJ\u0010IJ\u001d\u0010K\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\bK\u0010?J\u001d\u0010L\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<H&¢\u0006\u0004\bL\u0010?J\u0017\u0010N\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020MH&¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020MH&¢\u0006\u0004\bP\u0010OJ#\u0010R\u001a\u00020\u001f2\u0012\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0-\"\u00020\u001eH&¢\u0006\u0004\bR\u00100J#\u0010S\u001a\u00020\u001f2\u0012\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0-\"\u00020\u001eH&¢\u0006\u0004\bS\u00100R\u001c\u0010X\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010]\u001a\u0004\u0018\u00010\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "animationOptions", "Landroid/animation/Animator$AnimatorListener;", "animatorListener", "Lcom/mapbox/common/Cancelable;", "easeTo", "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "", "amount", "Lcom/mapbox/maps/ScreenCoordinate;", "screenCoordinate", "scaleBy", "(DLcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "moveBy", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "first", "second", "rotateBy", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "pitch", "pitchBy", "(DLcom/mapbox/maps/plugin/animation/MapAnimationOptions;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;", "flyTo", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;", "options", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "block", "createZoomAnimator", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;Le23/l;)Landroid/animation/ValueAnimator;", "createAnchorAnimator", "", "useShortestPath", "createBearingAnimator", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorOptions;ZLe23/l;)Landroid/animation/ValueAnimator;", "createPitchAnimator", "Lcom/mapbox/maps/EdgeInsets;", "createPaddingAnimator", "Lcom/mapbox/geojson/Point;", "createCenterAnimator", "", "cameraAnimators", "registerAnimators", "([Landroid/animation/ValueAnimator;)V", "", "", "exceptOwnerList", "cancelAllAnimators", "(Ljava/util/List;)V", "cancelAnimators", "unregisterAnimators", "([Landroid/animation/ValueAnimator;Z)V", "currentZoom", "calculateScaleBy", "(DD)D", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCameraBearingChangeListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorChangeListener;)V", "addCameraPitchChangeListener", "addCameraZoomChangeListener", "removeCameraZoomChangeListener", "addCameraCenterChangeListener", "removeCameraCenterChangeListener", "addCameraPaddingChangeListener", "removeCameraPaddingChangeListener", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorNullableChangeListener;", "addCameraAnchorChangeListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorNullableChangeListener;)V", "removeCameraAnchorChangeListener", "removeCameraBearingChangeListener", "removeCameraPitchChangeListener", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsLifecycleListener;", "addCameraAnimationsLifecycleListener", "(Lcom/mapbox/maps/plugin/animation/CameraAnimationsLifecycleListener;)V", "removeCameraAnimationsLifecycleListener", "animators", "playAnimatorsTogether", "playAnimatorsSequentially", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "getAnchor", "()Lcom/mapbox/maps/ScreenCoordinate;", "setAnchor", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "anchor", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CameraAnimationsPlugin extends MapPlugin {
    void addCameraAnchorChangeListener(CameraAnimatorNullableChangeListener<ScreenCoordinate> listener);

    void addCameraAnimationsLifecycleListener(CameraAnimationsLifecycleListener listener);

    void addCameraBearingChangeListener(CameraAnimatorChangeListener<Double> listener);

    void addCameraCenterChangeListener(CameraAnimatorChangeListener<Point> listener);

    void addCameraPaddingChangeListener(CameraAnimatorChangeListener<EdgeInsets> listener);

    void addCameraPitchChangeListener(CameraAnimatorChangeListener<Double> listener);

    void addCameraZoomChangeListener(CameraAnimatorChangeListener<Double> listener);

    double calculateScaleBy(double amount, double currentZoom);

    void cancelAllAnimators(List<String> exceptOwnerList);

    ValueAnimator createAnchorAnimator(CameraAnimatorOptions<ScreenCoordinate> options, l<? super ValueAnimator, Unit> block);

    ValueAnimator createBearingAnimator(CameraAnimatorOptions<Double> options, boolean useShortestPath, l<? super ValueAnimator, Unit> block);

    @e
    ValueAnimator createCenterAnimator(CameraAnimatorOptions<Point> options, l<? super ValueAnimator, Unit> block);

    ValueAnimator createCenterAnimator(CameraAnimatorOptions<Point> options, boolean useShortestPath, l<? super ValueAnimator, Unit> block);

    ValueAnimator createPaddingAnimator(CameraAnimatorOptions<EdgeInsets> options, l<? super ValueAnimator, Unit> block);

    ValueAnimator createPitchAnimator(CameraAnimatorOptions<Double> options, l<? super ValueAnimator, Unit> block);

    ValueAnimator createZoomAnimator(CameraAnimatorOptions<Double> options, l<? super ValueAnimator, Unit> block);

    Cancelable easeTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    Cancelable flyTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    ScreenCoordinate getAnchor();

    boolean getDebugMode();

    Cancelable moveBy(ScreenCoordinate screenCoordinate, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    Cancelable pitchBy(double pitch, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    void playAnimatorsSequentially(ValueAnimator... animators);

    void playAnimatorsTogether(ValueAnimator... animators);

    void registerAnimators(ValueAnimator... cameraAnimators);

    void removeCameraAnchorChangeListener(CameraAnimatorNullableChangeListener<ScreenCoordinate> listener);

    void removeCameraAnimationsLifecycleListener(CameraAnimationsLifecycleListener listener);

    void removeCameraBearingChangeListener(CameraAnimatorChangeListener<Double> listener);

    void removeCameraCenterChangeListener(CameraAnimatorChangeListener<Point> listener);

    void removeCameraPaddingChangeListener(CameraAnimatorChangeListener<EdgeInsets> listener);

    void removeCameraPitchChangeListener(CameraAnimatorChangeListener<Double> listener);

    void removeCameraZoomChangeListener(CameraAnimatorChangeListener<Double> listener);

    Cancelable rotateBy(ScreenCoordinate first, ScreenCoordinate second, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    Cancelable scaleBy(double amount, ScreenCoordinate screenCoordinate, MapAnimationOptions animationOptions, Animator.AnimatorListener animatorListener);

    void setAnchor(ScreenCoordinate screenCoordinate);

    void setDebugMode(boolean z14);

    void unregisterAnimators(ValueAnimator[] cameraAnimators, boolean cancelAnimators);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static void cancelAllAnimators$default(CameraAnimationsPlugin cameraAnimationsPlugin, List list, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: cancelAllAnimators");
                return;
            }
            if ((i14 & 1) != 0) {
                list = j0.f134944a;
            }
            cameraAnimationsPlugin.cancelAllAnimators(list);
        }

        public static void cleanup(CameraAnimationsPlugin cameraAnimationsPlugin) {
            MapPlugin.DefaultImpls.cleanup(cameraAnimationsPlugin);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createAnchorAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createAnchorAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createAnchorAnimator(cameraAnimatorOptions, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createBearingAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, boolean z14, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createBearingAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                z14 = true;
            }
            if ((i14 & 4) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createBearingAnimator(cameraAnimatorOptions, z14, lVar);
        }

        @e
        public static ValueAnimator createCenterAnimator(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions<Point> cameraAnimatorOptions, l<? super ValueAnimator, Unit> lVar) {
            cameraAnimatorOptions.getClass();
            return cameraAnimationsPlugin.createCenterAnimator(cameraAnimatorOptions, false, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createCenterAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createCenterAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createCenterAnimator(cameraAnimatorOptions, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createPaddingAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createPaddingAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createPaddingAnimator(cameraAnimatorOptions, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createPitchAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createPitchAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createPitchAnimator(cameraAnimatorOptions, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createZoomAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createZoomAnimator");
                return null;
            }
            if ((i14 & 2) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createZoomAnimator(cameraAnimatorOptions, lVar);
        }

        public static /* synthetic */ Cancelable easeTo$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: easeTo");
                return null;
            }
            if ((i14 & 2) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 4) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.easeTo(cameraOptions, mapAnimationOptions, animatorListener);
        }

        public static /* synthetic */ Cancelable flyTo$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: flyTo");
                return null;
            }
            if ((i14 & 2) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 4) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.flyTo(cameraOptions, mapAnimationOptions, animatorListener);
        }

        public static void initialize(CameraAnimationsPlugin cameraAnimationsPlugin) {
            MapPlugin.DefaultImpls.initialize(cameraAnimationsPlugin);
        }

        public static /* synthetic */ Cancelable moveBy$default(CameraAnimationsPlugin cameraAnimationsPlugin, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: moveBy");
                return null;
            }
            if ((i14 & 2) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 4) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.moveBy(screenCoordinate, mapAnimationOptions, animatorListener);
        }

        public static void onDelegateProvider(CameraAnimationsPlugin cameraAnimationsPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(cameraAnimationsPlugin, mapDelegateProvider);
        }

        public static /* synthetic */ Cancelable pitchBy$default(CameraAnimationsPlugin cameraAnimationsPlugin, double d14, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: pitchBy");
                return null;
            }
            if ((i14 & 2) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 4) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.pitchBy(d14, mapAnimationOptions, animatorListener);
        }

        public static /* synthetic */ Cancelable rotateBy$default(CameraAnimationsPlugin cameraAnimationsPlugin, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: rotateBy");
                return null;
            }
            if ((i14 & 4) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 8) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.rotateBy(screenCoordinate, screenCoordinate2, mapAnimationOptions, animatorListener);
        }

        public static /* synthetic */ Cancelable scaleBy$default(CameraAnimationsPlugin cameraAnimationsPlugin, double d14, ScreenCoordinate screenCoordinate, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: scaleBy");
                return null;
            }
            if ((i14 & 4) != 0) {
                mapAnimationOptions = null;
            }
            if ((i14 & 8) != 0) {
                animatorListener = null;
            }
            return cameraAnimationsPlugin.scaleBy(d14, screenCoordinate, mapAnimationOptions, animatorListener);
        }

        public static /* synthetic */ void unregisterAnimators$default(CameraAnimationsPlugin cameraAnimationsPlugin, ValueAnimator[] valueAnimatorArr, boolean z14, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: unregisterAnimators");
                return;
            }
            if ((i14 & 2) != 0) {
                z14 = true;
            }
            cameraAnimationsPlugin.unregisterAnimators(valueAnimatorArr, z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueAnimator createCenterAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, boolean z14, l lVar, int i14, Object obj) {
            if (obj != null) {
                org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: createCenterAnimator");
                return null;
            }
            if ((i14 & 4) != 0) {
                lVar = null;
            }
            return cameraAnimationsPlugin.createCenterAnimator(cameraAnimatorOptions, z14, lVar);
        }
    }
}
