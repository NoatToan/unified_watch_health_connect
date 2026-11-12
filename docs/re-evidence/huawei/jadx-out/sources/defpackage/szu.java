package defpackage;

import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class szu {
    public static void b(List<String> list) {
        ReleaseLogUtil.c("Track_SportTabOrderUtils", "saveSportTabOrderToLocal begin. sportTypeList = ", list);
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "sport_type_list", ofe.c(new szf(new szf.e(list))), null);
    }

    public static List<String> d() {
        szf szfVar = (szf) lls.b(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "sport_type_list"), new TypeToken<szf>() { // from class: com.huawei.ui.homehealth.runcard.utils.SportTabOrderUtils$1
        });
        ReleaseLogUtil.c("Track_SportTabOrderUtils", "getSportTabOrderFromLocal = ", szfVar);
        if (szfVar != null && szfVar.c() != null) {
            return szfVar.c().b();
        }
        return new ArrayList();
    }

    public static List<String> a() {
        ReleaseLogUtil.c("Track_SportTabOrderUtils", "getSportTabOrderFromCloud begin.");
        if (!Utils.k() && !LoginInit.getInstance(BaseApplication.b()).isBrowseMode() && !CommonUtil.ca() && !CommonUtil.cl()) {
            HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
            c cVar = new c();
            szf szfVar = (szf) oet.d().e(cVar.getUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(cVar)), szf.class);
            if (!c(szfVar)) {
                ReleaseLogUtil.b("Track_SportTabOrderUtils", "getSportTabOrderFromCloud failed:", szfVar);
                return null;
            }
            ReleaseLogUtil.c("Track_SportTabOrderUtils", "getSportTabOrderFromCloud success:", szfVar);
            if (szfVar.c() != null) {
                return szfVar.c().b();
            }
        }
        return null;
    }

    public static boolean d(List<String> list) {
        ReleaseLogUtil.c("Track_SportTabOrderUtils", "saveSportTabOrderToCloud begin. sportTypeList = ", list);
        if (Utils.k() || LoginInit.getInstance(BaseApplication.b()).isBrowseMode() || CommonUtil.ca()) {
            return false;
        }
        d dVar = new d();
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) oet.d().e(dVar.getUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(new szf(new szf.e(list)))), CloudCommonReponse.class);
        ReleaseLogUtil.c("Track_SportTabOrderUtils", " saveSportTabOrderToCloud response is=", cloudCommonReponse);
        return !c(cloudCommonReponse);
    }

    private static boolean c(CloudCommonReponse cloudCommonReponse) {
        return (cloudCommonReponse == null || cloudCommonReponse.getResultCode() == null || cloudCommonReponse.getResultCode().intValue() != 0) ? false : true;
    }

    static class c implements IRequest {
        private c() {
        }

        @Override // com.huawei.networkclient.IRequest
        public String getUrl() {
            return GRSManager.c(BaseApplication.b()).getUrl("messageCenterUrl") + "/messageCenter/getSportType";
        }
    }

    static class d implements IRequest {
        private d() {
        }

        @Override // com.huawei.networkclient.IRequest
        public String getUrl() {
            return GRSManager.c(BaseApplication.b()).getUrl("messageCenterUrl") + "/messageCenter/saveSportType";
        }
    }
}
