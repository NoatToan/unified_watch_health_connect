package ei0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$unblockUser$2", f = "FollowRepoImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e eVar, String str, t13.d<? super l0> dVar) {
        super(1, dVar);
        this.f64263b = eVar;
        this.f64264c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l0(this.f64263b, this.f64264c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((l0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64262a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        w0 w0Var = this.f64263b.f64198b;
        String str = this.f64264c;
        if (str == null) {
            str = "";
        }
        o53.i0<c83.a0<Unit>> i0VarB = w0Var.b(str);
        this.f64262a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
