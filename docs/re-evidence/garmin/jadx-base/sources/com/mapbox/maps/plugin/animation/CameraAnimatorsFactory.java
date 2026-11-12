package com.mapbox.maps.plugin.animation;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Size;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import e23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J+\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0017J+\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u001fJ7\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010!\u001a\u00020\u001a2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010#J\f\u0010$\u001a\u00020%*\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory;", "", "mapDelegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapProjectionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "getEaseTo", "", "Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "owner", "", "(Lcom/mapbox/maps/CameraOptions;Ljava/lang/String;)[Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "getFlyTo", "getMoveBy", MapboxMap.QFE_OFFSET, "Lcom/mapbox/maps/ScreenCoordinate;", "(Lcom/mapbox/maps/ScreenCoordinate;Ljava/lang/String;)[Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "getPitchBy", "pitch", "", "(DLjava/lang/String;)[Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "getRotateBy", "first", "second", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;Ljava/lang/String;)[Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "getScaleBy", "amount", "anchor", "(DLcom/mapbox/maps/ScreenCoordinate;Ljava/lang/String;)[Lcom/mapbox/maps/plugin/animation/animator/CameraAnimator;", "getSafeFraction", "", "Companion", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimatorsFactory {
    public static final long DEFAULT_ANIMATION_DURATION_MS = 300;
    private static final HashMap<CameraAnimatorType, l<ValueAnimator, Unit>> defaultAnimationParameters;
    private final MapCameraManagerDelegate mapCameraManagerDelegate;
    private final MapProjectionDelegate mapProjectionDelegate;
    private final MapTransformDelegate mapTransformDelegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Interpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);
    private static final q9.b DEFAULT_INTERPOLATOR = new q9.b();

    static {
        HashMap<CameraAnimatorType, l<ValueAnimator, Unit>> map = new HashMap<>();
        map.put(CameraAnimatorType.ANCHOR, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE);
        map.put(CameraAnimatorType.BEARING, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$2.INSTANCE);
        map.put(CameraAnimatorType.PADDING, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$3.INSTANCE);
        map.put(CameraAnimatorType.PITCH, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$4.INSTANCE);
        map.put(CameraAnimatorType.CENTER, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$5.INSTANCE);
        map.put(CameraAnimatorType.ZOOM, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$6.INSTANCE);
        defaultAnimationParameters = map;
    }

    public CameraAnimatorsFactory(MapDelegateProvider mapDelegateProvider) {
        mapDelegateProvider.getClass();
        this.mapTransformDelegate = mapDelegateProvider.getMapTransformDelegate();
        this.mapProjectionDelegate = mapDelegateProvider.getMapProjectionDelegate();
        this.mapCameraManagerDelegate = mapDelegateProvider.getMapCameraManagerDelegate();
    }

    public static /* synthetic */ CameraAnimator[] getEaseTo$default(CameraAnimatorsFactory cameraAnimatorsFactory, CameraOptions cameraOptions, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getEaseTo(cameraOptions, str);
    }

    public static /* synthetic */ CameraAnimator[] getFlyTo$default(CameraAnimatorsFactory cameraAnimatorsFactory, CameraOptions cameraOptions, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getFlyTo(cameraOptions, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point getFlyTo$lambda$41(CameraAnimatorsFactory cameraAnimatorsFactory, double d14, MercatorCoordinate mercatorCoordinate, MercatorCoordinate mercatorCoordinate2, double d15, boolean z14, double d16, double d17, double d18, double d19, double d24, float f14, Point point, Point point2) {
        cameraAnimatorsFactory.getClass();
        mercatorCoordinate.getClass();
        mercatorCoordinate2.getClass();
        float safeFraction = cameraAnimatorsFactory.getSafeFraction(f14);
        double flyTo$u = safeFraction == 1.0f ? 1.0d : getFlyTo$u(z14, d16, d17, d18, d19, d24, ((double) safeFraction) * d14);
        return cameraAnimatorsFactory.mapProjectionDelegate.unproject(new MercatorCoordinate(((mercatorCoordinate2.getX() - mercatorCoordinate.getX()) * flyTo$u) + mercatorCoordinate.getX(), ((mercatorCoordinate2.getY() - mercatorCoordinate.getY()) * flyTo$u) + mercatorCoordinate.getY()), d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double getFlyTo$lambda$45(CameraAnimatorsFactory cameraAnimatorsFactory, double d14, double d15, boolean z14, double d16, double d17, double d18, double d19, float f14, Double d24, Double d25) {
        cameraAnimatorsFactory.getClass();
        return Double.valueOf(CameraTransform.INSTANCE.scaleZoom(((double) 1) / getFlyTo$w(z14, d16, d17, d18, d19, ((double) cameraAnimatorsFactory.getSafeFraction(f14)) * d14)) + d15);
    }

    private static final double getFlyTo$r(double d14, double d15, double d16, double d17, int i14) {
        double d18 = (((double) (i14 == 0 ? 1 : -1)) * d16 * d16 * d17 * d17) + ((d14 * d14) - (d15 * d15));
        double d19 = 2;
        if (i14 == 0) {
            d14 = d15;
        }
        double d24 = d18 / (((d19 * d14) * d16) * d17);
        return Math.log(Math.sqrt((d24 * d24) + ((double) 1)) - d24);
    }

    private static final double getFlyTo$u(boolean z14, double d14, double d15, double d16, double d17, double d18, double d19) {
        if (z14) {
            return 0.0d;
        }
        return ((((Math.tanh((d16 * d19) + d15) * Math.cosh(d15)) - Math.sinh(d15)) * d14) / d17) / d18;
    }

    private static final double getFlyTo$w(boolean z14, double d14, double d15, double d16, double d17, double d18) {
        if (z14) {
            return Math.exp(((double) (d14 < d15 ? -1 : 1)) * d16 * d18);
        }
        return Math.cosh(d17) / Math.cosh((d16 * d18) + d17);
    }

    public static /* synthetic */ CameraAnimator[] getMoveBy$default(CameraAnimatorsFactory cameraAnimatorsFactory, ScreenCoordinate screenCoordinate, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getMoveBy(screenCoordinate, str);
    }

    public static /* synthetic */ CameraAnimator[] getPitchBy$default(CameraAnimatorsFactory cameraAnimatorsFactory, double d14, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getPitchBy(d14, str);
    }

    public static /* synthetic */ CameraAnimator[] getRotateBy$default(CameraAnimatorsFactory cameraAnimatorsFactory, ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2, String str, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getRotateBy(screenCoordinate, screenCoordinate2, str);
    }

    private final float getSafeFraction(float f14) {
        if (Float.isNaN(f14)) {
            return 0.0f;
        }
        return f14;
    }

    public static /* synthetic */ CameraAnimator[] getScaleBy$default(CameraAnimatorsFactory cameraAnimatorsFactory, double d14, ScreenCoordinate screenCoordinate, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            screenCoordinate = null;
        }
        if ((i14 & 4) != 0) {
            str = null;
        }
        return cameraAnimatorsFactory.getScaleBy(d14, screenCoordinate, str);
    }

    public static final void setDefaultAnimatorOptions(CameraAnimatorType cameraAnimatorType, l<? super ValueAnimator, Unit> lVar) {
        INSTANCE.setDefaultAnimatorOptions(cameraAnimatorType, lVar);
    }

    public final CameraAnimator<?>[] getEaseTo(CameraOptions cameraOptions, String owner) {
        cameraOptions.getClass();
        ArrayList<ValueAnimator> arrayList = new ArrayList();
        CameraState cameraState = this.mapCameraManagerDelegate.getCameraState();
        Point center = cameraOptions.getCenter();
        if (center != null) {
            CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Point[]{center}, 1));
            Point center2 = cameraState.getCenter();
            center2.getClass();
            builder.startValue(center2);
            Unit unit = Unit.INSTANCE;
            CameraCenterAnimator cameraCenterAnimator = new CameraCenterAnimator(null, builder.build(), true, defaultAnimationParameters.get(CameraAnimatorType.CENTER), 1, null);
            if (owner != null) {
                cameraCenterAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraCenterAnimator);
        }
        ScreenCoordinate anchor = cameraOptions.getAnchor();
        if (anchor != null) {
            CameraAnimatorOptions.Companion companion2 = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{anchor}, 1));
            builder2.startValue(anchor);
            CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(builder2.build(), defaultAnimationParameters.get(CameraAnimatorType.ANCHOR));
            if (owner != null) {
                cameraAnchorAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraAnchorAnimator);
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            CameraAnimatorOptions.Companion companion3 = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder3 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{bearing}, 1));
            builder3.startValue(Double.valueOf(cameraState.getBearing()));
            CameraBearingAnimator cameraBearingAnimator = new CameraBearingAnimator(builder3.build(), true, defaultAnimationParameters.get(CameraAnimatorType.BEARING));
            if (owner != null) {
                cameraBearingAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraBearingAnimator);
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            CameraAnimatorOptions.Companion companion4 = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder4 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new EdgeInsets[]{padding}, 1));
            EdgeInsets padding2 = cameraState.getPadding();
            padding2.getClass();
            builder4.startValue(padding2);
            CameraPaddingAnimator cameraPaddingAnimator = new CameraPaddingAnimator(builder4.build(), defaultAnimationParameters.get(CameraAnimatorType.PADDING));
            if (owner != null) {
                cameraPaddingAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraPaddingAnimator);
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            CameraAnimatorOptions.Companion companion5 = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder5 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{pitch}, 1));
            builder5.startValue(Double.valueOf(cameraState.getPitch()));
            CameraPitchAnimator cameraPitchAnimator = new CameraPitchAnimator(builder5.build(), defaultAnimationParameters.get(CameraAnimatorType.PITCH));
            if (owner != null) {
                cameraPitchAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraPitchAnimator);
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            CameraAnimatorOptions.Companion companion6 = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder6 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{zoom}, 1));
            builder6.startValue(Double.valueOf(cameraState.getZoom()));
            CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(builder6.build(), defaultAnimationParameters.get(CameraAnimatorType.ZOOM));
            if (owner != null) {
                cameraZoomAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraZoomAnimator);
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.getClass();
            arrayList2.add((CameraAnimator) valueAnimator);
        }
        Object[] array = arrayList2.toArray(new CameraAnimator[0]);
        array.getClass();
        return (CameraAnimator[]) array;
    }

    public final CameraAnimator<?>[] getFlyTo(CameraOptions cameraOptions, String owner) {
        double dMax;
        cameraOptions.getClass();
        CameraState cameraState = this.mapCameraManagerDelegate.getCameraState();
        EdgeInsets padding = cameraState.getPadding();
        padding.getClass();
        EdgeInsets padding2 = cameraOptions.getPadding();
        if (padding2 == null) {
            padding2 = padding;
        }
        CameraTransform cameraTransform = CameraTransform.INSTANCE;
        Point center = cameraOptions.getCenter();
        if (center == null) {
            center = cameraState.getCenter();
        }
        center.getClass();
        Point pointWrapCoordinate = cameraTransform.wrapCoordinate(center);
        Double zoom = cameraOptions.getZoom();
        if (zoom == null) {
            zoom = Double.valueOf(cameraState.getZoom());
        }
        double dDoubleValue = zoom.doubleValue();
        Double bearing = cameraOptions.getBearing();
        if (bearing == null) {
            bearing = Double.valueOf(cameraState.getBearing());
        }
        double dDoubleValue2 = bearing.doubleValue();
        double pitch = cameraState.getPitch();
        Double pitch2 = cameraOptions.getPitch();
        if (pitch2 == null) {
            pitch2 = Double.valueOf(pitch);
        }
        double dDoubleValue3 = pitch2.doubleValue();
        double bearing2 = cameraState.getBearing();
        final double dPow = Math.pow(2.0d, cameraState.getZoom());
        final double dScaleZoom = cameraTransform.scaleZoom(dPow);
        double dC = t.c(dDoubleValue, this.mapCameraManagerDelegate.getBounds().getMinZoom(), this.mapCameraManagerDelegate.getBounds().getMaxZoom());
        Point center2 = cameraState.getCenter();
        center2.getClass();
        Point pointUnwrapForShortestPath = cameraTransform.unwrapForShortestPath(cameraTransform.wrapCoordinate(center2), pointWrapCoordinate);
        final MercatorCoordinate mercatorCoordinateProject = this.mapProjectionDelegate.project(pointUnwrapForShortestPath, dPow);
        final MercatorCoordinate mercatorCoordinateProject2 = this.mapProjectionDelegate.project(pointWrapCoordinate, dPow);
        Size size = this.mapTransformDelegate.getSize();
        float pixelRatio = this.mapTransformDelegate.getMapOptions().getPixelRatio();
        if (size.getWidth() == padding2.getRight() + padding2.getLeft() || size.getHeight() == padding2.getTop() + padding2.getBottom()) {
            double d14 = pixelRatio;
            dMax = Math.max(((double) size.getWidth()) / d14, ((double) size.getHeight()) / d14);
        } else {
            double d15 = pixelRatio;
            dMax = Math.max(((((double) size.getWidth()) - padding2.getLeft()) - padding2.getRight()) / d15, ((((double) size.getHeight()) - padding2.getTop()) - padding2.getBottom()) / d15);
        }
        final double d16 = dMax;
        final double dZoomScale = d16 / cameraTransform.zoomScale(dC - dScaleZoom);
        final double dHypot = Math.hypot(cameraTransform.offset(mercatorCoordinateProject2, mercatorCoordinateProject).getX(), cameraTransform.offset(mercatorCoordinateProject2, mercatorCoordinateProject).getY());
        final double flyTo$r = dHypot == 0.0d ? Double.POSITIVE_INFINITY : getFlyTo$r(dZoomScale, d16, 2.0164d, dHypot, 0);
        double flyTo$r2 = dHypot != 0.0d ? getFlyTo$r(dZoomScale, d16, 2.0164d, dHypot, 1) : Double.POSITIVE_INFINITY;
        final boolean z14 = Math.abs(dHypot) < 1.0E-6d || Double.isInfinite(flyTo$r) || Double.isInfinite(flyTo$r2);
        final double dAbs = (z14 ? Math.abs(Math.log(dZoomScale / d16)) : flyTo$r2 - flyTo$r) / 1.42d;
        EdgeInsets edgeInsets = padding2;
        TypeEvaluator typeEvaluator = new TypeEvaluator() { // from class: com.mapbox.maps.plugin.animation.a
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f14, Object obj, Object obj2) {
                return CameraAnimatorsFactory.getFlyTo$lambda$41(this.f54525a, dAbs, mercatorCoordinateProject, mercatorCoordinateProject2, dPow, z14, d16, flyTo$r, 1.42d, 2.0164d, dHypot, f14, (Point) obj, (Point) obj2);
            }
        };
        final boolean z15 = z14;
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Point[]{pointWrapCoordinate}, 1));
        builder.startValue(pointUnwrapForShortestPath);
        Unit unit = Unit.INSTANCE;
        CameraAnimatorOptions cameraAnimatorOptionsBuild = builder.build();
        HashMap<CameraAnimatorType, l<ValueAnimator, Unit>> map = defaultAnimationParameters;
        CameraCenterAnimator cameraCenterAnimator = new CameraCenterAnimator(typeEvaluator, cameraAnimatorOptionsBuild, true, map.get(CameraAnimatorType.CENTER));
        if (owner != null) {
            cameraCenterAnimator.setOwner$plugin_animation_release(owner);
        }
        TypeEvaluator typeEvaluator2 = new TypeEvaluator() { // from class: com.mapbox.maps.plugin.animation.b
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f14, Object obj, Object obj2) {
                return CameraAnimatorsFactory.getFlyTo$lambda$45(this.f54535a, dAbs, dScaleZoom, z15, dZoomScale, d16, 1.42d, flyTo$r, f14, (Double) obj, (Double) obj2);
            }
        };
        CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(dC)}, 1));
        builder2.startValue(Double.valueOf(dScaleZoom));
        CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(typeEvaluator2, builder2.build(), map.get(CameraAnimatorType.ZOOM));
        if (owner != null) {
            cameraZoomAnimator.setOwner$plugin_animation_release(owner);
        }
        ArrayList arrayListM = x.m(cameraCenterAnimator, cameraZoomAnimator);
        if (dDoubleValue2 != bearing2) {
            CameraAnimatorOptions.Builder builder3 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue2)}, 1));
            builder3.startValue(Double.valueOf(bearing2));
            CameraBearingAnimator cameraBearingAnimator = new CameraBearingAnimator(builder3.build(), true, map.get(CameraAnimatorType.BEARING));
            if (owner != null) {
                cameraBearingAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayListM.add(cameraBearingAnimator);
        }
        if (dDoubleValue3 != pitch) {
            CameraAnimatorOptions.Builder builder4 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue3)}, 1));
            builder4.startValue(Double.valueOf(pitch));
            CameraPitchAnimator cameraPitchAnimator = new CameraPitchAnimator(builder4.build(), map.get(CameraAnimatorType.PITCH));
            if (owner != null) {
                cameraPitchAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayListM.add(cameraPitchAnimator);
        }
        if (!edgeInsets.equals(padding)) {
            CameraAnimatorOptions.Builder builder5 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new EdgeInsets[]{edgeInsets}, 1));
            builder5.startValue(padding);
            CameraPaddingAnimator cameraPaddingAnimator = new CameraPaddingAnimator(builder5.build(), map.get(CameraAnimatorType.PADDING));
            if (owner != null) {
                cameraPaddingAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayListM.add(cameraPaddingAnimator);
        }
        Object[] array = arrayListM.toArray(new CameraAnimator[0]);
        array.getClass();
        return (CameraAnimator[]) array;
    }

    public final CameraAnimator<?>[] getMoveBy(ScreenCoordinate offset, String owner) {
        offset.getClass();
        CameraState cameraState = this.mapCameraManagerDelegate.getCameraState();
        Point pointCalculateLatLngMoveBy = CameraTransform.INSTANCE.calculateLatLngMoveBy(offset, cameraState, this.mapTransformDelegate, this.mapCameraManagerDelegate);
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Point[]{pointCalculateLatLngMoveBy}, 1));
        Point center = cameraState.getCenter();
        center.getClass();
        builder.startValue(center);
        Unit unit = Unit.INSTANCE;
        CameraCenterAnimator cameraCenterAnimator = new CameraCenterAnimator(null, builder.build(), true, defaultAnimationParameters.get(CameraAnimatorType.CENTER), 1, null);
        if (owner != null) {
            cameraCenterAnimator.setOwner$plugin_animation_release(owner);
        }
        return new CameraAnimator[]{cameraCenterAnimator};
    }

    public final CameraAnimator<?>[] getPitchBy(double pitch, String owner) {
        double pitch2 = this.mapCameraManagerDelegate.getCameraState().getPitch();
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(pitch + pitch2)}, 1));
        builder.startValue(Double.valueOf(pitch2));
        Unit unit = Unit.INSTANCE;
        CameraPitchAnimator cameraPitchAnimator = new CameraPitchAnimator(builder.build(), defaultAnimationParameters.get(CameraAnimatorType.PITCH));
        if (owner != null) {
            cameraPitchAnimator.setOwner$plugin_animation_release(owner);
        }
        return new CameraAnimator[]{cameraPitchAnimator};
    }

    public final CameraAnimator<?>[] getRotateBy(ScreenCoordinate first, ScreenCoordinate second, String owner) {
        char c14;
        first.getClass();
        second.getClass();
        CameraState cameraState = this.mapCameraManagerDelegate.getCameraState();
        Size size = this.mapTransformDelegate.getMapOptions().getSize();
        double bearing = cameraState.getBearing();
        if (size == null) {
            return new CameraAnimator[0];
        }
        CameraTransform cameraTransform = CameraTransform.INSTANCE;
        EdgeInsets padding = cameraState.getPadding();
        padding.getClass();
        ScreenCoordinate mapCenter = cameraTransform.getMapCenter(padding, size);
        double d14 = -cameraTransform.deg2rad(bearing);
        ScreenCoordinate screenCoordinateOffset = cameraTransform.offset(first, mapCenter);
        if (Math.hypot(screenCoordinateOffset.getX(), screenCoordinateOffset.getY()) < 200.0d) {
            double dAtan2 = Math.atan2(screenCoordinateOffset.getY(), screenCoordinateOffset.getX());
            double x14 = first.getX();
            double dCos = Math.cos(dAtan2);
            c14 = 0;
            double d15 = -200;
            mapCenter = new ScreenCoordinate((dCos * d15) + x14, (Math.sin(dAtan2) * d15) + first.getY());
        } else {
            c14 = 0;
        }
        double d16 = -cameraTransform.rad2deg(cameraTransform.angleBetween(cameraTransform.offset(first, mapCenter), cameraTransform.offset(second, mapCenter)) + d14);
        CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(d16)}, 1));
        builder.startValue(Double.valueOf(bearing));
        Unit unit = Unit.INSTANCE;
        CameraBearingAnimator cameraBearingAnimator = new CameraBearingAnimator(builder.build(), true, defaultAnimationParameters.get(CameraAnimatorType.BEARING));
        if (owner != null) {
            cameraBearingAnimator.setOwner$plugin_animation_release(owner);
        }
        CameraAnimator<?>[] cameraAnimatorArr = new CameraAnimator[1];
        cameraAnimatorArr[c14] = cameraBearingAnimator;
        return cameraAnimatorArr;
    }

    public final CameraAnimator<?>[] getScaleBy(double amount, ScreenCoordinate anchor, String owner) {
        ArrayList arrayList = new ArrayList();
        if (anchor != null) {
            CameraAnimatorOptions.Companion companion = CameraAnimatorOptions.INSTANCE;
            CameraAnimatorOptions.Builder builder = new CameraAnimatorOptions.Builder(Arrays.copyOf(new ScreenCoordinate[]{anchor}, 1));
            builder.startValue(anchor);
            CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(builder.build(), defaultAnimationParameters.get(CameraAnimatorType.ANCHOR));
            if (owner != null) {
                cameraAnchorAnimator.setOwner$plugin_animation_release(owner);
            }
            arrayList.add(cameraAnchorAnimator);
        }
        double zoom = this.mapCameraManagerDelegate.getCameraState().getZoom();
        double dCalculateScaleBy = CameraTransform.INSTANCE.calculateScaleBy(amount, zoom);
        CameraAnimatorOptions.Companion companion2 = CameraAnimatorOptions.INSTANCE;
        CameraAnimatorOptions.Builder builder2 = new CameraAnimatorOptions.Builder(Arrays.copyOf(new Double[]{Double.valueOf(dCalculateScaleBy)}, 1));
        builder2.startValue(Double.valueOf(zoom));
        CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(builder2.build(), defaultAnimationParameters.get(CameraAnimatorType.ZOOM));
        if (owner != null) {
            cameraZoomAnimator.setOwner$plugin_animation_release(owner);
        }
        arrayList.add(cameraZoomAnimator);
        Object[] array = arrayList.toArray(new CameraAnimator[0]);
        array.getClass();
        return (CameraAnimator[]) array;
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RH\u0010\u0018\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0016j\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimatorsFactory$Companion;", "", "<init>", "()V", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "block", "setDefaultAnimatorOptions", "(Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;Le23/l;)V", "(Le23/l;)V", "Landroid/view/animation/Interpolator;", "CUBIC_BEZIER_INTERPOLATOR", "Landroid/view/animation/Interpolator;", "", "DEFAULT_ANIMATION_DURATION_MS", "J", "Lq9/b;", "DEFAULT_INTERPOLATOR", "Lq9/b;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "defaultAnimationParameters", "Ljava/util/HashMap;", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final void setDefaultAnimatorOptions(l<? super ValueAnimator, Unit> block) {
            block.getClass();
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.CENTER, block);
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.ZOOM, block);
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.BEARING, block);
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.PITCH, block);
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.ANCHOR, block);
            CameraAnimatorsFactory.defaultAnimationParameters.put(CameraAnimatorType.PADDING, block);
        }

        private Companion() {
        }

        public final void setDefaultAnimatorOptions(CameraAnimatorType type, l<? super ValueAnimator, Unit> block) {
            type.getClass();
            block.getClass();
            CameraAnimatorsFactory.defaultAnimationParameters.put(type, block);
        }
    }

    public static final void setDefaultAnimatorOptions(l<? super ValueAnimator, Unit> lVar) {
        INSTANCE.setDefaultAnimatorOptions(lVar);
    }

    public final CameraAnimator<?>[] getPitchBy(double d14) {
        return getPitchBy$default(this, d14, null, 2, null);
    }

    public final CameraAnimator<?>[] getMoveBy(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        return getMoveBy$default(this, screenCoordinate, null, 2, null);
    }

    public final CameraAnimator<?>[] getScaleBy(double d14, ScreenCoordinate screenCoordinate) {
        return getScaleBy$default(this, d14, screenCoordinate, null, 4, null);
    }

    public final CameraAnimator<?>[] getScaleBy(double d14) {
        return getScaleBy$default(this, d14, null, null, 6, null);
    }

    public final CameraAnimator<?>[] getRotateBy(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        return getRotateBy$default(this, screenCoordinate, screenCoordinate2, null, 4, null);
    }

    public final CameraAnimator<?>[] getEaseTo(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        return getEaseTo$default(this, cameraOptions, null, 2, null);
    }

    public final CameraAnimator<?>[] getFlyTo(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        return getFlyTo$default(this, cameraOptions, null, 2, null);
    }
}
