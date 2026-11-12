package mt0;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmt0/f4;", "Landroidx/lifecycle/u1;", "", "", "challengeId", "invitationId", "", "currentUserProfileId", "Lyt0/f1;", "teamChallengeRepo", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLyt0/f1;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f4 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo1.c2 f120601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f120603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f120604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt0.f1 f120605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> f120606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.w0 f120607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.w0 f120608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.w0 f120609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.v2<Unit>> f120610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.v2<Unit>> f120611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.v2<Unit>> f120612l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeRepoViewModel$fetchTeamChallenge$1", f = "TeamChallengeViewModel.kt", l = {142, SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.leaderboard.model.h0 f120613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f120614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f120615c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> f120617e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120617e = g3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f4.this.new a(this.f120617e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var;
            ArrayList<com.garmin.android.apps.connectmobile.leaderboard.model.i0> arrayList;
            Map map;
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120615c;
            f4 f4Var = f4.this;
            if (i14 == 0) {
                o13.r.b(obj);
                yt0.f1 f1Var = f4Var.f120605e;
                String str2 = f4Var.f120602b;
                this.f120615c = 1;
                int i15 = yt0.f1.f199486c;
                f1Var.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(f1Var, new yt0.d1(f1Var, str2, DateTime.now().toString("yyyy-MM-dd"), null), this);
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
                arrayList = this.f120614b;
                h0Var = this.f120613a;
                o13.r.b(obj);
            }
            map = (Map) obj;
            for (com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var : arrayList) {
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) i0Var.getUserProfileId(), map);
                if (lVar == null && (profileImageUrls = lVar.getProfileImageUrls()) != null && (str = profileImageUrls.f46879h) != null) {
                    i0Var.f38208r = new b12.b(str, null, null, null, null, 30, null);
                }
            }
            androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var = f4Var.f120606f;
            com.garmin.android.apps.connectmobile.g3.f35298f.getClass();
            y0Var.m(com.garmin.android.apps.connectmobile.g3.a.d(h0Var));
            return Unit.INSTANCE;
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            i4.f120659a.debug("fetchTeamChallenge result");
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                List<com.garmin.android.apps.connectmobile.leaderboard.model.j0> listQ = h0Var.q();
                if (listQ != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = listQ.iterator();
                    while (it.hasNext()) {
                        List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> listB = ((com.garmin.android.apps.connectmobile.leaderboard.model.j0) it.next()).b();
                        if (listB != null) {
                            arrayList2.add(listB);
                        }
                    }
                    ArrayList arrayListS = p13.y.s(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListS) {
                        if (!((com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj2).o()) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(String.valueOf(((com.garmin.android.apps.connectmobile.leaderboard.model.i0) it3.next()).getUserProfileId()));
                    }
                    a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
                    this.f120613a = h0Var;
                    this.f120614b = arrayList3;
                    this.f120615c = 2;
                    obj = iVar.a(arrayList4, listK, this);
                    if (obj != aVar) {
                        arrayList = arrayList3;
                        map = (Map) obj;
                        while (r0.hasNext()) {
                            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) i0Var.getUserProfileId(), map);
                            if (lVar == null) {
                            }
                        }
                    }
                    return aVar;
                }
                androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var2 = f4Var.f120606f;
                com.garmin.android.apps.connectmobile.g3.f35298f.getClass();
                y0Var2.m(com.garmin.android.apps.connectmobile.g3.a.d(h0Var));
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var3 = f4Var.f120606f;
                com.garmin.android.apps.connectmobile.g3.a aVar2 = com.garmin.android.apps.connectmobile.g3.f35298f;
                com.garmin.android.apps.connectmobile.v2.a aVar3 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                String string = aVar3.f47383a.toString();
                Exception exc = aVar3.f47383a;
                com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3Var = this.f120617e;
                y0Var3.m(com.garmin.android.apps.connectmobile.g3.a.a(aVar2, string, exc, g3Var != null ? g3Var.f35301b : null, null, 8));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f4(String str, String str2, long j8, yt0.f1 f1Var) {
        str.getClass();
        str2.getClass();
        f1Var.getClass();
        this.f120601a = new fo1.c2(null, 1, 0 == true ? 1 : 0);
        this.f120602b = str;
        this.f120603c = str2;
        this.f120604d = j8;
        this.f120605e = f1Var;
        androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var = new androidx.lifecycle.y0<>();
        this.f120606f = y0Var;
        androidx.lifecycle.w0 w0Var = new androidx.lifecycle.w0();
        w0Var.n(y0Var, new i4.a(new androidx.lifecycle.k(w0Var, 9)));
        this.f120607g = w0Var;
        this.f120608h = androidx.lifecycle.t1.a(w0Var, new mh1.x(this, 13));
        androidx.lifecycle.w0 w0Var2 = new androidx.lifecycle.w0();
        w0Var2.n(w0Var, new i4.a(new androidx.lifecycle.k(w0Var2, 10)));
        this.f120609i = w0Var2;
        this.f120610j = new androidx.lifecycle.y0<>();
        this.f120611k = new androidx.lifecycle.y0<>();
        this.f120612l = new androidx.lifecycle.y0<>();
    }

    public final void x4() {
        i4.f120659a.debug("fetchTeamChallenge loading");
        androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0>> y0Var = this.f120606f;
        com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3VarD = y0Var.d();
        if ((g3VarD != null ? g3VarD.f35300a : null) == fw.p.LOADING) {
            return;
        }
        com.garmin.android.apps.connectmobile.g3<com.garmin.android.apps.connectmobile.leaderboard.model.h0> g3VarD2 = y0Var.d();
        com.garmin.android.apps.connectmobile.g3.a aVar = com.garmin.android.apps.connectmobile.g3.f35298f;
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = g3VarD2 != null ? g3VarD2.f35301b : null;
        aVar.getClass();
        y0Var.m(com.garmin.android.apps.connectmobile.g3.a.b(h0Var));
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new a(g3VarD2, null), 3);
    }
}
