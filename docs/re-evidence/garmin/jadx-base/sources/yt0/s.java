package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AutoChallengesRepository$getAutoChallengeParticipant$2", f = "AutoChallengesRepository.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f199588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f199588b = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f199588b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Boolean>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199587a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Boolean>> i0VarD = this.f199588b.f199579a.d();
        this.f199587a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
