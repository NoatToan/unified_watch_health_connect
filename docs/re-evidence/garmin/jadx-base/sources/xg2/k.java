package xg2;

import c2.l;
import c2.x2;
import ew1.u1;
import h4.r;
import java.util.ArrayList;
import java.util.List;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190973a;

        static {
            int[] iArr = new int[xg2.a.values().length];
            try {
                iArr[xg2.a.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg2.a.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg2.a.Destructive.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f190973a = iArr;
        }
    }

    public static final void a(String str, e23.a aVar, xg2.a aVar2, boolean z14, boolean z15, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1144524619);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(aVar2 == null ? -1 : aVar2.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(rVarF, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            r rVarC = l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            z3.e eVarC = z3.f.c(1998693826, new rw0.g(z14, 20), o0VarE);
            String str2 = z14 ? "" : str;
            boolean z16 = z15 && !z14;
            int i16 = a.f190973a[aVar2.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-376511226);
                lg2.m.f112346a.c(rVarC, eVarC, str2, z16, aVar, o0VarE, ((i15 << 9) & 57344) | 196656);
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(-376503128);
                lg2.m.f112346a.d(eVarC, str2, rVarC, z16, aVar, o0VarE, ((i15 << 9) & 57344) | 196656, 0);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -376512380, false);
                }
                o0VarE.C(-376494902);
                lg2.m.f112346a.a(rVarC, eVarC, str2, z16, aVar, o0VarE, ((i15 << 9) & 57344) | 196656);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(str, aVar, aVar2, z14, z15, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    public static final void b(List<i> list, m mVar, int i14) {
        list.getClass();
        o0 o0VarE = mVar.E(930628825);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            ArrayList<i> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((i) obj).f190971e) {
                    arrayList.add(obj);
                }
            }
            for (i iVar : arrayList) {
                String str = iVar.f190967a;
                boolean zB = o0VarE.B(iVar);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new wd.c(iVar, 27);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new wd.c(iVar, 27);
                        o0VarE.K(objQ);
                    }
                }
                a(str, (e23.a) objQ, iVar.f190969c, iVar.f190970d, iVar.f190972f, o0VarE, 0);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 25);
        }
    }
}
