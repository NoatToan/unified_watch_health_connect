package vo1;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getActivitySummary$2", f = "SocialGroupRideRepo.kt", l = {171}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f179044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f179045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, long j8, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f179044b = cVar;
        this.f179045c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f179044b, this.f179045c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<r>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179043a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<r>> i0VarC = this.f179044b.f179030b.c(this.f179045c);
        this.f179043a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
