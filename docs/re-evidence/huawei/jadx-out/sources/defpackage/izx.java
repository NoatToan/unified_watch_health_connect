package defpackage;

import com.huawei.health.pluginlocation.logger.Logger;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izx implements Logger {
    @Override // com.huawei.health.pluginlocation.logger.Logger
    public void v(String str, Object... objArr) {
        LogUtil.g(str, objArr);
    }

    @Override // com.huawei.health.pluginlocation.logger.Logger
    public void d(String str, Object... objArr) {
        LogUtil.d(str, objArr);
    }

    @Override // com.huawei.health.pluginlocation.logger.Logger
    public void i(String str, Object... objArr) {
        LogUtil.a(str, objArr);
    }

    @Override // com.huawei.health.pluginlocation.logger.Logger
    public void w(String str, Object... objArr) {
        LogUtil.j(str, objArr);
    }

    @Override // com.huawei.health.pluginlocation.logger.Logger
    public void e(String str, Object... objArr) {
        LogUtil.e(str, objArr);
    }
}
