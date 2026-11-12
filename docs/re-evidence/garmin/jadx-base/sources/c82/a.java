package c82;

import b63.o;
import b63.z;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o4.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f25706d;

    public /* synthetic */ a(List list, String str, l lVar, int i14) {
        this.f25703a = i14;
        this.f25704b = list;
        this.f25705c = str;
        this.f25706d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:78:0x0243  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        float f14;
        int i15;
        r1 r1VarC;
        int i16 = this.f25703a;
        m.a aVar = m.f135153a;
        l lVar = this.f25706d;
        List<j> list = this.f25704b;
        float f15 = 0.0f;
        int i17 = 1;
        switch (i16) {
            case 0:
                w wVar = (w) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    float fJ = wVar.j();
                    if (list.isEmpty()) {
                        mVar.C(-1148619396);
                        mVar.f();
                    } else {
                        mVar.C(-1150476048);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f16 = j92.b.f97899b.f97920e * 2;
                        g6.f.a aVar2 = g6.f.f75994b;
                        float f17 = ((fJ - f16) - 4) / 7;
                        r rVarF = x2.f(r.S, 1.0f);
                        String str = this.f25705c;
                        boolean zB = mVar.B(str);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new b(str, 1);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new b(str, 1);
                                mVar.K(objQ);
                            }
                        }
                        r rVarC = v.c((l) objQ, rVarF, true);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, mVar, 6);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        r rVarC2 = k.c(rVarC, mVar);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar3);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar);
                        u2 u2Var = u2.f22900a;
                        z.INSTANCE.getClass();
                        o oVarF = b63.b.f(b63.a.C0229a.f16171a, z.Companion.a());
                        mVar.C(-41477109);
                        for (j jVar : list) {
                            o oVar = jVar.f25740a;
                            b63.j jVarB = oVar.b();
                            jVarB.getClass();
                            switch (jVarB.ordinal() + i17) {
                                case 1:
                                    i14 = R.string.gak_day_of_week_monday_initial;
                                    break;
                                case 2:
                                    i14 = R.string.gak_day_of_week_tuesday_initial;
                                    break;
                                case 3:
                                    i14 = R.string.gak_day_of_week_wednesday_initial;
                                    break;
                                case 4:
                                    i14 = R.string.lbl_day_of_week_thursday_initial;
                                    break;
                                case 5:
                                    i14 = R.string.lbl_day_of_week_friday_initial;
                                    break;
                                case 6:
                                    i14 = R.string.lbl_day_of_week_saturday_initial;
                                    break;
                                case 7:
                                    i14 = R.string.lbl_day_of_week_sunday_initial;
                                    break;
                                default:
                                    i14 = -1;
                                    break;
                            }
                            if (lVar != null) {
                                mVar.C(-935016683);
                                r rVarW = x2.w(r.S, f15, f17, i17);
                                boolean zF = g.f(oVarF, oVar);
                                h hVar = jVar.f25741b;
                                String strQ = y.Q(mVar, i14);
                                String str2 = jVar.f25742c;
                                boolean z14 = jVar.f25743d;
                                boolean zB2 = mVar.B(lVar) | mVar.r(jVar);
                                Object objQ2 = mVar.q();
                                if (zB2) {
                                    objQ2 = new bb0.d(25, lVar, jVar);
                                    mVar.K(objQ2);
                                } else {
                                    aVar.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = new bb0.d(25, lVar, jVar);
                                        mVar.K(objQ2);
                                    }
                                }
                                g.d(rVarW, zF, hVar, strQ, str2, z14, (e23.a) objQ2, mVar, 0, 0);
                                mVar.f();
                                f14 = 0.0f;
                                i15 = 1;
                            } else {
                                mVar.C(-934443028);
                                f14 = 0.0f;
                                i15 = 1;
                                g.d(x2.w(r.S, 0.0f, f17, 1), g.f(oVarF, oVar), jVar.f25741b, y.Q(mVar, i14), null, jVar.f25743d, null, mVar, 0, 80);
                                mVar.f();
                            }
                            f15 = f14;
                            i17 = i15;
                        }
                        mVar.f();
                        mVar.y();
                        mVar.f();
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.q(aVar4, j92.b.f97899b.f97920e), mVar2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        n90.b bVar2 = (n90.b) it.next();
                        if (bVar2 == h0.b0(list)) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f18 = j92.b.f97899b.f97918c;
                            r1VarC = k2.i.c(f18, f18, 0.0f, 0.0f, 12);
                        } else if (bVar2 == h0.m0(list)) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f19 = j92.b.f97899b.f97918c;
                            r1VarC = k2.i.c(0.0f, 0.0f, f19, f19, 3);
                        } else {
                            r1VarC = m1.f128891a;
                        }
                        r1 r1Var = r1VarC;
                        boolean zB3 = mVar2.B(lVar) | mVar2.k(bVar2.ordinal());
                        Object objQ3 = mVar2.q();
                        if (zB3) {
                            objQ3 = new wz1.c(13, lVar, bVar2);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new wz1.c(13, lVar, bVar2);
                                mVar2.K(objQ3);
                            }
                        }
                        xa0.a.a(this.f25705c, bVar2, r1Var, (e23.a) objQ3, mVar2, 0);
                    }
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
