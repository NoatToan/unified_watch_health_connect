package k90;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDevicePairingState$isDevicePaired$2", f = "GetDevicePairingState.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f103493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.d f103494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, dk2.d dVar, t13.d<? super g0> dVar2) {
        super(2, dVar2);
        this.f103493a = i0Var;
        this.f103494b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f103493a, this.f103494b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f103493a.f103498a.getClass();
        ArrayList<sd2.f> arrayListE = rd2.j.e();
        boolean z14 = false;
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (sd2.f fVar : arrayListE) {
                long unitID = fVar.getUnitID();
                dk2.d dVar = this.f103494b;
                Long l14 = dVar.f60244h;
                String str = dVar.f60238b;
                if ((l14 != null && unitID == l14.longValue()) || ((fVar.Q() != null && d53.u.q(fVar.Q(), str, true)) || ((fVar.d0() != null && d53.u.q(fVar.d0(), str, true)) || (fVar.Q() != null && d53.u.q(fVar.Q(), dVar.f60247k, true))))) {
                    z14 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
