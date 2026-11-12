package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6472a;

    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        m1 mDispachedInsets;
        private final int mDispatchMode;

        public b(int i14) {
            this.mDispatchMode = i14;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(l1 l1Var) {
        }

        public void onPrepare(l1 l1Var) {
        }

        public abstract m1 onProgress(m1 m1Var, List<l1> list);

        public a onStart(l1 l1Var, a aVar) {
            return aVar;
        }
    }

    public static class c extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f6475e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q9.a f6476f = new q9.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f6477g = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AccelerateInterpolator f6478h = new AccelerateInterpolator(1.5f);

        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f6479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public m1 f6480b;

            /* JADX INFO: renamed from: androidx.core.view.l1$c$a$a, reason: collision with other inner class name */
            public class C0088a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l1 f6481a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m1 f6482b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m1 f6483c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f6484d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f6485e;

                public C0088a(a aVar, l1 l1Var, m1 m1Var, m1 m1Var2, int i14, View view2) {
                    this.f6481a = l1Var;
                    this.f6482b = m1Var;
                    this.f6483c = m1Var2;
                    this.f6484d = i14;
                    this.f6485e = view2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    l1 l1Var = this.f6481a;
                    l1Var.f6472a.e(animatedFraction);
                    float fC = l1Var.f6472a.c();
                    PathInterpolator pathInterpolator = c.f6475e;
                    m1 m1Var = this.f6482b;
                    m1.a aVar = new m1.a(m1Var);
                    int i14 = 1;
                    while (true) {
                        m1.i iVar = aVar.f6509a;
                        if (i14 > 512) {
                            c.h(this.f6485e, iVar.b(), Collections.singletonList(l1Var));
                            return;
                        }
                        if ((this.f6484d & i14) == 0) {
                            iVar.d(i14, m1Var.f6508a.i(i14));
                        } else {
                            c7.e eVarI = m1Var.f6508a.i(i14);
                            c7.e eVarI2 = this.f6483c.f6508a.i(i14);
                            float f14 = 1.0f - fC;
                            iVar.d(i14, m1.e(eVarI, (int) (((double) ((eVarI.f25190a - eVarI2.f25190a) * f14)) + 0.5d), (int) (((double) ((eVarI.f25191b - eVarI2.f25191b) * f14)) + 0.5d), (int) (((double) ((eVarI.f25192c - eVarI2.f25192c) * f14)) + 0.5d), (int) (((double) ((eVarI.f25193d - eVarI2.f25193d) * f14)) + 0.5d)));
                        }
                        i14 <<= 1;
                    }
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l1 f6486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f6487b;

                public b(a aVar, l1 l1Var, View view2) {
                    this.f6486a = l1Var;
                    this.f6487b = view2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    l1 l1Var = this.f6486a;
                    l1Var.f6472a.e(1.0f);
                    c.f(this.f6487b, l1Var);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.l1$c$a$c, reason: collision with other inner class name */
            public class RunnableC0089c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f6488a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l1 f6489b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f6490c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f6491d;

                public RunnableC0089c(a aVar, View view2, l1 l1Var, a aVar2, ValueAnimator valueAnimator) {
                    this.f6488a = view2;
                    this.f6489b = l1Var;
                    this.f6490c = aVar2;
                    this.f6491d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.f6488a, this.f6489b, this.f6490c);
                    this.f6491d.start();
                }
            }

            public a(View view2, b bVar) {
                this.f6479a = bVar;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                m1 m1VarA = s0.e.a(view2);
                this.f6480b = m1VarA != null ? new m1.a(m1VarA).f6509a.b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view2.isLaidOut()) {
                    this.f6480b = m1.g(view2, windowInsets);
                    return c.j(view2, windowInsets);
                }
                m1 m1VarG = m1.g(view2, windowInsets);
                m1.r rVar = m1VarG.f6508a;
                if (this.f6480b == null) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    this.f6480b = s0.e.a(view2);
                }
                if (this.f6480b == null) {
                    this.f6480b = m1VarG;
                    return c.j(view2, windowInsets);
                }
                b bVarK = c.k(view2);
                if (bVarK != null && Objects.equals(bVarK.mDispachedInsets, m1VarG)) {
                    return c.j(view2, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m1 m1Var = this.f6480b;
                int i14 = 1;
                while (i14 <= 512) {
                    c7.e eVarI = rVar.i(i14);
                    c7.e eVarI2 = m1Var.f6508a.i(i14);
                    int i15 = eVarI.f25190a;
                    int i16 = eVarI.f25193d;
                    int i17 = eVarI.f25192c;
                    int i18 = eVarI.f25191b;
                    int i19 = eVarI2.f25190a;
                    int i24 = eVarI2.f25193d;
                    int i25 = eVarI2.f25192c;
                    int i26 = eVarI2.f25191b;
                    boolean z14 = i15 > i19 || i18 > i26 || i17 > i25 || i16 > i24;
                    if (z14 != (i15 < i19 || i18 < i26 || i17 < i25 || i16 < i24)) {
                        if (z14) {
                            iArr[0] = iArr[0] | i14;
                        } else {
                            iArr2[0] = iArr2[0] | i14;
                        }
                    }
                    i14 <<= 1;
                    iArr = iArr;
                }
                int i27 = iArr[0];
                int i28 = iArr2[0];
                int i29 = i27 | i28;
                if (i29 == 0) {
                    this.f6480b = m1VarG;
                    return c.j(view2, windowInsets);
                }
                m1 m1Var2 = this.f6480b;
                if ((i27 & 8) != 0) {
                    interpolator = c.f6475e;
                } else if ((i28 & 8) != 0) {
                    interpolator = c.f6476f;
                } else if ((i27 & 519) != 0) {
                    interpolator = c.f6477g;
                } else {
                    interpolator = (i28 & 519) != 0 ? c.f6478h : null;
                }
                l1 l1Var = new l1(i29, interpolator, (i29 & 8) != 0 ? 160L : 250L);
                e eVar = l1Var.f6472a;
                eVar.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.b());
                c7.e eVarI3 = rVar.i(i29);
                c7.e eVarI4 = m1Var2.f6508a.i(i29);
                int iMin = Math.min(eVarI3.f25190a, eVarI4.f25190a);
                int i30 = eVarI3.f25191b;
                int i34 = eVarI4.f25191b;
                int iMin2 = Math.min(i30, i34);
                int i35 = eVarI3.f25192c;
                int i36 = eVarI4.f25192c;
                int iMin3 = Math.min(i35, i36);
                int i37 = eVarI3.f25193d;
                int i38 = eVarI4.f25193d;
                a aVar = new a(c7.e.c(iMin, iMin2, iMin3, Math.min(i37, i38)), c7.e.c(Math.max(eVarI3.f25190a, eVarI4.f25190a), Math.max(i30, i34), Math.max(i35, i36), Math.max(i37, i38)));
                c.g(view2, l1Var, m1VarG, false);
                duration.addUpdateListener(new C0088a(this, l1Var, m1VarG, m1Var2, i29, view2));
                duration.addListener(new b(this, l1Var, view2));
                c0.a(view2, new RunnableC0089c(this, view2, l1Var, aVar, duration));
                this.f6480b = m1VarG;
                return c.j(view2, windowInsets);
            }
        }

        public c(int i14, Interpolator interpolator, long j8) {
            super(i14, interpolator, j8);
        }

        public static void f(View view2, l1 l1Var) {
            b bVarK = k(view2);
            if (bVarK != null) {
                bVarK.onEnd(l1Var);
                if (bVarK.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    f(viewGroup.getChildAt(i14), l1Var);
                }
            }
        }

        public static void g(View view2, l1 l1Var, m1 m1Var, boolean z14) {
            b bVarK = k(view2);
            if (bVarK != null) {
                bVarK.mDispachedInsets = m1Var;
                if (!z14) {
                    bVarK.onPrepare(l1Var);
                    z14 = bVarK.getDispatchMode() == 0;
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    g(viewGroup.getChildAt(i14), l1Var, m1Var, z14);
                }
            }
        }

        public static void h(View view2, m1 m1Var, List<l1> list) {
            b bVarK = k(view2);
            if (bVarK != null) {
                m1Var = bVarK.onProgress(m1Var, list);
                if (bVarK.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    h(viewGroup.getChildAt(i14), m1Var, list);
                }
            }
        }

        public static void i(View view2, l1 l1Var, a aVar) {
            b bVarK = k(view2);
            if (bVarK != null) {
                bVarK.onStart(l1Var, aVar);
                if (bVarK.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    i(viewGroup.getChildAt(i14), l1Var, aVar);
                }
            }
        }

        public static WindowInsets j(View view2, WindowInsets windowInsets) {
            return view2.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view2.onApplyWindowInsets(windowInsets);
        }

        public static b k(View view2) {
            Object tag = view2.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f6479a;
            }
            return null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f6499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6500d;

        public e(int i14, Interpolator interpolator, long j8) {
            this.f6497a = i14;
            this.f6499c = interpolator;
            this.f6500d = j8;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.f6500d;
        }

        public float c() {
            float f14 = this.f6498b;
            Interpolator interpolator = this.f6499c;
            return interpolator != null ? interpolator.getInterpolation(f14) : f14;
        }

        public int d() {
            return this.f6497a;
        }

        public void e(float f14) {
            this.f6498b = f14;
        }
    }

    public l1(int i14, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6472a = new d(i14, interpolator, j8);
        } else {
            this.f6472a = new c(i14, interpolator, j8);
        }
    }

    public static l1 a(WindowInsetsAnimation windowInsetsAnimation) {
        return new l1(windowInsetsAnimation);
    }

    public static class d extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f6492e;

        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f6493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<l1> f6494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList<l1> f6495c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, l1> f6496d;

            public a(b bVar) {
                super(bVar.getDispatchMode());
                this.f6496d = new HashMap<>();
                this.f6493a = bVar;
            }

            public final l1 a(WindowInsetsAnimation windowInsetsAnimation) {
                l1 l1Var = this.f6496d.get(windowInsetsAnimation);
                if (l1Var != null) {
                    return l1Var;
                }
                l1 l1VarA = l1.a(windowInsetsAnimation);
                this.f6496d.put(windowInsetsAnimation, l1VarA);
                return l1VarA;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f6493a.onEnd(a(windowInsetsAnimation));
                this.f6496d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f6493a.onPrepare(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<l1> arrayList = this.f6495c;
                if (arrayList == null) {
                    ArrayList<l1> arrayList2 = new ArrayList<>(list.size());
                    this.f6495c = arrayList2;
                    this.f6494b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationJ = i0.j(list.get(size));
                    l1 l1VarA = a(windowInsetsAnimationJ);
                    l1VarA.f6472a.e(windowInsetsAnimationJ.getFraction());
                    this.f6495c.add(l1VarA);
                }
                return this.f6493a.onProgress(m1.g(null, windowInsets), this.f6494b).f();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a aVarOnStart = this.f6493a.onStart(a(windowInsetsAnimation), a.a(bounds));
                aVarOnStart.getClass();
                i0.l();
                return i0.h(aVarOnStart.f6473a.e(), aVarOnStart.f6474b.e());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f6492e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.l1.e
        public final float a() {
            return this.f6492e.getAlpha();
        }

        @Override // androidx.core.view.l1.e
        public final long b() {
            return this.f6492e.getDurationMillis();
        }

        @Override // androidx.core.view.l1.e
        public final float c() {
            return this.f6492e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.l1.e
        public final int d() {
            return this.f6492e.getTypeMask();
        }

        @Override // androidx.core.view.l1.e
        public final void e(float f14) {
            this.f6492e.setFraction(f14);
        }

        public d(int i14, Interpolator interpolator, long j8) {
            this(i0.i(i14, interpolator, j8));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c7.e f6473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c7.e f6474b;

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f6473a = c7.e.d(bounds.getLowerBound());
            this.f6474b = c7.e.d(bounds.getUpperBound());
        }

        public static a a(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public final String toString() {
            return "Bounds{lower=" + this.f6473a + " upper=" + this.f6474b + StringSubstitutor.DEFAULT_VAR_END;
        }

        public a(c7.e eVar, c7.e eVar2) {
            this.f6473a = eVar;
            this.f6474b = eVar2;
        }
    }

    private l1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.f6472a = new d(windowInsetsAnimation);
    }
}
