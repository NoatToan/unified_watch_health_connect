package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class fif {

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fif f34117b = new fif();
    }

    private fif() {
    }

    public static final fif c() {
        return b.f34117b;
    }

    public void b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: fif.2
            @Override // java.lang.Runnable
            public void run() {
                if (!fif.this.e()) {
                    LogUtil.j("WearDeviceInteractor", "startPhoneService status Invalid");
                    return;
                }
                if (CommonUtil.ai(BaseApplication.getContext())) {
                    LogUtil.a("WearDeviceInteractor", "startPhoneService is running");
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("com.huawei.bone.action.StartPhoneService");
                intent.setPackage(BaseApplication.getContext().getPackageName());
                intent.putExtra("isFromCallbackService", true);
                try {
                    BaseApplication.getContext().startService(intent);
                } catch (IllegalStateException e) {
                    LogUtil.e("WearDeviceInteractor", "startPhoneService IllegalStateException:", ExceptionUtils.c(e));
                    xjt.v("startPhoneService IllegalStateException:" + e.getMessage());
                } catch (SecurityException e2) {
                    ReleaseLogUtil.a("R_WearDeviceInteractor", "startPhoneService SecurityException:", ExceptionUtils.c(e2));
                    xjt.v("startPhoneService SecurityException:" + e2.getMessage());
                }
                lxg.c(BaseApplication.getContext());
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public void d() {
        LogUtil.d("WearDeviceInteractor", "Enter unbindAllDevice");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceInteractor");
        if (deviceList != null && deviceList.size() > 0) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
        h();
        j();
    }

    private void j() {
        LogUtil.a("WearDeviceInteractor", "Enter sendUnbindDevicesBroadcast()");
        Intent intent = new Intent("com.huawei.bone.action.UNBIND_DEVICE");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendOrderedBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("WearDeviceInteractor", "deleteDevice parameter error");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceInfo.getDeviceIdentify());
        try {
            lvb.e().d((List<String>) arrayList, true);
        } catch (RemoteException unused) {
            LogUtil.e("WearDeviceInteractor", "deleteDevice RemoteException");
        }
    }

    private void h() {
        LogUtil.a("WearDeviceInteractor", "Enter sendDeviceListChangeBroadcast()");
        if (CommonUtil.ck()) {
            eem.a(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceInteractor"), "WearDeviceInteractor");
        }
    }

    public void a() {
        LogUtil.a("WearDeviceInteractor", "user refresh data in health homePage.Agree to do coreSleep sync.");
        if (e()) {
            lxq.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.j("WearDeviceInteractor", "switch not on, not need start service!");
            return false;
        }
        if (mga.c()) {
            return true;
        }
        LogUtil.j("WearDeviceInteractor", "no device, return");
        return false;
    }
}
