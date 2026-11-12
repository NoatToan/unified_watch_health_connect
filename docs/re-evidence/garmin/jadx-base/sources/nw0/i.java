package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingAutoLogBehaviorsViewModel$getBehaviours$1", f = "LifestyleLoggingAutoLogBehaviorsViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f128047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f128047c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f128047c, dVar);
        iVar.f128046b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        o53.b0 b0Var = (o53.b0) this.f128046b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128045a;
        g gVar = this.f128047c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (az0.b.a()) {
                gVar.x4(true);
                rv0.a aVar2 = gVar.f128026a;
                this.f128046b = b0Var;
                this.f128045a = 1;
                obj = aVar2.i(g22.l.d(b63.o.INSTANCE), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "LifestyleLoggingAutoLogBehaviorsViewModel", "Failed to load behaviours: no network connection");
                gVar.x4(false);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            List list = (List) ((v2.b) v2Var).f47386a;
            p2 p2Var = gVar.f128031f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, list));
            gVar.x4(false);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "LifestyleLoggingAutoLogBehaviorsViewModel", "Failed to load behaviours");
            gVar.x4(false);
        }
        return Unit.INSTANCE;
    }
}
