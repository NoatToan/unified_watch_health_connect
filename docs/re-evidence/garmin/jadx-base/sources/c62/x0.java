package c62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc62/x0;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "Lw52/v0;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t>, w52.v0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, t.class, "duplicateMSNWorkout", "duplicateMSNWorkout()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((t) this.receiver).s4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, t.class, "viewMyMSNWorkoutCopy", "viewMyMSNWorkoutCopy()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((t) this.receiver).a1();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-1229263745);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zD = g22.n.d(eVar.getF48577a().f48056p);
            boolean z15 = eVar.l().f24691b != -1;
            if (eVar.o() instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.b) {
                o0VarE.C(-2104764741);
                w52.o.b(this, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2104726301);
                o0VarE.g0(false);
            }
            if (zD) {
                o0VarE.C(-2104687303);
                w52.e0.a(this, eVar.getF48577a().f48057q, eVar.getF48577a().f48058r, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2104523933);
                o0VarE.g0(false);
            }
            if (!eVar.getF48577a().H() || eVar.getF48577a().F()) {
                o0VarE.C(-2104346365);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2104429011);
                w52.v.a(this, eVar.getF48577a().B, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            }
            if (z15) {
                o0VarE.C(-2104307491);
                int i16 = i15 & 14;
                boolean z16 = i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar));
                Object objQ = o0VarE.q();
                p3.m.a aVar = p3.m.f135153a;
                if (z16) {
                    objQ = new a(tVar);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(tVar);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) ((k23.g) objQ);
                if (i16 != 4 && ((i15 & 8) == 0 || !o0VarE.r(tVar))) {
                    z14 = false;
                }
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new b(tVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(tVar);
                        o0VarE.K(objQ2);
                    }
                }
                w52.w.a(this, aVar2, (e23.a) ((k23.g) objQ2), o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2104178717);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, tVar, eVar, i14, 13);
        }
    }
}
