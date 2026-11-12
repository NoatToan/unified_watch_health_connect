package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.wifi.lib.db.dbtable.DeviceListManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAllDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.homehealth.R;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rvd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f47748a = new ArrayList<String>() { // from class: rvd.3
        {
            add("007B");
            add("M00D");
            add("M00F");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CommonDialog21 f47749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47750c = "";

    private void a(String str) {
        if (BaseApplication.getActivity() == null) {
            LogUtil.j("SubUserDeviceHandler", "getActivity() is null please check the sActivityMonitor");
            return;
        }
        if (BaseApplication.getActivity().isFinishing() || BaseApplication.getActivity().isDestroyed()) {
            LogUtil.j("SubUserDeviceHandler", "showLoadingDialog error: activity is finishing");
            return;
        }
        CommonDialog21 commonDialog21 = this.f47749b;
        if (commonDialog21 != null && commonDialog21.isShowing()) {
            LogUtil.j("SubUserDeviceHandler", "mLoadingDialog.isShowing can not show again");
            return;
        }
        if (this.f47749b == null) {
            new CommonDialog21(BaseApplication.getActivity(), R.style.app_update_dialogActivity);
            this.f47749b = CommonDialog21.b(BaseApplication.getActivity());
        }
        this.f47749b.setCancelable(false);
        this.f47749b.b(str);
        this.f47749b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CommonDialog21 commonDialog21 = this.f47749b;
        boolean z = commonDialog21 != null && commonDialog21.isShowing();
        if (BaseApplication.getActivity() == null) {
            LogUtil.j("SubUserDeviceHandler", "getActivity() is null please check the sActivityMonitor");
        } else {
            if (BaseApplication.getActivity().isFinishing() || !z) {
                return;
            }
            this.f47749b.dismiss();
            this.f47749b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, String str) {
        LogUtil.a("SubUserDeviceHandler", "gotoUserInfo");
        if (context == null) {
            LogUtil.j("SubUserDeviceHandler", "gotoUserInfo context is null");
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtra("device", "wifi");
        intent.putExtra("productId", str);
        intent.putExtra("auth_device_id", str);
        intent.setClassName("com.huawei.health", "com.huawei.ui.main.stories.me.activity.BindUserInfoActivity");
        if (!TextUtils.isEmpty(this.f47750c)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.f47750c);
            contentValues.put("productId", str);
            intent.putExtra("commonDeviceInfo", contentValues);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("SubUserDeviceHandler", "gotoUserInfo ActivityNotFoundException");
        }
    }

    public void d(final Context context, final String str) {
        if (context == null) {
            LogUtil.j("SubUserDeviceHandler", "getShareDeviceList context is null");
            return;
        }
        a(context.getString(com.huawei.plugindevice.R.string.IDS_getting_file));
        if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(str)) {
            LogUtil.a("SubUserDeviceHandler", "getShareDeviceList: no product resource");
            a(context, str, 3);
        } else {
            lqo.b(context).d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: rvd.2
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str2, boolean z) {
                    if (z && wifiDeviceGetAllDeviceRsp != null && rvd.this.b(wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList())) {
                        List listA = rvd.this.a(wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList());
                        if (rvd.this.b((List<DeviceDetailInfo>) listA)) {
                            rvd.this.c((List<DeviceDetailInfo>) listA, 2);
                            rvd.this.c(context, str);
                        } else {
                            LogUtil.j("SubUserDeviceHandler", "getShareDeviceList authDevices is null");
                        }
                    } else {
                        LogUtil.j("SubUserDeviceHandler", "getShareDeviceList fail");
                    }
                    rvd.this.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<DeviceDetailInfo> list, int i) {
        if (!b(list)) {
            LogUtil.j("SubUserDeviceHandler", "saveDevice devices is null");
            return;
        }
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (deviceDetailInfo != null && deviceDetailInfo.getDevInfo() != null && ecb.e(deviceDetailInfo.getDevInfo().getProdId())) {
                ecb.a(deviceDetailInfo, "SubUserDeviceHandler");
                String sn = deviceDetailInfo.getDevInfo() != null ? deviceDetailInfo.getDevInfo().getSn() : "";
                if (!TextUtils.isEmpty(sn)) {
                    MeasurableDevice measurableDeviceA = dmp.d().a(sn, false);
                    eby ebyVar = new eby();
                    ebyVar.c(deviceDetailInfo);
                    ebyVar.setAutoDevice(false);
                    ebyVar.a().b(i);
                    b(ebyVar, measurableDeviceA == null);
                }
            }
        }
    }

    private boolean b(eby ebyVar, boolean z) {
        elh elhVarC = c(ebyVar.a().h());
        if (elhVarC != null) {
            ebyVar.setProductId(elhVarC.t());
            ebyVar.setKind(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
            ebyVar.setAutoDevice(false);
            if (z) {
                if (TextUtils.isEmpty(this.f47750c)) {
                    this.f47750c = ebyVar.getUniqueId();
                }
                return c(ebyVar, elhVarC);
            }
            return d(ebyVar, elhVarC);
        }
        LogUtil.j("SubUserDeviceHandler", "saveDevice productInfo is null");
        return false;
    }

    private boolean c(String str, int i) {
        if (!ecj.b(dxw.d())) {
            LogUtil.e("SubUserDeviceHandler", "updateResourceFileWithRetry fail: no network");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("SubUserDeviceHandler", "updateResourceFile: product id is null");
            return false;
        }
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(str)) {
            LogUtil.a("SubUserDeviceHandler", "updateResourceFile: isPluginAvaiable is true");
            return false;
        }
        if (i > 0) {
            return true;
        }
        LogUtil.e("SubUserDeviceHandler", "updateResourceFileWithRetry fail");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final String str, final int i) {
        LogUtil.a("SubUserDeviceHandler", "updateResourceFileWithRetry ", Integer.valueOf(i));
        if (!c(str, i)) {
            LogUtil.j("SubUserDeviceHandler", "can not updateResourceFile");
            c();
        } else {
            dxp.b(str, new PullListener() { // from class: rvd.4
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    if (pitVar == null || pitVar.f() == 0) {
                        return;
                    }
                    LogUtil.a("SubUserDeviceHandler", "updateResourceFile onPullingChange ", Integer.valueOf(pitVar.f()));
                    if (pitVar.f() == 1) {
                        rvd.this.d(context, str);
                    } else {
                        rvd.this.a(context, str, i - 1);
                    }
                }
            });
        }
    }

    private boolean c(eby ebyVar, elh elhVar) {
        return drw.e().a(ebyVar.getProductId(), elhVar.q(), ebyVar, new IDeviceEventHandler() { // from class: rvd.1
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
                LogUtil.a("SubUserDeviceHandler", "saveDevice onDeviceFound");
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
                LogUtil.a("SubUserDeviceHandler", "saveDevice failed code ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a("SubUserDeviceHandler", "saveDevice code ", Integer.valueOf(i));
            }
        });
    }

    private boolean d(eby ebyVar, elh elhVar) {
        return drw.e().c(ebyVar.getProductId(), elhVar.q(), ebyVar, new IDeviceEventHandler() { // from class: rvd.5
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
                LogUtil.j("SubUserDeviceHandler", "updataDevice onScanFailed code ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a("SubUserDeviceHandler", "updataDevice code ", Integer.valueOf(i));
            }
        });
    }

    private elh c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SubUserDeviceHandler", "getProductInfo prodId is null");
            return null;
        }
        LogUtil.a("SubUserDeviceHandler", "getProductInfo prodId is ", str);
        eto etoVarA = DeviceListManager.c(dxw.d()).a(str);
        elh elhVarD = etoVarA != null ? d(etoVarA.d) : null;
        if (elhVarD != null) {
            return elhVarD;
        }
        LogUtil.j("SubUserDeviceHandler", "getProductInfo The product obtained from Table is empty");
        String strT = dxm.t(str);
        if (TextUtils.isEmpty(strT)) {
            LogUtil.j("SubUserDeviceHandler", "getProductInfo productId is null");
            return elhVarD;
        }
        return d(strT);
    }

    private elh d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SubUserDeviceHandler", "getProduct productId is null");
            return null;
        }
        return ResourceManager.c().d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DeviceDetailInfo> a(List<DeviceDetailInfo> list) {
        if (njy.e(list)) {
            LogUtil.j("SubUserDeviceHandler", "filterDetailInfoList originDevices is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (b(deviceDetailInfo)) {
                arrayList.add(deviceDetailInfo);
            }
        }
        return arrayList;
    }

    private boolean b(DeviceDetailInfo deviceDetailInfo) {
        if (deviceDetailInfo == null || deviceDetailInfo.getDevInfo() == null) {
            LogUtil.j("SubUserDeviceHandler", "isDeviceInfoValid device is null or device.getDevInfo() is null");
            return false;
        }
        if (TextUtils.isEmpty(deviceDetailInfo.getDevId())) {
            LogUtil.j("SubUserDeviceHandler", "isDeviceInfoValid device.getDevId() is null");
            return false;
        }
        String prodId = deviceDetailInfo.getDevInfo().getProdId();
        if (TextUtils.isEmpty(prodId)) {
            LogUtil.j("SubUserDeviceHandler", "isDeviceInfoValid device.getDevInfo().getProdId() is null");
            return false;
        }
        if (!f47748a.contains(prodId) || !njy.e(deviceDetailInfo.getServices())) {
            return true;
        }
        LogUtil.j("SubUserDeviceHandler", "isDeviceInfoValid device.getServices() is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<DeviceDetailInfo> list) {
        if (njy.b(list)) {
            return true;
        }
        LogUtil.j("SubUserDeviceHandler", "hasDevice devices is null");
        return false;
    }
}
