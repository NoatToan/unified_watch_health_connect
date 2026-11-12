package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$declineAdHocChallengeInvitation$2", f = "AdHocChallengesRepository.kt", l = {86, 88}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f199453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z14, a aVar, String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f199452b = z14;
        this.f199453c = aVar;
        this.f199454d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f199452b, this.f199453c, this.f199454d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199451a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String str = this.f199454d;
        boolean z14 = this.f199452b;
        a aVar2 = this.f199453c;
        if (z14) {
            o53.i0<c83.a0<Unit>> i0VarQ = aVar2.f199413a.q(str);
            this.f199451a = 1;
            obj = i0VarQ.await(this);
        } else {
            o53.i0<c83.a0<Unit>> i0VarB = aVar2.f199413a.b(str);
            this.f199451a = 2;
            obj = i0VarB.await(this);
        }
        return aVar;
    }
}
