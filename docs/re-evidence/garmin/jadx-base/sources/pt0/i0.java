package pt0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.s0;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardChallengesViewModel$getLimitedChallengesForLeaderBoard$1", f = "LeaderboardChallengesViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.z f140706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f140707c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.LeaderboardChallengesViewModel$getLimitedChallengesForLeaderBoard$1$1", f = "LeaderboardChallengesViewModel.kt", l = {115, 117}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f0 f140708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f140709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f140710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f0 f140711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f140711d = f0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f140711d, dVar);
            aVar.f140710c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        
            if (r1 == r2) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objL;
            f0 f0Var;
            Object objB;
            o53.b0 b0Var = (o53.b0) this.f140710c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f140709b;
            f0 f0Var2 = this.f140711d;
            if (i14 == 0) {
                o13.r.b(obj);
                j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                c80.q qVar = c80.q.SOCIAL;
                this.f140710c = b0Var;
                this.f140708a = f0Var2;
                this.f140709b = 1;
                objL = j1Var.l(qVar, this);
                if (objL != aVar) {
                    f0Var = f0Var2;
                }
                return aVar;
            }
            if (i14 == 1) {
                f0 f0Var3 = this.f140708a;
                o13.r.b(obj);
                f0Var = f0Var3;
                objL = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objB = obj;
            }
            v2 v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) ((v2.b) v2Var).f47386a;
                if (c0Var == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Data received from repository is null");
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.g(a2Var, "LeaderboardChallengesViewModel", illegalArgumentException);
                    f0Var2.f140663d.j(g3.a.a(g3.f35298f, null, illegalArgumentException, null, null, 13));
                    return Unit.INSTANCE;
                }
                int i15 = f0.f140659k;
                f0Var2.getClass();
                ArrayList arrayList = new ArrayList();
                List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listB = c0Var.b();
                if (listB == null) {
                    listB = p13.j0.f134944a;
                }
                List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listI = c0Var.i();
                if (listI == null) {
                    listI = p13.j0.f134944a;
                }
                List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listD = c0Var.d();
                if (listD == null) {
                    listD = p13.j0.f134944a;
                }
                List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listG = c0Var.g();
                if (listG == null) {
                    listG = p13.j0.f134944a;
                }
                Boolean joinedActiveAutoChallenge = c0Var.getJoinedActiveAutoChallenge();
                f0Var2.f140667h = joinedActiveAutoChallenge != null ? joinedActiveAutoChallenge.booleanValue() : false;
                ArrayList arrayList2 = new ArrayList(p13.h0.C0(listB, listI));
                String strH = am.j.h(arrayList2.size(), "NonCompletedChallengesList size ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "LeaderboardChallengesViewModel", strH);
                i2.a.b(a2Var2, "LeaderboardChallengesViewModel", "AvailableBadgeChallengeList size " + listD.size());
                i2.a.b(a2Var2, "LeaderboardChallengesViewModel", "AvailableVirtualChallengeList size " + listG.size());
                if (!listD.isEmpty()) {
                    arrayList.add(new ot0.h.b(new ArrayList(listD), null, 2, null));
                }
                if (!listG.isEmpty()) {
                    arrayList.add(new ot0.h.a(listG, null, 2, null));
                }
                arrayList.add(new ot0.h.d(arrayList2, null, 2, null));
                arrayList.add(new ot0.h.f(c0Var.getWeeklyLeaderboardFollowingCount(), new b12.b(c0Var.o(), null, null, null, null, 30, null), null, 4, null));
                arrayList.add(new ot0.h.c(f0Var2.f140667h || com.garmin.android.apps.connectmobile.leaderboard.challenges.x.v(), null, 2, null));
                arrayList.add(0, new ot0.h.e(null, 1, null));
                y0<g3<List<ot0.h>>> y0Var = f0Var2.f140663d;
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(arrayList));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                f0Var2.f140663d.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
            }
            return Unit.INSTANCE;
            f0Var.f140669j = ((Boolean) objL).booleanValue();
            s0 s0Var = f0Var2.f140661b;
            List listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND);
            this.f140710c = b0Var;
            this.f140708a = null;
            this.f140709b = 2;
            objB = s0Var.b(listC, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o53.z zVar, f0 f0Var, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f140706b = zVar;
        this.f140707c = f0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f140706b, this.f140707c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140705a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f140707c, null);
            this.f140705a = 1;
            if (ge1.b.e0(this.f140706b, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
