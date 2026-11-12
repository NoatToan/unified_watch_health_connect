package w51;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$getApplicationDeviceInfo$1", f = "PendingActivityDetailsViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f182390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f182391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q0 q0Var, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f182391c = q0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r0 r0Var = new r0(this.f182391c, dVar);
        r0Var.f182390b = obj;
        return r0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f182390b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182389a;
        q0 q0Var = this.f182391c;
        if (i14 == 0) {
            o13.r.b(obj);
            u51.b bVar = q0Var.f182371b;
            z51.h hVar = ((p0) q0Var.f182376g.f150540a.getValue()).f182344a;
            Long l14 = hVar != null ? hVar.f202507c : null;
            this.f182390b = b0Var;
            this.f182389a = 1;
            obj = ge1.b.e0(bVar.f168700b, new u51.a(l14, bVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            q0Var.f182377h.setValue(((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.PENDING_ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PendingActivityDetailsViewModel", "fetchDeviceInfo: error retrieving device settings");
        }
        return Unit.INSTANCE;
    }
}
