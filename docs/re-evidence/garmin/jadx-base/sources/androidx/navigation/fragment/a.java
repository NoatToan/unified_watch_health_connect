package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.fragment.app.v.t;
import androidx.fragment.app.v.u;
import androidx.fragment.app.z;
import androidx.lifecycle.a0;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import e23.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import lc.h0;
import lc.o0;
import lc.v0;
import lc.w0;
import lc.x0;
import lc.y;
import o13.h;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.d0;
import p13.x;
import p3.q1;
import pc.e;

/* JADX INFO: loaded from: classes.dex */
@v0.a("fragment")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\f\rB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/navigation/fragment/a;", "Llc/v0;", "Landroidx/navigation/fragment/a$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;I)V", "c", "b", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a extends v0<c> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10129j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f10131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f10133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f10135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q1 f10136i;

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/a$a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0135a extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<e23.a<Unit>> f10137a;

        @Override // androidx.lifecycle.u1
        public final void onCleared() {
            super.onCleared();
            WeakReference<e23.a<Unit>> weakReference = this.f10137a;
            if (weakReference == null) {
                s.m("completeTransition");
                throw null;
            }
            e23.a<Unit> aVar = weakReference.get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f10139a;

        public d(l lVar) {
            lVar.getClass();
            this.f10139a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f10139a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10139a.invoke(obj);
        }
    }

    static {
        new b(null);
    }

    public a(Context context, v vVar, int i14) {
        context.getClass();
        vVar.getClass();
        this.f10130c = context;
        this.f10131d = vVar;
        this.f10132e = i14;
        this.f10133f = new LinkedHashSet();
        this.f10134g = new ArrayList();
        this.f10135h = new a0(this, 7);
        this.f10136i = new q1(this, 13);
    }

    public static void k(a aVar, String str, int i14) {
        boolean z14 = (i14 & 2) == 0;
        boolean z15 = (i14 & 4) != 0;
        ArrayList arrayList = aVar.f10134g;
        if (z15) {
            d0.B(new o60.b(str, 4), arrayList);
        }
        arrayList.add(new p(str, Boolean.valueOf(z14)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // lc.v0
    public final h0 a() {
        return new c(this);
    }

    @Override // lc.v0
    public final void d(List list, o0 o0Var) {
        v vVar = this.f10131d;
        if (vVar.V()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lc.v vVar2 = (lc.v) it.next();
            boolean zIsEmpty = ((List) b().f111900e.f150540a.getValue()).isEmpty();
            if (o0Var == null || zIsEmpty || !o0Var.f111805b || !this.f10133f.remove(vVar2.f111886f)) {
                androidx.fragment.app.a aVarM = m(vVar2, o0Var);
                String str = vVar2.f111886f;
                if (!zIsEmpty) {
                    lc.v vVar3 = (lc.v) p13.h0.n0((List) b().f111900e.f150540a.getValue());
                    if (vVar3 != null) {
                        k(this, vVar3.f111886f, 6);
                    }
                    k(this, str, 6);
                    aVarM.d(str);
                }
                aVarM.e();
                if (n()) {
                    vVar2.toString();
                }
                b().h(vVar2);
            } else {
                vVar.y(vVar.new t(vVar2.f111886f), false);
                b().h(vVar2);
            }
        }
    }

    @Override // lc.v0
    public final void e(final y.b bVar) {
        this.f111890a = bVar;
        this.f111891b = true;
        z zVar = new z() { // from class: pc.c
            @Override // androidx.fragment.app.z
            public final void a(v vVar, Fragment fragment) {
                Object objPrevious;
                int i14 = androidx.navigation.fragment.a.f10129j;
                vVar.getClass();
                y.b bVar2 = bVar;
                List list = (List) bVar2.f111900e.f150540a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!s.g(((lc.v) objPrevious).f111886f, fragment.getTag()));
                lc.v vVar2 = (lc.v) objPrevious;
                boolean zN = androidx.navigation.fragment.a.n();
                androidx.navigation.fragment.a aVar = this;
                if (zN) {
                    fragment.toString();
                    Objects.toString(vVar2);
                    Objects.toString(aVar.f10131d);
                }
                if (vVar2 != null) {
                    fragment.getViewLifecycleOwnerLiveData().f(fragment, new androidx.navigation.fragment.a.d(new p90.h(aVar, 1, fragment, vVar2)));
                    fragment.getF158016a().a(aVar.f10135h);
                    aVar.l(fragment, vVar2, bVar2);
                }
            }
        };
        v vVar = this.f10131d;
        vVar.f7386q.add(zVar);
        vVar.b(new pc.d(bVar, this));
    }

    @Override // lc.v0
    public final void f(lc.v vVar) {
        String str = vVar.f111886f;
        v vVar2 = this.f10131d;
        if (vVar2.V()) {
            return;
        }
        androidx.fragment.app.a aVarM = m(vVar, null);
        List list = (List) b().f111900e.f150540a.getValue();
        if (list.size() > 1) {
            lc.v vVar3 = (lc.v) p13.h0.e0(list.size() - 2, list);
            if (vVar3 != null) {
                k(this, vVar3.f111886f, 6);
            }
            k(this, str, 4);
            vVar2.a0(1, str);
            k(this, str, 2);
            aVarM.d(str);
        }
        aVarM.e();
        b().c(vVar);
    }

    @Override // lc.v0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f10133f;
            linkedHashSet.clear();
            d0.v(linkedHashSet, stringArrayList);
        }
    }

    @Override // lc.v0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f10133f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return h7.c.a(new p("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // lc.v0
    public final void i(lc.v vVar, boolean z14) {
        v vVar2 = this.f10131d;
        if (vVar2.V()) {
            return;
        }
        List list = (List) b().f111900e.f150540a.getValue();
        int iIndexOf = list.indexOf(vVar);
        List listSubList = list.subList(iIndexOf, list.size());
        lc.v vVar3 = (lc.v) p13.h0.b0(list);
        lc.v vVar4 = (lc.v) p13.h0.e0(iIndexOf - 1, list);
        if (vVar4 != null) {
            k(this, vVar4.f111886f, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    k(this, ((lc.v) it3.next()).f111886f, 4);
                }
                if (z14) {
                    for (lc.v vVar5 : p13.h0.G0(listSubList)) {
                        if (s.g(vVar5, vVar3)) {
                            Objects.toString(vVar5);
                        } else {
                            vVar2.y(vVar2.new u(vVar5.f111886f), false);
                            this.f10133f.add(vVar5.f111886f);
                        }
                    }
                } else {
                    vVar2.a0(1, vVar.f111886f);
                }
                if (n()) {
                    vVar.toString();
                }
                b().e(vVar, z14);
                return;
            }
            Object next = it.next();
            lc.v vVar6 = (lc.v) next;
            c53.h0 h0VarO = c0.o(p13.h0.M(this.f10134g), new p40.h(4));
            String str = vVar6.f111886f;
            c53.h0.a aVar = new c53.h0.a(h0VarO);
            int i14 = 0;
            while (true) {
                if (!aVar.f24560a.hasNext()) {
                    i14 = -1;
                    break;
                }
                Object next2 = aVar.next();
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                if (s.g(str, next2)) {
                    break;
                } else {
                    i14++;
                }
            }
            if ((i14 >= 0) || !s.g(vVar6.f111886f, vVar3.f111886f)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(Fragment fragment, lc.v vVar, x0 x0Var) {
        fragment.getClass();
        x0Var.getClass();
        y1 viewModelStore = fragment.getF189591b();
        viewModelStore.getClass();
        u9.b bVar = new u9.b();
        p40.h hVar = new p40.h(5);
        t0 t0Var = s0.f105811a;
        bVar.a(t0Var.b(C0135a.class), hVar);
        ((C0135a) new x1(viewModelStore, bVar.b(), CreationExtras.b.f8056c).b(t0Var.b(C0135a.class))).f10137a = new WeakReference<>(new p40.o0(vVar, x0Var, this, fragment));
    }

    public final androidx.fragment.app.a m(lc.v vVar, o0 o0Var) {
        h0 h0Var = vVar.f111882b;
        h0Var.getClass();
        Bundle bundleA = vVar.f111888h.a();
        String str = ((c) h0Var).f10138g;
        if (str == null) {
            vb.h.z("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f10130c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        v vVar2 = this.f10131d;
        Fragment fragmentInstantiate = vVar2.P().instantiate(context.getClassLoader(), str);
        fragmentInstantiate.getClass();
        fragmentInstantiate.setArguments(bundleA);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar2);
        int i14 = o0Var != null ? o0Var.f111809f : -1;
        int i15 = o0Var != null ? o0Var.f111810g : -1;
        int i16 = o0Var != null ? o0Var.f111811h : -1;
        int i17 = o0Var != null ? o0Var.f111812i : -1;
        if (i14 != -1 || i15 != -1 || i16 != -1 || i17 != -1) {
            if (i14 == -1) {
                i14 = 0;
            }
            if (i15 == -1) {
                i15 = 0;
            }
            if (i16 == -1) {
                i16 = 0;
            }
            aVar.o(i14, i15, i16, i17 != -1 ? i17 : 0);
        }
        aVar.l(this.f10132e, fragmentInstantiate, vVar.f111886f);
        aVar.w(fragmentInstantiate);
        aVar.f7250r = true;
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_SAVED_IDS", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Landroidx/navigation/fragment/a$c;", "Llc/h0;", "Llc/v0;", "fragmentNavigator", "<init>", "(Llc/v0;)V", "Llc/w0;", "navigatorProvider", "(Llc/w0;)V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class c extends h0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f10138g;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var) {
            this((v0<? extends c>) w0Var.b(a.class));
            w0Var.getClass();
        }

        @Override // lc.h0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof c) && super.equals(obj) && s.g(this.f10138g, ((c) obj).f10138g);
        }

        @Override // lc.h0
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f10138g;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // lc.h0
        public final void i(Context context, AttributeSet attributeSet) {
            super.i(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, e.f137175b);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f10138g = string;
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainAttributes.recycle();
        }

        @Override // lc.h0
        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            sb3.append(" class=");
            String str = this.f10138g;
            if (str == null) {
                sb3.append(BuildConfig.TRAVIS);
            } else {
                sb3.append(str);
            }
            return sb3.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v0<? extends c> v0Var) {
            super(v0Var);
            v0Var.getClass();
        }
    }
}
