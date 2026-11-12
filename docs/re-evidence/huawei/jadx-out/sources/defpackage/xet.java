package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class xet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f52802c;
    private static final Method d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f52804b;
    private boolean e = false;
    private int f = 0;
    private int g = 0;
    private int j = 0;

    static {
        Class cls = Integer.TYPE;
        f52802c = d("setShadowStyle", new Class[]{cls, cls, cls}, "android.view.View");
        d = d("setShadowClip", new Class[]{Boolean.TYPE}, "android.view.View");
    }

    private void a(int i) {
        if (i < 0 || i > 6) {
            return;
        }
        this.f = i;
    }

    private void b(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.g = i;
    }

    private void e() {
        int i = this.g;
        if (i == 2) {
            this.j = 2;
        } else if (i == 1 || b()) {
            this.j = 1;
        } else {
            this.j = 0;
        }
    }

    public void c() {
        View view;
        e();
        Method method = f52802c;
        if (method == null || (view = this.f52804b) == null) {
            Log.w("HwShadowEngine", "Method or target view is null!");
        } else if (this.e) {
            a(view, method, new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.j), Integer.valueOf(a())});
        } else {
            a(view, method, new Object[]{-1, -1, -1});
        }
    }

    public void c(int i) {
        b(i);
    }

    public void c(boolean z) {
        if (this.e != z) {
            this.e = z;
            c();
        }
    }

    public void d(boolean z) {
        View view;
        Method method = d;
        if (method == null || (view = this.f52804b) == null) {
            Log.w("HwShadowEngine", "Method or target view is null!");
        } else {
            a(view, method, new Object[]{Boolean.valueOf(z)});
        }
    }

    public void e(int i) {
        a(i);
    }

    public xet(Context context, View view, int i, int i2) {
        this.f52803a = context;
        this.f52804b = view;
        a(i);
        b(i2);
    }

    private boolean b() {
        return (this.f52803a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Method d(String str, Class[] clsArr, String str2) {
        try {
            Method declaredMethod = Class.forName(str2).getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (ClassNotFoundException unused) {
            Log.e("HwShadowEngine", "ClassNotFoundException in reflect call " + str);
            return null;
        } catch (NoSuchMethodException unused2) {
            Log.e("HwShadowEngine", "there is no " + str + " method");
            return null;
        }
    }

    private Object a(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            Log.e("HwShadowEngine", "IllegalAccessException in reflect call " + method.getName());
            return null;
        } catch (InvocationTargetException unused2) {
            Log.e("HwShadowEngine", "InvocationTargetException in reflect call " + method.getName());
            return null;
        }
    }

    private int a() {
        return this.f52803a.getResources().getConfiguration().uiMode & 15;
    }
}
