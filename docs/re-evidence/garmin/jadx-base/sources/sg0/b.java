package sg0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.AddChildModalKt$AddChildAgreementModal$1$1", f = "AddChildModal.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f159030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f159031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f159030b = p1Var;
        this.f159031c = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f159030b, this.f159031c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159029a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (!this.f159030b.getF182175a().booleanValue()) {
                return Unit.INSTANCE;
            }
            e53.c.a aVar2 = e53.c.f63094b;
            long jE = e53.e.e(20, e53.f.SECONDS);
            this.f159029a = 1;
            if (o53.m0.c(jE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f159031c.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
