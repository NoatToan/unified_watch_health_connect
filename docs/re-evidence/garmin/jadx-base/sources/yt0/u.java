package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AutoChallengesRepository$getPreviousChallenge$2", f = "AutoChallengesRepository.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super c83.a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f199594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f199595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, Integer num, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f199594b = qVar;
        this.f199595c = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f199594b, this.f199595c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<String>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199593a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<String>> i0VarC = this.f199594b.f199579a.c(this.f199595c);
        this.f199593a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
