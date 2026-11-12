package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dxp {
    public static void b(String str, PullListener pullListener) {
        EzPluginManager.b().d(str, d(), "?deviceType=bodyFatScales", pullListener);
    }

    public static void e(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || iBaseResponseCallback == null) {
            LogUtil.j("ResourceManagerUtil", "init updateResourceByProductId is error");
        } else {
            EzPluginManager.b().c(new PullListener() { // from class: dxq
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    dxp.c(iBaseResponseCallback, str, pisVar, pitVar);
                }
            });
        }
    }

    static /* synthetic */ void c(final IBaseResponseCallback iBaseResponseCallback, final String str, pis pisVar, pit pitVar) {
        if (pitVar == null) {
            LogUtil.j("ResourceManagerUtil", "updateResourceByProductId pullResult is null");
            iBaseResponseCallback.a(-1, AuthInternalPickerConstant.UNKOWN_ERROR);
            return;
        }
        int iF = pitVar.f();
        if (iF != 1) {
            LogUtil.a("ResourceManagerUtil", "fetchStatus is:", Integer.valueOf(iF));
            iBaseResponseCallback.a(iF, pitVar);
        } else {
            EzPluginManager.b().e();
            iBaseResponseCallback.a(0, pitVar);
            EzPluginManager.b().e(str, new PullListener() { // from class: dxt
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar2, pit pitVar2) {
                    dxp.c(str, iBaseResponseCallback, pisVar2, pitVar2);
                }
            });
        }
    }

    static /* synthetic */ void c(String str, IBaseResponseCallback iBaseResponseCallback, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        LogUtil.a("ResourceManagerUtil", "download status:", Integer.valueOf(iF));
        if (iF == 20) {
            a(str, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(-11, pitVar);
        }
    }

    private static void a(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            iBaseResponseCallback.a(-1, "resourceDomainName is empty");
        } else {
            EzPluginManager.b().a(str, strE, new PullListener() { // from class: dxs
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    dxp.b(str, iBaseResponseCallback, pisVar, pitVar);
                }
            });
        }
    }

    static /* synthetic */ void b(String str, IBaseResponseCallback iBaseResponseCallback, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        LogUtil.a("ResourceManagerUtil", "downLoadDescriptionJsonFile onPullingChange uuid:", str, ", result:", Integer.valueOf(pitVar.f()));
        if (pitVar.f() == 1) {
            b(str, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(iF, "download description fail");
        }
    }

    private static void b(String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || iBaseResponseCallback == null) {
            LogUtil.j("ResourceManagerUtil", "init downloadSingleResource is error");
            return;
        }
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            iBaseResponseCallback.a(-1, "resourceDomainName is empty");
        } else {
            EzPluginManager.b().d(str, strE, new PullListener() { // from class: dxr
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    dxp.c(iBaseResponseCallback, pisVar, pitVar);
                }
            });
        }
    }

    static /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback, pis pisVar, pit pitVar) {
        if (pisVar == null || pitVar == null) {
            LogUtil.a("ResourceManagerUtil", "onPullingChange param is null");
            iBaseResponseCallback.a(-1, AuthInternalPickerConstant.UNKOWN_ERROR);
            return;
        }
        int iF = pitVar.f();
        LogUtil.a("ResourceManagerUtil", "downloadOneZipFile result status = ", Integer.valueOf(iF), ",and uuid = ", pisVar.o());
        if (iF == 1) {
            iBaseResponseCallback.a(1, pitVar);
        } else if (iF == 0) {
            iBaseResponseCallback.a(0, pitVar);
        } else {
            iBaseResponseCallback.a(iF, pitVar);
        }
    }

    private static String e() {
        if (CommonUtil.af(BaseApplication.getContext()) || c()) {
            return "com.huawei.health_HwWear_deviceConfig";
        }
        return "com.huawei.health_HwWear_deviceConfigBeta";
    }

    private static String d() {
        String str;
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey("HDK_WEIGHT")) {
            str = CommonUtil.bu() ? pip.e.get("HDK_WEIGHT") : pip.f45448b.get("HDK_WEIGHT");
        } else if (CommonUtil.bu() || c()) {
            str = "com.huawei.health_HwWear_deviceConfig";
        } else {
            str = "com.huawei.health_HwWear_deviceConfigBeta";
        }
        LogUtil.a("ResourceManagerUtil", "getScaleConfigServiceName is ", str);
        return str;
    }

    private static boolean c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_TEST_SITE", "app_test_site_type");
        LogUtil.a("ResourceManagerUtil", "deviceSite:", strE2);
        return CommonUtil.ap() && "1".equals(strE) && "release".equals(strE2);
    }

    public static boolean b() {
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        LogUtil.a("ResourceManagerUtil", "checkIndexAllResourcesExists deviceInfos:", Boolean.valueOf(njy.e(deviceList)));
        if (!njy.e(deviceList)) {
            return false;
        }
        LogUtil.j("ResourceManagerUtil", "DevicePluginInfoBean is null");
        return true;
    }
}
