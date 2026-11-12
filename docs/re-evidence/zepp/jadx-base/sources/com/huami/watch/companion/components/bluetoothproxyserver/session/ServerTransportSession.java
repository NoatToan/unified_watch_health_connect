package com.huami.watch.companion.components.bluetoothproxyserver.session;

import com.huami.watch.companion.components.bluetoothproxyserver.HttpProxyServer;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpData;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpDataFactory;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes16.dex */
public class ServerTransportSession {
    private static final String h = "ServerTransportSession";
    private static ServerTransportSession i;
    private c c;
    private a d;
    private DNSHandler e;
    private Map<Long, ISocketHandle> a = new HashMap();
    private byte[] b = new byte[0];
    private BlockingQueue<HttpData> f = new LinkedBlockingQueue(500);
    private byte[] g = new byte[0];

    public class a extends b {
        private a() {
            super();
        }

        @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.ServerTransportSession.b
        public void a() {
            this.a = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                ServerTransportSession.this.f.put(HttpDataFactory.getHttpData(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                e.printStackTrace();
                stop();
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ProxyLog.I(ServerTransportSession.h, ">>>>>> 发送数据到蓝牙线程启动 >>>>>>");
            while (!this.a) {
                ProxyLog.D(ServerTransportSession.h, "获取数据发送到客户端...");
                try {
                    HttpData dataFromSendQue = ServerTransportSession.this.getDataFromSendQue();
                    if (dataFromSendQue.getType() == 1536) {
                        ProxyLog.I(ServerTransportSession.h, "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
                        return;
                    }
                    ProxyLog.V(ServerTransportSession.h, "取到数据发送到客户端 :" + ((int) dataFromSendQue.getType()) + "    id = " + dataFromSendQue.getId() + "    " + ((int) dataFromSendQue.getGroup()) + "    " + dataFromSendQue.getLength());
                    if (TransferWrapper.getInstance() == null) {
                        ProxyLog.D(ServerTransportSession.h, "没有初始化 TransferWrapper！！");
                        a();
                    } else {
                        try {
                            TransferWrapper.getInstance().sendData(dataFromSendQue.getBytes());
                        } catch (IOException e) {
                            e.printStackTrace();
                            ProxyLog.I(ServerTransportSession.h, "<<<<<< 发送数据到蓝牙线程退出 <<<<<< " + e.toString());
                            return;
                        }
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    ProxyLog.I(ServerTransportSession.h, "<<<<<< 发送数据到蓝牙线程退出 <<<<<< " + e2.toString());
                    return;
                }
            }
            ProxyLog.I(ServerTransportSession.h, "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
        }
    }

    public abstract class b extends Thread {
        public boolean a;

        private b() {
            this.a = false;
        }

        public void a() {
            this.a = true;
            interrupt();
        }
    }

    public class c extends b {
        private c() {
            super();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ProxyLog.I(ServerTransportSession.h, ">>>>>> 蓝牙数据接收线程启动 >>>>>>");
            while (!this.a) {
                try {
                    byte[] bytesFromBTSocket = HttpData.getBytesFromBTSocket(15);
                    if (bytesFromBTSocket == null) {
                        a();
                        ProxyLog.E(ServerTransportSession.h, "UpLinkThread head is null  ");
                        ProxyLog.I(ServerTransportSession.h, "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
                        return;
                    }
                    if (bytesFromBTSocket.length != 15) {
                        a();
                        ProxyLog.E(ServerTransportSession.h, "UpLinkThread head length  != HttpData.HTTP_DATA_HEAD_LEN");
                        ProxyLog.I(ServerTransportSession.h, "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
                        return;
                    }
                    short type = HttpData.getType(bytesFromBTSocket);
                    long id = HttpData.getId(bytesFromBTSocket);
                    byte group = HttpData.getGroup(bytesFromBTSocket);
                    int i = HttpData.getlength(bytesFromBTSocket);
                    ProxyLog.V(ServerTransportSession.h, " 收到手表端发来的请求 >>>>>>>>>> type = " + ((int) type) + "   id = " + id + "   group = " + ((int) group) + "   length = " + i);
                    if (i <= 0) {
                        ProxyLog.W(ServerTransportSession.h, "收到了长度异常的数据: " + i);
                    } else {
                        byte[] bytesFromBTSocket2 = HttpData.getBytesFromBTSocket(i);
                        if (bytesFromBTSocket2 == null) {
                            this.a = true;
                            ProxyLog.I(ServerTransportSession.h, "<<<<<< 蓝牙数据接收线程退出 body null <<<<<<");
                            return;
                        }
                        if (type == 1537) {
                            ServerTransportSession.this.addHandler(id, new SocketHandle(bytesFromBTSocket2, id, HMDeviceState.DEVICE_STATE_UPGRADE_RES));
                        } else if (type == 1540) {
                            ProxyLog.D(ServerTransportSession.h, "发送DNS请求...");
                            if (ServerTransportSession.this.e != null) {
                                ServerTransportSession.this.e.addDnsRquest(HttpDataFactory.getHttpData(type, id, group, (short) i, bytesFromBTSocket2));
                            } else {
                                ProxyLog.D(ServerTransportSession.h, "没有DNS处理Handler...");
                            }
                        } else if (type != 1543) {
                            ProxyLog.D(ServerTransportSession.h, "没有特别处理得类型:" + ((int) type));
                            SocketHandle handler = ServerTransportSession.this.getHandler(id);
                            if (handler != null) {
                                try {
                                    handler.mReceiveQueue.put(HttpDataFactory.getHttpBodyData(id, group, bytesFromBTSocket2));
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                ProxyLog.D(ServerTransportSession.h, "UpLinkThread can not find handle id = " + id);
                            }
                        } else if (ServerTransportSession.this.getHandler(id) != null) {
                            ProxyLog.D(ServerTransportSession.h, "已存在的Socket Id：" + id);
                            SocketHandle handler2 = ServerTransportSession.this.getHandler(id);
                            if (handler2 != null) {
                                try {
                                    handler2.mReceiveQueue.put(HttpDataFactory.getHttpData(type, id, group, (short) i, bytesFromBTSocket2));
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } else if (group == 4) {
                            ProxyLog.W(ServerTransportSession.h, "Socket " + id + " 已经关闭连接，不需要再关闭了！");
                        } else {
                            ProxyLog.D(ServerTransportSession.h, "收到新的 https 请求数据. 创建Socket Handle id：" + id);
                            ServerTransportSession.this.addHandler(id, new SocketHandle(bytesFromBTSocket2, id, type));
                        }
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    ProxyLog.I(ServerTransportSession.h, "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
                    return;
                } catch (OutOfMemoryError e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            ProxyLog.I(ServerTransportSession.h, "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ServerTransportSession(DNSHandler dNSHandler) {
        this.e = dNSHandler;
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.c = new c();
        this.d = new a();
        HttpProxyServer.getThreadPool().execute(this.c);
        HttpProxyServer.getThreadPool().execute(this.d);
    }

    private void c() {
        while (this.a.size() > 0) {
            this.a.get(this.a.keySet().iterator().next()).finish();
        }
        this.a.clear();
    }

    private void d(DNSHandler dNSHandler) {
        this.e = dNSHandler;
    }

    public static ServerTransportSession getInstance() {
        return i;
    }

    public static void init(DNSHandler dNSHandler) {
        ServerTransportSession serverTransportSession = i;
        if (serverTransportSession != null) {
            serverTransportSession.releaseSession();
            ProxyLog.D(h, "重新创建 ServerTransportSession");
        }
        i = new ServerTransportSession(dNSHandler);
    }

    public void addData2SendQue(HttpData httpData) {
        try {
            this.f.put(httpData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addHandler(long j, SocketHandle socketHandle) {
        synchronized (this.b) {
            this.a.put(Long.valueOf(j), socketHandle);
        }
    }

    public void clearDNSHandler() {
        this.e = null;
    }

    public HttpData getDataFromSendQue() throws InterruptedException {
        return this.f.take();
    }

    public SocketHandle getHandler(long j) {
        SocketHandle socketHandle;
        synchronized (this.b) {
            socketHandle = (SocketHandle) this.a.get(Long.valueOf(j));
        }
        return socketHandle;
    }

    public void releaseSession() {
        ProxyLog.D(h, "releaseSession " + this);
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        DNSHandler dNSHandler = this.e;
        if (dNSHandler != null) {
            dNSHandler.finish();
            this.e = null;
        }
        clearDNSHandler();
        c();
        i = null;
    }

    public void removeHandler(long j) {
        synchronized (this.b) {
            this.a.remove(Long.valueOf(j));
        }
    }
}
