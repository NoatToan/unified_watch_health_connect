package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class eay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ebd f32632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseCallbackInterface f32634c;
    private String f;
    private volatile int i;
    private b j = null;
    private a h = null;
    private Context d = null;
    private Handler e = new Handler() { // from class: eay.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                dyg.a(false, "AddSoftApDeviceTask", "msg is null");
                return;
            }
            dyg.a(false, "AddSoftApDeviceTask", "mDevSoftApTaskHandler msg.what:", Integer.valueOf(message.what));
            super.handleMessage(message);
            int i = message.what;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    eay.this.e();
                    return;
                } else if (i == 3) {
                    eay.this.e();
                    eay.this.f32634c.onSuccess("send data success");
                    return;
                } else {
                    dyg.c(false, "AddSoftApDeviceTask", "mDevSoftApTaskHandler default");
                    return;
                }
            }
            if (eay.this.j == null) {
                eay eayVar = eay.this;
                eayVar.j = new b();
            }
            if (eay.this.h == null) {
                eay eayVar2 = eay.this;
                eayVar2.h = new a();
            }
            eay.this.h.c();
            eay.this.j.a();
            eay.this.e.sendEmptyMessageDelayed(1, 55000L);
        }
    };

    public eay(ebd ebdVar, String str, BaseCallbackInterface baseCallbackInterface) {
        this.i = 0;
        this.f32634c = baseCallbackInterface;
        this.f32632a = ebdVar;
        this.f = str;
        this.i = 0;
    }

    public void d(Context context) {
        dyg.e(false, "AddSoftApDeviceTask", "startDeviceSoftApTask enter:", Integer.valueOf(this.i));
        this.d = context;
        if (this.i == 0) {
            if (Executors.newSingleThreadExecutor().submit(new c()).isDone()) {
                dyg.a(false, "AddSoftApDeviceTask", "submit isDone");
                this.i = 1;
                return;
            }
            return;
        }
        dyg.e(false, "AddSoftApDeviceTask", "softAp task is doing");
    }

    public void d() {
        dyg.e(false, "AddSoftApDeviceTask", "stopDeviceSoftApTask enter");
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
        this.e.removeMessages(1);
        this.e.sendEmptyMessage(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
            this.j = null;
        }
        a aVar = this.h;
        if (aVar != null) {
            aVar.d();
            this.h = null;
        }
        this.e.removeCallbacksAndMessages(null);
        this.i = 0;
    }

    class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr;
            int length;
            dyg.a(false, "AddSoftApDeviceTask", "AssembleDataPackage enter");
            byte[] bArrB = ecn.b();
            String strA = ecn.a();
            dyg.a(true, "AddSoftApDeviceTask", "AssembleDataPackage aes128Key  ", dyg.b(strA));
            byte[] bArrB2 = eay.b(eay.this.f32632a.j());
            byte[] bArrD = ecg.d(bArrB2, strA, bArrB);
            if (TextUtils.isEmpty(eay.this.f)) {
                dyg.a(false, "AddSoftApDeviceTask", "AssembleDataPackage mRegMessage is null");
                bArr = null;
                length = 0;
            } else {
                byte[] bArrD2 = ecg.d(eay.b(eay.this.f), strA, bArrB);
                bArr = bArrD2;
                length = bArrD2.length;
            }
            e(bArrD, strA, bArrB2, bArr, length);
            dyg.e(true, "AddSoftApDeviceTask", "AssembleDataPackage mDataPakage:", ecj.b(eay.this.f32633b));
            eay.this.e.sendEmptyMessage(0);
            dyg.e(false, "AddSoftApDeviceTask", "AssembleDataPackage leave");
        }

        private void e(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i) {
            byte[] bArrE = eay.this.e(bArr);
            byte[] bArrA = ecj.a(eay.this.f32632a.c(), bArrE, str);
            byte[] bArrB = eay.b(eay.this.f32632a.f());
            eay eayVar = eay.this;
            String strE = eayVar.e(eayVar.f32632a.a());
            byte[] bArrB2 = eay.b(strE);
            boolean z = bArrA == null || bArrB2 == null;
            boolean z2 = bArrB == null || bArr == null;
            if (z || z2 || bArrA.length != 16) {
                eay.this.f32634c.onFailure(ExceptionCode.CHECK_FILE_SIZE_FAILED);
                dyg.c(false, "AddSoftApDeviceTask", "encrypt data length is not correct");
                return;
            }
            if (bArr2 != null) {
                dyg.e(true, "AddSoftApDeviceTask", "AssembleDataPackage pwdArray len:", Integer.valueOf(bArr2.length));
            }
            dyg.e(false, "AddSoftApDeviceTask", "AssembleDataPackage ssid: ", dyg.b(eay.this.f32632a.f()), ";AssembleDataPackage deviceSsid: ", dyg.b(eay.this.f32632a.a()), ";AssembleDataPackage encodedPwd: len:", Integer.valueOf(bArr.length), ";AssembleDataPackage huaweiKeyIv: len:", Integer.valueOf(bArrE.length), ";AssembleDataPackage encodedKey: len:", Integer.valueOf(bArrA.length), ";AssembleDataPackage ssidArray: len:", Integer.valueOf(bArrB.length), ";AssembleDataPackage info:", strE);
            if (bArr3 != null) {
                dyg.e(true, "AddSoftApDeviceTask", "AssembleDataPackage regMsg: ", eay.this.f, ";AssembleDataPackage endcodeRegMsg: len:", Integer.valueOf(bArr3.length));
            }
            int length = bArrB.length + 20 + bArr.length + 1 + i;
            dyg.a(false, "AddSoftApDeviceTask", "AssembleDataPackage dataPakageLen: ", Integer.valueOf(length));
            if ((length & 1) == 1) {
                eay.this.f32633b = new byte[length + 1];
                eay.this.f32633b[length] = 0;
            } else {
                eay.this.f32633b = new byte[length];
            }
            eay.this.b(bArrB, bArr, bArrB2, bArr3, bArrA);
            eay.this.f32633b[1] = eay.d(eay.this.f32633b, 2, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = 0;
        this.f32633b[0] = (byte) (ecn.e(bArr3) & 255);
        this.f32633b[2] = a(this.f32632a);
        int i2 = 3;
        int i3 = 0;
        while (i3 < 16) {
            this.f32633b[i2] = bArr5[i3];
            i3++;
            i2++;
        }
        int i4 = i2 + 1;
        this.f32633b[i2] = (byte) (ecn.b(bArr.length, bArr2.length) & 255);
        int i5 = 0;
        while (i5 < bArr.length) {
            this.f32633b[i4] = bArr[i5];
            i5++;
            i4++;
        }
        int i6 = 0;
        while (i6 < bArr2.length) {
            this.f32633b[i4] = bArr2[i6];
            i6++;
            i4++;
        }
        if (bArr4 != null) {
            int i7 = i4 + 1;
            this.f32633b[i4] = (byte) ((bArr4.length >> 4) & 255);
            while (i < bArr4.length) {
                this.f32633b[i7] = bArr4[i];
                i++;
                i7++;
            }
            return;
        }
        this.f32633b[i4] = 0;
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            dyg.c(false, "AddSoftApDeviceTask", "UnsupportedEncodingException e:", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        if (bArr != null && bArr.length >= 16) {
            for (int i = 0; i < 16; i++) {
                bArr2[i] = bArr[i];
            }
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        String[] strArrSplit = str.split(Constants.LINK);
        if (strArrSplit.length < 4) {
            return "";
        }
        return strArrSplit[3].substring(1, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte d(byte[] bArr, int i, int i2) {
        int i3 = 255;
        while (i < i2) {
            i3 ^= bArr[i] & 255;
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = i3 & 1;
                i3 >>= 1;
                if (i5 != 0) {
                    i3 ^= 184;
                }
            }
            i++;
        }
        return (byte) (i3 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    private byte a(ebd ebdVar) {
        String[] strArrSplit = ebdVar.a().split(Constants.LINK);
        int i = 3;
        if (strArrSplit.length > 3) {
            strArrSplit[3].charAt(0);
        }
        dyg.a(false, "AddSoftApDeviceTask", "AssembleDataPackageget VersionMode: ", Integer.valueOf(ebdVar.c()));
        int iC = ebdVar.c();
        if (iC == 100) {
            i = 1;
        } else if (iC == 101) {
            i = 2;
        } else if (iC != 110) {
            i = 1;
        }
        return (byte) (i << 4);
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f32637c;

        private b() {
            this.f32637c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Throwable th;
            DatagramSocket datagramSocket;
            dyg.a(false, "AddSoftApDeviceTask", "SendThread run");
            Object[] objArr = null;
            DatagramSocket datagramSocket2 = null;
            try {
                try {
                    datagramSocket = new DatagramSocket();
                    try {
                        datagramSocket.setSendBufferSize(1024);
                        DatagramPacket datagramPacket = new DatagramPacket(eay.this.f32633b, eay.this.f32633b.length, InetAddress.getByName(ecn.c("255")), 5683);
                        Object systemService = eay.this.d.getSystemService("connectivity");
                        Object systemService2 = eay.this.d.getSystemService("wifi");
                        if ((systemService instanceof ConnectivityManager) && (systemService2 instanceof WifiManager)) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                            WifiManager wifiManager = (WifiManager) systemService2;
                            while (!this.f32637c) {
                                e(connectivityManager, wifiManager, false, datagramSocket, datagramPacket);
                            }
                        }
                        datagramSocket.close();
                    } catch (IOException unused) {
                        datagramSocket2 = datagramSocket;
                        dyg.c(false, "AddSoftApDeviceTask", "Create socket failed ");
                        if (datagramSocket2 != null) {
                            datagramSocket2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (datagramSocket != 0) {
                            datagramSocket.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    Object[] objArr2 = objArr;
                    th = th3;
                    datagramSocket = objArr2;
                }
            } catch (IOException unused2) {
            }
            objArr = new Object[]{"SendThread send package data thread out"};
            dyg.e(false, "AddSoftApDeviceTask", objArr);
        }

        private void e(ConnectivityManager connectivityManager, WifiManager wifiManager, boolean z, DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
            DhcpInfo dhcpInfo;
            NetworkInfo activeNetworkInfo;
            try {
                if (!ecv.e() && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                    ecv.e(wifiManager);
                }
                if (z) {
                    Thread.sleep(200L);
                } else {
                    NetworkInfo activeNetworkInfo2 = connectivityManager.getActiveNetworkInfo();
                    boolean z2 = activeNetworkInfo2 != null && activeNetworkInfo2.isConnected();
                    if (ecv.e() && z2 && (dhcpInfo = wifiManager.getDhcpInfo()) != null && dhcpInfo.gateway != 0) {
                        dyg.a(true, "AddSoftApDeviceTask", "SendThread Ip:", Integer.valueOf(dhcpInfo.gateway));
                    }
                    Thread.sleep(60L);
                }
                datagramSocket.send(datagramPacket);
            } catch (IOException e) {
                dyg.c(false, "AddSoftApDeviceTask", "SendThread socket failed, ", e.getMessage());
            } catch (InterruptedException e2) {
                dyg.c(false, "AddSoftApDeviceTask", "SendThread socket failed, ", e2.getMessage());
            }
            dyg.c(false, "AddSoftApDeviceTask", "SendThread send package data onetime");
        }

        public void a() {
            this.f32637c = false;
            if (Executors.newSingleThreadExecutor().submit(eay.this.j).isDone()) {
                dyg.a(false, "AddSoftApDeviceTask", "submit isDone");
            }
            dyg.a(false, "AddSoftApDeviceTask", "send package data thread start");
        }

        public void b() {
            dyg.a(false, "AddSoftApDeviceTask", "send package data thread stop");
            this.f32637c = true;
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f32636c;
        DatagramSocket e;

        private a() {
            this.e = null;
            this.f32636c = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strReplaceAll;
            dyg.a(false, "AddSoftApDeviceTask", "receive run enter");
            try {
                try {
                    DatagramSocket datagramSocket = new DatagramSocket(AccessNetWorkTask.DEFAULT_UDOREV_PORT);
                    this.e = datagramSocket;
                    datagramSocket.setReuseAddress(true);
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[256], 256);
                    dyg.a(false, "AddSoftApDeviceTask", " receive : new DatagramSocket ");
                    while (!this.f32636c) {
                        try {
                            this.e.setSoTimeout(1000);
                            this.e.receive(datagramPacket);
                        } catch (SocketTimeoutException e) {
                            dyg.c(false, "AddSoftApDeviceTask", "receive socket timeout, ", e.getMessage());
                        } catch (IOException e2) {
                            dyg.c(false, "AddSoftApDeviceTask", "receive socket failed, ", e2.getMessage());
                            try {
                                Thread.sleep(20L);
                            } catch (InterruptedException e3) {
                                dyg.c(false, "AddSoftApDeviceTask", "receive socket sleep interrupt, ", e3.getMessage());
                            }
                        }
                        String strB = b(datagramPacket);
                        if (!"HI-ACK".equals(strB)) {
                            dyg.c(false, "AddSoftApDeviceTask", "Receiver something but not ACK readMsg:", strB);
                        } else {
                            InetAddress address = datagramPacket.getAddress();
                            if (address == null) {
                                strReplaceAll = "0.0.0.0";
                            } else {
                                strReplaceAll = address.toString().replaceAll("/", "");
                            }
                            dyg.a(false, "AddSoftApDeviceTask", "Receiver: success ipClientAddress:", dyg.b(strReplaceAll));
                            eay.this.e.sendEmptyMessage(3);
                        }
                    }
                    DatagramSocket datagramSocket2 = this.e;
                    if (datagramSocket2 != null) {
                        datagramSocket2.disconnect();
                        this.e.close();
                    }
                    dyg.e(false, "AddSoftApDeviceTask", "Receiver: finally close resource");
                } catch (SocketException e4) {
                    dyg.c(false, "AddSoftApDeviceTask", "Receiver: ", e4.getMessage());
                    DatagramSocket datagramSocket3 = this.e;
                    if (datagramSocket3 != null) {
                        datagramSocket3.disconnect();
                        this.e.close();
                    }
                    dyg.e(false, "AddSoftApDeviceTask", "Receiver: finally close resource");
                }
                dyg.a(false, "AddSoftApDeviceTask", "Receiver run leave");
            } catch (Throwable th) {
                DatagramSocket datagramSocket4 = this.e;
                if (datagramSocket4 != null) {
                    datagramSocket4.disconnect();
                    this.e.close();
                }
                dyg.e(false, "AddSoftApDeviceTask", "Receiver: finally close resource");
                throw th;
            }
        }

        private String b(DatagramPacket datagramPacket) {
            dyg.e(false, "AddSoftApDeviceTask", "Receiver offset:", Integer.valueOf(datagramPacket.getOffset()), " len:", Integer.valueOf(datagramPacket.getLength()));
            if (datagramPacket.getOffset() >= 0 && datagramPacket.getLength() > 0 && datagramPacket.getOffset() + datagramPacket.getLength() < 256) {
                return new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), Charset.forName("UTF-8"));
            }
            dyg.c(false, "AddSoftApDeviceTask", "Receiver offset:", Integer.valueOf(datagramPacket.getOffset()), " len:", Integer.valueOf(datagramPacket.getLength()));
            return null;
        }

        public void c() {
            this.f32636c = false;
            lsy.a(eay.this.h);
            dyg.e(false, "AddSoftApDeviceTask", "mReceiveAckThread: start");
        }

        public void d() {
            dyg.e(false, "AddSoftApDeviceTask", "mReceiveAckThread: stoped!");
            this.f32636c = true;
        }
    }
}
