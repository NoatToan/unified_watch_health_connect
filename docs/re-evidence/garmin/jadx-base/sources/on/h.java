package on;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lrn/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl$updateActivityName$result$1", f = "HealthRepositoryImpl.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<rn.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f133024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f133025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f133026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, String str, String str2, String str3, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f133023b = aVar;
        this.f133024c = str;
        this.f133025d = str2;
        this.f133026e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f133023b, this.f133024c, this.f133025d, this.f133026e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<rn.a>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133022a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<rn.a>> i0VarE = this.f133023b.f132995a.e(this.f133024c, this.f133025d, new rn.a(this.f133026e));
        this.f133022a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
