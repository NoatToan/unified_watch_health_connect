package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.CommonInfo;
import com.huawei.hwversionmgr.info.ComponentVersion;
import com.huawei.hwversionmgr.info.MarketFlag;
import com.huawei.hwversionmgr.info.NonceResponseInfo;
import com.huawei.hwversionmgr.info.PsiUploadRequestInfo;
import com.huawei.hwversionmgr.info.PsiUploadResponseInfo;
import com.huawei.hwversionmgr.info.SecurityInfo;
import com.huawei.hwversionmgr.info.SystemVersion;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class nuz {
    public static void d(final ResultCallback<NonceResponseInfo> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nuz.3
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(16);
                String str = nuz.j() + "/v1/psi/nonce";
                LogUtil.d("PsiUpdateManager", "queryNonceDetail url= ", str);
                oet.c(nuz.e()).e(str, nuz.b(), map, NonceResponseInfo.class, resultCallback);
            }
        });
    }

    public static void c(final DeviceInfo deviceInfo, final String str, final boolean z, final ResultCallback<PsiUploadResponseInfo> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nuz.4
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                String str3;
                String strL;
                String str4 = nuz.j() + "/v1/psi/upload";
                String str5 = "";
                if (z) {
                    str4 = nuz.j() + "/v1/ecard/upload";
                    str5 = "Y";
                    strL = "";
                } else {
                    if (Utils.o()) {
                        str2 = str4;
                        str3 = "";
                    } else {
                        strL = nvd.l(BaseApplication.getContext());
                    }
                    String strE = nuz.e(deviceInfo, str, str5, str3);
                    LogUtil.d("PsiUpdateManager", "queryPsiUploadDetail url= ", str2);
                    oet.c(nuz.e()).c(str2, nuz.b(), strE, PsiUploadResponseInfo.class, resultCallback);
                }
                str2 = str4;
                str3 = str5;
                str5 = strL;
                String strE2 = nuz.e(deviceInfo, str, str5, str3);
                LogUtil.d("PsiUpdateManager", "queryPsiUploadDetail url= ", str2);
                oet.c(nuz.e()).c(str2, nuz.b(), strE2, PsiUploadResponseInfo.class, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(DeviceInfo deviceInfo, String str, String str2, String str3) {
        CommonInfo commonInfo = new CommonInfo();
        if (TextUtils.isEmpty(str3)) {
            commonInfo.setCheckMode("PSI");
            commonInfo.setSaleInfo(deviceInfo.getSaleInfo() == null ? "|||||||" : deviceInfo.getSaleInfo());
        } else {
            commonInfo.setCheckMode("E-Card");
            commonInfo.setIsActivate(str3);
        }
        commonInfo.setClientType(com.huawei.haf.application.BaseApplication.g());
        commonInfo.setClientVersion(String.valueOf(com.huawei.haf.application.BaseApplication.c()));
        commonInfo.setDevModel(deviceInfo.getDeviceModel());
        commonInfo.setDeviceType("SportWatch");
        commonInfo.setPlmn("00000");
        commonInfo.setUsageInfo("||| |||");
        SecurityInfo securityInfo = new SecurityInfo();
        securityInfo.setChallenge(str);
        securityInfo.setDeviceCertificate(deviceInfo.getPsiSignature() != null ? deviceInfo.getPsiSignature() : "|||||||");
        securityInfo.setKeyAttestation("NA");
        securityInfo.setSecurityMode("pubKey");
        com.huawei.hwversionmgr.info.DeviceInfo deviceInfo2 = new com.huawei.hwversionmgr.info.DeviceInfo();
        deviceInfo2.setImei("");
        deviceInfo2.setUdid(deviceInfo.getDeviceUdid());
        deviceInfo2.setDeviceId(deviceInfo.getSecurityDeviceId());
        deviceInfo2.setLocation(str2);
        ComponentVersion componentVersion = new ComponentVersion();
        componentVersion.setBaseVersion(deviceInfo.getSoftVersion());
        componentVersion.setCustVersion(deviceInfo.getDeviceEnterpriseVersion());
        componentVersion.setPreloadVersion("");
        SystemVersion systemVersion = new SystemVersion();
        systemVersion.setCurrentVersion(deviceInfo.getSoftVersion());
        systemVersion.setSoftwareOSVersion(deviceInfo.getDeviceOStVersion());
        systemVersion.setSecurityPatchLevel("");
        MarketFlag marketFlag = new MarketFlag();
        marketFlag.setPostCustFlag("");
        marketFlag.setPreCustFlag("");
        PsiUploadRequestInfo psiUploadRequestInfo = new PsiUploadRequestInfo();
        psiUploadRequestInfo.setCommonInfo(commonInfo);
        psiUploadRequestInfo.setSecurityInfo(securityInfo);
        psiUploadRequestInfo.setDeviceInfo(deviceInfo2);
        psiUploadRequestInfo.setComponentVersion(componentVersion);
        psiUploadRequestInfo.setSystemVersion(systemVersion);
        psiUploadRequestInfo.setMarketFlag(marketFlag);
        psiUploadRequestInfo.setExtraInfo("");
        String strC = ofe.c(psiUploadRequestInfo);
        LogUtil.d("PsiUpdateManager", "getRequestBody body= ", strC);
        return strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j() {
        if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode")) {
            return "";
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("psiUploadUrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> b() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("x-productId", "Huawei Health");
        map.put("x-deviceDescId", BaseApplication.getAppPackage());
        map.put("x-devModel", nvp.e());
        String string = UUID.randomUUID().toString();
        LogUtil.a("PsiUpdateManager", "getHeaders x-requestId= ", string);
        map.put("x-requestId", string);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpClient e() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(8000).readTimeout(8000).build();
    }
}
