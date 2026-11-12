package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.EnterpriseRequestInfo;
import com.huawei.hwversionmgr.info.EnterpriseResponseInfo;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nut {
    public static void b(final int i, final String str, final ResultCallback<EnterpriseResponseInfo> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nut.2
            @Override // java.lang.Runnable
            public void run() {
                EnterpriseRequestInfo enterpriseRequestInfo = new EnterpriseRequestInfo();
                enterpriseRequestInfo.setDeviceCertificate("");
                enterpriseRequestInfo.setKeyAttestation("");
                enterpriseRequestInfo.setDeviceId(str);
                enterpriseRequestInfo.setExpiredTime(String.valueOf(i));
                LogUtil.j("EnterpriseUpdateManager", "RequestHelper.deviceSn = ", CommonUtil.n(str));
                oet.c(nut.h()).c(nut.b(), nut.j(), ofe.c(enterpriseRequestInfo), EnterpriseResponseInfo.class, nut.c(resultCallback));
            }
        });
    }

    public static void c(int i, final String str, final ResultCallback<nug> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nut.1
            @Override // java.lang.Runnable
            public void run() {
                nuh nuhVar = new nuh();
                nuhVar.e(str);
                LogUtil.j("EnterpriseUpdateManager", "queryHealthKitCustomizedDetail RequestHelper.deviceSn = ", CommonUtil.n(str));
                oet.d().c(nut.g(), dlv.d(), ofe.c(ofe.a(nuhVar)), nug.class, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b() {
        String str;
        if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode")) {
            str = "/cqs/service/out/sds/v1/queryEnterpriseByDeviceId";
        } else {
            str = GRSManager.c(BaseApplication.getContext()).getUrl("enterpriseUrl") + "/service/out/sds/v1/queryEnterpriseByDeviceId";
        }
        LogUtil.j("EnterpriseUpdateManager", "getEnterpriseUrl = ", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + "/deviceAgent/devices/customization:query";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResultCallback<EnterpriseResponseInfo> c(final ResultCallback<EnterpriseResponseInfo> resultCallback) {
        return new ResultCallback<EnterpriseResponseInfo>() { // from class: nut.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(EnterpriseResponseInfo enterpriseResponseInfo) {
                if (resultCallback != null) {
                    LogUtil.j("EnterpriseUpdateManager", "RequestHelper.toJson = ", enterpriseResponseInfo.toString());
                    resultCallback.onSuccess(enterpriseResponseInfo);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ResultCallback resultCallback2 = resultCallback;
                if (resultCallback2 != null) {
                    resultCallback2.onFailure(th);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> j() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Connection", w9.j);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpClient h() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(8000).readTimeout(8000).build();
    }
}
