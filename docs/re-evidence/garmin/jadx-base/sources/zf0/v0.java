package zf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$setAllEventsToNoPriority$1", f = "RaceAndEventBaseViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f204519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(j0 j0Var, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f204519c = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v0 v0Var = new v0(this.f204519c, dVar);
        v0Var.f204518b = obj;
        return v0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f204518b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204517a;
        j0 j0Var = this.f204519c;
        if (i14 == 0) {
            o13.r.b(obj);
            j0Var.O4().j(g3.a.c(g3.f35298f));
            cg0.a aVar2 = (cg0.a) j0Var.f204401r.getValue();
            this.f204518b = b0Var;
            this.f204517a = 1;
            d dVar = aVar2.f27117a;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new j(dVar, null), this);
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
            j0Var.f204399p = true;
            j0Var.O4().j(g3.a.e(g3.f35298f));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            v2.a aVar3 = (v2.a) v2Var;
            String str = "Error while setting events to no priority " + aVar3.f47384b + " :: " + aVar3.f47383a + StringUtils.SPACE;
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", str);
        }
        return Unit.INSTANCE;
    }
}
