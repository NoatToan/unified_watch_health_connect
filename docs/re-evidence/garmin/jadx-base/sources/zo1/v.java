package zo1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$removeMyselfFromGroupRideResults$1", f = "GroupRideDetailsViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f206470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f206471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, String str, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f206470c = qVar;
        this.f206471d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f206470c, this.f206471d, dVar);
        vVar.f206469b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f206469b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206468a;
        q qVar = this.f206470c;
        if (i14 == 0) {
            o13.r.b(obj);
            vo1.c cVar = qVar.f206414a;
            this.f206469b = b0Var;
            this.f206468a = 1;
            cVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(cVar, new vo1.p(cVar, this.f206471d, null), this);
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
            int i15 = q.f206413r;
            qVar.z4(false);
            qVar.f206418e.k(null, Boolean.TRUE);
            a2 a2Var = a2.SOCIAL_GROUP_RIDE;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GroupRideRidersViewModel", "removed from social group ride");
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = q.f206413r;
            qVar.z4(false);
            a2 a2Var2 = a2.SOCIAL_GROUP_RIDE;
            String strN = fb1.c.n("error remove from social group ride: ", ((v2.a) v2Var).f47385c);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "GroupRideRidersViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
