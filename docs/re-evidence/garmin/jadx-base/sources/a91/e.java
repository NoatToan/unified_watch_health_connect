package a91;

import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$startRetryTask$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {362}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f2123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Long l14, a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f2123b = l14;
        this.f2124c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f2123b, this.f2124c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long jD;
        e53.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2122a;
        a aVar2 = this.f2124c;
        if (i14 == 0) {
            o13.r.b(obj);
            Long l14 = this.f2123b;
            if (l14 != null) {
                e53.c.a aVar3 = e53.c.f63094b;
                jD = l14.longValue();
                fVar = e53.f.MILLISECONDS;
            } else {
                e53.c.a aVar4 = e53.c.f63094b;
                jD = aVar2.f2041c.d("cppi_retry_time");
                fVar = e53.f.SECONDS;
            }
            long jF = e53.e.f(jD, fVar);
            this.f2122a = 1;
            if (m0.c(jF, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        aVar2.a(d91.u.TIMEOUT);
        return Unit.INSTANCE;
    }
}
