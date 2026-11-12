package o4;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f128867b;

        static {
            try {
                new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr = new int[Paint.Cap.values().length];
            try {
                iArr[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f128866a = iArr;
            int[] iArr2 = new int[Paint.Join.values().length];
            try {
                iArr2[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f128867b = iArr2;
        }
    }

    public static final Paint a(d1 d1Var) {
        if (!(d1Var instanceof h)) {
            y0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + p005kotlin.jvm.internal.s0.f105811a.b(d1Var.getClass()).getF16141b());
        }
        return ((h) d1Var).f128857a;
    }
}
