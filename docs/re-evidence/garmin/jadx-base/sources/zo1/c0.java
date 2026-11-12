package zo1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRidePrivacyViewModel$removeMyselfFromGroupRideResults$1", f = "GroupRidePrivacyViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f206247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f206248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, String str, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f206247c = b0Var;
        this.f206248d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f206247c, this.f206248d, dVar);
        c0Var.f206246b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f206246b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206245a;
        b0 b0Var2 = this.f206247c;
        if (i14 == 0) {
            o13.r.b(obj);
            vo1.c cVar = b0Var2.f206234a;
            this.f206246b = b0Var;
            this.f206245a = 1;
            cVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(cVar, new vo1.p(cVar, this.f206248d, null), this);
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
            int i15 = b0.f206233f;
            b0Var2.f206237d.k(null, Boolean.FALSE);
            b0Var2.f206235b.k(null, Boolean.TRUE);
            a2 a2Var = a2.ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GroupRidePrivacyViewModel", "removed from social group ride");
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = b0.f206233f;
            b0Var2.f206237d.k(null, Boolean.FALSE);
            a2 a2Var2 = a2.ACTIVITIES;
            String strN = fb1.c.n("error remove from social group ride: ", ((v2.a) v2Var).f47385c);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "GroupRidePrivacyViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
