package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class efj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile efj f32873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32874c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DownloadDeviceInfoCallBack f32875a;
    private List<?> d = new ArrayList(16);
    private DeviceDownloadSourceInfo e;
    private String h;
    private boolean i;

    private efj() {
    }

    public static efj c() {
        if (f32873b == null) {
            synchronized (f32874c) {
                if (f32873b == null) {
                    f32873b = new efj();
                }
            }
        }
        return f32873b;
    }

    public DeviceDownloadSourceInfo e() {
        return this.e;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void a(String str, String str2, DownloadDeviceInfoCallBack downloadDeviceInfoCallBack) {
        this.h = str2;
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setHiLinkDeviceId(str2);
        b(str, Collections.singletonList(deviceInfo), downloadDeviceInfoCallBack);
    }

    public void b(final String str, List<?> list, DownloadDeviceInfoCallBack downloadDeviceInfoCallBack) {
        LogUtil.a("DownloadResourceFileHelper", "handleUpdateProductMap");
        if (downloadDeviceInfoCallBack == null) {
            LogUtil.a("DownloadResourceFileHelper", "handleUpdateProductMap callBack is null");
            return;
        }
        this.f32875a = downloadDeviceInfoCallBack;
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("DownloadResourceFileHelper", "handleUpdateProductMap: deviceInfoList or kindName is empty");
            c(104);
            return;
        }
        this.d = list;
        LogUtil.a("DownloadResourceFileHelper", "handleUpdateProductMap: list.size = ", Integer.valueOf(list.size()));
        if (lql.a(BaseApplication.getContext())) {
            if (d()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: efh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32869b.e(str);
                    }
                });
                return;
            } else {
                LogUtil.j("DownloadResourceFileHelper", "not have net, not download Map");
                c(103);
                return;
            }
        }
        ProductMapParseUtil.a(BaseApplication.getContext());
        a(str);
    }

    /* synthetic */ void e(String str) {
        if (lql.b(BaseApplication.getContext(), 2)) {
            a(str);
        } else {
            LogUtil.a("DownloadResourceFileHelper", "handleUpdateProductMap download map fail");
            c(102);
        }
    }

    public void b(Context context, String str) {
        SharedPreferenceManager.e(context, "RESOURCE_UPDATA_TIME_CONFIG", str, Long.toString(System.currentTimeMillis()), new StorageParams());
    }

    public boolean d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DownloadResourceFileHelper", "isNeedUpdataResourceTimeConfig context or devicePid is null");
            return false;
        }
        boolean z = System.currentTimeMillis() - CommonUtil.i(SharedPreferenceManager.e(context, "RESOURCE_UPDATA_TIME_CONFIG", str)) > 86400000;
        LogUtil.a("DownloadResourceFileHelper", "isNeedUpdataResourceTimeConfig isNeedUpdate = ", Boolean.valueOf(z));
        return z;
    }

    private void a(String str) {
        LogUtil.a("DownloadResourceFileHelper", "handleDownloadResource kindName = ", str);
        ArrayList arrayList = new ArrayList(this.d.size());
        for (Object obj : this.d) {
            if (obj instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) obj;
                ProductMapInfo productMapInfoD = ProductMap.d(deviceInfo.getHiLinkDeviceId());
                if (productMapInfoD == null) {
                    LogUtil.j("DownloadResourceFileHelper", "handleDownloadResource sportProductInfo is null");
                    c(102);
                    return;
                }
                String strF = productMapInfoD.f();
                LogUtil.a("DownloadResourceFileHelper", "handleDownloadResource productId is:", strF);
                if (TextUtils.isEmpty(strF)) {
                    LogUtil.j("DownloadResourceFileHelper", "handleDownloadResource sportProductInfo is null");
                    c(102);
                    return;
                } else {
                    deviceInfo.setProductId(strF);
                    arrayList.add(strF);
                }
            } else {
                LogUtil.a("DownloadResourceFileHelper", "handleDownloadResource object not match DeviceInfo");
                c(104);
                return;
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.a("DownloadResourceFileHelper", "productIdList.size() is 0");
            c(101);
        }
        c(str, arrayList);
    }

    private void c(String str, List<String> list) {
        esw eswVar = new esw(BaseApplication.getContext(), str, 2, list, new est() { // from class: efj.3
            @Override // defpackage.ess
            public void onDownload(int i) {
            }

            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("DownloadResourceFileHelper", "HadDownloadSingleDevice onSuccess");
                efj.this.c(100);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.a("DownloadResourceFileHelper", "HadDownloadSingleDevice onFailure");
                efj.this.c(i);
            }
        });
        if (this.i && !a()) {
            LogUtil.j("DownloadResourceFileHelper", "set index_all downloadResourceInfo fail");
            c(101);
        } else {
            DeviceDownloadSourceInfo deviceDownloadSourceInfo = this.e;
            if (deviceDownloadSourceInfo != null) {
                eswVar.e(deviceDownloadSourceInfo);
            }
            eswVar.b();
        }
    }

    private boolean a() {
        LogUtil.a("DownloadResourceFileHelper", "isSetIndexAllDownloadResource");
        ProductMapInfo productMapInfoD = ProductMap.d(this.h);
        if (productMapInfoD == null) {
            LogUtil.j("DownloadResourceFileHelper", "productMapInfo is null");
            return false;
        }
        String strF = productMapInfoD.f();
        if (TextUtils.isEmpty(strF)) {
            LogUtil.j("DownloadResourceFileHelper", "productId is isEmpty");
            return false;
        }
        List<pjc> listC = piq.e().c(strF);
        if (njy.b(listC)) {
            pjc pjcVar = listC.get(0);
            if (pjcVar.a() != null && pjcVar.a().size() > 0) {
                this.e = listC.get(0).a().get(0).a();
                return true;
            }
            this.e = listC.get(0).g();
            return true;
        }
        LogUtil.j("DownloadResourceFileHelper", "devicePluginInfoBeans is isEmpty");
        return false;
    }

    private boolean d() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.j("DownloadResourceFileHelper", "not have net, not download");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("DownloadResourceFileHelper", "callBackDownloadResult resultCode = ", Integer.valueOf(i));
        DownloadDeviceInfoCallBack downloadDeviceInfoCallBack = this.f32875a;
        if (downloadDeviceInfoCallBack != null) {
            if (i == 100) {
                downloadDeviceInfoCallBack.onSuccess();
            } else if (i == 103) {
                downloadDeviceInfoCallBack.onNetworkError();
            } else {
                downloadDeviceInfoCallBack.onFailure(i);
            }
        }
    }

    public void b() {
        if (this.f32875a != null) {
            this.f32875a = null;
        }
    }
}
