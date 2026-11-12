package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sst extends ssj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48646b;

    public sst(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
        this.f48646b = true;
    }

    @Override // defpackage.ssj, com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        ReleaseLogUtil.d("R_QrCode_MatterQrCodeHandler", "execute");
        if (this.d == null || this.mActivity == null) {
            LogUtil.j("MatterQrCodeHandler", "mData or mActivity is null");
            return;
        }
        LogUtil.a("MatterQrCodeHandler", "deviceName : ", this.d.e(), " , type : ", Integer.valueOf(this.d.d()));
        this.e = this.d.d();
        boolean zN = lvi.n(this.e);
        LogUtil.a("MatterQrCodeHandler", "isPlugin:", Boolean.valueOf(zN));
        if (!CommonUtil.ap() && zN) {
            boolean zC = qtk.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(this.e)), this.e, CommonUtil.e(BaseApplication.getContext()));
            LogUtil.a("MatterQrCodeHandler", "isUpdate:", Boolean.valueOf(zC));
            final Activity activity = this.mActivity.get();
            if (zC && activity != null) {
                activity.runOnUiThread(new Runnable() { // from class: sst.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qtk.a(BaseApplication.getContext(), activity, true);
                    }
                });
                return;
            }
        }
        Activity activity2 = this.mActivity.get();
        if (activity2 != null && !rdp.b((Context) activity2)) {
            b(activity2);
            return;
        }
        String strJ = lvi.j(this.e);
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ)) {
            if (!TextUtils.isEmpty(this.d.e())) {
                a();
                return;
            } else {
                e(activity2);
                return;
            }
        }
        LogUtil.j("MatterQrCodeHandler", "isAvaiable is false,uuid:", strJ);
    }

    @Override // defpackage.ssj
    protected void d(final String str, final BluetoothDevice bluetoothDevice, int i) {
        final Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("MatterQrCodeHandler", "doJump:runActivity is null");
            return;
        }
        if (str == null || bluetoothDevice == null || !str.equals(this.d.e()) || !this.f48646b) {
            return;
        }
        this.f48646b = false;
        final List<DeviceInfo> listE = rdp.e(this.e);
        i();
        LogUtil.a("MatterQrCodeHandler", "dismiss wait dialog");
        if (this.e != 275 || coq.d(listE)) {
            LogUtil.a("MatterQrCodeHandler", "enter unknown type jump");
            b(str, bluetoothDevice, activity);
            if (activity.isFinishing()) {
                return;
            }
            activity.finish();
            return;
        }
        LogUtil.a("MatterQrCodeHandler", "enter show delete tip");
        activity.runOnUiThread(new Runnable() { // from class: ssx
            @Override // java.lang.Runnable
            public final void run() {
                this.f48655b.c(listE, activity, str, bluetoothDevice);
            }
        });
    }

    /* synthetic */ void c(List list, final Activity activity, final String str, final BluetoothDevice bluetoothDevice) {
        rdp.d((DeviceInfo) list.get(0), activity, new IBaseResponseCallback() { // from class: ssz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.e(str, bluetoothDevice, activity, i, obj);
            }
        });
    }

    /* synthetic */ void e(String str, BluetoothDevice bluetoothDevice, Activity activity, int i, Object obj) {
        if (i == 0) {
            LogUtil.j("MatterQrCodeHandler", "handleSwitchDevice:");
            b(str, bluetoothDevice, activity);
        }
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    private void b(String str, BluetoothDevice bluetoothDevice, Activity activity) {
        if (str.equals(this.d.e())) {
            String strC = this.d.c();
            int length = str.length();
            if (length >= 3) {
                strC = str.substring(length - 3) + strC;
            }
            LogUtil.a("MatterQrCodeHandler", "pinCode:", this.d.c());
            H5proUtil.initH5pro();
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addCustomizeArg(MatterDataContans.KEY_MAC_ADDRESS, bluetoothDevice.getAddress());
            builder.addCustomizeArg("pin", strC);
            builder.addCustomizeArg(BleConstants.BLUETOOTH_NAME, this.d.e());
            ddv.b().loadH5ProApp(activity, "com.huawei.health.h5.matter", builder);
            f();
            d();
            e();
        }
    }
}
