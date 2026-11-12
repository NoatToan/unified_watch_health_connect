package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$getChildContactById$2", f = "ManagedAccountsRepositoryImpl.kt", l = {149}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<l20.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h0 h0Var, long j8, String str, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f152161b = h0Var;
        this.f152162c = j8;
        this.f152163d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f152161b, this.f152162c, this.f152163d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.r>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152160a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<l20.r>> i0VarM = this.f152161b.f152135a.m(this.f152162c, this.f152163d);
        this.f152160a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
