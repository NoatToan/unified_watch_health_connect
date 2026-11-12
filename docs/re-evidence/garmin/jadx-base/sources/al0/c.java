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
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.repo.GoalsRepo$getPushesGoal$2", f = "GoalsRepo.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements l<t13.d<? super a0<zk0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f3724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, DateTime dateTime, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f3723b = aVar;
        this.f3724c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f3723b, this.f3724c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<zk0.a>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3722a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<zk0.a>> i0VarB = this.f3723b.f3718a.b(fz0.d.b(this.f3724c));
        this.f3722a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
