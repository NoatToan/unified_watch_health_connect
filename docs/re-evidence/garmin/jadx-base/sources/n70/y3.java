package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\b\u0001\u0012\u00020\u00070\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lj70/k$f;", "secondaryStats", "Lj70/i;", "realTime", "Lj70/j;", "", "", "", "<anonymous>", "(Lj70/k$f;Lj70/i;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$1$params$23", f = "GetSecondaryStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3 extends v13.i implements e23.q<j70.k.f, j70.i, t13.d<? super j70.j<List<? extends String>, ? extends Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.i f124769b;

    public y3(t13.d<? super y3> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, j70.i iVar, t13.d<? super j70.j<List<? extends String>, ? extends Object>> dVar) {
        y3 y3Var = new y3(dVar);
        y3Var.f124768a = fVar;
        y3Var.f124769b = iVar;
        return y3Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.f fVar = this.f124768a;
        j70.i iVar = this.f124769b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f12.l.f68084a.getClass();
        boolean zB3 = f12.l.a.a().B3();
        Object obj2 = null;
        List listK = p13.x.k(fVar != null ? fVar.f97566b : null, fVar != null ? fVar.B : null);
        yz1.d dVarA = yz1.e.a(fVar != null ? fVar.f97565a : null, new y1(listK, iVar, 4));
        if (zB3) {
            if (iVar != null) {
                obj2 = iVar.f97539g;
            }
        } else if (iVar != null) {
            obj2 = iVar.f97538f;
        }
        return new j70.j(dVarA, listK, obj2);
    }
}
