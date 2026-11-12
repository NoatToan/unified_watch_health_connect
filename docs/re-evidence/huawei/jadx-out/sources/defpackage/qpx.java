package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.huawei.android.view.WindowManagerEx;
import com.huawei.android.widget.ToastEx;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes.dex */
public final class qpx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Toast f46633a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f46634c = true;
    private static long d;

    private qpx() {
    }

    public static void b(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        c(str, 1);
    }

    public static void b(Context context, int i) {
        if (context == null) {
            return;
        }
        d(i, 1);
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        c(str, 0);
    }

    public static void e(Context context, int i) {
        if (context == null) {
            return;
        }
        d(i, 0);
    }

    public static void a(Context context, int i) {
        if (context == null) {
            LogUtil.j("ToastUtil", "showShortToastByFrequencyLimit, context is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d < 2000) {
            LogUtil.j("ToastUtil", "showShortToastByFrequencyLimit, show Short Toast too fast!");
        } else {
            d = jCurrentTimeMillis;
            d(i, 0);
        }
    }

    public static void d() {
        synchronized (qpx.class) {
            Toast toast = f46633a;
            if (toast != null) {
                toast.cancel();
                f46633a = null;
            }
        }
    }

    private static void d(int i, int i2) {
        c(qre.f(i), i2);
    }

    private static void c(final String str, final int i) {
        if (BaseApplication.isRunningForeground() && Looper.getMainLooper() == Looper.myLooper()) {
            e(str, i, true);
        } else {
            HandlerExecutor.c(new Runnable() { // from class: qpx.1
                @Override // java.lang.Runnable
                public void run() {
                    qpx.e(str, i, false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, int i, boolean z) {
        try {
            d();
            Context context = BaseApplication.getContext();
            Toast toastMakeText = Toast.makeText(context, str, i);
            if (Build.VERSION.SDK_INT < 30 || z) {
                a(toastMakeText, context, str, i);
                c(toastMakeText);
            }
            toastMakeText.show();
            f46633a = toastMakeText;
        } catch (InflateException unused) {
            LogUtil.e("ToastUtil", "inflate toast layout fail");
        }
    }

    private static void a(Toast toast, Context context, String str, int i) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.commonui_toast_layout, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.commonui_toast_text);
        healthTextView.setText(str);
        if (((int) healthTextView.getPaint().measureText(str)) + healthTextView.getPaddingStart() + healthTextView.getPaddingEnd() > healthTextView.getMaxWidth()) {
            healthTextView.setGravity(GravityCompat.START);
            healthTextView.setTextAlignment(5);
        }
        toast.setView(viewInflate);
        toast.setDuration(i);
        toast.setGravity(80, 0, 0);
    }

    private static void c(Toast toast) {
        if (f46634c) {
            try {
                new WindowManagerEx.LayoutParamsEx(ToastEx.getWindowParams(toast)).addHwFlags(128);
            } catch (Throwable th) {
                if (th instanceof ClassNotFoundException) {
                    f46634c = false;
                }
                LogUtil.j("ToastUtil", "setShowExNonSystemOverlayWindows Throwable:", th.getCause());
            }
        }
    }
}
