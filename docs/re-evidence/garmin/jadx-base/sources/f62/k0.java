package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lf62/k0;", "Ll52/t;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 implements l52.t<com.garmin.android.apps.connectmobile.workouts.data.model.j0, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f69266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f69267d;

    public k0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar) {
        this.f69265b = rVar;
        this.f69266c = eVar;
        this.f69267d = qVar;
    }

    @Override // l52.t
    public final void a(l52.f.e eVar) {
        Boolean boolValueOf = Boolean.valueOf(this.f69264a);
        int i14 = o13.q.f128596b;
        eVar.a(boolValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    @Override // l52.t
    public final void b(l52.f.e eVar, l52.i.a aVar) {
        Boolean boolValueOf;
        boolean z14;
        if (aVar.k()) {
            return;
        }
        m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
        this.f69265b.getClass();
        e52.b bVar = new e52.b(aVar, new p005kotlin.jvm.internal.r0());
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar2 = this.f69266c;
        eVar2.getClass();
        l52.i.a aVarE = l52.o.e(eVar2, bVar);
        m52.k kVar = this.f69267d.f49245a;
        o13.t tVar = k52.g.f102952a;
        if (!bo1.a.a().c().U0() || ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48217c != m52.d.REPEAT) {
            boolValueOf = null;
        } else if ((aVarE != null ? (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVarE.getData() : null) == null) {
            boolValueOf = null;
        } else {
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            l52.o.f(aVar, new c2.s0(r0Var, 2));
            m52.d dVar = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVarE.getData()).f48217c;
            m52.d dVar2 = m52.d.REST;
            m52.d dVar3 = m52.d.RECOVERY;
            if (!p13.h0.R(p13.u.m0(new m52.d[]{dVar2, dVar3}), r0Var.f105810a)) {
                boolValueOf = null;
            } else if (dVar == r0Var.f105810a) {
                boolValueOf = Boolean.TRUE;
            } else if (dVar == m52.d.COOL_DOWN) {
                switch (com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.e.f49315a[kVar.ordinal()]) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        if (r0Var.f105810a != dVar3) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        break;
                    case 2:
                        z14 = true;
                        break;
                    case 3:
                    default:
                        z14 = false;
                        break;
                }
                boolValueOf = Boolean.valueOf(z14);
            } else {
                boolValueOf = Boolean.FALSE;
            }
        }
        if (boolValueOf == null) {
            ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48222h = false;
            ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48221g = null;
        } else if (((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48221g != null && ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48222h) {
            return;
        } else {
            ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48221g = boolValueOf;
        }
        this.f69264a = true;
    }
}
