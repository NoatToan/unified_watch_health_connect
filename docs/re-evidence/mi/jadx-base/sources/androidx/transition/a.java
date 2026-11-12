package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import defpackage.fla;
import defpackage.si3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a extends fla {

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public class C0078a extends Transition.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f3070a;

        public C0078a(Rect rect) {
            this.f3070a = rect;
        }

        @Override // androidx.transition.Transition.e
        public Rect a(Transition transition) {
            return this.f3070a;
        }
    }

    public class b implements Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3073b;

        public b(View view, ArrayList arrayList) {
            this.f3072a = view;
            this.f3073b = arrayList;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
            transition.W(this);
            transition.a(this);
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            transition.W(this);
            this.f3072a.setVisibility(8);
            int size = this.f3073b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3073b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }
    }

    public class c extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f3074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3075b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3074a = obj;
            this.f3075b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void b(Transition transition) {
            Object obj = this.f3074a;
            if (obj != null) {
                a.this.w(obj, this.f3075b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                a.this.w(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                a.this.w(obj3, this.f, null);
            }
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            transition.W(this);
        }
    }

    public class d implements si3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f3076a;

        public d(Transition transition) {
            this.f3076a = transition;
        }

        @Override // si3.a
        public void onCancel() {
            this.f3076a.cancel();
        }
    }

    public class e implements Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3078a;

        public e(Runnable runnable) {
            this.f3078a = runnable;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            this.f3078a.run();
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }
    }

    public class f extends Transition.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f3080a;

        public f(Rect rect) {
            this.f3080a = rect;
        }

        @Override // androidx.transition.Transition.e
        public Rect a(Transition transition) {
            Rect rect = this.f3080a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3080a;
        }
    }

    public static boolean v(Transition transition) {
        return (fla.i(transition.C()) && fla.i(transition.D()) && fla.i(transition.F())) ? false : true;
    }

    @Override // defpackage.fla
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).b(view);
        }
    }

    @Override // defpackage.fla
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iQ0 = transitionSet.q0();
            while (i < iQ0) {
                b(transitionSet.p0(i), arrayList);
                i++;
            }
            return;
        }
        if (v(transition) || !fla.i(transition.G())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.b(arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.fla
    public void c(ViewGroup viewGroup, Object obj) {
        androidx.transition.c.b(viewGroup, (Transition) obj);
    }

    @Override // defpackage.fla
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.fla
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.fla
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transitionV0 = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionV0 != null && transition != null) {
            transitionV0 = new TransitionSet().m0(transitionV0).m0(transition).v0(1);
        } else if (transitionV0 == null) {
            transitionV0 = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionV0;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionV0 != null) {
            transitionSet.m0(transitionV0);
        }
        transitionSet.m0(transition2);
        return transitionSet;
    }

    @Override // defpackage.fla
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // defpackage.fla
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new b(view, arrayList));
    }

    @Override // defpackage.fla
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.fla
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).c0(new f(rect));
        }
    }

    @Override // defpackage.fla
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).c0(new C0078a(rect));
        }
    }

    @Override // defpackage.fla
    public void q(Fragment fragment, Object obj, si3 si3Var, Runnable runnable) {
        Transition transition = (Transition) obj;
        si3Var.setOnCancelListener(new d(transition));
        transition.a(new e(runnable));
    }

    @Override // defpackage.fla
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> listG = transitionSet.G();
        listG.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fla.d(listG, arrayList.get(i));
        }
        listG.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.fla
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.G().clear();
            transitionSet.G().addAll(arrayList2);
            w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.fla
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m0((Transition) obj);
        return transitionSet;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iQ0 = transitionSet.q0();
            while (i < iQ0) {
                w(transitionSet.p0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (v(transition)) {
            return;
        }
        List<View> listG = transition.G();
        if (listG.size() == arrayList.size() && listG.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.b(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.X(arrayList.get(size2));
            }
        }
    }
}
