package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.amo;
import defpackage.bak;
import defpackage.byq;
import defpackage.d0q;
import defpackage.p5q;
import defpackage.rdi;
import defpackage.s3h;
import defpackage.utq;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> N = new b(PointF.class, "boundsOrigin");
    public static final Property<k, PointF> O = new c(PointF.class, "topLeft");
    public static final Property<k, PointF> P = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> Q = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> R = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> S = new g(PointF.class, "position");
    public static bak T = new bak();
    public int[] J;
    public boolean K;
    public boolean L;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f3025b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f3024a = viewGroup;
            this.f3025b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            byq.b(this.f3024a).a(this.f3025b);
            byq.h(this.c, this.d);
        }
    }

    public class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f3026a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f3026a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3026a);
            Rect rect = this.f3026a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f3026a);
            this.f3026a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f3026a);
        }
    }

    public class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    public class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            byq.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            byq.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            byq.g(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f3027a;
        private k mViewBounds;

        public h(k kVar) {
            this.f3027a = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3030b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f3030b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3029a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3029a) {
                return;
            }
            androidx.core.view.c.y0(this.f3030b, this.c);
            byq.g(this.f3030b, this.d, this.e, this.f, this.g);
        }
    }

    public class j extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3031a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3032b;

        public j(ViewGroup viewGroup) {
            this.f3032b = viewGroup;
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void a(Transition transition) {
            utq.d(this.f3032b, true);
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void c(Transition transition) {
            utq.d(this.f3032b, false);
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            if (!this.f3031a) {
                utq.d(this.f3032b, false);
            }
            transition.W(this);
        }

        @Override // androidx.transition.b, androidx.transition.Transition.f
        public void e(Transition transition) {
            utq.d(this.f3032b, false);
            this.f3031a = true;
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3034b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            byq.g(this.e, this.f3033a, this.f3034b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.f3033a = Math.round(pointF.x);
            this.f3034b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    public ChangeBounds() {
        this.J = new int[2];
        this.K = false;
        this.L = false;
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
    }

    public final void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        if (!androidx.core.view.c.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0qVar.f14937a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0qVar.f14937a.put("android:changeBounds:parent", d0qVar.f14938b.getParent());
        if (this.L) {
            d0qVar.f14938b.getLocationInWindow(this.J);
            d0qVar.f14937a.put("android:changeBounds:windowX", Integer.valueOf(this.J[0]));
            d0qVar.f14937a.put("android:changeBounds:windowY", Integer.valueOf(this.J[1]));
        }
        if (this.K) {
            d0qVar.f14937a.put("android:changeBounds:clip", androidx.core.view.c.t(view));
        }
    }

    public final boolean l0(View view, View view2) {
        if (!this.L) {
            return true;
        }
        d0q d0qVarW = w(view, true);
        if (d0qVarW == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == d0qVarW.f14938b) {
            return true;
        }
        return false;
    }

    public void m0(boolean z) {
        this.K = z;
    }

    @Override // androidx.transition.Transition
    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        int i2;
        View view;
        ObjectAnimator objectAnimatorA;
        int i3;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (d0qVar == null || d0qVar2 == null) {
            return null;
        }
        Map<String, Object> map = d0qVar.f14937a;
        Map<String, Object> map2 = d0qVar2.f14937a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = d0qVar2.f14938b;
        if (!l0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) d0qVar.f14937a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) d0qVar.f14937a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) d0qVar2.f14937a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) d0qVar2.f14937a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.J);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = byq.c(view2);
            byq.h(view2, 0.0f);
            byq.b(viewGroup).b(bitmapDrawable);
            PathMotion pathMotionY = y();
            int[] iArr = this.J;
            int i4 = iArr[0];
            int i5 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, rdi.a(N, pathMotionY.a(iIntValue - i4, iIntValue2 - i5, iIntValue3 - i4, iIntValue4 - i5)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) d0qVar.f14937a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) d0qVar2.f14937a.get("android:changeBounds:bounds");
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect3 = (Rect) d0qVar.f14937a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) d0qVar2.f14937a.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i2 = 0;
        } else {
            i2 = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.K) {
            byq.g(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
            if (i6 == i7 && i8 == i9) {
                objectAnimatorA = null;
            } else {
                view = view2;
                objectAnimatorA = s3h.a(view, S, y().a(i6, i8, i7, i9));
            }
            if (rect3 == null) {
                i3 = 0;
                rect3 = new Rect(0, 0, i14, i15);
            } else {
                i3 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i3, i3, i16, i17) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                androidx.core.view.c.y0(view, rect3);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", T, rect3, rect5);
                objectAnimatorOfObject.addListener(new i(view, rect4, i7, i9, i11, i13));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = androidx.transition.d.c(objectAnimatorA, objectAnimator);
        } else {
            byq.g(view, i6, i8, i10, i12);
            if (i2 != 2) {
                animatorC = (i6 == i7 && i8 == i9) ? s3h.a(view, Q, y().a(i10, i12, i11, i13)) : s3h.a(view, R, y().a(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorC = s3h.a(view, S, y().a(i6, i8, i7, i9));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorA2 = s3h.a(kVar, O, y().a(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorA3 = s3h.a(kVar, P, y().a(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new h(kVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            utq.d(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new int[2];
        this.K = false;
        this.L = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.d);
        boolean zE = p5q.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        m0(zE);
    }
}
