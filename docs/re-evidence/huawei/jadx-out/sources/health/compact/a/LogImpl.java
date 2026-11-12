package health.compact.a;

import android.util.Log;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.log.LogBuilder;
import com.huawei.haf.common.log.Logger;

/* JADX INFO: loaded from: classes.dex */
final class LogImpl implements Logger {
    @Override // com.huawei.haf.common.log.Logger
    public boolean isBetaVersion() {
        return false;
    }

    @Override // com.huawei.haf.common.log.Logger
    public boolean isDebugVersion() {
        return false;
    }

    @Override // com.huawei.haf.common.log.Logger
    public boolean isReleaseVersion() {
        return true;
    }

    LogImpl() {
    }

    @Override // com.huawei.haf.common.log.Logger
    public void v(String str, boolean z, Object... objArr) {
        if (LogConfig.b(0)) {
            Log.v(str, LogBuilder.b(objArr));
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void d(String str, boolean z, Object... objArr) {
        if (LogConfig.b(1)) {
            Log.d(str, LogBuilder.b(objArr));
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void i(String str, boolean z, Object... objArr) {
        if ((z || LogConfig.d()) && LogConfig.b(2)) {
            Log.i(str, LogBuilder.b(objArr));
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void w(String str, boolean z, Object... objArr) {
        if ((z || LogConfig.d()) && LogConfig.b(3)) {
            Log.w(str, LogBuilder.b(objArr));
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void e(String str, boolean z, Object... objArr) {
        if ((z || LogConfig.d()) && LogConfig.b(4)) {
            Log.e(str, LogBuilder.b(objArr));
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public String toString(Throwable th) {
        return ExceptionUtils.c(th);
    }
}
