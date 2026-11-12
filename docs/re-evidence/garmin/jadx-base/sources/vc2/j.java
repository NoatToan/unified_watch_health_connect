package vc2;

import android.os.SystemClock;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.connectivity.ServerAvailabilityMonitor$checkServerStatus$1", f = "ServerAvailabilityMonitor.kt", l = {104}, m = "invokeSuspend")
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f177117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f177118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f177119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f177119c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f177119c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177118b;
        if (i14 == 0) {
            r.b(obj);
            i iVar = this.f177119c;
            p2 p2Var2 = iVar.f177114c;
            this.f177117a = p2Var2;
            this.f177118b = 1;
            obj = iVar.a(2, this);
            if (obj == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f177117a;
            r.b(obj);
        }
        p2Var.setValue(obj);
        this.f177119c.f177115d = SystemClock.elapsedRealtime();
        this.f177119c.f177116e.set(false);
        return Unit.INSTANCE;
    }
}
