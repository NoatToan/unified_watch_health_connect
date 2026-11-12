package a11;

import b82.g1;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l1;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f366a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.FRACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f366a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Double.valueOf(((h) t7).a()), Double.valueOf(((h) t14).a()));
        }
    }

    public static final void a(final String str, final double d14, r rVar, final i iVar, final j0 j0Var, final e23.p<? super r, ? super Double, Unit> pVar, final e23.a<Unit> aVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        Object obj;
        Object obj2;
        o0 o0Var;
        final r rVar2;
        str.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1073200006);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.m(d14) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(iVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = j0Var;
            i16 |= o0VarE.B(obj) ? 16384 : 8192;
        } else {
            obj = j0Var;
        }
        if ((196608 & i14) == 0) {
            obj2 = pVar;
            i16 |= o0VarE.r(obj2) ? 131072 : 65536;
        } else {
            obj2 = pVar;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = i16;
        if (o0VarE.n(i18 & 1, (i18 & 599187) != 599186)) {
            r rVar3 = i17 != 0 ? r.NUMBER : rVar;
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(553067351);
            w13.c cVar = r.f370f;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                r rVar4 = (r) bVar.next();
                arrayList.add(new g1(gl1.y.Q(o0VarE, rVar4.f371a), null, gl1.y.Q(o0VarE, rVar4.f372b), null, 10, null));
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(rVar3);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new y1(d14);
                o0VarE.K(objQ2);
            }
            l1 l1Var = (l1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(c(d14, iVar), o0VarE);
            }
            n1 n1Var = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(b(d14, iVar), o0VarE);
            }
            o0Var = o0VarE;
            p004k6.c.a(aVar, new p004k6.u(false, false, false, 5, (p005kotlin.jvm.internal.j) null), z3.f.c(930846813, new j(str, fVarJ, obj, iVar, obj2, p1Var, l1Var, n1Var, (n1) objQ4, aVar, 0), o0VarE), o0Var, ((i18 >> 18) & 14) | 432, 0);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = rVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a11.k
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    q.a(str, d14, rVar2, iVar, j0Var, pVar, aVar, (p3.m) obj3, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final int b(double d14, i iVar) {
        double d15 = d14 - ((double) ((int) d14));
        List<h> listN0 = p13.h0.N0(iVar.f312c, new b());
        int i14 = 0;
        int i15 = 0;
        for (h hVar : listN0) {
            int i16 = i14 + 1;
            if (hVar.a() != d15) {
                if (d15 >= hVar.a()) {
                    i15 = i14;
                    i14 = i16;
                } else if (d15 - ((h) listN0.get(i15)).a() > hVar.a() - d15) {
                }
            }
            return i14;
        }
        return i15;
    }

    public static final int c(double d14, i iVar) {
        int iIndexOf = iVar.f313d.indexOf(Integer.valueOf(j23.t.f((int) d14, new j23.l(iVar.f310a, iVar.f311b))));
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static final double d(int i14, int i15, i iVar, int i16) {
        Integer num = (Integer) p13.h0.e0(i14, iVar.f313d);
        return new BigDecimal(String.valueOf(iVar.f312c.get(i15).a() + ((double) (num != null ? num.intValue() : iVar.f310a)))).setScale(i16, RoundingMode.HALF_UP).doubleValue();
    }
}
