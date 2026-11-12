package f62;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.ve;
import o4.m1;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B;\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012$\u0010\t\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf62/r;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "Lw52/x0;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "repeatNode", "Lkotlin/Function1;", "stepComposable", "<init>", "(Ll52/i$a;Le23/l;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>, w52.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f69316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> f69317b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f69316a = aVar;
        this.f69317b = lVar;
    }

    public final void b(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1788785255);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            float f14 = j92.b.f97900c.f97910b;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            bVar.getClass();
            g6.f.a aVar = g6.f.f75994b;
            e.f69229a.getClass();
            ve.a(o4.s0.c(c2.l.A(rVarC, eVar.f97918c, 0.0f, 2), 0.96f, 0.96f, 0.8f, 0.0f, null, 0, 524280), k2.i.a(f14), n5.a.a(o0VarE, R.color.gcm_surface_1_pressed), 0L, 2, 0.0f, null, e.f69230b, o0VarE, 12607488, 104);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dh1.a(this, i14, 26);
        }
    }

    @Override // r52.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        r rVar;
        r rVar2 = this;
        pVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(1608232851);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = qVar;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = qVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(rVar2) : o0VarE.r(rVar2) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            r rVar3 = this;
            z3.e eVarC = z3.f.c(-145644701, new d50.i(rVar3, c2.b0.f22601a, pVar, obj, 21), o0VarE);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            eVarC.invoke(o0VarE, 6);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            int i17 = (i16 >> 3) & 112;
            rVar3.d(c2.l.A(aVar, eVar2.f97921f, 0.0f, 2), o0VarE, i17);
            bVar2.getClass();
            rVar3.d(c2.l.A(aVar, eVar2.f97922g, 0.0f, 2), o0VarE, i17);
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar = rVar3;
        } else {
            o0VarE.e();
            rVar = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(rVar, pVar, qVar, i14, 3);
        }
    }

    public final void d(h4.r rVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-514374432);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97916a, 0.0f, 0.0f, 13);
            bVar.getClass();
            c2.q.a(u1.n.e(x2.h(rVarC, eVar.f97916a), n5.a.a(o0VarE, R.color.gcm_surface_1_pressed), m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(this, rVar, i14, 2);
        }
    }
}
