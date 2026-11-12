package gw1;

import androidx.fragment.app.m;
import c.q;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import ew1.v1;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79855a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f79856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f79857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f79861g;

    public /* synthetic */ i(ArrayList arrayList, boolean z14, m mVar, boolean z15, boolean z16, q qVar, int i14) {
        this.f79859e = arrayList;
        this.f79856b = z14;
        this.f79860f = mVar;
        this.f79857c = z15;
        this.f79858d = z16;
        this.f79861g = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0162  */
    /* JADX WARN: Code duplicated, block: B:56:0x01da  */
    /* JADX WARN: Code duplicated, block: B:64:0x0208  */
    /* JADX WARN: Code duplicated, block: B:73:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x0269  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15 = this.f79855a;
        Object obj3 = this.f79861g;
        Object obj4 = this.f79860f;
        Object obj5 = this.f79859e;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                k.b((ArrayList) obj5, this.f79856b, (m) obj4, this.f79857c, this.f79858d, (q) obj3, (p3.m) obj, p0.t(262145));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                k11.m.e(this.f79856b, this.f79857c, this.f79858d, (l) obj5, (l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                w32.b.a((q71.e) obj5, (c42.b) obj4, this.f79856b, this.f79857c, this.f79858d, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                o51.f fVar = (o51.f) obj5;
                l lVar = (l) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar = r.S;
                    r rVarE = u1.n.e(x2.d(aVar, 1.0f), p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    boolean z14 = this.f79856b;
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (z14) {
                        mVar.C(-1659710740);
                        r rVarD = x2.d(aVar, 1.0f);
                        z zVarA2 = y.a(c2.j.f22696f, h4.d.a.f81537o, mVar, 54);
                        int iHashCode2 = Long.hashCode(mVar.getU());
                        i2 i2VarX2 = mVar.x();
                        r rVarC2 = h4.k.c(rVarD, mVar);
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
                        b4.c(eVar, zVarA2, mVar);
                        b4.c(c1623g, i2VarX2, mVar);
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                        }
                        b4.c(fVar2, rVarC2, mVar);
                        String strQ = gl1.y.Q(mVar, R.string.txt_empty_page_unable_load);
                        d92.b.f58624b.getClass();
                        i14 = 0;
                        mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                        mVar = mVar;
                        f0 f0Var = f0.f110999a;
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_try_again);
                        boolean zB = mVar.B(lVar);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new ya0.f0(lVar, 12);
                            mVar.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ya0.f0(lVar, 12);
                                mVar.K(objQ);
                            }
                        }
                        f0Var.k(strQ2, null, false, (e23.a) objQ, mVar, 0, 6);
                        mVar.y();
                        mVar.f();
                    } else {
                        i14 = 0;
                        if (this.f79857c) {
                            mVar.C(-1658657360);
                            mVar.f();
                        } else {
                            mVar.C(-1659043682);
                            if (this.f79858d) {
                                mVar.C(-1659016030);
                                z41.f.a(fVar, lVar, mVar, 0);
                                mVar.f();
                            } else {
                                mVar.C(-1658837501);
                                z41.g.a(fVar, lVar, mVar, 0);
                                mVar.f();
                            }
                            mVar.f();
                        }
                    }
                    mVar.y();
                    o51.g gVar = fVar.H;
                    if (gVar.f129264c) {
                        mVar.C(-1743702883);
                        String str = fVar.H.f129265d;
                        boolean zB2 = mVar.B(lVar);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new ya0.f0(lVar, 13);
                            mVar.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ya0.f0(lVar, 13);
                                mVar.K(objQ2);
                            }
                        }
                        f51.a.a(i14, (e23.a) objQ2, str, mVar);
                        mVar.f();
                    } else if (gVar.f129263b) {
                        mVar.C(-1743399579);
                        boolean zB3 = mVar.B(lVar);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new ya0.f0(lVar, 14);
                            mVar.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new ya0.f0(lVar, 14);
                                mVar.K(objQ3);
                            }
                        }
                        xy2.b.g((e23.a) objQ3, mVar, i14);
                        mVar.f();
                    } else {
                        mVar.C(-1743214106);
                        mVar.f();
                    }
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(-1743168815);
                        boolean zB4 = mVar.B(p1Var);
                        Object objQ4 = mVar.q();
                        if (zB4) {
                            objQ4 = new l0(p1Var, 19);
                            mVar.K(objQ4);
                        } else {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l0(p1Var, 19);
                                mVar.K(objQ4);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ4;
                        boolean zB5 = mVar.B(lVar) | mVar.B(p1Var);
                        Object objQ5 = mVar.q();
                        if (zB5) {
                            objQ5 = new v1(lVar, p1Var, 29);
                            mVar.K(objQ5);
                        } else {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new v1(lVar, p1Var, 29);
                                mVar.K(objQ5);
                            }
                        }
                        o53.f0.h(aVar4, (e23.a) objQ5, mVar, i14);
                        mVar.f();
                    } else {
                        mVar.C(-1742841114);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(o51.f fVar, l lVar, p1 p1Var, boolean z14, boolean z15, boolean z16) {
        this.f79859e = fVar;
        this.f79860f = lVar;
        this.f79861g = p1Var;
        this.f79856b = z14;
        this.f79857c = z15;
        this.f79858d = z16;
    }

    public /* synthetic */ i(q71.e eVar, c42.b bVar, boolean z14, boolean z15, boolean z16, e23.a aVar, int i14) {
        this.f79859e = eVar;
        this.f79860f = bVar;
        this.f79856b = z14;
        this.f79857c = z15;
        this.f79858d = z16;
        this.f79861g = aVar;
    }

    public /* synthetic */ i(boolean z14, boolean z15, boolean z16, l lVar, l lVar2, e23.a aVar, int i14) {
        this.f79856b = z14;
        this.f79857c = z15;
        this.f79858d = z16;
        this.f79859e = lVar;
        this.f79860f = lVar2;
        this.f79861g = aVar;
    }
}
