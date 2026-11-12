package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class h3t {
    public static volatile h3t s;
    public static volatile int t;
    public static volatile int u;
    public static volatile int v;
    public static volatile int w;
    public HandlerThread m;
    public Handler n;
    public Context o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothAdapter f19664a = BluetoothAdapter.getDefaultAdapter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19665b = 0;
    public final int c = 10000;
    public final int d = 0;
    public final int e = 1;
    public final int f = 2;
    public final int g = 3;
    public final int h = 4;
    public final int i = 5;
    public final int j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19666k = 7;
    public ScanCallback l = null;
    public volatile boolean p = false;
    public List<f5t> q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19667r = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    t5t.d("BleScanCenter", "COUNT-SCAN******MSG_START_SCAN:<" + h3t.v() + "," + h3t.u + ">");
                    if (!h3t.this.p) {
                        h3t.this.K();
                        h3t.this.J();
                        removeMessages(3);
                        if (!h3t.this.f19667r) {
                            sendEmptyMessageDelayed(3, 10000L);
                        }
                    } else {
                        t5t.m("BleScanCenter", "need stop,return!!!");
                    }
                    break;
                case 1:
                    t5t.d("BleScanCenter", "COUNT-SCAN******MSG_STOP_SCAN:<" + h3t.t + "," + h3t.C() + ">");
                    h3t.this.K();
                    break;
                case 2:
                    if (!h3t.this.p) {
                        h3t.this.m((gdt) message.obj);
                    }
                    break;
                case 3:
                    t5t.d("BleScanCenter", "COUNT-SCAN******MSG_PAUSE_SCAN:<" + h3t.t + "," + h3t.C() + ">");
                    h3t.this.K();
                    Message message2 = new Message();
                    message2.what = 0;
                    message2.obj = message.obj;
                    sendMessageDelayed(message2, 0L);
                    break;
                case 4:
                    try {
                        t5t.d("BleScanCenter", "timeout msg");
                        f5t f5tVar = (f5t) message.obj;
                        if (h3t.this.q.remove(f5tVar)) {
                            f5tVar.a().onScanStop(f5tVar);
                        }
                        if (h3t.this.q.size() < 1) {
                            h3t.this.p = true;
                            removeMessages(3);
                            removeMessages(0);
                            sendEmptyMessage(1);
                        }
                        t5t.d("BleScanCenter", "COUNT-SCAN******MSG_SCAN_TIMEOUT:<" + f5tVar + ">[" + h3t.this.q.size() + "]");
                    } catch (Exception e) {
                        t5t.d("BleScanCenter", "timeout e: " + e.toString());
                        return;
                    }
                    break;
                case 5:
                    f5t f5tVar2 = (f5t) message.obj;
                    if (f5tVar2 == null || h3t.this.q.contains(f5tVar2)) {
                        t5t.d("BleScanCenter", "null or exist BleScanOption,return now!!!");
                    } else {
                        h3t.this.p = false;
                        h3t.this.q.add(f5tVar2);
                        t5t.d("BleScanCenter", "COUNT-SCAN******MSG_ADD_SCAN_OPTION:<" + f5tVar2 + ">[" + h3t.this.q.size() + "]");
                        IBleScanCallback iBleScanCallbackA = f5tVar2.a();
                        if (iBleScanCallbackA != null) {
                            iBleScanCallbackA.onScanStart(f5tVar2);
                        }
                        if (f5tVar2.g()) {
                            h3t h3tVar = h3t.this;
                            List listC = h3tVar.c(h3tVar.o);
                            if (listC.size() > 0) {
                                UUID uuidF = f5tVar2.f();
                                h3t h3tVar2 = h3t.this;
                                h3tVar2.h(h3tVar2.o, listC, uuidF != null);
                            }
                        }
                        removeMessages(0);
                        sendEmptyMessage(0);
                        if (f5tVar2.h() > 0) {
                            Message message3 = new Message();
                            message3.what = 4;
                            message3.obj = f5tVar2;
                            sendMessageDelayed(message3, f5tVar2.h());
                            if (iBleScanCallbackA instanceof gh) {
                                Message message4 = new Message();
                                message4.what = 8;
                                message4.obj = f5tVar2;
                                sendMessageDelayed(message4, f5tVar2.h());
                            }
                        }
                    }
                    break;
                case 6:
                    h3t.this.f19667r = ((Boolean) message.obj).booleanValue();
                    if (h3t.this.q.size() > 0) {
                        sendEmptyMessage(0);
                    }
                    break;
                case 7:
                    c cVar = (c) message.obj;
                    if (cVar != null) {
                        try {
                            gdt gdtVarB = gdt.b(cVar.a());
                            gdtVarB.f18871a = cVar.f19671b;
                            gdtVarB.f18872b = cVar.c;
                            if (!h3t.this.p) {
                                h3t.this.m(gdtVarB);
                            }
                        } catch (Exception e2) {
                            t5t.d("BleScanCenter", "adv data parse exception:" + e2.getMessage());
                            return;
                        }
                        break;
                    }
                    break;
                case 8:
                    f5t f5tVar3 = (f5t) message.obj;
                    IBleScanCallback iBleScanCallbackA2 = f5tVar3.a();
                    if (!(iBleScanCallbackA2 instanceof gh)) {
                        t5t.d("BleScanCenter", "callback type mismatch.");
                    } else {
                        ((gh) iBleScanCallbackA2).a(f5tVar3);
                    }
                    break;
            }
        }
    }

    public class b extends ScanCallback {
        public b() {
        }

        public final /* synthetic */ void b(ScanResult scanResult) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                h3t.this.e(scanResult.getDevice(), scanResult.getRssi(), scanRecord.getBytes());
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            list.forEach(new Consumer() { // from class: i3t
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f20752a.b((ScanResult) obj);
                }
            });
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            t5t.d("BleScanCenter", "OnScan Failed: " + i);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            if (i != 1) {
                t5t.d("BleScanCenter", "LE Scan has already started");
                return;
            }
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                h3t.this.e(scanResult.getDevice(), scanResult.getRssi(), scanRecord.getBytes());
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f19670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BluetoothDevice f19671b;
        public int c;

        public c(byte[] bArr, BluetoothDevice bluetoothDevice, int i) {
            this.f19670a = bArr;
            this.f19671b = bluetoothDevice;
            this.c = i;
        }

        public byte[] a() {
            return this.f19670a;
        }
    }

    public h3t(Context context) {
        this.m = null;
        this.n = null;
        this.o = null;
        this.o = context;
        HandlerThread handlerThread = new HandlerThread("BleScanCenter");
        this.m = handlerThread;
        handlerThread.start();
        this.n = new a(this.m.getLooper());
    }

    public static /* synthetic */ int C() {
        int i = u + 1;
        u = i;
        return i;
    }

    public static h3t H() {
        return s;
    }

    public static /* synthetic */ int v() {
        int i = t + 1;
        t = i;
        return i;
    }

    public static void x(Context context) {
        if (s == null) {
            s = new h3t(context);
        }
    }

    public final List<ScanFilter> E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }

    public final List<ScanFilter> I() {
        if (wbt.l) {
            t5t.d("BleScanCenter", "外部设置使用全通扫描");
            return E();
        }
        Iterator<f5t> it = this.q.iterator();
        while (it.hasNext()) {
            if (it.next().c() != null) {
                t5t.d("BleScanCenter", "存在DeviceFilter，使用全通扫描。请尽快停止包含DeviceFilter的扫描，否则将带来CPU占用和功耗问题！");
                return E();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<f5t> it2 = this.q.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().l());
        }
        t5t.d("BleScanCenter", "filter size: " + arrayList.size());
        return arrayList;
    }

    public final void J() {
        StringBuilder sb = new StringBuilder();
        sb.append("startForNormal:");
        int i = v + 1;
        v = i;
        sb.append(i);
        t5t.d("BleScanCenter", sb.toString());
        if (this.l == null) {
            this.l = new b();
        }
        try {
            ScanSettings.Builder builder = new ScanSettings.Builder();
            builder.setScanMode(wbt.f37825k);
            builder.setCallbackType(1);
            builder.setMatchMode(1);
            builder.setNumOfMatches(3);
            builder.setPhy(255);
            this.f19664a.getBluetoothLeScanner().startScan(I(), builder.build(), this.l);
        } catch (Exception e) {
            t5t.d("BleScanCenter", "startLeScan exception:" + e.getMessage());
            K();
        }
    }

    public final void K() {
        if (this.l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stopForNormal:");
            int i = w + 1;
            w = i;
            sb.append(i);
            t5t.d("BleScanCenter", sb.toString());
            try {
                BluetoothLeScanner bluetoothLeScanner = this.f19664a.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.l);
                }
            } catch (Exception e) {
                t5t.d("BleScanCenter", "stopLeScan exception:" + e.getMessage());
            } finally {
                this.l = null;
            }
        }
    }

    public final List<BluetoothDevice> c(Context context) {
        HashMap map = new HashMap();
        List<BluetoothDevice> listI = tet.i(context);
        if (listI == null || listI.size() == 0) {
            return new ArrayList();
        }
        for (BluetoothDevice bluetoothDevice : listI) {
            map.put(bluetoothDevice.getAddress(), bluetoothDevice);
        }
        return new ArrayList(map.values());
    }

    public final void e(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (this.n == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        Message message = new Message();
        message.what = 7;
        message.obj = new c(bArr, bluetoothDevice, i);
        this.n.sendMessage(message);
    }

    public final /* synthetic */ void f(BluetoothDevice bluetoothDevice, ArrayList arrayList, g4s g4sVar) {
        t5t.m("BleScanCenter", "onDeviceInfoObtained:" + g4sVar);
        g(bluetoothDevice, arrayList, g4sVar != null ? g4sVar.I() : qd.v);
    }

    public final void g(BluetoothDevice bluetoothDevice, ArrayList<String> arrayList, qd qdVar) {
        if (this.n == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        gdt gdtVar = new gdt();
        if (arrayList != null) {
            gdtVar.f.addAll(arrayList);
        }
        gdtVar.f18871a = bluetoothDevice;
        gdtVar.f18872b = 0;
        gdtVar.p = qdVar;
        Message message = new Message();
        message.what = 2;
        message.obj = gdtVar;
        this.n.sendMessage(message);
    }

    public final void h(Context context, List<BluetoothDevice> list, boolean z) {
        for (final BluetoothDevice bluetoothDevice : list) {
            t5t.d("BleScanCenter", "connected device:" + bluetoothDevice);
            if (z) {
                sas.b(context, bluetoothDevice, new sas.b() { // from class: g3t
                    @Override // sas.b
                    public final void a(ArrayList arrayList, g4s g4sVar) {
                        this.f18568a.f(bluetoothDevice, arrayList, g4sVar);
                    }
                });
            } else {
                g(bluetoothDevice, null, qd.v);
            }
        }
    }

    public void l(f5t f5tVar) {
        t5t.d("BleScanCenter", "startScan<" + f5tVar + ">");
        if (f5tVar == null) {
            return;
        }
        if (this.n == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        Message message = new Message();
        message.what = 5;
        message.obj = f5tVar;
        this.n.sendMessage(message);
    }

    public final void m(gdt gdtVar) {
        if (gdtVar == null) {
            t5t.d("BleScanCenter", "ERROR:advData is null");
            return;
        }
        if (this.n == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        for (f5t f5tVar : this.q) {
            if (u(f5tVar, gdtVar)) {
                this.n.removeMessages(8, f5tVar);
                f5tVar.a().onScanedDevice(gdtVar, f5tVar);
            }
        }
    }

    public final void n(gdt gdtVar, UUID uuid) {
        t5t.d("printUUIDs", "uuid: " + uuid);
        gdtVar.f();
    }

    public void o(boolean z) {
        if (this.n == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        Message message = new Message();
        message.what = 6;
        message.obj = Boolean.valueOf(z);
        this.n.sendMessage(message);
    }

    public final boolean p(String str, gdt gdtVar) {
        if (str == null) {
            return false;
        }
        return str.equals(gdtVar.f18871a.getAddress());
    }

    public final boolean q(List<String> list, gdt gdtVar) {
        String strA = gdtVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(strA)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(UUID uuid, gdt gdtVar) {
        return gdtVar.c(uuid);
    }

    public final boolean u(f5t f5tVar, gdt gdtVar) {
        UUID uuidF = f5tVar.f();
        String strD = f5tVar.d();
        if (f5tVar.i() && !p(strD, gdtVar)) {
            t5t.m("BleScanCenter", "no match address");
            return false;
        }
        if (f5tVar.j() && !q(f5tVar.e(), gdtVar)) {
            t5t.m("BleScanCenter", "no match name");
            return false;
        }
        if (f5tVar.i()) {
            n(gdtVar, uuidF);
        }
        if (uuidF == null || r(uuidF, gdtVar)) {
            if (f5tVar.c() != null) {
                return f5tVar.c().a(gdtVar);
            }
            return true;
        }
        t5t.d("BleScanCenter", "no match uuid");
        if (f5tVar.i()) {
            n(gdtVar, uuidF);
        }
        return false;
    }

    public void y(f5t f5tVar) {
        t5t.d("BleScanCenter", "stopScan<" + f5tVar + ">");
        if (f5tVar == null) {
            return;
        }
        Handler handler = this.n;
        if (handler == null) {
            t5t.d("BleScanCenter", "ERROR:mHandler is null");
            return;
        }
        handler.removeMessages(4, f5tVar);
        this.n.removeMessages(8, f5tVar);
        Message message = new Message();
        message.what = 4;
        message.obj = f5tVar;
        this.n.sendMessage(message);
        t5t.d("BleScanCenter", "timeout msg send");
    }
}
