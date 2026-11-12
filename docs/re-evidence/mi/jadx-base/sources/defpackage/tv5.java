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

/* JADX INFO: loaded from: classes8.dex */
public class tv5 extends w {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.d0> h = new ArrayList<>();
    public ArrayList<RecyclerView.d0> i = new ArrayList<>();
    public ArrayList<j> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<i> f35074k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    public ArrayList<ArrayList<j>> m = new ArrayList<>();
    public ArrayList<ArrayList<i>> n = new ArrayList<>();
    public ArrayList<RecyclerView.d0> o = new ArrayList<>();
    public ArrayList<RecyclerView.d0> p = new ArrayList<>();
    public ArrayList<RecyclerView.d0> q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f35075r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35076a;

        public a(ArrayList arrayList) {
            this.f35076a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f35076a) {
                tv5.this.Y(jVar.f35094a, jVar.f35095b, jVar.c, jVar.d, jVar.e);
            }
            this.f35076a.clear();
            tv5.this.m.remove(this.f35076a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35078a;

        public b(ArrayList arrayList) {
            this.f35078a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f35078a.iterator();
            while (it.hasNext()) {
                tv5.this.X((i) it.next());
            }
            this.f35078a.clear();
            tv5.this.n.remove(this.f35078a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35080a;

        public c(ArrayList arrayList) {
            this.f35080a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f35080a.iterator();
            while (it.hasNext()) {
                tv5.this.W((RecyclerView.d0) it.next());
            }
            this.f35080a.clear();
            tv5.this.l.remove(this.f35080a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f35082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f35083b;
        public final /* synthetic */ View c;

        public d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f35082a = d0Var;
            this.f35083b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35083b.setListener(null);
            this.c.setAlpha(1.0f);
            tv5.this.L(this.f35082a);
            tv5.this.q.remove(this.f35082a);
            tv5.this.b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tv5.this.M(this.f35082a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f35084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f35085b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f35084a = d0Var;
            this.f35085b = view;
            this.c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35085b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            tv5.this.F(this.f35084a);
            tv5.this.o.remove(this.f35084a);
            tv5.this.b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tv5.this.G(this.f35084a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f35086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35087b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f35086a = d0Var;
            this.f35087b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f35087b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            tv5.this.J(this.f35086a);
            tv5.this.p.remove(this.f35086a);
            tv5.this.b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tv5.this.K(this.f35086a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f35089b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f35088a = iVar;
            this.f35089b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35089b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            tv5.this.H(this.f35088a.f35092a, true);
            tv5.this.f35075r.remove(this.f35088a.f35092a);
            tv5.this.b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tv5.this.I(this.f35088a.f35092a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f35091b;
        public final /* synthetic */ View c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f35090a = iVar;
            this.f35091b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35091b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            tv5.this.H(this.f35090a.f35093b, false);
            tv5.this.f35075r.remove(this.f35090a.f35093b);
            tv5.this.b0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tv5.this.I(this.f35090a.f35093b, false);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f35094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35095b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f35094a = d0Var;
            this.f35095b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void Z(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void c0(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (e0(iVar, d0Var) && iVar.f35092a == null && iVar.f35093b == null) {
                list.remove(iVar);
            }
        }
    }

    private void f0(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(s);
        j(d0Var);
    }

    @Override // androidx.recyclerview.widget.w
    public boolean B(RecyclerView.d0 d0Var) {
        f0(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        View view = d0Var.itemView;
        view.setTranslationX(view.getWidth());
        this.i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean C(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return D(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        f0(d0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            f0(d0Var2);
            d0Var2.itemView.setTranslationX(-i6);
            d0Var2.itemView.setTranslationY(-i7);
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.f35074k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean D(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.itemView.getTranslationY());
        f0(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            J(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean E(RecyclerView.d0 d0Var) {
        f0(d0Var);
        this.h.add(d0Var);
        return true;
    }

    public void W(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.o.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).translationX(0.0f).setDuration(l()).setListener(new e(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f35092a;
        View view = d0Var == null ? null : d0Var.itemView;
        RecyclerView.d0 d0Var2 = iVar.f35093b;
        View view2 = d0Var2 != null ? d0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f35075r.add(iVar.f35092a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f35075r.add(iVar.f35093b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void Y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    public void a0(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void b0() {
        if (p()) {
            return;
        }
        i();
    }

    public final void d0(i iVar) {
        RecyclerView.d0 d0Var = iVar.f35092a;
        if (d0Var != null) {
            e0(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f35093b;
        if (d0Var2 != null) {
            e0(iVar, d0Var2);
        }
    }

    public final boolean e0(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.f35093b == d0Var) {
            iVar.f35093b = null;
        } else {
            if (iVar.f35092a != d0Var) {
                return false;
            }
            iVar.f35092a = null;
            z = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        H(d0Var, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.j.get(size).f35094a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                J(d0Var);
                this.j.remove(size);
            }
        }
        c0(this.f35074k, d0Var);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            L(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            F(d0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            c0(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f35094a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
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
                view.setAlpha(1.0f);
                F(d0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.f35075r.remove(d0Var);
        this.p.remove(d0Var);
        b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.f35094a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            J(jVar.f35094a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            L(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.i.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            F(d0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.f35074k.size() - 1; size4 >= 0; size4--) {
            d0(this.f35074k.get(size4));
        }
        this.f35074k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f35094a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    J(jVar2.f35094a);
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
                    d0Var2.itemView.setAlpha(1.0f);
                    F(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    d0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            a0(this.q);
            a0(this.p);
            a0(this.o);
            a0(this.f35075r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.i.isEmpty() && this.f35074k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.f35075r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.f35074k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.h.iterator();
            while (it.hasNext()) {
                Z(it.next());
            }
            this.h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    androidx.core.view.c.j0(arrayList.get(0).f35094a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f35074k);
                this.n.add(arrayList2);
                this.f35074k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    androidx.core.view.c.j0(arrayList2.get(0).f35092a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    androidx.core.view.c.j0(arrayList3.get(0).itemView, cVar, (z ? o() : 0L) + Math.max(z2 ? n() : 0L, z3 ? m() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f35092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f35093b;
        public int c;
        public int d;
        public int e;
        public int f;

        public i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f35092a = d0Var;
            this.f35093b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f35092a + ", newHolder=" + this.f35093b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + AbstractJsonLexerKt.END_OBJ;
        }

        public i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
