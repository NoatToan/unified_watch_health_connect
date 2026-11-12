package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetServerMaintenanceStatusUseCase$getScheduledServerMaintenanceStatus$1", f = "GetServerMaintenanceStatusUseCase.kt", l = {68, 68}, m = "invokeSuspend", v = 2)
public final class u5 extends v13.i implements e23.p<r53.j<? super String>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f124671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w5 f124674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(w5 w5Var, t13.d<? super u5> dVar) {
        super(2, dVar);
        this.f124674d = w5Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u5 u5Var = new u5(this.f124674d, dVar);
        u5Var.f124673c = obj;
        return u5Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super String> jVar, t13.d<? super Unit> dVar) {
        return ((u5) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f124673c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124672b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f124671a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        l70.k0 k0Var = this.f124674d.f124716a;
        l70.j0 j0Var = l70.j0.ONGOING_MAINTENANCE;
        this.f124673c = null;
        this.f124671a = jVar;
        this.f124672b = 1;
        obj = k0Var.b(j0Var, new p006l2.w2(27));
        if (obj != aVar) {
        }
        return aVar;
        this.f124673c = null;
        this.f124671a = null;
        this.f124672b = 2;
    }
}
