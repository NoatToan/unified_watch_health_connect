package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cyb {
    public static void a(final ResultCallback<cxy> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cyb.3
            @Override // java.lang.Runnable
            public void run() {
                cxx cxxVar = new cxx();
                oet.d().c(cxxVar.getUrl(), cyb.b().getHeaders(), ofe.c(cyb.b().getBody(cxxVar)), cxy.class, resultCallback);
            }
        });
    }

    public static void d(final List<Long> list, final ResultCallback<CloudCommonReponse> resultCallback) {
        if (njy.e(list)) {
            LogUtil.a("FamilyCareDataManager", "followUsers is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cyb.1
                @Override // java.lang.Runnable
                public void run() {
                    cxw cxwVar = new cxw();
                    cxwVar.c(list);
                    oet.d().c(cxwVar.getUrl(), cyb.b().getHeaders(), ofe.c(cyb.b().getBody(cxwVar)), CloudCommonReponse.class, cyb.d(resultCallback));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResultCallback<CloudCommonReponse> d(final ResultCallback<CloudCommonReponse> resultCallback) {
        return new ResultCallback<CloudCommonReponse>() { // from class: cyb.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                if (cloudCommonReponse.getResultCode().intValue() == 0) {
                    LogUtil.a("FamilyCareDataManager", "delete success");
                    resultCallback.onSuccess(cloudCommonReponse);
                } else {
                    LogUtil.a("FamilyCareDataManager", "delete failure");
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HealthDataCloudFactory b() {
        return new HealthDataCloudFactory(BaseApplication.b());
    }
}
