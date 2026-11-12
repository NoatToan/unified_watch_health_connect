package nj;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import mj.j;
import qj.l;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class i<T extends View, Z> extends nj.a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f126225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f126226c;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Integer f126227e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f126228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f126229b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f126230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC2425a f126231d;

        /* JADX INFO: renamed from: nj.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC2425a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f126232a;

            public ViewTreeObserverOnPreDrawListenerC2425a(a aVar) {
                this.f126232a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                a aVar = this.f126232a.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.f126229b;
                View view2 = aVar.f126228a;
                if (arrayList.isEmpty()) {
                    return true;
                }
                int paddingRight = view2.getPaddingRight() + view2.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int iA = aVar.a(view2.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                int iA2 = aVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f126231d);
                }
                aVar.f126231d = null;
                arrayList.clear();
                return true;
            }
        }

        public a(View view2) {
            this.f126228a = view2;
        }

        public final int a(int i14, int i15, int i16) {
            int i17 = i15 - i16;
            if (i17 > 0) {
                return i17;
            }
            boolean z14 = this.f126230c;
            View view2 = this.f126228a;
            if (z14 && view2.isLayoutRequested()) {
                return 0;
            }
            int i18 = i14 - i16;
            if (i18 > 0) {
                return i18;
            }
            if (view2.isLayoutRequested() || i15 != -2) {
                return 0;
            }
            Context context = view2.getContext();
            if (f126227e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                l.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f126227e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f126227e.intValue();
        }
    }

    public i(T t7) {
        l.c(t7, "Argument must not be null");
        this.f126225b = t7;
        this.f126226c = new a(t7);
    }

    @Override // nj.a, nj.h
    public void a(Drawable drawable) {
        a aVar = this.f126226c;
        ViewTreeObserver viewTreeObserver = aVar.f126228a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f126231d);
        }
        aVar.f126231d = null;
        aVar.f126229b.clear();
    }

    @Override // nj.h
    public final void b(j jVar) throws Throwable {
        a aVar = this.f126226c;
        ArrayList arrayList = aVar.f126229b;
        View view2 = aVar.f126228a;
        int paddingRight = view2.getPaddingRight() + view2.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int iA = aVar.a(view2.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = aVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            jVar.c(iA, iA2);
            return;
        }
        if (!arrayList.contains(jVar)) {
            arrayList.add(jVar);
        }
        if (aVar.f126231d == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC2425a viewTreeObserverOnPreDrawListenerC2425a = new a.ViewTreeObserverOnPreDrawListenerC2425a(aVar);
            aVar.f126231d = viewTreeObserverOnPreDrawListenerC2425a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2425a);
        }
    }

    @Override // nj.h
    public final void e(j jVar) {
        this.f126226c.f126229b.remove(jVar);
    }

    @Override // nj.a, nj.h
    public final mj.d getRequest() {
        Object tag = this.f126225b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof mj.d) {
            return (mj.d) tag;
        }
        vb.h.s("You must not call setTag() on a view Glide is targeting");
        return null;
    }

    @Override // nj.a, nj.h
    public void h(Drawable drawable) {
    }

    @Override // nj.a, nj.h
    public final void i(mj.d dVar) {
        this.f126225b.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public final String toString() {
        return "Target for: " + this.f126225b;
    }

    @Deprecated
    public i(T t7, boolean z14) {
        this(t7);
        if (z14) {
            this.f126226c.f126230c = true;
        }
    }
}
