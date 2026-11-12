package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import defpackage.a0q;
import defpackage.amo;
import defpackage.d0q;
import defpackage.f0q;
import defpackage.p5q;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {
    public ArrayList<Transition> J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;

    public class a extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f3061a;

        public a(Transition transition) {
            this.f3061a = transition;
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            this.f3061a.a0();
            transition.W(this);
        }
    }

    public static class b extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransitionSet f3063a;

        public b(TransitionSet transitionSet) {
            this.f3063a = transitionSet;
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void b(Transition transition) {
            TransitionSet transitionSet = this.f3063a;
            if (transitionSet.M) {
                return;
            }
            transitionSet.i0();
            this.f3063a.M = true;
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            TransitionSet transitionSet = this.f3063a;
            int i = transitionSet.L - 1;
            transitionSet.L = i;
            if (i == 0) {
                transitionSet.M = false;
                transitionSet.r();
            }
            transition.W(this);
        }
    }

    public TransitionSet() {
        this.J = new ArrayList<>();
        this.K = true;
        this.M = false;
        this.N = 0;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void U(View view) {
        super.U(view);
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).U(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void Y(View view) {
        super.Y(view);
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).Y(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void a0() {
        if (this.J.isEmpty()) {
            i0();
            r();
            return;
        }
        x0();
        if (this.K) {
            Iterator<Transition> it = this.J.iterator();
            while (it.hasNext()) {
                it.next().a0();
            }
            return;
        }
        for (int i = 1; i < this.J.size(); i++) {
            this.J.get(i - 1).a(new a(this.J.get(i)));
        }
        Transition transition = this.J.get(0);
        if (transition != null) {
            transition.a0();
        }
    }

    @Override // androidx.transition.Transition
    public void c0(Transition.e eVar) {
        super.c0(eVar);
        this.N |= 8;
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).c0(eVar);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void f0(PathMotion pathMotion) {
        super.f0(pathMotion);
        this.N |= 4;
        if (this.J != null) {
            for (int i = 0; i < this.J.size(); i++) {
                this.J.get(i).f0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void g(d0q d0qVar) {
        if (L(d0qVar.f14938b)) {
            for (Transition transition : this.J) {
                if (transition.L(d0qVar.f14938b)) {
                    transition.g(d0qVar);
                    d0qVar.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void g0(a0q a0qVar) {
        super.g0(a0qVar);
        this.N |= 2;
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).g0(a0qVar);
        }
    }

    @Override // androidx.transition.Transition
    public void i(d0q d0qVar) {
        super.i(d0qVar);
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            this.J.get(i).i(d0qVar);
        }
    }

    @Override // androidx.transition.Transition
    public void j(d0q d0qVar) {
        if (L(d0qVar.f14938b)) {
            for (Transition transition : this.J) {
                if (transition.L(d0qVar.f14938b)) {
                    transition.j(d0qVar);
                    d0qVar.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public String j0(String str) {
        String strJ0 = super.j0(str);
        for (int i = 0; i < this.J.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strJ0);
            sb.append("\n");
            sb.append(this.J.get(i).j0(str + "  "));
            strJ0 = sb.toString();
        }
        return strJ0;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public TransitionSet a(Transition.f fVar) {
        return (TransitionSet) super.a(fVar);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public TransitionSet b(View view) {
        for (int i = 0; i < this.J.size(); i++) {
            this.J.get(i).b(view);
        }
        return (TransitionSet) super.b(view);
    }

    public TransitionSet m0(Transition transition) {
        n0(transition);
        long j = this.c;
        if (j >= 0) {
            transition.b0(j);
        }
        if ((this.N & 1) != 0) {
            transition.d0(v());
        }
        if ((this.N & 2) != 0) {
            transition.g0(z());
        }
        if ((this.N & 4) != 0) {
            transition.f0(y());
        }
        if ((this.N & 8) != 0) {
            transition.c0(u());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: n */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.J = new ArrayList<>();
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            transitionSet.n0(this.J.get(i).clone());
        }
        return transitionSet;
    }

    public final void n0(Transition transition) {
        this.J.add(transition);
        transition.f3055r = this;
    }

    public Transition p0(int i) {
        if (i < 0 || i >= this.J.size()) {
            return null;
        }
        return this.J.get(i);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void q(ViewGroup viewGroup, f0q f0qVar, f0q f0qVar2, ArrayList<d0q> arrayList, ArrayList<d0q> arrayList2) {
        long jB = B();
        int size = this.J.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.J.get(i);
            if (jB > 0 && (this.K || i == 0)) {
                long jB2 = transition.B();
                if (jB2 > 0) {
                    transition.h0(jB2 + jB);
                } else {
                    transition.h0(jB);
                }
            }
            transition.q(viewGroup, f0qVar, f0qVar2, arrayList, arrayList2);
        }
    }

    public int q0() {
        return this.J.size();
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public TransitionSet W(Transition.f fVar) {
        return (TransitionSet) super.W(fVar);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public TransitionSet X(View view) {
        for (int i = 0; i < this.J.size(); i++) {
            this.J.get(i).X(view);
        }
        return (TransitionSet) super.X(view);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public TransitionSet b0(long j) {
        ArrayList<Transition> arrayList;
        super.b0(j);
        if (this.c >= 0 && (arrayList = this.J) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.J.get(i).b0(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public TransitionSet d0(TimeInterpolator timeInterpolator) {
        this.N |= 1;
        ArrayList<Transition> arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.J.get(i).d0(timeInterpolator);
            }
        }
        return (TransitionSet) super.d0(timeInterpolator);
    }

    public TransitionSet v0(int i) {
        if (i == 0) {
            this.K = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.K = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public TransitionSet h0(long j) {
        return (TransitionSet) super.h0(j);
    }

    public final void x0() {
        b bVar = new b(this);
        Iterator<Transition> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.L = this.J.size();
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new ArrayList<>();
        this.K = true;
        this.M = false;
        this.N = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.i);
        v0(p5q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
