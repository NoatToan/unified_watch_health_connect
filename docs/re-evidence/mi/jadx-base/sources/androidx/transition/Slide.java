package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.amo;
import defpackage.d0q;
import defpackage.lbm;
import defpackage.p5q;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {
    public static final TimeInterpolator N = new DecelerateInterpolator();
    public static final TimeInterpolator O = new AccelerateInterpolator();
    public static final g P = new a();
    public static final g Q = new b();
    public static final g R = new c();
    public static final g S = new d();
    public static final g T = new e();
    public static final g U = new f();
    public g L;
    public int M;

    public class a extends h {
        public a() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class b extends h {
        public b() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return androidx.core.view.c.A(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class c extends i {
        public c() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class d extends h {
        public d() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class e extends h {
        public e() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return androidx.core.view.c.A(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class f extends i {
        public f() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        public i() {
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.L = U;
        this.M = 80;
        t0(80);
    }

    private void k0(d0q d0qVar) {
        int[] iArr = new int[2];
        d0qVar.f14938b.getLocationOnScreen(iArr);
        d0qVar.f14937a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void g(d0q d0qVar) {
        super.g(d0qVar);
        k0(d0qVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(d0q d0qVar) {
        super.j(d0qVar);
        k0(d0qVar);
    }

    @Override // androidx.transition.Visibility
    public Animator p0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        if (d0qVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) d0qVar2.f14937a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.e.a(view, d0qVar2, iArr[0], iArr[1], this.L.b(viewGroup, view), this.L.a(viewGroup, view), translationX, translationY, N, this);
    }

    @Override // androidx.transition.Visibility
    public Animator r0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        if (d0qVar == null) {
            return null;
        }
        int[] iArr = (int[]) d0qVar.f14937a.get("android:slide:screenPosition");
        return androidx.transition.e.a(view, d0qVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.L.b(viewGroup, view), this.L.a(viewGroup, view), O, this);
    }

    public void t0(int i2) {
        if (i2 == 3) {
            this.L = P;
        } else if (i2 == 5) {
            this.L = S;
        } else if (i2 == 48) {
            this.L = R;
        } else if (i2 == 80) {
            this.L = U;
        } else if (i2 == 8388611) {
            this.L = Q;
        } else {
            if (i2 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.L = T;
        }
        this.M = i2;
        lbm lbmVar = new lbm();
        lbmVar.j(i2);
        g0(lbmVar);
    }

    public Slide(int i2) {
        this.L = U;
        this.M = 80;
        t0(i2);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = U;
        this.M = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.h);
        int iK = p5q.k(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        t0(iK);
    }
}
