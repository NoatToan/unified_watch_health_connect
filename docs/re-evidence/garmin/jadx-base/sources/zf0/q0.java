package zf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$getEventProviders$1", f = "RaceAndEventBaseViewModel.kt", l = {303}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f204480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(j0 j0Var, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f204480c = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q0 q0Var = new q0(this.f204480c, dVar);
        q0Var.f204479b = obj;
        return q0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f204479b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204478a;
        j0 j0Var = this.f204480c;
        if (i14 == 0) {
            o13.r.b(obj);
            ig0.b bVarH4 = j0Var.H4();
            this.f204479b = b0Var;
            this.f204478a = 1;
            bVarH4.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.f(bVarH4, null), this);
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
            int i15 = j0.F;
            ((androidx.lifecycle.y0) j0Var.f204402t.getValue()).j(((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = j0.F;
            ((androidx.lifecycle.y0) j0Var.f204402t.getValue()).j(null);
            v2.a aVar2 = (v2.a) v2Var;
            String str = "Error fetching Event providers " + aVar2.f47383a + StringUtils.SPACE + aVar2.f47384b;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", str);
        }
        return Unit.INSTANCE;
    }
}
