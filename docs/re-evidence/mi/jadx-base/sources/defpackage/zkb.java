package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.RequiresPermission;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miui.util.HapticFeedbackUtil;
import miuix.view.PlatformConstants;

/* JADX INFO: loaded from: classes3.dex */
public class zkb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41398b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f41399k;
    public static final Executor l = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HapticFeedbackUtil f41400a;

    static {
        if (PlatformConstants.VERSION >= 1) {
            try {
                f41398b = HapticFeedbackUtil.isSupportLinearMotorVibrate();
            } catch (Throwable unused) {
                f41398b = false;
            }
            if (f41398b) {
                try {
                    HapticFeedbackUtil.class.getMethod("performHapticFeedback", Integer.TYPE, Double.TYPE, String.class);
                    c = true;
                } catch (Throwable unused2) {
                    c = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("isSupportExtHapticFeedback", Integer.TYPE);
                    e = true;
                } catch (Throwable unused3) {
                    e = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", Integer.TYPE, Boolean.TYPE);
                    f = true;
                } catch (Throwable unused4) {
                    f = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod(BroadcastsKt.SILENT_PUSHING_STOP, new Class[0]);
                    g = true;
                } catch (Throwable unused5) {
                    g = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", Integer.TYPE, Double.TYPE, String.class);
                    d = true;
                } catch (Throwable unused6) {
                    d = false;
                }
            }
        }
        if (PlatformConstants.romHapticVersion < 1.2d || Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", xkb.a(), Integer.TYPE);
            h = true;
        } catch (Exception unused7) {
        }
        try {
            HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", xkb.a(), Integer.TYPE, Boolean.TYPE);
            i = true;
        } catch (Exception unused8) {
        }
        try {
            Class cls = Integer.TYPE;
            HapticFeedbackUtil.class.getMethod("performHapticFeedback", xkb.a(), cls, Boolean.TYPE, cls);
            j = true;
        } catch (Exception unused9) {
        }
        try {
            HapticFeedbackUtil.class.getMethod("performHapticFeedback", xkb.a(), Integer.TYPE, Double.TYPE, String.class);
            f41399k = true;
        } catch (Exception unused10) {
        }
    }

    public zkb(Context context) {
        this(context, true);
    }

    public boolean b(int i2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f41400a;
        if (hapticFeedbackUtil == null) {
            return false;
        }
        if (e) {
            return hapticFeedbackUtil.isSupportExtHapticFeedback(i2);
        }
        return i2 >= 0 && i2 <= 160;
    }

    @RequiresPermission("android.permission.VIBRATE")
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean c(int i2) {
        if (this.f41400a == null) {
            return false;
        }
        dlb.a("performExtHapticFeedback: " + i2);
        return this.f41400a.performExtHapticFeedback(i2);
    }

    @RequiresPermission("android.permission.VIBRATE")
    public void e(final int i2) {
        if (this.f41400a == null) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            l.execute(new Runnable() { // from class: ykb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40266a.c(i2);
                }
            });
        } else {
            c(i2);
        }
    }

    @Deprecated
    public zkb(Context context, boolean z) {
        if (PlatformConstants.VERSION >= 1 && f41398b) {
            this.f41400a = new HapticFeedbackUtil(context, z);
        }
    }
}
