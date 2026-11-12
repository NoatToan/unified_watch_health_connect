package rw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.m;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import hw1.i;
import i3.mh;
import j92.e;
import j92.f;
import java.util.ArrayList;
import java.util.Iterator;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import q42.v;
import tw1.j;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:99:0x02c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m mVar, r rVar, sw1.a aVar, p3.m mVar2, int i14) {
        j jVar;
        p pVar;
        boolean z14;
        String str;
        Object obj;
        DateTime dateTimeB;
        Object next;
        DateTime dateTimeJ;
        o0 o0VarE = mVar2.E(1218582508);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            r rVarC = l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            jVar2.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_todays_workout);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            ArrayList arrayListY = aVar.f161085a.y();
            if (arrayListY != null) {
                Iterator it = arrayListY.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        dateTimeJ = ((j) next).j();
                    }
                } while (!s.g(dateTimeJ != null ? dateTimeJ.toLocalDate() : null, LocalDate.now()));
                jVar = (j) next;
            } else {
                jVar = null;
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (jVar == null) {
                o0VarE.C(-1741926518);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_rest_day);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
            } else {
                if (jVar.getAssociatedActivityId() != null) {
                    o0VarE.C(-1741337425);
                    Iterator<T> it3 = aVar.f161093i.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it3.next();
                        long j8 = ((ActivityListItemDTO) next2).f29250b;
                        Long associatedActivityId = jVar.getAssociatedActivityId();
                        if (associatedActivityId != null && j8 == associatedActivityId.longValue() && (dateTimeB = jVar.b()) != null && g22.k.k(dateTimeB)) {
                            obj = next2;
                            break;
                        }
                    }
                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                    if (activityListItemDTO == null) {
                        o0VarE.C(-1741337426);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1741337425);
                        ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).v(3462, activityListItemDTO, null, x2.f(r.S, 1.0f), o0VarE, true);
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1740895985);
                    Integer estimatedDurationInSecs = jVar.getEstimatedDurationInSecs();
                    if (estimatedDurationInSecs == null) {
                        o0VarE.C(-1740853547);
                        o0VarE.g0(false);
                        pVar = null;
                    } else {
                        o0VarE.C(-1740853546);
                        int iIntValue = estimatedDurationInSecs.intValue();
                        if (iIntValue == 0) {
                            pVar = null;
                        } else {
                            l3.f23124b.getClass();
                            pVar = new p(l3.a.e1(iIntValue), gl1.y.P(R.string.estimated_duration, new Object[]{l3.a.k1(new l22.a(context), true, iIntValue)}, o0VarE));
                        }
                        o0VarE.g0(false);
                    }
                    m52.k kVarT = jVar.t();
                    if (kVarT == null) {
                        kVarT = m52.k.f116755o;
                    }
                    u4.d dVar = kVarT.f116772h;
                    m52.k.f116753m.getClass();
                    long jA = m52.k.a.a(kVarT, o0VarE);
                    String workoutName = jVar.getWorkoutName();
                    String str2 = workoutName == null ? "" : workoutName;
                    String str3 = (pVar == null || (str = (String) pVar.f128594a) == null) ? "" : str;
                    String str4 = pVar != null ? (String) pVar.f128595b : null;
                    boolean zR = o0VarE.r(mVar) | o0VarE.r(jVar) | o0VarE.r(aVar);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new v(mVar, 19, jVar, aVar);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v(mVar, 19, jVar, aVar);
                            o0VarE.K(objQ);
                        }
                    }
                    z14 = true;
                    i.b(null, new hw1.f(dVar, jA, str2, str3, null, null, str4, null, null, (e23.a) objQ, 432, null), o0VarE, 0, 1);
                    o0VarE.g0(false);
                    Unit unit3 = Unit.INSTANCE;
                }
                o0VarE.g0(z14);
                x1 x1Var2 = n.f135158a;
            }
            z14 = true;
            o0VarE.g0(z14);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(mVar, rVar, aVar, i14, 28);
        }
    }
}
