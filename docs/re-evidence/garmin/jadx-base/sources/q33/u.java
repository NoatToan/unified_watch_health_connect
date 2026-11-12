package q33;

import lc.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements t<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f142537a = new u();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142538a;

        static {
            int[] iArr = new int[q23.h.values().length];
            try {
                iArr[q23.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q23.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q23.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q23.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q23.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q23.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q23.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q23.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f142538a = iArr;
        }
    }

    private u() {
    }

    public static s g(String str) {
        g43.d dVar;
        char cCharAt = str.charAt(0);
        g43.d[] dVarArrValues = g43.d.values();
        int length = dVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i14];
            if (dVar.c().charAt(0) == cCharAt) {
                break;
            }
            i14++;
        }
        if (dVar != null) {
            return new s.d(dVar);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            return new s.a(g(str.substring(1)));
        }
        if (cCharAt == 'L') {
            d53.w.D(str, ';');
        }
        return new s.c(fb1.c.m(1, 1, str));
    }

    public static String h(s sVar) {
        String strC;
        sVar.getClass();
        if (sVar instanceof s.a) {
            return "[".concat(h(((s.a) sVar).f142534j));
        }
        if (sVar instanceof s.d) {
            g43.d dVar = ((s.d) sVar).f142536j;
            return (dVar == null || (strC = dVar.c()) == null) ? "V" : strC;
        }
        if (sVar instanceof s.c) {
            return androidx.room.a0.m(new StringBuilder("L"), ((s.c) sVar).f142535j, ';');
        }
        u0.r();
        return null;
    }

    @Override // q33.t
    public final /* bridge */ /* synthetic */ s a(String str) {
        return g(str);
    }

    @Override // q33.t
    public final s.c b(String str) {
        return new s.c(str);
    }

    @Override // q33.t
    public final s.d c(q23.h hVar) {
        switch (a.f142538a[hVar.ordinal()]) {
            case 1:
                s.f142525a.getClass();
                return s.f142526b;
            case 2:
                s.f142525a.getClass();
                return s.f142527c;
            case 3:
                s.f142525a.getClass();
                return s.f142528d;
            case 4:
                s.f142525a.getClass();
                return s.f142529e;
            case 5:
                s.f142525a.getClass();
                return s.f142530f;
            case 6:
                s.f142525a.getClass();
                return s.f142531g;
            case 7:
                s.f142525a.getClass();
                return s.f142532h;
            case 8:
                s.f142525a.getClass();
                return s.f142533i;
            default:
                u0.r();
                return null;
        }
    }

    @Override // q33.t
    public final s.c d() {
        return new s.c("java/lang/Class");
    }

    @Override // q33.t
    public final s e(Object obj) {
        g43.d dVar;
        s sVar = (s) obj;
        sVar.getClass();
        if (!(sVar instanceof s.d) || (dVar = ((s.d) sVar).f142536j) == null) {
            return sVar;
        }
        x33.c cVar = dVar.f75869d;
        if (cVar == null) {
            g43.d.a(15);
            throw null;
        }
        String strE = g43.c.c(cVar).e();
        strE.getClass();
        return new s.c(strE);
    }

    @Override // q33.t
    public final /* bridge */ /* synthetic */ String f(s sVar) {
        return h(sVar);
    }
}
