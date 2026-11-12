package ew0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingCheckViewModel$checkOnboardingCompleted$1", f = "LifestyleLoggingOnboardingCheckViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f66225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f66225b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f66225b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Boolean bool;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66224a;
        k kVar = this.f66225b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar.f66228c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, i.a((i) value, true, false, null, 4)));
            if (kVar.f66226a.k()) {
                p2 p2Var2 = kVar.f66228c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, i.a((i) value2, false, false, Boolean.TRUE, 2)));
            } else {
                rv0.a aVar2 = kVar.f66227b;
                this.f66224a = 1;
                obj = aVar2.k(this);
                if (obj == aVar) {
                    return aVar;
                }
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
            p2 p2Var3 = kVar.f66228c;
            do {
                value4 = p2Var3.getValue();
                bool = (Boolean) ((v2.b) v2Var).f47386a;
                bool.booleanValue();
            } while (!p2Var3.b(value4, i.a((i) value4, false, false, bool, 2)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var4 = kVar.f66228c;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, i.a((i) value3, false, true, null, 4)));
        }
        return Unit.INSTANCE;
    }
}
