package defpackage;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class cny extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f1884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedBlockingQueue<byte[]> f1885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1886c;
    private MessageReceiveCallback d;
    private DeviceInfo e;
    private String g;

    public cny(DeviceInfo deviceInfo, MessageReceiveCallback messageReceiveCallback, int i) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f1884a = atomicBoolean;
        String str = "ReceiverDataAsyncProcessor5A" + i;
        this.g = str;
        LogUtil.b("ReceiverDataAsyncProcessor5A", "ReceiverDataAsyncProcessor5A mtag ", str);
        this.f1885b = new LinkedBlockingQueue<>();
        if (deviceInfo != null && deviceInfo.getDeviceMac() != null) {
            this.e = deviceInfo;
            int length = deviceInfo.getDeviceMac().length();
            String deviceMac = deviceInfo.getDeviceMac();
            if (length >= 3) {
                setName("ReceiverDataAsyncProcessor5A-" + deviceMac.substring(length - 3, length));
            } else {
                setName("ReceiverDataAsyncProcessor5A-" + deviceMac);
            }
        }
        if (messageReceiveCallback == null) {
            LogUtil.e("ReceiverDataAsyncProcessor5A", "ReceiverDataAsyncProcessor5A receiveCallback is null.");
        }
        this.d = messageReceiveCallback;
        atomicBoolean.set(true);
        this.f1886c = i;
    }

    public boolean e(byte[] bArr) {
        if (this.f1885b == null) {
            LogUtil.e(this.g, "receive data queue is invalid.");
            return false;
        }
        if (bArr == null) {
            LogUtil.e(this.g, "data is invalid.");
            return false;
        }
        LogUtil.b(this.g, "add receive data device: ", cpl.a(this.e.getDeviceMac()));
        if (this.f1885b.size() >= 10000) {
            LogUtil.d(this.g, "add receive data error. queue is max than ", 10000);
            return false;
        }
        return this.f1885b.offer(bArr);
    }

    public void a() {
        LogUtil.b(this.g, "stop receive data  thread.", cpl.a(this.e.getDeviceMac()));
        this.f1884a.set(false);
        LinkedBlockingQueue<byte[]> linkedBlockingQueue = this.f1885b;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
            this.f1885b.offer(new byte[0]);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        LogUtil.b(this.g, "receive data thread start.", cpl.a(this.e));
        if (this.f1885b == null) {
            LogUtil.e(this.g, "receive data queue is invalid.", cpl.a(this.e));
            return;
        }
        while (this.f1884a.get()) {
            try {
                byte[] bArrTake = this.f1885b.take();
                if (bArrTake != null && bArrTake.length > 0) {
                    cpl.d(this.g, bArrTake, cpl.a(this.e), " Device-->SDK : ");
                    c(bArrTake);
                }
            } catch (InterruptedException unused) {
                LogUtil.d(this.g, "mReceiveDataQueue take InterruptedException");
            }
        }
        LogUtil.b(this.g, "receive data thread stop.", cpl.a(this.e));
    }

    private void c(byte[] bArr) {
        cmm cmmVar = new cmm();
        cmmVar.a(bArr);
        cmmVar.d(this.f1886c);
        if (this.d == null || this.e == null) {
            return;
        }
        LogUtil.b(this.g, "dataLen: ", Integer.valueOf(bArr.length), "mSocketChannel: ", Integer.valueOf(this.f1886c));
        this.d.onDataReceived(this.e, cmmVar, 0);
    }
}
