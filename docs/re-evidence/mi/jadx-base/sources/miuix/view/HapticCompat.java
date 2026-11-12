package miuix.view;

import android.os.Looper;
import android.view.View;
import androidx.annotation.Keep;
import defpackage.alb;
import defpackage.blb;
import defpackage.dlb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class HapticCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26913a = SystemProperties.get("sys.haptic.version", "1.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<blb> f26914b = new ArrayList();
    public static final Executor c = Executors.newSingleThreadExecutor();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<View> f26915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26916b;

        public a(View view, int i) {
            this.f26915a = new WeakReference<>(view);
            this.f26916b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f26915a.get();
            if (view == null || !view.isAttachedToWindow()) {
                return;
            }
            try {
                HapticCompat.performHapticFeedback(view, this.f26916b);
            } catch (Exception unused) {
            }
        }
    }

    static {
        d("miuix.view.LinearVibrator", "miuix.view.ExtendedVibrator");
    }

    public static boolean a(int i) {
        int i2 = alb.c;
        if (i >= i2 && i <= alb.d) {
            return true;
        }
        String.format("Illegal haptic version 1 feedback constant, should be in range [0x%08x..0x%08x]", Integer.valueOf(i2), Integer.valueOf(alb.d));
        return false;
    }

    public static boolean b(int i) {
        int i2 = alb.u;
        if (i >= i2 && i <= alb.v) {
            return true;
        }
        String.format("Illegal haptic version 2 feedback constant, should be in range [0x%08x..0x%08x]", Integer.valueOf(i2), Integer.valueOf(alb.v));
        return false;
    }

    public static boolean c(String str) {
        return f26913a.equals(str);
    }

    public static void d(String... strArr) {
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("loading provider: ");
            sb.append(str);
            try {
                Class.forName(str, true, HapticCompat.class.getClassLoader());
            } catch (ClassNotFoundException unused) {
                String.format("load provider %s failed.", str);
            }
        }
    }

    public static boolean e(View view, int i, int i2) {
        if (c("2.0")) {
            if (b(i)) {
                return performHapticFeedback(view, i);
            }
            return false;
        }
        if (c("1.0")) {
            if (a(i2)) {
                return performHapticFeedback(view, i2);
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected haptic version: ");
        sb.append(f26913a);
        return false;
    }

    @Keep
    public static boolean performHapticFeedback(View view, int i) {
        if (view == null) {
            return false;
        }
        if (i < 268435456) {
            String.format("perform haptic: 0x%08x", Integer.valueOf(i));
            dlb.a("performHapticFeedback view: " + view + ", feedbackConstant: " + i);
            return view.performHapticFeedback(i);
        }
        int i2 = alb.f1168b;
        if (i > i2) {
            String.format("illegal feedback constant, should be in range [0x%08x..0x%08x]", 268435456, Integer.valueOf(i2));
            return false;
        }
        Iterator<blb> it = f26914b.iterator();
        while (it.hasNext()) {
            if (it.next().performHapticFeedback(view, i)) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void performHapticFeedbackAsync(View view, int i) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            c.execute(new a(view, i));
        } else {
            performHapticFeedback(view, i);
        }
    }

    @Keep
    public static void registerProvider(blb blbVar) {
        f26914b.add(blbVar);
    }

    @Keep
    public static void performHapticFeedbackAsync(View view, int i, int i2) {
        if (c("2.0")) {
            if (b(i)) {
                performHapticFeedbackAsync(view, i);
            }
        } else if (c("1.0")) {
            if (a(i2)) {
                performHapticFeedbackAsync(view, i2);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected haptic version: ");
            sb.append(f26913a);
        }
    }
}
