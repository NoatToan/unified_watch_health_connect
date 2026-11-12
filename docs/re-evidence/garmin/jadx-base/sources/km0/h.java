package km0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.q3;
import com.google.firebase.perf.util.Constants;
import e23.r;
import gl1.y;
import java.util.Iterator;
import lc.h0;
import lc.m0;
import lc.v;
import lc.v0;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import s1.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f105328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<b> f105329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f105330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f105331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f105332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r<String, String, Boolean, Boolean, Unit> f105333f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, x3<b> x3Var, m0 m0Var, i iVar, Context context, r<? super String, ? super String, ? super Boolean, ? super Boolean, Unit> rVar) {
            this.f105328a = dVar;
            this.f105329b = x3Var;
            this.f105330c = m0Var;
            this.f105331d = iVar;
            this.f105332e = context;
            this.f105333f = rVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = n.f135158a;
                d dVar = this.f105328a;
                b82.c.b(c2.l.p(c2.l.s(h4.r.S)), null, z3.f.c(2026122925, new ki1.f(dVar.ordinal() == x.j(d.f105312i), dVar.f105316d.invoke(this.f105329b.getF182175a()).booleanValue(), this.f105328a, this.f105330c, this.f105331d, this.f105332e, this.f105333f), mVar2), null, 0L, mVar2, 384, 26);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i iVar, e23.a<Unit> aVar, r<? super String, ? super String, ? super Boolean, ? super Boolean, Unit> rVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        d dVar;
        h0 h0Var;
        String str;
        Object next;
        iVar.getClass();
        aVar.getClass();
        rVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-233813137);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(rVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            m0 m0VarI = y.I(new v0[0], o0VarE);
            v vVar = (v) y.l(m0VarI, o0VarE).getF182175a();
            if (vVar == null || (h0Var = vVar.f111882b) == null || (str = h0Var.f111773b.f144347f) == null) {
                dVar = d.f105309f;
            } else {
                d.f105308e.getClass();
                Iterator<T> it = d.f105312i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.g(((d) next).name(), str));
                dVar = (d) next;
                if (dVar == null) {
                    dVar = d.f105309f;
                }
            }
            d dVar2 = dVar;
            p1 p1VarC = s9.c.c(iVar.f105338e, o0VarE);
            p1 p1VarC2 = s9.c.c(iVar.f105343j, o0VarE);
            p1 p1VarC3 = s9.c.c(iVar.f105340g, o0VarE);
            Object[] objArr = {dVar2};
            boolean zK = o0VarE.k(dVar2.ordinal());
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zK) {
                objQ = new jx0.e(dVar2, 21);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new jx0.e(dVar2, 21);
                    o0VarE.K(objQ);
                }
            }
            x3 x3VarB = s1.f.b(((Number) ((p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0)).getF182175a()).floatValue(), s1.l.d(Constants.FROZEN_FRAME_TIME, 0, e0.f155560a, 2), null, o0VarE, 0, 28);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
            z3.e eVarC = z3.f.c(1489359156, new jj2.c(dVar2, m0VarI, aVar, aVar2, 14), o0VarE);
            int i16 = k3.f22728a;
            o0Var = o0VarE;
            z02.d.a(zBooleanValue, eVarC, null, null, q3.c(o0VarE), z3.f.c(-490543560, new a11.j(dVar2, x3VarB, p1VarC, m0VarI, iVar, context, rVar, p1VarC2, aVar2, (p1) objQ2), o0Var), o0Var, 196656, 12);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(iVar, aVar, rVar, aVar2, i14, 15);
        }
    }
}
