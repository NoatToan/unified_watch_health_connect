package ri1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pc0.n0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$checkEmergencyInfoAlertStatus$1", f = "InReachSubscriptionManagerViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f152910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f152910c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f152910c, dVar);
        uVar.f152909b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG;
        Object value2;
        b0 b0Var = (b0) this.f152909b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152908a;
        s sVar = this.f152910c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = sVar.f152894h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, si1.k.b((si1.k) value, true, false, null, false, false, false, false, false, null, 2046)));
            ui1.l lVar = sVar.f152890d;
            long j8 = sVar.f152887a;
            this.f152909b = b0Var;
            this.f152908a = 1;
            objG = lVar.g(j8, this);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objG = obj;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        n0 n0Var = sVar.f152893g;
        long j14 = sVar.f152887a;
        n0Var.h(zBooleanValue);
        if (zBooleanValue) {
            String strF = a0.f(j14, "checkEmergencyInfoAlertStatus: removing device ", " from local cache because emergency contacts have been reviewed");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", strF);
            sVar.f152893g.b(j14);
        }
        p2 p2Var2 = sVar.f152894h;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, si1.k.b((si1.k) value2, false, false, null, false, false, false, !zBooleanValue, false, null, 1790)));
        return Unit.INSTANCE;
    }
}
