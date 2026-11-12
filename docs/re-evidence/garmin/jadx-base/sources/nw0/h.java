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
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingAutoLogBehaviorsViewModel$checkAutoLoggingEnabled$1", f = "LifestyleLoggingAutoLogBehaviorsViewModel.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f128041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f128041c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f128041c, dVar);
        hVar.f128040b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        o53.b0 b0Var = (o53.b0) this.f128040b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128039a;
        g gVar = this.f128041c;
        if (i14 == 0) {
            o13.r.b(obj);
            rv0.a aVar2 = gVar.f128026a;
            this.f128040b = b0Var;
            this.f128039a = 1;
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
            p2 p2Var = gVar.f128029d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, a.a((a) value, false, zBooleanValue, false, 5)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get auto logging status: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LifestyleLoggingAutoLogBehaviorsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
