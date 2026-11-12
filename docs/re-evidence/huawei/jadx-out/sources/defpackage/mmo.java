package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import com.huawei.hwbtsdk.btdatatype.callback.BluetoothDialogCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mmo {
    public static String a(DeviceDialogMessage deviceDialogMessage, IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback) {
        if (deviceDialogMessage == null) {
            LogUtil.j("DialogMessage", "dialogMessage deviceDialogMessage is null");
            return "";
        }
        int method = deviceDialogMessage.getMethod();
        boolean zIsStatusFlag = deviceDialogMessage.isStatusFlag();
        long selectId = deviceDialogMessage.getSelectId();
        String deviceName = deviceDialogMessage.getDeviceName();
        int bluetoothType = deviceDialogMessage.getBluetoothType();
        LogUtil.a("DialogMessage", "method :", Integer.valueOf(method));
        lof lofVarD = lof.d(BaseApplication.getContext());
        if (method == 10001) {
            lofVarD.j();
            return deviceName;
        }
        if (method == 10002) {
            lofVarD.a(zIsStatusFlag);
            return deviceName;
        }
        if (method == 10004) {
            lofVarD.l();
            return deviceName;
        }
        if (method == 10015) {
            lofVarD.k();
            return deviceName;
        }
        if (method == 10026) {
            lofVarD.b(selectId, bluetoothType);
            return deviceName;
        }
        if (method != 10033) {
            switch (method) {
                case 10006:
                    lofVarD.d(zIsStatusFlag, (Handler) null);
                    return deviceName;
                case 10007:
                    return lofVarD.m();
                case 10008:
                    return lofVarD.f();
                default:
                    d(method, selectId, zIsStatusFlag, deviceName, lofVarD);
                    return deviceName;
            }
        }
        lofVarD.d(new c(iBluetoothDialogAidlCallback));
        return deviceName;
    }

    private static void d(int i, long j, boolean z, String str, lof lofVar) {
        if (i == 10003) {
            lofVar.e();
            return;
        }
        if (i == 10016) {
            lofVar.i();
            return;
        }
        if (i == 10027) {
            lofVar.d(j);
        } else if (i == 10028) {
            c(z, str, lofVar);
        } else {
            LogUtil.j("DialogMessage", "processOtherDialogMessage default");
        }
    }

    private static void c(boolean z, String str, lof lofVar) {
        mky.b().d(z, str);
        if (z) {
            lofVar.b(str, 1);
        } else {
            lofVar.b(str, 0);
        }
    }

    static class c implements BluetoothDialogCallback {
        private IBluetoothDialogAidlCallback d;

        c(IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback) {
            this.d = iBluetoothDialogAidlCallback;
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BluetoothDialogCallback
        public void onSetList(List<BluetoothDeviceNode> list, boolean z, int i) {
            try {
                IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback = this.d;
                if (iBluetoothDialogAidlCallback != null) {
                    iBluetoothDialogAidlCallback.onSetList(list, z, i);
                }
            } catch (RemoteException unused) {
                LogUtil.e("DialogMessage", "onSetList RemoteException");
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BluetoothDialogCallback
        public void onScanFinished() {
            try {
                IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback = this.d;
                if (iBluetoothDialogAidlCallback != null) {
                    iBluetoothDialogAidlCallback.onScanFinished();
                }
            } catch (RemoteException unused) {
                LogUtil.e("DialogMessage", "onScanFinished RemoteException");
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BluetoothDialogCallback
        public void onSetNameFilter(List list) {
            try {
                IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback = this.d;
                if (iBluetoothDialogAidlCallback != null) {
                    iBluetoothDialogAidlCallback.onSetNameFilter(list);
                }
            } catch (RemoteException unused) {
                LogUtil.e("DialogMessage", "onSetNameFilter RemoteException");
            }
        }
    }
}
