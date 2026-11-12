package l52;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m52.k f110370b;

    public /* synthetic */ v(int i14, m52.k kVar) {
        this.f110369a = i14;
        this.f110370b = kVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m52.a aVar;
        int i14 = this.f110369a;
        m52.k kVar = this.f110370b;
        r rVar = (r) obj;
        i.a aVar2 = (i.a) obj2;
        switch (i14) {
            case 0:
                rVar.getClass();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData();
                m52.d dVar = j0Var.f48217c;
                if (kVar == m52.k.f116762x || kVar == m52.k.f116761w || kVar == m52.k.f116763y) {
                    if (dVar == m52.d.INTERVAL && j0Var.g() == null) {
                        Boolean bool = Boolean.FALSE;
                        int i15 = o13.q.f128596b;
                        rVar.a(bool);
                    }
                } else if (dVar != m52.d.REST && dVar != m52.d.REPEAT && dVar != m52.d.RECOVERY && j0Var.g() == null) {
                    Boolean bool2 = Boolean.FALSE;
                    int i16 = o13.q.f128596b;
                    rVar.a(bool2);
                }
                break;
            case 1:
                rVar.getClass();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData();
                m52.d dVar2 = j0Var2.f48217c;
                m52.k kVar2 = m52.k.f116758r;
                if (kVar == kVar2 && dVar2 != m52.d.REST) {
                    x52.f.f189078g.getClass();
                    x52.f fVarB = x52.f.a.b(j0Var2, kVar2);
                    x52.f fVar = x52.f.f189084m;
                    if (fVarB == fVar) {
                        Boolean bool3 = Boolean.TRUE;
                        int i17 = o13.q.f128596b;
                        rVar.a(bool3);
                    }
                    if (x52.f.a.a(j0Var2, kVar2) == fVar) {
                        Boolean bool4 = Boolean.TRUE;
                        int i18 = o13.q.f128596b;
                        rVar.a(bool4);
                    }
                }
                break;
            default:
                rVar.getClass();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData();
                m52.d dVar3 = j0Var3.f48217c;
                if (kVar == m52.k.f116758r && dVar3 == m52.d.REST && (aVar = j0Var3.f48227l) != null) {
                    x52.c.f189053e.getClass();
                    x52.c cVarA = x52.c.a.a(aVar);
                    if (cVarA != null && cVarA == x52.c.FIXED_REPETITION) {
                        Boolean bool5 = Boolean.TRUE;
                        int i19 = o13.q.f128596b;
                        rVar.a(bool5);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
