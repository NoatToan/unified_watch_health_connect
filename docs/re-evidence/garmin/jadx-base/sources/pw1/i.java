package pw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardViewModel$removePlan$1", f = "ITPDashboardViewModel.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f141762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f141763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f141764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, long j8, e23.a<Unit> aVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f141762c = dVar;
        this.f141763d = j8;
        this.f141764e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f141762c, this.f141763d, this.f141764e, dVar);
        iVar.f141761b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f141761b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141760a;
        long j8 = this.f141763d;
        d dVar = this.f141762c;
        if (i14 == 0) {
            r.b(obj);
            uw1.b bVar = dVar.I;
            this.f141761b = b0Var;
            this.f141760a = 1;
            obj = bVar.a(j8, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            this.f141764e.invoke();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            String strU = v.h.u(j8, "Error deleting plan ", StringUtils.SPACE, aVar2.f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "ITPDashboardViewModel", strU);
            int i15 = d.H0;
            dVar.a5().m(g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}
