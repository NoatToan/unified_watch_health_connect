package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltj1/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$initializeEmergencyContactForContact$2", f = "ManagedAccountsRepositoryImpl.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<tj1.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f152191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var, long j8, long j14, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f152189b = h0Var;
        this.f152190c = j8;
        this.f152191d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f152189b, this.f152190c, this.f152191d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<tj1.r>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152188a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<tj1.r>> i0VarJ = this.f152189b.f152135a.j(this.f152190c, this.f152191d);
        this.f152188a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
