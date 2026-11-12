package x80;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$launchPostPairingActions$1", f = "DeviceSetupViewModel.kt", l = {351}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f189526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.c f189527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, q90.c cVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f189526b = eVar;
        this.f189527c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f189526b, this.f189527c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189525a;
        if (i14 == 0) {
            r.b(obj);
            e eVar = this.f189526b;
            b bVar = eVar.f189502d;
            q90.c cVar = this.f189527c;
            bVar.b(cVar.f143493a, cVar.f143495c.f111522g);
            p90.n nVar = eVar.f189509k;
            long j8 = cVar.f143493a;
            this.f189525a = 1;
            if (nVar.a(j8) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
