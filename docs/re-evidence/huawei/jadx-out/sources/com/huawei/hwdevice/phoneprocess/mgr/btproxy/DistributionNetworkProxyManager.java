package com.huawei.hwdevice.phoneprocess.mgr.btproxy;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.coo;
import defpackage.cpl;
import defpackage.cqj;
import defpackage.ecu;
import defpackage.mlq;
import defpackage.mlt;
import defpackage.mlw;
import defpackage.mlx;
import defpackage.mlz;
import defpackage.mma;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DistributionNetworkProxyManager implements DistributionNetworkTcpSocketIoManager.Delegator {
    private static final int COMMAND_QUEUE_SLEEP = 3;
    private static final int COMMAND_QUEUE_WARN = 6;
    private static final int DEFAULT_BYTES_VALUE = -1;
    private static final int DEFAULT_SEQ_NUM = 0;
    private static final int DELAY_TIME_ONCE = 9;
    private static final int DIVISOR_NUM = 3;
    private static final int MAX_TRANSMISSION_SIZE = 990;
    private static final int SERVICE_STATE_STARTED = 3;
    private static final int SERVICE_STATE_STARTING = 2;
    private static final int SERVICE_STATE_STOPPED = 0;
    private static final int SERVICE_STATE_STOPPING = 1;
    private static final String TAG = "DistributionNetworkProxyManager";
    private static final String TAG_RELEASE = "BTSYNC_DistributionNetworkProxyManager";
    private static final int VALID_QUEUE_ROUND_NUMBER_FIVE = 5;
    private String mDeviceMac;
    private Thread mTcpServingThread;
    private volatile int mServiceState = 0;
    private final mlw mStreamsMap = new mlw();
    private boolean isTcpThreadRelay = false;
    private long mTcpMaxSupportPackageSize = 209715200;
    protected final DistributionNetworkTcpSocketIoManager mDistributionNetworkTcpSocketIoManager = new DistributionNetworkTcpSocketIoManager(this);

    protected abstract void doStartService(int i);

    protected abstract void onMessageReceived(mlq mlqVar);

    protected abstract void startUdpRelayingThread(int i);

    protected abstract void stopUdpRelayingThread();

    public DistributionNetworkProxyManager() {
        LogUtil.a(TAG, "DistributionNetworkProxyManager() init end");
    }

    public void startProxyService(int i, int i2) {
        ReleaseLogUtil.d(TAG_RELEASE, "send start proxy service.");
        if (this.mServiceState == 3 || this.mServiceState == 2) {
            LogUtil.d(TAG, "Received start proxy service request but service is not stopped/stopping yet.");
            return;
        }
        this.mServiceState = 2;
        setTcpMaxSupportPackageSize(i);
        doStartService(i2);
        this.mServiceState = 3;
    }

    public void stopProxyService() {
        ReleaseLogUtil.d(TAG_RELEASE, "send stop proxy Service.");
        if (this.mServiceState == 0 || this.mServiceState == 1) {
            LogUtil.a(TAG, "Received stop proxy service request but service is stopped/stopping.");
            return;
        }
        this.mServiceState = 1;
        doStopService();
        this.mServiceState = 0;
    }

    public void sendMessage(mlq mlqVar) {
        if (mlqVar == null) {
            LogUtil.d(TAG, "sendMessage btProxyMessageBean is null.");
        } else {
            LogUtil.a(TAG, "send message.");
            onMessageReceived(mlqVar);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkTcpSocketIoManager.Delegator
    public void doRead(SocketChannel socketChannel, ByteBuffer byteBuffer) {
        if (socketChannel == null || byteBuffer == null) {
            LogUtil.d(TAG, "channel or buffer is null.");
            return;
        }
        LogUtil.a(TAG, "enter Tcp DoRead:");
        mlx stream = getStream(socketChannel);
        if (stream == null || !stream.o()) {
            LogUtil.d(TAG, "doRead: unexpected inactive stream.");
            return;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            LogUtil.a(TAG, "doRead: avoiding sending zero bytes.");
            return;
        }
        byte[] bArr = new byte[iRemaining];
        long j = iRemaining;
        if (stream.h() + j > getTcpMaxSupportPackageSize()) {
            LogUtil.a(TAG, "Current channel's data is bigger than ", Long.valueOf(getTcpMaxSupportPackageSize()), " byte, so need to closed.");
            this.mDistributionNetworkTcpSocketIoManager.a(stream.j());
            sendCloseToNode(stream.f(), stream.g());
            xjt.f("send tcp data Current channel's data is bigger than " + getTcpMaxSupportPackageSize() + " byte, so need to closed.");
            return;
        }
        byteBuffer.get(bArr);
        long jE = stream.e();
        mlq mlqVar = new mlq();
        mlqVar.c(stream.f());
        mlqVar.c(5);
        mlqVar.g(stream.g());
        mlqVar.d(bArr);
        mlqVar.e(String.valueOf(jE));
        sendTcpDataToBt(mlqVar);
        stream.d(jE);
        stream.c(stream.h() + j);
        LogUtil.a(TAG, "doRead: forwarded TCP packets to node: ", cpl.a(stream.f()), ", seqId: ", Integer.valueOf(stream.g()), ", seqNumOfThisPacket: ", Long.valueOf(jE));
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkTcpSocketIoManager.Delegator
    public int doWrite(SocketChannel socketChannel) {
        int iN = -1;
        if (socketChannel == null) {
            LogUtil.d(TAG, "doWrite channel is null.");
            return -1;
        }
        LogUtil.a(TAG, "enter TcpDoWrite:");
        mlx stream = getStream(socketChannel);
        if (stream == null) {
            LogUtil.d(TAG, "Ignoring write for invalid stream channel.");
            return -1;
        }
        try {
            LogUtil.a(TAG, "Writing now to stream: ", Integer.valueOf(stream.g()), ", node: ", cpl.a(stream.f()));
            iN = stream.n();
            if (!stream.k() && stream.i()) {
                LogUtil.a(TAG, "Closing Stream streamId: ", Integer.valueOf(stream.g()), ", node:", cpl.a(stream.f()), ", closed and all writes flushed.");
                this.mDistributionNetworkTcpSocketIoManager.a(socketChannel);
            }
            return iN;
        } catch (IOException unused) {
            LogUtil.c(TAG, "Failed to write data to stream: ", Integer.valueOf(stream.g()), ", for node", cpl.a(stream.f()), ", IOException");
            this.mDistributionNetworkTcpSocketIoManager.a(socketChannel);
            return iN;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkTcpSocketIoManager.Delegator
    public void doClose(SocketChannel socketChannel) {
        if (socketChannel == null) {
            LogUtil.d(TAG, "doClose channel is null.");
            return;
        }
        LogUtil.a(TAG, "enter tcpDoClose:");
        mlx mlxVarRemoveStream = removeStream(socketChannel);
        if (mlxVarRemoveStream == null || mlxVarRemoveStream.i()) {
            return;
        }
        int iG = mlxVarRemoveStream.g();
        LogUtil.a(TAG, "Closed TCP Stream: ", Integer.valueOf(iG), ", for node: ", cpl.a(mlxVarRemoveStream.f()));
        sendCloseToNode(mlxVarRemoveStream.f(), mlxVarRemoveStream.g());
        mlxVarRemoveStream.m();
    }

    protected void doStopService() {
        LogUtil.a(TAG, "enter doStopService.");
        stopTcpRelayingThread();
        stopUdpRelayingThread();
        synchronized (this.mStreamsMap) {
            this.mStreamsMap.e();
        }
        this.mDeviceMac = null;
        mma.c();
        BtProxyNetworkChangeReceiver.c();
        mlz.d().a();
        mlz.d();
        mlz.e();
        LogUtil.a(TAG, "end doStopService.");
    }

    private void sendCloseToNode(String str, int i) {
        LogUtil.a(TAG, "Sending close message to node: ", cpl.a(str), ", stream: ", Integer.valueOf(i));
        mlq mlqVar = new mlq();
        mlqVar.c(str);
        mlqVar.g(i);
        mlqVar.d(new byte[0]);
        mlqVar.e(String.valueOf(0));
        mlqVar.c(4);
        sendTcpDataToBt(mlqVar);
    }

    private mlx getStream(SocketChannel socketChannel) {
        mlx mlxVarA;
        synchronized (this.mStreamsMap) {
            mlxVarA = this.mStreamsMap.a(socketChannel);
        }
        return mlxVarA;
    }

    protected mlx getStream(String str, int i) {
        mlx mlxVarD;
        if (TextUtils.isEmpty(str) || i < 0) {
            return new mlx(false);
        }
        synchronized (this.mStreamsMap) {
            mlxVarD = this.mStreamsMap.d(str, i);
        }
        return mlxVarD;
    }

    private mlx removeStream(SocketChannel socketChannel) {
        mlx mlxVarC;
        synchronized (this.mStreamsMap) {
            mlxVarC = this.mStreamsMap.c(socketChannel);
        }
        return mlxVarC;
    }

    protected void addStream(mlx mlxVar) {
        synchronized (this.mStreamsMap) {
            this.mStreamsMap.b(mlxVar);
        }
    }

    protected void handleWriteFromNode(String str, mlq mlqVar) {
        if (TextUtils.isEmpty(str) || mlqVar == null) {
            LogUtil.d(TAG, "node id: ", cpl.a(str), ", messageBean: ", mlqVar);
            return;
        }
        int iF = mlqVar.f();
        LogUtil.a(TAG, "handleWriteFromNode seqId: ", Integer.valueOf(iF), ", seqNum: ", mlqVar.m());
        int iF2 = mlqVar.f();
        long jM = CommonUtil.m(BaseApplication.getContext(), mlqVar.m());
        byte[] bArrJ = mlqVar.j();
        mlx stream = getStream(str, iF2);
        if (stream == null) {
            LogUtil.d(TAG, "Stream: ", Integer.valueOf(iF2), ", deviceId: ", cpl.a(str), ", seqNum: ", Long.valueOf(jM), ", dataLength:", Integer.valueOf(bArrJ.length));
            sendCloseToNode(str, iF2);
            return;
        }
        long jB = stream.b();
        LogUtil.a(TAG, "expectedSeqNum: ", Long.valueOf(jB), "incomingSeqNum: ", Long.valueOf(jM), "nodeId: ", cpl.a(stream.f()));
        if (jM != jB) {
            LogUtil.a(TAG, "out of order packet streamId: ", Integer.valueOf(iF2), ", node id: ", cpl.a(str), ", dataLength: ", Integer.valueOf(bArrJ.length), ", incomingSeqNum: ", Long.valueOf(jM), ", expectedSeqNum: ", Long.valueOf(jB));
            this.mDistributionNetworkTcpSocketIoManager.a(stream.j());
            return;
        }
        stream.e(jM);
        stream.b(stream.a() + ((long) bArrJ.length));
        stream.e(ByteBuffer.wrap(bArrJ));
        this.mDistributionNetworkTcpSocketIoManager.c(stream.j());
    }

    protected void handleCloseFromNode(String str, mlq mlqVar) {
        int iF = mlqVar.f();
        LogUtil.a(TAG, "Closing streamId: ", Integer.valueOf(iF), ", as requested by nodeId: ", cpl.a(str));
        mlx stream = getStream(str, iF);
        if (stream == null) {
            LogUtil.d(TAG, "Ignoring close for invalid streamId: ", Integer.valueOf(iF), ", node: ", cpl.a(str));
            return;
        }
        if (stream.i()) {
            LogUtil.a(TAG, "getSourceNodeClosed is true.");
            return;
        }
        stream.m();
        if (!stream.k()) {
            LogUtil.a(TAG, "streamId: ", Integer.valueOf(iF), ", nodeId: ", cpl.a(str));
            this.mDistributionNetworkTcpSocketIoManager.a(stream.j());
        } else {
            LogUtil.a(TAG, "streamId: ", Integer.valueOf(iF), ", nodeId: ", cpl.a(str));
        }
    }

    protected void startTcpRelayingThread() {
        String str = TAG;
        LogUtil.a(TAG, "Start TCP serving thread.");
        try {
            this.mDistributionNetworkTcpSocketIoManager.d();
        } catch (IOException unused) {
            LogUtil.c(TAG, "Failed to setup TCP proxy.");
        }
        Thread thread = new Thread(str) { // from class: com.huawei.hwdevice.phoneprocess.mgr.btproxy.DistributionNetworkProxyManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    DistributionNetworkProxyManager.this.mDistributionNetworkTcpSocketIoManager.e();
                } catch (IOException | ClosedSelectorException unused2) {
                    LogUtil.c(DistributionNetworkProxyManager.TAG, " btProxy TCP serving thread stopped due to exception.");
                }
            }
        };
        this.mTcpServingThread = thread;
        thread.start();
        this.isTcpThreadRelay = true;
        LogUtil.a(TAG, "startTcpRelayingThread isTcpThreadRelay is true");
    }

    private void stopTcpRelayingThread() {
        if (this.isTcpThreadRelay) {
            DistributionNetworkTcpSocketIoManager distributionNetworkTcpSocketIoManager = this.mDistributionNetworkTcpSocketIoManager;
            if (distributionNetworkTcpSocketIoManager != null) {
                distributionNetworkTcpSocketIoManager.b();
                try {
                    this.mTcpServingThread.join();
                    this.mDistributionNetworkTcpSocketIoManager.a();
                } catch (IOException unused) {
                    LogUtil.c(TAG, "Failed to clean up status of TCP proxy.");
                } catch (InterruptedException unused2) {
                    LogUtil.c(TAG, "Failed to join TCP relaying thread.");
                }
                this.isTcpThreadRelay = false;
                LogUtil.a(TAG, "btProxy TCP relaying thread stopped.");
                return;
            }
            LogUtil.d(TAG, "mDistributionNetworkTcpSocketIoManager is null.");
            return;
        }
        LogUtil.d(TAG, "stopTcpRelayingThread isTcpThreadRelay is false.");
    }

    private void sendTcpDataToBt(mlq mlqVar) {
        byte[] bArrA = mlt.a(getTcpCommandTlvBytes(mlqVar), mlqVar);
        mlz.d().c(bArrA, 0);
        try {
            int length = bArrA.length;
            LogUtil.a(TAG, "sendTcpDataToBt length: ", Integer.valueOf(length));
            int i = length / MAX_TRANSMISSION_SIZE;
            int i2 = 9;
            if (i != 0) {
                i2 = 9 * i;
            }
            String deviceMac = getDeviceMac();
            int iE = coo.e(deviceMac);
            LogUtil.a(TAG, "commandQueueSize is : ", Integer.valueOf(iE), "defaultDelay is : ", Integer.valueOf(i2));
            if (iE >= 6) {
                LogUtil.a(TAG, "commandQueueSize over warn value: ", Integer.valueOf(i2));
                Thread.sleep(i2);
                setCommandQueueSleep(deviceMac, i2, 5);
            } else if (iE > 3) {
                int i3 = (i2 / 3) << 1;
                Thread.sleep(i3);
                LogUtil.a(TAG, "sendTcpDataToBt else. sleep: ", Integer.valueOf(i3));
            }
        } catch (InterruptedException unused) {
            LogUtil.c(TAG, "sendTcpDataToBt occur InterruptedException.");
        }
    }

    private String getDeviceMac() {
        if (!TextUtils.isEmpty(this.mDeviceMac)) {
            return this.mDeviceMac;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, TAG);
        if (deviceList == null || deviceList.isEmpty()) {
            return this.mDeviceMac;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo != null) {
            this.mDeviceMac = deviceInfo.getDeviceIdentify();
        }
        return this.mDeviceMac;
    }

    private void setCommandQueueSleep(String str, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int iE = coo.e(str);
            LogUtil.a(TAG, "setCommandQueueSleep commandQueueSize: ", Integer.valueOf(iE));
            if (iE < 6) {
                return;
            }
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused) {
                LogUtil.c(TAG, "setCommandQueue occur InterruptedException.");
            }
        }
    }

    private byte[] getTcpCommandTlvBytes(mlq mlqVar) {
        return new cqj().b(1, mlqVar.f()).b(2, mlqVar.m()).b(3, mlqVar.c()).b(8, mlqVar.h()).e();
    }

    public long getTcpMaxSupportPackageSize() {
        return this.mTcpMaxSupportPackageSize;
    }

    public void setTcpMaxSupportPackageSize(long j) {
        if (j > 0) {
            this.mTcpMaxSupportPackageSize = j;
        }
    }
}
