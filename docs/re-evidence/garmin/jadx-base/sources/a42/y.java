package a42;

import a11.i0;
import a11.j0;
import am.i1;
import android.content.Context;
import androidx.compose.ui.tooling.PreviewActivity;
import b21.c7;
import b21.u6;
import c2.c1;
import c2.h2;
import c2.o3;
import c2.q2;
import c2.s0;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.s3;
import ca0.j1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import f5.z0;
import i3.a1;
import i3.b3;
import i3.d3;
import i3.fe;
import i3.l3;
import i3.m4;
import i3.mh;
import i3.pc;
import i3.x3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.k2;
import l72.n0;
import l72.u1;
import lc.m0;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u21.e1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1092e;

    public /* synthetic */ y(e23.l lVar, e23.p pVar, g21.f fVar, p1 p1Var) {
        this.f1088a = 27;
        this.f1092e = lVar;
        this.f1089b = pVar;
        this.f1090c = fVar;
        this.f1091d = p1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        double dDoubleValue;
        double dDoubleValue2;
        e50.d dVar = (e50.d) this.f1089b;
        a1 a1Var = (a1) this.f1090c;
        e23.l lVar = (e23.l) this.f1092e;
        n1 n1Var = (n1) this.f1091d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            w20.a aVar = dVar.f62992d;
            if (aVar != null) {
                mVar.C(1120843412);
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(aVar2, mVar);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                boolean z14 = dVar.f62996h;
                boolean z15 = dVar.f62997i;
                boolean z16 = ((pc) a1Var.f87409a.f88996e.f109326h.getF182175a()) != pc.Expanded;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
                long userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                String str = eVar.userProfilePk;
                Long lJ = str != null ? d53.t.j(str) : null;
                String str2 = eVar.courseName;
                if (str2 == null) {
                    str2 = "";
                }
                e50.c cVar = new e50.c(str2, eVar.m(), eVar.e0(), z14, (lJ == null || userProfilePk != lJ.longValue() || eVar.f0()) ? false : true, lJ != null && userProfilePk == lJ.longValue(), !s3.b(), eVar.isFavorite, z15, z16);
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a11.h0(n1Var, 3);
                    mVar.K(objQ);
                }
                c50.g.a(cVar, lVar, (e23.l) objQ, mVar, 384);
                w20.c cVar2 = dVar.f62993e;
                w20.d dVar2 = dVar.f62994f;
                w20.e eVar2 = dVar.f62995g;
                boolean z17 = dVar.f62998j;
                s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
                com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
                String str3 = eVar.courseId;
                String str4 = eVar.courseName;
                com.garmin.android.apps.connectmobile.courses.model.i iVarM2 = eVar.m();
                boolean zE0 = eVar.e0();
                boolean Z = eVar.Z();
                boolean zE = iVarM.e();
                String str5 = eVar.userProfilePk;
                boolean z18 = hVar.i(str5 != null ? Long.parseLong(str5) : -1L) || eVar.userProfilePk == null;
                Boolean hasTurnDetectionDisabled = eVar.getHasTurnDetectionDisabled();
                n50.b bVar2 = new n50.b(str4, iVarM2, zE0, false, Z, zE, z18, hasTurnDetectionDisabled != null ? !hasTurnDetectionDisabled.booleanValue() : iVarM == com.garmin.android.apps.connectmobile.courses.model.i.RUNNING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.HIKING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.OTHER, iVarM.d() && com.garmin.android.apps.connectmobile.courses.model.e.a0(), eVar.G(), !eVar.M() && jg.b.E(eVar.q()), eVar.M() && eVar.G(), z17, false);
                double dA = eVar.A();
                Double d14 = eVar.elapsedSeconds;
                double dQ = eVar.q();
                GeoPointDTO geoPointDTOD = eVar.D();
                boolean z19 = iVarM.c() && hVar.s();
                List<ClimbDTO> list = aVar.f181477b;
                int size = list != null ? list.size() : 0;
                bv.b.f21239a.getClass();
                bv.b.a();
                e50.h hVar2 = new e50.h(str3, bVar2, dQ, dA, d14, geoPointDTOD, z19, size, k1.f37122a.s(), cVar2 != null ? i53.a.j(cVar2.f181492a) : null, eVar.f0(), eVar.f0() ? eVar.getImageURL() : null, iVarM == com.garmin.android.apps.connectmobile.courses.model.i.RUNNING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING, dVar2 != null ? i53.a.j(dVar2.f181493a) : null, iVarM.c() && hVar.a(), eVar2 != null ? eVar2.f181494a : null, eVar2 != null ? eVar2.f181495b : null);
                r30.a aVar4 = dVar.f63000l;
                k30.t tVar = aVar.f181480e;
                List<fn0.a> list2 = aVar.f181478c;
                k30.x xVar = aVar.f181479d;
                boolean z24 = (!eVar.m().c() || list2 == null || list2.isEmpty()) ? false : true;
                i53.f fVarM = lg.d.m(aVar);
                double dQ2 = eVar.q();
                Integer unpavedPercentage = xVar != null ? xVar.getUnpavedPercentage() : null;
                Double totalUnpavedDistance = xVar != null ? xVar.getTotalUnpavedDistance() : null;
                Integer highTrafficPercentage = tVar != null ? tVar.getHighTrafficPercentage() : null;
                Double totalHighTrafficDistance = tVar != null ? tVar.getTotalHighTrafficDistance() : null;
                double dR = eVar.r();
                double dS = eVar.s();
                List<GeoPointDTO> list3 = eVar.geoPoints;
                if (list3 == null || list3.isEmpty()) {
                    dDoubleValue = Double.NaN;
                } else {
                    dDoubleValue = 100000.0d;
                    for (GeoPointDTO geoPointDTO : list3) {
                        Double d15 = geoPointDTO.elevation;
                        if (d15 != null && d15.doubleValue() < dDoubleValue) {
                            Double d16 = geoPointDTO.elevation;
                            dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
                        }
                    }
                }
                List<GeoPointDTO> list4 = eVar.geoPoints;
                if (list4 == null || list4.isEmpty()) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = 0.0d;
                    for (GeoPointDTO geoPointDTO2 : list4) {
                        Double d17 = geoPointDTO2.elevation;
                        if (d17 != null && d17.doubleValue() > dDoubleValue2) {
                            Double d18 = geoPointDTO2.elevation;
                            dDoubleValue2 = d18 != null ? d18.doubleValue() : 0.0d;
                        }
                    }
                }
                e50.i iVar = new e50.i(dQ2, unpavedPercentage, totalUnpavedDistance, highTrafficPercentage, totalHighTrafficDistance, dR, dS, dDoubleValue, dDoubleValue2, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), z24 ? Integer.valueOf(list2.size()) : null);
                List<GeoPointDTO> list5 = eVar.geoPoints;
                k30.q qVar = (list5 == null || list5.isEmpty()) ? null : new k30.q(list5, aVar.f181477b, xVar != null ? xVar.d() : null, eVar.q(), eVar.k());
                if (aVar4 == null || (fVarM != null && fVarM.isEmpty())) {
                    aVar4 = null;
                    break;
                }
                Iterator<E> it = fVarM.iterator();
                do {
                    if (!it.hasNext()) {
                        aVar4 = null;
                        break;
                    }
                } while (((r30.b) it.next()).f149981a != aVar4);
                c50.c.a(hVar2, new e50.e(iVar, new e50.f(qVar, fVarM, aVar4)), lVar, mVar, 0);
                mVar.y();
                mVar.f();
            } else {
                mVar.C(1121924537);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        d62.i iVar = (d62.i) this.f1089b;
        WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity = (WorkoutActivityProfileSelectionActivity) this.f1090c;
        d62.j jVar = (d62.j) this.f1091d;
        e23.l lVar = (e23.l) this.f1092e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            List<d62.j> list = iVar.f58017b;
            if (list == null) {
                mVar.C(867176876);
                mVar.f();
            } else {
                mVar.C(867176877);
                for (d62.j jVar2 : list) {
                    String strB = d62.k.b(jVar2, mVar);
                    u4.d dVarA = d62.k.a(jVar2);
                    boolean z14 = jVar2 == jVar;
                    boolean zB = mVar.B(lVar) | mVar.k(jVar2.ordinal());
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new j1(23, lVar, jVar2);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j1(23, lVar, jVar2);
                            mVar.K(objQ);
                        }
                    }
                    workoutActivityProfileSelectionActivity.da(strB, null, dVarA, z14, (e23.a) objQ, mVar, com.garmin.android.apps.connectmobile.d.$stable << 15, 2);
                }
                mVar.f();
            }
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00eb  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        xh0.c cVar = (xh0.c) this.f1089b;
        Integer num = (Integer) this.f1090c;
        String str = (String) this.f1091d;
        Integer num2 = (Integer) this.f1092e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(dVar, h4.d.a.f81534l, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            boolean zR = mVar.r(cVar) | mVar.B(num);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new cn1.d(20, cVar, num);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cn1.d(20, cVar, num);
                    mVar.K(objQ);
                }
            }
            mh.c(str, p5.v.c((e23.l) objQ, rVarC2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            g6.f.a aVar3 = g6.f.f75994b;
            c02.h.e(x2.q(c2.l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 35), num != null ? Double.valueOf(num.intValue()) : null, num2 != null ? Double.valueOf(num2.intValue()) : null, mVar, 3072);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        gj0.a aVar = (gj0.a) this.f1089b;
        e23.a aVar2 = (e23.a) this.f1091d;
        e23.a aVar3 = (e23.a) this.f1090c;
        e23.l lVar = (e23.l) this.f1092e;
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        p3.m mVar = (p3.m) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 4 : 2;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            yi0.c cVar = (yi0.c) p13.h0.e0(iIntValue, p13.h0.b1(aVar.f77487a.keySet()));
            if (cVar == null) {
                mVar.C(-599242476);
                mVar.f();
            } else {
                mVar.C(-599242475);
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                dj0.d.d(cVar, (gj0.e) p13.h0.b1(aVar.f77487a.values()).get(iIntValue), c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), aVar2, aVar3, mVar, 0);
                boolean zB = mVar.B(lVar) | mVar.k(cVar.ordinal());
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new dj0.d.a(lVar, cVar, null);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new dj0.d.a(lVar, cVar, null);
                        mVar.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, num, mVar);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x029e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object e(Object obj, Object obj2, Object obj3) {
        String strA;
        ej0.b bVar = (ej0.b) this.f1089b;
        yi0.d dVar = (yi0.d) this.f1090c;
        ArrayList arrayList = (ArrayList) this.f1091d;
        ArrayList arrayList2 = (ArrayList) this.f1092e;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = dj0.h.f59916g;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.h(zBooleanValue) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l22.b bVar2 = bVar.f64399a;
            dVar.getClass();
            yi0.b bVar3 = dVar.f197345a;
            Map<yi0.a, yi0.f> map = dVar.f197346b;
            ArrayList arrayList3 = new ArrayList(map.size());
            Iterator<Map.Entry<yi0.a, yi0.f>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<yi0.a, yi0.f> next = it.next();
                double dDoubleValue = ((Number) next.getValue().a(zBooleanValue).getStart()).doubleValue();
                double dDoubleValue2 = ((Number) next.getValue().a(zBooleanValue).c()).doubleValue();
                double dDoubleValue3 = ((Number) next.getValue().a(zBooleanValue).c()).doubleValue() - 0.01d;
                int i15 = ej0.b.C1364b.f64403a[next.getKey().ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        String strA2 = bVar.a(Double.valueOf(dDoubleValue), bVar3);
                        strA2.getClass();
                        String strA3 = bVar.a(Double.valueOf(dDoubleValue3), bVar3);
                        strA3.getClass();
                        strA = bVar2.a(R.string.lbl_value_range, strA2, strA3);
                    } else {
                        String strA4 = bVar.a(Double.valueOf(dDoubleValue2), bVar3);
                        strA4.getClass();
                        strA = bVar2.a(R.string.lbl_less_than_number, strA4);
                    }
                } else if (bVar3 == yi0.b.WATTS) {
                    yi0.f fVar = map.get(yi0.a.EXCELLENT);
                    String strA5 = bVar.a(fVar != null ? (Double) fVar.a(zBooleanValue).c() : null, bVar3);
                    strA5.getClass();
                    strA = bVar2.a(R.string.lbl_greater_than_or_equal_to_string_pattern, strA5);
                } else {
                    yi0.f fVar2 = map.get(yi0.a.EXCELLENT);
                    String strA6 = bVar.a(fVar2 != null ? Double.valueOf(((Number) fVar2.a(zBooleanValue).c()).doubleValue() - 0.01d) : null, bVar3);
                    strA6.getClass();
                    strA = bVar2.a(R.string.lbl_greater_than_number, strA6);
                }
                arrayList3.add(strA);
            }
            List listG0 = p13.h0.G0(arrayList3);
            int i16 = 10;
            int iA = t0.a(p13.y.r(listG0, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj4 : listG0) {
                oi0.b bVar4 = new oi0.b(bVar2, (String) obj4);
                bVar4.w();
                bVar4.k();
                bVar4.p();
                linkedHashMap.put(obj4, bVar4.f132238b);
            }
            h82.r.f82497a.j(z3.f.c(-277844374, new i1(bVar, zBooleanValue, dVar, i16), mVar), mVar, 54);
            float f14 = 1.0f;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarZ = c2.l.z(rVarD, eVar.f97922g, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarZ, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar5);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            mVar.C(695553346);
            int i17 = 0;
            for (Object obj5 : linkedHashMap.entrySet()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                Map.Entry entry = (Map.Entry) obj5;
                long jA = n5.a.a(mVar, ((Number) arrayList.get(i17)).intValue());
                String strQ = gl1.y.Q(mVar, ((Number) arrayList2.get(i17)).intValue());
                String str = (String) entry.getKey();
                h4.r rVarF = x2.f(h4.r.S, f14);
                boolean zR = mVar.r(entry);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(entry, 22);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(entry, 22);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarF, true);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
                x1 x1Var3 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(mVar.getU());
                i2 i2VarX2 = mVar.x();
                h4.r rVarC3 = h4.k.c(rVarC2, mVar);
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
                b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                h5.g.a.b bVar6 = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar6);
                }
                b4.c(h5.g.a.f81807d, rVarC3, mVar);
                u2 u2Var = u2.f22900a;
                u1.d(u2Var, o4.d0.a(jA), strQ, 0.6f, mVar, 3078, 0);
                u1.d(u2Var, null, str, 0.4f, mVar, 3078, 1);
                mVar.y();
                i17 = i18;
                f14 = 1.0f;
            }
            mVar.f();
            mVar.y();
            x1 x1Var4 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006a  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        d11.c cVar = (d11.c) this.f1089b;
        e01.a aVar = (e01.a) this.f1090c;
        f11.a aVar2 = (f11.a) this.f1091d;
        p1 p1Var = (p1) this.f1092e;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        String strQ = gl1.y.Q(mVar, R.string.serving_amount);
        Double d14 = cVar.f57051d;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        a11.r rVarN = aVar.n();
        a11.i iVar = new a11.i(0, 100, v21.d.f175321y, 1, null);
        j0 j0Var = new j0(5, 3);
        boolean zR = mVar.r(aVar) | mVar.r(aVar2);
        Object objQ = mVar.q();
        p3.m.a aVar3 = p3.m.f135153a;
        if (zR) {
            objQ = new c50.f(aVar, 29, aVar2, p1Var);
            mVar.K(objQ);
        } else {
            aVar3.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new c50.f(aVar, 29, aVar2, p1Var);
                mVar.K(objQ);
            }
        }
        e23.p pVar = (e23.p) objQ;
        Object objQ2 = mVar.q();
        aVar3.getClass();
        if (objQ2 == p3.m.a.f135155b) {
            objQ2 = new dv0.f(p1Var, 7);
            mVar.K(objQ2);
        }
        a11.q.a(strQ, dDoubleValue, rVarN, iVar, j0Var, pVar, (e23.a) objQ2, mVar, 1572864, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    private final Object g(Object obj, Object obj2, Object obj3) {
        d11.c cVar = (d11.c) this.f1089b;
        d11.a aVar = (d11.a) this.f1090c;
        f11.a aVar2 = (f11.a) this.f1091d;
        p1 p1Var = (p1) this.f1092e;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        g01.c cVar2 = cVar.f57053f;
        int i14 = 0;
        if (cVar2 != null) {
            Iterator<g01.c> it = aVar.f57041b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (it.next() == cVar2) {
                    break;
                }
                i14++;
            }
        }
        int i15 = i14;
        String strQ = gl1.y.Q(mVar, R.string.unit);
        mVar.C(587431382);
        i53.c<g01.c> cVar3 = aVar.f57041b;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar3, 10));
        for (g01.c cVar4 : cVar3) {
            g01.c.INSTANCE.getClass();
            arrayList.add(g01.c.Companion.c(cVar4, mVar));
        }
        mVar.f();
        i53.f fVarJ = i53.a.j(arrayList);
        boolean zR = mVar.r(aVar) | mVar.r(aVar2);
        Object objQ = mVar.q();
        p3.m.a aVar3 = p3.m.f135153a;
        if (zR) {
            objQ = new ci0.b(aVar, 12, aVar2, p1Var);
            mVar.K(objQ);
        } else {
            aVar3.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ci0.b(aVar, 12, aVar2, p1Var);
                mVar.K(objQ);
            }
        }
        e23.l lVar = (e23.l) objQ;
        Object objQ2 = mVar.q();
        aVar3.getClass();
        if (objQ2 == p3.m.a.f135155b) {
            objQ2 = new dv0.f(p1Var, 8);
            mVar.K(objQ2);
        }
        i0.a(strQ, fVarJ, i15, null, null, lVar, (e23.a) objQ2, mVar, 1572864);
        x1 x1Var2 = p3.n.f135158a;
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f1089b;
        String str2 = (String) this.f1090c;
        Object[] objArr = (Object[]) this.f1091d;
        n1 n1Var = (n1) this.f1092e;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = PreviewActivity.f6058a;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarX = c2.l.x(h4.r.S, h2Var);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            b4.a(mVar, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, mVar);
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            e6.a aVar2 = e6.a.f63139a;
            Object[] objArr2 = {objArr[n1Var.getIntValue()]};
            aVar2.getClass();
            e6.a.c(str, str2, mVar, objArr2);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        i53.c<us1.e> cVar = (i53.c) this.f1089b;
        e23.l lVar = (e23.l) this.f1092e;
        p1 p1Var = (p1) this.f1090c;
        pt1.w wVar = (pt1.w) this.f1091d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            for (us1.e eVar : cVar) {
                z3.e eVarC = z3.f.c(460143087, new dh1.a(eVar, 11), mVar);
                boolean zB = mVar.B(lVar) | mVar.k(eVar.ordinal());
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new cw1.g0(lVar, eVar, p1Var, 13);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.g0(lVar, eVar, p1Var, 13);
                        mVar.K(objQ);
                    }
                }
                i3.u.b(eVarC, (e23.a) objQ, null, z3.f.c(-1440129806, new d81.h(22, wVar, eVar), mVar), null, false, null, null, mVar, 3078, 500);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        List<us1.o> list = (List) this.f1089b;
        e23.l lVar = (e23.l) this.f1092e;
        p1 p1Var = (p1) this.f1090c;
        us1.o oVar = (us1.o) this.f1091d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i14 = 16;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            for (us1.o oVar2 : list) {
                z3.e eVarC = z3.f.c(-611425390, new dh1.a(oVar2, 12), mVar);
                boolean zB = mVar.B(lVar) | mVar.k(oVar2.ordinal()) | mVar.B(p1Var);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new cw1.g0(lVar, oVar2, p1Var, i14);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.g0(lVar, oVar2, p1Var, i14);
                        mVar.K(objQ);
                    }
                }
                i3.u.b(eVarC, (e23.a) objQ, null, z3.f.c(377257327, new d81.h(25, oVar, oVar2), mVar), null, false, null, null, mVar, 3078, 500);
                i14 = i14;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x0140  */
    /* JADX WARN: Code duplicated, block: B:42:0x0149  */
    /* JADX WARN: Code duplicated, block: B:43:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:71:0x021e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0222  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        t2 t2Var;
        h5.g.a.f fVar;
        int i14;
        t2 t2Var2;
        boolean zR;
        Object objQ;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        h5.g.a.b bVar;
        h5.g.a.b bVar2;
        boolean zR2;
        Object objQ2;
        z0 z0VarD2;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        String str = (String) this.f1089b;
        v21.e eVar = (v21.e) this.f1090c;
        String str2 = (String) this.f1091d;
        String str3 = (String) this.f1092e;
        t2 t2Var3 = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var3.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var3) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarA = t2Var3.a(aVar, 1.0f, true);
            boolean zB = mVar.B(str);
            Object objQ3 = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ3 = new cq.t(str, 25);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new cq.t(str, 25);
                    mVar.K(objQ3);
                }
            }
            h4.r rVarB = p5.v.b(rVarA, (e23.l) objQ3);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD3 = c2.q.d(gVar, false);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD3, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX3, mVar);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (mVar.getT()) {
                t2Var = t2Var3;
            } else {
                t2Var = t2Var3;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar);
                c2.u uVar = c2.u.f22885a;
                i14 = iIntValue & 14;
                t2Var2 = t2Var;
                f21.w.a(t2Var2, str, null, null, 0, 0, mVar, i14);
                mVar.y();
                h4.r rVarA2 = t2Var2.a(aVar, 1.0f, true);
                zR = mVar.r(eVar) | mVar.B(str2);
                objQ = mVar.q();
                if (zR) {
                    objQ = new e11.r(eVar, str2, 3);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e11.r(eVar, str2, 3);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarB2 = p5.v.b(rVarA2, (e23.l) objQ);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarB2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, z0VarD, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT() && p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar3;
                } else {
                    bVar = bVar3;
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                bVar2 = bVar;
                f21.w.a(t2Var2, str2, null, null, 0, 0, mVar, i14);
                mVar.y();
                h4.r rVarA3 = t2Var2.a(aVar, 1.0f, true);
                zR2 = mVar.r(eVar) | mVar.B(str3);
                objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new e11.r(eVar, str3, 4);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e11.r(eVar, str3, 4);
                        mVar.K(objQ2);
                    }
                }
                h4.r rVarB3 = p5.v.b(rVarA3, (e23.l) objQ2);
                z0VarD2 = c2.q.d(gVar, false);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarB3, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, z0VarD2, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, mVar);
                f21.w.a(t2Var2, str3, null, null, 0, 0, mVar, i14);
                mVar.y();
            }
            v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar);
            c2.u uVar2 = c2.u.f22885a;
            i14 = iIntValue & 14;
            t2Var2 = t2Var;
            f21.w.a(t2Var2, str, null, null, 0, 0, mVar, i14);
            mVar.y();
            h4.r rVarA4 = t2Var2.a(aVar, 1.0f, true);
            zR = mVar.r(eVar) | mVar.B(str2);
            objQ = mVar.q();
            if (zR) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e11.r(eVar, str2, 3);
                    mVar.K(objQ);
                }
            } else {
                objQ = new e11.r(eVar, str2, 3);
                mVar.K(objQ);
            }
            h4.r rVarB4 = p5.v.b(rVarA4, (e23.l) objQ);
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(rVarB4, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar2, z0VarD, mVar);
            b4.c(c1623g, i2VarX, mVar);
            if (mVar.getT()) {
                bVar = bVar3;
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            } else {
                bVar = bVar3;
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar);
            bVar2 = bVar;
            f21.w.a(t2Var2, str2, null, null, 0, 0, mVar, i14);
            mVar.y();
            h4.r rVarA5 = t2Var2.a(aVar, 1.0f, true);
            zR2 = mVar.r(eVar) | mVar.B(str3);
            objQ2 = mVar.q();
            if (zR2) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e11.r(eVar, str3, 4);
                    mVar.K(objQ2);
                }
            } else {
                objQ2 = new e11.r(eVar, str3, 4);
                mVar.K(objQ2);
            }
            h4.r rVarB5 = p5.v.b(rVarA5, (e23.l) objQ2);
            z0VarD2 = c2.q.d(gVar, false);
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = h4.k.c(rVarB5, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar2, z0VarD2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            } else {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, mVar);
            f21.w.a(t2Var2, str3, null, null, 0, 0, mVar, i14);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        Object next;
        p3.m mVar;
        List<s21.n> list = (List) this.f1089b;
        v21.e eVar = (v21.e) this.f1090c;
        g21.c cVar = (g21.c) this.f1091d;
        l22.a aVar = (l22.a) this.f1092e;
        t2 t2Var = (t2) obj;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        int i14 = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(t2Var) ? 4 : 2;
        }
        int i15 = iIntValue;
        boolean z14 = false;
        if (mVar2.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mVar2.C(1345825624);
            for (s21.n nVar : list) {
                Iterator<T> it = g21.r.f75490k.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((g21.r) next).f75491a, nVar.f156152b));
                g21.r rVar = (g21.r) next;
                if (rVar == null) {
                    mVar = mVar2;
                } else {
                    String strE = v21.e.e(eVar, f21.l0.m(cVar, rVar), null, false, false, 30);
                    b11.n.a aVar2 = b11.n.f14341e;
                    String str = nVar.f156152b;
                    String str2 = nVar.f156153c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar2.getClass();
                    String strB = b11.n.a.b(str, str2, aVar);
                    b11.p.a aVar3 = b11.p.f14358d;
                    String str3 = nVar.f156155e;
                    aVar3.getClass();
                    String strA = b11.p.a.a(str3, aVar, z14);
                    String strP = gl1.y.P(R.string.lbl_avg_daily_with_suffix, new Object[]{strB}, mVar2);
                    String strG = eVar.G(strB, strE, strA);
                    p3.m mVar3 = mVar2;
                    l72.x0 x0Var = l72.x0.f111346a;
                    b92.a aVarA = wz1.a.a(strG);
                    int i16 = b92.a.f16960b;
                    x0Var.a((i15 & 14) | (l72.x0.f111348c << 24), 52, aVarA, t2Var, null, null, strE, strP, strA, null, mVar3);
                    mVar = mVar3;
                }
                i14 = i14;
                mVar2 = mVar;
                z14 = z14;
            }
            p3.m mVar4 = mVar2;
            int i17 = i14;
            mVar4.f();
            if (list.size() < i17) {
                mVar4.C(-1227954864);
                l72.x0.f111346a.h(t2Var, mVar4, (i15 & 14) | (l72.x0.f111348c << 3));
                mVar4.f();
            } else {
                mVar4.C(-1227901048);
                mVar4.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    private final Object n(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f1092e;
        e23.p pVar = (e23.p) this.f1089b;
        g21.f fVar = (g21.f) this.f1090c;
        p1 p1Var = (p1) this.f1091d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (lVar == null) {
                mVar.C(1286608249);
                mVar.f();
            } else {
                mVar.C(1286608250);
                f21.d.f68493a.getClass();
                z3.e eVar = f21.d.f68496d;
                boolean zB = mVar.B(lVar) | mVar.r(fVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new cw1.g0(lVar, p1Var, fVar, 21);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.g0(lVar, p1Var, fVar, 21);
                        mVar.K(objQ);
                    }
                }
                i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            }
            if (pVar == null) {
                mVar.C(1287001143);
                mVar.f();
            } else {
                mVar.C(1287001144);
                f21.d.f68493a.getClass();
                z3.e eVar2 = f21.d.f68497e;
                boolean zB2 = mVar.B(pVar) | mVar.r(fVar);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new cw1.g0(pVar, p1Var, fVar, 22);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cw1.g0(pVar, p1Var, fVar, 22);
                        mVar.K(objQ2);
                    }
                }
                i3.u.b(eVar2, (e23.a) objQ2, null, null, null, false, null, null, mVar, 6, 508);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        List arrayList;
        b63.o oVar = (b63.o) this.f1089b;
        pi0.e eVar = (pi0.e) this.f1090c;
        List<g21.y> list = (List) this.f1091d;
        v21.e eVar2 = (v21.e) this.f1092e;
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
            b63.o oVarC = b63.p.c(oVar, new b63.d(0, 0, ((int) f14.floatValue()) * 7, 3, null));
            DateTime dateTimeK = vb.h.k(oVarC);
            DateTime dateTimeAtStartOfDay = g22.l.h(oVarC).plusDays(6).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            String strL = eVar.l(dateTimeK, dateTimeAtStartOfDay, pi0.f.SHORT_MONTH_NO_WEEKDAY);
            if (list == null) {
                mVar.C(-638896415);
                mVar.f();
                arrayList = null;
            } else {
                mVar.C(-638896414);
                arrayList = new ArrayList();
                for (g21.y yVar : list) {
                    mVar.C(1919055089);
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
            String strS = eVar2.s(strL, fVarJ);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", strS);
            b92.a aVarB = c0235a.b();
            int i14 = b92.a.f16960b;
            d82.d.a(strL, fVarJ, aVarB, mVar, 0, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0299  */
    /* JADX WARN: Code duplicated, block: B:116:0x0304  */
    /* JADX WARN: Code duplicated, block: B:124:0x035b  */
    /* JADX WARN: Code duplicated, block: B:142:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x0463  */
    /* JADX WARN: Code duplicated, block: B:163:0x0480  */
    /* JADX WARN: Code duplicated, block: B:168:0x049d  */
    /* JADX WARN: Code duplicated, block: B:182:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:187:0x0517  */
    /* JADX WARN: Code duplicated, block: B:192:0x0537  */
    /* JADX WARN: Code duplicated, block: B:197:0x0552  */
    /* JADX WARN: Code duplicated, block: B:202:0x056d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0589  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:234:0x0687  */
    /* JADX WARN: Code duplicated, block: B:236:0x0690  */
    /* JADX WARN: Code duplicated, block: B:237:0x0694  */
    /* JADX WARN: Code duplicated, block: B:242:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:245:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:247:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:248:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:253:0x0707  */
    /* JADX WARN: Code duplicated, block: B:256:0x0733  */
    /* JADX WARN: Code duplicated, block: B:258:0x073c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0740  */
    /* JADX WARN: Code duplicated, block: B:264:0x075d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0773  */
    /* JADX WARN: Code duplicated, block: B:269:0x077e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0786  */
    /* JADX WARN: Code duplicated, block: B:272:0x078d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x078f  */
    /* JADX WARN: Code duplicated, block: B:276:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:278:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:284:0x07db  */
    /* JADX WARN: Code duplicated, block: B:286:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:288:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:290:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:292:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:333:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:384:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:403:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:419:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:460:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i53.d<q71.e, d42.a> dVar;
        i53.e eVar;
        List listB1;
        Object obj4;
        e23.p pVar;
        e23.l lVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        z0 z0VarD;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        Boolean bool;
        int i14;
        int i15;
        e23.l lVar2;
        boolean zB;
        Object objQ;
        Object obj5;
        int i16 = this.f1088a;
        int i17 = 5;
        int i18 = 8;
        final int i19 = 2;
        int i24 = 4;
        p3.m.a aVar = p3.m.f135153a;
        Object obj6 = this.f1092e;
        Object obj7 = this.f1091d;
        Object obj8 = this.f1090c;
        Object obj9 = this.f1089b;
        int i25 = 3;
        final int i26 = 1;
        switch (i16) {
            case 0:
                d42.b bVar = (d42.b) obj9;
                q71.d dVar2 = (q71.d) obj8;
                e23.a aVar2 = (e23.a) obj7;
                e23.l lVar3 = (e23.l) obj6;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                p3.m mVar = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar.k(iIntValue) ? 4 : 2;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    q71.e eVar2 = (bVar == null || (dVar = bVar.f57477a) == null || (eVar = (i53.e) dVar.keySet()) == null || (listB1 = p13.h0.b1(eVar)) == null) ? null : (q71.e) p13.h0.e0(iIntValue, listB1);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    q71.e eVar3 = eVar2;
                    b0.a(dVar2 != null ? dVar2.f143238a.get(eVar2) : null, bVar != null ? bVar.f57477a.get(eVar2) : null, eVar3, c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), aVar2, mVar, 0, 0);
                    if (eVar3 == null) {
                        mVar.C(-1629911934);
                        mVar.f();
                    } else {
                        mVar.C(-1629911933);
                        boolean zB2 = mVar.B(lVar3) | mVar.k(eVar3.ordinal());
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new b0.a(lVar3, eVar3, null);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new b0.a(lVar3, eVar3, null);
                                mVar.K(objQ2);
                            }
                        }
                        l0.e((e23.p) objQ2, num, mVar);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                b.u uVar = (b.u) obj9;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar4 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj8;
                ak0.a aVar4 = (ak0.a) obj7;
                ub1.i iVar = (ub1.i) obj6;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h) obj).getClass();
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.feature_settings);
                    boolean zR = mVar2.r(uVar);
                    Object objQ3 = mVar2.q();
                    if (zR) {
                        objQ3 = new ak0.i(uVar, 1);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ak0.i(uVar, 1);
                            mVar2.K(objQ3);
                        }
                    }
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(strQ, null, false, false, (e23.a) objQ3, null, z3.f.c(-89232099, new a(eVar4, i24, aVar4, iVar), mVar2), mVar2, 1572912, 44);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                bk0.f fVar2 = (bk0.f) obj9;
                ak0.a aVar5 = (ak0.a) obj8;
                Context context = (Context) obj7;
                o53.b0 b0Var = (o53.b0) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR2 = mVar3.r(aVar5) | mVar3.r(context) | mVar3.r(b0Var);
                    Object objQ4 = mVar3.q();
                    if (zR2) {
                        objQ4 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.g(aVar5, context, b0Var);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.g(aVar5, context, b0Var);
                            mVar3.K(objQ4);
                        }
                    }
                    bk0.j.b(fVar2, (e23.l) ((k23.g) objQ4), mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar5 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj9;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c cVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) obj8;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i iVar2 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i) obj7;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.e eVar6 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.e) obj6;
                fe feVar = (fe) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                feVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar4.B(feVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    p1 p1VarC = p0.c(eVar5.B, mVar4, 0);
                    String str = (String) p1VarC.getF182175a();
                    boolean zB3 = mVar4.B(p1VarC) | ((iIntValue5 & 14) == 4) | mVar4.r(eVar5);
                    Object objQ5 = mVar4.q();
                    if (zB3) {
                        obj4 = objQ5;
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.d dVar3 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.d(feVar, eVar5, p1VarC, null);
                        mVar4.K(dVar3);
                        obj4 = dVar3;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            obj4 = objQ5;
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.d dVar4 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.d(feVar, eVar5, p1VarC, null);
                            mVar4.K(dVar4);
                            obj4 = dVar4;
                        }
                    }
                    obj4 = objQ5;
                    l0.e((e23.p) obj4, str, mVar4);
                    if (cVar.f35483c != null) {
                        mVar4.C(2084992343);
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.b(iVar2.f35398b, eVar6, cVar.f35482b, cVar.f35483c, mVar4, 0);
                        mVar4.f();
                    } else {
                        mVar4.C(2085425320);
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.c(eVar6, cVar.f35482b, mVar4, 0);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                g3 g3Var = (g3) obj9;
                sc.f fVar3 = (sc.f) obj8;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar7 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj6;
                e23.a aVar6 = (e23.a) obj7;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k kVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar5.B(kVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    T t7 = g3Var.f35301b;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e eVar8 = t7 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e ? (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e) t7 : null;
                    if (eVar8 != null) {
                        mVar5.C(-1074678741);
                        dk0.l.a(eVar8.f35486b, eVar8.f35487c, i53.a.e(eVar8.f35488d), eVar8.f35490f, eVar8.f35491g, eVar8.f35492h, new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.C0611b(fVar3, kVar, eVar7, aVar6), mVar5, yx2.i.f200086p << 6);
                        mVar5.f();
                    } else {
                        mVar5.C(-1072220503);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                g3 g3Var2 = (g3) obj9;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar9 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj8;
                b.u uVar2 = (b.u) obj7;
                e23.p pVar2 = (e23.p) obj6;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.l) obj).getClass();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    T t14 = g3Var2.f35301b;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e eVar10 = t14 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e ? (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e) t14 : null;
                    if (eVar10 != null) {
                        mVar6.C(-1702116259);
                        i53.c<yx2.i> cVar2 = eVar10.f35488d;
                        String str2 = eVar10.f35493i.f60202a;
                        boolean zR3 = mVar6.r(eVar9) | mVar6.r(uVar2);
                        Object objQ6 = mVar6.q();
                        if (zR3) {
                            objQ6 = new a11.n(20, eVar9, uVar2);
                            mVar6.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new a11.n(20, eVar9, uVar2);
                                mVar6.K(objQ6);
                            }
                        }
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(str2, null, false, true, (e23.a) objQ6, null, z3.f.c(424038619, new a(eVar10, i25, cVar2, pVar2), mVar6), mVar6, 1575984, 36);
                        mVar6.f();
                    } else {
                        mVar6.C(-1699544623);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                Context context2 = (Context) obj9;
                ak0.a aVar7 = (ak0.a) obj8;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar11 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj6;
                e23.a aVar8 = (e23.a) obj7;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar9 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                aVar9.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar7.B(aVar9) ? 4 : 2;
                }
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(gl1.y.Q(mVar7, R.string.lbl_garmin_connect_plus), null, false, false, null, null, z3.f.c(-1670111070, new ak0.j(aVar9, context2, aVar7, eVar11, aVar8, 0), mVar7), mVar7, 1573248, 58);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.p pVar3 = (e23.p) obj9;
                Boolean bool2 = (Boolean) obj8;
                e23.l lVar4 = (e23.l) obj6;
                z3.e eVar12 = (z3.e) obj7;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar13 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar10, 0.0f, eVar13.f97920e, 1);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar11 = h4.d.a.f81536n;
                    c2.z zVarA2 = c2.y.a(kVar2, aVar11, mVar8, 0);
                    int iHashCode4 = Long.hashCode(mVar8.getU());
                    i2 i2VarX4 = mVar8.x();
                    h4.r rVarC4 = h4.k.c(rVarA, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar12);
                    } else {
                        mVar8.c();
                    }
                    h5.g.a.e eVar14 = h5.g.a.f81810g;
                    b4.c(eVar14, zVarA2, mVar8);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar8);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar8.getT()) {
                        pVar = pVar3;
                        lVar = lVar4;
                    } else {
                        pVar = pVar3;
                        lVar = lVar4;
                        if (!p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar8);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        h4.r rVarA2 = c2.l.A(aVar10, eVar13.f97920e, 0.0f, 2);
                        zVarA = c2.y.a(kVar2, aVar11, mVar8, 0);
                        iHashCode = Long.hashCode(mVar8.getU());
                        i2VarX = mVar8.x();
                        rVarC = h4.k.c(rVarA2, mVar8);
                        if (mVar8.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar12);
                        } else {
                            mVar8.c();
                        }
                        b4.c(eVar14, zVarA, mVar8);
                        b4.c(c1623g, i2VarX, mVar8);
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar8, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar8);
                        h4.r rVarF = x2.f(aVar10, 1.0f);
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar8, 48);
                        iHashCode2 = Long.hashCode(mVar8.getU());
                        i2VarX2 = mVar8.x();
                        rVarC2 = h4.k.c(rVarF, mVar8);
                        if (mVar8.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar12);
                        } else {
                            mVar8.c();
                        }
                        b4.c(eVar14, s2VarA, mVar8);
                        b4.c(c1623g, i2VarX2, mVar8);
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, mVar8);
                        h4.r rVarA3 = u2.f22900a.a(aVar10, 1.0f, true);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode3 = Long.hashCode(mVar8.getU());
                        i2VarX3 = mVar8.x();
                        rVarC3 = h4.k.c(rVarA3, mVar8);
                        if (mVar8.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar12);
                        } else {
                            mVar8.c();
                        }
                        b4.c(eVar14, z0VarD, mVar8);
                        b4.c(c1623g, i2VarX3, mVar8);
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar8, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC3, mVar8);
                        c2.u uVar3 = c2.u.f22885a;
                        eVar12.invoke(mVar8, 0);
                        mVar8.y();
                        bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(bool2, bool)) {
                            i14 = -927362618;
                            i15 = R.string.lbl_yes;
                        } else if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                            i14 = -927360123;
                            i15 = R.string.lbl_no;
                        } else {
                            if (bool2 == null) {
                                throw n23.j.m(mVar8, -927364258);
                            }
                            i14 = -927357689;
                            i15 = R.string.lbl_none;
                        }
                        String strP = gl1.y.P(R.string.lbl_logged_value, new Object[]{sn.a.h(mVar8, i14, i15, mVar8)}, mVar8);
                        lVar2 = lVar;
                        zB = mVar8.B(lVar2);
                        objQ = mVar8.q();
                        if (zB) {
                            objQ = new a12.a(lVar2, 10);
                            mVar8.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a12.a(lVar2, 10);
                                mVar8.K(objQ);
                            }
                        }
                        b02.b.b(bool2, strP, (e23.l) objQ, mVar8, 0);
                        mVar8.y();
                        mVar8.y();
                        if (pVar == null && p005kotlin.jvm.internal.s.g(bool2, bool)) {
                            v.h.D(mVar8, 1141511263, pVar, mVar8, 0);
                        } else {
                            mVar8.C(1141564118);
                            mVar8.f();
                        }
                        mVar8.y();
                    }
                    v.h.z(iHashCode4, mVar8, iHashCode4, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar8);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    h4.r rVarA4 = c2.l.A(aVar10, eVar13.f97920e, 0.0f, 2);
                    zVarA = c2.y.a(kVar2, aVar11, mVar8, 0);
                    iHashCode = Long.hashCode(mVar8.getU());
                    i2VarX = mVar8.x();
                    rVarC = h4.k.c(rVarA4, mVar8);
                    if (mVar8.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar12);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar14, zVarA, mVar8);
                    b4.c(c1623g, i2VarX, mVar8);
                    if (mVar8.getT()) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar8);
                    h4.r rVarF2 = x2.f(aVar10, 1.0f);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar8, 48);
                    iHashCode2 = Long.hashCode(mVar8.getU());
                    i2VarX2 = mVar8.x();
                    rVarC2 = h4.k.c(rVarF2, mVar8);
                    if (mVar8.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar12);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar14, s2VarA, mVar8);
                    b4.c(c1623g, i2VarX2, mVar8);
                    if (mVar8.getT()) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                    } else {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar8);
                    h4.r rVarA5 = u2.f22900a.a(aVar10, 1.0f, true);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode3 = Long.hashCode(mVar8.getU());
                    i2VarX3 = mVar8.x();
                    rVarC3 = h4.k.c(rVarA5, mVar8);
                    if (mVar8.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar12);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar14, z0VarD, mVar8);
                    b4.c(c1623g, i2VarX3, mVar8);
                    if (mVar8.getT()) {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar2);
                    } else {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar8);
                    c2.u uVar4 = c2.u.f22885a;
                    eVar12.invoke(mVar8, 0);
                    mVar8.y();
                    bool = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(bool2, bool)) {
                        i14 = -927362618;
                        i15 = R.string.lbl_yes;
                    } else if (p005kotlin.jvm.internal.s.g(bool2, Boolean.FALSE)) {
                        i14 = -927360123;
                        i15 = R.string.lbl_no;
                    } else {
                        if (bool2 == null) {
                            throw n23.j.m(mVar8, -927364258);
                        }
                        i14 = -927357689;
                        i15 = R.string.lbl_none;
                    }
                    String strP2 = gl1.y.P(R.string.lbl_logged_value, new Object[]{sn.a.h(mVar8, i14, i15, mVar8)}, mVar8);
                    lVar2 = lVar;
                    zB = mVar8.B(lVar2);
                    objQ = mVar8.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a12.a(lVar2, 10);
                            mVar8.K(objQ);
                        }
                    } else {
                        objQ = new a12.a(lVar2, 10);
                        mVar8.K(objQ);
                    }
                    b02.b.b(bool2, strP2, (e23.l) objQ, mVar8, 0);
                    mVar8.y();
                    mVar8.y();
                    if (pVar == null) {
                        mVar8.C(1141564118);
                        mVar8.f();
                    } else {
                        mVar8.C(1141564118);
                        mVar8.f();
                    }
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                v21.e eVar15 = (v21.e) obj9;
                u21.t tVar = (u21.t) obj8;
                m0 m0Var = (m0) obj7;
                p1 p1Var = (p1) obj6;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    u21.s sVar = (u21.s) p1Var.getF182175a();
                    boolean zR4 = mVar9.r(tVar);
                    Object objQ7 = mVar9.q();
                    if (zR4) {
                        objQ7 = new u6(tVar, i24);
                        mVar9.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new u6(tVar, i24);
                            mVar9.K(objQ7);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ7;
                    boolean zR5 = mVar9.r(tVar);
                    Object objQ8 = mVar9.q();
                    if (zR5) {
                        objQ8 = new b21.h(tVar, i17);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new b21.h(tVar, i17);
                            mVar9.K(objQ8);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ8;
                    boolean zR6 = mVar9.r(m0Var) | mVar9.B(p1Var);
                    Object objQ9 = mVar9.q();
                    if (zR6) {
                        objQ9 = new c7(m0Var, p1Var, 1);
                        mVar9.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new c7(m0Var, p1Var, 1);
                            mVar9.K(objQ9);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ9;
                    boolean zR7 = mVar9.r(tVar);
                    Object objQ10 = mVar9.q();
                    if (zR7) {
                        objQ10 = new u6(tVar, i17);
                        mVar9.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new u6(tVar, i17);
                            mVar9.K(objQ10);
                        }
                    }
                    e23.l lVar7 = (e23.l) objQ10;
                    boolean zR8 = mVar9.r(tVar);
                    Object objQ11 = mVar9.q();
                    if (zR8) {
                        objQ11 = new u6(tVar, 6);
                        mVar9.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new u6(tVar, 6);
                            mVar9.K(objQ11);
                        }
                    }
                    e23.l lVar8 = (e23.l) objQ11;
                    boolean zR9 = mVar9.r(tVar);
                    Object objQ12 = mVar9.q();
                    if (zR9) {
                        objQ12 = new b21.h(tVar, 6);
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new b21.h(tVar, 6);
                            mVar9.K(objQ12);
                        }
                    }
                    t21.m0.f(sVar, eVar15, lVar5, aVar13, lVar6, lVar7, lVar8, (e23.a) objQ12, mVar9, 0, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                s21.a0 a0Var = (s21.a0) obj9;
                final e1 e1Var = (e1) obj8;
                v21.e eVar16 = (v21.e) obj7;
                p1 p1Var2 = (p1) obj6;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    s21.b0 b0Var4 = (s21.b0) p1Var2.getF182175a();
                    Boolean bool3 = a0Var.f156037b;
                    boolean zR10 = mVar10.r(e1Var);
                    Object objQ13 = mVar10.q();
                    if (zR10) {
                        final int i27 = false ? 1 : 0;
                        objQ13 = new e23.l() { // from class: b21.y8
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                Object value2;
                                switch (i27) {
                                    case 0:
                                        Double d14 = (Double) obj10;
                                        double dDoubleValue = d14.doubleValue();
                                        r53.p2 p2Var = e1Var.f167945d;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                        break;
                                    case 1:
                                        Double d15 = (Double) obj10;
                                        d15.getClass();
                                        e1Var.C4(d15);
                                        break;
                                    default:
                                        boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                        r53.p2 p2Var2 = e1Var.f167945d;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            final int i28 = false ? 1 : 0;
                            objQ13 = new e23.l() { // from class: b21.y8
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    Object value2;
                                    switch (i28) {
                                        case 0:
                                            Double d14 = (Double) obj10;
                                            double dDoubleValue = d14.doubleValue();
                                            r53.p2 p2Var = e1Var.f167945d;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                            break;
                                        case 1:
                                            Double d15 = (Double) obj10;
                                            d15.getClass();
                                            e1Var.C4(d15);
                                            break;
                                        default:
                                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                            r53.p2 p2Var2 = e1Var.f167945d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ13);
                        }
                    }
                    e23.l lVar9 = (e23.l) objQ13;
                    boolean zR11 = mVar10.r(e1Var);
                    Object objQ14 = mVar10.q();
                    if (zR11) {
                        objQ14 = new e23.l() { // from class: b21.y8
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                Object value2;
                                switch (i26) {
                                    case 0:
                                        Double d14 = (Double) obj10;
                                        double dDoubleValue = d14.doubleValue();
                                        r53.p2 p2Var = e1Var.f167945d;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                        break;
                                    case 1:
                                        Double d15 = (Double) obj10;
                                        d15.getClass();
                                        e1Var.C4(d15);
                                        break;
                                    default:
                                        boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                        r53.p2 p2Var2 = e1Var.f167945d;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new e23.l() { // from class: b21.y8
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    Object value2;
                                    switch (i26) {
                                        case 0:
                                            Double d14 = (Double) obj10;
                                            double dDoubleValue = d14.doubleValue();
                                            r53.p2 p2Var = e1Var.f167945d;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                            break;
                                        case 1:
                                            Double d15 = (Double) obj10;
                                            d15.getClass();
                                            e1Var.C4(d15);
                                            break;
                                        default:
                                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                            r53.p2 p2Var2 = e1Var.f167945d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ14);
                        }
                    }
                    e23.l lVar10 = (e23.l) objQ14;
                    boolean zR12 = mVar10.r(e1Var);
                    Object objQ15 = mVar10.q();
                    if (zR12) {
                        objQ15 = new e23.l() { // from class: b21.y8
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                Object value2;
                                switch (i19) {
                                    case 0:
                                        Double d14 = (Double) obj10;
                                        double dDoubleValue = d14.doubleValue();
                                        r53.p2 p2Var = e1Var.f167945d;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                        break;
                                    case 1:
                                        Double d15 = (Double) obj10;
                                        d15.getClass();
                                        e1Var.C4(d15);
                                        break;
                                    default:
                                        boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                        r53.p2 p2Var2 = e1Var.f167945d;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new e23.l() { // from class: b21.y8
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    Object value2;
                                    switch (i19) {
                                        case 0:
                                            Double d14 = (Double) obj10;
                                            double dDoubleValue = d14.doubleValue();
                                            r53.p2 p2Var = e1Var.f167945d;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, d14, 0.0d, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                                            break;
                                        case 1:
                                            Double d15 = (Double) obj10;
                                            d15.getClass();
                                            e1Var.C4(d15);
                                            break;
                                        default:
                                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                                            r53.p2 p2Var2 = e1Var.f167945d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, zBooleanValue, 2047)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ15);
                        }
                    }
                    t21.j1.a(b0Var4, bool3, lVar9, lVar10, (e23.l) objQ15, eVar16, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                i53.c<b82.j.a> cVar3 = (i53.c) obj9;
                e23.l lVar11 = (e23.l) obj6;
                p1 p1Var3 = (p1) obj8;
                String str3 = (String) obj7;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                b82.j jVar = b82.j.f16611a;
                ((c2.a0) obj).getClass();
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    for (b82.j.a aVar14 : cVar3) {
                        z3.e eVarC = z3.f.c(-904537057, new a61.d(aVar14, 15), mVar11);
                        boolean zB4 = mVar11.B(lVar11) | mVar11.B(aVar14);
                        Object objQ16 = mVar11.q();
                        if (zB4) {
                            objQ16 = new ak0.m(lVar11, 13, aVar14, p1Var3);
                            mVar11.K(objQ16);
                        } else {
                            aVar.getClass();
                            if (objQ16 == p3.m.a.f135155b) {
                                objQ16 = new ak0.m(lVar11, 13, aVar14, p1Var3);
                                mVar11.K(objQ16);
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ16, null, null, z3.f.c(-1673075301, new a03.t0(17, str3, aVar14), mVar11), false, null, null, mVar11, 24582, 492);
                    }
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                i53.c cVar4 = (i53.c) obj9;
                e23.a aVar15 = (e23.a) obj7;
                i53.c<String> cVar5 = (i53.c) obj8;
                e23.l lVar12 = (e23.l) obj6;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    l72.j0 j0Var = new l72.j0(gl1.y.Q(mVar12, R.string.lbl_any), null, null, false, cVar4.isEmpty(), 14, null);
                    boolean zB5 = mVar12.B(aVar15);
                    Object objQ17 = mVar12.q();
                    if (zB5) {
                        obj5 = objQ17;
                        a03.h0 h0Var = new a03.h0(aVar15, i18);
                        mVar12.K(h0Var);
                        obj5 = h0Var;
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            obj5 = objQ17;
                            a03.h0 h0Var2 = new a03.h0(aVar15, i18);
                            mVar12.K(h0Var2);
                            obj5 = h0Var2;
                        }
                    }
                    obj5 = objQ17;
                    n0.a(null, j0Var, 0L, (e23.l) obj5, mVar12, 0, 5);
                    for (String str4 : cVar5) {
                        l72.j0 j0Var2 = new l72.j0(str4, null, null, false, cVar4.contains(str4), 14, null);
                        boolean zB6 = mVar12.B(lVar12) | mVar12.B(str4);
                        Object objQ18 = mVar12.q();
                        if (zB6) {
                            objQ18 = new au0.g(lVar12, str4, 1);
                            mVar12.K(objQ18);
                        } else {
                            aVar.getClass();
                            if (objQ18 == p3.m.a.f135155b) {
                                objQ18 = new au0.g(lVar12, str4, 1);
                                mVar12.K(objQ18);
                            }
                        }
                        n0.a(null, j0Var2, 0L, (e23.l) objQ18, mVar12, 0, 5);
                    }
                    x1 x1Var14 = p3.n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                gv0.d dVar5 = (gv0.d) obj9;
                e23.a aVar16 = (e23.a) obj7;
                e23.a aVar17 = (e23.a) obj8;
                e23.a aVar18 = (e23.a) obj6;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((bv0.a.g) obj).getClass();
                if (mVar13.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    boolean zR13 = mVar13.r(dVar5) | mVar13.B(aVar18);
                    Object objQ19 = mVar13.q();
                    if (zR13) {
                        objQ19 = new bv0.r(dVar5, aVar18, 0);
                        mVar13.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new bv0.r(dVar5, aVar18, 0);
                            mVar13.K(objQ19);
                        }
                    }
                    kv0.c.a(dVar5, aVar16, aVar17, (e23.a) objQ19, mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                return a(obj, obj2, obj3);
            case 14:
                String str5 = (String) obj9;
                String str6 = (String) obj8;
                String str7 = (String) obj7;
                List list = (List) obj6;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar14.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    h4.r rVarH = c2.l.H(x2.f(aVar19, 1.0f), k2.f91249a, new o3(4));
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar17 = j92.b.f97899b;
                    h4.r rVarC5 = c2.l.C(rVarH, 0.0f, eVar17.f97923h, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode5 = Long.hashCode(mVar14.getU());
                    i2 i2VarX5 = mVar14.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar20);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar14);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar14, iHashCode5, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar14);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    c2.l.f(x2.h(aVar19, eVar17.f97923h), mVar14);
                    cq0.v.b(str5, str6, str7, list, mVar14, 0);
                    c2.l.f(x2.h(aVar19, eVar17.f97922g), mVar14);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                m4 m4Var = (m4) obj9;
                b3 b3Var = (b3) obj8;
                String str8 = (String) obj7;
                String str9 = (String) obj6;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar15.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    boolean zB7 = mVar15.B(m4Var.g());
                    Object objQ20 = mVar15.q();
                    if (zB7) {
                        objQ20 = d3.c(d3.f87817a, str8, 5);
                        mVar15.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = d3.c(d3.f87817a, str8, 5);
                            mVar15.K(objQ20);
                        }
                    }
                    x3.b(m4Var, null, (l3) objQ20, b3Var, z3.f.c(184084800, new as.p(str9, 9), mVar15), null, false, null, mVar15, 1597440, 162);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 16:
                return b(obj, obj2, obj3);
            case 17:
                return c(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case 24:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                return l(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj9;
                f62.x xVar = (f62.x) obj8;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj7;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj6;
                w52.x0 x0Var = (w52.x0) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                x0Var.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= (iIntValue17 & 8) == 0 ? mVar16.B(x0Var) : mVar16.r(x0Var) ? 4 : 2;
                }
                if (mVar16.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var18 = p3.n.f135158a;
                    l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar21 = xVar.f69359a;
                    r0 r0Var = new r0();
                    l52.o.f(aVar21, new s0(r0Var, i18));
                    m52.d dVar6 = (m52.d) r0Var.f105810a;
                    boolean zR14 = mVar16.r(qVar) | mVar16.r(pVar4) | mVar16.r(xVar);
                    Object objQ21 = mVar16.q();
                    if (zR14) {
                        objQ21 = new cw1.g0(qVar, 23, pVar4, xVar);
                        mVar16.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            objQ21 = new cw1.g0(qVar, 23, pVar4, xVar);
                            mVar16.K(objQ21);
                        }
                    }
                    w52.t.c(x0Var, j0Var3, dVar6, (e23.a) objQ21, mVar16, (iIntValue17 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 3));
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ y(int i14, e23.a aVar, Object obj, Object obj2, o13.h hVar) {
        this.f1088a = i14;
        this.f1089b = obj;
        this.f1091d = aVar;
        this.f1090c = obj2;
        this.f1092e = hVar;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f1088a = i14;
        this.f1089b = obj;
        this.f1090c = obj2;
        this.f1091d = obj3;
        this.f1092e = obj4;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f1088a = i14;
        this.f1089b = obj;
        this.f1090c = obj2;
        this.f1092e = obj3;
        this.f1091d = obj4;
    }

    public /* synthetic */ y(List list, e23.l lVar, p1 p1Var, Object obj, int i14) {
        this.f1088a = i14;
        this.f1089b = list;
        this.f1092e = lVar;
        this.f1090c = p1Var;
        this.f1091d = obj;
    }
}
