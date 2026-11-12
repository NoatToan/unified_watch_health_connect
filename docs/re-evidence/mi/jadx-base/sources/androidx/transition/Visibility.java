package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.amo;
import defpackage.byq;
import defpackage.d0q;
import defpackage.ed1;
import defpackage.p5q;
import defpackage.utq;
import defpackage.ypi;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    public int J;

    public class a extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3065b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f3064a = viewGroup;
            this.f3065b = view;
            this.c = view2;
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void a(Transition transition) {
            if (this.f3065b.getParent() == null) {
                utq.b(this.f3064a).c(this.f3065b);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void c(Transition transition) {
            utq.b(this.f3064a).d(this.f3065b);
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            this.c.setTag(ypi.d, null);
            utq.b(this.f3064a).d(this.f3065b);
            transition.W(this);
        }
    }

    public static class b extends AnimatorListenerAdapter implements Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3067b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.f3066a = view;
            this.f3067b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
            g(true);
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            f();
            transition.W(this);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }

        public final void f() {
            if (!this.f) {
                byq.i(this.f3066a, this.f3067b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            utq.d(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            byq.i(this.f3066a, this.f3067b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            byq.i(this.f3066a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3069b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public Visibility() {
        this.J = 3;
    }

    private void k0(d0q d0qVar) {
        d0qVar.f14937a.put("android:visibility:visibility", Integer.valueOf(d0qVar.f14938b.getVisibility()));
        d0qVar.f14937a.put("android:visibility:parent", d0qVar.f14938b.getParent());
        int[] iArr = new int[2];
        d0qVar.f14938b.getLocationOnScreen(iArr);
        d0qVar.f14937a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.Transition
    public String[] H() {
        return K;
    }

    @Override // androidx.transition.Transition
    public boolean J(d0q d0qVar, d0q d0qVar2) {
        if (d0qVar == null && d0qVar2 == null) {
            return false;
        }
        if (d0qVar != null && d0qVar2 != null && d0qVar2.f14937a.containsKey("android:visibility:visibility") != d0qVar.f14937a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM0 = m0(d0qVar, d0qVar2);
        if (cVarM0.f3068a) {
            return cVarM0.c == 0 || cVarM0.d == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public void g(d0q d0qVar) {
        k0(d0qVar);
    }

    @Override // androidx.transition.Transition
    public void j(d0q d0qVar) {
        k0(d0qVar);
    }

    public int l0() {
        return this.J;
    }

    public final c m0(d0q d0qVar, d0q d0qVar2) {
        c cVar = new c();
        cVar.f3068a = false;
        cVar.f3069b = false;
        if (d0qVar == null || !d0qVar.f14937a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) d0qVar.f14937a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) d0qVar.f14937a.get("android:visibility:parent");
        }
        if (d0qVar2 == null || !d0qVar2.f14937a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) d0qVar2.f14937a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) d0qVar2.f14937a.get("android:visibility:parent");
        }
        if (d0qVar != null && d0qVar2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f3069b = false;
                    cVar.f3068a = true;
                } else if (i2 == 0) {
                    cVar.f3069b = true;
                    cVar.f3068a = true;
                }
            } else if (cVar.f == null) {
                cVar.f3069b = false;
                cVar.f3068a = true;
            } else if (cVar.e == null) {
                cVar.f3069b = true;
                cVar.f3068a = true;
            }
        } else if (d0qVar == null && cVar.d == 0) {
            cVar.f3069b = true;
            cVar.f3068a = true;
        } else if (d0qVar2 == null && cVar.c == 0) {
            cVar.f3069b = false;
            cVar.f3068a = true;
        }
        return cVar;
    }

    public Animator n0(ViewGroup viewGroup, d0q d0qVar, int i, d0q d0qVar2, int i2) {
        if ((this.J & 1) != 1 || d0qVar2 == null) {
            return null;
        }
        if (d0qVar == null) {
            View view = (View) d0qVar2.f14938b.getParent();
            if (m0(w(view, false), I(view, false)).f3068a) {
                return null;
            }
        }
        return p0(viewGroup, d0qVar2.f14938b, d0qVar, d0qVar2);
    }

    @Override // androidx.transition.Transition
    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        c cVarM0 = m0(d0qVar, d0qVar2);
        if (!cVarM0.f3068a) {
            return null;
        }
        if (cVarM0.e == null && cVarM0.f == null) {
            return null;
        }
        return cVarM0.f3069b ? n0(viewGroup, d0qVar, cVarM0.c, d0qVar2, cVarM0.d) : q0(viewGroup, d0qVar, cVarM0.c, d0qVar2, cVarM0.d);
    }

    public Animator p0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator q0(ViewGroup viewGroup, d0q d0qVar, int i, d0q d0qVar2, int i2) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.J & 2) != 2 || d0qVar == null) {
            return null;
        }
        View view3 = d0qVar.f14938b;
        View viewA = d0qVar2 != null ? d0qVar2.f14938b : null;
        View view4 = (View) view3.getTag(ypi.d);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z = false;
                } else {
                    viewA = null;
                    view = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == viewA) {
                view = viewA;
                z = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m0(I(view5, true), w(view5, true)).f3068a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.v) {
                            }
                        } else {
                            viewA = d.a(viewGroup, view3, view5);
                        }
                    }
                    z2 = false;
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                View view7 = view;
                view4 = viewA;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            byq.i(view2, 0);
            Animator animatorR0 = r0(viewGroup, view2, d0qVar, d0qVar2);
            if (animatorR0 != null) {
                b bVar = new b(view2, i2, true);
                animatorR0.addListener(bVar);
                ed1.a(animatorR0, bVar);
                a(bVar);
            } else {
                byq.i(view2, visibility);
            }
            return animatorR0;
        }
        if (!z2) {
            int[] iArr = (int[]) d0qVar.f14937a.get("android:visibility:screenLocation");
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            utq.b(viewGroup).c(view4);
        }
        Animator animatorR1 = r0(viewGroup, view4, d0qVar, d0qVar2);
        if (!z2) {
            if (animatorR1 == null) {
                utq.b(viewGroup).d(view4);
            } else {
                view3.setTag(ypi.d, view4);
                a(new a(viewGroup, view4, view3));
            }
        }
        return animatorR1;
    }

    public Animator r0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        return null;
    }

    public void s0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.J = i;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.e);
        int iK = p5q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            s0(iK);
        }
    }
}
