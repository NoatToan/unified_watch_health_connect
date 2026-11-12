package zb0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceTopHeaderViewModel$fetchDevice$1", f = "DeviceTopHeaderViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f203525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f203526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f203527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f203528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, long j8, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f203527c = i0Var;
        this.f203528d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f203527c, this.f203528d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.lifecycle.y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203526b;
        if (i14 == 0) {
            o13.r.b(obj);
            i0 i0Var = this.f203527c;
            androidx.lifecycle.y0<sd2.f> y0Var2 = i0Var.f203534b;
            pc0.j jVar = i0Var.f203533a;
            this.f203525a = y0Var2;
            this.f203526b = 1;
            jVar.getClass();
            x53.c cVar = o53.s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new pc0.q(this.f203528d, null), this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f203525a;
            o13.r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}
