package health.compact.a;

import android.app.Activity;
import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.api.LogApi;
import com.huawei.utils.FoundationCommonUtil;

/* JADX INFO: loaded from: classes.dex */
public class LogApiImpl implements LogApi {
    @Override // com.huawei.hihealth.api.LogApi
    public void v(String str, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.g(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void d(String str, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.d(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void i(String str, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.a(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void w(String str, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.j(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public void e(String str, Object... objArr) {
        com.huawei.hwlogsmodel.LogUtil.e(str, objArr);
    }

    @Override // com.huawei.hihealth.api.LogApi
    public boolean isBeta() {
        return com.huawei.hwlogsmodel.common.LogConfig.b();
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
