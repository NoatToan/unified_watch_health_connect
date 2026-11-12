package defpackage;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.template.ResourceDownloadHelper;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ipx {
    public static void b() {
        String strReplace;
        long j;
        if (Utils.o()) {
            LogUtil.j("Login_HealthDataConfigUtil", "For versions outside China, do not download resources.");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10006), "health_detail_page_framework_config_info_download_key");
        if (StringUtils.g(strE)) {
            e();
            return;
        }
        try {
            if (strE.startsWith(MonitorResult.SUCCESS)) {
                strReplace = strE.replace(MonitorResult.SUCCESS, "");
                LogUtil.a("Login_HealthDataConfigUtil", "already download success, next update interval: ONE_WEEK");
                j = 604800000;
            } else {
                strReplace = strE.replace("FAILURE", "");
                LogUtil.a("Login_HealthDataConfigUtil", "last download failed, next update interval: ONE_HOUR");
                j = 3600000;
            }
            if (System.currentTimeMillis() - Long.parseLong(strReplace) > j) {
                LogUtil.a("Login_HealthDataConfigUtil", "More than 1 hour or 7 days have elapsed since the last configuration download.");
                e();
            } else {
                LogUtil.j("Login_HealthDataConfigUtil", "The last configuration download has not been more than 1 hour or 7 days.");
            }
        } catch (NumberFormatException unused) {
            e();
            LogUtil.a("Login_HealthDataConfigUtil", "download HealthDetailPageFrameworkConfigInfo: get last time Download error");
        }
    }

    private static void e() {
        LogUtil.a("Login_HealthDataConfigUtil", "downloadHealthDetailPageFrameworkConfigInfo");
        new ResourceDownloadHelper().a(new ResourceDownloadHelper.FileResult() { // from class: ipx.3
            @Override // com.huawei.ui.main.stories.template.ResourceDownloadHelper.FileResult
            public void onFail(List<String> list) {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10006), "health_detail_page_framework_config_info_download_key", "FAILURE" + System.currentTimeMillis(), null);
                if (njy.b(list)) {
                    LogUtil.e("Login_HealthDataConfigUtil", "Health Detail Page Framework Resource Download fail：", list.toString());
                } else {
                    LogUtil.e("Login_HealthDataConfigUtil", "Health Detail Page Framework Resource Download fail.");
                }
            }

            @Override // com.huawei.ui.main.stories.template.ResourceDownloadHelper.FileResult
            public void onSuccess() {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10006), "health_detail_page_framework_config_info_download_key", MonitorResult.SUCCESS + System.currentTimeMillis(), null);
                LogUtil.a("Login_HealthDataConfigUtil", "Health Detail Page Framework Resource Download success");
            }
        });
    }
}
