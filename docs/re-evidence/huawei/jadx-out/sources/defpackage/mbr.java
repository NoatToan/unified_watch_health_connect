package defpackage;

import android.content.Context;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mbr extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mbr f41347b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mbs f41348a;

    private mbr(Context context) {
        super(context);
        this.f41348a = mbs.b();
        lvb lvbVarE = lvb.e();
        if (lvbVarE == null) {
            LogUtil.j("HwPressAutoMonitorManager", "hwDeviceConfigManager is null");
        } else {
            lvbVarE.d(100032, this);
        }
    }

    public static mbr a() {
        mbr mbrVar;
        synchronized (e) {
            if (f41347b == null) {
                f41347b = new mbr(BaseApplication.getContext());
            }
            mbrVar = f41347b;
        }
        return mbrVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 32;
    }

    public void e(int i) {
        this.f41348a.c(i);
    }

    public void d(HiStressMetaData hiStressMetaData) {
        this.f41348a.b(hiStressMetaData);
    }

    public void b(boolean z) {
        ReleaseLogUtil.d("DEVMGR_HwPressAutoMonitorManager", "setPressAutoMonitorSwitchStatus, isEnable :", Boolean.valueOf(z));
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            ReleaseLogUtil.e("DEVMGR_HwPressAutoMonitorManager", "switchSettingManager is null");
        } else {
            mhsVarA.setSwitchSetting("press_auto_monitor_switch_status", String.valueOf(z), new IBaseResponseCallback() { // from class: mbq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("HwPressAutoMonitorManager", "setPressAutoMonitorSwitchStatus errorCode = ", Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        ReleaseLogUtil.d("DEVMGR_HwPressAutoMonitorManager", "onDataReceived errorCode:", Integer.valueOf(i));
        if (i == 0 && bArr != null) {
            if (bArr.length < 2) {
                ReleaseLogUtil.e("DEVMGR_HwPressAutoMonitorManager", "error tlv");
                return;
            }
            LogUtil.a("HwPressAutoMonitorManager", "onDataReceived BT data is ", eeq.e(bArr));
            ReleaseLogUtil.d("DEVMGR_HwPressAutoMonitorManager", "onDataReceived commandId:", Byte.valueOf(bArr[1]));
            byte b2 = bArr[1];
            if (b2 == 9) {
                LogUtil.a("HwPressAutoMonitorManager", "5.35.1 success.");
                return;
            } else {
                LogUtil.j("HwPressAutoMonitorManager", "onDataReceived BT data commandId is wrong : commandId : ", Byte.valueOf(b2));
                return;
            }
        }
        ReleaseLogUtil.e("DEVMGR_HwPressAutoMonitorManager", "onDataReceived data error");
    }
}
