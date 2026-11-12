package ca0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.ConsentNavKt$consentGraph$1$5$1$1", f = "ConsentNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<List<j.c>> f26209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<Boolean, Boolean, Unit> f26210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa0.h f26211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(p3.x3<? extends List<j.c>> x3Var, e23.p<? super Boolean, ? super Boolean, Unit> pVar, fa0.h hVar, lc.m0 m0Var, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f26209a = x3Var;
        this.f26210b = pVar;
        this.f26211c = hVar;
        this.f26212d = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f26209a, this.f26210b, this.f26211c, this.f26212d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<j.c> f182175a = this.f26209a.getF182175a();
        if (f182175a != null) {
            if (f182175a.isEmpty()) {
                this.f26210b.invoke(Boolean.valueOf(this.f26211c.f70119a), Boolean.TRUE);
            } else {
                Object objB0 = p13.h0.b0(f182175a);
                lc.m0 m0Var = this.f26212d;
                m0Var.h(zf.b.G(m0Var), objB0);
            }
        }
        return Unit.INSTANCE;
    }
}
