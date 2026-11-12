package defpackage;

import android.content.Context;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsleepdetection.SleepRecordNotifyApi;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = SleepRecordNotifyApi.class)
@Singleton
public class uca implements SleepRecordNotifyApi {
    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public void pullUpAlarm(Context context) {
        LogUtil.a("SleepNotifyImpl", "pullUpAlarm");
        ubu.c(context);
    }

    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public void cancelAlarm() {
        LogUtil.a("SleepNotifyImpl", "cancelAlarm");
        ubu.b();
    }

    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public void showNotification(Context context) {
        LogUtil.a("SleepNotifyImpl", "showNotification");
        ubu.e();
    }

    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public void closeNotification() {
        LogUtil.a("SleepNotifyImpl", "closeNotification");
        ubu.c();
    }

    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public boolean isInTimeRange() {
        return ubu.d();
    }

    @Override // com.huawei.pluginsleepdetection.SleepRecordNotifyApi
    public String getCacheKey() {
        LogUtil.a("SleepNotifyImpl", "getCacheKey");
        return KnitSleepDetailActivity.d();
    }
}
