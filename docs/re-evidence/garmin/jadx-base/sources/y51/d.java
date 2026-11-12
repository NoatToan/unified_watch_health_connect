package y51;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2$b;", "", "Lam/x0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2$b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.PendingActivitiesRepositoryImpl$noGPSDataActivityTypes$2", f = "PendingActivitiesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super v2.b<? extends List<? extends x0>>>, Object> {
    public d(t13.d<? super d> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2.b<? extends List<? extends x0>>> dVar) {
        return new d(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x0 x0Var = x0.f4316p;
        x0 x0Var2 = x0.f4357z3;
        x0 x0Var3 = x0.f4333t2;
        return new v2.b(x.k(x0Var, x0Var2, x0Var3, x0.f4348x2, x0.A3, x0.C3, x0.D3, x0.f4296k0, x0.f4329s2, x0.L0, x0.U0, x0.f4297k1, x0.f4290i1, x0.f4305m1, x0.f4313o1, x0.f4309n1, x0.f4326r2, x0.f4322q2, x0.N0, x0.f4344w2, x0.f4352y2, x0.E2, x0.Z2, x0.I0, x0.O0, x0.J1, x0.f4334t3, x0.f4330s3, x0.f4341v3, x0.f4345w3, x0.f4327r3, x0.f4349x3, x0.B3, x0.f4336u2, x0.f4346x, x0.f4293j1, x0.C2, x0.f4356z2, x0Var3), 200, null, null, 12, null);
    }
}
