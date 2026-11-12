package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends l0 {

    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f7270a;

        public a(i0 i0Var, Rect rect) {
            this.f7270a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f7270a;
        }
    }

    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7272b;

        public b(i0 i0Var, View view2, ArrayList arrayList) {
            this.f7271a = view2;
            this.f7272b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f7271a.setVisibility(8);
            ArrayList arrayList = this.f7272b;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((View) arrayList.get(i14)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f7273a;

        public c(i0 i0Var, Runnable runnable) {
            this.f7273a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            this.f7273a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    public class d extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f7274a;

        public d(i0 i0Var, Rect rect) {
            this.f7274a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f7274a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean z(Transition transition) {
        return (l0.k(transition.getTargetIds()) && l0.k(transition.getTargetNames()) && l0.k(transition.getTargetTypes())) ? false : true;
    }

    public final void A(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i14 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i14 < transitionCount) {
                A(transitionSet.getTransitionAt(i14), arrayList, arrayList2);
                i14++;
            }
            return;
        }
        if (z(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i14 < size) {
            transition.addTarget(arrayList2.get(i14));
            i14++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.l0
    public final void a(View view2, Object obj) {
        ((Transition) obj).addTarget(view2);
    }

    @Override // androidx.fragment.app.l0
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i14 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i14 < transitionCount) {
                b(transitionSet.getTransitionAt(i14), arrayList);
                i14++;
            }
            return;
        }
        if (z(transition) || !l0.k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i14 < size) {
            transition.addTarget(arrayList.get(i14));
            i14++;
        }
    }

    @Override // androidx.fragment.app.l0
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.l0
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.l0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.l0
    public final boolean l() {
        return false;
    }

    @Override // androidx.fragment.app.l0
    public final boolean m(Object obj) {
        if (!v.R(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // androidx.fragment.app.l0
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.l0
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.l0
    public final void p(Object obj, View view2, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view2, arrayList));
    }

    @Override // androidx.fragment.app.l0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new j0(this, obj2, arrayList, null, null, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.l0
    public final void s(View view2, Object obj) {
        if (view2 != null) {
            Rect rect = new Rect();
            l0.j(rect, view2);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.l0
    public final void t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new d(this, rect));
    }

    @Override // androidx.fragment.app.l0
    public final void u(Fragment fragment, Object obj, h7.d dVar, Runnable runnable) {
        ((Transition) obj).addListener(new c(this, runnable));
    }

    @Override // androidx.fragment.app.l0
    public final void w(Object obj, View view2, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            l0.f(arrayList.get(i14), targets);
        }
        targets.add(view2);
        arrayList.add(view2);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.l0
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.l0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
