package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.callback.DownloadCallback;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hmf.services.internal.ApplicationContext;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class efi {
    public void d(String str, String str2, boolean z, final DownloadCallback downloadCallback) {
        ProductMapInfo productMapInfoD = ProductMap.d(str2);
        if (productMapInfoD == null) {
            LogUtil.j("DownloadResourceUtils", "productMapInfo is null");
            downloadCallback.onFailure(1001);
            return;
        }
        String strF = productMapInfoD.f();
        if (TextUtils.isEmpty(strF)) {
            LogUtil.j("DownloadResourceUtils", "productId is isEmpty");
            downloadCallback.onFailure(1001);
            return;
        }
        DeviceDownloadSourceInfo deviceDownloadSourceInfoB = b(strF);
        if (z && deviceDownloadSourceInfoB == null) {
            LogUtil.j("DownloadResourceUtils", "set index_all downloadResourceInfo fail");
            downloadCallback.onFailure(1003);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strF);
        esw eswVar = new esw(BaseApplication.getContext(), str, 2, arrayList, new est() { // from class: efi.4
            @Override // defpackage.ess
            public void onDownload(int i) {
            }

            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("DownloadResourceUtils", "downloadSingleDeviceResource onSuccess");
                downloadCallback.onSuccess();
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.j("DownloadResourceUtils", "downloadSingleDeviceResource onFailure");
                downloadCallback.onFailure(i);
            }
        });
        if (deviceDownloadSourceInfoB != null) {
            eswVar.e(deviceDownloadSourceInfoB);
        }
        eswVar.b();
    }

    private DeviceDownloadSourceInfo b(String str) {
        LogUtil.a("DownloadResourceUtils", "isSetIndexAllDownloadResource");
        List<pjc> listC = piq.e().c(str);
        if (njy.b(listC)) {
            pjc pjcVar = listC.get(0);
            if (pjcVar.a() != null && pjcVar.a().size() > 0) {
                return listC.get(0).a().get(0).a();
            }
            return listC.get(0).g();
        }
        LogUtil.j("DownloadResourceUtils", "devicePluginInfoBeans is isEmpty");
        return null;
    }

    public void d(final DownloadCallback downloadCallback) {
        if (lql.a(ApplicationContext.getContext())) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: efi.5
                @Override // java.lang.Runnable
                public void run() {
                    if (!lql.b(ApplicationContext.getContext(), 2)) {
                        LogUtil.j("DownloadResourceUtils", "isDownloadMapSuccess is false");
                        downloadCallback.onFailure(1000);
                    } else {
                        downloadCallback.onSuccess();
                        LogUtil.a("DownloadResourceUtils", "isDownloadMapSuccess is true");
                    }
                }
            });
        } else if (ProductMapParseUtil.a(ApplicationContext.getContext())) {
            LogUtil.a("DownloadResourceUtils", "loadProductMapConfig is true");
            downloadCallback.onSuccess();
        } else {
            LogUtil.j("DownloadResourceUtils", "loadProductMapConfig is false");
            downloadCallback.onFailure(1001);
        }
    }

    public void a(final DownloadCallback downloadCallback) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            downloadCallback.onFailure(1004);
            return;
        }
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        downloadManagerApi.addDownloadIndexAllCallBack(new DownloadResultCallBack() { // from class: efi.2
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
            public void setDownloadStatus(int i, int i2) {
                if (i == 0) {
                    return;
                }
                LogUtil.a("DownloadResourceUtils", "setDownloadStatus status: ", Integer.valueOf(i));
                if (i == 1) {
                    piq.e().c();
                    downloadCallback.onSuccess();
                } else {
                    downloadCallback.onFailure(1002);
                    LogUtil.j("DownloadResourceUtils", "startDownloadResource  DOWNLOAD_TIME_OUT");
                }
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
            }
        });
        ReleaseLogUtil.d("DownloadResourceUtils", "downLoad index_all");
        downloadManagerApi.downloadIndexAll();
    }
}
