package lc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.y1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Llc/y;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "c", "b", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f111902i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.h f111904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.f f111905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f111906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f111908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f111909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f111910h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc/y$b;", "Llc/x0;", "Llc/v0;", "Llc/h0;", "navigator", "<init>", "(Llc/y;Llc/v0;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public class b extends x0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v0<? extends h0> f111911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ y f111912h;

        public b(y yVar, v0<? extends h0> v0Var) {
            v0Var.getClass();
            this.f111912h = yVar;
            this.f111911g = v0Var;
        }

        @Override // lc.x0
        public final v a(h0 h0Var, Bundle bundle) {
            qc.h hVar = this.f111912h.f111904b;
            hVar.getClass();
            return v.a.a(v.f111880j, hVar.f144314a.f111905c, h0Var, bundle, hVar.l(), hVar.f144329p);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        @Override // lc.x0
        public final void b(v vVar) {
            z zVar;
            y1 y1Var;
            vVar.getClass();
            qc.h hVar = this.f111912h.f111904b;
            p2 p2Var = hVar.f144322i;
            String str = vVar.f111886f;
            LinkedHashMap linkedHashMap = hVar.f144337x;
            boolean zG = p005kotlin.jvm.internal.s.g(linkedHashMap.get(vVar), Boolean.TRUE);
            super.b(vVar);
            Unit unit = Unit.INSTANCE;
            linkedHashMap.remove(vVar);
            p13.k<v> kVar = hVar.f144319f;
            if (kVar.contains(vVar)) {
                if (this.f111899d) {
                    return;
                }
                hVar.z();
                hVar.f144320g.k(null, new ArrayList(kVar));
                p2Var.k(null, hVar.v());
                return;
            }
            hVar.y(vVar);
            if (vVar.f111888h.f144302j.f7973d.a(androidx.lifecycle.b0.b.CREATED)) {
                vVar.b(androidx.lifecycle.b0.b.DESTROYED);
            }
            if (!kVar.isEmpty()) {
                Iterator<v> it = kVar.iterator();
                while (it.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(it.next().f111886f, str)) {
                    }
                }
                if (!zG) {
                    str.getClass();
                    y1Var = (y1) zVar.f111917a.remove(str);
                    if (y1Var != null) {
                        y1Var.a();
                    }
                }
            } else if (!zG && (zVar = hVar.f144329p) != null) {
                str.getClass();
                y1Var = (y1) zVar.f111917a.remove(str);
                if (y1Var != null) {
                    y1Var.a();
                }
            }
            hVar.z();
            p2Var.k(null, hVar.v());
        }

        @Override // lc.x0
        public final void d(v vVar, boolean z14) {
            qc.h hVar = this.f111912h.f111904b;
            hVar.getClass();
            v0 v0VarC = hVar.f144333t.c(vVar.f111882b.f111772a);
            hVar.f144337x.put(vVar, Boolean.valueOf(z14));
            if (!v0VarC.equals(this.f111911g)) {
                Object obj = hVar.f144334u.get(v0VarC);
                obj.getClass();
                ((b) obj).d(vVar, z14);
                return;
            }
            cq.m mVar = hVar.f144336w;
            if (mVar != null) {
                mVar.invoke(vVar);
                super.d(vVar, z14);
                Unit unit = Unit.INSTANCE;
                return;
            }
            p13.k<v> kVar = hVar.f144319f;
            int iIndexOf = kVar.indexOf(vVar);
            if (iIndexOf < 0) {
                qc.b.a aVar = qc.b.f144291a;
                vVar.toString();
                aVar.getClass();
                return;
            }
            int i14 = iIndexOf + 1;
            if (i14 != kVar.f134948c) {
                hVar.r(kVar.get(i14).f111882b.f111773b.f144346e, true, false);
            }
            qc.h.u(hVar, vVar);
            super.d(vVar, z14);
            Unit unit2 = Unit.INSTANCE;
            hVar.f144315b.invoke();
            hVar.b();
        }

        @Override // lc.x0
        public final void f(v vVar) {
            vVar.getClass();
            super.f(vVar);
            qc.h hVar = this.f111912h.f111904b;
            hVar.getClass();
            if (hVar.f144319f.contains(vVar)) {
                vVar.b(androidx.lifecycle.b0.b.STARTED);
            } else {
                vb.h.z("Cannot transition entry that is not in the back stack");
            }
        }

        @Override // lc.x0
        public final void g(v vVar) {
            vVar.getClass();
            qc.h hVar = this.f111912h.f111904b;
            hVar.getClass();
            v0 v0VarC = hVar.f144333t.c(vVar.f111882b.f111772a);
            if (!v0VarC.equals(this.f111911g)) {
                Object obj = hVar.f144334u.get(v0VarC);
                if (obj != null) {
                    ((b) obj).g(vVar);
                    return;
                } else {
                    v.e0.n(am.j.o(vVar.f111882b.f111772a, " should already be created", new StringBuilder("NavigatorBackStack for ")));
                    return;
                }
            }
            e23.l<? super v, Unit> lVar = hVar.f144335v;
            if (lVar != null) {
                lVar.invoke(vVar);
                super.g(vVar);
            } else {
                qc.b.a aVar = qc.b.f144291a;
                Objects.toString(vVar.f111882b);
                aVar.getClass();
            }
        }

        public final void i(v vVar) {
            vVar.getClass();
            super.g(vVar);
        }
    }

    public interface c {
        void m8(y yVar, h0 h0Var, Bundle bundle);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lc/y$d", "Lb/s;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(false);
        }

        @Override // b.s
        public final void b() {
            y.this.n();
        }
    }

    static {
        new a(null);
        f111902i = true;
    }

    public y(Context context) {
        context.getClass();
        this.f111903a = context;
        this.f111904b = new qc.h(this, new gk1.b(this, 5));
        this.f111905c = new qc.f(context);
        for (Object obj : c53.q.e(new l72.b1(7), context)) {
            if (((Context) obj) instanceof Activity) {
                this.f111906d = (Activity) obj;
                this.f111908f = new d();
                this.f111909g = true;
                this.f111904b.f144333t.a(new l0(this.f111904b.f144333t));
                this.f111904b.f144333t.a(new lc.a(this.f111903a));
                this.f111910h = o13.m.b(new gk1.b(this, 6));
            }
        }
        obj = null;
        this.f111906d = (Activity) obj;
        this.f111908f = new d();
        this.f111909g = true;
        this.f111904b.f144333t.a(new l0(this.f111904b.f144333t));
        this.f111904b.f144333t.a(new lc.a(this.f111903a));
        this.f111910h = o13.m.b(new gk1.b(this, 6));
    }

    public static void k(String str, y yVar) {
        yVar.getClass();
        str.getClass();
        yVar.f111904b.o(str, null);
    }

    public static void l(y yVar, Object obj) {
        yVar.getClass();
        obj.getClass();
        qc.h hVar = yVar.f111904b;
        hVar.getClass();
        hVar.o(hVar.f(obj), null);
    }

    public static void p(y yVar, String str, boolean z14) {
        yVar.getClass();
        str.getClass();
        qc.h hVar = yVar.f111904b;
        hVar.getClass();
        if (hVar.s(str, z14, false)) {
            hVar.b();
        }
    }

    public static boolean q(y yVar, Object obj) {
        yVar.getClass();
        obj.getClass();
        qc.h hVar = yVar.f111904b;
        hVar.getClass();
        return hVar.s(hVar.f(obj), false, false) && hVar.b();
    }

    public final void a(c cVar) {
        qc.h hVar = this.f111904b;
        hVar.getClass();
        hVar.f144330q.add(cVar);
        p13.k<v> kVar = hVar.f144319f;
        if (kVar.isEmpty()) {
            return;
        }
        v vVarLast = kVar.last();
        cVar.m8(hVar.f144314a, vVarLast.f111882b, vVarLast.f111888h.a());
    }

    public final h0 b(String str) {
        qc.h hVar = this.f111904b;
        hVar.getClass();
        j0 j0Var = hVar.f144316c;
        if (j0Var == null) {
            return null;
        }
        if (!p005kotlin.jvm.internal.s.g(j0Var.f111773b.f144347f, str)) {
            j0 j0Var2 = hVar.f144316c;
            j0Var2.getClass();
            if (j0Var2.f111773b.a(str) == null) {
                return hVar.m().m(str);
            }
        }
        return hVar.f144316c;
    }

    public final <T> v c(k23.d<T> dVar) {
        dVar.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        int iB = rc.l.b(gl1.y.J(dVar));
        Object obj = null;
        if (qc.h.e(iB, hVar.k(), null, true) == null) {
            vb.h.A("Destination with route ", dVar.D(), " cannot be found in navigation graph ", hVar.k());
            return null;
        }
        List list = (List) hVar.f144321h.f150540a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((v) objPrevious).f111882b.f111773b.f144346e == iB) {
                obj = objPrevious;
                break;
            }
        }
        v vVar = (v) obj;
        if (vVar != null) {
            return vVar;
        }
        vb.h.A("No destination with route ", dVar.D(), " is on the NavController's back stack. The current destination is ", hVar.j());
        return null;
    }

    public final int d() {
        p13.k<v> kVar = this.f111904b.f144319f;
        int i14 = 0;
        if (kVar != null && kVar.isEmpty()) {
            return 0;
        }
        Iterator<v> it = kVar.iterator();
        while (it.hasNext()) {
            if (!(it.next().f111882b instanceof j0) && (i14 = i14 + 1) < 0) {
                p13.x.p();
                throw null;
            }
        }
        return i14;
    }

    public final n0 e() {
        return (n0) this.f111910h.getValue();
    }

    public final v f() {
        Object next;
        Iterator it = p13.h0.G0(this.f111904b.f144319f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it3 = ((c53.a) c53.q.b(it)).iterator();
        while (it3.hasNext()) {
            next = it3.next();
            if (!(((v) next).f111882b instanceof j0)) {
                return (v) next;
            }
        }
        next = null;
        return (v) next;
    }

    public final void g(int i14, Bundle bundle) {
        int i15;
        o0 o0Var;
        Bundle bundleA;
        qc.h hVar = this.f111904b;
        h0 h0Var = hVar.f144319f.isEmpty() ? hVar.f144316c : hVar.f144319f.last().f111882b;
        if (h0Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        s sVarD = h0Var.d(i14);
        if (sVarD != null) {
            o0Var = sVarD.f111864b;
            i15 = sVarD.f111863a;
            Bundle bundle2 = sVarD.f111865c;
            if (bundle2 != null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                bundleA.putAll(bundle2);
            } else {
                bundleA = null;
            }
        } else {
            i15 = i14;
            o0Var = null;
            bundleA = null;
        }
        if (bundle != null) {
            if (bundleA == null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            bundleA.putAll(bundle);
        }
        if (i15 == 0 && o0Var != null) {
            boolean z14 = o0Var.f111807d;
            k23.d<?> dVar = o0Var.f111814k;
            String str = o0Var.f111813j;
            int i16 = o0Var.f111806c;
            if (i16 != -1 || str != null || dVar != null) {
                if (str != null) {
                    p(this, str, z14);
                    return;
                } else if (dVar != null) {
                    hVar.q(rc.l.b(gl1.y.J(dVar)), z14);
                    return;
                } else {
                    if (i16 != -1) {
                        hVar.q(i16, z14);
                        return;
                    }
                    return;
                }
            }
        }
        if (i15 == 0) {
            vb.h.s("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        h0 h0VarD = hVar.d(i15, null);
        if (h0VarD != null) {
            hVar.p(h0VarD, bundleA, o0Var);
            return;
        }
        h0.f111771f.getClass();
        qc.f fVar = this.f111905c;
        String strA = h0.a.a(fVar, i15);
        if (sVarD == null) {
            c22.t.i("Navigation action/destination ", strA, " cannot be found from the current destination ", h0Var);
            return;
        }
        StringBuilder sbL = hb.a.l("Navigation destination ", strA, " referenced from action ");
        sbL.append(h0.a.a(fVar, i14));
        sbL.append(" cannot be found from the current destination ");
        sbL.append(h0Var);
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    public final void h(e23.l lVar, Object obj) {
        obj.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        hVar.o(hVar.f(obj), gg.b.L(lVar));
    }

    public final void i(e23.l lVar, String str) {
        str.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        hVar.o(str, gg.b.L(lVar));
    }

    public final void j() {
        g(R.id.action_activityDetailsFragment_to_selectTrailBottomSheet, null);
    }

    public final boolean m() {
        Bundle bundleB;
        Intent intent;
        if (d() != 1) {
            return n();
        }
        Activity activity = this.f111906d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        int i14 = 0;
        qc.h hVar = this.f111904b;
        if (intArray == null) {
            h0 h0VarJ = hVar.j();
            h0VarJ.getClass();
            int i15 = h0VarJ.f111773b.f144346e;
            for (j0 j0Var = h0VarJ.f111774c; j0Var != null; j0Var = j0Var.f111774c) {
                qc.j jVar = j0Var.f111773b;
                if (j0Var.f111791g.f144354c != i15) {
                    p13.k0.f134949a.getClass();
                    Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        j0 j0VarM = hVar.m();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        h0.b bVarN = j0VarM.n(new g0(intent3.getData(), intent3.getAction(), intent3.getType()), j0VarM);
                        if ((bVarN != null ? bVarN.f111778b : null) != null && (bundleB = bVarN.f111777a.b(bVarN.f111778b)) != null) {
                            bundleA.putAll(bundleB);
                        }
                    }
                    e0 e0Var = new e0(this);
                    int i16 = jVar.f144346e;
                    ArrayList arrayList = e0Var.f111759e;
                    arrayList.clear();
                    arrayList.add(new e0.a(i16, null));
                    if (e0Var.f111758d != null) {
                        e0Var.c();
                    }
                    e0Var.f111757c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA);
                    e0Var.a().g();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i15 = jVar.f144346e;
            }
        } else if (this.f111907e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayListK0 = p13.u.k0(intArray2);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayListK0.size() >= 2) {
                int iIntValue = ((Number) p13.d0.F(arrayListK0)).intValue();
                if (parcelableArrayList != null) {
                }
                h0 h0VarE = qc.h.e(iIntValue, hVar.k(), null, false);
                if (h0VarE instanceof j0) {
                    j0.f111790h.getClass();
                    iIntValue = j0.a.a((j0) h0VarE).f111773b.f144346e;
                }
                h0 h0VarJ2 = hVar.j();
                if (h0VarJ2 != null && iIntValue == h0VarJ2.f111773b.f144346e) {
                    e0 e0Var2 = new e0(this);
                    p13.k0.f134949a.getClass();
                    Bundle bundleA2 = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                    bundleA2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleA2.putAll(bundle);
                    }
                    e0Var2.f111757c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA2);
                    for (Object obj : arrayListK0) {
                        int i17 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        e0Var2.f111759e.add(new e0.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i14) : null));
                        if (e0Var2.f111758d != null) {
                            e0Var2.c();
                        }
                        i14 = i17;
                    }
                    e0Var2.a().g();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n() {
        qc.h hVar = this.f111904b;
        if (hVar.f144319f.isEmpty()) {
            return false;
        }
        h0 h0VarJ = hVar.j();
        h0VarJ.getClass();
        return hVar.q(h0VarJ.f111773b.f144346e, true);
    }

    public final boolean o(k23.d dVar, boolean z14) {
        dVar.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        int iB = rc.l.b(gl1.y.J(dVar));
        if (qc.h.e(iB, hVar.k(), null, true) != null) {
            return hVar.q(iB, z14);
        }
        vb.h.A("Destination with route ", dVar.D(), " cannot be found in navigation graph ", hVar.k());
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Bundle bundle) throws Throwable {
        Bundle[] bundleArr;
        Throwable th3;
        if (bundle != null) {
            bundle.setClassLoader(this.f111903a.getClassLoader());
        }
        qc.h hVar = this.f111904b;
        LinkedHashMap linkedHashMap = hVar.f144327n;
        Throwable th4 = null;
        if (bundle == null) {
            th3 = null;
        } else {
            hVar.f144317d = bundle.containsKey("android-support-nav:controller:navigatorState") ? nd.b.g(bundle, "android-support-nav:controller:navigatorState") : null;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? h7.b.a.c(bundle, dh.b.u(p005kotlin.jvm.internal.s0.f105811a.b(Bundle.class)), "android-support-nav:controller:backStack") : bundle.getParcelableArrayList("android-support-nav:controller:backStack");
                if (arrayListC == null) {
                    gg.b.J("android-support-nav:controller:backStack");
                    throw null;
                }
                bundleArr = (Bundle[]) arrayListC.toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            hVar.f144318e = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] iArrE = nd.b.e(bundle, "android-support-nav:controller:backStackDestIds");
                ArrayList arrayListJ = nd.b.j(bundle, "android-support-nav:controller:backStackIds");
                int length = iArrE.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    int i16 = i15 + 1;
                    Throwable th5 = th4;
                    hVar.f144326m.put(Integer.valueOf(iArrE[i14]), !p005kotlin.jvm.internal.s.g(arrayListJ.get(i15), "") ? (String) arrayListJ.get(i15) : th5);
                    i14++;
                    i15 = i16;
                    th4 = th5;
                }
            }
            th3 = th4;
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                for (String str : nd.b.j(bundle, "android-support-nav:controller:backStackStates")) {
                    if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                        String strN = fb1.c.n("android-support-nav:controller:backStackStates:", str);
                        ArrayList arrayListC2 = Build.VERSION.SDK_INT >= 34 ? h7.b.a.c(bundle, dh.b.u(p005kotlin.jvm.internal.s0.f105811a.b(Bundle.class)), strN) : bundle.getParcelableArrayList(strN);
                        if (arrayListC2 == null) {
                            gg.b.J(strN);
                            throw th3;
                        }
                        p13.k kVar = new p13.k(arrayListC2.size());
                        Iterator it = arrayListC2.iterator();
                        while (it.hasNext()) {
                            kVar.addLast(new x((Bundle) it.next()));
                        }
                        linkedHashMap.put(str, kVar);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z14 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z14 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z14) : th3;
            this.f111907e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
        }
    }

    public final Bundle s() {
        Bundle bundleA;
        qc.h hVar = this.f111904b;
        LinkedHashMap linkedHashMap = hVar.f144327n;
        p13.k<v> kVar = hVar.f144319f;
        LinkedHashMap linkedHashMap2 = hVar.f144326m;
        ArrayList arrayList = new ArrayList();
        p13.k0.f134949a.getClass();
        Bundle bundleA2 = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        for (Map.Entry entry : p13.u0.m(hVar.f144333t.f111894a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((v0) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                nd.f.b(str, bundleA2, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            p13.k0.f134949a.getClass();
            bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            nd.f.c("android-support-nav:controller:navigatorState:names", bundleA2, arrayList);
            bundleA.putBundle("android-support-nav:controller:navigatorState", bundleA2);
        }
        if (!kVar.isEmpty()) {
            if (bundleA == null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<v> it = kVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(new x(it.next()).b());
            }
            nd.f.a("android-support-nav:controller:backStack", bundleA, arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleA == null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i15 = i14 + 1;
                iArr[i14] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i14 = i15;
            }
            bundleA.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            nd.f.c("android-support-nav:controller:backStackIds", bundleA, arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleA == null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                p13.k kVar2 = (p13.k) entry3.getValue();
                arrayList4.add(str3);
                ArrayList arrayList5 = new ArrayList();
                Iterator<E> it3 = kVar2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((x) it3.next()).b());
                }
                nd.f.a("android-support-nav:controller:backStackStates:" + str3, bundleA, arrayList5);
            }
            nd.f.c("android-support-nav:controller:backStackStates", bundleA, arrayList4);
        }
        if (this.f111907e) {
            if (bundleA == null) {
                p13.k0.f134949a.getClass();
                bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            }
            bundleA.putBoolean("android-support-nav:controller:deepLinkHandled", this.f111907e);
        }
        return bundleA;
    }

    public final void t(j0 j0Var) {
        j0Var.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        hVar.x(j0Var, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llc/y$a;", "", "<init>", "()V", "", "KEY_DEEP_LINK_IDS", "Ljava/lang/String;", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_INTENT", "", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
