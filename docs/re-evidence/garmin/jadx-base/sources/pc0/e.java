package pc0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.CrossSellAccessoriesCache$prefetch$job$1", f = "CrossSellAccessoriesCache.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f137205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f137205b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f137205b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137204a;
        String str = this.f137205b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                g.f137209b.getClass();
                Object value = g.f137211d.getValue();
                value.getClass();
                g gVar = new g((ac0.b) value);
                this.f137204a = 1;
                obj = com.garmin.android.apps.connectmobile.f0.J(gVar, new h(gVar, str, null), this);
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
                com.garmin.android.apps.connectmobile.devices.model.e result = ((com.garmin.android.apps.connectmobile.devices.model.d) ((v2.b) v2Var).f47386a).getResult();
                if (result != null) {
                    f.f137207b.put(str, result);
                }
            } else if (!(v2Var instanceof v2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f.f137208c.remove(str);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            f.f137208c.remove(str);
            throw th3;
        }
    }
}
