package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes27.dex */
public class dmc {
    public static void a(String str, int i, final UiCallback<qhf> uiCallback) {
        ReleaseLogUtil.d("ThreeCircle_CloudManager", "querySummary queryType", str, ", queryDate:", Integer.valueOf(i));
        dly dlyVarD = new dly.c().e(str).a(i).d();
        oet.d().c(dlyVarD.getUrl(), c().getHeaders(), ofe.c(c().getBody(dlyVarD)), qhf.class, new ResultCallback<qhf>() { // from class: dmc.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(qhf qhfVar) {
                if (qhfVar == null) {
                    ReleaseLogUtil.a("ThreeCircle_CloudManager", "querySummary data == null");
                } else {
                    ReleaseLogUtil.d("ThreeCircle_CloudManager", "querySummary onSuccess.", peh.c(qhfVar));
                    uiCallback.onSuccess(qhfVar);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                if (th != null) {
                    ReleaseLogUtil.e("ThreeCircle_CloudManager", "querySummary throwable:", th.getMessage());
                } else {
                    ReleaseLogUtil.e("ThreeCircle_CloudManager", "querySummary throwable null");
                }
            }
        });
    }

    public static void d(String str, int i, final UiCallback<qhd> uiCallback) {
        ReleaseLogUtil.d("ThreeCircle_CloudManager", "queryEncourage queryType", str, ", queryDate:", Integer.valueOf(i));
        dly dlyVarD = new dly.c().e(str).a(i).d();
        oet.d().c(dlyVarD.getUrl(), c().getHeaders(), ofe.c(c().getBody(dlyVarD)), qhd.class, new ResultCallback<qhd>() { // from class: dmc.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(qhd qhdVar) {
                if (qhdVar == null) {
                    ReleaseLogUtil.a("ThreeCircle_CloudManager", "queryEncourage data == null");
                } else {
                    ReleaseLogUtil.d("ThreeCircle_CloudManager", "queryEncourage onSuccess.", peh.c(qhdVar));
                    uiCallback.onSuccess(qhdVar);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                if (th != null) {
                    ReleaseLogUtil.e("ThreeCircle_CloudManager", "queryEncourage throwable:", th.getMessage());
                } else {
                    ReleaseLogUtil.e("ThreeCircle_CloudManager", "queryEncourage throwable null");
                }
            }
        });
    }

    private static HealthDataCloudFactory c() {
        return new HealthDataCloudFactory(BaseApplication.b());
    }
}
