package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class l0 {
    public static void f(View view2, List list) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (list.get(i14) == view2) {
                return;
            }
        }
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        if (view2.getTransitionName() != null) {
            list.add(view2);
        }
        for (int i15 = size; i15 < list.size(); i15++) {
            View view3 = (View) list.get(i15);
            if (view3 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view3;
                int childCount = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = viewGroup.getChildAt(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size) {
                            if (childAt.getTransitionName() == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i17) == childAt) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
            }
        }
    }

    public static void j(Rect rect, View view2) {
        if (view2.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view2.getWidth(), view2.getHeight());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            Object parent = view2.getParent();
            while (parent instanceof View) {
                View view3 = (View) parent;
                rectF.offset(-view3.getScrollX(), -view3.getScrollY());
                view3.getMatrix().mapRect(rectF);
                rectF.offset(view3.getLeft(), view3.getTop());
                parent = view3.getParent();
            }
            int[] iArr = new int[2];
            view2.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view2, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, d dVar) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m(Object obj) {
        return false;
    }

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract Object o(Object obj, Object obj2);

    public abstract void p(Object obj, View view2, ArrayList<View> arrayList);

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void r(Object obj, float f14) {
    }

    public abstract void s(View view2, Object obj);

    public abstract void t(Object obj, Rect rect);

    public void u(Fragment fragment, Object obj, h7.d dVar, Runnable runnable) {
        v(obj, dVar, null, runnable);
    }

    public void v(Object obj, h7.d dVar, a0.c cVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void w(Object obj, View view2, ArrayList<View> arrayList);

    public abstract void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object y(Object obj);
}
