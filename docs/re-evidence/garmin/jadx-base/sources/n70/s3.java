package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lj70/k$f;", "secondaryStats", "Lj70/i;", "realTime", "Lj70/j;", "", "", "Lhd1/c0;", "<anonymous>", "(Lj70/k$f;Lj70/i;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$1$params$18", f = "GetSecondaryStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s3 extends v13.i implements e23.q<j70.k.f, j70.i, t13.d<? super j70.j<List<? extends String>, hd1.c0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.i f124560b;

    public s3(t13.d<? super s3> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, j70.i iVar, t13.d<? super j70.j<List<? extends String>, hd1.c0>> dVar) {
        s3 s3Var = new s3(dVar);
        s3Var.f124559a = fVar;
        s3Var.f124560b = iVar;
        return s3Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.f fVar = this.f124559a;
        j70.i iVar = this.f124560b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List listK = p13.x.k(fVar != null ? fVar.f97566b : null, fVar != null ? fVar.B : null);
        return new j70.j(yz1.e.a(fVar != null ? fVar.f97565a : null, new y1(listK, iVar, 3)), listK, iVar != null ? iVar.f97537e : null);
    }
}
