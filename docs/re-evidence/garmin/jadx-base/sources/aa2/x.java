package aa2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$createPasscode$2", f = "DevicePasscodeViewModel.kt", l = {258}, m = "invokeSuspend", v = 1)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f2421b = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f2421b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2420a;
        u uVar = this.f2421b;
        if (i14 == 0) {
            o13.r.b(obj);
            x92.a.f189663a.getClass();
            x92.a.a("DevicePasscodeViewModel", "Setting passcode");
            y92.d dVar = uVar.f2392d;
            String str = ((t) uVar.f2393e.getValue()).f2376c;
            z92.a aVar2 = uVar.f2390b;
            y92.e eVar = uVar.f2391c;
            this.f2420a = 1;
            objB = dVar.b(str, aVar2, eVar, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objB = obj;
        }
        z92.b bVar = (z92.b) objB;
        boolean z14 = bVar != null ? bVar.f203141a : false;
        z92.b.a aVar3 = bVar != null ? bVar.f203142b : null;
        p2 p2Var = uVar.f2393e;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, t.a((t) value, null, null, null, null, 0, false, false, false, false, false, !z14, false, 13823)));
        if (z14) {
            x92.a.f189663a.getClass();
            x92.a.a("DevicePasscodeViewModel", "Passcode set successfully, responseCode: " + aVar3);
            uVar.A4(ca2.c.a(((t) uVar.f2393e.getValue()).f2374a));
        } else {
            x92.a.f189663a.getClass();
            x92.a.b("DevicePasscodeViewModel", "Failed to set passcode, responseCode: " + aVar3);
        }
        return Unit.INSTANCE;
    }
}
