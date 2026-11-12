package defpackage;

import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vxc {
    public static final String c(int i, String str) {
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null) {
            LogUtil.a("LegalInformationHelper", "getUserAgreementUrl descriptionInfo is null");
            return "";
        }
        edz edzVarI = pluginInfoByDeviceType.i();
        if (edzVarI == null) {
            LogUtil.a("LegalInformationHelper", "getUserAgreementUrl pluginInfoForWear is null");
            return "";
        }
        Map<String, String> mapAy = edzVarI.ay();
        if (mapAy == null) {
            LogUtil.a("LegalInformationHelper", "getUserAgreementUrl legalInformation is null");
            return "";
        }
        String str2 = mapAy.get(str);
        LogUtil.a("LegalInformationHelper", "getLegalUrl key: ", str, " url: ", str2);
        return str2;
    }

    public static final String b(int i, String str) {
        edy edyVarD = d(i, str);
        if (edyVarD == null) {
            LogUtil.a("LegalInformationHelper", "getUserLicenseUrl userLicenseInfo is null");
            return "";
        }
        String strB = edyVarD.b();
        LogUtil.a("LegalInformationHelper", "getUserLicenseUrl url: ", strB);
        return strB;
    }

    public static final edy d(int i, String str) {
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null) {
            LogUtil.a("LegalInformationHelper", "getUserLicenseName descriptionInfo is null");
            return null;
        }
        List<edy> listG = pluginInfoByDeviceType.g();
        if (coq.d(listG)) {
            return null;
        }
        for (edy edyVar : listG) {
            if (edyVar != null) {
                List<String> listD = edyVar.d();
                if (!coq.d(listD) && listD.contains(str)) {
                    return edyVar;
                }
            }
        }
        return null;
    }

    public static String a(int i, String str, String str2, String str3) {
        if (i == 84) {
            return String.format(Locale.ENGLISH, str, "CN", "zh-CN");
        }
        return String.format(Locale.ENGLISH, str, str2, str3);
    }
}
