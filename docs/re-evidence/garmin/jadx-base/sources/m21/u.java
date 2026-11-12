package m21;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.i0;
import yc.v2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lyc/v2;", "Lg01/n;", "pagingData", "", "Lm21/a;", "events", "<anonymous>", "(Lyc/v2;Ljava/util/List;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$getCachePagingFlow$1", f = "FoodSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.q<v2<g01.n>, List<? extends a>, t13.d<? super v2<g01.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ v2 f116173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f116174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f116175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g gVar, t13.d<? super u> dVar) {
        super(3, dVar);
        this.f116175c = gVar;
    }

    @Override // e23.q
    public final Object invoke(v2<g01.n> v2Var, List<? extends a> list, t13.d<? super v2<g01.n>> dVar) {
        u uVar = new u(this.f116175c, dVar);
        uVar.f116173a = v2Var;
        uVar.f116174b = list;
        return uVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2VarB = this.f116173a;
        List<a> list = this.f116174b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        for (a aVar2 : list) {
            int i14 = g.f116107v;
            this.f116175c.getClass();
            if (aVar2 instanceof a.C2204a) {
                v2VarB = i0.b(v2VarB, new i(aVar2, null));
            } else if (aVar2 instanceof a.b) {
                v2VarB = i0.b(v2VarB, new j(aVar2, null));
            } else if (aVar2 instanceof a.c) {
                v2VarB = i0.b(v2VarB, new k(aVar2, null));
            } else if (aVar2 instanceof a.d) {
                v2VarB = i0.e(v2VarB, new l(aVar2, null));
            } else if (aVar2 instanceof a.e) {
                v2VarB = i0.e(v2VarB, new m(aVar2, null));
            } else {
                if (!(aVar2 instanceof a.f)) {
                    u0.r();
                    return null;
                }
                v2VarB = i0.e(v2VarB, new n(aVar2, null));
            }
        }
        return v2VarB;
    }
}
