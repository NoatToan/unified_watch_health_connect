package defpackage;

import android.content.Context;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mxp extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mxp f42658a;
    private HwDeviceMgrInterface h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42660c = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42659b = new Object();
    private static Map<Integer, List<IBaseResponseCallback>> d = new HashMap(16);

    private mxp(Context context) {
        super(context);
        LogUtil.a("HwSleepBreatheMgr", "HwSleepBreatheMgr Constructor");
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(context);
        this.h = hwDeviceMgrInterfaceE;
        if (hwDeviceMgrInterfaceE == null) {
            LogUtil.j("HwSleepBreatheMgr", "mHwDeviceMgr is null");
        }
    }

    public static mxp d() {
        mxp mxpVar;
        LogUtil.a("HwSleepBreatheMgr", "enter HwSleepBreatheMgr");
        synchronized (f42659b) {
            if (f42658a == null) {
                f42658a = new mxp(BaseApplication.getContext());
            }
            mxpVar = f42658a;
        }
        return mxpVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 2) {
            LogUtil.j("HwSleepBreatheMgr", "onResponse error dataInfos");
            return;
        }
        cpl.d("HwSleepBreatheMgr", bArr, "onResponse receive bt data: ");
        byte b2 = bArr[1];
        if (b2 == 1) {
            a(bArr);
        } else if (b2 != 2) {
            LogUtil.j("HwSleepBreatheMgr", "onResponse receive bt error data");
        } else {
            c(bArr);
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 45;
    }

    private void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = d.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                    d.put(Integer.valueOf(i), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    public void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwSleepBreatheMgr", "setSleepBreatheSwitch callback is null");
            return;
        }
        synchronized (f42660c) {
            if (this.h == null) {
                LogUtil.j("HwSleepBreatheMgr", "setSleepBreatheSwitch mHwDeviceMgr is null");
                return;
            }
            DeviceInfo deviceInfoE = e();
            if (deviceInfoE == null) {
                LogUtil.j("05", 1, "HwSleepBreatheMgr", "setSleepBreatheSwitch get device info error");
                iBaseResponseCallback.a(300004, null);
            } else {
                LogUtil.a("05", 1, "HwSleepBreatheMgr", "setSleepBreatheSwitch support");
                c(1, iBaseResponseCallback);
                mxo.e(i, deviceInfoE);
            }
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwSleepBreatheMgr", "clearSleepBreatheData callback is null");
            return;
        }
        synchronized (f42660c) {
            if (this.h == null) {
                LogUtil.j("HwSleepBreatheMgr", "clearSleepBreatheData mHwDeviceMgr is null");
                return;
            }
            DeviceInfo deviceInfoE = e();
            if (deviceInfoE == null) {
                LogUtil.j("05", 1, "HwSleepBreatheMgr", "clearSleepBreatheData get device info error");
                iBaseResponseCallback.a(300004, null);
            } else {
                LogUtil.a("05", 1, "HwSleepBreatheMgr", "clearSleepBreatheData support");
                c(2, iBaseResponseCallback);
                mxo.b(deviceInfoE);
            }
        }
    }

    private void a(byte[] bArr) {
        int iC;
        LogUtil.a("05", 0, "HwSleepBreatheMgr", "setSleepBreatheMeasureCode is:", eeq.e(bArr));
        try {
            iC = mxl.c(bArr);
        } catch (eeu unused) {
            LogUtil.e("HwSleepBreatheMgr", "setSleepBreatheMeasureCode Exception");
            iC = 201000;
        }
        a(1, iC, "");
    }

    private void c(byte[] bArr) {
        int iC;
        LogUtil.a("05", 1, "HwSleepBreatheMgr", "clearSleepBreatheDataCode data is:", eeq.e(bArr));
        try {
            iC = mxl.c(bArr);
        } catch (eeu unused) {
            LogUtil.e("HwSleepBreatheMgr", "clearSleepBreatheDataCode Exception");
            iC = 201000;
        }
        a(2, iC, "");
    }

    private void a(int i, int i2, Object obj) {
        LogUtil.a("05", 1, "HwSleepBreatheMgr", "callback cmd is:", Integer.valueOf(i), "error is ", Integer.valueOf(i2));
        synchronized (e) {
            List<IBaseResponseCallback> list = d.get(Integer.valueOf(i));
            if (list != null) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    IBaseResponseCallback next = it.next();
                    if (next != null) {
                        next.a(i2, obj);
                        it.remove();
                        break;
                    }
                    it.remove();
                }
            }
        }
    }

    private DeviceInfo e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwSleepBreatheMgr");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }
}
