package i41;

import o4.d0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90958a;

        static {
            int[] iArr = new int[x31.b.values().length];
            try {
                iArr[x31.b.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x31.b.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x31.b.POOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x31.b.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x31.b.UNBALANCED_LOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x31.b.BALANCED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x31.b.UNBALANCED_UPPER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x31.b.UNBALANCED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f90958a = iArr;
        }
    }

    public static final o92.b a(h hVar, m mVar) {
        long jA;
        o92.a aVar;
        hVar.getClass();
        boolean z14 = hVar.f90956d;
        x1 x1Var = n.f135158a;
        if (z14) {
            mVar.C(-539383676);
            h.f90942e.getClass();
            jA = h.a.a(hVar, mVar);
            mVar.f();
        } else {
            mVar.C(-539382971);
            mVar.f();
            d0.f128823b.getClass();
            jA = d0.f128831j;
        }
        long j8 = jA;
        if (z14) {
            mVar.C(459035555);
            mVar.f();
            aVar = null;
        } else {
            mVar.C(-539381372);
            h.f90942e.getClass();
            o92.a aVar2 = new o92.a(h.a.a(hVar, mVar), 2.0f, null);
            mVar.f();
            aVar = aVar2;
        }
        return new o92.b(hVar.f90955c, j8, aVar, null);
    }
}
