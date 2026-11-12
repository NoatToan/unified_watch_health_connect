package pt0;

import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardChallengesViewModel$createUndoAction$1$1", f = "LeaderboardChallengesViewModel.kt", l = {96, 99}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f140691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f140693d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardChallengesViewModel$createUndoAction$1$1$1", f = "LeaderboardChallengesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f140694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f140695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f140694a = f0Var;
            this.f140695b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f140694a, this.f140695b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f140694a.y4(this.f140695b, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, String str, long j8, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f140691b = f0Var;
        this.f140692c = str;
        this.f140693d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f140691b, this.f140692c, this.f140693d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (ge1.b.e0(r10, r1, r9) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140690a;
        String str = this.f140692c;
        f0 f0Var = this.f140691b;
        if (i14 == 0) {
            o13.r.b(obj);
            r0 r0Var = f0Var.f140662c;
            this.f140690a = 1;
            obj = r0Var.g(str, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (((v2) obj) instanceof v2.b) {
            f0.x4(f0Var, this.f140693d);
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(f0Var, str, null);
            this.f140690a = 2;
        }
        return Unit.INSTANCE;
    }
}
