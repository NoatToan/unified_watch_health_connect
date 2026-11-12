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
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$setAutoLoggingEnabled$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {212, 212}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f128124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f128125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z14, r rVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f128124c = z14;
        this.f128125d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f128124c, this.f128125d, dVar);
        vVar.f128123b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r1 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1 == r2) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        Object objG;
        v2 v2Var;
        Object value;
        o53.b0 b0Var = (o53.b0) this.f128123b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128122a;
        r rVar = this.f128125d;
        boolean z14 = this.f128124c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (z14) {
                rv0.a aVar2 = rVar.f128104e;
                this.f128123b = b0Var;
                this.f128122a = 1;
                objG = aVar2.g(this);
            } else {
                rv0.a aVar3 = rVar.f128104e;
                this.f128123b = b0Var;
                this.f128122a = 2;
                objQ = aVar3.q(this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objG = obj;
            v2Var = (v2) objG;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objQ = obj;
            v2Var = (v2) objQ;
        }
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("Auto Logging preference updated: ", z14);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LifestyleLoggingEditBehavioursViewModel", strH);
            p2 p2Var = rVar.f128105f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d.a((d) value, null, null, null, false, false, z14, false, 95)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to set auto logging preference: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "LifestyleLoggingEditBehavioursViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
