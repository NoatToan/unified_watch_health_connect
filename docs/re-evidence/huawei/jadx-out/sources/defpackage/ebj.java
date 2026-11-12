package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Patterns;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public class ebj extends AccessNetWorkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseCallbackInterface f32673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f32674b = new Handler() { // from class: ebj.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                ebj.this.b(message);
                ebj.this.stopTask();
                return;
            }
            if (i == 2) {
                if (ebj.this.f32673a != null) {
                    ebj.this.f32673a.onFailure(2108);
                }
                ebj.this.stopTask();
                return;
            }
            if (i == 3) {
                if (ebj.this.f32673a != null) {
                    ebj.this.f32673a.onFailure(2101);
                }
                ebj.this.stopTask();
                return;
            }
            if (i == 4) {
                LogUtil.d("ProbeRequestTask", "stop send package");
                if (ebj.this.f32673a != null) {
                    ebj.this.f32673a.onStatus(2210);
                }
                ebj.this.pauseTask();
                return;
            }
            if (i == 5) {
                LogUtil.a("ProbeRequestTask", "SDK_INT ", Integer.valueOf(Build.VERSION.SDK_INT));
                if (Build.VERSION.SDK_INT >= 28) {
                    for (int i2 : ebj.this.i) {
                        ebj.this.h.enableNetwork(i2, true);
                    }
                }
                ebj.this.h.startScan();
                ebj.this.f32674b.sendEmptyMessageDelayed(5, 2000L);
                return;
            }
            LogUtil.j("ProbeRequestTask", "unknown msg:", Integer.valueOf(message.what));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f32675c;
    private Context d;
    private int[][] e;
    private e f;
    private final WifiManager h;
    private int[] i;

    public ebj(Context context, ebb ebbVar, BaseCallbackInterface baseCallbackInterface) {
        this.d = context;
        this.f32673a = baseCallbackInterface;
        if (ebbVar != null) {
            this.f32675c = ebbVar.b();
        }
        this.f = new e();
        if (this.d == null) {
            LogUtil.j("ProbeRequestTask", "ProbeRequestTask mContext is null");
            this.d = BaseApplication.getContext();
        }
        LogUtil.d("ProbeRequestTask", "ProbeRequestTask mIpData: ", this.f32675c);
        if (this.f32675c == null) {
            this.f32675c = new int[1];
        }
        this.h = (WifiManager) this.d.getSystemService("wifi");
        this.e = ebh.e(this.f32675c);
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void startTask() {
        this.f32674b.sendEmptyMessageDelayed(4, 60000L);
        this.f32674b.sendEmptyMessageDelayed(2, 90000L);
        a();
        this.f32674b.sendEmptyMessage(5);
        e eVar = this.f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void pauseTask() {
        ebh.a(this.d);
        this.f32674b.removeMessages(5);
    }

    @Override // com.huawei.health.device.wifi.control.logic.AccessNetWorkTask
    public void stopTask() {
        ebh.a(this.d);
        e eVar = this.f;
        if (eVar != null) {
            eVar.c();
        }
        this.f32674b.removeMessages(4);
        this.f32674b.removeMessages(2);
        this.f32674b.removeMessages(5);
        this.f32674b.removeMessages(3);
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        DatagramSocket f32676b;
        private volatile boolean d;

        private e() {
            this.f32676b = null;
            this.d = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            DatagramSocket datagramSocket;
            try {
                try {
                    this.f32676b = new DatagramSocket(AccessNetWorkTask.DEFAULT_UDOREV_PORT);
                    LogUtil.a("ProbeRequestTask", "UdpServer: new DatagramSocket ");
                    this.f32676b.setReuseAddress(true);
                    while (!this.d) {
                        byte[] bArr = new byte[256];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 256);
                        this.f32676b.receive(datagramPacket);
                        LogUtil.a("ProbeRequestTask", "UdpServer receive readMsg: ", "");
                        InetAddress address = datagramPacket.getAddress();
                        byte b2 = bArr[0];
                        int i = b2 & 255;
                        LogUtil.a("ProbeRequestTask", "UdpServer: Buffer0 = ", Byte.valueOf(b2), "crc = ", Integer.valueOf(i));
                        if (i == ebj.this.f32675c[1]) {
                            String strReplaceAll = address != null ? address.toString().replaceAll("/", "") : "0.0.0.0";
                            LogUtil.d("ProbeRequestTask", "UdpServer: ipClientAddress is ", strReplaceAll);
                            LogUtil.a("ProbeRequestTask", "UdpServer get message: ", strReplaceAll);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            messageObtain.obj = strReplaceAll;
                            ebj.this.f32674b.sendMessage(messageObtain);
                            break;
                        }
                        LogUtil.j("ProbeRequestTask", "UdpServer: receivecrc = ", Integer.valueOf(i), "mIpData[1] = ", Integer.valueOf(ebj.this.f32675c[1]));
                    }
                    LogUtil.d("ProbeRequestTask", "UdpServer: finally close resource");
                    DatagramSocket datagramSocket2 = this.f32676b;
                    if (datagramSocket2 != null) {
                        datagramSocket2.disconnect();
                        this.f32676b.close();
                    }
                } catch (SocketException unused) {
                    LogUtil.e("ProbeRequestTask", "UdpServer: SocketException");
                    LogUtil.d("ProbeRequestTask", "UdpServer: finally close resource");
                    datagramSocket = this.f32676b;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.f32676b.close();
                } catch (IOException unused2) {
                    LogUtil.e("ProbeRequestTask", "UdpServer: IOException");
                    ebj.this.f32674b.sendEmptyMessage(3);
                    LogUtil.d("ProbeRequestTask", "UdpServer: finally close resource");
                    datagramSocket = this.f32676b;
                    if (datagramSocket == null) {
                        return;
                    }
                    datagramSocket.disconnect();
                    this.f32676b.close();
                }
            } catch (Throwable th) {
                LogUtil.d("ProbeRequestTask", "UdpServer: finally close resource");
                DatagramSocket datagramSocket3 = this.f32676b;
                if (datagramSocket3 != null) {
                    datagramSocket3.disconnect();
                    this.f32676b.close();
                }
                throw th;
            }
        }

        public void e() {
            ebj.this.f.d = false;
            lsy.a(ebj.this.f);
        }

        public void c() {
            ebj.this.f.d = true;
            if (ebj.this.f.f32676b == null) {
                return;
            }
            LogUtil.d("ProbeRequestTask", "mUdpServer: is close ", Boolean.valueOf(ebj.this.f.f32676b.isClosed()));
            ebj.this.f.f32676b.close();
            LogUtil.j("ProbeRequestTask", "UdpServer: stop() mServerSocket closed");
        }
    }

    private void a() {
        int[][] iArr = this.e;
        if (iArr.length > 0) {
            this.i = new int[iArr.length];
        }
        int i = 0;
        while (true) {
            int[][] iArr2 = this.e;
            if (i >= iArr2.length) {
                return;
            }
            int iAddNetwork = this.h.addNetwork(ebh.a(new String(ecj.e(iArr2[i]), Charset.forName("UTF-8"))));
            this.i[i] = iAddNetwork;
            this.h.saveConfiguration();
            LogUtil.d("ProbeRequestTask", "addNetwork ", Integer.valueOf(iAddNetwork));
            LogUtil.d("ProbeRequestTask", "HiddenSSID =", Boolean.valueOf(this.h.getConnectionInfo().getHiddenSSID()));
            if (Build.VERSION.SDK_INT < 28) {
                this.h.enableNetwork(iAddNetwork, false);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        try {
            Object obj = message.obj;
            if (!(obj instanceof String)) {
                LogUtil.j("ProbeRequestTask", "ipAddressObj not instanceof String");
                return;
            }
            String str = (String) obj;
            if (Patterns.IP_ADDRESS.matcher(str).matches()) {
                LogUtil.a("ProbeRequestTask", "baseurl is ", dyg.b(str));
                BaseCallbackInterface baseCallbackInterface = this.f32673a;
                if (baseCallbackInterface != null) {
                    baseCallbackInterface.onSuccess(str);
                    return;
                }
                return;
            }
            BaseCallbackInterface baseCallbackInterface2 = this.f32673a;
            if (baseCallbackInterface2 != null) {
                baseCallbackInterface2.onFailure(2101);
            }
        } catch (IndexOutOfBoundsException unused) {
            LogUtil.e("ProbeRequestTask", "processGetMessage IndexOutOfBoundsException");
        }
    }
}
