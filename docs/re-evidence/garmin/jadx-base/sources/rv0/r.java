package rv0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lnv0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$setOnboardingCompleted$result$1", f = "LifestyleLoggingRepositoryImpl.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super a0<nv0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f154684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f154685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z14, b bVar, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f154684b = z14;
        this.f154685c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f154684b, this.f154685c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<nv0.b>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154683a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<nv0.b>> i0VarB = this.f154685c.f154626b.b("lifestyle.onboarding.displayed", new nv0.b("lifestyle.onboarding.displayed", Boolean.valueOf(this.f154684b)));
        this.f154683a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
