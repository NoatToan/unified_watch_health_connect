package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseArray;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<WeakReference<Object>> f27863a = new SparseArray<>();

    public static Activity a(Context context) {
        Activity activity = null;
        while (activity == null && context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return activity;
    }

    public static int b(Context context) {
        Activity activityA = a(context);
        return activityA != null ? activityA.hashCode() : context.hashCode();
    }

    public static void c(Object obj) {
        if (obj instanceof PopupWindow) {
            PopupWindow popupWindow = (PopupWindow) obj;
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        }
    }

    public static void d(Context context, Object obj) {
        f27863a.remove(b(context));
    }

    public static void e(Context context, Object obj) {
        Object obj2;
        int iB = b(context);
        if (f27863a.get(iB) != null && (obj2 = f27863a.get(iB).get()) != null && obj2 != obj) {
            c(obj2);
        }
        f27863a.put(iB, new WeakReference<>(obj));
    }
}
