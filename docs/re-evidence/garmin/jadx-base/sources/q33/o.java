package q33;

import java.util.Set;
import n43.m0;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p13.a1;
import t23.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f142513b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<r33.a.EnumC2820a> f142514c = a1.b(r33.a.EnumC2820a.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<r33.a.EnumC2820a> f142515d = p13.u.m0(new r33.a.EnumC2820a[]{r33.a.EnumC2820a.FILE_FACADE, r33.a.EnumC2820a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u33.c f142516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u33.c f142517f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l43.n f142518a;

    static {
        new u33.c(1, 1, 2);
        f142516e = new u33.c(1, 1, 11);
        f142517f = new u33.c(1, 1, 13);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final n43.f0 a(h0 h0Var, x xVar) {
        o13.p<w33.e, s33.m> pVarI;
        xVar.getClass();
        r33.a aVarA = xVar.a();
        String[] strArr = aVarA.f150097c;
        if (strArr == null) {
            strArr = aVarA.f150098d;
        }
        if (strArr != null) {
            if (!f142515d.contains(aVarA.f150095a)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            String[] strArr2 = xVar.a().f150099e;
            try {
                if (strArr2 != null) {
                    try {
                        pVarI = w33.g.i(strArr, strArr2);
                        if (pVarI != null) {
                            w33.e eVar = pVarI.f128594a;
                            s33.m mVar = pVarI.f128595b;
                            r rVar = new r(xVar, mVar, eVar, d(xVar), e(xVar), b(xVar));
                            return new n43.f0(h0Var, mVar, eVar, xVar.a().f150096b, rVar, c(), "scope for " + rVar + " in " + h0Var, n.f142512a);
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw new IllegalStateException("Could not read data from ".concat(xVar.getLocation()), e4);
                    }
                }
            } catch (Throwable th3) {
                c().f110053c.getClass();
                u33.c cVar = xVar.a().f150096b;
                u33.c cVarA = c().f110053c.a();
                cVarA.getClass();
                u33.c cVar2 = cVar.f168326f ? u33.c.f168324g : u33.c.f168325h;
                int i14 = cVar2.f168291b;
                int i15 = cVarA.f168291b;
                if (i14 > i15 || (i14 >= i15 && cVar2.f168292c > cVarA.f168292c)) {
                    cVarA = cVar2;
                }
                int i16 = cVar.f168292c;
                int i17 = cVar.f168291b;
                boolean z14 = false;
                if ((i17 != 1 || i16 != 0) && i17 != 0) {
                    int i18 = cVarA.f168291b;
                    if (i17 > i18 || (i17 >= i18 && i16 > cVarA.f168292c)) {
                        z14 = true;
                    }
                    z14 = !z14;
                }
                if (z14) {
                    throw th3;
                }
                pVarI = null;
            }
        }
        return null;
    }

    public final n43.u b(x xVar) {
        c().f110053c.getClass();
        int i14 = xVar.a().f150101g;
        return ((i14 & 16) == 0 || (i14 & 32) != 0) ? n43.u.STABLE : n43.u.UNSTABLE;
    }

    public final l43.n c() {
        l43.n nVar = this.f142518a;
        if (nVar != null) {
            return nVar;
        }
        p005kotlin.jvm.internal.s.m("components");
        throw null;
    }

    public final l43.y<u33.c> d(x xVar) {
        c().f110053c.getClass();
        u33.c cVar = xVar.a().f150096b;
        u33.c cVarA = c().f110053c.a();
        cVarA.getClass();
        u33.c cVar2 = cVar.f168326f ? u33.c.f168324g : u33.c.f168325h;
        int i14 = cVar2.f168291b;
        int i15 = cVarA.f168291b;
        if (i14 > i15 || (i14 >= i15 && cVar2.f168292c > cVarA.f168292c)) {
            cVarA = cVar2;
        }
        int i16 = cVar.f168292c;
        int i17 = cVar.f168291b;
        boolean z14 = false;
        if ((i17 != 1 || i16 != 0) && i17 != 0) {
            int i18 = cVarA.f168291b;
            if (i17 > i18 || (i17 >= i18 && i16 > cVarA.f168292c)) {
                z14 = true;
            }
            z14 = !z14;
        }
        if (z14) {
            return null;
        }
        u33.c cVar3 = xVar.a().f150096b;
        u33.c cVar4 = u33.c.f168324g;
        u33.c cVarA2 = c().f110053c.a();
        u33.c cVarA3 = c().f110053c.a();
        boolean z15 = xVar.a().f150096b.f168326f;
        cVarA3.getClass();
        u33.c cVar5 = z15 ? cVar4 : u33.c.f168325h;
        int i19 = cVar5.f168291b;
        int i24 = cVarA3.f168291b;
        if (i19 > i24 || (i19 >= i24 && cVar5.f168292c > cVarA3.f168292c)) {
            cVarA3 = cVar5;
        }
        return new l43.y<>(cVar3, cVar4, cVarA2, cVarA3, xVar.getLocation());
    }

    public final boolean e(x xVar) {
        c().f110053c.getClass();
        c().f110053c.getClass();
        return (xVar.a().f150101g & 2) != 0 && xVar.a().f150096b.equals(f142516e);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final l43.i f(x xVar) {
        String[] strArr;
        o13.p<w33.e, s33.c> pVarF;
        r33.a aVarA = xVar.a();
        String[] strArr2 = aVarA.f150097c;
        if (strArr2 == null) {
            strArr2 = aVarA.f150098d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f142514c.contains(aVarA.f150095a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = xVar.a().f150099e) != null) {
            try {
                try {
                    pVarF = w33.g.f(strArr2, strArr);
                } catch (InvalidProtocolBufferException e4) {
                    throw new IllegalStateException("Could not read data from ".concat(xVar.getLocation()), e4);
                }
            } catch (Throwable th3) {
                c().f110053c.getClass();
                u33.c cVar = xVar.a().f150096b;
                u33.c cVarA = c().f110053c.a();
                cVarA.getClass();
                u33.c cVar2 = cVar.f168326f ? u33.c.f168324g : u33.c.f168325h;
                int i14 = cVar2.f168291b;
                int i15 = cVarA.f168291b;
                if (i14 > i15 || (i14 >= i15 && cVar2.f168292c > cVarA.f168292c)) {
                    cVarA = cVar2;
                }
                int i16 = cVar.f168292c;
                int i17 = cVar.f168291b;
                boolean z14 = false;
                if ((i17 != 1 || i16 != 0) && i17 != 0) {
                    int i18 = cVarA.f168291b;
                    if (i17 > i18 || (i17 >= i18 && i16 > cVarA.f168292c)) {
                        z14 = true;
                    }
                    z14 = !z14;
                }
                if (z14) {
                    throw th3;
                }
                pVarF = null;
            }
            if (pVarF != null) {
                return new l43.i(pVarF.f128594a, pVarF.f128595b, xVar.a().f150096b, new z(xVar, d(xVar), new m0(e(xVar), null, 2, null), b(xVar)));
            }
        }
        return null;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
