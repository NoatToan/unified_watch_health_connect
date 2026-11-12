package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$updateChildContact$2", f = "ManagedAccountsRepositoryImpl.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.l<t13.d<? super c83.a0<l20.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l20.a f152132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, long j8, String str, l20.a aVar, t13.d<? super g0> dVar) {
        super(1, dVar);
        this.f152129b = h0Var;
        this.f152130c = j8;
        this.f152131d = str;
        this.f152132e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g0(this.f152129b, this.f152130c, this.f152131d, this.f152132e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.a>> dVar) {
        return ((g0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152128a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<l20.a>> i0VarE = this.f152129b.f152135a.e(this.f152130c, this.f152131d, this.f152132e);
        this.f152128a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
