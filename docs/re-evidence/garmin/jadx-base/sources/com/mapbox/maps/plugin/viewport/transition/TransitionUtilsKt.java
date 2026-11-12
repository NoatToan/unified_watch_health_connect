package com.mapbox.maps.plugin.viewport.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.firebase.messaging.Constants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000\u001a \u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"createAnimatorSet", "Landroid/animation/AnimatorSet;", "animators", "", "Landroid/animation/Animator;", "normalizeBearing", "", "currentBearing", "targetBearing", "screenDistanceFromMapCenterToTarget", "cameraManager", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "currentCenter", "Lcom/mapbox/geojson/Point;", "targetCenter", "shortestRotation", Constants.MessagePayloadKeys.FROM, "to", "constrainDurationTo", "maxDuration", "", "roundTo", "numFractionDigits", "", "plugin-viewport_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TransitionUtilsKt {
    public static final AnimatorSet constrainDurationTo(AnimatorSet animatorSet, long j8) {
        Object obj;
        animatorSet.getClass();
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        Iterator<T> it = childAnimations.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Animator animator = (Animator) next;
                long duration = animator.getDuration() + animator.getStartDelay();
                do {
                    Object next2 = it.next();
                    Animator animator2 = (Animator) next2;
                    long duration2 = animator2.getDuration() + animator2.getStartDelay();
                    if (duration < duration2) {
                        next = next2;
                        duration = duration2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Animator animator3 = (Animator) obj;
        if (animator3 != null) {
            long duration3 = animator3.getDuration() + animator3.getStartDelay();
            if (duration3 > j8) {
                double d14 = j8 / duration3;
                ArrayList<Animator> childAnimations2 = animatorSet.getChildAnimations();
                childAnimations2.getClass();
                for (Animator animator4 : childAnimations2) {
                    animator4.setStartDelay((long) (animator4.getStartDelay() * d14));
                    animator4.setDuration((long) (animator4.getDuration() * d14));
                }
            }
        }
        return animatorSet;
    }

    public static final AnimatorSet createAnimatorSet(List<? extends Animator> list) {
        list.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        return animatorSet;
    }

    public static final double normalizeBearing(double d14, double d15) {
        return roundTo(d14 + shortestRotation(d14, d15), 6);
    }

    private static final double roundTo(double d14, int i14) {
        double dPow = Math.pow(10.0d, i14);
        return ((double) MathKt.b(d14 * dPow)) / dPow;
    }

    public static final double screenDistanceFromMapCenterToTarget(MapCameraManagerDelegate mapCameraManagerDelegate, Point point, Point point2) {
        mapCameraManagerDelegate.getClass();
        point.getClass();
        point2.getClass();
        ScreenCoordinate screenCoordinatePixelForCoordinate = mapCameraManagerDelegate.pixelForCoordinate(point);
        ScreenCoordinate screenCoordinatePixelForCoordinate2 = mapCameraManagerDelegate.pixelForCoordinate(point2);
        return Math.hypot(screenCoordinatePixelForCoordinate.getX() - screenCoordinatePixelForCoordinate2.getX(), screenCoordinatePixelForCoordinate.getY() - screenCoordinatePixelForCoordinate2.getY());
    }

    private static final double shortestRotation(double d14, double d15) {
        return (((d15 - d14) + ((double) 540)) % ((double) 360)) - ((double) 180);
    }
}
