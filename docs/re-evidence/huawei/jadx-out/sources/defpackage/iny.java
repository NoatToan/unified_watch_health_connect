package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class iny {
    public static void a(final int i, final ResultCallback<inr> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ioa
            @Override // java.lang.Runnable
            public final void run() {
                iny.b(i, resultCallback);
            }
        });
    }

    static /* synthetic */ void b(int i, ResultCallback resultCallback) {
        ins insVar = new ins(i, 200, 0, 0);
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
        LogUtil.a("LabelNetWorkUtil", "url", insVar.getUrl());
        oet.d().c(insVar.getUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(insVar)), inr.class, resultCallback);
    }

    public static void c(final List<inz> list, final ResultCallback<CloudCommonReponse> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: inx
            @Override // java.lang.Runnable
            public final void run() {
                iny.d(list, resultCallback);
            }
        });
    }

    static /* synthetic */ void d(List list, ResultCallback resultCallback) {
        ioc iocVar = new ioc(list);
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
        LogUtil.a("LabelNetWorkUtil", "url", iocVar.getUrl());
        oet.d().c(iocVar.getUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(iocVar)), CloudCommonReponse.class, resultCallback);
    }
}
