package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import defpackage.eel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Transition f3082a = new AutoTransition();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f3083b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Transition f3084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f3085b;

        /* JADX INFO: renamed from: androidx.transition.c$a$a, reason: collision with other inner class name */
        public class C0079a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayMap f3086a;

            public C0079a(ArrayMap arrayMap) {
                this.f3086a = arrayMap;
            }

            @Override // androidx.transition.Transition.f
            public void d(Transition transition) {
                ((ArrayList) this.f3086a.get(a.this.f3085b)).remove(transition);
                transition.W(this);
            }
        }

        public a(Transition transition, ViewGroup viewGroup) {
            this.f3084a = transition;
            this.f3085b = viewGroup;
        }

        public final void a() {
            this.f3085b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3085b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!c.c.remove(this.f3085b)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> arrayMapC = c.c();
            ArrayList<Transition> arrayList = arrayMapC.get(this.f3085b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                arrayMapC.put(this.f3085b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3084a);
            this.f3084a.a(new C0079a(arrayMapC));
            this.f3084a.k(this.f3085b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).Y(this.f3085b);
                }
            }
            this.f3084a.V(this.f3085b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            c.c.remove(this.f3085b);
            ArrayList<Transition> arrayList = c.c().get(this.f3085b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Y(this.f3085b);
                }
            }
            this.f3084a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, Transition transition) {
        if (c.contains(viewGroup) || !androidx.core.view.c.U(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (transition == null) {
            transition = f3082a;
        }
        Transition transitionClone = transition.clone();
        e(viewGroup, transitionClone);
        eel.c(viewGroup, null);
        d(viewGroup, transitionClone);
    }

    public static ArrayMap<ViewGroup, ArrayList<Transition>> c() {
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = f3083b.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap2 = new ArrayMap<>();
        f3083b.set(new WeakReference<>(arrayMap2));
        return arrayMap2;
    }

    public static void d(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().U(viewGroup);
            }
        }
        if (transition != null) {
            transition.k(viewGroup, true);
        }
        eel eelVarB = eel.b(viewGroup);
        if (eelVarB != null) {
            eelVarB.a();
        }
    }
}
