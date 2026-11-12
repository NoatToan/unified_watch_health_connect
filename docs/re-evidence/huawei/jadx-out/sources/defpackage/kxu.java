package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxu {
    public static void c(List<String> list, List<String> list2, final ResultCallback<kyb> resultCallback) {
        ReleaseLogUtil.d("R_HlthTrendDwnldUt", "downloadHealthTrend enter");
        HealthDataCloudFactory healthDataCloudFactoryB = lqo.b(BaseApplication.b()).b();
        kxt kxtVar = new kxt();
        kxtVar.d(list);
        kxtVar.c(list2);
        oet.d().c(kxtVar.getUrl(), healthDataCloudFactoryB.getHeaders(), ofe.c(healthDataCloudFactoryB.getBody(kxtVar)), kyb.class, new ResultCallback<kyb>() { // from class: kxu.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(kyb kybVar) {
                LogUtil.a("HlthTrendDwnldUt", "downloadHealthTrend success response = ", kybVar);
                resultCallback.onSuccess(kybVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d("R_HlthTrendDwnldUt", "downloadHealthTrend fail throwable = ", ExceptionUtils.c(th));
                resultCallback.onFailure(th);
            }
        });
    }

    public static void b(List<String> list, List<String> list2, String str, final ResultCallback<kyb> resultCallback) {
        ReleaseLogUtil.d("R_HlthTrendDwnldUt", "downloadHealthTrendWithRecordDay enter");
        HealthDataCloudFactory healthDataCloudFactoryB = lqo.b(BaseApplication.b()).b();
        kxr kxrVar = new kxr();
        kxrVar.d(list);
        kxrVar.c(list2);
        kxrVar.d(str);
        ReleaseLogUtil.d("R_HlthTrendDwnldUt", "downloadHealthTrendWithRecordDay request = ", kxrVar);
        oet.d().c(kxrVar.getUrl(), healthDataCloudFactoryB.getHeaders(), ofe.c(healthDataCloudFactoryB.getBody(kxrVar)), kyb.class, new ResultCallback<kyb>() { // from class: kxu.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(kyb kybVar) {
                LogUtil.a("HlthTrendDwnldUt", "downloadHealthTrendWithRecordDay success response = ", kybVar);
                resultCallback.onSuccess(kybVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d("R_HlthTrendDwnldUt", "downloadHealthTrendWithRecordDay fail throwable = ", ExceptionUtils.c(th));
                resultCallback.onFailure(th);
            }
        });
    }
}
