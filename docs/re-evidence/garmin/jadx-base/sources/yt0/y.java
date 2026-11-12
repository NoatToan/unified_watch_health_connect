package yt0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.BadgeChallengesRepository$badgeChallengeOptIn$2", f = "BadgeChallengesRepository.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f199632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f199633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f199634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, String str, DateTime dateTime, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f199632b = xVar;
        this.f199633c = str;
        this.f199634d = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f199632b, this.f199633c, this.f199634d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199631a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarF = this.f199632b.f199619a.f(this.f199633c, fz0.d.b(this.f199634d));
        this.f199631a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
