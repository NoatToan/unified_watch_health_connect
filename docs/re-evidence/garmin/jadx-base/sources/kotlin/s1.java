package kotlin;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.j;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import d4.g;
import e23.l;
import gl1.y;
import h4.i;
import h5.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o4.z;
import p005kotlin.jvm.internal.w;
import p3.c2;
import p3.i0;
import p3.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.n2;
import p3.o0;
import p3.p;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.t0;
import p3.v;
import p3.x1;
import p3.x2;
import p3.y3;
import vb.h;
import w5.q;
import w5.s;
import w5.u;
import z3.f;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BG\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Li5/s1;", "", "composeViewContext", "Landroid/view/View;", "view", "Lp3/p;", "compositionContext", "Landroidx/lifecycle/n0;", "lifecycleOwner", "Lnd/e;", "savedStateRegistryOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "", "matchesContext", "<init>", "(Li5/s1;Landroid/view/View;Lp3/p;Landroidx/lifecycle/n0;Lnd/e;Landroidx/lifecycle/ViewModelStoreOwner;Z)V", "(Landroid/view/View;Lp3/p;Landroidx/lifecycle/n0;Lnd/e;Landroidx/lifecycle/ViewModelStoreOwner;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f91443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f91444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f91445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nd.e f91446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewModelStoreOwner f91447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n5.b f91448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n5.d f91449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Configuration f91450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1<Configuration> f91451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f91452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f91453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f91454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f91455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w5.p.b f91456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p1<q.b> f91457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w4.a f91458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f91459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f91460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p2 f91461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f91462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f91463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f91464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f91465w;

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<i0, p3.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1 f91466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w1 w1Var) {
            super(1);
            this.f91466a = w1Var;
        }

        @Override // e23.l
        public final p3.h0 invoke(i0 i0Var) {
            return new r1(this.f91466a);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements e23.p<m, Integer, p005kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f91467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f91468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<m, Integer, p005kotlin.Unit> f91469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m mVar, s1 s1Var, e23.p<? super m, ? super Integer, p005kotlin.Unit> pVar) {
            super(2);
            this.f91467a = mVar;
            this.f91468b = s1Var;
            this.f91469c = pVar;
        }

        @Override // e23.p
        public final p005kotlin.Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                boolean z14 = i.f81559a;
                mVar2.C(866651995);
                t1.a(this.f91467a, this.f91468b.f91453k, this.f91469c, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w implements e23.p<m, Integer, p005kotlin.Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f91471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<m, Integer, p005kotlin.Unit> f91472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f91473d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m mVar, e23.p<? super m, ? super Integer, p005kotlin.Unit> pVar, int i14) {
            super(2);
            this.f91471b = mVar;
            this.f91472c = pVar;
            this.f91473d = i14;
        }

        @Override // e23.p
        public final p005kotlin.Unit invoke(m mVar, Integer num) {
            num.intValue();
            int iT = p0.t(this.f91473d | 1);
            s1.this.a(this.f91471b, this.f91472c, mVar, iT);
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li5/v1;", "invoke", "()Li5/v1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends w implements e23.a<v1> {
        public d() {
            super(0);
        }

        @Override // e23.a
        public final v1 invoke() {
            s1 s1Var = s1.this;
            s1Var.getClass();
            View view2 = s1Var.f91443a;
            g6.m.f76012b.getClass();
            if (g6.m.c(0L, 0L)) {
                return x0.a(view2);
            }
            v1.a aVar = v1.f91599c;
            g6.e eVarB = xy2.b.b(view2.getContext());
            aVar.getClass();
            return new v1(0L, eVarB.A(g6.n.c(0L)), null);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"i5/s1$e", "Landroid/content/ComponentCallbacks2;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
        public e() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            s1.this.d(configuration);
        }

        @Override // android.content.ComponentCallbacks
        @o13.e
        public final void onLowMemory() {
            s1 s1Var = s1.this;
            s1Var.f91448f.f123713a.clear();
            s1Var.f91449g.a();
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i14) {
            s1 s1Var = s1.this;
            s1Var.f91448f.f123713a.clear();
            s1Var.f91449g.a();
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z14) {
            s1.this.f91461s.f91383c.setValue(Boolean.valueOf(z14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s1(s1 s1Var, View view2, p pVar, n0 n0Var, nd.e eVar, ViewModelStoreOwner viewModelStoreOwner, boolean z14) {
        n5.b bVar;
        Configuration configuration;
        p1<Configuration> p1VarN;
        i iVar;
        t0 t0Var;
        k kVar;
        j jVar;
        w5.p.b i0Var;
        p1<q.b> c2Var;
        u0 u0Var;
        z zVar;
        h0 h0Var;
        n5.d dVar;
        this.f91443a = view2;
        this.f91444b = pVar;
        this.f91445c = n0Var;
        this.f91446d = eVar;
        this.f91447e = viewModelStoreOwner;
        if (z14) {
            s1Var.getClass();
            bVar = s1Var.f91448f;
        } else {
            bVar = new n5.b();
        }
        this.f91448f = bVar;
        this.f91449g = (s1Var == null || (dVar = s1Var.f91449g) == null) ? new n5.d() : dVar;
        if (z14) {
            s1Var.getClass();
            configuration = s1Var.f91450h;
        } else {
            configuration = new Configuration(view2.getContext().getResources().getConfiguration());
        }
        this.f91450h = configuration;
        if (z14) {
            s1Var.getClass();
            p1VarN = s1Var.f91451i;
        } else {
            p1VarN = p0.n(new Configuration(configuration));
        }
        this.f91451i = p1VarN;
        if (z14) {
            s1Var.getClass();
            iVar = s1Var.f91452j;
        } else {
            iVar = new i(view2.getContext());
        }
        this.f91452j = iVar;
        if (z14) {
            s1Var.getClass();
            t0Var = s1Var.f91453k;
        } else {
            t0Var = new t0(view2.getContext());
        }
        this.f91453k = t0Var;
        if (z14) {
            s1Var.getClass();
            kVar = s1Var.f91454l;
        } else {
            kVar = new k(view2.getContext());
        }
        this.f91454l = kVar;
        if (z14) {
            s1Var.getClass();
            jVar = s1Var.f91455m;
        } else {
            jVar = new j(kVar);
        }
        this.f91455m = jVar;
        if (z14) {
            s1Var.getClass();
            i0Var = s1Var.f91456n;
        } else {
            i0Var = new i0(view2.getContext());
        }
        this.f91456n = i0Var;
        if (z14) {
            s1Var.getClass();
            c2Var = s1Var.f91457o;
        } else {
            s sVarA = u.a(view2.getContext());
            x2 x2Var = x2.f135386a;
            x2Var.getClass();
            c2Var = new c2(sVarA, x2Var);
        }
        this.f91457o = c2Var;
        q4.a aVar = null;
        Object[] objArr = 0;
        this.f91458p = view2 == (s1Var != null ? s1Var.f91443a : null) ? s1Var.f91458p : new w4.c(view2);
        if (z14) {
            s1Var.getClass();
            u0Var = s1Var.f91459q;
        } else {
            u0Var = new u0(ViewConfiguration.get(view2.getContext()));
        }
        this.f91459q = u0Var;
        this.f91460r = (s1Var == null || (h0Var = s1Var.f91460r) == null) ? new h0(aVar, 1, objArr == true ? 1 : 0) : h0Var;
        this.f91461s = new p2();
        this.f91462t = (s1Var == null || (zVar = s1Var.f91462t) == null) ? new z() : zVar;
        g6.m.f76012b.getClass();
        this.f91464v = new d();
        this.f91465w = new e();
    }

    public final void a(m mVar, e23.p<? super m, ? super Integer, p005kotlin.Unit> pVar, m mVar2, int i14) {
        o0 o0VarE = mVar2.E(123858079);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(mVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object tag = mVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof f23.a) && !(tag instanceof f23.e))) ? null : (Set) tag;
            if (set == null) {
                Object parent = mVar.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                Object tag2 = view2 != null ? view2.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof f23.a) && !(tag2 instanceof f23.e))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(o0VarE.m0());
                o0VarE.f135193r = true;
                o0VarE.D = true;
                o0VarE.f135179d.d();
                o0VarE.I.d();
                s3.l lVar = o0VarE.J;
                s3.i iVar = lVar.f156363a;
                lVar.f156367e = iVar.f156357j;
                lVar.f156368f = iVar.f156358k;
            }
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            nd.e eVar = this.f91446d;
            if (objQ == c2565a) {
                Object parent2 = mVar.getParent();
                parent2.getClass();
                View view3 = (View) parent2;
                Object tag3 = view3.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view3.getId());
                }
                String strN = fb1.c.n("SaveableStateRegistry:", strValueOf);
                nd.c savedStateRegistry = eVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strN);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                y1 y1Var = y1.f91649a;
                y3 y3Var = d4.i.f57449a;
                g gVar = new g(linkedHashMap, y1Var);
                if (savedStateRegistry.b(strN) == null) {
                    try {
                        savedStateRegistry.c(strN, new j(gVar, 3));
                        z14 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                w1 w1Var = new w1(gVar, new x1(z14, savedStateRegistry, strN));
                o0VarE.K(w1Var);
                objQ = w1Var;
            }
            w1 w1Var2 = (w1) objQ;
            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            boolean zR = o0VarE.r(w1Var2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == m.a.f135155b) {
                objQ2 = new a(w1Var2);
                o0VarE.K(objQ2);
            }
            l0.a(unit, (l) objQ2, o0VarE);
            j0 j0Var = t1.f91505w;
            boolean zBooleanValue = ((Boolean) o0VarE.A(j0Var)).booleanValue() | mVar.getScrollCaptureInProgress$ui();
            boolean zB = o0VarE.B(mVar.getView());
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == m.a.f135155b) {
                objQ3 = new f4(mVar.getView());
                o0VarE.K(objQ3);
            }
            v.b(new n2[]{s9.j.f158018a.c(this.f91445c), od.a.f131173a.c(eVar), AndroidCompositionLocals_androidKt.f6044d.c(this.f91448f), AndroidCompositionLocals_androidKt.f6045e.c(this.f91449g), AndroidCompositionLocals_androidKt.f6042b.c(mVar.getContext()), g4.l.f75743a.c(set), AndroidCompositionLocals_androidKt.f6041a.c(mVar.getConfiguration()), d4.i.f57449a.c(w1Var2), AndroidCompositionLocals_androidKt.f6046f.c(mVar.getView()), j0Var.c(Boolean.valueOf(zBooleanValue)), t1.f91502t.c(mVar.getViewConfiguration()), t0.f135312a.c((f4) objQ3)}, f.c(1317454175, new b(mVar, this, pVar), o0VarE), o0VarE, 56);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(mVar, pVar, i14);
        }
    }

    public final void b() {
        int i14 = this.f91463u - 1;
        this.f91463u = i14;
        if (i14 < 0) {
            this.f91463u = 0;
        }
        if (this.f91463u == 0) {
            View view2 = this.f91443a;
            Context context = view2.getContext();
            e eVar = this.f91465w;
            context.unregisterComponentCallbacks(eVar);
            p2 p2Var = this.f91461s;
            if (p2Var.f91382b == null) {
                p2Var.f91381a = null;
            }
            view2.getViewTreeObserver().removeOnWindowFocusChangeListener(eVar);
        }
    }

    public final void c() {
        int i14 = this.f91463u + 1;
        this.f91463u = i14;
        if (i14 == 1) {
            View view2 = this.f91443a;
            Context context = view2.getContext();
            e eVar = this.f91465w;
            context.registerComponentCallbacks(eVar);
            d(view2.getResources().getConfiguration());
            boolean zHasWindowFocus = view2.hasWindowFocus();
            p2 p2Var = this.f91461s;
            p2Var.f91383c.setValue(Boolean.valueOf(zHasWindowFocus));
            c2 c2Var = p2Var.f91382b;
            d dVar = this.f91464v;
            if (c2Var == null) {
                p2Var.f91381a = dVar;
            }
            if (c2Var != null) {
                c2Var.setValue(dVar.invoke());
            }
            view2.getViewTreeObserver().addOnWindowFocusChangeListener(eVar);
        }
    }

    public final void d(Configuration configuration) {
        c2 c2Var;
        int iUpdateFrom = this.f91450h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator<Map.Entry<n5.b.C2320b, WeakReference<n5.b.a>>> it = this.f91448f.f123713a.entrySet().iterator();
            while (it.hasNext()) {
                n5.b.a aVar = it.next().getValue().get();
                if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f123715b)) {
                    it.remove();
                }
            }
            this.f91451i.setValue(new Configuration(configuration));
            this.f91449g.a();
            if ((268435456 & iUpdateFrom) != 0) {
                this.f91457o.setValue(u.a(this.f91443a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) == 0 || (c2Var = this.f91461s.f91382b) == null) {
                return;
            }
            c2Var.setValue(this.f91464v.invoke());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s1(View view2, p pVar, n0 n0Var, nd.e eVar, ViewModelStoreOwner viewModelStoreOwner, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            pVar = s4.a(view2);
            if (pVar == null) {
                Object parent = view2.getParent();
                while (pVar == null && (parent instanceof View)) {
                    View view3 = (View) parent;
                    pVar = s4.a(view3);
                    parent = gl1.d.A(view3);
                }
            }
            if (pVar == null) {
                pVar = s4.b(view2);
            }
        }
        p pVar2 = pVar;
        if ((i14 & 4) != 0 && (n0Var = xy2.b.r(view2)) == null) {
            h.z("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            throw null;
        }
        n0 n0Var2 = n0Var;
        if ((i14 & 8) != 0 && (eVar = y.p(view2)) == null) {
            h.z("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            throw null;
        }
        this(view2, pVar2, n0Var2, eVar, (i14 & 16) != 0 ? zf.b.s(view2) : viewModelStoreOwner);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s1(s1 s1Var, View view2, p pVar, n0 n0Var, nd.e eVar, ViewModelStoreOwner viewModelStoreOwner, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        View view3;
        if ((i14 & 64) != 0) {
            z14 = p005kotlin.jvm.internal.s.g((s1Var == null || (view3 = s1Var.f91443a) == null) ? null : view3.getContext(), view2.getContext());
        }
        this(s1Var, view2, pVar, n0Var, eVar, viewModelStoreOwner, z14);
    }

    public s1(View view2, p pVar, n0 n0Var, nd.e eVar, ViewModelStoreOwner viewModelStoreOwner) {
        this(androidx.compose.ui.platform.a.c(androidx.compose.ui.platform.a.b(view2)), view2, pVar, n0Var, eVar, viewModelStoreOwner, false, 64, null);
    }
}
