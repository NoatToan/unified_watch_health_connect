package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oe5<T extends View, Z> implements e0p<Z> {
    public static final int f = bqi.f4486a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f29061b;
    public View.OnAttachStateChangeListener c;
    public boolean d;
    public boolean e;

    @VisibleForTesting
    public static final class a {

        @VisibleForTesting
        public static Integer e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<zem> f29063b = new ArrayList();
        public boolean c;
        public ViewTreeObserverOnPreDrawListenerC1061a d;

        /* JADX INFO: renamed from: oe5$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC1061a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f29064a;

            public ViewTreeObserverOnPreDrawListenerC1061a(a aVar) {
                this.f29064a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                a aVar = this.f29064a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f29062a = view;
        }

        public static int c(Context context) {
            if (e == null) {
                Display defaultDisplay = ((WindowManager) a6i.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        public void a() {
            if (this.f29063b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f29062a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.f29063b.clear();
        }

        public void d(zem zemVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                zemVar.d(iG, iF);
                return;
            }
            if (!this.f29063b.contains(zemVar)) {
                this.f29063b.add(zemVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.f29062a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC1061a viewTreeObserverOnPreDrawListenerC1061a = new ViewTreeObserverOnPreDrawListenerC1061a(this);
                this.d = viewTreeObserverOnPreDrawListenerC1061a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1061a);
            }
        }

        public final int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.f29062a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f29062a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("CustomViewTarget", 4);
            return c(this.f29062a.getContext());
        }

        public final int f() {
            int paddingTop = this.f29062a.getPaddingTop() + this.f29062a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f29062a.getLayoutParams();
            return e(this.f29062a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f29062a.getPaddingLeft() + this.f29062a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f29062a.getLayoutParams();
            return e(this.f29062a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public final boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        public final void j(int i, int i2) {
            Iterator it = new ArrayList(this.f29063b).iterator();
            while (it.hasNext()) {
                ((zem) it.next()).d(i, i2);
            }
        }

        public void k(zem zemVar) {
            this.f29063b.remove(zemVar);
        }
    }

    public oe5(T t) {
        this.f29061b = (T) a6i.d(t);
        this.f29060a = new a(t);
    }

    private Object h() {
        return this.f29061b.getTag(f);
    }

    private void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || this.e) {
            return;
        }
        this.f29061b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = true;
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || !this.e) {
            return;
        }
        this.f29061b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = false;
    }

    private void m(Object obj) {
        this.f29061b.setTag(f, obj);
    }

    @Override // defpackage.e0p
    public final void b(Drawable drawable) {
        this.f29060a.b();
        k(drawable);
        if (this.d) {
            return;
        }
        j();
    }

    @Override // defpackage.e0p
    public final void c(zem zemVar) {
        this.f29060a.k(zemVar);
    }

    @Override // defpackage.e0p
    public final void d(zem zemVar) {
        this.f29060a.d(zemVar);
    }

    @Override // defpackage.e0p
    public final void e(Drawable drawable) {
        i();
        l(drawable);
    }

    @Override // defpackage.e0p
    public final void f(zmk zmkVar) {
        m(zmkVar);
    }

    @Override // defpackage.e0p
    public final zmk getRequest() {
        Object objH = h();
        if (objH == null) {
            return null;
        }
        if (objH instanceof zmk) {
            return (zmk) objH;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public abstract void k(Drawable drawable);

    public void l(Drawable drawable) {
    }

    @Override // defpackage.mfe
    public void onDestroy() {
    }

    @Override // defpackage.mfe
    public void onStart() {
    }

    @Override // defpackage.mfe
    public void onStop() {
    }

    public String toString() {
        return "Target for: " + this.f29061b;
    }
}
