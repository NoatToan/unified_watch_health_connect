package ei0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$blockUser$2", f = "FollowRepoImpl.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super c83.a0<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, String str, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f64239b = eVar;
        this.f64240c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f64239b, this.f64240c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Object>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64238a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        w0 w0Var = this.f64239b.f64198b;
        String str = this.f64240c;
        if (str == null) {
            str = "";
        }
        o53.i0<c83.a0<Object>> i0VarA = w0Var.a(str);
        this.f64238a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
