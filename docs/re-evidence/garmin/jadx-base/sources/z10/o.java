package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$checkSuspendRole$1", f = "BaseConsentViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f201182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.x f201183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, q92.x xVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f201182b = jVar;
        this.f201183c = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f201182b, this.f201183c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201181a;
        j jVar = this.f201182b;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var = jVar.f201060c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c1.a((c1) value, true, null, null, 6)));
            bv.b.f21239a.getClass();
            bv.b.a();
            this.f201181a = 1;
            qo1.c.f145960d.getClass();
            if (qo1.c.b(qo1.c.a.a(), this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        boolean zA = d1.a(this.f201183c);
        r53.p2 p2Var2 = jVar.f201060c;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, c1.a((c1) value2, false, Boolean.valueOf(zA), null, 4)));
        return Unit.INSTANCE;
    }
}
