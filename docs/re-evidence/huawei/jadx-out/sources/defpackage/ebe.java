package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Locale;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes7.dex */
public class ebe extends AccessNetWorkTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f32657b = new byte[2048];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f32658c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseCallbackInterface f32659a;
    private int f;
    private Context g;
    private ech j;
    private int[] k;
    private b m;
    private int[] n;
    private String o;
    private c q;
    private WifiManager.MulticastLock s;
    private final WifiManager w;
    private final int[] r = {2, 8, 16};
    private final int[] x = {2, 3, 6};
    private final int[] d = {2, 5, 10};
    private int y = 0;
    private int p = 0;
    private long v = 0;
    private int u = 0;
    private int t = 0;
    private int e = 0;
    private boolean h = false;
    private boolean i = false;
    private Handler l = new Handler() { // from class: ebe.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                ebe.this.b(message);
            } else if (i == 1) {
                dyg.c(false, "MulticastTask", "Device config failure ,result report ui ", ebe.this.b());
                ebe.this.j.e("config network failure", String.valueOf(2108));
                ebe.this.d();
                ebe.this.stopTask();
                ecj.a(ebe.this.g);
                if (ebe.this.f32659a != null) {
                    ebe.this.f32659a.onFailure(2108);
                }
            } else if (i == 2) {
                dyg.a(false, "MulticastTask", "stop send package", Integer.valueOf(ebe.this.r[0]), " send ", Integer.valueOf(ebe.this.t), " multicast", Integer.valueOf(ebe.this.e), " broadcast");
                if (ebe.this.f32659a != null) {
                    ebe.this.f32659a.onStatus(2210);
                }
                ebe.this.pauseTask();
            } else if (i == 5) {
                dyg.c(false, "MulticastTask", "UDP receive error，result report ui ", ebe.this.b());
                ebe.this.stopTask();
                ebe.this.j.e("config network failure", String.valueOf(2101));
                ecj.a(ebe.this.g);
                if (ebe.this.f32659a != null) {
                    ebe.this.f32659a.onFailure(2101);
                }
            } else {
                dyg.e(false, "MulticastTask", "mHandler default");
            }
            ebe.this.a(message);
        }
    };

    public ebe(Context context, ebb ebbVar, BaseCallbackInterface baseCallbackInterface) {
        this.g = context;
        this.f32659a = baseCallbackInterface;
        this.n = ebbVar.b();
        this.o = ebbVar.d();
        this.k = ebc.e(this.n);
        this.m = new b();
        this.q = new c();
        this.w = (WifiManager) this.g.getSystemService("wifi");
        ech echVar = new ech("modeMulti/Brocast/Probe");
        this.j = echVar;
        echVar.c();
    }

    public void c() {
        WifiManager.MulticastLock multicastLockCreateMulticastLock = this.w.createMulticastLock("health_wifi.test");
        this.s = multicastLockCreateMulticastLock;
        multicastLockCreateMulticastLock.acquire();
    }

    public void d() {
        int i = this.y;
        if (i == 1) {
            this.y = 0;
        } else {
            this.y = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        int i = message.what;
        if (i == 3) {
            dyg.a(false, "MulticastTask", "low speed mode 2");
            a(2);
            return;
        }
        if (i == 4) {
            dyg.a(false, "MulticastTask", "median speed mode 1");
            a(1);
            return;
        }
        if (i == 6) {
            this.y = 1;
            dyg.a(false, "MulticastTask", "change mode ", 1);
            this.m.b(this.y);
        } else if (i == 7) {
            this.w.startScan();
            this.l.sendEmptyMessageDelayed(7, 2000L);
        } else if (i == 2207) {
            dyg.e(false, "MulticastTask", "MULTICAST_STATUS_COAP_SCAN_OK");
            b(message);
        } else {
            dyg.e(false, "MulticastTask", "mHandler handleHandlerMessage default");
        }
    }

    private void a() {
        this.l.removeMessages(0);
        this.l.removeMessages(3);
        this.l.removeMessages(4);
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        this.l.removeMessages(6);
        this.l.removeMessages(7);
    }

    private void e() {
        long jNanoTime = System.nanoTime();
        this.v = jNanoTime;
        dyg.a(false, "MulticastTask", "startMulticast: start time is ", Long.valueOf(jNanoTime));
        b(1);
        int i = this.f;
        if (i == 0) {
            this.l.sendEmptyMessageDelayed(2, 30000L);
        } else if (i == 1) {
            this.y = 0;
            this.l.sendEmptyMessageDelayed(6, 10000L);
            this.l.sendEmptyMessageDelayed(2, 60000L);
        } else {
            this.l.sendEmptyMessageDelayed(2, 60000L);
        }
        this.l.sendEmptyMessageDelayed(1, 90000L);
        b bVar = this.m;
        if (bVar != null) {
            bVar.c();
        }
        c cVar = this.q;
        if (cVar != null) {
            cVar.d();
        }
        this.l.sendEmptyMessage(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        try {
            String str = message.obj instanceof String ? (String) message.obj : null;
            if (str != null) {
                dyg.a(true, "MulticastTask", "baseurl is ", str);
                stopTask();
                this.j.c("config network success");
                BaseCallbackInterface baseCallbackInterface = this.f32659a;
                if (baseCallbackInterface != null) {
                    baseCallbackInterface.onSuccess(str);
                }
            } else {
                stopTask();
                BaseCallbackInterface baseCallbackInterface2 = this.f32659a;
                if (baseCallbackInterface2 != null) {
                    baseCallbackInterface2.onFailure(2101);
                }
                this.j.e("config network success ,get url failure", String.valueOf(2101));
            }
        } catch (IndexOutOfBoundsException e) {
            dyg.c(false, "MulticastTask", e.getMessage());
        }
        dyg.a(false, "MulticastTask", "total send ", Integer.valueOf(this.u), " unicast，", Integer.valueOf(this.t), " multicast", Integer.valueOf(this.e), " broadcast");
    }

    public void a(int i) {
        this.p = i;
    }

    public void b(int i) {
        this.f = i;
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void startTask() {
        this.h = true;
        this.i = true;
        c();
        e();
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void pauseTask() {
        dyg.e(false, "MulticastTask", "disableMulticastAp");
        b bVar = this.m;
        if (bVar != null) {
            bVar.d();
        }
        WifiManager.MulticastLock multicastLock = this.s;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        this.s.release();
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void stopTask() {
        dyg.a(false, "MulticastTask", "disableMulticast: in");
        a();
        b bVar = this.m;
        if (bVar != null) {
            bVar.d();
        }
        c cVar = this.q;
        if (cVar != null) {
            cVar.b();
        }
        WifiManager.MulticastLock multicastLock = this.s;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        this.s.release();
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f32661a;
        boolean e;

        private b() {
            this.e = false;
            this.f32661a = false;
        }

        public void b(int i) {
            if (i == 0) {
                this.e = true;
            } else if (i == 1) {
                this.e = false;
            } else {
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
                    dyg.c(false, "MulticastTask", "Create multicast socket failed, ", e.getMessage());
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
                    dyg.c(false, "MulticastTask", "Create broadcast socket failed, ", e.getMessage());
                    datagramSocket = datagramSocket2;
                }
            } catch (IOException e5) {
                e = e5;
            }
            dyg.e(false, "MulticastTask", "Send mIpData len ", Integer.valueOf(ebe.this.n.length));
            dyg.a(false, "MulticastTask", "sendtype ", Integer.valueOf(ebe.this.y));
            b(ebe.this.y);
            while (!this.f32661a) {
                int length = ebe.this.n.length / 2;
                boolean z = !this.f32661a && this.e;
                for (int i = 0; z && i < 12; i++) {
                    ebe.this.b(multicastSocket, 8);
                    int i2 = 0;
                    while (i2 < length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(ebe.this.o);
                        int i3 = i2 * 2;
                        sb.append(ebe.this.n[i3]);
                        sb.append(".");
                        sb.append(ebe.this.n[i3 + 1]);
                        i2++;
                        ebe.this.c(multicastSocket, i2, sb.toString());
                    }
                }
                int length2 = ebe.this.k.length;
                for (int i4 = 0; z && i4 < 16; i4++) {
                    ebe.this.c(datagramSocket, 8);
                    for (int i5 = 0; !this.f32661a && i5 < length2; i5++) {
                        if (i5 % 30 == 0) {
                            ebe.this.c(datagramSocket, 4);
                        }
                        ebe.this.b(datagramSocket, ebe.this.k[i5]);
                    }
                }
            }
            e(multicastSocket, datagramSocket);
        }

        private void e(MulticastSocket multicastSocket, DatagramSocket datagramSocket) {
            if (multicastSocket != null) {
                multicastSocket.close();
            }
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }

        public void c() {
            this.f32661a = false;
            ThreadPoolManager.c().a("MulticastTask", this);
        }

        public void d() {
            this.f32661a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DatagramSocket datagramSocket, int i) {
        e(2, datagramSocket, i, ecn.c("255"), AccessNetWorkTask.DEFAULT_BROADCAST_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MulticastSocket multicastSocket, int i, String str) {
        e(0, multicastSocket, i, str, 58000);
    }

    private void e(int i, DatagramSocket datagramSocket, int i2, String str, int i3) {
        long jNanoTime = System.nanoTime();
        long j = jNanoTime - f32658c;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        f32658c = jNanoTime;
        try {
            if (i == 0) {
                int[] iArr = this.r;
                int length = iArr.length;
                int i4 = this.p;
                j2 = length > i4 ? (((long) iArr[i4]) * 1000000) - j : 0L;
                this.t++;
                if (!ebc.b(str)) {
                    return;
                }
            } else if (i == 2) {
                int[] iArr2 = this.d;
                int length2 = iArr2.length;
                int i5 = this.p;
                j2 = length2 > i5 ? (((long) iArr2[i5]) * 1000000) - j : 0L;
                this.e++;
            }
            e(j2);
            try {
                DatagramPacket datagramPacket = new DatagramPacket(f32657b, i2, InetAddress.getByName(str), i3);
                long jNanoTime2 = System.nanoTime();
                if (datagramSocket == null) {
                    LogUtil.j("MulticastTask", " the socket is null send packet failure");
                } else {
                    datagramSocket.send(datagramPacket);
                }
                long jNanoTime3 = System.nanoTime();
                if (this.h) {
                    d(jNanoTime3, jNanoTime2);
                }
            } catch (IOException e) {
                e = e;
                dyg.c(false, "MulticastTask", e.getMessage(), "current Index", Integer.valueOf(i2));
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private void e(long j) {
        if (j <= 0 || j >= 200000000) {
            return;
        }
        try {
            f32658c += j;
            Thread.sleep(j / 1000000, (int) (j % 1000000));
        } catch (InterruptedException e) {
            dyg.c(false, "MulticastTask", "Unit sleep failed, ", e.getMessage());
        }
    }

    private void d(long j, long j2) {
        int[] iArr;
        int i;
        long j3 = j - j2;
        if (j3 > 5000000) {
            if (this.i && (i = (iArr = this.r)[0]) <= 2) {
                iArr[0] = i + 4;
                int[] iArr2 = this.x;
                iArr2[0] = iArr2[0] + 1;
                int[] iArr3 = this.d;
                iArr3[0] = iArr3[0] + 4;
            } else if (j3 > 50000000) {
                int[] iArr4 = this.r;
                iArr4[0] = iArr4[0] + 2;
                int[] iArr5 = this.x;
                iArr5[0] = iArr5[0] + 1;
                int[] iArr6 = this.d;
                iArr6[0] = iArr6[0] + 2;
            } else {
                int[] iArr7 = this.r;
                iArr7[0] = iArr7[0] + 1;
                int[] iArr8 = this.d;
                iArr8[0] = iArr8[0] + 1;
            }
            int[] iArr9 = this.r;
            if (iArr9[0] < 10 && j - this.v >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                iArr9[0] = 10;
                this.x[0] = 10;
                this.d[0] = 10;
            }
            if (iArr9[0] > 200) {
                iArr9[0] = 200;
                this.x[0] = 200;
                this.d[0] = 200;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DatagramSocket datagramSocket, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            b(datagramSocket, 8);
            b(datagramSocket, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MulticastSocket multicastSocket, int i) {
        String str = this.o + "127.141";
        for (int i2 = 0; i2 < i; i2++) {
            c(multicastSocket, 304, str);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f32663a;
        DatagramSocket d;

        private c() {
            this.d = null;
            this.f32663a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            DatagramSocket datagramSocket;
            try {
                try {
                    this.d = new DatagramSocket(AccessNetWorkTask.DEFAULT_UDOREV_PORT);
                    dyg.a(false, "MulticastTask", "UdpServer: new DatagramSocket ");
                    this.d.setReuseAddress(true);
                    while (!this.f32663a) {
                        byte[] bArr = new byte[256];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 256);
                        this.d.receive(datagramPacket);
                        InetAddress address = datagramPacket.getAddress();
                        byte b2 = bArr[0];
                        int i = b2 & 255;
                        dyg.a(false, "MulticastTask", "UdpServer: Buffer0 = ", Byte.valueOf(b2), "crc = ", Integer.valueOf(i));
                        if (i == ebe.this.n[1]) {
                            String strReplaceAll = address != null ? address.toString().replaceAll("/", "") : "0.0.0.0";
                            dyg.e(false, "MulticastTask", "UdpServer: ipClientAddress is ", strReplaceAll);
                            dyg.e(false, "MulticastTask", "UdpServer get message: ", strReplaceAll);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 0;
                            messageObtain.obj = strReplaceAll;
                            ebe.this.l.sendMessage(messageObtain);
                            break;
                        }
                        dyg.e(false, "MulticastTask", "UdpServer: receivecrc = ", Integer.valueOf(i), "mIpData[1] = ", Integer.valueOf(ebe.this.n[1]));
                    }
                    dyg.e(false, "MulticastTask", "UdpServer: finally close resource");
                    DatagramSocket datagramSocket2 = this.d;
                    if (datagramSocket2 != null) {
                        datagramSocket2.disconnect();
                        this.d.close();
                    }
                } catch (SocketException e) {
                    dyg.c(false, "MulticastTask", "UdpServer: ", e.getMessage());
                    dyg.e(false, "MulticastTask", "UdpServer: finally close resource");
                    datagramSocket = this.d;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.d.close();
                } catch (IOException e2) {
                    dyg.c(false, "MulticastTask", "UdpServer: ", e2.getMessage());
                    ebe.this.l.sendEmptyMessage(5);
                    dyg.e(false, "MulticastTask", "UdpServer: finally close resource");
                    datagramSocket = this.d;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.d.close();
                }
            } catch (Throwable th) {
                dyg.e(false, "MulticastTask", "UdpServer: finally close resource");
                DatagramSocket datagramSocket3 = this.d;
                if (datagramSocket3 != null) {
                    datagramSocket3.disconnect();
                    this.d.close();
                }
                throw th;
            }
        }

        public void d() {
            ebe.this.q.f32663a = false;
            lsy.a(ebe.this.q);
        }

        public void b() {
            ebe.this.q.f32663a = true;
            if (ebe.this.q.d == null) {
                return;
            }
            dyg.e(false, "MulticastTask", "mUdpServer: is close ", Boolean.valueOf(ebe.this.q.d.isClosed()));
            ebe.this.q.d.close();
            dyg.c(false, "MulticastTask", "UdpServer: stop() serverSocket closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        int i = this.u / 500;
        if (i > 99) {
            i = 99;
        }
        int i2 = this.t / 500;
        if (i2 > 99) {
            i2 = 99;
        }
        int i3 = this.e / 500;
        int i4 = i3 <= 99 ? i3 : 99;
        String str = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        String str2 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        String str3 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4));
        String str4 = String.format(Locale.ENGLISH, "-%03d", Integer.valueOf(this.r[0]));
        StringBuilder sb = new StringBuilder(16);
        sb.append(this.y);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }
}
