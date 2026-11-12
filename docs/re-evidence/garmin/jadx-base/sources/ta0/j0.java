package ta0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceScanChecksViewModel$clearExistingPairingAndPairNew$1", f = "DeviceScanChecksViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f163375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yl2.b f163376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l90.b f163377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, yl2.b bVar, l90.b bVar2, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f163375b = k0Var;
        this.f163376c = bVar;
        this.f163377d = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f163375b, this.f163376c, this.f163377d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163374a;
        k0 k0Var = this.f163375b;
        if (i14 == 0) {
            o13.r.b(obj);
            k90.t tVar = k0Var.f163380b;
            this.f163374a = 1;
            Object objE0 = ge1.b.e0(tVar.f103611d, new k90.u(tVar, this.f163376c, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        p2 p2Var = k0Var.f163381c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, new va0.b.a(this.f163377d)));
        return Unit.INSTANCE;
    }
}
