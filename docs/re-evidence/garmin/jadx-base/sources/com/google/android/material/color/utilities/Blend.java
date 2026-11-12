package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i14, int i15, double d14) {
        Cam16 cam16FromInt = Cam16.fromInt(i14);
        Cam16 cam16FromInt2 = Cam16.fromInt(i15);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(o2.c.b(cam16FromInt2.getJstar(), jstar, d14, jstar), o2.c.b(cam16FromInt2.getAstar(), astar, d14, astar), o2.c.b(cam16FromInt2.getBstar(), bstar, d14, bstar)).toInt();
    }

    public static int harmonize(int i14, int i15) {
        Hct hctFromInt = Hct.fromInt(i14);
        Hct hctFromInt2 = Hct.fromInt(i15);
        double dMin = Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()) * dMin) + hctFromInt.getHue()), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i14, int i15, double d14) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i14, i15, d14)).getHue(), Cam16.fromInt(i14).getChroma(), ColorUtils.lstarFromArgb(i14)).toInt();
    }
}
