package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.amo;
import defpackage.byq;
import defpackage.d0q;
import defpackage.dza;
import defpackage.ed1;
import defpackage.hza;
import defpackage.nx9;
import defpackage.p5q;
import defpackage.rdi;
import defpackage.x8f;
import defpackage.ypi;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {
    public static final String[] M = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property<e, float[]> N = new a(float[].class, "nonTranslations");
    public static final Property<e, PointF> O = new b(PointF.class, "translations");
    public static final boolean P = true;
    public boolean J;
    public boolean K;
    public Matrix L;

    public class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    public class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Matrix f3039b = new Matrix();
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Matrix d;
        public final /* synthetic */ View e;
        public final /* synthetic */ f f;
        public final /* synthetic */ e g;

        public c(boolean z, Matrix matrix, View view, f fVar, e eVar) {
            this.c = z;
            this.d = matrix;
            this.e = view;
            this.f = fVar;
            this.g = eVar;
        }

        public final void a(Matrix matrix) {
            this.f3039b.set(matrix);
            this.e.setTag(ypi.g, this.f3039b);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3038a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3038a) {
                if (this.c && ChangeTransform.this.J) {
                    a(this.d);
                } else {
                    this.e.setTag(ypi.g, null);
                    this.e.setTag(ypi.c, null);
                }
            }
            byq.f(this.e, null);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.p0(this.e);
        }
    }

    public static class d extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f3040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public dza f3041b;

        public d(View view, dza dzaVar) {
            this.f3040a = view;
            this.f3041b = dzaVar;
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void a(Transition transition) {
            this.f3041b.setVisibility(0);
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void c(Transition transition) {
            this.f3041b.setVisibility(4);
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            transition.W(this);
            hza.b(this.f3040a);
            this.f3040a.setTag(ypi.g, null);
            this.f3040a.setTag(ypi.c, null);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f3042a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f3043b;
        public final float[] c;
        public float d;
        public float e;

        public e(View view, float[] fArr) {
            this.f3043b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        public Matrix a() {
            return this.f3042a;
        }

        public final void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.f3042a.setValues(fArr);
            byq.f(this.f3043b, this.f3042a);
        }

        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f3044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f3045b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.f3044a = view.getTranslationX();
            this.f3045b = view.getTranslationY();
            this.c = androidx.core.view.c.K(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.r0(view, this.f3044a, this.f3045b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f3044a == this.f3044a && fVar.f3045b == this.f3045b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
        }

        public int hashCode() {
            float f = this.f3044a;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f3045b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public ChangeTransform() {
        this.J = true;
        this.K = true;
        this.L = new Matrix();
    }

    private void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        if (view.getVisibility() == 8) {
            return;
        }
        d0qVar.f14937a.put("android:changeTransform:parent", view.getParent());
        d0qVar.f14937a.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        d0qVar.f14937a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.K) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            byq.j(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            d0qVar.f14937a.put("android:changeTransform:parentMatrix", matrix2);
            d0qVar.f14937a.put("android:changeTransform:intermediateMatrix", view.getTag(ypi.g));
            d0qVar.f14937a.put("android:changeTransform:intermediateParentMatrix", view.getTag(ypi.c));
        }
    }

    public static void p0(View view) {
        r0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void r0(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        androidx.core.view.c.P0(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    @Override // androidx.transition.Transition
    public String[] H() {
        return M;
    }

    @Override // androidx.transition.Transition
    public void g(d0q d0qVar) {
        k0(d0qVar);
    }

    @Override // androidx.transition.Transition
    public void j(d0q d0qVar) {
        k0(d0qVar);
        if (P) {
            return;
        }
        ((ViewGroup) d0qVar.f14938b.getParent()).startViewTransition(d0qVar.f14938b);
    }

    public final void l0(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        View view = d0qVar2.f14938b;
        Matrix matrix = new Matrix((Matrix) d0qVar2.f14937a.get("android:changeTransform:parentMatrix"));
        byq.k(viewGroup, matrix);
        dza dzaVarA = hza.a(view, viewGroup, matrix);
        if (dzaVarA == null) {
            return;
        }
        dzaVarA.a((ViewGroup) d0qVar.f14937a.get("android:changeTransform:parent"), d0qVar.f14938b);
        Transition transition = this;
        while (true) {
            TransitionSet transitionSet = transition.f3055r;
            if (transitionSet == null) {
                break;
            } else {
                transition = transitionSet;
            }
        }
        transition.a(new d(view, dzaVarA));
        if (P) {
            View view2 = d0qVar.f14938b;
            if (view2 != d0qVar2.f14938b) {
                byq.h(view2, 0.0f);
            }
            byq.h(view, 1.0f);
        }
    }

    public final ObjectAnimator m0(d0q d0qVar, d0q d0qVar2, boolean z) {
        Matrix matrix = (Matrix) d0qVar.f14937a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) d0qVar2.f14937a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = x8f.f38848a;
        }
        if (matrix2 == null) {
            matrix2 = x8f.f38848a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) d0qVar2.f14937a.get("android:changeTransform:transforms");
        View view = d0qVar2.f14938b;
        p0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(N, new nx9(new float[9]), fArr, fArr2), rdi.a(O, y().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z, matrix3, view, fVar, eVar);
        objectAnimatorOfPropertyValuesHolder.addListener(cVar);
        ed1.a(objectAnimatorOfPropertyValuesHolder, cVar);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public final boolean n0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (L(viewGroup) && L(viewGroup2)) {
            d0q d0qVarW = w(viewGroup, true);
            if (d0qVarW == null) {
                return false;
            }
            if (viewGroup2 != d0qVarW.f14938b) {
                z = false;
            }
        } else if (viewGroup != viewGroup2) {
            z = false;
        }
        return z;
    }

    @Override // androidx.transition.Transition
    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        if (d0qVar == null || d0qVar2 == null || !d0qVar.f14937a.containsKey("android:changeTransform:parent") || !d0qVar2.f14937a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) d0qVar.f14937a.get("android:changeTransform:parent");
        boolean z = this.K && !n0(viewGroup2, (ViewGroup) d0qVar2.f14937a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) d0qVar.f14937a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            d0qVar.f14937a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) d0qVar.f14937a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            d0qVar.f14937a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            q0(d0qVar, d0qVar2);
        }
        ObjectAnimator objectAnimatorM0 = m0(d0qVar, d0qVar2, z);
        if (z && objectAnimatorM0 != null && this.J) {
            l0(viewGroup, d0qVar, d0qVar2);
        } else if (!P) {
            viewGroup2.endViewTransition(d0qVar.f14938b);
        }
        return objectAnimatorM0;
    }

    public final void q0(d0q d0qVar, d0q d0qVar2) {
        Matrix matrix = (Matrix) d0qVar2.f14937a.get("android:changeTransform:parentMatrix");
        d0qVar2.f14938b.setTag(ypi.c, matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) d0qVar.f14937a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            d0qVar.f14937a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) d0qVar.f14937a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = true;
        this.K = true;
        this.L = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.J = p5q.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.K = p5q.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
