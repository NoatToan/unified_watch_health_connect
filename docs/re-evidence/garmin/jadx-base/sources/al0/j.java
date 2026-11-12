package al0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lzk0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.repo.GoalsRepo$updateWellnessGoalAsync$2", f = "GoalsRepo.kt", l = {100}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements l<t13.d<? super a0<zk0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f3750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk0.a f3751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, DateTime dateTime, zk0.a aVar2, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f3749b = aVar;
        this.f3750c = dateTime;
        this.f3751d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f3749b, this.f3750c, this.f3751d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<zk0.a>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3748a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<zk0.a>> i0VarD = this.f3749b.f3718a.d(this.f3750c, this.f3751d);
        this.f3748a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
