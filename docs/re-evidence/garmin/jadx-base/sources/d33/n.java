package d33;

import java.util.ArrayList;
import java.util.List;
import o13.c0;
import o13.p;
import o13.v;
import o13.x;
import o13.z;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57418a;

        static {
            int[] iArr = new int[s33.b.C2953b.c.EnumC2956c.values().length];
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f57418a = iArr;
        }
    }

    public static final String a(u33.d dVar, int i14) {
        dVar.getClass();
        String strA = dVar.a(i14);
        return dVar.b(i14) ? ".".concat(strA) : strA;
    }

    public static final c33.d b(s33.b bVar, u33.d dVar) {
        bVar.getClass();
        dVar.getClass();
        String strA = a(dVar, bVar.f156461c);
        List<s33.b.C2953b> list = bVar.f156462d;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (s33.b.C2953b c2953b : list) {
            s33.b.C2953b.c cVar = c2953b.f156470d;
            cVar.getClass();
            c33.e eVarC = c(cVar, dVar);
            p pVar = eVarC != null ? new p(dVar.getString(c2953b.f156469c), eVarC) : null;
            if (pVar != null) {
                arrayListL.add(pVar);
            }
        }
        return new c33.d(strA, u0.l(arrayListL));
    }

    public static final c33.e c(s33.b.C2953b.c cVar, u33.d dVar) {
        cVar.getClass();
        dVar.getClass();
        boolean zBooleanValue = u33.b.P.d(cVar.f156490m).booleanValue();
        s33.b.C2953b.c.EnumC2956c enumC2956c = cVar.f156480c;
        if (zBooleanValue) {
            int i14 = enumC2956c != null ? a.f57418a[enumC2956c.ordinal()] : -1;
            if (i14 == 1) {
                byte b14 = (byte) cVar.f156481d;
                v.a aVar = v.f128608b;
                return new c33.e.p(b14, null);
            }
            if (i14 == 2) {
                short s8 = (short) cVar.f156481d;
                c0.a aVar2 = c0.f128567b;
                return new c33.e.s(s8, null);
            }
            if (i14 == 3) {
                int i15 = (int) cVar.f156481d;
                x.a aVar3 = x.f128613b;
                return new c33.e.q(i15, null);
            }
            if (i14 != 4) {
                androidx.core.view.j.x(cVar.f156480c, "Cannot read value of unsigned type: ");
                return null;
            }
            long j8 = cVar.f156481d;
            z.a aVar4 = z.f128618b;
            return new c33.e.r(j8, null);
        }
        switch (enumC2956c != null ? a.f57418a[enumC2956c.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                lc.u0.r();
                return null;
            case 1:
                return new c33.e.C0349e((byte) cVar.f156481d);
            case 2:
                return new c33.e.n((short) cVar.f156481d);
            case 3:
                return new c33.e.j((int) cVar.f156481d);
            case 4:
                return new c33.e.m(cVar.f156481d);
            case 5:
                return new c33.e.f((char) cVar.f156481d);
            case 6:
                return new c33.e.i(cVar.f156482e);
            case 7:
                return new c33.e.g(cVar.f156483f);
            case 8:
                return new c33.e.d(cVar.f156481d != 0);
            case 9:
                return new c33.e.o(dVar.getString(cVar.f156484g));
            case 10:
                String strA = a(dVar, cVar.f156485h);
                int i16 = cVar.f156489l;
                return i16 == 0 ? new c33.e.k(strA) : new c33.e.b(strA, i16);
            case 11:
                return new c33.e.h(a(dVar, cVar.f156485h), dVar.getString(cVar.f156486i));
            case 12:
                s33.b bVar = cVar.f156487j;
                bVar.getClass();
                return new c33.e.a(b(bVar, dVar));
            case 13:
                List<s33.b.C2953b.c> list = cVar.f156488k;
                ArrayList arrayListL = androidx.core.view.j.l(list);
                for (s33.b.C2953b.c cVar2 : list) {
                    cVar2.getClass();
                    c33.e eVarC = c(cVar2, dVar);
                    if (eVarC != null) {
                        arrayListL.add(eVarC);
                    }
                }
                return new c33.e.c(arrayListL);
        }
    }
}
