package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class mth implements prc {
    public static WeakReference<ValueAnimator> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27185a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27186b = 0;

    public class a extends d {
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2, int i) {
            super(view, view2);
            this.f = i;
        }

        @Override // mth.d, android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Insets insets;
            super.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime());
                insets = rootWindowInsets.getInsets(WindowInsets.Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
                if (zIsVisible) {
                    mth.this.f27186b = insets.bottom - insets2.bottom;
                }
            } else {
                insets = null;
            }
            Context context = view.getContext();
            if (b(context) && a(context)) {
                c(this.f + (insets != null ? insets.bottom : 0));
            }
        }
    }

    public class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f27187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f27188b;
        public final /* synthetic */ miuix.appcompat.app.c.d c;
        public final /* synthetic */ View.OnLayoutChangeListener d;

        public b(View view, boolean z, miuix.appcompat.app.c.d dVar, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f27187a = view;
            this.f27188b = z;
            this.c = dVar;
            this.d = onLayoutChangeListener;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int height = this.f27187a.getHeight();
            mth.n(view, height, false);
            mth.l(view, height, 0, this.f27188b, mth.this.new f(this.c, this.d, view, 0), mth.this.new g(view, this.f27188b));
            view.setVisibility(0);
        }
    }

    public class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ miuix.appcompat.app.c.d f27190b;
        public final /* synthetic */ View.OnLayoutChangeListener c;

        public c(boolean z, miuix.appcompat.app.c.d dVar, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f27189a = z;
            this.f27190b = dVar;
            this.c = onLayoutChangeListener;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = i4 - i2;
            mth.n(view, i9, false);
            mth.l(view, i9, 0, this.f27189a, mth.this.new f(this.f27190b, this.c, view, 0), mth.this.new g(view, this.f27189a));
        }
    }

    public class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<View> f27191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<View> f27192b;
        public final Rect c = new Rect();
        public final Point d = new Point();

        public d(View view, View view2) {
            this.f27191a = new WeakReference<>(view.getRootView());
            this.f27192b = new WeakReference<>(view2);
        }

        public boolean a(Context context) {
            zlr.a(context).getRealSize(this.d);
            Rect rect = this.c;
            if (rect.left != 0) {
                return false;
            }
            int i = rect.right;
            Point point = this.d;
            if (i == point.x) {
                return rect.top >= ((int) (((float) point.y) * 0.2f));
            }
            return false;
        }

        public boolean b(Context context) {
            return s6g.o(context) && !s6g.m(context);
        }

        public void c(int i) {
            View view = this.f27192b.get();
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (marginLayoutParams.bottomMargin != i) {
                    marginLayoutParams.bottomMargin = i;
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2 = this.f27191a.get();
            if (view2 != null) {
                view2.getWindowVisibleDisplayFrame(this.c);
            }
        }
    }

    public class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<yu6.a> f27193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<View> f27194b;

        public e(View view, yu6.a aVar) {
            this.f27193a = new WeakReference<>(aVar);
            this.f27194b = new WeakReference<>(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f27194b.get();
            if (view != null) {
                view.setTag(null);
            }
            yu6.a aVar = this.f27193a.get();
            if (aVar != null) {
                aVar.end();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f27194b.get();
            if (view != null) {
                view.setTag(null);
            }
            yu6.a aVar = this.f27193a.get();
            if (aVar != null) {
                aVar.end();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f27194b.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<miuix.appcompat.app.c.d> f27195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View.OnLayoutChangeListener f27196b;
        public WeakReference<View> c;
        public int d;

        public f(miuix.appcompat.app.c.d dVar, View.OnLayoutChangeListener onLayoutChangeListener, View view, int i) {
            this.f27195a = new WeakReference<>(dVar);
            this.f27196b = onLayoutChangeListener;
            this.c = new WeakReference<>(view);
            this.d = i;
        }

        public final void a() {
            View view = this.c.get();
            if (view != null) {
                view.setTag(null);
                View.OnLayoutChangeListener onLayoutChangeListener = this.f27196b;
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    this.f27196b = null;
                }
            }
            miuix.appcompat.app.c.d dVar = this.f27195a.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            }
            if (mth.c != null) {
                mth.c.clear();
                WeakReference unused = mth.c = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            a();
            View view = this.c.get();
            if (view != null) {
                mth.n(view, this.d, true);
            }
            this.f27195a.clear();
            this.c.clear();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            WindowInsets rootWindowInsets;
            super.onAnimationEnd(animator);
            a();
            View view = this.c.get();
            if (view != null && Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime());
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
                if (zIsVisible) {
                    mth.this.f27186b = insets.bottom - insets2.bottom;
                } else {
                    mth.this.f27186b = 0;
                }
                if (mth.this.f27185a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onAnimationEnd: isImeVisible = ");
                    sb.append(zIsVisible);
                    sb.append(", mImeHeight = ");
                    sb.append(mth.this.f27186b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onAnimationEnd: imeInsets = ");
                    sb2.append(insets);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onAnimationEnd: navigationBarInsets = ");
                    sb3.append(insets2);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("onAnimationEnd: newValue = ");
                    sb4.append(this.d - mth.this.f27186b);
                }
                mth.n(view, this.d - mth.this.f27186b, true);
            }
            this.f27195a.clear();
            this.c.clear();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            View view = this.c.get();
            if (view != null) {
                view.setTag("show");
                View.OnLayoutChangeListener onLayoutChangeListener = this.f27196b;
                if (onLayoutChangeListener != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
            }
            miuix.appcompat.app.c.d dVar = this.f27195a.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            }
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<View> f27197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27198b;

        public g(View view, boolean z) {
            this.f27197a = new WeakReference<>(view);
            this.f27198b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowInsets rootWindowInsets;
            View view = this.f27197a.get();
            if (view == null) {
                return;
            }
            if ("hide".equals(view.getTag())) {
                valueAnimator.cancel();
                return;
            }
            if (Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime());
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
                if (zIsVisible) {
                    mth.this.f27186b = insets.bottom - insets2.bottom;
                } else {
                    mth.this.f27186b = 0;
                }
                if (mth.this.f27185a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onAnimationUpdate: isImeVisible = ");
                    sb.append(zIsVisible);
                    sb.append(", mImeHeight = ");
                    sb.append(mth.this.f27186b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onAnimationUpdate: imeInsets = ");
                    sb2.append(insets);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onAnimationUpdate: navigationBarInsets = ");
                    sb3.append(insets2);
                }
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (mth.this.f27185a) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onAnimationUpdate: newValue = ");
                sb4.append(iIntValue - mth.this.f27186b);
            }
            mth.n(view, iIntValue - mth.this.f27186b, false);
        }
    }

    public mth() {
        m();
    }

    public static void l(View view, int i, int i2, boolean z, f fVar, g gVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.setInterpolator(EaseManager.getInterpolator(0, 0.88f, 0.7f));
        valueAnimatorOfInt.addUpdateListener(gVar);
        valueAnimatorOfInt.addListener(fVar);
        valueAnimatorOfInt.start();
        c = new WeakReference<>(valueAnimatorOfInt);
    }

    public static void n(View view, int i, boolean z) {
        if (z) {
            view.animate().cancel();
            view.animate().setDuration(100L).translationY(i).start();
        } else {
            view.animate().cancel();
            view.setTranslationY(i);
        }
    }

    @Override // defpackage.prc
    public void a(View view, View view2, yu6.a aVar) {
        if ("hide".equals(view.getTag())) {
            return;
        }
        k(view, new e(view, aVar));
        fw6.a(view2);
    }

    @Override // defpackage.prc
    public void b() {
        ValueAnimator valueAnimator;
        WeakReference<ValueAnimator> weakReference = c;
        if (weakReference == null || (valueAnimator = weakReference.get()) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // defpackage.prc
    public void c(View view, View view2, boolean z, miuix.appcompat.app.c.d dVar) {
        if ("show".equals(view.getTag())) {
            return;
        }
        this.f27186b = 0;
        int i = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
        if (view.getScaleX() != 1.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        a aVar = Build.VERSION.SDK_INT >= 30 ? new a(view, view2, i) : null;
        if (view.getHeight() > 0) {
            view.addOnLayoutChangeListener(new b(view, z, dVar, aVar));
            view.setVisibility(4);
            view.setAlpha(1.0f);
        } else {
            view.addOnLayoutChangeListener(new c(z, dVar, aVar));
        }
        fw6.b(view2);
    }

    public final void k(View view, e eVar) {
        if (view == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(ViewProperty.TRANSLATION_Y, view.getTranslationY(), view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(eVar);
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public final boolean m() {
        String str = "";
        try {
            String str2 = SystemProperties.get("log.tag.alertdialog.ime.debug.enable");
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        boolean zEquals = TextUtils.equals("true", str);
        this.f27185a = zEquals;
        return zEquals;
    }
}
