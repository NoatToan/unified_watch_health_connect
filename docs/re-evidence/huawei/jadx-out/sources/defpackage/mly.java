package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes10.dex */
public class mly extends DistributionNetworkProxyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41904a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mmd f41905b = new mmd();
    private Thread d;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager
    public void startUdpRelayingThread(int i) {
        String str = "DistributionNetworkPhoneProxy";
        LogUtil.a("DistributionNetworkPhoneProxy", "Start btProxy UDP relaying thread.");
        try {
            this.f41905b.b(i);
        } catch (IOException unused) {
            LogUtil.c("DistributionNetworkPhoneProxy", "Failed to setup UDP relaying thread");
        }
        Thread thread = new Thread(str) { // from class: mly.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    mly.this.f41905b.a();
                } catch (IOException | ClosedSelectorException e) {
                    LogUtil.c("DistributionNetworkPhoneProxy", "btProxy UDP serving thread stopped due to ", ExceptionUtils.c(e));
                }
            }
        };
        this.d = thread;
        thread.start();
        this.f41904a = true;
        LogUtil.a("DistributionNetworkPhoneProxy", "startUdpRelayingThread isUdpThreadRelay is true");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager
    public void stopUdpRelayingThread() {
        if (this.f41904a) {
            mmd mmdVar = this.f41905b;
            if (mmdVar != null) {
                mmdVar.d();
                try {
                    this.d.join();
                    this.f41905b.c();
                } catch (InterruptedException unused) {
                    LogUtil.c("DistributionNetworkPhoneProxy", "Failed to join UDP relaying thread");
                }
                LogUtil.a("DistributionNetworkPhoneProxy", "btProxy UDP relaying thread stopped");
                this.f41904a = false;
                return;
            }
            LogUtil.d("DistributionNetworkPhoneProxy", "mUdpRelayingManager is null");
            return;
        }
        LogUtil.d("DistributionNetworkPhoneProxy", "stopUdpRelayingThread() isUdpThreadRelay is false");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager
    public void doStartService(int i) {
        startTcpRelayingThread();
        startUdpRelayingThread(i);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager
    public void onMessageReceived(mlq mlqVar) {
        if (mlqVar == null) {
            LogUtil.d("DistributionNetworkPhoneProxy", "messageBean is null");
            return;
        }
        String strC = mlqVar.c();
        int iH = mlqVar.h();
        LogUtil.a("DistributionNetworkPhoneProxy", "onMessageReceived proxy type: ", Integer.valueOf(iH));
        if (iH == 3) {
            b(mlqVar, strC);
            return;
        }
        if (iH == 4) {
            handleCloseFromNode(strC, mlqVar);
            return;
        }
        if (iH == 5) {
            handleWriteFromNode(strC, mlqVar);
        } else {
            if (iH != 6) {
                LogUtil.d("DistributionNetworkPhoneProxy", "onMessageReceived Unhandled packet type: ", Integer.valueOf(iH));
                return;
            }
            try {
                d(mlqVar, strC);
            } catch (IOException unused) {
                LogUtil.c("DistributionNetworkPhoneProxy", "Exception sending UDP packets out");
            }
        }
    }

    private void b(mlq mlqVar, String str) {
        int iF = mlqVar.f();
        byte[] bArrE = mlqVar.e();
        int iA = mlqVar.a();
        int iL = mlqVar.l();
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            socketChannelOpen.configureBlocking(false);
            socketChannelOpen.connect(new InetSocketAddress(InetAddress.getByAddress(bArrE), iA));
            if (iL == 1) {
                LogUtil.a("DistributionNetworkPhoneProxy", "set TcpConnect Socket KeepAlive");
                socketChannelOpen.socket().setKeepAlive(true);
            }
            addStream(new mlx(socketChannelOpen, str, iF, true));
            if (this.mDistributionNetworkTcpSocketIoManager == null) {
                LogUtil.d("DistributionNetworkPhoneProxy", "DistributionNetworkTcpSocketIoManager is null");
            } else {
                this.mDistributionNetworkTcpSocketIoManager.b(socketChannelOpen);
            }
            LogUtil.d("DistributionNetworkPhoneProxy", "handleTcpConnect success.");
        } catch (SocketException unused) {
            LogUtil.c("DistributionNetworkPhoneProxy", "socket is closed or socket is not connected or socket input is shutdown.");
        } catch (UnknownHostException unused2) {
            LogUtil.c("DistributionNetworkPhoneProxy", "if the IP address of the host could not be determined.");
        } catch (IOException unused3) {
            LogUtil.c("DistributionNetworkPhoneProxy", "if an I/O error occurs when creating the socket.");
        }
    }

    private void d(mlq mlqVar, String str) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByAddress(mlqVar.o()), mlqVar.k());
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(InetAddress.getByAddress(mlqVar.e()), mlqVar.a());
        byte[] bArrJ = mlqVar.j();
        LogUtil.a("DistributionNetworkPhoneProxy", "handleUdpData: srcPort: ", Integer.valueOf(mlqVar.k()), " dstPort: ", Integer.valueOf(mlqVar.a()));
        if (this.f41904a) {
            mmd mmdVar = this.f41905b;
            if (mmdVar != null) {
                mmdVar.b(str, inetSocketAddress, inetSocketAddress2).send(ByteBuffer.wrap(bArrJ), inetSocketAddress2);
                LogUtil.d("DistributionNetworkPhoneProxy", "handleUdpData success.");
                return;
            } else {
                LogUtil.d("DistributionNetworkPhoneProxy", "udpRelayingManager is null");
                return;
            }
        }
        LogUtil.d("DistributionNetworkPhoneProxy", "handleUdpData isUdpThreadRelay is false");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkTcpSocketIoManager.Delegator
    public void doAccept(SocketChannel socketChannel) {
        LogUtil.a("DistributionNetworkPhoneProxy", "doAccept");
    }
}
