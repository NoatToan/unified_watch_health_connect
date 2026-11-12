package vo1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.y1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/y1;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getActivityTypedSplits$2", f = "SocialGroupRideRepo.kt", l = {193}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<y1>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f179047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f179048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, long j8, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f179047b = cVar;
        this.f179048c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f179047b, this.f179048c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<y1>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179046a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<y1>> i0VarA = this.f179047b.f179030b.a(this.f179048c);
        this.f179046a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
