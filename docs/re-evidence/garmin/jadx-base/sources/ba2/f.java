package ba2;

import a11.h0;
import android.content.Context;
import c2.a0;
import c2.q;
import c2.u;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import e23.l;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import ho.e0;
import i3.fe;
import i3.wd;
import java.util.List;
import ky0.v1;
import l72.d3;
import l72.g3;
import l72.r1;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.x1;
import pv0.y;
import qw0.x;
import t70.s0;
import t70.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17074e;

    public /* synthetic */ f(a0 a0Var, int i14, int i15, Context context) {
        this.f17070a = 14;
        this.f17073d = a0Var;
        this.f17071b = i14;
        this.f17072c = i15;
        this.f17074e = context;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0302  */
    /* JADX WARN: Code duplicated, block: B:74:0x0320  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        int i14 = this.f17070a;
        int i15 = this.f17072c;
        int i16 = this.f17071b;
        Object obj3 = this.f17074e;
        Object obj4 = this.f17073d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.e(i16, p0.t(i15 | 1), (l) obj4, (r) obj3, (m) obj);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                cv1.h.a(i16, (i53.c) obj4, (p) obj3, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                h82.r rVar = h82.r.f82497a;
                ((h82.r) obj4).z(p0.t(i16 | 1), i15, (String) obj3, (m) obj);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                e0.b(this.f17071b, this.f17072c, (e23.a) obj4, (p) obj3, (m) obj, p0.t(3457));
                return Unit.INSTANCE;
            case 4:
                n1 n1Var = (n1) obj4;
                n1 n1Var2 = (n1) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar = r.S;
                    r rVarD = x2.d(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarD, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81528f, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    r rVarY2 = c2.l.y(aVar, eVar.f97920e);
                    int intValue = n1Var2.getIntValue();
                    boolean zB = mVar.B(n1Var);
                    Object objQ = mVar.q();
                    m.a aVar3 = m.f135153a;
                    if (zB) {
                        objQ = new h0(n1Var, 15);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new h0(n1Var, 15);
                            mVar.K(objQ);
                        }
                    }
                    l lVar = (l) objQ;
                    boolean zB2 = mVar.B(n1Var2);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new h0(n1Var2, 16);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new h0(n1Var2, 16);
                            mVar.K(objQ2);
                        }
                    }
                    e0.a(rVarY2, this.f17071b, this.f17072c, intValue, lVar, (l) objQ2, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                hw1.i.b((r) obj3, (hw1.f) obj4, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                v1.a((String) obj3, (l) obj4, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                r1.b((String) obj4, (p) obj3, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                d3.b((fe) obj4, (r) obj3, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                d3.a((wd) obj4, (r) obj3, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                g3.a(p0.t(i16 | 1), i15, (r) obj3, (String) obj4, (m) obj);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                lh0.r rVar2 = lh0.r.f112444a;
                ((lh0.r) obj4).f((e23.a) obj3, i16, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).intValue();
                mw0.j.f((y) obj4, i16, (List) obj3, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 13:
                return KoinApplicationKt.KoinContext$lambda$7((Koin) obj4, (p) obj3, this.f17071b, this.f17072c, (m) obj, ((Integer) obj2).intValue());
            case 14:
                a0 a0Var = (a0) obj4;
                Context context = (Context) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar4 = r.S;
                    float f14 = SyslogConstants.LOG_LOCAL6;
                    g6.f.a aVar5 = g6.f.f75994b;
                    r rVarQ = x2.q(aVar4, f14);
                    h4.d.f81522a.getClass();
                    r rVarB = a0Var.b(rVarQ, h4.d.a.f81537o);
                    if (i16 < 0 || i15 < 0) {
                        mVar2.C(-1873975159);
                        f02.e.f67730a.getClass();
                        jC = f02.e.c(mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1874078482);
                        f02.c.f67726a.getClass();
                        gl.c.f77766a.getClass();
                        jC = gl.c.a(mVar2).b();
                        mVar2.f();
                    }
                    z72.k.c(rVarB, i53.a.a(new z72.l(0.1f, jC, null)), null, null, 0.0f, 0.0f, z3.f.c(-521591760, new nf1.c(context, i16, i15), mVar2), mVar2, 12582912, 124);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).intValue();
                x.a((List) obj3, (l) obj4, (m) obj, i16, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                r82.k.c((r) obj3, (i53.c) obj4, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                s0.c((x0) obj4, (e23.a) obj3, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                tf0.h.b(this.f17071b, this.f17072c, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                List<Integer> list = xn.x.f191633p;
                ((xn.x) obj4).j(i16, (List) obj3, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                y01.s.a((String) obj4, (e23.a) obj3, (m) obj, p0.t(i16 | 1), i15);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, int i15, n1 n1Var, n1 n1Var2) {
        this.f17070a = 4;
        this.f17071b = i14;
        this.f17072c = i15;
        this.f17073d = n1Var;
        this.f17074e = n1Var2;
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2, int i15, int i16) {
        this.f17070a = i16;
        this.f17071b = i14;
        this.f17073d = obj;
        this.f17074e = obj2;
        this.f17072c = i15;
    }

    public /* synthetic */ f(int i14, int i15, e23.a aVar, o13.h hVar, int i16, int i17) {
        this.f17070a = i17;
        this.f17071b = i14;
        this.f17072c = i15;
        this.f17073d = aVar;
        this.f17074e = hVar;
    }

    public /* synthetic */ f(l lVar, int i14, int i15, List list) {
        this.f17070a = 15;
        this.f17074e = list;
        this.f17071b = i14;
        this.f17073d = lVar;
        this.f17072c = i15;
    }

    public /* synthetic */ f(Object obj, int i14, Object obj2, int i15, int i16) {
        this.f17070a = i16;
        this.f17073d = obj;
        this.f17071b = i14;
        this.f17074e = obj2;
        this.f17072c = i15;
    }

    public /* synthetic */ f(Object obj, Object obj2, int i14, int i15, int i16) {
        this.f17070a = i16;
        this.f17073d = obj;
        this.f17074e = obj2;
        this.f17071b = i14;
        this.f17072c = i15;
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z14, int i14, int i15, int i16) {
        this.f17070a = i16;
        this.f17074e = obj;
        this.f17073d = obj2;
        this.f17071b = i14;
        this.f17072c = i15;
    }
}
