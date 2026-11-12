package o50;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationViewModel$fetchNutritionAndHydration$1", f = "NutritionHydrationViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f129186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f129187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f129188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f129189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Double f129190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f129191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Integer num, Double d14, Double d15, Double d16, Integer num2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f129186b = hVar;
        this.f129187c = num;
        this.f129188d = d14;
        this.f129189e = d15;
        this.f129190f = d16;
        this.f129191g = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f129186b, this.f129187c, this.f129188d, this.f129189e, this.f129190f, this.f129191g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f129185a;
        h hVar = this.f129186b;
        if (i14 == 0) {
            r.b(obj);
            hVar.f129202b.k(null, g3.a.c(g3.f35298f));
            d60.b bVar = (d60.b) hVar.f129201a.getValue();
            this.f129185a = 1;
            obj = bVar.g(this.f129187c, this.f129188d, this.f129189e, this.f129190f, this.f129191g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            p2 p2Var = hVar.f129202b;
            g3.a aVar2 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar2.getClass();
            p2Var.k(null, g3.a.d(t7));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            hVar.f129202b.k(null, g3.a.a(g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, aVar3.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
