package aa2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.presentation.DevicePasscodeViewModel$changePasscode$2", f = "DevicePasscodeViewModel.kt", l = {225}, m = "invokeSuspend", v = 1)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f2406b = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f2406b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2405a;
        u uVar = this.f2406b;
        if (i14 == 0) {
            o13.r.b(obj);
            x92.a.f189663a.getClass();
            x92.a.a("DevicePasscodeViewModel", "Changing passcode");
            y92.d dVar = uVar.f2392d;
            p2 p2Var = uVar.f2393e;
            String str = ((t) p2Var.getValue()).f2375b;
            String str2 = ((t) p2Var.getValue()).f2376c;
            this.f2405a = 1;
            objA = dVar.a(str, str2, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = obj;
        }
        z92.b bVar = (z92.b) objA;
        boolean z14 = bVar != null ? bVar.f203141a : false;
        z92.b.a aVar2 = bVar != null ? bVar.f203142b : null;
        boolean z15 = aVar2 == z92.b.a.WALLET_BLOCKED;
        boolean z16 = aVar2 == z92.b.a.WALLET_LOCKED;
        p2 p2Var2 = uVar.f2393e;
        do {
            value = p2Var2.getValue();
        } while (!p2Var2.b(value, t.a((t) value, null, null, null, null, 0, false, z15 || z16, z15, z16, false, (z14 || z15 || z16) ? false : true, false, 13375)));
        if (z14) {
            x92.a.f189663a.getClass();
            x92.a.a("DevicePasscodeViewModel", "Passcode changed successfully, responseCode: " + aVar2);
            uVar.A4(ca2.c.a(((t) uVar.f2393e.getValue()).f2374a));
        } else {
            x92.a.f189663a.getClass();
            x92.a.b("DevicePasscodeViewModel", "Failed to change passcode, responseCode: " + aVar2);
        }
        return Unit.INSTANCE;
    }
}
