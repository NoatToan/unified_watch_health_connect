package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.HwBtDialogActivity;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class qzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static qzd f47019a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f47020c = new Object();
    private IAddDeviceStateAIDLCallback d;
    private Context g;
    private DeviceParameter h;
    private int i;
    private HwBtDialogActivity.DialogAidlCallback l;
    private boolean n;
    private boolean o;
    private int p;
    private List<String> s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BTDeviceMgrUtil f47021b = null;
    private boolean m = false;
    private boolean k = false;
    private List<BluetoothDeviceNode> e = new ArrayList(16);
    private final BtSwitchStateCallback j = new BtSwitchStateCallback() { // from class: qzd.4
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            LogUtil.a("HwDialogUtil", "During add device then receive BT Switch state: ", Integer.valueOf(i));
            if (i == 1) {
                if (qzd.this.f47021b != null) {
                    qzd.this.f47021b.e(qzd.this.j);
                } else {
                    LogUtil.j("HwDialogUtil", "onBtSwitchStateCallback bluetooth is off, mBtDeviceMgrUtil is null.");
                }
                try {
                    if (qzd.this.d != null) {
                        qzd.this.d.onAddDeviceState(2);
                        return;
                    }
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("HwDialogUtil", "mBtSwitchStateByAddDeviceCallback RemoteException.");
                    return;
                }
            }
            if (i == 2) {
                LogUtil.a("HwDialogUtil", "onBtSwitchStateCallback bluetooth is turning off.");
                return;
            }
            if (i == 3) {
                if (qzd.this.f47021b != null) {
                    qzd.this.f47021b.e(qzd.this.j);
                }
                qzd.c(qzd.this.g).d("");
            } else if (i == 4) {
                LogUtil.a("HwDialogUtil", "onBtSwitchStateCallback bluetooth is turning on.");
            } else {
                LogUtil.j("HwDialogUtil", "onBtSwitchStateCallback btSwitchState is other.");
            }
        }
    };
    private BtDeviceDiscoverCallback f = new BtDeviceDiscoverCallback() { // from class: qzd.5
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
            if (bluetoothDeviceNode != null) {
                bluetoothDeviceNode.setRssi(i);
                bluetoothDeviceNode.setTimeStamp(System.currentTimeMillis());
                if (qzd.this.i != 2 || bluetoothDeviceNode.getDeviceType() != 3) {
                    qzd.this.c(bluetoothDeviceNode);
                } else {
                    LogUtil.j("HwDialogUtil", "Dual Mode device no add.");
                }
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
            LogUtil.a("HwDialogUtil", "onDeviceDiscoveryFinished.");
            if (qzd.this.l != null) {
                qzd.this.l.onScanFinished();
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
            LogUtil.a("HwDialogUtil", "onDeviceDiscoveryCanceled.");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i, String str) {
            LogUtil.a("HwDialogUtil", "onFailure.");
        }
    };

    private qzd(Context context) {
        this.g = context;
    }

    public void c(BTDeviceMgrUtil bTDeviceMgrUtil) {
        this.f47021b = bTDeviceMgrUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothDeviceNode bluetoothDeviceNode) {
        HwBtDialogActivity.DialogAidlCallback dialogAidlCallback;
        synchronized (this) {
            String strA = a(bluetoothDeviceNode);
            if (CommonUtil.ap() && TextUtils.isEmpty(strA)) {
                LogUtil.j("HwDialogUtil", "addScanDeviceToList current version is beta, or deviceName is empty.");
                return;
            }
            if (!c(bluetoothDeviceNode, strA) && e(strA)) {
                int iA = a(strA);
                synchronized (f47020c) {
                    this.e.add(iA, bluetoothDeviceNode);
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread() && (dialogAidlCallback = this.l) != null) {
                    dialogAidlCallback.onSetList(this.e, true, iA);
                    return;
                }
                m();
            }
        }
    }

    private int a(String str) {
        synchronized (f47020c) {
            int size = this.e.size();
            if (TextUtils.isEmpty(str)) {
                return size;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= size) {
                    i = i2;
                    break;
                }
                try {
                    BluetoothDevice btDevice = this.e.get(i).getBtDevice();
                    String name = btDevice != null ? btDevice.getName() : "";
                    if (TextUtils.isEmpty(name)) {
                        break;
                    }
                    if (!b(name) && b(str)) {
                        break;
                    }
                    i2 = i + 1;
                    i = i2;
                } catch (SecurityException e) {
                    LogUtil.e("HwDialogUtil", "getDeviceAddLocation SecurityException:", ExceptionUtils.c(e));
                }
            }
            i2 = i;
            return i2;
        }
    }

    private ArrayList<String> h() {
        ArrayList<String> arrayList = new ArrayList<>(16);
        if (CompileParameterUtil.c("IS_SUPPORT_NEW_ADD_MODE", false)) {
            arrayList.addAll(this.s);
            lmq.c(this.p, arrayList, this.k);
        }
        return arrayList;
    }

    private boolean e(String str) {
        ArrayList<String> arrayListH = h();
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwDialogUtil", "isAddScanDeviceToList deviceName is null and return true.");
            return true;
        }
        boolean zC = false;
        for (String str2 : arrayListH) {
            if (TextUtils.isEmpty(str2)) {
                zC = true;
            } else if (!CommonUtil.ap() || str.contains(Constants.LINK)) {
                if (!str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                    continue;
                } else if (this.o) {
                    zC = c(str);
                } else {
                    LogUtil.a("HwDialogUtil", "filterScanDeviceName isExistDeviceList isAddDevice: ", Boolean.valueOf(z));
                    return z;
                }
            }
        }
        z = zC;
        LogUtil.a("HwDialogUtil", "filterScanDeviceName isExistDeviceList isAddDevice: ", Boolean.valueOf(z));
        return z;
    }

    private List<String> l() {
        if (!this.o) {
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i : edh.a()) {
            arrayList.addAll(lvi.e(i));
        }
        return arrayList;
    }

    private boolean c(String str) {
        List<String> listL = l();
        boolean z = false;
        if (listL != null && !listL.isEmpty()) {
            for (String str2 : listL) {
                if (TextUtils.isEmpty(str2) || str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean c(BluetoothDeviceNode bluetoothDeviceNode, String str) {
        boolean z;
        BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
        for (BluetoothDeviceNode bluetoothDeviceNode2 : this.e) {
            if (bluetoothDeviceNode2 != null && bluetoothDeviceNode2.getBtDevice() != null && bluetoothDeviceNode2.getBtDevice().getAddress() != null && btDevice != null && bluetoothDeviceNode2.getBtDevice().getAddress().equals(btDevice.getAddress())) {
                a(bluetoothDeviceNode2, str);
                z = true;
                LogUtil.a("HwDialogUtil", "addScanDeviceToList isExistFlag: ", Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        LogUtil.a("HwDialogUtil", "addScanDeviceToList isExistFlag: ", Boolean.valueOf(z));
        return z;
    }

    private void a(BluetoothDeviceNode bluetoothDeviceNode, String str) {
        LogUtil.a("HwDialogUtil", "addDeviceToList, updateDeviceList");
        if (bluetoothDeviceNode.getBtDevice().getName() == null && TextUtils.isEmpty(bluetoothDeviceNode.getRecordName()) && str != null && CommonUtil.at()) {
            if (!b(str)) {
                LogUtil.j("HwDialogUtil", "updateDeviceList device name is error.");
            } else {
                bluetoothDeviceNode.setRecordName(str);
                m();
            }
        }
    }

    private boolean b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : this.s) {
            if (!TextUtils.isEmpty(str2)) {
                if (upperCase.contains(str2.toUpperCase(Locale.ENGLISH))) {
                    z = true;
                    break;
                }
            } else {
                z = true;
            }
        }
        LogUtil.a("HwDialogUtil", "isSelectedDeviceName isSelectedDevice: ", Boolean.valueOf(z));
        return z;
    }

    private void m() {
        HwBtDialogActivity.DialogAidlCallback dialogAidlCallback = this.l;
        if (dialogAidlCallback != null) {
            dialogAidlCallback.onSetList(this.e, false, 0);
        }
    }

    private String a(BluetoothDeviceNode bluetoothDeviceNode) {
        String name;
        try {
            BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
            String strN = "";
            if (!TextUtils.isEmpty(bluetoothDeviceNode.getNodeId())) {
                name = bluetoothDeviceNode.getDisplayName();
            } else {
                name = btDevice != null ? btDevice.getName() : "";
                if (TextUtils.isEmpty(name)) {
                    name = bluetoothDeviceNode.getRecordName();
                }
            }
            if (btDevice != null) {
                strN = CommonUtil.n(btDevice.getAddress());
            }
            LogUtil.a("HwDialogUtil", "getScanDeviceName deviceName :", name, "，address :", strN);
            return name;
        } catch (SecurityException e) {
            LogUtil.e("HwDialogUtil", "getScanDeviceName SecurityException:", ExceptionUtils.c(e));
            return bluetoothDeviceNode.getRecordName();
        }
    }

    public void c(DeviceParameter deviceParameter) {
        this.h = deviceParameter;
        if (deviceParameter != null) {
            this.i = deviceParameter.getBluetoothType();
            this.s = deviceParameter.getNameFilter();
            this.p = deviceParameter.getProductType();
            this.o = deviceParameter.isSupportHeartRate();
            boolean zIsBand = deviceParameter.isBand();
            this.k = zIsBand;
            LogUtil.a("HwDialogUtil", "registerParameter mIsBand: ", Boolean.valueOf(zIsBand));
        }
    }

    public static qzd c(Context context) {
        qzd qzdVar;
        synchronized (f47020c) {
            if (f47019a == null) {
                LogUtil.j("HwDialogUtil", "sHwDialogUtil is null.");
                f47019a = new qzd(context);
            }
            qzdVar = f47019a;
        }
        return qzdVar;
    }

    public void e(IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) {
        this.d = iAddDeviceStateAIDLCallback;
    }

    public String c() {
        BluetoothDevice bluetoothDeviceC;
        LogUtil.a("HwDialogUtil", "Enter getHFPConnectedDeviceName().");
        try {
            BTDeviceMgrUtil bTDeviceMgrUtil = this.f47021b;
            if (bTDeviceMgrUtil != null && (bluetoothDeviceC = bTDeviceMgrUtil.c(this.s)) != null) {
                LogUtil.a("HwDialogUtil", "The wanted device name: ", bluetoothDeviceC.getName());
                return bluetoothDeviceC.getName();
            }
            return "";
        } catch (SecurityException e) {
            LogUtil.e("HwDialogUtil", "getHfpConnectedDeviceName SecurityException:", ExceptionUtils.c(e));
            return "";
        }
    }

    public void d(boolean z) {
        LogUtil.a("HwDialogUtil", "Enter enableBTSwitch isEnable: ", Boolean.valueOf(z));
        if (z) {
            BTDeviceMgrUtil bTDeviceMgrUtil = this.f47021b;
            if (bTDeviceMgrUtil != null) {
                bTDeviceMgrUtil.e(this.j, (Handler) null);
                return;
            }
            return;
        }
        try {
            IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback = this.d;
            if (iAddDeviceStateAIDLCallback != null) {
                iAddDeviceStateAIDLCallback.onAddDeviceState(1);
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwDialogUtil", "enableBtSwitch RemoteException");
        }
    }

    public void b() {
        BluetoothDevice bluetoothDeviceC;
        LogUtil.a("HwDialogUtil", "Enter connectHFPConnectedDevice().");
        BTDeviceMgrUtil bTDeviceMgrUtil = this.f47021b;
        if (bTDeviceMgrUtil == null || (bluetoothDeviceC = bTDeviceMgrUtil.c(this.s)) == null) {
            return;
        }
        try {
            if (bluetoothDeviceC.getName() != null) {
                String name = bluetoothDeviceC.getName();
                int iC = lvi.c(name);
                int iB = lvi.a(iC).b();
                LogUtil.a("HwDialogUtil", "connectHfpConnectedDevice deviceName: ", name, ",ProductType: ", Integer.valueOf(iC), ",blueToothType: ", Integer.valueOf(iB));
                this.h.setProductType(iC);
                this.h.setDeviceNameInfo(name);
                this.h.setBluetoothType(iB);
                d(bluetoothDeviceC.getAddress());
            }
        } catch (SecurityException e) {
            LogUtil.e("HwDialogUtil", "connectHfpConnectedDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void a() {
        try {
            IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback = this.d;
            if (iAddDeviceStateAIDLCallback != null) {
                iAddDeviceStateAIDLCallback.onAddDeviceState(4);
            }
        } catch (RemoteException unused) {
            LogUtil.a("HwDialogUtil", "enableScan occur RemoteException.");
        }
    }

    public void d(HwBtDialogActivity.DialogAidlCallback dialogAidlCallback) {
        this.l = dialogAidlCallback;
    }

    public void i() {
        if (d() != 3) {
            LogUtil.j("HwDialogUtil", "startScanDevices bluetooth switch is not on.");
            return;
        }
        LogUtil.a("HwDialogUtil", "startScanDevices mBtType:", Integer.valueOf(this.i));
        synchronized (f47020c) {
            List<BluetoothDeviceNode> list = this.e;
            if (list != null) {
                list.clear();
            }
        }
        HwBtDialogActivity.DialogAidlCallback dialogAidlCallback = this.l;
        if (dialogAidlCallback != null) {
            dialogAidlCallback.onSetList(this.e, false, 0);
        }
        this.f47021b.c(this.s, this.i, this.f);
        HwBtDialogActivity.DialogAidlCallback dialogAidlCallback2 = this.l;
        if (dialogAidlCallback2 != null) {
            dialogAidlCallback2.onSetNameFilter(this.s);
        }
    }

    public int d() {
        LogUtil.a("HwDialogUtil", "Enter getBTSwitchState().");
        return this.f47021b.h();
    }

    public boolean e(Context context) {
        this.n = true;
        int i = this.i;
        if (i != 2 && i != 1) {
            return false;
        }
        if (!e()) {
            if (this.i == 1 && CommonUtil.bg() && !PermissionUtil.a()) {
                return true;
            }
            a(context);
        }
        return this.n;
    }

    private void a(Context context) {
        d(context);
        this.m = true;
        this.n = false;
    }

    public boolean j() {
        return this.m;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public boolean f() {
        Object systemService = this.g.getSystemService("appops");
        boolean z = false;
        if (systemService instanceof AppOpsManager) {
            int iCheckOp = ((AppOpsManager) systemService).checkOp("android:coarse_location", Process.myUid(), this.g.getPackageName());
            LogUtil.a("HwDialogUtil", "isLocationEnable checkOp: ", Integer.valueOf(iCheckOp));
            z = iCheckOp == 0;
            LogUtil.a("HwDialogUtil", "isLocationEnable res:", Boolean.valueOf(z), "0：allowed other：no permission.");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Context context) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        PermissionUtil.d(context, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(context) { // from class: qzd.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("HwDialogUtil", "permission allowed");
                qzd.this.n = true;
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                qzd.this.d(context);
                qzd.this.n = false;
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                if (!((Activity) context).isFinishing()) {
                    super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: qzd.3.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ((Activity) context).finish();
                        }
                    }, new View.OnClickListener() { // from class: qzd.3.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (context instanceof Activity) {
                                ((Activity) context).finish();
                            }
                        }
                    });
                }
                qzd.this.n = false;
            }
        });
    }

    public boolean e() {
        return PermissionUtil.b(this.g, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
    }

    public void a(long j, int i) {
        LogUtil.a("HwDialogUtil", "Enter connectSelectedDevice id: ", Long.valueOf(j), ";bluetoothType is: ", Integer.valueOf(i), ", mBtDeviceList.size():", Integer.valueOf(this.e.size()));
        if (j < 0) {
            return;
        }
        if (j < this.e.size()) {
            int i2 = (int) j;
            BluetoothDevice btDevice = this.e.get(i2).getBtDevice();
            if (btDevice != null) {
                try {
                    LogUtil.a("HwDialogUtil", "connectSelectedDevice id: ", Long.valueOf(j), ";name is: ", btDevice.getName());
                    c(i);
                    a(j);
                    return;
                } catch (SecurityException e) {
                    LogUtil.e("HwDialogUtil", "connectSelectedDevice SecurityException:", ExceptionUtils.c(e));
                    return;
                }
            }
            if (this.e.get(i2).getNodeId() != null) {
                LogUtil.a("HwDialogUtil", "connectSelectedDevice id: ", Long.valueOf(j), ";node is: ", BTDeviceMgrUtil.c().e(this.e.get(i2).getNodeId()));
                if (!qql.e()) {
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.NotifyActivity"));
                        intent.setFlags(268435456);
                        intent.putExtra("dialog_style", 102);
                        intent.putExtra("device_id", j);
                        this.g.startActivity(intent);
                        return;
                    } catch (ActivityNotFoundException e2) {
                        LogUtil.e("HwDialogUtil", "ActivityNotFoundException :", ExceptionUtils.c(e2));
                        return;
                    }
                }
                a(j);
                return;
            }
            return;
        }
        qpx.b(BaseApplication.getContext(), R.string.IDS_device_mgr_device_pair_guide_tips);
    }

    private void a(long j) {
        LogUtil.a("HwDialogUtil", "Enter connectDevice.");
        int i = (int) j;
        if (i < 0 || i >= this.e.size()) {
            LogUtil.j("HwDialogUtil", "connectDevice id is error.");
            return;
        }
        try {
            BluetoothDevice btDevice = this.e.get(i).getBtDevice();
            BTDeviceMgrUtil bTDeviceMgrUtil = this.f47021b;
            if (bTDeviceMgrUtil != null) {
                bTDeviceMgrUtil.d();
            }
            if (btDevice != null && btDevice.getName() != null) {
                String name = btDevice.getName();
                int iC = lvi.c(name);
                int iB = lvi.a(iC).b();
                LogUtil.a("HwDialogUtil", "connectDevice deviceName: ", name, ",ProductType: ", Integer.valueOf(iC), ",blueToothType: ", Integer.valueOf(iB));
                this.h.setProductType(iC);
                this.h.setDeviceNameInfo(name);
                this.h.setBluetoothType(iB);
                d(btDevice.getAddress());
                return;
            }
            this.h.setProductType(10);
            this.h.setProductType(0);
            d("AndroidWear");
        } catch (SecurityException e) {
            LogUtil.e("HwDialogUtil", "connectDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void c(int i) {
        if (i == -1 || i == this.i) {
            return;
        }
        this.i = i;
    }

    public boolean g() {
        Object systemService = this.g.getSystemService("location");
        if (!(systemService instanceof LocationManager)) {
            return false;
        }
        LocationManager locationManager = (LocationManager) systemService;
        boolean zIsProviderEnabled = locationManager.isProviderEnabled(GeocodeSearch.GPS);
        LogUtil.a("HwDialogUtil", "isGpsLocationEnable isGpsEnable: ", Boolean.valueOf(zIsProviderEnabled));
        if (lmq.e() || lmq.c()) {
            return zIsProviderEnabled;
        }
        boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        LogUtil.a("HwDialogUtil", "isGpsLocationEnable isNetWorkEnable: ", Boolean.valueOf(zIsProviderEnabled2));
        return zIsProviderEnabled || zIsProviderEnabled2;
    }

    public void d(String str) {
        LogUtil.a("HwDialogUtil", "Enter goAddDevice.");
        if (!TextUtils.isEmpty(str)) {
            this.h.setMac(str);
        }
        try {
            lvb.e().d(this.h, "", this.d);
        } catch (RemoteException unused) {
            LogUtil.e("HwDialogUtil", "goAddDevice occur RemoteException.");
        }
    }
}
