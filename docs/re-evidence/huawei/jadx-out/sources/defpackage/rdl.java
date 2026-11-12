package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.api.OfflineMapApi;
import com.huawei.health.device.callback.DownloadCityCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitOptions;
import com.huawei.maps.offlinedata.health.init.OfflineMapPoint;
import com.huawei.maps.offlinedata.health.init.OnCheckRegionListListener;
import com.huawei.maps.offlinedata.health.init.OnCreateResultListener;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.device.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = OfflineMapApi.class)
public class rdl implements OfflineMapApi {
    static /* synthetic */ void a(boolean z) {
    }

    @Override // com.huawei.health.device.api.OfflineMapApi
    public void initOfflineMap(String str) {
        LogUtil.a("OfflineMapImpl", "initOfflineMap");
        rdo.b().a(BaseApplication.b(), str);
    }

    @Override // com.huawei.health.device.api.OfflineMapApi
    public void queryingDownloadCity(List<jpg> list, final DownloadCityCallback downloadCityCallback) {
        if (njy.e(list)) {
            LogUtil.e("OfflineMapImpl", "points is null in queryingDownloadCity");
            return;
        }
        LogUtil.a("OfflineMapImpl", "queryingDownloadCity points size ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        for (jpg jpgVar : list) {
            OfflineMapPoint offlineMapPoint = new OfflineMapPoint();
            offlineMapPoint.setLat(jpgVar.d);
            offlineMapPoint.setLng(jpgVar.f38787a);
            arrayList.add(offlineMapPoint);
        }
        OfflineMapInitManager.getInstance().getRegionByLatLngs(BaseApplication.b(), arrayList, new OnCheckRegionListListener() { // from class: rdl.2
            @Override // com.huawei.maps.offlinedata.health.init.OnCheckRegionListListener
            public void onResult(List<String> list2) {
                LogUtil.a("OfflineMapImpl", "cityList = ", list2);
                DownloadCityCallback downloadCityCallback2 = downloadCityCallback;
                if (downloadCityCallback2 != null) {
                    downloadCityCallback2.onResponse(list2);
                }
            }
        });
    }

    @Override // com.huawei.health.device.api.OfflineMapApi
    public void jumpToOfflineMap(final DeviceInfo deviceInfo, final List<String> list) {
        LogUtil.a("OfflineMapImpl", "jumpToOfflineMap cityIdList ", list);
        if (deviceInfo == null) {
            LogUtil.e("OfflineMapImpl", "deviceInfo is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.e("OfflineMapImpl", "cityIdList is empty");
        } else if (mga.h()) {
            qpx.e(BaseApplication.b(), R.string.IDS_offline_map_mcu_mode_tip);
        } else {
            lsy.a(new Runnable() { // from class: rdm
                @Override // java.lang.Runnable
                public final void run() {
                    rdl.d(deviceInfo, list);
                }
            });
        }
    }

    static /* synthetic */ void d(DeviceInfo deviceInfo, List list) {
        H5proUtil.initH5pro();
        OfflineMapInitOptions offlineMapInitOptions = new OfflineMapInitOptions();
        offlineMapInitOptions.setContext(BaseApplication.f());
        offlineMapInitOptions.setDeviceName(deviceInfo.getDeviceName());
        offlineMapInitOptions.setUniqueDevice(deviceInfo.getDeviceUdid());
        offlineMapInitOptions.setH5proUrl(rdo.b().d());
        offlineMapInitOptions.setRecommendCityIds((String[]) list.toArray(new String[0]));
        if (OfflineMapInitManager.getInstance().createOfflineDataMap(offlineMapInitOptions, new OnCreateResultListener() { // from class: rdk
            @Override // com.huawei.maps.offlinedata.health.init.OnCreateResultListener
            public final void onCreateResult(boolean z) {
                rdl.a(z);
            }
        })) {
            return;
        }
        xjt.ai("open map page error");
    }
}
