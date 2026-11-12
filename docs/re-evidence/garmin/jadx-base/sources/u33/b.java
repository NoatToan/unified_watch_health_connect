package u33;

import androidx.room.a0;
import s33.k;
import s33.l;
import s33.q;
import s33.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final C3157b A;
    public static final C3157b B;
    public static final C3157b C;
    public static final C3157b D;
    public static final C3157b E;
    public static final C3157b F;
    public static final C3157b G;
    public static final C3157b H;
    public static final C3157b I;
    public static final C3157b J;
    public static final C3157b K;
    public static final C3157b L;
    public static final C3157b M;
    public static final C3157b N;
    public static final C3157b O;
    public static final C3157b P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3157b f168295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3157b f168296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3157b f168297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f168298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f168299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f168300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3157b f168301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3157b f168302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3157b f168303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3157b f168304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3157b f168305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3157b f168306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C3157b f168307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3157b f168308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3157b f168309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f168310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3157b f168311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3157b f168312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C3157b f168313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C3157b f168314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C3157b f168315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C3157b f168316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C3157b f168317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C3157b f168318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C3157b f168319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C3157b f168320z;

    /* JADX INFO: renamed from: u33.b$b, reason: collision with other inner class name */
    public static class C3157b extends d<Boolean> {
        public C3157b(int i14) {
            super(i14, 1);
        }

        @Override // u33.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Boolean d(int i14) {
            return Boolean.valueOf((i14 & (1 << this.f168322a)) != 0);
        }
    }

    public static class c<E extends z33.h.a> extends d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E[] f168321c;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(int i14, E[] eArr) {
            if (eArr == null) {
                vb.h.s("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
                throw null;
            }
            int i15 = 1;
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i16 = 31; i16 >= 0; i16--) {
                    if (((1 << i16) & length) != 0) {
                        i15 = 1 + i16;
                    }
                }
                a0.s(eArr.getClass(), "Empty enum: ");
                throw null;
            }
            super(i14, i15);
            this.f168321c = eArr;
        }

        @Override // u33.b.d
        public final Object d(int i14) {
            int i15 = (1 << this.f168323b) - 1;
            int i16 = this.f168322a;
            int i17 = (i14 & (i15 << i16)) >> i16;
            for (E e4 : this.f168321c) {
                if (e4.getNumber() == i17) {
                    return e4;
                }
            }
            return null;
        }
    }

    public static abstract class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f168322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f168323b;

        private d(int i14, int i15) {
            this.f168322a = i14;
            this.f168323b = i15;
        }

        public static c a(d dVar, z33.h.a[] aVarArr) {
            return new c(dVar.f168322a + dVar.f168323b, aVarArr);
        }

        public static C3157b b(d<?> dVar) {
            return new C3157b(dVar.f168322a + dVar.f168323b);
        }

        public static C3157b c() {
            return new C3157b(0);
        }

        public abstract E d(int i14);
    }

    static {
        C3157b c3157bC = d.c();
        f168295a = c3157bC;
        f168296b = d.b(c3157bC);
        C3157b c3157bC2 = d.c();
        f168297c = c3157bC2;
        c cVarA = d.a(c3157bC2, z.values());
        f168298d = cVarA;
        c cVarA2 = d.a(cVarA, l.values());
        f168299e = cVarA2;
        c cVarA3 = d.a(cVarA2, s33.c.EnumC2957c.values());
        f168300f = cVarA3;
        C3157b c3157bB = d.b(cVarA3);
        f168301g = c3157bB;
        C3157b c3157bB2 = d.b(c3157bB);
        f168302h = c3157bB2;
        C3157b c3157bB3 = d.b(c3157bB2);
        f168303i = c3157bB3;
        C3157b c3157bB4 = d.b(c3157bB3);
        f168304j = c3157bB4;
        C3157b c3157bB5 = d.b(c3157bB4);
        f168305k = c3157bB5;
        C3157b c3157bB6 = d.b(c3157bB5);
        f168306l = c3157bB6;
        f168307m = d.b(c3157bB6);
        C3157b c3157bB7 = d.b(cVarA);
        f168308n = c3157bB7;
        C3157b c3157bB8 = d.b(c3157bB7);
        f168309o = c3157bB8;
        d.a(c3157bB8, q.values());
        c cVarA4 = d.a(cVarA2, k.values());
        f168310p = cVarA4;
        C3157b c3157bB9 = d.b(cVarA4);
        f168311q = c3157bB9;
        C3157b c3157bB10 = d.b(c3157bB9);
        f168312r = c3157bB10;
        C3157b c3157bB11 = d.b(c3157bB10);
        f168313s = c3157bB11;
        C3157b c3157bB12 = d.b(c3157bB11);
        f168314t = c3157bB12;
        C3157b c3157bB13 = d.b(c3157bB12);
        f168315u = c3157bB13;
        C3157b c3157bB14 = d.b(c3157bB13);
        f168316v = c3157bB14;
        C3157b c3157bB15 = d.b(c3157bB14);
        f168317w = c3157bB15;
        C3157b c3157bB16 = d.b(c3157bB15);
        f168318x = c3157bB16;
        d.a(c3157bB16, q.values());
        C3157b c3157bB17 = d.b(cVarA4);
        f168319y = c3157bB17;
        C3157b c3157bB18 = d.b(c3157bB17);
        f168320z = c3157bB18;
        C3157b c3157bB19 = d.b(c3157bB18);
        A = c3157bB19;
        C3157b c3157bB20 = d.b(c3157bB19);
        B = c3157bB20;
        C3157b c3157bB21 = d.b(c3157bB20);
        C = c3157bB21;
        C3157b c3157bB22 = d.b(c3157bB21);
        D = c3157bB22;
        C3157b c3157bB23 = d.b(c3157bB22);
        E = c3157bB23;
        C3157b c3157bB24 = d.b(c3157bB23);
        F = c3157bB24;
        C3157b c3157bB25 = d.b(c3157bB24);
        G = c3157bB25;
        d.a(c3157bB25, q.values());
        C3157b c3157bB26 = d.b(c3157bC2);
        H = c3157bB26;
        C3157b c3157bB27 = d.b(c3157bB26);
        I = c3157bB27;
        J = d.b(c3157bB27);
        C3157b c3157bB28 = d.b(cVarA2);
        K = c3157bB28;
        C3157b c3157bB29 = d.b(c3157bB28);
        L = c3157bB29;
        M = d.b(c3157bB29);
        C3157b c3157bC3 = d.c();
        N = c3157bC3;
        O = d.b(c3157bC3);
        P = d.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    public static /* synthetic */ void a(int i14) {
        Object[] objArr = new Object[3];
        if (i14 == 1) {
            objArr[0] = "modality";
        } else if (i14 == 2) {
            objArr[0] = "kind";
        } else if (i14 == 5) {
            objArr[0] = "modality";
        } else if (i14 == 6) {
            objArr[0] = "memberKind";
        } else if (i14 == 8) {
            objArr[0] = "modality";
        } else if (i14 == 9) {
            objArr[0] = "memberKind";
        } else if (i14 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i14) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z14, z zVar, l lVar) {
        if (zVar == null) {
            a(10);
            throw null;
        }
        if (lVar == null) {
            a(11);
            throw null;
        }
        C3157b c3157b = f168297c;
        c3157b.getClass();
        int i14 = z14 ? 1 << c3157b.f168322a : 0;
        c cVar = f168299e;
        cVar.getClass();
        int number = i14 | (lVar.getNumber() << cVar.f168322a);
        c cVar2 = f168298d;
        cVar2.getClass();
        int number2 = number | (zVar.getNumber() << cVar2.f168322a);
        K.getClass();
        L.getClass();
        M.getClass();
        return number2;
    }
}
