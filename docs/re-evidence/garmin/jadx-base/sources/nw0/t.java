package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$getBehaviours$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f128116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f128116c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f128116c, dVar);
        tVar.f128115b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objI;
        Object value2;
        Object value3;
        o53.b0 b0Var = (o53.b0) this.f128115b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128114a;
        r rVar = this.f128116c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (az0.b.a()) {
                p2 p2Var = rVar.f128105f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, e0.c.f128019a, null, null, false, false, false, false, 126)));
                rv0.a aVar2 = rVar.f128104e;
                this.f128115b = b0Var;
                this.f128114a = 1;
                objI = aVar2.i(g22.l.d(b63.o.INSTANCE), this);
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "LifestyleLoggingEditBehavioursViewModel", "Failed to load behaviours: no network connection");
                r.x4(rVar);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objI = obj;
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.b) {
            List<pv0.d> list = (List) ((v2.b) v2Var).f47386a;
            rVar.f128109j = list;
            p2 p2Var2 = rVar.f128107h;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, list));
            p2 p2Var3 = rVar.f128105f;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, d.a((d) value3, e0.b.f128018a, null, null, false, false, false, false, 126)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "LifestyleLoggingEditBehavioursViewModel", "Failed to load behaviours");
            r.x4(rVar);
        }
        return Unit.INSTANCE;
    }
}
