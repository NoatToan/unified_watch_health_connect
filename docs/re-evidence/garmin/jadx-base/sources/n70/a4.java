package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lj70/k$f;", "secondaryStats", "Lj70/i;", "realTime", "Lj70/k$c;", "activitiesAndWorkouts", "Lj70/j;", "Lo13/p;", "", "", "Lhd1/k0;", "<anonymous>", "(Lj70/k$f;Lj70/i;Lj70/k$c;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$1$params$25", f = "GetSecondaryStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a4 extends v13.i implements e23.r<j70.k.f, j70.i, j70.k.c, t13.d<? super j70.j<o13.p<? extends String, ? extends Boolean>, hd1.k0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.i f124017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ j70.k.c f124018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f124019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(i3 i3Var, t13.d<? super a4> dVar) {
        super(4, dVar);
        this.f124019d = i3Var;
    }

    @Override // e23.r
    public final Object invoke(j70.k.f fVar, j70.i iVar, j70.k.c cVar, t13.d<? super j70.j<o13.p<? extends String, ? extends Boolean>, hd1.k0>> dVar) {
        a4 a4Var = new a4(this.f124019d, dVar);
        a4Var.f124016a = fVar;
        a4Var.f124017b = iVar;
        a4Var.f124018c = cVar;
        return a4Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.f fVar = this.f124016a;
        j70.i iVar = this.f124017b;
        j70.k.c cVar = this.f124018c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zB = com.garmin.android.apps.connectmobile.k1.f37122a.B();
        kn.b bVar = this.f124019d.f124279a;
        o13.p pVar = new o13.p(fVar != null ? fVar.f97588x : null, Boolean.valueOf(kn.b.a(cVar != null ? cVar.f97551b : null) && zB));
        return new j70.j(yz1.e.a(fVar != null ? fVar.f97565a : null, new mt0.s1(7, pVar, iVar)), pVar, iVar != null ? iVar.f97540h : null);
    }
}
