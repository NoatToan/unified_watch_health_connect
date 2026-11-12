package wz;

import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwz/a;", "", "<init>", "()V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f188122a = new b(b.a.LOWER, 0.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f188123b = j0.f134944a;

    static {
        new C3501a(null);
    }

    public int a(int i14) {
        List listM0 = h0.M0(d());
        int i15 = 0;
        for (Object obj : listM0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            if (i15 == listM0.size() - 1) {
                break;
            }
            if (i15 == 0 && iIntValue >= i14) {
                return iIntValue;
            }
            if (iIntValue < i14 && ((Number) listM0.get(i16)).intValue() >= i14) {
                return ((Number) listM0.get(i16)).intValue();
            }
            i15 = i16;
        }
        return i14;
    }

    public abstract double b();

    public abstract double c();

    public List<Integer> d() {
        return this.f188123b;
    }

    public final p<Float, Float> e(int i14) {
        double d14;
        double d15;
        double dMin;
        double dMax;
        int i15 = i14 - 1;
        double dC = (c() + b()) / ((double) 2);
        double d16 = 1.1d;
        while (d16 <= 2.0d) {
            double dB = (b() - c()) * d16;
            b bVar = this.f188122a;
            b.a aVar = bVar.f188124a;
            b.a aVar2 = bVar.f188124a;
            double d17 = bVar.f188125b;
            b.a aVar3 = b.a.LOWER;
            if (aVar == aVar3) {
                d15 = dC - (dB / 2.0d);
                d14 = dB + d15;
            } else {
                double d18 = (dB / 2.0d) + dC;
                double d19 = d18 - dB;
                d14 = d18;
                d15 = d19;
            }
            double d24 = dC;
            if (d15 == d14) {
                double d25 = i15;
                d15 -= d25;
                d14 += d25;
            }
            int iF = f(i15, d15, d14);
            if (iF <= 0) {
                iF = 1;
            }
            int iA = a(iF);
            if (aVar2 == aVar3) {
                double d26 = iA;
                dMax = Math.max(Math.floor(d15 / d26) * d26, d17);
                dMin = ((double) (iA * i15)) + dMax;
            } else {
                double d27 = iA;
                dMin = Math.min(Math.ceil(d14 / d27) * d27, d17);
                dMax = dMin - ((double) (iA * i15));
            }
            if (c() >= dMax && b() <= dMin) {
                return new p<>(Float.valueOf((float) dMax), Float.valueOf((float) dMin));
            }
            if (aVar2 == aVar3 && dMax == d17 && b() <= dMin) {
                return new p<>(Float.valueOf((float) dMax), Float.valueOf((float) dMin));
            }
            if (aVar2 == b.a.UPPER && dMin == d17 && c() >= dMax) {
                return new p<>(Float.valueOf((float) dMax), Float.valueOf((float) dMin));
            }
            d16 += 0.1d;
            dC = d24;
        }
        return new p<>(Float.valueOf((float) c()), Float.valueOf((float) b()));
    }

    public int f(int i14, double d14, double d15) {
        return MathKt.b((d15 - d14) / ((double) i14));
    }

    /* JADX INFO: renamed from: wz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwz/a$a;", "", "<init>", "()V", "", "DEFAULT_Y_AXIS_LABELS_COUNT", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3501a {
        public /* synthetic */ C3501a(j jVar) {
            this();
        }

        private C3501a() {
        }
    }
}
