package al0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lzk0/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.repo.GoalsRepo$updateWellnessGoal$2", f = "GoalsRepo.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements l<t13.d<? super a0<zk0.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk0.h f3747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, String str, String str2, zk0.h hVar, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f3744b = aVar;
        this.f3745c = str;
        this.f3746d = str2;
        this.f3747e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f3744b, this.f3745c, this.f3746d, this.f3747e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<zk0.h>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3743a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<zk0.h>> i0VarA = this.f3744b.f3718a.a(this.f3745c, this.f3746d, this.f3747e);
        this.f3743a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
