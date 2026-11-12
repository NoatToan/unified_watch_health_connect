package com.garmin.android.apps.connectmobile.userprofile;

import android.os.Parcelable;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import e23.l;
import fg0.k;
import j12.m;
import java.util.List;
import java.util.Set;
import li0.d0;
import li0.e0;
import li0.l0;
import li0.n0;
import o13.t;
import o13.u;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.p2;
import r53.q2;
import zy0.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/i;", "Landroidx/lifecycle/u1;", "Lk12/a;", "usersRepo", "Lqo1/c;", "socialProfileRepo", "Lzf0/d;", "eventRepo", "<init>", "(Lk12/a;Lqo1/c;Lzf0/d;)V", "d", "b", "c", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {
    public static final /* synthetic */ int I = 0;
    public final y0 A;
    public final y0<Boolean> B;
    public final y0 C;
    public final w0<u<g3<q>, g3<m>, g3<List<k>>>> D;
    public boolean E;
    public final e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.a f46749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo1.c f46750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0.d f46751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ei0.d f46752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f46753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f46754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f46755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<g3<q>> f46756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f46757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<g3<m>> f46758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f46759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<g3<List<k>>> f46760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f46761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<p<List<ActivityListItemDTO>>> f46762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f46763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f46764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f46765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<d> f46766r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f46767t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0<Boolean> f46768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f46769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<Boolean> f46770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f46771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0<Boolean> f46772z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/i$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        EDIT_PROFILE,
        SHARE_PROFILE,
        CHALLENGE,
        NAVIGATE_FOLLOWER,
        NAVIGATE_FOLLOWING,
        FOLLOWER_REQUEST_ACCEPT,
        FOLLOWER_REQUEST_REJECT,
        FOLLOWER_REQUEST_ERROR,
        REFRESH,
        REFRESH_HEADER
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/i$d;", "", "", "isCurrentUser", "Lli0/d0;", "followViewData", "<init>", "(ZLli0/d0;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f46789b;

        static {
            Parcelable.Creator<d0> creator = d0.CREATOR;
        }

        public d(boolean z14, d0 d0Var) {
            d0Var.getClass();
            this.f46788a = z14;
            this.f46789b = d0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f46788a == dVar.f46788a && this.f46789b.equals(dVar.f46789b);
        }

        public final int hashCode() {
            return this.f46789b.hashCode() + (Boolean.hashCode(this.f46788a) * 31);
        }

        public final String toString() {
            return "ProfileHeaderFollowState(isCurrentUser=" + this.f46788a + ", followViewData=" + this.f46789b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/i$e", "Lli0/f;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends li0.f {
        public e(b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            Object value;
            b bVar;
            n0 n0Var;
            q qVar;
            com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
            if (str == null || l0Var == null) {
                return;
            }
            n0 n0Var2 = l0Var.f112789e;
            i iVar = i.this;
            y0<g3<q>> y0Var = iVar.f46756h;
            y0<d> y0Var2 = iVar.f46766r;
            g3<q> g3VarD = y0Var.d();
            if (str.equals((g3VarD == null || (qVar = g3VarD.f35301b) == null || (userInfo = qVar.getUserInfo()) == null) ? null : userInfo.getDisplayName())) {
                d dVarD = y0Var2.d();
                hi0.e.b bVar2 = (dVarD == null || (n0Var = dVarD.f46789b.f112656i) == null) ? null : n0Var.f112816a;
                hi0.e.b bVar3 = n0Var2 != null ? n0Var2.f112816a : null;
                Set setM0 = p13.u.m0(new hi0.e.b[]{hi0.e.b.FOLLOWING, hi0.e.b.MUTUAL});
                Set setM1 = p13.u.m0(new hi0.e.b[]{hi0.e.b.FOLLOWED, hi0.e.b.NONE, null});
                Set set = setM0;
                iVar.f46768v.j(Boolean.valueOf((h0.R(set, bVar2) && setM1.contains(bVar3)) || (setM1.contains(bVar2) && h0.R(set, bVar3))));
                d dVarD2 = y0Var2.d();
                if (dVarD2 != null) {
                    y0Var2.m(new d(dVarD2.f46788a, d0.b(dVarD2.f46789b, null, l0Var.f112785a, null, null, l0Var.f112787c, l0Var.f112788d, l0Var.f112789e, 61)));
                }
                if (n0Var2 == null || !e0.a(n0Var2)) {
                    return;
                }
                p2 p2Var = iVar.f46764p;
                do {
                    value = p2Var.getValue();
                    bVar = (b) value;
                } while (!p2Var.b(value, new b(Boolean.FALSE, bVar.f46774b, bVar.f46775c, bVar.f46776d)));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46791a;

        public f(l lVar) {
            lVar.getClass();
            this.f46791a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46791a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46791a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public i(k12.a aVar, qo1.c cVar, zf0.d dVar) {
        aVar.getClass();
        cVar.getClass();
        dVar.getClass();
        this.f46749a = aVar;
        this.f46750b = cVar;
        this.f46751c = dVar;
        this.f46752d = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
        this.f46753e = o13.m.b(new g01.q(28));
        this.f46754f = o13.m.b(new g01.q(29));
        this.f46755g = o13.m.b(new g12.m(0));
        y0<g3<q>> y0Var = new y0<>();
        this.f46756h = y0Var;
        this.f46757i = y0Var;
        y0<g3<m>> y0Var2 = new y0<>();
        this.f46758j = y0Var2;
        this.f46759k = y0Var2;
        y0<g3<List<k>>> y0Var3 = new y0<>();
        this.f46760l = y0Var3;
        this.f46761m = y0Var3;
        y0<p<List<ActivityListItemDTO>>> y0Var4 = new y0<>();
        this.f46762n = y0Var4;
        this.f46763o = y0Var4;
        p2 p2VarA = q2.a(new b(null, false, false, false, 15, null));
        this.f46764p = p2VarA;
        this.f46765q = p2VarA;
        y0<d> y0Var5 = new y0<>();
        this.f46766r = y0Var5;
        this.f46767t = y0Var5;
        Boolean bool = Boolean.FALSE;
        y0<Boolean> y0Var6 = new y0<>(bool);
        this.f46768v = y0Var6;
        this.f46769w = y0Var6;
        y0<Boolean> y0Var7 = new y0<>(bool);
        this.f46770x = y0Var7;
        this.f46771y = y0Var7;
        y0<Boolean> y0Var8 = new y0<>(bool);
        this.f46772z = y0Var8;
        this.A = y0Var8;
        y0<Boolean> y0Var9 = new y0<>(bool);
        this.B = y0Var9;
        this.C = y0Var9;
        w0<u<g3<q>, g3<m>, g3<List<k>>>> w0Var = new w0<>(new u(g3.a.c(g3.f35298f), g3.a.b(null), g3.a.b(null)));
        w0Var.n(y0Var, new f(new androidx.lifecycle.k(w0Var, 5)));
        w0Var.n(y0Var2, new f(new androidx.lifecycle.k(w0Var, 6)));
        w0Var.n(y0Var3, new f(new androidx.lifecycle.k(w0Var, 7)));
        this.D = w0Var;
        this.F = new e(v1.a(this));
    }

    public final boolean x4() {
        g3<q> g3VarD = this.f46756h.d();
        q qVar = g3VarD != null ? g3VarD.f35301b : null;
        return qVar != null && qVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
    }

    public final boolean y4() {
        g3<q> g3VarD = this.f46756h.d();
        q qVar = g3VarD != null ? g3VarD.f35301b : null;
        return x4() && qVar != null && qVar.i() == com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE;
    }

    public final boolean z4() {
        g3<q> g3VarD = this.f46756h.d();
        q qVar = g3VarD != null ? g3VarD.f35301b : null;
        return qVar != null && qVar.r();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_EVENTS", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/i$b;", "", "", "bannerVisible", "showAcceptSnackbar", "showDeclineSnackbar", "showErrorSnackbar", "<init>", "(Ljava/lang/Boolean;ZZZ)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f46773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f46776d;

        public /* synthetic */ b(Boolean bool, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f46773a, bVar.f46773a) && this.f46774b == bVar.f46774b && this.f46775c == bVar.f46775c && this.f46776d == bVar.f46776d;
        }

        public final int hashCode() {
            Boolean bool = this.f46773a;
            return Boolean.hashCode(this.f46776d) + q6.f.g(q6.f.g((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f46774b), 31, this.f46775c);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ProfileHeaderBannerUiState(bannerVisible=");
            sb3.append(this.f46773a);
            sb3.append(", showAcceptSnackbar=");
            sb3.append(this.f46774b);
            sb3.append(", showDeclineSnackbar=");
            return com.airbnb.lottie.animation.keyframe.a.f(", showErrorSnackbar=", ")", sb3, this.f46775c, this.f46776d);
        }

        public b(Boolean bool, boolean z14, boolean z15, boolean z16) {
            this.f46773a = bool;
            this.f46774b = z14;
            this.f46775c = z15;
            this.f46776d = z16;
        }

        public b() {
            this(null, false, false, false, 15, null);
        }
    }

    public i() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(k12.a aVar, qo1.c cVar, zf0.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        aVar = (i14 & 1) != 0 ? k12.d.a.a(k12.d.f102315g) : aVar;
        if ((i14 & 2) != 0) {
            qo1.c.f145960d.getClass();
            cVar = qo1.c.a.a();
        }
        this(aVar, cVar, (i14 & 4) != 0 ? zf0.d.a.a(zf0.d.f204343b) : dVar);
    }
}
