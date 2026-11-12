package defpackage;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes.dex */
public class sk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static qk5 f33727a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static rk5 f33728b = null;

    public static <T extends ViewDataBinding> T a(rk5 rk5Var, View view, int i) {
        return (T) f33727a.getDataBinder(rk5Var, view, i);
    }

    public static <T extends ViewDataBinding> T b(rk5 rk5Var, View[] viewArr, int i) {
        return (T) f33727a.getDataBinder(rk5Var, viewArr, i);
    }

    public static <T extends ViewDataBinding> T c(View view) {
        return (T) d(view, f33728b);
    }

    public static <T extends ViewDataBinding> T d(View view, rk5 rk5Var) {
        T t = (T) h(view);
        if (t != null) {
            return t;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = f33727a.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) f33727a.getDataBinder(rk5Var, view, layoutId);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static <T extends ViewDataBinding> T e(rk5 rk5Var, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) a(rk5Var, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) b(rk5Var, viewArr, i2);
    }

    public static String f(int i) {
        return f33727a.convertBrIdToString(i);
    }

    public static <T extends ViewDataBinding> T g(View view) {
        while (view != null) {
            T t = (T) ViewDataBinding.x(view);
            if (t != null) {
                return t;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static <T extends ViewDataBinding> T h(View view) {
        return (T) ViewDataBinding.x(view);
    }

    public static rk5 i() {
        return f33728b;
    }

    public static <T extends ViewDataBinding> T j(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return (T) k(layoutInflater, i, viewGroup, z, f33728b);
    }

    public static <T extends ViewDataBinding> T k(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, rk5 rk5Var) {
        boolean z2 = viewGroup != null && z;
        return z2 ? (T) e(rk5Var, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : (T) a(rk5Var, layoutInflater.inflate(i, viewGroup, z), i);
    }

    public static <T extends ViewDataBinding> T l(Activity activity, int i) {
        return (T) m(activity, i, f33728b);
    }

    public static <T extends ViewDataBinding> T m(Activity activity, int i, rk5 rk5Var) {
        activity.setContentView(i);
        return (T) e(rk5Var, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i);
    }
}
