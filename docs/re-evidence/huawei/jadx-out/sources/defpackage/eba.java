package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.media3.common.C;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.health.device.wifi.entity.model.Entity;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes7.dex */
public class eba extends AccessNetWorkTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f32643b;
    private static byte[] e = new byte[2048];
    private a ac;
    private WifiManager ae;
    private c af;
    private int[] an;
    private BaseCallbackInterface i;
    private final ebg j;
    private int k;
    private String l;
    private Context m;
    private final eax n;
    private int[][] o;
    private int[] p;
    private ech q;
    private int r;
    private int[] t;
    private WifiManager.MulticastLock x;
    private String y;
    private ScanFilter z;
    private final int[] ai = {2, 8, 16};
    private final int[] ag = {2, 3, 6};
    private final int[] ad = {2, 5, 10};
    private int aa = 0;
    private int w = 0;
    private long ab = 0;
    private int ah = 0;
    private int u = 0;
    private int g = 0;
    private boolean d = false;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32645c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32644a = false;
    private boolean h = false;
    private CountDownTimer v = new CountDownTimer(90000, 5000) { // from class: eba.4
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            dyg.e(false, "CombinationTask", "mScanCoapDevicesTimer: onTick");
            eba ebaVar = eba.this;
            ebaVar.d(ebaVar.l);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            dyg.e(false, "CombinationTask", "mScanCoapDevicesTimer: onFinish");
        }
    };
    private Handler s = new Handler() { // from class: eba.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                dyg.a(false, "CombinationTask", "mHandler msg is null");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    eba.this.i();
                    return;
                }
                if (i == 3) {
                    eba.this.g();
                    return;
                }
                if (i != 2207) {
                    switch (i) {
                        case 5:
                            dyg.a(false, "CombinationTask", "stop send package");
                            if (eba.this.i != null) {
                                eba.this.i.onStatus(2210);
                            }
                            eba.this.pauseTask();
                            break;
                        case 6:
                            dyg.a(false, "CombinationTask", "low speed 2");
                            eba.this.c(2);
                            break;
                        case 7:
                            dyg.a(false, "CombinationTask", "median speed");
                            eba.this.c(1);
                            break;
                        case 8:
                            dyg.a(false, "CombinationTask", "expand mode");
                            eba.this.aa = 1;
                            eba.this.ac.b(eba.this.aa);
                            break;
                        case 9:
                            eba.this.h();
                            break;
                        default:
                            dyg.a(false, "CombinationTask", "mHandler default");
                            break;
                    }
                    return;
                }
            }
            eba.this.c(message);
        }
    };

    public eba(Context context, ebb ebbVar, BaseCallbackInterface baseCallbackInterface) {
        this.ae = null;
        this.m = context;
        this.i = baseCallbackInterface;
        if (ebbVar != null) {
            this.p = ebbVar.b();
            this.y = ebbVar.d();
            this.l = ebbVar.c();
            this.z = ebbVar.e();
        }
        this.q = new ech();
        dyg.e(false, "CombinationTask", "mIpData: ", this.p);
        if (this.p == null) {
            this.p = new int[1];
        }
        this.t = ebc.e(this.p);
        this.ac = new a();
        this.af = new c();
        this.j = new ebg();
        this.n = eax.a(this.m);
        if (this.m == null) {
            dyg.e(false, "CombinationTask", "mContext is null");
            this.m = BaseApplication.getContext();
        }
        if (this.m.getSystemService("wifi") instanceof WifiManager) {
            this.ae = (WifiManager) this.m.getSystemService("wifi");
        } else {
            LogUtil.j("CombinationTask", "mContext.getSystemService(Context.WIFI_SERVICE) not instanceof WifiManager");
        }
        this.o = ebh.e(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        dyg.d(false, "CombinationTask", "TIMEOUT:Device configuration failed, results reported UI ", b());
        a();
        stopTask();
        ecj.a(this.m);
        this.q.e("network failed", String.valueOf(2108));
        if (this.i != null) {
            dyg.c(false, "CombinationTask", "  MULTICAST_ERROR_MULT_REV_TIMEOUT");
            this.i.onFailure(2108);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        dyg.d(false, "CombinationTask", "UDP receive exception, results escalate UI ", b());
        stopTask();
        ecj.a(this.m);
        this.q.e("network failed", String.valueOf(2101));
        if (this.i != null) {
            dyg.c(false, "CombinationTask", "  MULTICAST_ERROR_CONFIG_FAIL");
            this.i.onFailure(2101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        lsy.a(new Runnable() { // from class: eba.1
            @Override // java.lang.Runnable
            public void run() {
                if (!eba.this.f32644a) {
                    eba.this.d();
                    eba.this.f32644a = true;
                }
                if (Build.VERSION.SDK_INT >= 28 && eba.this.an != null) {
                    if (CommonUtil.bg()) {
                        for (int i : eba.this.an) {
                            eba.this.ae.enableNetwork(i, true);
                        }
                    } else {
                        dyg.a(false, "CombinationTask", "Manufacture is not huawei.");
                    }
                }
                eba.this.ae.startScan();
            }
        });
        this.s.sendEmptyMessageDelayed(9, 2000L);
    }

    public void d(int i) {
        this.k = i;
    }

    public void e() {
        WifiManager wifiManager = this.ae;
        if (wifiManager != null) {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock("health.test");
            this.x = multicastLockCreateMulticastLock;
            multicastLockCreateMulticastLock.acquire();
            return;
        }
        dyg.a(false, "CombinationTask", "enableMulticast mWifiManager is null");
    }

    public void a() {
        int i = this.aa;
        if (i == 1) {
            this.aa = 0;
        } else {
            this.aa = i + 1;
        }
    }

    private void j() {
        this.s.removeMessages(1);
        this.s.removeMessages(6);
        this.s.removeMessages(7);
        this.s.removeMessages(5);
        this.s.removeMessages(2);
        this.s.removeMessages(8);
        this.s.removeMessages(9);
    }

    public void c() {
        long jNanoTime = System.nanoTime();
        this.ab = jNanoTime;
        dyg.a(false, "CombinationTask", "startMulticast: start time is ", Long.valueOf(jNanoTime));
        e(1);
        int i = this.r;
        if (i == 0) {
            this.s.sendEmptyMessageDelayed(5, 30000L);
        } else if (i == 1) {
            this.aa = 0;
            this.s.sendEmptyMessageDelayed(8, 10000L);
            this.s.sendEmptyMessageDelayed(5, 60000L);
        } else {
            this.s.sendEmptyMessageDelayed(5, 60000L);
        }
        this.s.sendEmptyMessageDelayed(2, 90000L);
        a aVar = this.ac;
        if (aVar != null) {
            aVar.e();
        }
        c cVar = this.af;
        if (cVar != null) {
            cVar.c();
        }
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            this.s.sendEmptyMessageDelayed(9, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        } else {
            this.s.sendEmptyMessage(9);
        }
        this.v.start();
        this.f32645c = false;
        this.q.d("modeDevAp");
        this.q.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str) {
        ebt ebtVar = new ebt();
        ebtVar.e(ecn.a(8));
        ebtVar.a("1.0");
        this.j.b(ebtVar, new Entity.EntityResponseCallback() { // from class: eba.5
            @Override // com.huawei.health.device.wifi.entity.model.Entity.EntityResponseCallback
            public void onResponse(ebl eblVar) {
                ebu ebuVar;
                dyg.a(false, "CombinationTask", "startScanDeviceCoap: onResponse");
                if (eblVar != null) {
                    if (eblVar instanceof ebu) {
                        ebuVar = (ebu) eblVar;
                        dyg.a(false, "CombinationTask", "startScanDeviceCoap: response ", ebuVar.toString());
                    } else {
                        ebuVar = null;
                    }
                    dyg.a(false, "CombinationTask", "configMode:", Integer.valueOf(eba.this.k));
                    if (eba.this.k != 4 || ebuVar == null) {
                        eba.this.d(ebuVar, str);
                        return;
                    } else {
                        eba.this.d(ebuVar);
                        return;
                    }
                }
                dyg.d(false, "CombinationTask", "startScanDeviceCoap: response is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ebu ebuVar, String str) {
        ebv ebvVarC = this.n.c(ebuVar);
        if (ebvVarC.e() != null && !ebvVarC.e().isEmpty()) {
            dyg.d(false, "CombinationTask", "startScanDeviceCoap: device has been registered, deviceId is ：", ebvVarC.e(), ",Scan device info is", ebvVarC);
        }
        if (ebvVarC.d() == null) {
            return;
        }
        dyg.e(false, "CombinationTask", "baseurl is ", ebvVarC.c(), "SN ", str, " info.getDeviceSn() ", ebvVarC.d());
        if (!TextUtils.equals(str, ebvVarC.d()) || this.f32645c) {
            return;
        }
        this.f32645c = true;
        this.v.cancel();
        Message messageObtain = Message.obtain();
        messageObtain.what = 2207;
        String strSubstring = ebvVarC.c().substring(ebvVarC.c().indexOf(File.separator + File.separator) + 2, ebvVarC.c().lastIndexOf(":"));
        dyg.e(true, "CombinationTask", "startScanDeviceCoap str:", strSubstring);
        messageObtain.obj = strSubstring;
        this.s.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ebu ebuVar) {
        ebu.e eVarE = ebuVar.e();
        if (eVarE != null) {
            dyg.a(false, "CombinationTask", "startScanDeviceCoap deviceinfo.prodId", eVarE.b(), "isCoapFindFlag:", Boolean.valueOf(this.f32645c));
            if (eVarE.b() == null || !this.z.b(eVarE.b()) || this.f32645c) {
                return;
            }
            this.f32645c = true;
            this.v.cancel();
            Message messageObtain = Message.obtain();
            messageObtain.what = 2207;
            String strSubstring = ebuVar.c().substring(ebuVar.c().indexOf(File.separator + File.separator) + 2, ebuVar.c().lastIndexOf(":"));
            dyg.e(true, "CombinationTask", "startScanDeviceCoap str:", strSubstring);
            messageObtain.obj = strSubstring;
            this.s.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        String str;
        this.v.cancel();
        this.f32645c = true;
        try {
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            dyg.e(true, "CombinationTask", "baseurl is ", str);
            dyg.e(false, "CombinationTask", "baseurl is true", Boolean.valueOf(Patterns.IP_ADDRESS.matcher(str).matches()));
            if (str != null && Patterns.IP_ADDRESS.matcher(str).matches()) {
                stopTask();
                dyg.a(false, "CombinationTask", "isStartFlag: ", Boolean.valueOf(this.h));
                this.q.c("Network Success");
                BaseCallbackInterface baseCallbackInterface = this.i;
                if (baseCallbackInterface != null && this.h) {
                    this.h = false;
                    baseCallbackInterface.onSuccess(str);
                }
            } else {
                stopTask();
                this.q.e("network failed-failed to get URL", String.valueOf(2101));
                if (this.i != null) {
                    this.h = false;
                    dyg.c(false, "CombinationTask", "runAfterGetMessage MULTICAST_ERROR_CONFIG_FAIL");
                    this.i.onFailure(2101);
                }
            }
        } catch (IndexOutOfBoundsException e2) {
            dyg.c(false, "CombinationTask", e2.getMessage());
        }
        dyg.a(false, "CombinationTask", "Total seconds sent ", Integer.valueOf(this.ah), "Unicast，", Integer.valueOf(this.u), "multicast ", Integer.valueOf(this.g), "broadcast");
    }

    public void c(int i) {
        this.w = i;
    }

    public void e(int i) {
        this.r = i;
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void startTask() {
        dyg.a(false, "CombinationTask", "startTask SDK_INT ", Integer.valueOf(Build.VERSION.SDK_INT));
        this.h = true;
        this.d = true;
        this.f = true;
        e();
        c();
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void pauseTask() {
        dyg.a(false, "CombinationTask", "disableMulticast: pauseTask");
        ebh.a(this.m);
        a aVar = this.ac;
        if (aVar != null) {
            aVar.a();
        }
        WifiManager.MulticastLock multicastLock = this.x;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        this.x.release();
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void stopTask() {
        dyg.a(false, "CombinationTask", "disableMulticast: stopTask");
        j();
        ebh.a(this.m);
        a aVar = this.ac;
        if (aVar != null) {
            aVar.a();
        }
        c cVar = this.af;
        if (cVar != null) {
            cVar.a();
        }
        WifiManager.MulticastLock multicastLock = this.x;
        if (multicastLock != null && multicastLock.isHeld()) {
            this.x.release();
        }
        this.v.cancel();
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f32649a;
        private volatile boolean d;
        boolean e;

        private a() {
            this.f32649a = false;
            this.e = false;
            this.d = false;
        }

        public void b(int i) {
            if (i == 0) {
                this.f32649a = true;
                this.e = false;
            } else if (i == 1) {
                this.f32649a = false;
                this.e = true;
            } else {
                this.f32649a = true;
                this.e = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IOException e;
            MulticastSocket multicastSocket;
            DatagramSocket datagramSocket;
            DatagramSocket datagramSocket2 = null;
            try {
                multicastSocket = new MulticastSocket();
                try {
                    multicastSocket.setSendBufferSize(1024);
                } catch (IOException e2) {
                    e = e2;
                    dyg.c(false, "CombinationTask", "Create Multi socket failed, ", e.getMessage());
                }
            } catch (IOException e3) {
                e = e3;
                multicastSocket = null;
            }
            try {
                datagramSocket = new DatagramSocket();
                try {
                    datagramSocket.setSendBufferSize(1024);
                } catch (IOException e4) {
                    e = e4;
                    datagramSocket2 = datagramSocket;
                    dyg.c(false, "CombinationTask", "Create Brocast socket failed, ", e.getMessage());
                    datagramSocket = datagramSocket2;
                }
            } catch (IOException e5) {
                e = e5;
            }
            dyg.e(false, "CombinationTask", "Send mIpData len ", Integer.valueOf(eba.this.p.length));
            dyg.e(false, "CombinationTask", "sendtype ", Integer.valueOf(eba.this.aa));
            b(eba.this.aa);
            while (!this.d) {
                int length = eba.this.p.length / 2;
                boolean z = !this.d && this.f32649a;
                for (int i = 0; z && i < 12; i++) {
                    eba.this.d(multicastSocket, 8);
                    int i2 = 0;
                    while (i2 < length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(eba.this.y);
                        int i3 = i2 * 2;
                        sb.append(eba.this.p[i3]);
                        sb.append(".");
                        sb.append(eba.this.p[i3 + 1]);
                        i2++;
                        eba.this.b(multicastSocket, i2, sb.toString());
                    }
                }
                int length2 = eba.this.t.length;
                for (int i4 = 0; this.e && i4 < 16; i4++) {
                    eba.this.c(datagramSocket, 8);
                    for (int i5 = 0; !this.d && i5 < length2; i5++) {
                        a(i5, datagramSocket);
                        eba.this.e(datagramSocket, eba.this.t[i5]);
                    }
                }
            }
            d(multicastSocket, datagramSocket);
        }

        private void a(int i, DatagramSocket datagramSocket) {
            if (i % 30 == 0) {
                eba.this.c(datagramSocket, 4);
            }
        }

        private void d(MulticastSocket multicastSocket, DatagramSocket datagramSocket) {
            if (multicastSocket != null) {
                multicastSocket.close();
            }
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }

        public void e() {
            this.d = false;
            ThreadPoolManager.c().a("CombinationTask", this);
        }

        public void a() {
            this.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DatagramSocket datagramSocket, int i) {
        c(2, datagramSocket, i, ecn.c("255"), AccessNetWorkTask.DEFAULT_BROADCAST_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MulticastSocket multicastSocket, int i, String str) {
        c(0, multicastSocket, i, str, 58000);
    }

    private void c(int i, DatagramSocket datagramSocket, int i2, String str, int i3) {
        long j;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime - f32643b;
        if (j2 < 0) {
            j2 = 0;
        }
        f32643b = jNanoTime;
        try {
            if (i == 0) {
                int[] iArr = this.ai;
                int length = iArr.length;
                int i4 = this.w;
                j = length > i4 ? (((long) iArr[i4]) * 1000000) - j2 : 0L;
                this.u++;
                if (!ebc.b(str)) {
                    return;
                }
            } else if (i != 2) {
                j = 0;
            } else {
                int[] iArr2 = this.ad;
                int length2 = iArr2.length;
                int i5 = this.w;
                j = length2 > i5 ? (((long) iArr2[i5]) * 1000000) - j2 : 0L;
                this.g++;
            }
            if (j > 0 && j < 200000000) {
                f32643b += j;
                Thread.sleep(j / 1000000, (int) (j % 1000000));
            }
            DatagramPacket datagramPacket = new DatagramPacket(e, i2, InetAddress.getByName(str), i3);
            long jNanoTime2 = System.nanoTime();
            if (datagramSocket != null) {
                datagramSocket.send(datagramPacket);
            }
            long jNanoTime3 = System.nanoTime();
            if (this.d) {
                c(jNanoTime3, jNanoTime2);
            }
        } catch (IOException e2) {
            dyg.c(false, "CombinationTask", e2.getMessage(), "current Index", Integer.valueOf(i2));
        } catch (InterruptedException e3) {
            dyg.c(false, "CombinationTask", "Unit sleep failed, ", e3.getMessage());
        }
    }

    private void c(long j, long j2) {
        int[] iArr;
        int i;
        long j3 = j - j2;
        if (j3 > 5000000) {
            if (this.f && (i = (iArr = this.ai)[0]) <= 2) {
                iArr[0] = i + 4;
                int[] iArr2 = this.ag;
                iArr2[0] = iArr2[0] + 1;
                int[] iArr3 = this.ad;
                iArr3[0] = iArr3[0] + 4;
            } else if (j3 > 50000000) {
                int[] iArr4 = this.ai;
                iArr4[0] = iArr4[0] + 2;
                int[] iArr5 = this.ag;
                iArr5[0] = iArr5[0] + 1;
                int[] iArr6 = this.ad;
                iArr6[0] = iArr6[0] + 2;
            } else {
                int[] iArr7 = this.ai;
                iArr7[0] = iArr7[0] + 1;
                int[] iArr8 = this.ad;
                iArr8[0] = iArr8[0] + 1;
            }
            int[] iArr9 = this.ai;
            if (iArr9[0] < 10 && j - this.ab >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                iArr9[0] = 10;
                this.ag[0] = 10;
                this.ad[0] = 10;
            }
            if (iArr9[0] > 200) {
                iArr9[0] = 200;
                this.ag[0] = 200;
                this.ad[0] = 200;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DatagramSocket datagramSocket, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            e(datagramSocket, 8);
            e(datagramSocket, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MulticastSocket multicastSocket, int i) {
        String str = this.y + "127.141";
        for (int i2 = 0; i2 < i; i2++) {
            b(multicastSocket, 304, str);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DatagramSocket f32651a;
        private volatile boolean e;

        private c() {
            this.f32651a = null;
            this.e = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            DatagramSocket datagramSocket;
            try {
                try {
                    this.f32651a = new DatagramSocket(AccessNetWorkTask.DEFAULT_UDOREV_PORT);
                    dyg.a(false, "CombinationTask", "UdpServer: new DatagramSocket ");
                    this.f32651a.setReuseAddress(true);
                    while (!this.e) {
                        byte[] bArr = new byte[256];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 256);
                        this.f32651a.receive(datagramPacket);
                        InetAddress address = datagramPacket.getAddress();
                        byte b2 = bArr[0];
                        int i = b2 & 255;
                        dyg.a(false, "CombinationTask", "UdpServer: Buffer0 = ", Byte.valueOf(b2), " crc = ", Integer.valueOf(i), " mIpData[1] =", Integer.valueOf(eba.this.p[1]));
                        if (i == eba.this.p[1]) {
                            String strReplaceAll = address != null ? address.toString().replaceAll("/", "") : "0.0.0.0";
                            dyg.e(true, "CombinationTask", "UdpServer: ipClientAddress is ", strReplaceAll);
                            dyg.a(false, "CombinationTask", "UdpServer get message: ", strReplaceAll);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            messageObtain.obj = strReplaceAll;
                            eba.this.s.sendMessage(messageObtain);
                            break;
                        }
                    }
                    dyg.e(false, "CombinationTask", "UdpServer: finally close resource");
                    DatagramSocket datagramSocket2 = this.f32651a;
                    if (datagramSocket2 != null) {
                        datagramSocket2.disconnect();
                        this.f32651a.close();
                    }
                } catch (SocketException e) {
                    dyg.c(false, "CombinationTask", "UdpServer: ", e.getMessage());
                    dyg.e(false, "CombinationTask", "UdpServer: finally close resource");
                    datagramSocket = this.f32651a;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.f32651a.close();
                } catch (IOException e2) {
                    dyg.c(false, "CombinationTask", "UdpServer: ", e2.getMessage());
                    eba.this.s.sendEmptyMessage(3);
                    dyg.e(false, "CombinationTask", "UdpServer: finally close resource");
                    datagramSocket = this.f32651a;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.f32651a.close();
                }
            } catch (Throwable th) {
                dyg.e(false, "CombinationTask", "UdpServer: finally close resource");
                DatagramSocket datagramSocket3 = this.f32651a;
                if (datagramSocket3 != null) {
                    datagramSocket3.disconnect();
                    this.f32651a.close();
                }
                throw th;
            }
        }

        public void c() {
            if (eba.this.af != null) {
                eba.this.af.e = false;
                lsy.a(eba.this.af);
            } else {
                dyg.c(false, "CombinationTask", "UdpServer: start() mUdpServer is null");
            }
        }

        public void a() {
            if (eba.this.af != null) {
                eba.this.af.e = true;
                if (eba.this.af.f32651a == null) {
                    return;
                }
                dyg.e(false, "CombinationTask", "mUdpServer: is close ", Boolean.valueOf(eba.this.af.f32651a.isClosed()));
                eba.this.af.f32651a.close();
                dyg.c(false, "CombinationTask", "UdpServer: stop() serverSocket closed");
                return;
            }
            dyg.c(false, "CombinationTask", "UdpServer: stop() mUdpServer is null");
        }
    }

    private String b() {
        int i = this.ah / 500;
        if (i > 99) {
            i = 99;
        }
        int i2 = this.u / 500;
        if (i2 > 99) {
            i2 = 99;
        }
        int i3 = this.g / 500;
        int i4 = i3 <= 99 ? i3 : 99;
        String str = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        String str2 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        String str3 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4));
        String str4 = String.format(Locale.ENGLISH, "-%03d", Integer.valueOf(this.ai[0]));
        StringBuilder sb = new StringBuilder(16);
        sb.append(this.aa);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int[][] iArr = this.o;
        if (iArr != null) {
            if (iArr.length > 0) {
                this.an = new int[iArr.length];
            }
            int i = 0;
            while (true) {
                int[][] iArr2 = this.o;
                if (i >= iArr2.length) {
                    return;
                }
                int iAddNetwork = this.ae.addNetwork(ebh.a(new String(ecj.e(iArr2[i]), Charset.forName("UTF-8"))));
                this.an[i] = iAddNetwork;
                this.ae.saveConfiguration();
                dyg.a(false, "CombinationTask", "addNetwork ", Integer.valueOf(iAddNetwork), " sdk api ", Integer.valueOf(Build.VERSION.SDK_INT));
                if (Build.VERSION.SDK_INT < 28) {
                    this.ae.enableNetwork(iAddNetwork, false);
                }
                i++;
            }
        } else {
            dyg.a(false, "CombinationTask", "mConfigMsg is null");
        }
    }
}
