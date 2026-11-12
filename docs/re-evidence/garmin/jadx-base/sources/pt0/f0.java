package pt0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mt0.a3;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;
import yt0.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpt0/f0;", "Landroidx/lifecycle/u1;", "", "Lyt0/s0;", "repository", "Lyt0/r0;", "badgeChallengeRepo", "<init>", "(Lyt0/s0;Lyt0/r0;)V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f140659k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f140660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f140661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f140662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<g3<List<ot0.h>>> f140663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f140664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<com.garmin.android.apps.connectmobile.y<g3<b>>> f140665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f140666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f140667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a3 f140668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f140669j;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpt0/f0$b;", "", "", "badgeChallengeUuid", "Lkotlin/Function0;", "", "undoAction", "", "isPremium", "Lorg/joda/time/DateTime;", "badgeChallengeEndDate", "<init>", "(Ljava/lang/String;Le23/a;ZLorg/joda/time/DateTime;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f140670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f140671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f140672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DateTime f140673d;

        public b(String str, e23.a<Unit> aVar, boolean z14, DateTime dateTime) {
            str.getClass();
            aVar.getClass();
            this.f140670a = str;
            this.f140671b = aVar;
            this.f140672c = z14;
            this.f140673d = dateTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f140670a.equals(bVar.f140670a) && this.f140671b.equals(bVar.f140671b) && this.f140672c == bVar.f140672c && p005kotlin.jvm.internal.s.g(this.f140673d, bVar.f140673d);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.f(this.f140670a.hashCode() * 31, 31, this.f140671b), 31, this.f140672c);
            DateTime dateTime = this.f140673d;
            return iG + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public final String toString() {
            return "OptInResult(badgeChallengeUuid=" + this.f140670a + ", undoAction=" + this.f140671b + ", isPremium=" + this.f140672c + ", badgeChallengeEndDate=" + this.f140673d + ")";
        }
    }

    static {
        new a(null);
    }

    public f0(s0 s0Var, r0 r0Var) {
        s0Var.getClass();
        r0Var.getClass();
        this.f140660a = new y();
        this.f140661b = s0Var;
        this.f140662c = r0Var;
        y0<g3<List<ot0.h>>> y0Var = new y0<>();
        this.f140663d = y0Var;
        this.f140664e = y0Var;
        y0<com.garmin.android.apps.connectmobile.y<g3<b>>> y0Var2 = new y0<>();
        this.f140665f = y0Var2;
        this.f140666g = y0Var2;
    }

    public static final void x4(f0 f0Var, long j8) {
        f0Var.getClass();
        ((com.garmin.android.apps.connectmobile.s0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.s0.class, null, null, 6, null)).b(String.format(zy0.a.GET_FOLLOWINGS_BADGE_DETAILS.f207440a, Arrays.copyOf(new Object[]{Long.valueOf(j8), 6}, 2)));
    }

    public final com.garmin.android.apps.connectmobile.leaderboard.model.a0 y4(String str, boolean z14) {
        List<ot0.h> list;
        str.getClass();
        y0<g3<List<ot0.h>>> y0Var = this.f140663d;
        g3<List<ot0.h>> g3VarD = y0Var.d();
        com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarB = null;
        if (g3VarD != null && g3VarD.f35300a == fw.p.SUCCESS && (list = g3VarD.f35301b) != null) {
            g3.a aVar = g3.f35298f;
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (((ot0.h) it.next()) instanceof ot0.h.b) {
                    break;
                }
                i15++;
            }
            if (i15 != -1) {
                Object obj = arrayList.get(i15);
                obj.getClass();
                ot0.h.b bVar = (ot0.h.b) obj;
                ArrayList arrayListD1 = p13.h0.d1(bVar.f133753a);
                Iterator it3 = arrayListD1.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.leaderboard.model.a0) it3.next()).getUuid(), str)) {
                        break;
                    }
                    i14++;
                }
                if (i14 != -1) {
                    a0VarB = com.garmin.android.apps.connectmobile.leaderboard.model.a0.b((com.garmin.android.apps.connectmobile.leaderboard.model.a0) arrayListD1.get(i14), Boolean.valueOf(!z14));
                    Unit unit = Unit.INSTANCE;
                    arrayListD1.set(i14, a0VarB);
                }
                Unit unit2 = Unit.INSTANCE;
                ot0.i iVar = bVar.f133754b;
                iVar.getClass();
                arrayList.set(i15, new ot0.h.b(arrayListD1, iVar));
                String strM = am.j.m("Set ", str, " badge challenge to joined.");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "LeaderboardChallengesViewModel", strM);
            }
            Unit unit3 = Unit.INSTANCE;
            aVar.getClass();
            y0Var.m(g3.a.d(arrayList));
        }
        return a0VarB;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt0/f0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
