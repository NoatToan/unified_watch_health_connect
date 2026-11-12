package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class fm3 extends w {
    public static TimeInterpolator s;
    public static final TimeInterpolator t = new EaseManager.SpringInterpolator().setDamping(0.9f).setResponse(0.3f).setDuration(300);
    public final ArrayList<RecyclerView.d0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> i = new ArrayList<>();
    public final ArrayList<g> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<f> f17909k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<g>> m = new ArrayList<>();
    public final ArrayList<ArrayList<f>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.d0> f17910r = new ArrayList<>();

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f17911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f17912b;
        public final /* synthetic */ View c;

        public a(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17911a = d0Var;
            this.f17912b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17912b.setListener(null);
            this.c.setAlpha(1.0f);
            fm3.this.L(this.f17911a);
            fm3.this.q.remove(this.f17911a);
            fm3.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fm3.this.M(this.f17911a);
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f17913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f17914b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public b(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17913a = d0Var;
            this.f17914b = view;
            this.c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17914b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            fm3.this.F(this.f17913a);
            fm3.this.o.remove(this.f17913a);
            fm3.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fm3.this.G(this.f17913a);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f17915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17916b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public c(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17915a = d0Var;
            this.f17916b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f17916b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            fm3.this.J(this.f17915a);
            fm3.this.p.remove(this.f17915a);
            fm3.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fm3.this.K(this.f17915a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f17917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f17918b;
        public final /* synthetic */ View c;

        public d(f fVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17917a = fVar;
            this.f17918b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17918b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            fm3.this.H(this.f17917a.f17921a, true);
            fm3.this.f17910r.remove(this.f17917a.f17921a);
            fm3.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fm3.this.I(this.f17917a.f17921a, true);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f17919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f17920b;
        public final /* synthetic */ View c;

        public e(f fVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17919a = fVar;
            this.f17920b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17920b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            fm3.this.H(this.f17919a.f17922b, false);
            fm3.this.f17910r.remove(this.f17919a.f17922b);
            fm3.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fm3.this.I(this.f17919a.f17922b, false);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f17923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17924b;
        public int c;
        public int d;
        public int e;

        public g(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f17923a = d0Var;
            this.f17924b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public fm3() {
        w(300L);
        A(300L);
        z(300L);
        x(300L);
    }

    private void j0(List<f> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            f fVar = list.get(size);
            if (l0(fVar, d0Var) && fVar.f17921a == null && fVar.f17922b == null) {
                list.remove(fVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.w
    public boolean B(RecyclerView.d0 d0Var) {
        t0(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean C(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return D(d0Var, i3, i2, i3, i4);
        }
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        t0(d0Var);
        int i5 = (int) ((i4 - i2) - translationY);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            t0(d0Var2);
            d0Var2.itemView.setTranslationY(-i5);
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.f17909k.add(new f(d0Var, d0Var2, i3, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean D(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.itemView.getTranslationY());
        t0(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            J(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new g(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean E(RecyclerView.d0 d0Var) {
        t0(d0Var);
        this.h.add(d0Var);
        return true;
    }

    public void d0(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.o.add(d0Var);
        viewPropertyAnimatorAnimate.setInterpolator(t);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new b(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void e0(f fVar) {
        RecyclerView.d0 d0Var = fVar.f17921a;
        View view = d0Var == null ? null : d0Var.itemView;
        RecyclerView.d0 d0Var2 = fVar.f17922b;
        View view2 = d0Var2 != null ? d0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f17910r.add(fVar.f17921a);
            duration.setInterpolator(t);
            float f2 = fVar.e - fVar.c;
            float f3 = fVar.f - fVar.d;
            duration.translationX(f2);
            duration.translationY(f3);
            duration.alpha(0.0f).setListener(new d(fVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f17910r.add(fVar.f17922b);
            viewPropertyAnimatorAnimate.setInterpolator(t);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new e(fVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void f0(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(d0Var);
        viewPropertyAnimatorAnimate.setInterpolator(t);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new c(d0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    public void g0(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(d0Var);
        viewPropertyAnimatorAnimate.setInterpolator(t);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new a(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void h0(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void i0() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        for (int size = this.j.size() - 1; size >= 0; size--) {
            if (this.j.get(size).f17923a == d0Var) {
                s0(d0Var);
                J(d0Var);
                this.j.remove(size);
            }
        }
        j0(this.f17909k, d0Var);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            L(d0Var);
        }
        if (this.i.remove(d0Var)) {
            r0(d0Var);
            F(d0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<f> arrayList = this.n.get(size2);
            j0(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<g> arrayList2 = this.m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f17923a == d0Var) {
                    q0(d0Var);
                    J(d0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(d0Var)) {
                p0(d0Var);
                F(d0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.f17910r.remove(d0Var);
        this.p.remove(d0Var);
        i0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            g gVar = this.j.get(size);
            s0(gVar.f17923a);
            J(gVar.f17923a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            L(this.h.get(size2));
            this.h.remove(size2);
        }
        for (int size3 = this.i.size() - 1; size3 >= 0; size3--) {
            RecyclerView.d0 d0Var = this.i.get(size3);
            r0(d0Var);
            F(d0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.f17909k.size() - 1; size4 >= 0; size4--) {
            k0(this.f17909k.get(size4));
        }
        this.f17909k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList<g> arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = arrayList.get(size6);
                    q0(gVar2.f17923a);
                    J(gVar2.f17923a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    p0(d0Var2);
                    F(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<f> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    k0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            h0(this.q);
            h0(this.p);
            h0(this.o);
            h0(this.f17910r);
            i();
        }
    }

    public final void k0(f fVar) {
        if (fVar.f17921a != null) {
            l0(fVar, fVar.f17921a);
        }
        if (fVar.f17922b != null) {
            l0(fVar, fVar.f17922b);
        }
    }

    public final boolean l0(f fVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (fVar.f17922b == d0Var) {
            fVar.f17922b = null;
        } else {
            if (fVar.f17921a != d0Var) {
                return false;
            }
            fVar.f17921a = null;
            z = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        H(d0Var, z);
        return true;
    }

    public final /* synthetic */ void m0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            f0(gVar.f17923a, gVar.f17924b, gVar.c, gVar.d, gVar.e);
        }
        arrayList.clear();
        this.m.remove(arrayList);
    }

    public final /* synthetic */ void n0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e0((f) it.next());
        }
        arrayList.clear();
        this.n.remove(arrayList);
    }

    public final /* synthetic */ void o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d0((RecyclerView.d0) it.next());
        }
        arrayList.clear();
        this.l.remove(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.i.isEmpty() && this.f17909k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.f17910r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public void p0(RecyclerView.d0 d0Var) {
        d0Var.itemView.setAlpha(1.0f);
    }

    public void q0(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
    }

    public void r0(RecyclerView.d0 d0Var) {
        d0Var.itemView.setAlpha(1.0f);
    }

    public void s0(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
    }

    public void t0(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(s);
        j(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.f17909k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.h.iterator();
            while (it.hasNext()) {
                g0(it.next());
            }
            this.h.clear();
            if (z2) {
                final ArrayList<g> arrayList = new ArrayList<>();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                Runnable runnable = new Runnable() { // from class: cm3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5475a.m0(arrayList);
                    }
                };
                if (z) {
                    androidx.core.view.c.j0(arrayList.get(0).f17923a.itemView, runnable, 100L);
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<f> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f17909k);
                this.n.add(arrayList2);
                this.f17909k.clear();
                Runnable runnable2 = new Runnable() { // from class: dm3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15676a.n0(arrayList2);
                    }
                };
                if (z) {
                    androidx.core.view.c.j0(arrayList2.get(0).f17921a.itemView, runnable2, 100L);
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                Runnable runnable3 = new Runnable() { // from class: em3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16798a.o0(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    androidx.core.view.c.j0(arrayList3.get(0).itemView, runnable3, (z ? 100L : 0L) + ((z2 || z3) ? 50L : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f17921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f17922b;
        public int c;
        public int d;
        public int e;
        public int f;

        public f(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f17921a = d0Var;
            this.f17922b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f17921a + ", newHolder=" + this.f17922b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + AbstractJsonLexerKt.END_OBJ;
        }

        public f(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
