package tb0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import s70.b0;
import ta0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f163642a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ub0.l f163643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<ub0.a, Unit> f163644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f163645c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ub0.l lVar, e23.l<? super ub0.a, Unit> lVar2, e23.a<Unit> aVar) {
            this.f163643a = lVar;
            this.f163644b = lVar2;
            this.f163645c = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                ub0.k.e(x2.f(h4.r.S, 1.0f), this.f163643a != ub0.l.PAUSED, true, true, 0, 1, this.f163644b, this.f163645c, mVar2, 224646);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163646a;

        static {
            int[] iArr = new int[ub0.l.values().length];
            try {
                iArr[ub0.l.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.l.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163646a = iArr;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f163642a = 270;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y yVar, String str, o90.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        o0 o0Var;
        yVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-73022062);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(yVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = str;
            i15 |= o0VarE.B(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj2 = aVar2;
            i15 |= o0VarE.r(obj2) ? 2048 : 1024;
        } else {
            obj2 = aVar2;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(yVar.f163732d, o0VarE);
            p1 p1VarC2 = s9.c.c(yVar.f163734f, o0VarE);
            o0Var = o0VarE;
            da0.p.d("device_discovery_lottie_pair_tutorial_screen", ((a0) p1VarC.getF182175a()).f163589a, aVar3, null, null, null, z3.f.c(1016092265, new dd1.d((Object) ((a0) p1VarC.getF182175a()).f163591c, obj, (Object) aVar, (e23.l) lVar, obj2, (Object) yVar, (Object) p1VarC, (Object) p1VarC2, 26), o0VarE), o0Var, ((i16 >> 6) & 896) | 12582918, 120);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b((Object) yVar, str, (Object) aVar, (Object) aVar2, (o13.h) aVar3, (o13.h) lVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    public static final void b(c2.a0 a0Var, String str, x xVar, ub0.l lVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1077391067);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(xVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarA = x80.c.a(x2.h(h4.r.S, f163642a), lVar2);
            boolean zR = o0VarE.r(xVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new b0(xVar, 24);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b0(xVar, 24);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar3 = (e23.l) objQ;
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new b0(lVar, 25);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b0(lVar, 25);
                    o0VarE.K(objQ2);
                }
            }
            p002j6.c.b(lVar3, rVarA, (e23.l) objQ2, o0VarE, 0, 0);
            ub0.b.a(a0Var, new ba0.a(xVar.f163728e, ""), gl1.y.Q(o0VarE, R.string.common_learn_more), str, o0VarE, (i15 & 14) | ((i15 << 6) & 7168));
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) a0Var, (Object) str, (Object) xVar, (Object) lVar, (e23.l) lVar2, i14, 20);
        }
    }

    public static final void c(ub0.l lVar, x xVar, String str, e23.a<Unit> aVar, e23.l<? super ub0.a, Unit> lVar2, e23.l<? super Float, Unit> lVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1434345763);
        int i15 = i14 | (o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 4 : 2) | (o0VarE.r(xVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(-1276823431, new a(lVar, lVar2, aVar), o0VarE), z3.f.c(-25634701, new mw0.h(23, str, xVar, lVar, lVar3), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(lVar, xVar, str, (e23.a) aVar, (e23.l) lVar2, (e23.l) lVar3, i14);
        }
    }
}
