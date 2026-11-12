package health.compact.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import defpackage.npv;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class LogSensor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static npv f36609a;
    private static final boolean d = BuildConfigProperties.a("IS_OUTPUT_LOG", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36610b = new Object();

    static {
        f36609a = null;
        f36609a = new npv("LogSensor");
        com.huawei.hwlogsmodel.common.LogConfig.c(new com.huawei.hwlogsmodel.common.LogConfig.Model() { // from class: health.compact.a.LogSensor.4
            @Override // com.huawei.hwlogsmodel.common.LogConfig.Model
            public void clearLogCache() {
                LogSensor.d();
            }
        });
    }

    private LogSensor() {
    }

    public static void d() {
        f36609a.b();
        Log.i("LogSensor", "clearLogCache start in process:" + ProcessUtil.c() + " pid:" + Process.myPid());
        com.huawei.hwlogsmodel.common.LogConfig logConfigD = com.huawei.hwlogsmodel.LogUtil.d("sensor");
        if (logConfigD == null) {
            Log.w("LogSensor", "clearLogCache,logConfig null,return");
            return;
        }
        com.huawei.hwlogsmodel.common.LogConfig.e(new File(logConfigD.n()));
        Log.i("LogSensor", "clearLogCache end in process:" + ProcessUtil.c() + " pid:" + Process.myPid());
    }

    public static void b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.w("LogSensor", "LogSensor empty message return");
        } else {
            c(d, bArr);
        }
    }

    private static void c(boolean z, byte[] bArr) {
        if (z) {
            f36609a.d(bArr, false);
        }
    }

    public static void e() {
        synchronized (f36610b) {
            f36609a.d();
            c("LogSensor", "blockForAnalyze");
            f36609a.d(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: health.compact.a.LogSensor.1
                @Override // java.lang.Runnable
                public void run() {
                    LogSensor.a();
                }
            }, 300000L);
        }
    }

    public static void a() {
        synchronized (f36610b) {
            c("LogSensor", "unBlockForAnalyze");
            f36609a.d(true);
        }
    }

    public static void c(String str, String str2) {
        Log.i(str, str2);
    }
}
