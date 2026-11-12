package zb0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lzb0/g$a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceDetailsViewModel$checkEcgState$1", f = "DeviceDetailsViewModel.kt", l = {45, 49}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<androidx.lifecycle.t0<g.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f203522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f203523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f203524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, long j8, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f203523c = gVar;
        this.f203524d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f203523c, this.f203524d, dVar);
        hVar.f203522b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<g.a> t0Var, t13.d<? super Unit> dVar) {
        return ((h) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f203522b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203521a;
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
        b31.a aVar2 = (b31.a) this.f203523c.f203484d.getValue();
        d31.d dVar = d31.d.ECG;
        this.f203522b = t0Var;
        this.f203521a = 1;
        obj = aVar2.a(this.f203524d, dVar, this);
        if (obj != aVar) {
        }
        return aVar;
        d31.a aVar3 = (d31.a) obj;
        g.a aVar4 = new g.a(aVar3 != null, (aVar3 != null ? aVar3.f57328h : null) == d31.c.COMPLETED);
        this.f203522b = null;
        this.f203521a = 2;
    }
}
