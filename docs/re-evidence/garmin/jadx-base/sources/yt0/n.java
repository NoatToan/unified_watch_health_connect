package yt0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$leaveChallenge$2", f = "AdHocChallengesRepository.kt", l = {117, 119}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f199550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f199551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f199552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z14, a aVar, String str, String str2, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f199549b = z14;
        this.f199550c = aVar;
        this.f199551d = str;
        this.f199552e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f199549b, this.f199550c, this.f199551d, this.f199552e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199548a;
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
        String str = this.f199552e;
        String str2 = this.f199551d;
        boolean z14 = this.f199549b;
        a aVar2 = this.f199550c;
        if (z14) {
            o53.i0<c83.a0<Unit>> i0VarN = aVar2.f199413a.n(str2, str);
            this.f199548a = 1;
            obj = i0VarN.await(this);
        } else {
            o53.i0<c83.a0<Unit>> i0VarK = aVar2.f199413a.k(str2, str);
            this.f199548a = 2;
            obj = i0VarK.await(this);
        }
        return aVar;
    }
}
