package o4;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    /* JADX WARN: Code duplicated, block: B:66:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x017a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    public static f a(int i14, int i15, int i16, int i17) {
        int i18;
        ColorSpace colorSpace;
        String str;
        float[] fArrA;
        p4.r rVar;
        int i19;
        float[] fArr;
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        if ((i17 & 4) != 0) {
            w0.f129024b.getClass();
            i18 = 0;
        } else {
            i18 = i16;
        }
        p4.e eVar = p4.e.f135544a;
        eVar.getClass();
        p4.q qVar = p4.e.f135549f;
        g.b(i18);
        int i24 = p.f128926a;
        Bitmap.Config configB = g.b(i18);
        int i25 = l0.f128888a;
        eVar.getClass();
        if (p005kotlin.jvm.internal.s.g(qVar, qVar)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135561r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135562s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135559p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135554k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135553j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135564u)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135563t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135555l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135556m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135551h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135552i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135550g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135557n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135560q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!p005kotlin.jvm.internal.s.g(qVar, p4.e.f135558o)) {
                ColorSpace.Rgb.TransferParameters transferParameters = null;
                if (Build.VERSION.SDK_INT >= 34) {
                    int i26 = m0.f128890a;
                    if (p005kotlin.jvm.internal.s.g(qVar, p4.e.f135566w)) {
                        colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace = p005kotlin.jvm.internal.s.g(qVar, p4.e.f135567x) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace == null) {
                        if (qVar != null) {
                            str = qVar.f135541a;
                            fArrA = qVar.f135602d.a();
                            rVar = qVar.f135605g;
                            if (rVar != null) {
                                i19 = 0;
                                transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f135619b, rVar.f135620c, rVar.f135621d, rVar.f135622e, rVar.f135623f, rVar.f135624g, rVar.f135618a);
                            } else {
                                i19 = 0;
                            }
                            fArr = qVar.f135607i;
                            if (transferParameters != null) {
                                rgb2 = new ColorSpace.Rgb(str, qVar.f135606h, fArrA, transferParameters);
                                if (!Float.isNaN(fArr[i19]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                                    rgb2 = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                                rgb = rgb2;
                            } else {
                                String str2 = qVar.f135541a;
                                float[] fArr2 = qVar.f135606h;
                                final p4.q.c cVar = qVar.f135610l;
                                final int i27 = i19;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: o4.k0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d14) {
                                        int i28 = i27;
                                        e23.l lVar = cVar;
                                        switch (i28) {
                                            case 0:
                                                int i29 = l0.f128888a;
                                                break;
                                            default:
                                                int i30 = l0.f128888a;
                                                break;
                                        }
                                        return ((Number) lVar.invoke(Double.valueOf(d14))).doubleValue();
                                    }
                                };
                                final p4.q.b bVar = qVar.f135613o;
                                final int i28 = 1;
                                rgb = new ColorSpace.Rgb(str2, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: o4.k0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d14) {
                                        int i29 = i28;
                                        e23.l lVar = bVar;
                                        switch (i29) {
                                            case 0:
                                                int i210 = l0.f128888a;
                                                break;
                                            default:
                                                int i30 = l0.f128888a;
                                                break;
                                        }
                                        return ((Number) lVar.invoke(Double.valueOf(d14))).doubleValue();
                                    }
                                }, qVar.f135603e, qVar.f135604f);
                            }
                        } else {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                    }
                } else if (qVar != null) {
                    str = qVar.f135541a;
                    fArrA = qVar.f135602d.a();
                    rVar = qVar.f135605g;
                    if (rVar != null) {
                        i19 = 0;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f135619b, rVar.f135620c, rVar.f135621d, rVar.f135622e, rVar.f135623f, rVar.f135624g, rVar.f135618a);
                    } else {
                        i19 = 0;
                    }
                    fArr = qVar.f135607i;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, qVar.f135606h, fArrA, transferParameters);
                        if (!Float.isNaN(fArr[i19])) {
                            rgb2 = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                        rgb = rgb2;
                    } else {
                        String str3 = qVar.f135541a;
                        float[] fArr3 = qVar.f135606h;
                        final e23.l cVar2 = qVar.f135610l;
                        final int i29 = i19;
                        DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: o4.k0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d14) {
                                int i210 = i29;
                                e23.l lVar = cVar2;
                                switch (i210) {
                                    case 0:
                                        int i211 = l0.f128888a;
                                        break;
                                    default:
                                        int i30 = l0.f128888a;
                                        break;
                                }
                                return ((Number) lVar.invoke(Double.valueOf(d14))).doubleValue();
                            }
                        };
                        final e23.l bVar2 = qVar.f135613o;
                        final int i210 = 1;
                        rgb = new ColorSpace.Rgb(str3, fArr3, fArrA, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: o4.k0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d14) {
                                int i211 = i210;
                                e23.l lVar = bVar2;
                                switch (i211) {
                                    case 0:
                                        int i212 = l0.f128888a;
                                        break;
                                    default:
                                        int i30 = l0.f128888a;
                                        break;
                                }
                                return ((Number) lVar.invoke(Double.valueOf(d14))).doubleValue();
                            }
                        }, qVar.f135603e, qVar.f135604f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new f(Bitmap.createBitmap((DisplayMetrics) null, i14, i15, configB, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new f(Bitmap.createBitmap((DisplayMetrics) null, i14, i15, configB, true, rgb));
    }
}
