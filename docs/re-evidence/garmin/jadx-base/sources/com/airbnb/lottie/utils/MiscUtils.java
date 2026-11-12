package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeData;
import j20.x;
import java.util.List;
import o2.c;

/* JADX INFO: loaded from: classes7.dex */
public class MiscUtils {
    private static final PointF pathFromDataCurrentPoint = new PointF();

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i14, int i15, int i16) {
        return Math.max(i15, Math.min(i16, i14));
    }

    public static boolean contains(float f14, float f15, float f16) {
        return f14 >= f15 && f14 <= f16;
    }

    private static int floorDiv(int i14, int i15) {
        int i16 = i14 / i15;
        return (((i14 ^ i15) >= 0) || i14 % i15 == 0) ? i16 : i16 - 1;
    }

    public static int floorMod(float f14, float f15) {
        return floorMod((int) f14, (int) f15);
    }

    public static void getPathFromData(ShapeData shapeData, Path path) {
        Path path2;
        path.reset();
        PointF initialPoint = shapeData.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        pathFromDataCurrentPoint.set(initialPoint.x, initialPoint.y);
        int i14 = 0;
        while (i14 < shapeData.getCurves().size()) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(i14);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            PointF pointF = pathFromDataCurrentPoint;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
            i14++;
            path = path2;
        }
        Path path3 = path;
        if (shapeData.isClosed()) {
            path3.close();
        }
    }

    public static double lerp(double d14, double d15, double d16) {
        return c.b(d15, d14, d16, d14);
    }

    public static void resolveKeyPath(KeyPath keyPath, int i14, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.fullyResolvesTo(keyPathElementContent.getName(), i14)) {
            list.add(keyPath2.addKey(keyPathElementContent.getName()).resolve(keyPathElementContent));
        }
    }

    private static int floorMod(int i14, int i15) {
        return i14 - (i15 * floorDiv(i14, i15));
    }

    public static float clamp(float f14, float f15, float f16) {
        return Math.max(f15, Math.min(f16, f14));
    }

    public static float lerp(float f14, float f15, float f16) {
        return x.a(f15, f14, f16, f14);
    }

    public static double clamp(double d14, double d15, double d16) {
        return Math.max(d15, Math.min(d16, d14));
    }

    public static int lerp(int i14, int i15, float f14) {
        return (int) ((f14 * (i15 - i14)) + i14);
    }
}
