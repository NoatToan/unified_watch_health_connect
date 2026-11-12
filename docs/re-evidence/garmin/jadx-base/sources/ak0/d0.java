package ak0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$setGlobalBadges$1", f = "GCPlusHomeViewModel.kt", l = {529}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f3601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, boolean z14, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f3601b = eVar;
        this.f3602c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f3601b, this.f3602c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3600a;
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = this.f3601b;
        if (i14 == 0) {
            o13.r.b(obj);
            oj0.f fVar = eVar.f35411e;
            this.f3600a = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new oj0.v(fVar, this.f3602c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            p2 p2Var = eVar.f35426v;
            g3.a aVar2 = g3.f35298f;
            Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean(((z70.u) ((v2.b) v2Var).f47386a).f202869b));
            aVar2.getClass();
            p2Var.k(null, g3.a.d(boolValueOf));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            eVar.f35426v.k(null, g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
