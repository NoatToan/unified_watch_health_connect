package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$checkAutoLoggingEnabled$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f128113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f128113c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f128113c, dVar);
        sVar.f128112b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        o53.b0 b0Var = (o53.b0) this.f128112b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128111a;
        r rVar = this.f128113c;
        if (i14 == 0) {
            o13.r.b(obj);
            rv0.a aVar2 = rVar.f128104e;
            this.f128112b = b0Var;
            this.f128111a = 1;
            obj = aVar2.o(this);
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
            boolean zBooleanValue = ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
            p2 p2Var = rVar.f128105f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d.a((d) value, null, null, null, false, false, zBooleanValue, false, 95)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get auto logging status: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LifestyleLoggingEditBehavioursViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
