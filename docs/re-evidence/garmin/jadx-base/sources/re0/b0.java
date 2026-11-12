package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$removeChildContact$2", f = "ManagedAccountsRepositoryImpl.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, long j8, String str, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f152098b = h0Var;
        this.f152099c = j8;
        this.f152100d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f152098b, this.f152099c, this.f152100d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Boolean>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152097a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Boolean>> i0VarC = this.f152098b.f152135a.c(this.f152099c, this.f152100d);
        this.f152097a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
