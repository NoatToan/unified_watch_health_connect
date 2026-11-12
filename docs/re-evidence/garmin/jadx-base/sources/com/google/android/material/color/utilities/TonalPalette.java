package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d14, double d15, Hct hct) {
        this.hue = d14;
        this.chroma = d15;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d14, double d15) {
        Hct hctFrom = Hct.from(d14, d15, 50.0d);
        double dAbs = Math.abs(hctFrom.getChroma() - d15);
        for (double d16 = 1.0d; d16 < 50.0d && Math.round(d15) != Math.round(hctFrom.getChroma()); d16 += 1.0d) {
            Hct hctFrom2 = Hct.from(d14, d15, 50.0d + d16);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d15);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                hctFrom = hctFrom2;
            }
            Hct hctFrom3 = Hct.from(d14, d15, 50.0d - d16);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d15);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                hctFrom = hctFrom3;
            }
        }
        return hctFrom;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d14, double d15) {
        return new TonalPalette(d14, d15, createKeyColor(d14, d15));
    }

    public static TonalPalette fromInt(int i14) {
        return fromHct(Hct.fromInt(i14));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d14) {
        return Hct.from(this.hue, this.chroma, d14);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i14) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i14));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i14).toInt());
            this.cache.put(Integer.valueOf(i14), numValueOf);
        }
        return numValueOf.intValue();
    }
}
