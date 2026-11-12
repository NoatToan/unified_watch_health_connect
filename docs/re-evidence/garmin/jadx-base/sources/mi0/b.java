package mi0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FollowRequestViewModel$resetMap$1", f = "FollowRequestViewModel.kt", l = {88, 89}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f118706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f118706b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f118706b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118705a;
        a aVar2 = this.f118706b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        p2 p2Var = aVar2.f118686e;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f118705a = 1;
        p2Var.k(null, k0Var);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        p2 p2Var2 = aVar2.f118685d;
        k0 k0Var2 = k0.f134949a;
        k0Var2.getClass();
        this.f118705a = 2;
        p2Var2.k(null, k0Var2);
    }
}
