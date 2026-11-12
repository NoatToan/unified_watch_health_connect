package e30;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.SendPaceProToDeviceUseCase$invoke$1", f = "SendPaceProToDeviceUseCase.kt", l = {19, 23}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f62653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f62654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f62655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, long j8, long j14, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f62653c = b0Var;
        this.f62654d = j8;
        this.f62655e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f62653c, this.f62654d, this.f62655e, dVar);
        a0Var.f62652b = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((a0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f62652b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62651a;
        b0 b0Var = this.f62653c;
        if (i14 != 0) {
            if (i14 == 1) {
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
        r41.a aVar2 = b0Var.f62658a;
        this.f62652b = jVar;
        this.f62651a = 1;
        obj = f0.J(aVar2, new r41.g(aVar2, this.f62654d, this.f62655e, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        int i15 = b0.f62657b;
        b0Var.getClass();
        if (v2Var instanceof v2.b) {
            Bundle bundleA = h7.c.a(new o13.p("planId", String.valueOf(this.f62654d)));
            ht.a.f85464a.getClass();
            ht.a.a(bundleA, "PaceProSendToDevice");
        }
        this.f62652b = null;
        this.f62651a = 2;
    }
}
