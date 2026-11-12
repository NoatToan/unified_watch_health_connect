package j0;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f95902a = new Rational(4, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rational f95903b = new Rational(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rational f95904c = new Rational(16, 9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rational f95905d = new Rational(9, 16);

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    public static final class C1835a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f95906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rational f95907b;

        public C1835a(Rational rational, Rational rational2) {
            this.f95907b = rational2 == null ? new Rational(4, 3) : rational2;
            this.f95906a = b(rational);
        }

        public static float a(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        public final RectF b(Rational rational) {
            float fFloatValue = rational.floatValue();
            Rational rational2 = this.f95907b;
            if (fFloatValue == rational2.floatValue()) {
                return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            }
            return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z14 = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF rectFB = b(rational3);
            RectF rectFB2 = b(rational4);
            float fWidth = rectFB.width();
            RectF rectF = this.f95906a;
            boolean z15 = fWidth >= rectF.width() && rectFB.height() >= rectF.height();
            if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                z14 = true;
            }
            if (z15 && z14) {
                return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
            }
            if (z15) {
                return -1;
            }
            if (z14) {
                return 1;
            }
            return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
        }
    }

    private a() {
    }

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = q0.c.f141971a;
        if (size.getHeight() * size.getWidth() >= q0.c.a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i14 = width % 16;
            if (i14 == 0 && height % 16 == 0) {
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i14 == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
            }
        }
        return false;
    }

    public static boolean b(int i14, int i15, Rational rational) {
        k7.h.a(i15 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i14)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i15 + (-16))) && numerator < ((double) (i15 + 16));
    }
}
