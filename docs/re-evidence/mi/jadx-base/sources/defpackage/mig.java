package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.core.app.a;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class mig {
    public static NavController a(Activity activity, int i) {
        NavController navControllerC = c(a.w(activity, i));
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    public static NavController b(View view) {
        NavController navControllerC = c(view);
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static NavController c(View view) {
        while (view != null) {
            NavController navControllerD = d(view);
            if (navControllerD != null) {
                return navControllerD;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static NavController d(View view) {
        Object tag = view.getTag(tpi.f34915a);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static void e(View view, NavController navController) {
        view.setTag(tpi.f34915a, navController);
    }
}
