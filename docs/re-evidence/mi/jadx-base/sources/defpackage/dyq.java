package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class dyq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f16074b;

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public static void a() {
        if (f16073a) {
            return;
        }
        Class cls = Integer.TYPE;
        Method methodD = gbk.d(View.class, "setFrame", cls, cls, cls, cls);
        f16074b = methodD;
        methodD.setAccessible(true);
        f16073a = true;
    }

    public static void b(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static void c(View view, Rect rect) {
        rect.left = view.getScrollX() + view.getPaddingLeft();
        rect.top = view.getScrollY() + view.getPaddingTop();
        rect.right = (view.getWidth() - view.getPaddingRight()) - rect.left;
        rect.bottom = (view.getHeight() - view.getPaddingBottom()) - rect.top;
    }

    public static int d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static boolean e(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static boolean f(Context context) {
        return g(context.getResources().getConfiguration());
    }

    public static boolean g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 30) {
            return configuration.isNightModeActive();
        }
        return (configuration.uiMode & 48) == 32;
    }

    public static void h(ViewGroup viewGroup, View view, int i, int i2, int i3, int i4) {
        boolean zE = e(viewGroup);
        int width = viewGroup.getWidth();
        int i5 = zE ? width - i3 : i;
        if (zE) {
            i3 = width - i;
        }
        view.layout(i5, i2, i3, i4);
    }

    public static void i(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void j(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
            return;
        }
        a();
        Method method = f16074b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16075a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16076b;
        public int c;
        public int d;
        public int e;

        public a(View view) {
            this.f16076b = c.F(view);
            this.c = view.getPaddingTop();
            this.d = c.E(view);
            this.e = view.getPaddingBottom();
        }

        public void a(ViewGroup viewGroup) {
            b(viewGroup);
            viewGroup.setClipToPadding(true);
        }

        public void b(View view) {
            c.J0(view, this.f16076b, this.c, this.d, this.e);
        }

        public a(int i, int i2, int i3, int i4) {
            this.f16076b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public a(a aVar) {
            this.f16076b = aVar.f16076b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }
}
