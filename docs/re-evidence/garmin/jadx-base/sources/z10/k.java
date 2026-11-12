package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$checkChildPendingConsentStatus$1", f = "BaseConsentViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f201084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.x f201085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f201086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j8, q92.x xVar, j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f201084b = j8;
        this.f201085c = xVar;
        this.f201086d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f201084b, this.f201085c, this.f201086d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201083a;
        if (i14 == 0) {
            o13.r.b(obj);
            s92.l lVar = new s92.l(String.valueOf(this.f201084b));
            p92.o oVar = p92.o.f136619a;
            this.f201083a = 1;
            obj = oVar.k(this.f201085c, lVar, this);
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
        q92.v vVar = (q92.v) obj;
        r53.p2 p2Var = this.f201086d.f201060c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, c1.a((c1) value, false, null, Boolean.valueOf(vVar != null && q92.c.a(vVar)), 3)));
        return Unit.INSTANCE;
    }
}
