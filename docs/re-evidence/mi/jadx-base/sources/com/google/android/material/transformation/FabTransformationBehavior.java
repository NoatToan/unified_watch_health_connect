package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import defpackage.fj1;
import defpackage.i47;
import defpackage.iqi;
import defpackage.mv3;
import defpackage.p8f;
import defpackage.u4i;
import defpackage.u8g;
import defpackage.v8g;
import defpackage.wc1;
import defpackage.zc1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f8969b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.f8968a = z;
            this.f8969b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8968a) {
                return;
            }
            this.f8969b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8968a) {
                this.f8969b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8970a;

        public b(View view) {
            this.f8970a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8970a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f8972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Drawable f8973b;

        public c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f8972a = cVar;
            this.f8973b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8972a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8972a.setCircularRevealOverlayDrawable(this.f8973b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f8974a;

        public d(com.google.android.material.circularreveal.c cVar) {
            this.f8974a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.google.android.material.circularreveal.c.e revealInfo = this.f8974a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.f8974a.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u8g f8976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u4i f8977b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public abstract e A(Context context, boolean z);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet f(View view, View view2, boolean z, boolean z2) {
        e eVarA = A(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t(view, view2, z, z2, eVarA, arrayList, arrayList2);
        RectF rectF = this.d;
        y(view, view2, z, z2, eVarA, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        s(view, view2, z, eVarA, arrayList);
        v(view, view2, z, z2, eVarA, arrayList, arrayList2);
        u(view, view2, z, z2, eVarA, fWidth, fHeight, arrayList, arrayList2);
        r(view, view2, z, z2, eVarA, arrayList, arrayList2);
        q(view, view2, z, z2, eVarA, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        zc1.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    public final ViewGroup g(View view) {
        View viewFindViewById = view.findViewById(iqi.N);
        if (viewFindViewById != null) {
            return B(viewFindViewById);
        }
        return ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? B(((ViewGroup) view).getChildAt(0)) : B(view);
    }

    public final void h(View view, e eVar, v8g v8gVar, v8g v8gVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float fO = o(eVar, v8gVar, f, f3);
        float fO2 = o(eVar, v8gVar2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        p(view, rectF3);
        rectF3.offset(fO, fO2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void i(View view, RectF rectF) {
        p(view, rectF);
        rectF.offset(this.g, this.h);
    }

    public final Pair<v8g, v8g> j(float f, float f2, boolean z, e eVar) {
        v8g v8gVarH;
        v8g v8gVarH2;
        if (f == 0.0f || f2 == 0.0f) {
            v8gVarH = eVar.f8976a.h("translationXLinear");
            v8gVarH2 = eVar.f8976a.h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            v8gVarH = eVar.f8976a.h("translationXCurveDownwards");
            v8gVarH2 = eVar.f8976a.h("translationYCurveDownwards");
        } else {
            v8gVarH = eVar.f8976a.h("translationXCurveUpwards");
            v8gVarH2 = eVar.f8976a.h("translationYCurveUpwards");
        }
        return new Pair<>(v8gVarH, v8gVarH2);
    }

    public final float k(View view, View view2, u4i u4iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(-m(view, view2, u4iVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float l(View view, View view2, u4i u4iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(0.0f, -n(view, view2, u4iVar));
        return rectF.centerY() - rectF2.top;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public final float m(View view, View view2, u4i u4iVar) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        int i = u4iVar.f35371a & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f + u4iVar.f35372b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f = fCenterX - fCenterX2;
        return f + u4iVar.f35372b;
    }

    public final float n(View view, View view2, u4i u4iVar) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        int i = u4iVar.f35371a & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f + u4iVar.c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f = fCenterY - fCenterY2;
        return f + u4iVar.c;
    }

    public final float o(e eVar, v8g v8gVar, float f, float f2) {
        long jC = v8gVar.c();
        long jD = v8gVar.d();
        v8g v8gVarH = eVar.f8976a.h("expansion");
        return wc1.a(f, f2, v8gVar.e().getInterpolation((((v8gVarH.c() + v8gVarH.d()) + 17) - jC) / jD));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    public final void p(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void q(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupG;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.j == 0) || (viewGroupG = g(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    mv3.f27243a.set(viewGroupG, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, mv3.f27243a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupG, mv3.f27243a, 0.0f);
            }
            eVar.f8976a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int iZ = z(view);
            int i = 16777215 & iZ;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(iZ);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, com.google.android.material.circularreveal.c.d.f8628a, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, com.google.android.material.circularreveal.c.d.f8628a, iZ);
            }
            objectAnimatorOfInt.setEvaluator(fj1.b());
            eVar.f8976a.h("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    public final void s(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float fM = m(view, view2, eVar.f8977b);
        float fN = n(view, view2, eVar.f8977b);
        Pair<v8g, v8g> pairJ = j(fM, fN, z, eVar);
        v8g v8gVar = (v8g) pairJ.first;
        v8g v8gVar2 = (v8g) pairJ.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM = this.g;
        }
        fArr[0] = fM;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fN = this.h;
        }
        fArr2[0] = fN;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        v8gVar.a(objectAnimatorOfFloat);
        v8gVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    public final void t(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fV = androidx.core.view.c.v(view2) - androidx.core.view.c.v(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fV);
        }
        eVar.f8976a.h(BizTypeConstants.ELEVATION).a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float fK = k(view, view2, eVar.f8977b);
            float fL = l(view, view2, eVar.f8977b);
            ((FloatingActionButton) view).i(this.c);
            float fWidth = this.c.width() / 2.0f;
            v8g v8gVarH = eVar.f8976a.h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new com.google.android.material.circularreveal.c.e(fK, fL, fWidth));
                }
                if (z2) {
                    fWidth = cVar.getRevealInfo().c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(cVar, fK, fL, p8f.b(fK, fL, 0.0f, 0.0f, f, f2));
                animatorA.addListener(new d(cVar));
                x(view2, v8gVarH.c(), (int) fK, (int) fL, fWidth, list);
            } else {
                float f3 = cVar.getRevealInfo().c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(cVar, fK, fL, fWidth);
                int i = (int) fK;
                int i2 = (int) fL;
                x(view2, v8gVarH.c(), i, i2, f3, list);
                w(view2, v8gVarH.c(), v8gVarH.d(), eVar.f8976a.i(), i, i2, fWidth, list);
                animatorA = animatorA2;
            }
            v8gVarH.a(animatorA);
            list.add(animatorA);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, i47.f20766b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, i47.f20766b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f8976a.h("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(cVar, drawable));
        }
    }

    public final void w(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(j4);
            animatorCreateCircularReveal.setDuration(j3 - j4);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void x(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void y(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM = m(view, view2, eVar.f8977b);
        float fN = n(view, view2, eVar.f8977b);
        Pair<v8g, v8g> pairJ = j(fM, fN, z, eVar);
        v8g v8gVar = (v8g) pairJ.first;
        v8g v8gVar2 = (v8g) pairJ.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM);
                view2.setTranslationY(-fN);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            h(view2, eVar, v8gVar, v8gVar2, -fM, -fN, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fN);
        }
        v8gVar.a(objectAnimatorOfFloat);
        v8gVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final int z(View view) {
        ColorStateList colorStateListR = androidx.core.view.c.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
