package is0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryViewModel$fetchTrips$1", f = "JetLagSummaryViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f94922b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f94922b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94921a;
        c cVar = this.f94922b;
        if (i14 == 0) {
            r.b(obj);
            cVar.f94906c.j(g3.a.c(g3.f35298f));
            zr0.a aVar2 = cVar.f94904a;
            this.f94921a = 1;
            obj = aVar2.f(this);
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
            z.h(g3.f35298f, ((v2.b) v2Var).f47386a, cVar.f94906c);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            Integer num = aVar3.f47384b;
            if (num != null && num.intValue() == 404) {
                z.h(g3.f35298f, null, cVar.f94906c);
            } else {
                cVar.f94906c.j(g3.a.a(g3.f35298f, aVar3.f47385c, null, null, null, 14));
            }
        }
        return Unit.INSTANCE;
    }
}
