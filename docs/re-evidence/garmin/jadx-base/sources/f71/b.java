package f71;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e32.o;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import m92.h0;
import m92.i0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import r22.c0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f69426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f69427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f69429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f69430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f69431g;

    public /* synthetic */ b(List list, i53.f fVar, String str, long j8, long j14, r rVar) {
        this.f69425a = 0;
        this.f69428d = list;
        this.f69429e = fVar;
        this.f69430f = str;
        this.f69426b = j8;
        this.f69427c = j14;
        this.f69431g = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03df  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x031f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        char c14;
        Object aVar;
        int i14;
        float f14;
        m mVar;
        boolean z14;
        float f15;
        m mVar2;
        int i15 = this.f69425a;
        Object obj3 = this.f69431g;
        Object obj4 = this.f69430f;
        Object obj5 = this.f69429e;
        Object obj6 = this.f69428d;
        switch (i15) {
            case 0:
                List list = (List) obj6;
                i53.f fVar = (i53.f) obj5;
                String str = (String) obj4;
                r rVar = (r) obj3;
                m mVar3 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    j.f22691a.getClass();
                    j.b bVar = j.f22695e;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(bVar, h4.d.a.f81536n, mVar3, 6);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar2);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    m.a aVar3 = m.f135153a;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((h0.e.a) it.next()).f117347b != 0.0f) {
                                    if (fVar == null || !fVar.isEmpty()) {
                                        Iterator<E> it3 = fVar.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                h0.d.b bVar3 = (h0.d.b) it3.next();
                                                if (i0.d(bVar3) != 0.0f && bVar3.f117345c != 0.0f) {
                                                    mVar3.C(1924739779);
                                                    float f16 = o.f62808k.f62819a - 1;
                                                    Iterator it4 = list.iterator();
                                                    if (it4.hasNext()) {
                                                        float fMin = ((h0.e.a) it4.next()).f117347b;
                                                        while (it4.hasNext()) {
                                                            fMin = Math.min(fMin, ((h0.e.a) it4.next()).f117347b);
                                                        }
                                                        Iterator<E> it5 = fVar.iterator();
                                                        if (it5.hasNext()) {
                                                            float fD = i0.d((h0.d.b) it5.next());
                                                            while (it5.hasNext()) {
                                                                fD = Math.min(fD, i0.d((h0.d.b) it5.next()));
                                                            }
                                                            float fMin2 = Math.min(fMin, fD);
                                                            Iterator it6 = list.iterator();
                                                            if (it6.hasNext()) {
                                                                float fMax = ((h0.e.a) it6.next()).f117347b;
                                                                while (it6.hasNext()) {
                                                                    fMax = Math.max(fMax, ((h0.e.a) it6.next()).f117347b);
                                                                }
                                                                Iterator<E> it7 = fVar.iterator();
                                                                if (it7.hasNext()) {
                                                                    float fMax2 = ((h0.d.b) it7.next()).f117345c;
                                                                    while (it7.hasNext()) {
                                                                        fMax2 = Math.max(fMax2, ((h0.d.b) it7.next()).f117345c);
                                                                    }
                                                                    float fMax3 = Math.max(fMax, fMax2);
                                                                    r rVarA = b0Var.a(x2.f(r.S, 1.0f), 1.0f, true);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    r rVarC2 = l.C(rVarA, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                                                                    h4.d.f81522a.getClass();
                                                                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                                                                    x1 x1Var2 = n.f135158a;
                                                                    int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX2 = mVar3.x();
                                                                    r rVarC3 = k.c(rVarC2, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar4 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar4);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                                                                    u uVar = u.f22885a;
                                                                    float fI = yz1.y.i(mVar3);
                                                                    boolean zR = mVar3.r(fVar);
                                                                    long j8 = this.f69426b;
                                                                    boolean zL = zR | mVar3.l(j8) | mVar3.i(f16) | mVar3.i(fMin2) | mVar3.i(fMax3);
                                                                    Object objQ = mVar3.q();
                                                                    if (zL) {
                                                                        c14 = 2586;
                                                                        c cVar = new c(fVar, j8, f16, fMin2, fMax3, 0);
                                                                        mVar3.K(cVar);
                                                                        objQ = cVar;
                                                                    } else {
                                                                        aVar3.getClass();
                                                                        if (objQ == m.a.f135155b) {
                                                                            c14 = 2586;
                                                                            c cVar2 = new c(fVar, j8, f16, fMin2, fMax3, 0);
                                                                            mVar3.K(cVar2);
                                                                            objQ = cVar2;
                                                                        } else {
                                                                            c14 = 2586;
                                                                        }
                                                                    }
                                                                    e23.l lVar = (e23.l) objQ;
                                                                    boolean zI = mVar3.i(fI);
                                                                    char c15 = c14;
                                                                    long j14 = this.f69427c;
                                                                    boolean zL2 = zI | mVar3.l(j14) | mVar3.r(list) | mVar3.i(f16) | mVar3.i(fMin2) | mVar3.i(fMax3);
                                                                    Object objQ2 = mVar3.q();
                                                                    if (zL2) {
                                                                        i14 = 2;
                                                                        f14 = 1.0f;
                                                                        mVar = mVar3;
                                                                        aVar = new c81.a(fI, j14, list, f16, fMin2, fMax3);
                                                                        mVar.K(aVar);
                                                                    } else {
                                                                        aVar3.getClass();
                                                                        if (objQ2 == m.a.f135155b) {
                                                                            i14 = 2;
                                                                            f14 = 1.0f;
                                                                            mVar = mVar3;
                                                                            aVar = new c81.a(fI, j14, list, f16, fMin2, fMax3);
                                                                            mVar.K(aVar);
                                                                        } else {
                                                                            i14 = 2;
                                                                            f14 = 1.0f;
                                                                            mVar = mVar3;
                                                                            aVar = objQ2;
                                                                        }
                                                                    }
                                                                    e23.l[] lVarArr = new e23.l[i14];
                                                                    lVarArr[r9] = lVar;
                                                                    lVarArr[1] = (e23.l) aVar;
                                                                    z14 = false;
                                                                    f15 = f14;
                                                                    m mVar4 = mVar;
                                                                    m92.r.b(rVar, i53.a.a(lVarArr), null, null, false, gl1.y.Q(mVar, c15), 0.0f, 0.0f, null, null, null, mVar4, 0, 0, 2012);
                                                                    mVar2 = mVar4;
                                                                    mVar2.y();
                                                                    mVar2.f();
                                                                }
                                                            }
                                                            t.g();
                                                            return null;
                                                        }
                                                    }
                                                    t.g();
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            mVar2 = mVar3;
                            f15 = 1.0f;
                            z14 = false;
                            mVar2.C(1926972926);
                            String strQ = gl1.y.Q(mVar2, R.string.common_no_data);
                            r rVarF = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                            mVar2.f();
                        }
                    } else {
                        mVar2 = mVar3;
                        f15 = 1.0f;
                        z14 = false;
                        mVar2.C(1926972926);
                        String strQ2 = gl1.y.Q(mVar2, R.string.common_no_data);
                        r rVarF2 = x2.f(r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarF2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                        mVar2.f();
                    }
                    String strQ3 = gl1.y.Q(mVar2, R.string.label_last_4w);
                    r.a aVar5 = r.S;
                    boolean zB = mVar2.B(str);
                    Object objQ3 = mVar2.q();
                    if (zB) {
                        objQ3 = new cq.t(str, 28);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new cq.t(str, 28);
                            mVar2.K(objQ3);
                        }
                    }
                    r rVarF3 = x2.f(v.c((e23.l) objQ3, aVar5, z14), f15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarC4 = l.C(rVarF3, 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5);
                    d92.b.f58624b.getClass();
                    m mVar5 = mVar2;
                    mh.c(strQ3, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar5, 0, 0, 131068);
                    mVar5.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                r0 r0Var = (r0) obj5;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                new c0((androidx.fragment.app.m) obj6, this.f69426b, this.f69427c, (Calendar) r0Var.f105810a, new a73.f(r0Var, 20, (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) obj4, (m0) obj3)).show();
                return Unit.INSTANCE;
            default:
                androidx.fragment.app.m mVar6 = (androidx.fragment.app.m) obj6;
                r0 r0Var2 = (r0) obj5;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                new c0(mVar6, this.f69426b, this.f69427c, (Calendar) r0Var2.f105810a, new a73.f(r0Var2, 24, (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) obj4, (m0) obj3)).show();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(androidx.fragment.app.m mVar, long j8, long j14, r0 r0Var, Fragment fragment, m0 m0Var, int i14) {
        this.f69425a = i14;
        this.f69428d = mVar;
        this.f69426b = j8;
        this.f69427c = j14;
        this.f69429e = r0Var;
        this.f69430f = fragment;
        this.f69431g = m0Var;
    }
}
