package c2;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lc2/m3;", "", "Landroidx/core/view/m1;", "insets", "Landroid/view/View;", "view", "<init>", "(Landroidx/core/view/m1;Landroid/view/View;)V", "a", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m3 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f22753w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final WeakHashMap<View, m3> f22754x = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f22756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f22757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f22758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f22759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f22760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f22761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f22762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f22763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h3 f22764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.c2 f22765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c3 f22766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h3 f22767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h3 f22768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h3 f22769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3 f22770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h3 f22771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h3 f22772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h3 f22773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f22774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i1 f22776v;

    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    private m3(androidx.core.view.m1 m1Var, View view2) {
        o4.j jVar;
        androidx.core.view.i iVarH;
        androidx.core.view.i iVarH2;
        c7.e eVarB;
        a aVar = f22753w;
        g gVarA = a.a(aVar, m1Var, 4, "captionBar");
        this.f22755a = gVarA;
        g gVarA2 = a.a(aVar, m1Var, 128, "displayCutout");
        this.f22756b = gVarA2;
        g gVarA3 = a.a(aVar, m1Var, 8, "ime");
        this.f22757c = gVarA3;
        g gVarA4 = a.a(aVar, m1Var, 32, "mandatorySystemGestures");
        this.f22758d = gVarA4;
        g gVarA5 = a.a(aVar, m1Var, 2, "navigationBars");
        this.f22759e = gVarA5;
        g gVarA6 = a.a(aVar, m1Var, 1, "statusBars");
        this.f22760f = gVarA6;
        g gVarA7 = a.a(aVar, m1Var, 519, "systemBars");
        this.f22761g = gVarA7;
        g gVarA8 = a.a(aVar, m1Var, 16, "systemGestures");
        this.f22762h = gVarA8;
        g gVarA9 = a.a(aVar, m1Var, 64, "tappableElement");
        this.f22763i = gVarA9;
        h3 h3Var = new h3(q3.e((m1Var == null || (iVarH2 = m1Var.f6508a.h()) == null || (eVarB = iVarH2.b()) == null) ? c7.e.f25189e : eVarB), "waterfall");
        this.f22764j = h3Var;
        if (m1Var == null || (iVarH = m1Var.f6508a.h()) == null) {
            jVar = null;
        } else {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? androidx.core.view.i.c.a(iVarH.f6455a) : null;
            if (pathA != null) {
                jVar = new o4.j(pathA);
            } else {
                jVar = null;
            }
        }
        this.f22765k = p3.p0.n(jVar);
        n0 n0Var = n3.f22788a;
        c3 c3Var = new c3(new c3(gVarA7, gVarA3), gVarA2);
        this.f22766l = c3Var;
        new c3(c3Var, new c3(new c3(new c3(gVarA9, gVarA4), gVarA8), h3Var));
        this.f22767m = a.b(aVar, m1Var, 4, "captionBarIgnoringVisibility");
        this.f22768n = a.b(aVar, m1Var, 2, "navigationBarsIgnoringVisibility");
        this.f22769o = a.b(aVar, m1Var, 1, "statusBarsIgnoringVisibility");
        this.f22770p = a.b(aVar, m1Var, 519, "systemBarsIgnoringVisibility");
        this.f22771q = a.b(aVar, m1Var, 64, "tappableElementIgnoringVisibility");
        c7.e eVar = c7.e.f25189e;
        this.f22772r = new h3(q3.e(eVar), "imeAnimationTarget");
        this.f22773s = new h3(q3.e(eVar), "imeAnimationSource");
        Object parent = view2.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        Object tag = view3 != null ? view3.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f22774t = bool != null ? bool.booleanValue() : false;
        this.f22776v = new i1(this);
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.m1 m1VarA = androidx.core.view.s0.e.a(view2);
        if (m1VarA != null) {
            androidx.core.view.m1.r rVar = m1VarA.f6508a;
            gVarA.f(rVar.u(4));
            gVarA2.f(rVar.u(128));
            gVarA3.f(rVar.u(8));
            gVarA4.f(rVar.u(32));
            gVarA5.f(rVar.u(2));
            gVarA6.f(rVar.u(1));
            gVarA7.f(rVar.u(519));
            gVarA8.f(rVar.u(16));
            gVarA9.f(rVar.u(64));
        }
    }

    public static void b(m3 m3Var, androidx.core.view.m1 m1Var) {
        c7.e eVarB;
        m3Var.f22755a.g(m1Var, 0);
        m3Var.f22757c.g(m1Var, 0);
        m3Var.f22756b.g(m1Var, 0);
        m3Var.f22759e.g(m1Var, 0);
        m3Var.f22760f.g(m1Var, 0);
        m3Var.f22761g.g(m1Var, 0);
        m3Var.f22762h.g(m1Var, 0);
        m3Var.f22763i.g(m1Var, 0);
        m3Var.f22758d.g(m1Var, 0);
        h3 h3Var = m3Var.f22767m;
        androidx.core.view.m1.r rVar = m1Var.f6508a;
        h3Var.f(q3.e(rVar.j(4)));
        m3Var.f22768n.f(q3.e(rVar.j(2)));
        m3Var.f22769o.f(q3.e(rVar.j(1)));
        m3Var.f22770p.f(q3.e(rVar.j(519)));
        m3Var.f22771q.f(q3.e(rVar.j(64)));
        androidx.core.view.i iVarH = rVar.h();
        h3 h3Var2 = m3Var.f22764j;
        if (iVarH == null || (eVarB = iVarH.b()) == null) {
            eVarB = c7.e.f25189e;
        }
        h3Var2.f(q3.e(eVarB));
        o4.j jVar = null;
        if (iVarH != null) {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? androidx.core.view.i.c.a(iVarH.f6455a) : null;
            if (pathA != null) {
                jVar = new o4.j(pathA);
            }
        }
        m3Var.f22765k.setValue(jVar);
        f4.f.f68735e.getClass();
        f4.f.a.f();
    }

    public final void a(View view2) {
        if (this.f22775u == 0) {
            WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
            i1 i1Var = this.f22776v;
            androidx.core.view.s0.d.c(view2, i1Var);
            if (view2.isAttachedToWindow()) {
                view2.requestApplyInsets();
            }
            view2.addOnAttachStateChangeListener(i1Var);
            androidx.core.view.s0.t(view2, i1Var);
        }
        this.f22775u++;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/m3$a;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lc2/m3;", "viewMap", "Ljava/util/WeakHashMap;", "", "testInsets", "Z", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final g a(a aVar, androidx.core.view.m1 m1Var, int i14, String str) {
            aVar.getClass();
            g gVar = new g(i14, str);
            if (m1Var != null) {
                gVar.g(m1Var, i14);
            }
            return gVar;
        }

        public static final h3 b(a aVar, androidx.core.view.m1 m1Var, int i14, String str) {
            c7.e eVarJ;
            aVar.getClass();
            if (m1Var == null || (eVarJ = m1Var.f6508a.j(i14)) == null) {
                eVarJ = c7.e.f25189e;
            }
            return new h3(q3.e(eVarJ), str);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0026  */
        public static m3 c(p3.m mVar) {
            p3.x1 x1Var = p3.n.f135158a;
            View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
            m3 m3VarD = d(view2);
            boolean zR = mVar.r(m3VarD) | mVar.r(view2);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new bp.h(7, m3VarD, view2);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new bp.h(7, m3VarD, view2);
                    mVar.K(objQ);
                }
            }
            p3.l0.a(m3VarD, (e23.l) objQ, mVar);
            return m3VarD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static m3 d(View view2) {
            m3 m3Var;
            WeakHashMap<View, m3> weakHashMap = m3.f22754x;
            synchronized (weakHashMap) {
                try {
                    m3 m3Var2 = weakHashMap.get(view2);
                    if (m3Var2 == null) {
                        m3Var2 = new m3(null, view2, 0 == true ? 1 : 0);
                        weakHashMap.put(view2, m3Var2);
                    }
                    m3Var = m3Var2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return m3Var;
        }

        private a() {
        }
    }

    public /* synthetic */ m3(androidx.core.view.m1 m1Var, View view2, p005kotlin.jvm.internal.j jVar) {
        this(m1Var, view2);
    }
}
