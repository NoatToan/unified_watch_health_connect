package defpackage;

import android.bluetooth.BluetoothDevice;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.health.ecologydevice.callback.NfcMeasureCallback;
import com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ejn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected NfcMeasureCallback f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f33064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f33065c;
    protected String d;
    protected ExtendHandler e;
    protected int f;
    private RopeStateMonitor h;
    protected boolean j;
    protected int g = 0;
    private RopeStateMonitor.StateChangeListener i = new RopeStateMonitor.StateChangeListener() { // from class: ejn.2
        @Override // com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor.StateChangeListener
        public void onBondStateChanged(int i, BluetoothDevice bluetoothDevice) {
            try {
                String name = bluetoothDevice.getName();
                String address = bluetoothDevice.getAddress();
                if (name == null) {
                    if (address == null || !address.equals(ejn.this.d)) {
                        LogUtil.j("BaseBloodSugarManager", "not this bond device");
                        return;
                    }
                } else if (!name.equals(ejn.this.f33065c) && !address.equals(ejn.this.d)) {
                    LogUtil.a("BaseBloodSugarManager", "Ble pair failed: name and address are not equal");
                    return;
                }
                ejn.this.f = i;
                if (i == 0) {
                    ejn.this.f33064b = 14;
                } else if (i == 1) {
                    ejn.this.f33064b = 15;
                } else if (i == 2) {
                    ejn.this.f33064b = 16;
                } else if (i != 9) {
                    LogUtil.j("BaseBloodSugarManager", "not have this status");
                }
                ejn.this.b(106);
            } catch (SecurityException e) {
                LogUtil.e("BaseBloodSugarManager", "onBondStateChanged SecurityException:", ExceptionUtils.c(e));
            }
        }

        @Override // com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor.StateChangeListener
        public void onSwitchStateChanged(int i) {
            ejn.this.f = i;
            if (i == 3) {
                LogUtil.a("BaseBloodSugarManager", "BLUETOOTH_SWITCH_OFF");
                ejn.this.b(105);
            } else if (i != 4) {
                LogUtil.a("BaseBloodSugarManager", "BluetoothSwitchMonitorReceiver other blueState: ", Integer.valueOf(i));
            } else {
                LogUtil.a("BaseBloodSugarManager", "BLUETOOTH_SWITCH_ON");
            }
        }
    };

    public boolean b(NfcMeasureCallback nfcMeasureCallback) {
        d(nfcMeasureCallback);
        c();
        return false;
    }

    public void d() {
        b();
        e();
        a();
    }

    private void d(NfcMeasureCallback nfcMeasureCallback) {
        this.f33063a = nfcMeasureCallback;
    }

    private void e() {
        this.f33063a = null;
    }

    private void c() {
        RopeStateMonitor ropeStateMonitor = this.h;
        if (ropeStateMonitor != null) {
            ropeStateMonitor.a();
        }
        RopeStateMonitor ropeStateMonitor2 = new RopeStateMonitor(BaseApplication.getContext(), this.i);
        this.h = ropeStateMonitor2;
        ropeStateMonitor2.d();
    }

    private void b() {
        if (this.e != null) {
            LogUtil.a("BaseBloodSugarManager", "releaseHandler msgHandler will removeCallbacksAndMessages");
            this.e.removeTasksAndMessages();
            this.e.quit(false);
            this.e = null;
        }
    }

    private void a() {
        RopeStateMonitor ropeStateMonitor = this.h;
        if (ropeStateMonitor != null) {
            ropeStateMonitor.a();
            this.h = null;
        }
    }

    protected void b(int i, long j) {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(i, j);
        }
    }

    protected void b(int i) {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(i);
        }
    }

    protected void e(int i) {
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }

    public void d(String str, String str2) {
        this.f33065c = str;
        this.d = str2;
    }

    public void c(boolean z) {
        this.j = z;
        LogUtil.a("BaseBloodSugarManager", "mIsUniformDeviceManagementFlag = ", Boolean.valueOf(z));
    }
}
