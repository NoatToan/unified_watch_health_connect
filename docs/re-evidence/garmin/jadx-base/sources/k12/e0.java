package k12;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lrl0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$updateEmailPreferences$2", f = "UsersRepo.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends rl0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<rl0.a> f102331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d dVar, List<rl0.a> list, t13.d<? super e0> dVar2) {
        super(1, dVar2);
        this.f102330b = dVar;
        this.f102331c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f102330b, this.f102331c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends rl0.a>>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102329a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<rl0.a>>> i0VarD = this.f102330b.f102316a.d(this.f102331c);
        this.f102329a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
