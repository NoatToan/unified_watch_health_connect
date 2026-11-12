package hv;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.device.TellUsMoreViewModel$getUserSettings$1", f = "TellUsMoreViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<UserSettingsDTO>> f85790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f85791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y0<g3<UserSettingsDTO>> y0Var, o oVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f85790b = y0Var;
        this.f85791c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f85790b, this.f85791c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85789a;
        y0<g3<UserSettingsDTO>> y0Var = this.f85790b;
        if (i14 == 0) {
            r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            oj1.c cVar = this.f85791c.f85785a;
            this.f85789a = 1;
            obj = cVar.b(this);
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
            z.h(g3.f35298f, ((v2.b) v2Var).f47386a, y0Var);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
