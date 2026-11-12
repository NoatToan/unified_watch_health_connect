package health.compact.a;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class HwLogger implements Logger {
    @Override // com.huawei.haf.common.log.Logger
    public void v(String str, boolean z, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.g(str, objArr);
    }

    @Override // com.huawei.haf.common.log.Logger
    public void d(String str, boolean z, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.d(str, objArr);
    }

    @Override // com.huawei.haf.common.log.Logger
    public void i(String str, boolean z, Object... objArr) {
        if (z || LogConfig.d()) {
            com.huawei.hwlogsmodel.LogUtil.h(str, objArr);
        } else {
            com.huawei.hwlogsmodel.LogUtil.a(str, objArr);
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void w(String str, boolean z, Object... objArr) {
        if (z || LogConfig.d()) {
            com.huawei.hwlogsmodel.LogUtil.i(str, objArr);
        } else {
            com.huawei.hwlogsmodel.LogUtil.j(str, objArr);
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public void e(String str, boolean z, Object... objArr) {
        if (z || LogConfig.d()) {
            com.huawei.hwlogsmodel.LogUtil.c(str, objArr);
        } else {
            com.huawei.hwlogsmodel.LogUtil.e(str, objArr);
        }
    }

    @Override // com.huawei.haf.common.log.Logger
    public String toString(Throwable th) {
        return ExceptionUtils.c(th);
    }

    @Override // com.huawei.haf.common.log.Logger
    public boolean isReleaseVersion() {
        return com.huawei.hwlogsmodel.common.LogConfig.f();
    }

    @Override // com.huawei.haf.common.log.Logger
    public boolean isBetaVersion() {
        return com.huawei.hwlogsmodel.common.LogConfig.b();
    }

    @Override // com.huawei.haf.common.log.Logger
    public boolean isDebugVersion() {
        return com.huawei.hwlogsmodel.common.LogConfig.a();
    }
}
