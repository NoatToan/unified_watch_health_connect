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
@Deprecated
public abstract class lxq<T extends View, Z> extends ke2<Z> {
    public static boolean f;
    public static int g = bqi.f4486a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f25534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25535b;
    public View.OnAttachStateChangeListener c;
    public boolean d;
    public boolean e;

    @VisibleForTesting
    public static final class a {

        @VisibleForTesting
        public static Integer e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f25536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<zem> f25537b = new ArrayList();
        public boolean c;
        public ViewTreeObserverOnPreDrawListenerC1012a d;

        /* JADX INFO: renamed from: lxq$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC1012a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f25538a;

            public ViewTreeObserverOnPreDrawListenerC1012a(a aVar) {
                this.f25538a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                a aVar = this.f25538a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f25536a = view;
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
            if (this.f25537b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f25536a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.f25537b.clear();
        }

        public void d(zem zemVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                zemVar.d(iG, iF);
                return;
            }
            if (!this.f25537b.contains(zemVar)) {
                this.f25537b.add(zemVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.f25536a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC1012a viewTreeObserverOnPreDrawListenerC1012a = new ViewTreeObserverOnPreDrawListenerC1012a(this);
                this.d = viewTreeObserverOnPreDrawListenerC1012a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1012a);
            }
        }

        public final int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.f25536a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f25536a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return c(this.f25536a.getContext());
        }

        public final int f() {
            int paddingTop = this.f25536a.getPaddingTop() + this.f25536a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f25536a.getLayoutParams();
            return e(this.f25536a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f25536a.getPaddingLeft() + this.f25536a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f25536a.getLayoutParams();
            return e(this.f25536a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public final boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        public final void j(int i, int i2) {
            Iterator it = new ArrayList(this.f25537b).iterator();
            while (it.hasNext()) {
                ((zem) it.next()).d(i, i2);
            }
        }

        public void k(zem zemVar) {
            this.f25537b.remove(zemVar);
        }
    }

    public lxq(T t) {
        this.f25534a = (T) a6i.d(t);
        this.f25535b = new a(t);
    }

    @Override // defpackage.ke2, defpackage.e0p
    public void b(Drawable drawable) {
        super.b(drawable);
        this.f25535b.b();
        if (this.d) {
            return;
        }
        k();
    }

    @Override // defpackage.e0p
    public void c(zem zemVar) {
        this.f25535b.k(zemVar);
    }

    @Override // defpackage.e0p
    public void d(zem zemVar) {
        this.f25535b.d(zemVar);
    }

    @Override // defpackage.ke2, defpackage.e0p
    public void e(Drawable drawable) {
        super.e(drawable);
        j();
    }

    @Override // defpackage.e0p
    public void f(zmk zmkVar) {
        l(zmkVar);
    }

    @Override // defpackage.e0p
    public zmk getRequest() {
        Object objH = h();
        if (objH == null) {
            return null;
        }
        if (objH instanceof zmk) {
            return (zmk) objH;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final Object h() {
        return this.f25534a.getTag(g);
    }

    public T i() {
        return this.f25534a;
    }

    public final void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || this.e) {
            return;
        }
        this.f25534a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = true;
    }

    public final void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || !this.e) {
            return;
        }
        this.f25534a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = false;
    }

    public final void l(Object obj) {
        f = true;
        this.f25534a.setTag(g, obj);
    }

    public String toString() {
        return "Target for: " + this.f25534a;
    }
}
