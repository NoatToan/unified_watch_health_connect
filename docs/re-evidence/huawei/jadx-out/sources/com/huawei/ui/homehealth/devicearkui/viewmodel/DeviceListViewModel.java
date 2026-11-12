package com.huawei.ui.homehealth.devicearkui.viewmodel;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.BitmapCallBack;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import defpackage.dru;
import defpackage.edl;
import defpackage.eep;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.lvi;
import defpackage.pig;
import defpackage.rpq;
import defpackage.rqk;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceListViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25387b;

    public void e(dru druVar, BitmapCallBack bitmapCallBack) {
        Context contextB = BaseApplication.b();
        DeviceInfo deviceInfoA = druVar.a();
        if (druVar.d() != null) {
            e(druVar.e(), (elh) druVar.i(), bitmapCallBack);
            return;
        }
        if (deviceInfoA == null) {
            LogUtil.j("DeviceListViewModel", "setWearDevice DeviceInfoForWear is null");
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(contextB.getResources(), R.mipmap.device_icon_watch_default));
            return;
        }
        int productType = deviceInfoA.getProductType();
        LogUtil.a("DeviceListViewModel", "getView wear device deviceType is : ", Integer.valueOf(productType));
        if (lvi.n(productType)) {
            LogUtil.a("DeviceListViewModel", "is plugin download");
            String strJ = lvi.j(productType);
            LogUtil.a("DeviceListViewModel", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            ReleaseLogUtil.d("R_DeviceListViewModel", "download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable), "  deviceType:", Integer.valueOf(productType));
            if (zIsResourcesAvailable) {
                c(productType, strJ, deviceInfoA, bitmapCallBack);
                return;
            } else if (lvi.f(productType)) {
                bitmapCallBack.onCallback(BitmapFactory.decodeResource(contextB.getResources(), R.mipmap.device_icon_band_default));
                return;
            } else {
                bitmapCallBack.onCallback(BitmapFactory.decodeResource(contextB.getResources(), R.mipmap.device_icon_watch_default));
                return;
            }
        }
        String deviceName = deviceInfoA.getDeviceName();
        ReleaseLogUtil.d("R_DeviceListViewModel", "set imageView default. deviceType:", Integer.valueOf(productType), ",deviceName", CommonUtil.n(deviceName));
        if (!TextUtils.isEmpty(deviceName) && deviceName.contains("HUAWEI CM-R1P")) {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(contextB.getResources(), R.mipmap.id_devicemanager_r1_pro));
        } else {
            a(productType, deviceInfoA, bitmapCallBack);
        }
    }

    private void e(int i, elh elhVar, BitmapCallBack bitmapCallBack) {
        ReleaseLogUtil.d("R_DeviceListViewModel", "enter dealTripartiteEquipmentImage");
        Context contextB = BaseApplication.b();
        if (elhVar.d().size() <= 0) {
            LogUtil.a("DeviceListViewModel", "item.getDescriptions().size() <= 0");
            if (i == 3 || i == 6) {
                bitmapCallBack.onCallback(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
                return;
            } else {
                bitmapCallBack.onCallback(BitmapFactory.decodeResource(contextB.getResources(), elo.a(elhVar.l().b())));
                return;
            }
        }
        bitmapCallBack.onCallback(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
    }

    private void a(int i, DeviceInfo deviceInfo, BitmapCallBack bitmapCallBack) {
        Resources resources = BaseApplication.b().getResources();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, lvi.a(deviceInfo.getProductType()).y());
        if (bitmapDecodeResource != null) {
            bitmapCallBack.onCallback(bitmapDecodeResource);
        } else if (lvi.f(i)) {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(resources, R.mipmap.device_icon_band_default));
        } else {
            bitmapCallBack.onCallback(BitmapFactory.decodeResource(resources, R.mipmap.device_icon_watch_default));
        }
    }

    private void c(final int i, final String str, final DeviceInfo deviceInfo, final BitmapCallBack bitmapCallBack) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sfv
            @Override // java.lang.Runnable
            public final void run() {
                this.f48011a.c(str, deviceInfo, i, bitmapCallBack);
            }
        });
    }

    public /* synthetic */ void c(String str, DeviceInfo deviceInfo, int i, BitmapCallBack bitmapCallBack) {
        Bitmap bitmapDecodeResource;
        String strE;
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            bitmapDecodeResource = null;
        } else {
            if (deviceInfo instanceof CloudDeviceInfo) {
                strE = eep.c(pluginInfoByUuid, 1, deviceInfo);
            } else {
                strE = eep.e(pluginInfoByUuid, 1, deviceInfo);
            }
            LogUtil.a("DeviceListViewModel", "setWearDevicePluginImage image:", strE, " code:", CommonUtil.n(deviceInfo.getDeviceIdentify()), "version:", pluginInfoByUuid.b());
            bitmapDecodeResource = b(pluginInfoByUuid, strE, i);
        }
        if (bitmapDecodeResource == null) {
            ReleaseLogUtil.d("R_DeviceListViewModel", "setWearDevicePluginImage loadImageForWear bitmap is null");
            Resources resources = BaseApplication.b().getResources();
            if (lvi.f(i)) {
                bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.mipmap.device_icon_band_default);
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.mipmap.device_icon_watch_default);
            }
        }
        if (bitmapDecodeResource == null) {
            ReleaseLogUtil.d("R_DeviceListViewModel", "setWearDevicePluginImage bitmap==null");
        } else {
            bitmapCallBack.onCallback(bitmapDecodeResource);
        }
    }

    private Bitmap b(edl edlVar, String str, int i) {
        LogUtil.a("DeviceListViewModel", "loadImageForWear enter loadImageForWear");
        if (edlVar != null) {
            try {
                String str2 = pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + str + ".png";
                if (new File(str2).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inInputShareable = true;
                    LogUtil.a("DeviceListViewModel", "enter loadImageForWear have bitmap imageKey:", str, " fetchPluginUuid:", edlVar.c());
                    return BitmapFactory.decodeFile(str2, options);
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("DeviceListViewModel", "loadImageForWear loadImage NotFoundException");
            }
        }
        Resources resources = BaseApplication.b().getResources();
        if (lvi.f(i)) {
            return BitmapFactory.decodeResource(resources, R.mipmap.device_icon_band_default);
        }
        return BitmapFactory.decodeResource(resources, R.mipmap.device_icon_watch_default);
    }

    public void e() {
        rpq.c(FeatureType.ALL_DEVICE).jumpToFeaturePage(null, new SimpleChain.Emitter() { // from class: sfr
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("DeviceListViewModel", "jumpToMoreDeviceActivity");
            }
        });
    }

    public void d(Activity activity, dru druVar) {
        rqk rqkVar = (rqk) rpq.c(FeatureType.DEVICE_DETAIL);
        if (activity == null) {
            ReleaseLogUtil.d("R_DeviceListViewModel", "jumpToDeviceDetailActivity activity is null");
            return;
        }
        DeviceInfo deviceInfoA = druVar.a();
        if (deviceInfoA != null) {
            rqkVar.a(activity, deviceInfoA);
            return;
        }
        ContentValues contentValuesD = druVar.d();
        if (contentValuesD != null) {
            rqkVar.e(activity, contentValuesD, (elh) druVar.i());
        }
    }

    public boolean d() {
        return this.f25387b;
    }

    public void a(boolean z) {
        this.f25387b = z;
    }
}
