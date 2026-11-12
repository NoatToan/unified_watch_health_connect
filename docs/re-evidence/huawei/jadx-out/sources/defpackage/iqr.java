package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.api.LogApi;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class iqr implements LogApi {
    @Override // com.huawei.hihealth.api.LogApi
    public void v(String str, Object... objArr) {
        ReleaseLogUtil.d(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void d(String str, Object... objArr) {
        ReleaseLogUtil.d(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void i(String str, Object... objArr) {
        ReleaseLogUtil.d(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void w(String str, Object... objArr) {
        ReleaseLogUtil.e(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void e(String str, Object... objArr) {
        ReleaseLogUtil.a(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public boolean isBeta() {
        return LogConfig.b();
    }

    @Override // com.huawei.hihealth.api.LogApi
    public String getCurrentActivity() {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            return null;
        }
        return activityJ.toString();
    }

    @Override // com.huawei.hihealth.api.LogApi
    public boolean isSystemInfoAuthorized(Context context) {
        return FoundationCommonUtil.isSystemInfoAuthorized(context);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public String logAnonymousException(Exception exc) {
        return LogAnonymous.b(exc);
    }
}
