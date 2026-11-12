package ye1;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.f;
import java.util.ArrayList;
import java.util.List;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import v.h;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196817a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f196820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f196821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f196822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f196823g;

    public /* synthetic */ b(d0 d0Var, ArrayList arrayList, int i14, int i15, String str, String str2) {
        this.f196820d = d0Var;
        this.f196821e = arrayList;
        this.f196818b = i14;
        this.f196819c = i15;
        this.f196822f = str;
        this.f196823g = str2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:39:0x01aa  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z14;
        int i14;
        int i15 = this.f196817a;
        int i16 = this.f196818b;
        Object obj3 = this.f196823g;
        Object obj4 = this.f196822f;
        Object obj5 = this.f196821e;
        Object obj6 = this.f196820d;
        switch (i15) {
            case 0:
                d0 d0Var = (d0) obj6;
                List list = (List) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar = r.S;
                    r rVarD = x2.d(aVar, 1.0f);
                    j.f22691a.getClass();
                    j.b bVar = j.f22695e;
                    d.f81522a.getClass();
                    z zVarA = y.a(bVar, d.a.f81536n, mVar, 6);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarD, mVar);
                    g.V.getClass();
                    e0.a aVar2 = g.a.f81805b;
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
                    b4.c(g.a.f81810g, zVarA, mVar);
                    b4.c(g.a.f81809f, i2VarX, mVar);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    m.a aVar3 = m.f135153a;
                    if (d0Var == null || list == null || !(!list.isEmpty())) {
                        mVar.C(1445430776);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(f.f97933j, mVar);
                        boolean zB = mVar.B(str);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new y01.k(str, 5);
                            mVar.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new y01.k(str, 5);
                                mVar.K(objQ);
                            }
                        }
                        r rVarF = x2.f(v.c((l) objQ, aVar, false), 1.0f);
                        d92.b.f58625c.getClass();
                        z14 = false;
                        i14 = 6;
                        mh.c(str, c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(1445120249);
                        xe1.d.a(list, Float.valueOf(list.size()), Float.valueOf(this.f196819c), Float.valueOf(i16), mVar, 0);
                        mVar.f();
                        z14 = false;
                        i14 = 6;
                    }
                    String strQ = gl1.y.Q(mVar, R.string.label_last_4w);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(f.f97933j, mVar);
                    boolean zB2 = mVar.B(str2);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new y01.k(str2, i14);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new y01.k(str2, i14);
                            mVar.K(objQ2);
                        }
                    }
                    r rVarF2 = x2.f(v.c((l) objQ2, aVar, z14), 1.0f);
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    m mVar2 = mVar;
                    mh.c(strQ, c2.l.C(rVarF2, 0.0f, f14, 0.0f, f14, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z02.f.f((u4.d) obj6, (e23.a) obj5, (p) obj4, (e) obj3, (m) obj, p0.t(i16 | 1), this.f196819c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(u4.d dVar, e23.a aVar, p pVar, e eVar, int i14, int i15) {
        this.f196820d = dVar;
        this.f196821e = aVar;
        this.f196822f = pVar;
        this.f196823g = eVar;
        this.f196818b = i14;
        this.f196819c = i15;
    }
}
