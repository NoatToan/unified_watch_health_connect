package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwwidgetsafeinsets.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class xgo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f52889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f52890b;
    private static final Method e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f52891c;
    private Context m;
    private int d = 0;
    private final Rect j = new Rect();
    private final Rect g = new Rect();
    private int i = 0;
    private boolean h = false;
    private boolean f = false;
    private boolean n = false;
    private boolean l = false;
    private boolean o = false;
    private boolean k = true;
    private final Runnable s = new d();

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xgo.this.f52891c.requestLayout();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 28) {
            e = null;
            f52889a = null;
            f52890b = null;
            return;
        }
        try {
            try {
                try {
                    f52889a = Class.forName("huawei.android.widget.RadiusSizeUtils").getDeclaredMethod("getRadiusSize", Context.class);
                } catch (ClassNotFoundException unused) {
                    Log.w("HwWidgetSafeInsets", "getRadiusSize ClassNotFoundException");
                    f52889a = null;
                }
            } catch (NoSuchMethodException unused2) {
                Log.w("HwWidgetSafeInsets", "getRadiusSize NoSuchMethodException");
                f52889a = null;
            }
            try {
                try {
                    try {
                        e = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getDeclaredMethod("getDisplaySafeInsets", WindowInsets.class);
                    } catch (ClassNotFoundException unused3) {
                        Log.w("HwWidgetSafeInsets", "getDisplaySafeInsets ClassNotFoundException");
                        e = null;
                    }
                } catch (NoSuchMethodException unused4) {
                    Log.w("HwWidgetSafeInsets", "getDisplaySafeInsets NoSuchMethodException");
                    e = null;
                }
                try {
                    try {
                        try {
                            f52890b = Class.forName("com.huawei.android.app.WindowManagerEx").getDeclaredMethod("getDisplaySideSafeInsets", new Class[0]);
                        } catch (ClassNotFoundException unused5) {
                            Log.w("HwWidgetSafeInsets", "getDisplaySideSafeInsets ClassNotFoundException");
                            f52890b = null;
                        }
                    } catch (Throwable th) {
                        f52890b = null;
                        throw th;
                    }
                } catch (NoSuchMethodException unused6) {
                    Log.w("HwWidgetSafeInsets", "getDisplaySideSafeInsets NoSuchMethodException");
                    f52890b = null;
                }
            } catch (Throwable th2) {
                e = null;
                throw th2;
            }
        } catch (Throwable th3) {
            f52889a = null;
            throw th3;
        }
    }

    public xgo(View view) {
        this.m = null;
        this.f52891c = view;
        this.m = view.getContext();
    }

    private Activity d(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private boolean d() {
        Activity activityD = d(this.m);
        if (activityD == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("com.huawei.android.app.ActivityManagerEx").getMethod("getActivityWindowMode", Activity.class).invoke(null, activityD)).intValue() == 102;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            Log.e("HwWidgetSafeInsets", "Exception occurred in isInMultiWindowMode.");
            return false;
        }
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a() {
        return this.d == 2;
    }

    public void b() {
        View view = this.f52891c;
        if (view != null) {
            view.removeCallbacks(this.s);
            this.f52891c.post(this.s);
        }
    }

    public void b(boolean z) {
        this.n = z;
    }

    public void c(int i, int i2, int i3, int i4) {
        b(new Rect(i, i2, i3, i4));
    }

    public void c(WindowInsets windowInsets) {
        if (!d() && Build.VERSION.SDK_INT >= 28) {
            Rect rectA = e != null ? a(windowInsets) : e(windowInsets);
            if (rectA == null) {
                rectA = new Rect();
            }
            boolean zB = b(this.f52891c);
            this.f52891c.getLocationInWindow(new int[2]);
            if (this.k) {
                if (this.j.equals(rectA) && this.h == zB) {
                    return;
                }
                this.j.set(rectA);
                this.i |= 2;
                this.h = zB;
                b();
            }
        }
    }

    public void c(boolean z) {
        this.k = z;
    }

    public void d(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            Log.w("HwWidgetSafeInsets", "parse cutout mode error");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDisplayCutout);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.HwDisplayCutout_hwCutoutMode, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Rect e() {
        return this.j;
    }

    public Rect e(View view) {
        return e(view, this.g);
    }

    public void e(View view, Rect rect, boolean z) {
        if (view == null || rect == null || a()) {
            return;
        }
        int i = this.i;
        if ((i & 2) == 0) {
            return;
        }
        this.i = i | 1;
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.i &= -2;
        if (z) {
            b();
            this.i &= -3;
        }
    }

    private void b(Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        if (this.d == 1) {
            Rect rect5 = this.j;
            int i = rect5.left;
            if (i > 0) {
                rect2.left = rect.left + i;
            }
            int i2 = rect5.right;
            if (i2 > 0) {
                rect2.right = rect.right + i2;
                return;
            }
            return;
        }
        Rect rect6 = this.j;
        int i3 = rect6.left;
        if (i3 > 0 && rect3.left < i3) {
            rect2.left = rect.left + i3;
        }
        int i4 = rect6.right;
        if (i4 <= 0 || rect4.right - i4 >= rect3.right) {
            return;
        }
        rect2.right = rect.right + i4;
    }

    public void b(Rect rect) {
        if (d(this.f52891c) && (this.i & 1) == 0) {
            if (this.o) {
                this.l = true;
                return;
            }
            this.g.set(rect);
            this.o = true;
            this.i |= 2;
        }
    }

    public Rect e(View view, Rect rect) {
        int iA;
        int i;
        Rect rect2 = new Rect();
        if (view != null && rect != null) {
            rect2.set(rect);
            boolean z = (this.n || this.f || c()) ? false : true;
            if (!a() && !z) {
                Rect rect3 = new Rect();
                Rect rect4 = new Rect();
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i2 = iArr[0];
                rect3.set(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
                View rootView = view.getRootView();
                if (rootView != null) {
                    rootView.getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    rect4.set(i3, iArr[1], rootView.getWidth() + i3, iArr[1] + rootView.getHeight());
                    b(rect, rect2, rect3, rect4);
                    boolean zA = a(view.getContext());
                    if (this.f) {
                        if (zA && (i = this.j.top) > 0 && rect3.top < i) {
                            int i4 = rect3.top;
                            int paddingTop = view.getPaddingTop();
                            int paddingTop2 = this.j.top;
                            if (i4 + paddingTop >= paddingTop2) {
                                paddingTop2 = view.getPaddingTop();
                            }
                            rect2.top = paddingTop2;
                        } else if (this.l) {
                            rect2.top = view.getPaddingTop();
                        }
                    }
                    if (this.n && zA && (iA = a(view)) > 0) {
                        rect2.bottom = rect.bottom + iA;
                    }
                }
            }
        }
        return rect2;
    }

    private boolean b(View view) {
        return view != null && Settings.Global.getInt(view.getContext().getContentResolver(), Constants.NAVIGATIONBAR_IS_MIN, 0) == 0;
    }

    private boolean a(Context context) {
        WindowManager windowManager;
        int rotation = (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null) ? 0 : windowManager.getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    public void e(boolean z) {
        if ((this.i & 2) == 0) {
            return;
        }
        View view = this.f52891c;
        e(view, e(view), z);
    }

    private static Rect a(WindowInsets windowInsets) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = new Rect();
        if (windowInsets != null && Build.VERSION.SDK_INT >= 28) {
            try {
                Method method = e;
                if (method != null) {
                    Object objInvoke = method.invoke(null, windowInsets);
                    if (objInvoke instanceof Rect) {
                        rect2 = (Rect) objInvoke;
                    }
                }
                Method method2 = f52890b;
                if (method2 != null) {
                    Object objInvoke2 = method2.invoke(null, new Object[0]);
                    if ((objInvoke2 instanceof Rect) && (i = (rect = (Rect) objInvoke2).left) != 0 && (i2 = rect.right) != 0) {
                        rect2.left = i;
                        rect2.right = i2;
                    }
                }
                return rect2;
            } catch (IllegalAccessException unused) {
                Log.e("HwWidgetSafeInsets", "getWindowDisplaySafeInsets IllegalAccessException");
            } catch (InvocationTargetException unused2) {
                Log.e("HwWidgetSafeInsets", "getWindowDisplaySafeInsets InvocationTargetException");
            }
        }
        return rect2;
    }

    private int a(View view) {
        Context context;
        int iC;
        if (view == null || (context = view.getContext()) == null || (iC = c(context)) <= 0) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return ((iArr[1] + view.getMeasuredHeight()) + iC) - displayMetrics.heightPixels;
    }

    private static Rect e(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        Rect rect = new Rect();
        if (windowInsets != null && Build.VERSION.SDK_INT == 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            rect.set(displayCutout.getSafeInsetLeft(), 0, displayCutout.getSafeInsetRight(), 0);
        }
        return rect;
    }

    private static int c(Context context) {
        try {
            Method method = f52889a;
            if (method != null) {
                return ((Integer) method.invoke(null, context)).intValue();
            }
            return 0;
        } catch (IllegalAccessException unused) {
            Log.w("HwWidgetSafeInsets", "getRadiusSize IllegalAccessException");
            return 0;
        } catch (InvocationTargetException unused2) {
            Log.w("HwWidgetSafeInsets", "getRadiusSize InvocationTargetException");
            return 0;
        }
    }

    private boolean d(View view) {
        if (view == null) {
            return false;
        }
        return view.isAttachedToWindow();
    }

    private boolean c() {
        Rect rect = this.j;
        if (rect == null) {
            return false;
        }
        return rect.left > 0 || rect.right > 0;
    }
}
