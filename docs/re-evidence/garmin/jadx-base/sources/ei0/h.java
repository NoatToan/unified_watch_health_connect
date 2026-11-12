package ei0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$addFavorite$2", f = "FollowRepoImpl.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f64229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, String str, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f64228b = eVar;
        this.f64229c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f64228b, this.f64229c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64227a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c cVar = this.f64228b.f64197a;
        String str = this.f64229c;
        if (str == null) {
            str = "";
        }
        o53.i0<c83.a0<Unit>> i0VarC = cVar.c(str);
        this.f64227a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
