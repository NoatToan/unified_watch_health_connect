package i3;

/* JADX INFO: loaded from: classes.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.y3 f88102a = new p3.y3(new i01.j(24));

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88103a;

        static {
            int[] iArr = new int[n3.u0.values().length];
            try {
                iArr[n3.u0.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.u0.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n3.u0.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n3.u0.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n3.u0.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n3.u0.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n3.u0.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n3.u0.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n3.u0.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n3.u0.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n3.u0.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n3.u0.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n3.u0.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n3.u0.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[n3.u0.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f88103a = iArr;
        }
    }

    public static k2.a a(k2.a aVar) {
        dc.f87864a.getClass();
        k2.e eVar = dc.f87873j;
        return k2.a.c(aVar, eVar, null, null, eVar, 6);
    }

    public static final o4.r1 b(ec ecVar, n3.u0 u0Var) {
        switch (a.f88103a[u0Var.ordinal()]) {
            case 1:
                return ecVar.f87994e;
            case 2:
                return ecVar.f87996g;
            case 3:
                return ecVar.f87997h;
            case 4:
                return e(ecVar.f87994e);
            case 5:
                return ecVar.f87990a;
            case 6:
                return e(ecVar.f87990a);
            case 7:
                return k2.i.f102406a;
            case 8:
                return ecVar.f87993d;
            case 9:
                return ecVar.f87995f;
            case 10:
                return a(ecVar.f87993d);
            case 11:
                return e(ecVar.f87993d);
            case 12:
                return ecVar.f87992c;
            case 13:
                return o4.m1.f128891a;
            case 14:
                return ecVar.f87991b;
            case 15:
                return d(ecVar.f87993d);
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final o4.r1 c(n3.u0 u0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return b(s7.b(mVar), u0Var);
    }

    public static k2.a d(k2.a aVar) {
        dc.f87864a.getClass();
        k2.e eVar = dc.f87873j;
        return k2.a.c(aVar, null, eVar, eVar, null, 9);
    }

    public static k2.a e(k2.a aVar) {
        dc.f87864a.getClass();
        k2.e eVar = dc.f87873j;
        return k2.a.c(aVar, null, null, eVar, eVar, 3);
    }
}
