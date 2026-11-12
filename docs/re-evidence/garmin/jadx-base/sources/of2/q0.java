package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo13/q;", "", "<anonymous>", "()Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager$sendPauseAndSaveRequests$2", f = "LSVSessionManager.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.l<t13.d<? super o13.q<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(c0 c0Var, t13.d<? super q0> dVar) {
        super(1, dVar);
        this.f131903b = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q0(this.f131903b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super o13.q<? extends Unit>> dVar) {
        return ((q0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131902a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f131902a = 1;
            int i15 = c0.f131771p;
            objO = this.f131903b.o(null, this);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objO = ((o13.q) obj).f128597a;
        }
        return o13.q.a(objO);
    }
}
