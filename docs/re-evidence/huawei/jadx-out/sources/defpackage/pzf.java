package defpackage;

import android.util.Log;
import com.huawei.skinner.facade.template.ILogger;

/* JADX INFO: loaded from: classes15.dex */
public class pzf implements ILogger {
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46006a = false;

    @Override // com.huawei.skinner.facade.template.ILogger
    public void showLog(boolean z) {
        this.e = z;
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void showDetailedStackTrace(boolean z) {
        this.f46006a = z;
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void debug(String str) {
        debug("HwSkinner", str);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void info(String str) {
        info("HwSkinner", str);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void warn(String str) {
        warn("HwSkinner", str);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void error(String str) {
        error("HwSkinner", str);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void error(String str, Throwable th) {
        error("HwSkinner", str, th);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void debug(String str, String str2) {
        if (this.e) {
            Log.d("HwSkinner", a(str, str2));
        }
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void info(String str, String str2) {
        Log.i("HwSkinner", a(str, str2));
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void warn(String str, String str2) {
        if (this.e) {
            Log.w("HwSkinner", a(str, str2));
        }
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void error(String str, String str2) {
        Log.e("HwSkinner", a(str, str2));
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public void error(String str, String str2, Throwable th) {
        if (this.f46006a) {
            Log.e("HwSkinner", a(str, str2), th);
            return;
        }
        if (th == null) {
            th = new NullPointerException("throwable is null!");
        }
        Throwable cause = th.getCause();
        error(str, "Error:" + (cause == null ? th.getMessage() : cause.getMessage()) + "; " + str2);
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public boolean isShowLog() {
        return this.e;
    }

    @Override // com.huawei.skinner.facade.template.ILogger
    public boolean isShowDetailedStackTrace() {
        return this.f46006a;
    }

    private String a(String str, String str2) {
        if ("HwSkinner".equals(str)) {
            return str2;
        }
        return str + "#" + str2;
    }
}
