package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class k5d {
    public static c C = new c(null);
    public final boolean A;
    public final y14 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f23475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tpo<hpf> f23476b;
    public final yl4.c c;
    public final f93 d;
    public final Context e;
    public final boolean f;
    public final ll9 g;
    public final tpo<hpf> h;
    public final bg8 i;
    public final u2d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n3d f23477k;
    public final y5d l;
    public final Integer m;
    public final tpo<Boolean> n;
    public final hy6 o;
    public final spf p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ekg f23478r;
    public final int s;
    public final f0i t;
    public final i3i u;
    public final kci v;
    public final Set<ook> w;
    public final boolean x;
    public final hy6 y;
    public final l5d z;

    public class a implements tpo<Boolean> {
        public a() {
        }

        @Override // defpackage.tpo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    public static class b {
        public boolean A;
        public y14 B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap.Config f23480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public tpo<hpf> f23481b;
        public yl4.c c;
        public f93 d;
        public final Context e;
        public boolean f;
        public tpo<hpf> g;
        public bg8 h;
        public u2d i;
        public n3d j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public y5d f23482k;
        public Integer l;
        public tpo<Boolean> m;
        public hy6 n;
        public spf o;
        public Integer p;
        public ekg q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public f0i f23483r;
        public i3i s;
        public kci t;
        public Set<ook> u;
        public boolean v;
        public hy6 w;
        public ll9 x;
        public int y;
        public final l5d.b z;

        public /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public static /* synthetic */ o3d q(b bVar) {
            bVar.getClass();
            return null;
        }

        public k5d D() {
            return new k5d(this, null);
        }

        public b E(tpo<hpf> tpoVar) {
            this.f23481b = (tpo) b6i.g(tpoVar);
            return this;
        }

        public b F(Bitmap.Config config) {
            this.f23480a = config;
            return this;
        }

        public b G(boolean z) {
            this.f = z;
            return this;
        }

        public b H(hy6 hy6Var) {
            this.n = hy6Var;
            return this;
        }

        public b I(spf spfVar) {
            this.o = spfVar;
            return this;
        }

        public b J(ekg ekgVar) {
            this.q = ekgVar;
            return this;
        }

        public b K(Set<ook> set) {
            this.u = set;
            return this;
        }

        public b L(boolean z) {
            this.v = z;
            return this;
        }

        public b(Context context) {
            this.f = false;
            this.l = null;
            this.p = null;
            this.v = true;
            this.y = -1;
            this.z = new l5d.b(this);
            this.A = true;
            this.B = new sug();
            this.e = (Context) b6i.g(context);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23484a;

        public /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.f23484a;
        }

        public c() {
            this.f23484a = false;
        }
    }

    public /* synthetic */ k5d(b bVar, a aVar) {
        this(bVar);
    }

    public static b F(Context context) {
        return new b(context, null);
    }

    public static void G(hcr hcrVar, l5d l5dVar, lp2 lp2Var) {
        icr.d = hcrVar;
        l5dVar.i();
        if (lp2Var != null) {
            hcrVar.a(lp2Var);
        }
    }

    public static c g() {
        return C;
    }

    public static hy6 h(Context context) {
        try {
            if (epa.d()) {
                epa.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return hy6.m(context).m();
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public static y5d q(b bVar) {
        if (bVar.f23482k != null && bVar.l != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        }
        if (bVar.f23482k != null) {
            return bVar.f23482k;
        }
        return null;
    }

    public static int v(b bVar, l5d l5dVar) {
        if (bVar.p != null) {
            return bVar.p.intValue();
        }
        return l5dVar.m() ? 1 : 0;
    }

    public Set<ook> A() {
        return Collections.unmodifiableSet(this.w);
    }

    public hy6 B() {
        return this.y;
    }

    public boolean C() {
        return this.A;
    }

    public boolean D() {
        return this.f;
    }

    public boolean E() {
        return this.x;
    }

    public Bitmap.Config a() {
        return this.f23475a;
    }

    public tpo<hpf> b() {
        return this.f23476b;
    }

    public yl4.c c() {
        return this.c;
    }

    public f93 d() {
        return this.d;
    }

    public y14 e() {
        return this.B;
    }

    public Context f() {
        return this.e;
    }

    public tpo<hpf> i() {
        return this.h;
    }

    public bg8 j() {
        return this.i;
    }

    public l5d k() {
        return this.z;
    }

    public ll9 l() {
        return this.g;
    }

    public u2d m() {
        return this.j;
    }

    public n3d n() {
        return this.f23477k;
    }

    public o3d o() {
        return null;
    }

    public y5d p() {
        return this.l;
    }

    public Integer r() {
        return this.m;
    }

    public tpo<Boolean> s() {
        return this.n;
    }

    public hy6 t() {
        return this.o;
    }

    public int u() {
        return this.q;
    }

    public spf w() {
        return this.p;
    }

    public ekg x() {
        return this.f23478r;
    }

    public i3i y() {
        return this.u;
    }

    public kci z() {
        return this.v;
    }

    public k5d(b bVar) {
        hcr hcrVarI;
        if (epa.d()) {
            epa.a("ImagePipelineConfig()");
        }
        l5d l5dVarM = bVar.z.m();
        this.z = l5dVarM;
        this.f23476b = bVar.f23481b == null ? new st5((ActivityManager) bVar.e.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)) : bVar.f23481b;
        this.c = bVar.c == null ? new aq2() : bVar.c;
        this.f23475a = bVar.f23480a == null ? Bitmap.Config.ARGB_8888 : bVar.f23480a;
        this.d = bVar.d == null ? wt5.f() : bVar.d;
        this.e = (Context) b6i.g(bVar.e);
        this.g = bVar.x == null ? new ry6(new g77()) : bVar.x;
        this.f = bVar.f;
        this.h = bVar.g == null ? new su5() : bVar.g;
        this.j = bVar.i == null ? wug.n() : bVar.i;
        this.f23477k = bVar.j;
        this.l = q(bVar);
        this.m = bVar.l;
        this.n = bVar.m == null ? new a() : bVar.m;
        hy6 hy6VarH = bVar.n == null ? h(bVar.e) : bVar.n;
        this.o = hy6VarH;
        this.p = bVar.o == null ? yug.a() : bVar.o;
        this.q = v(bVar, l5dVarM);
        int i = bVar.y < 0 ? 30000 : bVar.y;
        this.s = i;
        if (epa.d()) {
            epa.a("ImagePipelineConfig->mNetworkFetcher");
        }
        this.f23478r = bVar.q == null ? new ghc(i) : bVar.q;
        if (epa.d()) {
            epa.b();
        }
        this.t = bVar.f23483r;
        i3i i3iVar = bVar.s == null ? new i3i(h3i.m().m()) : bVar.s;
        this.u = i3iVar;
        this.v = bVar.t == null ? new idm() : bVar.t;
        this.w = bVar.u == null ? new HashSet<>() : bVar.u;
        this.x = bVar.v;
        this.y = bVar.w != null ? bVar.w : hy6VarH;
        b.q(bVar);
        this.i = bVar.h == null ? new wu5(i3iVar.d()) : bVar.h;
        this.A = bVar.A;
        this.B = bVar.B;
        hcr hcrVarH = l5dVarM.h();
        if (hcrVarH != null) {
            G(hcrVarH, l5dVarM, new hac(y()));
        } else if (l5dVarM.o() && icr.f21006a && (hcrVarI = icr.i()) != null) {
            G(hcrVarI, l5dVarM, new hac(y()));
        }
        if (epa.d()) {
            epa.b();
        }
    }
}
