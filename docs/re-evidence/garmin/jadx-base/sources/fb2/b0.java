package fb2;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a<T> f70334a;

    public interface a<T> {
        void e(T t7);
    }

    public b0(a<T> aVar) {
        this.f70334a = aVar;
    }

    public static boolean c(View view2) {
        if (view2 != null) {
            return view2.isEnabled();
        }
        return false;
    }

    public static boolean e(View view2) {
        return view2 != null && view2.getVisibility() == 0;
    }

    public static void g(View view2, boolean z14) {
        if (view2 != null) {
            view2.setEnabled(z14);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    g(viewGroup.getChildAt(i14), z14);
                }
            }
        }
    }

    public static void i(View view2, boolean z14) {
        if (view2 != null) {
            if (z14) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
        }
    }

    public abstract boolean b();

    public abstract boolean d();

    public final void f(T t7) {
        a<T> aVar = this.f70334a;
        if (aVar != null) {
            aVar.e(t7);
        }
    }

    public abstract void h(boolean z14);

    public abstract void j(boolean z14);
}
