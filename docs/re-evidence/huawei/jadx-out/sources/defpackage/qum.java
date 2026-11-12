package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes16.dex */
public class qum {
    private static qum e;
    private Context g;
    private rcv h;
    private lnd j;
    private ExtendHandler o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f46878b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ExecutorService f46877a = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<BluetoothDevice> f46879c = new ArrayList<>(16);
    private ArrayList<BluetoothDevice> d = new ArrayList<>(16);
    private HashMap<String, Integer> n = new HashMap<>(0);
    private HashMap<String, String> l = new HashMap<>(16);
    private DownloadResultCallBack f = new DownloadResultCallBack() { // from class: qum.1
        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
        public void setDownloadStatus(int i, int i2) {
            LogUtil.a("BtAutoScanManager", "setDownloadStatus status: ", Integer.valueOf(i));
            if (i == 0) {
                return;
            }
            if (i == 1) {
                qum.this.o.sendEmptyMessage(1);
            }
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        }
    };
    private BtDeviceDiscoverCallback i = new BtDeviceDiscoverCallback() { // from class: qum.5
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
            if (Math.abs(i) < 65 && bluetoothDeviceNode != null) {
                try {
                    BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
                    if (btDevice.getName() != null) {
                        LogUtil.a("BtAutoScanManager", "scan rssi name: ", btDevice.getName(), "rssi: ", Integer.valueOf(i));
                    }
                    if (bArr != null) {
                        if (qum.this.h.d(eeq.e(bArr))) {
                            qum.this.e(btDevice, bArr);
                        } else {
                            LogUtil.j("BtAutoScanManager", "scan not in device: ", btDevice.getName());
                            return;
                        }
                    }
                    LogUtil.a("BtAutoScanManager", "scan in device: ", btDevice.getName());
                    qum.this.c(btDevice, i);
                } catch (SecurityException e2) {
                    LogUtil.e("BtAutoScanManager", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e2));
                }
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
            LogUtil.a("BtAutoScanManager", "autoScan onDeviceDiscoveryFinished");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
            LogUtil.a("BtAutoScanManager", "autoScan onDeviceDiscoveryCanceled");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i, String str) {
            LogUtil.a("BtAutoScanManager", "autoScan onFailure");
        }
    };

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("BtAutoScanManager", "handleMessage msg.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                qum.this.e();
                return true;
            }
            if (i == 3) {
                qum.this.j.a();
                qum.this.o.removeMessages(1);
                qum.this.j();
                LogUtil.a("BtAutoScanManager", "autoScan List after mBtScanDeviceList is ", qum.this.d);
                if (qum.this.d.size() > 0) {
                    qum.this.a();
                }
                return true;
            }
            if (i == 4) {
                qum.this.j.a();
                qum.this.o.removeMessages(1);
                return true;
            }
            if (i == 5) {
                qum.this.a(20);
                return true;
            }
            LogUtil.d("BtAutoScanManager", "handleMessage default");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (TextUtils.isEmpty(bluetoothDevice.getName()) || this.l.containsKey(bluetoothDevice.getName())) {
            return;
        }
        String strE = this.h.e(eeq.e(bArr));
        LogUtil.a("BtAutoScanManager", "deviceName:", bluetoothDevice.getName(), "getDeviceProductId:", strE);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        this.l.put(bluetoothDevice.getName(), strE);
    }

    private qum(Context context) {
        this.g = null;
        this.o = null;
        if (context == null) {
            LogUtil.j("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtAutoScanManager", "init BtAutoScanManager with context is null.");
            return;
        }
        this.g = context;
        this.j = lnd.e(context);
        this.h = rcv.a(context);
        this.o = HandlerCenter.b(new b(), "BtAutoScanManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ArrayList<BluetoothDevice> arrayList = this.f46879c;
        if (arrayList == null || arrayList.isEmpty()) {
            LogUtil.j("BtAutoScanManager", "autoScan List mBtScanDeviceList is null or size is zero.");
            return;
        }
        for (int i = 0; i < this.f46879c.size(); i++) {
            try {
                BluetoothDevice bluetoothDevice = this.f46879c.get(i);
                if (bluetoothDevice != null && bluetoothDevice.getName() != null && c(bluetoothDevice.getName())) {
                    this.d.add(bluetoothDevice);
                }
            } catch (SecurityException e2) {
                LogUtil.e("BtAutoScanManager", "setLastDeviceList SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
    }

    public static qum b() {
        qum qumVar;
        synchronized (f46878b) {
            if (e == null) {
                LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtAutoScanManager", "mBtAutoScanManagerInstance is null.");
                e = new qum(BaseApplication.getContext());
            }
            qumVar = e;
        }
        return qumVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("BtAutoScanManager", "Enter scanBleDevice.");
        this.j.b(this.i);
        this.o.sendEmptyMessage(3, 5000L);
    }

    public void d() {
        if (LoginInit.getInstance(this.g).isBrowseMode()) {
            LogUtil.j("BtAutoScanManager", "isBrowseMode not allow pair");
            xjt.g("user is not login");
            return;
        }
        boolean zD = new GuideInteractors(this.g).d();
        LogUtil.a("BtAutoScanManager", "startAutoScan isChecked: ", Boolean.valueOf(zD));
        if (zD) {
            xjt.g("user close auto scan");
            return;
        }
        LogUtil.a("BtAutoScanManager", "startAutoScan isHuaweiSystem: ", Boolean.valueOf(CommonUtil.bg()));
        ArrayList<BluetoothDevice> arrayList = this.f46879c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<BluetoothDevice> arrayList2 = this.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        int iD = this.j.d();
        LogUtil.a("BtAutoScanManager", "startAutoScan btSwitchState: ", Integer.valueOf(iD));
        if (iD != 3) {
            return;
        }
        if (njy.e(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList())) {
            if (!CommonUtil.ab(BaseApplication.getContext())) {
                LogUtil.j("BtAutoScanManager", "handleNeedDownloadCase net is error");
                return;
            } else {
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(this.f);
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
                return;
            }
        }
        this.o.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothDevice bluetoothDevice, int i) {
        boolean z;
        synchronized (this) {
            try {
                Iterator<BluetoothDevice> it = this.f46879c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (next != null && next.getAddress() != null && next.getAddress().equals(bluetoothDevice.getAddress())) {
                        z = true;
                        break;
                    }
                }
                LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BtAutoScanManager", "addDeviceToList isRepeat: ", Boolean.valueOf(z));
                if (z) {
                    return;
                }
                String name = bluetoothDevice.getName();
                boolean zD = qun.d(name, lvi.b());
                LogUtil.a("BtAutoScanManager", "addDeviceToList isFilterName: ", Boolean.valueOf(zD));
                if (!zD) {
                    zD = qun.d(name, c());
                }
                boolean zC = c(name);
                LogUtil.a("BtAutoScanManager", "addDeviceToList deviceName: ", name, ";isFilterName: ", Boolean.valueOf(zD), ";isDeviceInList: ", Boolean.valueOf(zC));
                if (zD && zC) {
                    this.n.put(bluetoothDevice.getName(), Integer.valueOf(i));
                    this.f46879c.add(bluetoothDevice);
                }
            } catch (SecurityException e2) {
                LogUtil.e("BtAutoScanManager", "addDeviceToList SecurityException:", ExceptionUtils.c(e2));
            }
        }
    }

    private List<String> c() {
        ArrayList arrayList = new ArrayList(16);
        try {
            ArrayList<eds> arrayList2 = new ArrayList(16);
            arrayList2.addAll(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList());
            for (eds edsVar : arrayList2) {
                if (edsVar.c() == 0 && edsVar.s() != null && edsVar.s().startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
                    arrayList.addAll(edsVar.d());
                }
            }
            return arrayList;
        } catch (ConcurrentModificationException unused) {
            LogUtil.e("BtAutoScanManager", "getFilterName, ConcurrentModificationException");
            return arrayList;
        }
    }

    public String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BtAutoScanManager", "deviceName is null");
            return "";
        }
        String str2 = this.l.get(str);
        LogUtil.a("BtAutoScanManager", "getProductIdFromMap productId:", str2);
        return str2;
    }

    private boolean c(String str) {
        LogUtil.a("BtAutoScanManager", "isDeviceInList deviceName: ", str);
        for (String str2 : this.h.e()) {
            LogUtil.a("BtAutoScanManager", "isDeviceInList currentUsedDeviceName: ", str2);
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("BtAutoScanManager", "Enter intentScanListActivity mBtScanDeviceShowList: ", this.d);
        if (!com.huawei.haf.application.BaseApplication.h()) {
            LogUtil.j("BtAutoScanManager", "intentScanListActivity health app is not running foreground");
            return;
        }
        LogUtil.a("BtAutoScanManager", "MainActivity BaseApplication.isRunningForeground: ", Boolean.valueOf(BaseApplication.isRunningForeground()));
        if (BaseApplication.isRunningForeground()) {
            boolean zI = CommonUtil.i(this.g, "com.huawei.health.MainActivity");
            LogUtil.a("BtAutoScanManager", "MainActivity isForeground is ", Boolean.valueOf(zI));
            if (!zI || !qun.b()) {
                LogUtil.j("BtAutoScanManager", "cardDeviceFragment is not foreground");
                return;
            }
            DeviceInfo deviceInfoD = mgg.d("BtAutoScanManager");
            if (deviceInfoD != null && HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoD.getDeviceIdentify())) {
                LogUtil.a("BtAutoScanManager", "wear device is OTAing");
                return;
            }
            try {
                LogUtil.j("BtAutoScanManager", "AW70 device is OTAing else");
                Intent intent = new Intent(this.g, (Class<?>) BtAutoScanActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("bluetooth_list", this.d);
                intent.putExtra(TtmlNode.TAG_STYLE, 1);
                intent.putExtra("device_rssi_map", this.n);
                this.g.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("BtAutoScanManager", "activityNotFoundException");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        LogUtil.a("BtAutoScanManager", "Enter downloadInfo deviceType: ", Integer.valueOf(i));
        ExecutorService executorService = f46877a;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        f46877a.execute(new Runnable() { // from class: qum.3
            @Override // java.lang.Runnable
            public void run() {
                String str;
                if (!lvi.f(i)) {
                    str = "SMART_WATCH";
                } else {
                    str = "SMART_BAND";
                }
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByDeviceType(str);
            }
        });
    }
}
