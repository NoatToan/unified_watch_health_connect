package a42;

import a03.n0;
import android.content.Context;
import androidx.lifecycle.v1;
import c2.c1;
import c2.o3;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c62.m1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.y;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import ew1.r1;
import f62.t0;
import i3.i7;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.k2;
import l72.j0;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import v62.e4;
import w52.b1;
import w52.v0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f964d;

    public /* synthetic */ a(int i14, e23.a aVar, Object obj, o13.h hVar) {
        this.f961a = i14;
        this.f963c = aVar;
        this.f962b = obj;
        this.f964d = hVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f964d;
        Double d14 = (Double) this.f962b;
        Double d15 = (Double) this.f963c;
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22696f, h4.d.a.f81536n, mVar, 6);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = (String) lVar.invoke(d14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97928e, mVar);
            h4.g.a aVar3 = h4.d.a.f81537o;
            mh.c(str, b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            mh.c((String) lVar.invoke(d15), b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
            if (d14 == null || d15 == null || d14.doubleValue() < d15.doubleValue()) {
                mVar.C(170433705);
                mVar.f();
            } else {
                mVar.C(170070974);
                t4.d dVarA = n5.c.a(R.drawable.ic_chackmark, mVar, 0);
                gl.c.f77766a.getClass();
                long jE = gl.c.a(mVar).e();
                d92.b.f58625c.getClass();
                i7.a(dVarA, null, b0Var.b(x2.q(aVar, j92.b.f97901d.f97903b), aVar3), jE, mVar, 48, 0);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f962b;
        String str2 = (String) this.f963c;
        p1 p1Var = (p1) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t2) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
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
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.c cVar = j92.b.f97901d;
            b12.k.b(null, null, cVar.f97905d, new b12.b(str, null, null, null, null, 30, null), mVar, b12.b.f14385f << 9, 19);
            String strP = gl1.y.P(R.string.lbl_managing_for, new Object[]{str2}, mVar);
            d92.b.f58624b.getClass();
            mh.c(strP, u2Var.a(c2.l.A(aVar, j92.b.f97899b.f97919d, 0.0f, 2), 1.0f, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131068);
            s62.a.f157643a.getClass();
            u4.o oVarB = u4.p.b(e4.a(t62.b.f162798a), mVar);
            String strQ = gl1.y.Q(mVar, R.string.lbl_help);
            long jF = u0.f(mVar);
            h4.r rVarQ = x2.q(aVar, cVar.f97904c);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ak0.z(p1Var, 23);
                mVar.K(objQ);
            }
            i7.a(oVarB, strQ, u1.w.d(rVarQ, false, null, null, (e23.a) objQ, 15), jF, mVar, 8, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f962b;
        String str2 = (String) this.f963c;
        List list = (List) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarH = c2.l.H(x2.f(aVar, 1.0f), k2.f91249a, new o3(4));
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarH, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.l.f(x2.h(aVar, eVar.f97923h), mVar);
            cq0.r.b(str, str2, list, mVar, 0);
            c2.l.f(x2.h(aVar, eVar.f97922g), mVar);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01af  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f964d;
        e50.c cVar = (e50.c) this.f962b;
        p1 p1Var = (p1) this.f963c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i14 = 16;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            d50.c.f57512a.getClass();
            z3.e eVar = d50.c.f57513b;
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new a51.k(lVar, p1Var, 18);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a51.k(lVar, p1Var, 18);
                    mVar.K(objQ);
                }
            }
            i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
            if (cVar.f62982d) {
                mVar.C(-173067124);
                z3.e eVar2 = d50.c.f57514c;
                boolean zB2 = mVar.B(lVar);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new a51.k(lVar, p1Var, 19);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a51.k(lVar, p1Var, 19);
                        mVar.K(objQ2);
                    }
                }
                i3.u.b(eVar2, (e23.a) objQ2, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            } else {
                mVar.C(-172587585);
                mVar.f();
            }
            if (cVar.f62983e) {
                mVar.C(-172530266);
                z3.e eVar3 = d50.c.f57515d;
                boolean zB3 = mVar.B(lVar);
                Object objQ3 = mVar.q();
                if (zB3) {
                    objQ3 = new a51.k(lVar, p1Var, 20);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a51.k(lVar, p1Var, 20);
                        mVar.K(objQ3);
                    }
                }
                i3.u.b(eVar3, (e23.a) objQ3, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            } else {
                mVar.C(-172075713);
                mVar.f();
            }
            z3.e eVar4 = d50.c.f57516e;
            boolean zB4 = mVar.B(lVar);
            Object objQ4 = mVar.q();
            if (zB4) {
                objQ4 = new a51.k(lVar, p1Var, 21);
                mVar.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new a51.k(lVar, p1Var, 21);
                    mVar.K(objQ4);
                }
            }
            i3.u.b(eVar4, (e23.a) objQ4, null, null, null, false, null, null, mVar, 6, 508);
            z3.e eVarC = z3.f.c(-1048030453, new m1(cVar, 24), mVar);
            boolean zB5 = mVar.B(lVar);
            Object objQ5 = mVar.q();
            if (zB5) {
                objQ5 = new a51.k(lVar, p1Var, 22);
                mVar.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new a51.k(lVar, p1Var, 22);
                    mVar.K(objQ5);
                }
            }
            i3.u.b(eVarC, (e23.a) objQ5, null, null, null, false, null, null, mVar, 6, 508);
            if (cVar.f62985g) {
                mVar.C(-171084860);
                z3.e eVar5 = d50.c.f57517f;
                boolean zB6 = mVar.B(lVar);
                Object objQ6 = mVar.q();
                if (zB6) {
                    objQ6 = new a51.k(lVar, p1Var, i14);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new a51.k(lVar, p1Var, i14);
                        mVar.K(objQ6);
                    }
                }
                i3.u.b(eVar5, (e23.a) objQ6, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            } else {
                mVar.C(-170628385);
                mVar.f();
            }
            if (cVar.f62984f) {
                mVar.C(-170569733);
                z3.e eVar6 = d50.c.f57518g;
                boolean zB7 = mVar.B(lVar);
                Object objQ7 = mVar.q();
                if (zB7) {
                    objQ7 = new a51.k(lVar, p1Var, 17);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new a51.k(lVar, p1Var, 17);
                        mVar.K(objQ7);
                    }
                }
                i3.u.b(eVar6, (e23.a) objQ7, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            } else {
                mVar.C(-170104609);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        k61.a aVar;
        String strA;
        String str;
        Integer numValueOf;
        String str2;
        k61.a next;
        d70.k kVar = (d70.k) this.f962b;
        ww1.a0 a0Var = (ww1.a0) this.f963c;
        pi0.e eVar = (pi0.e) this.f964d;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = null;
            if (f14 != null) {
                int iFloatValue = (int) f14.floatValue();
                Iterator<k61.a> it = kVar.f58119f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((int) next.f103160a.f117346a) != iFloatValue);
                aVar = next;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                mVar.C(2147284329);
                mVar.f();
            } else {
                ww1.a0 a0Var2 = aVar.f103162c;
                mVar.C(2147284330);
                if (a0Var == null || a0Var == a0Var2) {
                    mVar.C(36023426);
                    int i14 = (int) aVar.f103160a.f117347b;
                    DateTime dateTime = aVar.f103161b;
                    j61.h hVar = kVar.f58118e;
                    int i15 = hVar == null ? -1 : d70.o.a.f58135a[hVar.ordinal()];
                    if (i15 == 1) {
                        strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                    } else if (i15 != 2) {
                        if (i15 != 3) {
                            str = "";
                        } else {
                            strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                        }
                        if (a0Var2 != null) {
                            numValueOf = Integer.valueOf(a0Var2.f187719b);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            mVar.C(36303851);
                        } else {
                            mVar.C(36303852);
                            strQ = gl1.y.Q(mVar, numValueOf.intValue());
                        }
                        mVar.f();
                        if (strQ == null) {
                            str2 = "";
                        } else {
                            str2 = strQ;
                        }
                        d70.o.a(i14, str, str2, kVar.f58115b, mVar, 0);
                        mVar.f();
                    } else {
                        DateTime dateTimePlusDays = dateTime.plusDays(6);
                        if (dateTimePlusDays.isAfter(DateTime.now())) {
                            dateTimePlusDays = DateTime.now();
                        }
                        dateTimePlusDays.getClass();
                        strA = eVar.g(dateTime, dateTimePlusDays, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
                    }
                    str = strA;
                    if (a0Var2 != null) {
                        numValueOf = Integer.valueOf(a0Var2.f187719b);
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        mVar.C(36303851);
                    } else {
                        mVar.C(36303852);
                        strQ = gl1.y.Q(mVar, numValueOf.intValue());
                    }
                    mVar.f();
                    if (strQ == null) {
                        str2 = "";
                    } else {
                        str2 = strQ;
                    }
                    d70.o.a(i14, str, str2, kVar.f58115b, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(36480862);
                    mVar.f();
                }
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        qr.t tVar = (qr.t) this.f962b;
        x3 x3Var = (x3) this.f963c;
        x3 x3Var2 = (x3) this.f964d;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        h4.r.a aVar = h4.r.S;
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
        boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
        int i14 = 0;
        boolean z14 = zBooleanValue && ((Boolean) x3Var2.getF182175a()).booleanValue();
        boolean zR = mVar.r(tVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new ds.f(tVar, i14);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ds.f(tVar, i14);
                mVar.K(objQ);
            }
        }
        ds.j.e(0, (e23.a) objQ, rVarC, mVar, z14);
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        z42.g gVar = (z42.g) this.f962b;
        e23.a aVar = (e23.a) this.f963c;
        e23.l lVar = (e23.l) this.f964d;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            jg.b.h(rVar, gVar, aVar, lVar, mVar, iIntValue & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) this.f962b;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) this.f963c;
        e23.l lVar = (e23.l) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            WorkoutDetailsDTO f48577a = eVar.getF48577a();
            com.garmin.android.apps.connectmobile.repcounting.model.c f24796s = eVar.getF24796s();
            boolean zB = mVar.B(lVar) | mVar.r(h0Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new e52.b(i14, lVar, h0Var);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e52.b(i14, lVar, h0Var);
                    mVar.K(objQ);
                }
            }
            e62.b.a(f48577a, h0Var, f24796s, (e23.l) objQ, mVar, com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) this.f962b;
        v0 v0Var = (v0) this.f963c;
        final com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        final int i14 = 0;
        final int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            long j8 = eVar.getF24790m().f24691b;
            p3.m.a aVar = p3.m.f135153a;
            if (j8 != -1) {
                mVar.C(-435111650);
                boolean zR = mVar.r(fVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new e23.a() { // from class: e62.g
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    fVar.s4();
                                    break;
                                case 1:
                                    fVar.s4();
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                    fVar2.getClass();
                                    ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.a() { // from class: e62.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        fVar.s4();
                                        break;
                                    case 1:
                                        fVar.s4();
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                        fVar2.getClass();
                                        ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zR2 = mVar.r(fVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    final int i16 = 2;
                    objQ2 = new e23.a() { // from class: e62.g
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    fVar.s4();
                                    break;
                                case 1:
                                    fVar.s4();
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                    fVar2.getClass();
                                    ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        final int i17 = 2;
                        objQ2 = new e23.a() { // from class: e62.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        fVar.s4();
                                        break;
                                    case 1:
                                        fVar.s4();
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                        fVar2.getClass();
                                        ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    }
                }
                w52.w.a(v0Var, aVar2, (e23.a) objQ2, mVar, 0);
                mVar.f();
            } else if (eVar.getF24790m().f24690a && eVar.getF24790m().f24691b == -1) {
                mVar.C(-434612116);
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97919d);
                String strQ = gl1.y.Q(mVar, R.string.btn_save_msn_workout);
                boolean zR3 = mVar.r(fVar);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new e23.a() { // from class: e62.g
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    fVar.s4();
                                    break;
                                case 1:
                                    fVar.s4();
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                    fVar2.getClass();
                                    ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.a() { // from class: e62.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        fVar.s4();
                                        break;
                                    case 1:
                                        fVar.s4();
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
                                        fVar2.getClass();
                                        ge1.b.T(v1.a(fVar2), null, null, new y(fVar2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ3, rVarY, strQ, mVar, null, false);
                mVar.f();
            } else {
                mVar.C(-434299109);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        v0 v0Var = (v0) this.f962b;
        List list = (List) this.f963c;
        List list2 = (List) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            b1.a(v0Var, list, list2, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        i53.c<j0> cVar = (i53.c) this.f962b;
        f82.c cVar2 = (f82.c) this.f963c;
        e23.p pVar = (e23.p) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c1) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            for (j0 j0Var : cVar) {
                g6.f.a aVar = g6.f.f75994b;
                h4.r rVarC = c2.l.C(h4.r.S, 0.0f, 0.0f, 8, 0.0f, 11);
                boolean zR = mVar.r(cVar) | mVar.r(j0Var) | mVar.r(cVar2) | mVar.B(pVar);
                Object objQ = mVar.q();
                if (zR) {
                    n0 n0Var = new n0(cVar, j0Var, cVar2, pVar, 26);
                    mVar.K(n0Var);
                    objQ = n0Var;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        n0 n0Var2 = new n0(cVar, j0Var, cVar2, pVar, 26);
                        mVar.K(n0Var2);
                        objQ = n0Var2;
                    }
                }
                l72.n0.a(rVarC, j0Var, 0L, (e23.l) objQ, mVar, 6, 4);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj, Object obj2, Object obj3) {
        i53.f fVarA;
        i53.c cVar = (i53.c) this.f962b;
        ew0.m mVar = (ew0.m) this.f963c;
        gk1.b bVar = (gk1.b) this.f964d;
        c12.h hVar = (c12.h) obj;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(hVar) : mVar2.r(hVar) ? 4 : 2;
        }
        boolean z14 = true;
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ew0.g0 g0Var = (ew0.g0) ((c12.h.b) s9.c.c(hVar.f22558b, mVar2).getF182175a()).f22560b.f22562a;
            boolean z15 = g0Var instanceof ew0.g0.d;
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                mVar2.C(2136402525);
                String strQ = gl1.y.Q(mVar2, R.string.lbl_next);
                c12.b.a aVar2 = c12.b.a.PRIMARY;
                boolean zE = pv0.f.e(cVar);
                if ((iIntValue & 14) != 4 && ((iIntValue & 8) == 0 || !mVar2.r(hVar))) {
                    z14 = false;
                }
                Object objQ = mVar2.q();
                if (z14) {
                    objQ = new ew0.r(hVar, 0);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ew0.r(hVar, 0);
                        mVar2.K(objQ);
                    }
                }
                fVarA = i53.a.a(new c12.b(strQ, (e23.a) objQ, zE, aVar2));
                mVar2.f();
            } else if (p005kotlin.jvm.internal.s.g(g0Var, ew0.g0.c.f66219a)) {
                mVar2.C(2136418364);
                String strQ2 = gl1.y.Q(mVar2, R.string.lbl_edit_behavior_list);
                int i14 = iIntValue & 14;
                boolean z16 = i14 == 4 || ((iIntValue & 8) != 0 && mVar2.r(hVar));
                Object objQ2 = mVar2.q();
                if (z16) {
                    objQ2 = new ew0.r(hVar, 1);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ew0.r(hVar, 1);
                        mVar2.K(objQ2);
                    }
                }
                c12.b bVar2 = new c12.b(strQ2, (e23.a) objQ2, false, c12.b.a.SECONDARY, 4, null);
                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_next);
                boolean zR = mVar2.r(mVar);
                if (i14 != 4 && ((iIntValue & 8) == 0 || !mVar2.r(hVar))) {
                    z14 = false;
                }
                boolean z17 = zR | z14;
                Object objQ3 = mVar2.q();
                if (z17) {
                    objQ3 = new dl0.g(20, mVar, hVar);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new dl0.g(20, mVar, hVar);
                        mVar2.K(objQ3);
                    }
                }
                fVarA = i53.a.a(bVar2, new c12.b(strQ3, (e23.a) objQ3, false, c12.b.a.PRIMARY, 4, null));
                mVar2.f();
            } else if (p005kotlin.jvm.internal.s.g(g0Var, ew0.g0.a.f66217a)) {
                mVar2.C(2136454583);
                String strQ4 = gl1.y.Q(mVar2, R.string.lbl_next);
                if ((iIntValue & 14) != 4 && ((iIntValue & 8) == 0 || !mVar2.r(hVar))) {
                    z14 = false;
                }
                Object objQ4 = mVar2.q();
                if (z14) {
                    objQ4 = new ew0.r(hVar, 2);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ew0.r(hVar, 2);
                        mVar2.K(objQ4);
                    }
                }
                fVarA = i53.a.a(new c12.b(strQ4, (e23.a) objQ4, false, c12.b.a.PRIMARY, 4, null));
                mVar2.f();
            } else {
                if (!p005kotlin.jvm.internal.s.g(g0Var, ew0.g0.b.f66218a)) {
                    throw n23.j.m(mVar2, 2136401592);
                }
                mVar2.C(2136467573);
                fVarA = i53.a.a(new c12.b(gl1.y.Q(mVar2, R.string.onboarding_device_setup_title), bVar, false, c12.b.a.PRIMARY, 4, null));
                mVar2.f();
            }
            c12.c.a(0L, fVarA, mVar2, 0, 1);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
    private final Object n(Object obj, Object obj2, Object obj3) {
        x01.e eVar = (x01.e) this.f962b;
        final h21.w wVar = (h21.w) this.f963c;
        final p1 p1Var = (p1) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        final int i14 = 0;
        final int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            x01.f fVar = eVar.f188255d;
            x01.f fVar2 = x01.f.ACTIVE;
            p3.m.a aVar = p3.m.f135153a;
            if (fVar == fVar2) {
                mVar.C(2026414135);
                for (final q11.a aVar2 : q11.a.f142071i) {
                    if (aVar2 == q11.a.REMOVE) {
                        mVar.C(-127412941);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        v5.a(0.0f, 0, 2, r1.q2.f(mVar), c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, i15), mVar);
                        mVar.f();
                    } else {
                        mVar.C(-127136173);
                        mVar.f();
                    }
                    z3.e eVarC = z3.f.c(1449617087, new e23.p() { // from class: f21.b0
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i16 = i14;
                            q11.a aVar4 = aVar2;
                            switch (i16) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        q11.a.INSTANCE.getClass();
                                        String strA = q11.a.Companion.a(aVar4, mVar2);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        q11.a.INSTANCE.getClass();
                                        String strA2 = q11.a.Companion.a(aVar4, mVar3);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        mh.c(strA2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar);
                    boolean zB = mVar.B(wVar) | mVar.k(aVar2.ordinal());
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e23.a() { // from class: f21.c0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        wVar.invoke(aVar2);
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        wVar.invoke(aVar2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.a() { // from class: f21.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            wVar.invoke(aVar2);
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            wVar.invoke(aVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    i3.u.b(eVarC, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                    i15 = i15;
                    i14 = i14;
                }
                mVar.f();
            } else {
                mVar.C(2027474242);
                final q11.a aVar4 = q11.a.REMOVE;
                z3.e eVarC2 = z3.f.c(-1004337371, new e23.p() { // from class: f21.b0
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i16 = i15;
                        q11.a aVar5 = aVar4;
                        switch (i16) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    q11.a.INSTANCE.getClass();
                                    String strA = q11.a.Companion.a(aVar5, mVar2);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    q11.a.INSTANCE.getClass();
                                    String strA2 = q11.a.Companion.a(aVar5, mVar3);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    mh.c(strA2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar);
                boolean zB2 = mVar.B(wVar);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new e23.a() { // from class: f21.c0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    p1Var.setValue(Boolean.FALSE);
                                    wVar.invoke(aVar4);
                                    break;
                                default:
                                    p1Var.setValue(Boolean.FALSE);
                                    wVar.invoke(aVar4);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.a() { // from class: f21.c0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        wVar.invoke(aVar4);
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        wVar.invoke(aVar4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    }
                }
                i3.u.b(eVarC2, (e23.a) objQ2, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        List arrayList;
        b63.o oVar = (b63.o) this.f962b;
        List<g21.y> list = (List) this.f963c;
        v21.e eVar = (v21.e) this.f964d;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (f14 == null) {
                return Unit.INSTANCE;
            }
            String strP = zf.b.p(b63.p.c(oVar, new b63.d(0, 0, (int) f14.floatValue(), 3, null)));
            if (list == null) {
                mVar.C(105161559);
                mVar.f();
                arrayList = null;
            } else {
                mVar.C(105161560);
                arrayList = new ArrayList();
                for (g21.y yVar : list) {
                    mVar.C(1804509627);
                    List<e23.q<Float, p3.m, Integer, d82.a>> list2 = yVar.f75538d;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        d82.a aVar = (d82.a) ((e23.q) it.next()).invoke(f14, mVar, Integer.valueOf(iIntValue & 14));
                        if (aVar != null) {
                            arrayList2.add(aVar);
                        }
                    }
                    mVar.f();
                    p13.d0.v(arrayList, arrayList2);
                }
                mVar.f();
            }
            if (arrayList == null) {
                arrayList = p13.j0.f134944a;
            }
            i53.f fVarJ = i53.a.j(arrayList);
            String strS = eVar.s(strP, fVarJ);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", strS);
            b92.a aVarB = c0235a.b();
            int i14 = b92.a.f16960b;
            d82.d.a(strP, fVarJ, aVarB, mVar, 0, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        x3 x3Var = (x3) this.f962b;
        Context context = (Context) this.f963c;
        WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) this.f964d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        WorkoutPreCreateActivity.a aVar = WorkoutPreCreateActivity.f48888d;
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            l72.s.f111232a.a(((t0) x3Var.getF182175a()).f69338a, z3.f.c(1443704072, new r1(10, context, workoutPreCreateActivity), mVar), mVar, 48);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        d52.e eVar = (d52.e) this.f962b;
        Integer num = (Integer) this.f963c;
        Integer num2 = (Integer) this.f964d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String strC = eVar.c(num);
            String strQ = gl1.y.Q(mVar, R.string.lbl_total_pushes);
            int i15 = (l72.x0.f111348c << 24) | (i14 & 14);
            x0Var.a(i15, 124, null, t2Var, null, null, strC, strQ, null, null, mVar);
            x0Var.a(i15, 116, null, t2Var, null, null, eVar.a(num2), gl1.y.Q(mVar, R.string.lbl_total_distance_steps), eVar.e(num2), null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        o4.d0 d0VarA;
        long jC;
        long jC2;
        r22.p pVar = (r22.p) this.f962b;
        jr.t tVar = (jr.t) this.f963c;
        r22.p pVar2 = (r22.p) this.f964d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            o4.d0 d0VarA2 = null;
            String strH = pVar != null ? pVar.f149774a : null;
            if (strH == null) {
                strH = sn.a.h(mVar, 2062298969, R.string.no_value, mVar);
            } else {
                mVar.C(2062298318);
                mVar.f();
            }
            String str = pVar != null ? pVar.f149776c : null;
            String str2 = pVar != null ? pVar.f149775b : null;
            if (tVar == null) {
                mVar.C(-493049417);
                mVar.f();
                d0VarA = null;
            } else {
                mVar.C(2062305162);
                long jE = gs.n.e(tVar);
                mVar.f();
                d0VarA = o4.d0.a(jE);
            }
            if (d0VarA == null) {
                mVar.C(2062306586);
                d92.b.f58623a.getClass();
                jC = d92.b.a(mVar).j().c();
                mVar.f();
            } else {
                mVar.C(2062304850);
                mVar.f();
                jC = d0VarA.f128833a;
            }
            int i14 = iIntValue & 14;
            gs.n.b(t2Var, strH, str, str2, null, jC, mVar, i14);
            String strH2 = pVar2 != null ? pVar2.f149774a : null;
            if (strH2 == null) {
                strH2 = sn.a.h(mVar, 2062310297, R.string.no_value, mVar);
            } else {
                mVar.C(2062309677);
                mVar.f();
            }
            String str3 = strH2;
            String str4 = pVar2 != null ? pVar2.f149776c : null;
            String str5 = pVar2 != null ? pVar2.f149775b : null;
            if (tVar == null) {
                mVar.C(-492700233);
                mVar.f();
            } else {
                mVar.C(2062316426);
                long jE2 = gs.n.e(tVar);
                mVar.f();
                d0VarA2 = o4.d0.a(jE2);
            }
            if (d0VarA2 == null) {
                mVar.C(2062317850);
                d92.b.f58623a.getClass();
                jC2 = d92.b.a(mVar).j().c();
                mVar.f();
            } else {
                mVar.C(2062316114);
                mVar.f();
                jC2 = d0VarA2.f128833a;
            }
            gs.n.b(t2Var, str3, str4, str5, null, jC2, mVar, i14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:192:0x05de  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:225:0x071a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0723  */
    /* JADX WARN: Code duplicated, block: B:228:0x0727  */
    /* JADX WARN: Code duplicated, block: B:233:0x0744  */
    /* JADX WARN: Code duplicated, block: B:236:0x0757  */
    /* JADX WARN: Code duplicated, block: B:237:0x075b  */
    /* JADX WARN: Code duplicated, block: B:240:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:242:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:243:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:248:0x0810  */
    /* JADX WARN: Code duplicated, block: B:251:0x0871  */
    /* JADX WARN: Code duplicated, block: B:253:0x087a  */
    /* JADX WARN: Code duplicated, block: B:254:0x087e  */
    /* JADX WARN: Code duplicated, block: B:259:0x089b  */
    /* JADX WARN: Code duplicated, block: B:262:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:264:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:266:0x0910  */
    /* JADX WARN: Code duplicated, block: B:268:0x0914  */
    /* JADX WARN: Code duplicated, block: B:270:0x0918  */
    /* JADX WARN: Code duplicated, block: B:323:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:368:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:375:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:380:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:385:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:390:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0cb2  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v21 ck0.t, still in use, count: 2, list:
          (r2v21 ck0.t) from 0x0aac: PHI (r2 I:??) = (r2v18 ck0.t), (r2v21 ck0.t) binds: [B:360:0x0aaa, B:447:0x0aac] A[DONT_GENERATE, DONT_INLINE]
          (r2v21 ck0.t) from 0x0a9f: IGET (r2v21 ck0.t) A[WRAPPED] ck0.t.a java.lang.String
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.q
    public final java.lang.Object invoke(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a42.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(int i14, e23.l lVar, Object obj, Object obj2) {
        this.f961a = i14;
        this.f964d = lVar;
        this.f962b = obj;
        this.f963c = obj2;
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f961a = i14;
        this.f962b = obj;
        this.f963c = obj2;
        this.f964d = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, o13.h hVar, int i14) {
        this.f961a = i14;
        this.f962b = obj;
        this.f964d = obj2;
        this.f963c = hVar;
    }
}
