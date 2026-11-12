package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$checkChildSuspendRole$1", f = "BaseConsentViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f201100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f201101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, long j8, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f201100b = jVar;
        this.f201101c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f201100b, this.f201101c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201099a;
        j jVar = this.f201100b;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var = jVar.f201060c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c1.a((c1) value, true, null, null, 6)));
            bv.b.f21239a.getClass();
            bv.c cVarA = bv.b.a();
            this.f201099a = 1;
            obj = ((kd0.m) cVarA).n(this.f201101c, this);
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
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        r53.p2 p2Var2 = jVar.f201060c;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, c1.a((c1) value2, false, bool, null, 4)));
        return Unit.INSTANCE;
    }
}
