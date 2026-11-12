package fr2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import v13.i;
import vb.h;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljs2/d;", "<anonymous>", "(Lo53/b0;)Ljs2/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.common.viewmodels.DeviceSelectionViewModel$refreshPasscodeStatus$2", f = "DeviceSelectionViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super js2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f73323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f73323b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f73323b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super js2.d> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f73322a;
        long j8 = this.f73323b;
        if (i14 == 0) {
            r.b(obj);
            w.f140538a.getClass();
            n nVarI = w.i(j8);
            if (nVarI != null) {
                q03.r<js2.d> rVarB = nVarI.b();
                this.f73322a = 1;
                obj = a0.f(rVarB, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h.z(org.apache.commons.lang3.e.e(j8, "No device wallet found for "));
            return null;
        }
        if (i14 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        js2.d dVar = (js2.d) obj;
        if (dVar != null) {
            return dVar;
        }
        h.z(org.apache.commons.lang3.e.e(j8, "No device wallet found for "));
        return null;
    }
}
