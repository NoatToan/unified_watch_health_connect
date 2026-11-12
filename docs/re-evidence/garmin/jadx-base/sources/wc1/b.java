package wc1;

import c22.l3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwc1/b;", "", "<init>", "()V", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f184311a = new b();

    private b() {
    }

    public static float a(float f14, Float f15, tc1.a aVar, sc1.a aVar2) {
        aVar2.getClass();
        if (aVar2 == sc1.a.Time) {
            long jMax = (long) f14;
            if (f15 != null) {
                jMax = Math.max(jMax, (long) f15.floatValue());
            }
            Long l14 = aVar.f163814d;
            if (l14 != null) {
                jMax = Math.max(jMax, l14.longValue());
            }
            Long l15 = aVar.f163815e;
            if (l15 != null) {
                jMax = Math.max(jMax, l15.longValue());
            }
            return jMax;
        }
        double dMax = f14;
        if (f15 != null) {
            dMax = Math.max(dMax, f15.floatValue());
        }
        Double d14 = aVar.f163819i;
        if (d14 != null) {
            l3.a aVar3 = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            boolean zC = mg0.b.c();
            aVar3.getClass();
            dMax = Math.max(dMax, l3.a.u(dDoubleValue, zC));
        }
        Double d15 = aVar.f163820j;
        if (d15 != null) {
            l3.a aVar4 = l3.f23124b;
            double dDoubleValue2 = d15.doubleValue();
            boolean zC2 = mg0.b.c();
            aVar4.getClass();
            dMax = Math.max(dMax, l3.a.u(dDoubleValue2, zC2));
        }
        return (float) dMax;
    }

    public static float b(float f14, Float f15, tc1.a aVar, sc1.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (aVar2 == sc1.a.Time) {
            long jMin = (long) f14;
            if (f15 != null) {
                jMin = Math.min(jMin, (long) f15.floatValue());
            }
            Long l14 = aVar.f163814d;
            if (l14 != null) {
                jMin = Math.min(jMin, l14.longValue());
            }
            Long l15 = aVar.f163815e;
            if (l15 != null) {
                jMin = Math.min(jMin, l15.longValue());
            }
            return jMin;
        }
        double dMin = f14;
        if (f15 != null) {
            dMin = Math.min(dMin, f15.floatValue());
        }
        Double d14 = aVar.f163819i;
        if (d14 != null) {
            l3.a aVar3 = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            boolean zC = mg0.b.c();
            aVar3.getClass();
            dMin = Math.min(dMin, l3.a.u(dDoubleValue, zC));
        }
        Double d15 = aVar.f163820j;
        if (d15 != null) {
            l3.a aVar4 = l3.f23124b;
            double dDoubleValue2 = d15.doubleValue();
            boolean zC2 = mg0.b.c();
            aVar4.getClass();
            dMin = Math.min(dMin, l3.a.u(dDoubleValue2, zC2));
        }
        return (float) dMin;
    }
}
