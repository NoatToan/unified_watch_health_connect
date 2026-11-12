package al0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lzk0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.repo.GoalsRepo$getStepsGoal$2", f = "GoalsRepo.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements l<t13.d<? super a0<zk0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f3727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, DateTime dateTime, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f3726b = aVar;
        this.f3727c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f3726b, this.f3727c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<zk0.c>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3725a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<zk0.c>> i0VarI = this.f3726b.f3718a.i(fz0.d.b(this.f3727c));
        this.f3725a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
