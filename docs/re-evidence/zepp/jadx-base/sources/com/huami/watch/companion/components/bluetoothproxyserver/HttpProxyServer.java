package com.huami.watch.companion.components.bluetoothproxyserver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.ParcelUuid;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.components.bluetoothproxyserver.HttpProxyServer;
import com.huami.watch.companion.components.bluetoothproxyserver.session.BluetoothServerTransfer;
import com.huami.watch.companion.components.bluetoothproxyserver.session.DNSHandler;
import com.huami.watch.companion.components.bluetoothproxyserver.session.ServerTransportSession;
import com.huami.watch.companion.components.bluetoothproxyserver.session.TransferWrapper;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.Utils;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.util.RxBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class HttpProxyServer {
    private static final String f = "HttpProxyServer";
    private BluetoothAdapter a;
    private volatile boolean b = false;
    private BluetoothServerSocket c = null;
    private Disposable d = RxBus.get().toObservable().subscribe(new a(), new Consumer() { // from class: xa4
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) throws Exception {
            HttpProxyServer.i((Throwable) obj);
        }
    });
    private Context e;
    private static final String g = "00008888-0000-1000-8000-00805F9B34FB";
    public static final ParcelUuid PROXY = ParcelUuid.fromString(g);
    private static volatile ExecutorService h = null;

    public class a implements Consumer<Object> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            ProxyLog.D(HttpProxyServer.f, "Event : " + obj);
            if (obj instanceof ConnectedEvent) {
                ProxyLog.D(HttpProxyServer.f, "手表连接，重新初始化蓝牙连接");
                HttpProxyServer.this.init();
                return;
            }
            if (obj instanceof DisconnectedEvent) {
                ProxyLog.D(HttpProxyServer.f, "手表断开连接，释放Session");
                if (TransferWrapper.getInstance() != null) {
                    TransferWrapper.getInstance().release();
                }
                if (ServerTransportSession.getInstance() != null) {
                    ServerTransportSession.getInstance().releaseSession();
                    return;
                }
                return;
            }
            if (obj instanceof DeviceUnboundEvent) {
                ProxyLog.D(HttpProxyServer.f, "手表解绑，释放Session");
                if (TransferWrapper.getInstance() != null) {
                    TransferWrapper.getInstance().release();
                }
                if (ServerTransportSession.getInstance() != null) {
                    ServerTransportSession.getInstance().releaseSession();
                }
            }
        }
    }

    public class b implements Runnable {

        public class a implements BluetoothServerTransfer.SocketErrorHandler {
            public a() {
            }

            @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.BluetoothServerTransfer.SocketErrorHandler
            public void onSocketError() {
                ProxyLog.D(HttpProxyServer.f, "收发数据出错，重新初始化蓝牙端口");
                HttpProxyServer.this.init();
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProxyLog.I(HttpProxyServer.f, ">>>>>> 启动 蓝牙连接 监听线程 >>>>>>");
            try {
                ProxyLog.D(HttpProxyServer.f, "等待客户端蓝牙socket连接 ........");
                BluetoothSocket bluetoothSocketAccept = HttpProxyServer.this.c.accept();
                ProxyLog.D(HttpProxyServer.f, "有客户端蓝牙socket连接 开始 ServerTransportSession:" + bluetoothSocketAccept);
                TransferWrapper.initialize(new BluetoothServerTransfer(bluetoothSocketAccept, new a()));
                ServerTransportSession.init(new DNSHandler(HttpProxyServer.this.e));
                HttpProxyServer.this.f();
            } catch (IOException e) {
                ProxyLog.E(HttpProxyServer.f, "IOException:" + e.toString());
            } catch (Exception e2) {
                ProxyLog.E(HttpProxyServer.f, "Exception:" + e2.toString());
            }
            ProxyLog.I(HttpProxyServer.f, "<<<<<< 蓝牙监听线程退出 <<<<<<");
        }
    }

    public HttpProxyServer(Context context) {
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void f() {
        ProxyLog.D(f, "Close listen Socket : ");
        BluetoothServerSocket bluetoothServerSocket = this.c;
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
                this.c = null;
            } catch (IOException e) {
                ProxyLog.E(f, "Close listen Socket error: " + e);
            }
        }
    }

    private void g() {
        BluetoothAdapter bluetoothAdapter;
        ProxyLog.D(f, "Server蓝牙Socket初始化开始...");
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < 10 && !this.b; i++) {
            try {
                this.c = this.a.listenUsingRfcommWithServiceRecord("HTTP PROXY", PROXY.getUuid());
                z2 = true;
            } catch (Exception e) {
                ProxyLog.E(f, "Error create RfcommListenSocket " + e.toString());
                z2 = false;
            }
            if (z2 || (bluetoothAdapter = this.a) == null) {
                break;
            }
            int state = bluetoothAdapter.getState();
            if (state != 11 && state != 12) {
                ProxyLog.W(f, "initRfcommSocket failed as BT is (being) turned off");
                break;
            }
            try {
                ProxyLog.V(f, "wait 300 ms");
                Thread.sleep(300L);
            } catch (InterruptedException unused) {
                ProxyLog.E(f, "socketAcceptThread thread was interrupted (3)");
            }
        }
        if (this.b) {
            f();
        } else {
            z = z2;
        }
        if (z) {
            ProxyLog.V(f, "成功创建蓝牙监听 socket ");
        } else {
            ProxyLog.E(f, "Error to create listening socket after 10 try");
        }
        ProxyLog.D(f, "蓝牙ServerSocket初始化结束.");
    }

    public static ExecutorService getThreadPool() {
        if (h == null) {
            synchronized (HttpProxyServer.class) {
                if (h == null) {
                    h = Executors.newFixedThreadPool(30);
                }
            }
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Throwable th) throws Exception {
        HMLog.warn(f, th, new Function0() { // from class: ya4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpProxyServer.h();
            }
        });
    }

    public static void main(String[] strArr) {
    }

    public void init() {
        ProxyLog.D(f, "系统初始化开始...");
        if (!Utils.isConnectWithPhone(this.e)) {
            ProxyLog.D(f, "没有与手表连接，放弃初始化蓝牙");
            return;
        }
        try {
            ProxyLog.I(f, "当前线程池中活动线程数为：" + ((ThreadPoolExecutor) h).getActiveCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.a = BluetoothAdapter.getDefaultAdapter();
        g();
        ProxyLog.D(f, "系统初始化完成.");
        start();
    }

    public void release() {
        this.d.dispose();
    }

    public synchronized void start() {
        getThreadPool().execute(new b());
    }
}
