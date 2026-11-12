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
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingAutoLogBehaviorsViewModel$setAutoLoggingEnabled$1", f = "LifestyleLoggingAutoLogBehaviorsViewModel.kt", l = {87, 87}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f128053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f128054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z14, g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f128053c = z14;
        this.f128054d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f128053c, this.f128054d, dVar);
        jVar.f128052b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r7 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 == r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        Object value;
        o53.b0 b0Var = (o53.b0) this.f128052b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128051a;
        g gVar = this.f128054d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f128053c) {
                rv0.a aVar2 = gVar.f128026a;
                this.f128052b = b0Var;
                this.f128051a = 1;
                obj = aVar2.g(this);
            } else {
                rv0.a aVar3 = gVar.f128026a;
                this.f128052b = b0Var;
                this.f128051a = 2;
                obj = aVar3.q(this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2Var = (v2) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
        }
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to set auto logging preference: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LifestyleLoggingAutoLogBehaviorsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
