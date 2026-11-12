package com.huami.watch.companion.components.bluetoothproxyserver.session;

import com.huami.watch.companion.components.bluetoothproxyserver.HttpProxyServer;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpRequestMessage;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.ConnectServerError;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine.RequestStartLine;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ApplicationLayerParser;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpData;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpDataFactory;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.SocketUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes16.dex */
public class SocketHandle implements ISocketHandle {
    private static final String l = "SocketHandle";
    private static final String m = "\r\n";
    private static final String n = "HTTP/1.0 200 Connection Established\r\nProxy-agent: HuamiProxy\r\n\r\n";
    private Socket a;
    private InputStream b;
    private OutputStream c;
    private HttpRequestMessage d;
    private int e;
    private long f;
    private ServerTransportSession g;
    private d j;
    private byte[] k;
    public boolean enabledAcceptEncoding = true;
    public boolean enabledKeepAlive = false;
    public BlockingQueue<HttpData> mReceiveQueue = new LinkedBlockingQueue(500);
    private b h = null;
    private a i = null;

    public class a extends c {
        private a() {
            super();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte b;
            ProxyLog.I(SocketHandle.l, ">>>>>> 开始执行 Socket " + SocketHandle.this.f + " Https2ClientThread 线程 >>>>>>");
            boolean z = true;
            while (!this.a) {
                try {
                    ProxyLog.D(SocketHandle.l, "Https2ClientThread waiting read from remote.....................");
                    byte[] bytesFromTCPSocket = HttpData.getBytesFromTCPSocket(SocketHandle.this.b);
                    ProxyLog.D(SocketHandle.l, "Https2ClientThread waiting read from remote body = " + bytesFromTCPSocket);
                    if (bytesFromTCPSocket != null) {
                        int length = bytesFromTCPSocket.length;
                        if (z) {
                            b = length < 10240 ? (byte) 0 : (byte) 1;
                        } else {
                            b = length < 10240 ? (byte) 3 : (byte) 2;
                        }
                        HttpData httpData = HttpDataFactory.getHttpData(HttpDataFactory.TLS, SocketHandle.this.f, b, (short) bytesFromTCPSocket.length, bytesFromTCPSocket);
                        if (SocketHandle.this.g != null) {
                            SocketHandle.this.g.addData2SendQue(httpData);
                        } else {
                            ProxyLog.E(SocketHandle.l, "Https2ClientThread mServerTransportSession is null");
                        }
                        z = false;
                    } else {
                        ProxyLog.W(SocketHandle.l, "getBytesFromTCPSocket is null, stop Https2ClientThread ");
                        SocketHandle.this.finish();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ClientThread 线程退出 <<<<<<" + e.toString());
                    long j = SocketHandle.this.f;
                    byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
                    SocketHandle.this.g.addData2SendQue(HttpDataFactory.getHttpData(HttpDataFactory.TLS, j, (byte) 4, (short) bArr.length, bArr));
                    return;
                }
            }
            ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ClientThread 线程退出 <<<<<<");
        }
    }

    public class b extends c {
        private b() {
            super();
        }

        @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.SocketHandle.c
        public void b() {
            this.a = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                SocketHandle.this.mReceiveQueue.put(HttpDataFactory.getHttpData(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                e.printStackTrace();
                stop();
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ProxyLog.I(SocketHandle.l, ">>>>>> 开始执行 Socket " + SocketHandle.this.f + " Https2ServerThread 线程 >>>>>>");
            while (!this.a) {
                try {
                    HttpData httpDataTake = SocketHandle.this.mReceiveQueue.take();
                    if (httpDataTake.getType() == 1536) {
                        ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ServerThread 线程退出 <<<<<< [NO_MORE_DATA]");
                        return;
                    }
                    ProxyLog.D(SocketHandle.l, "Https2ServerThread 发送数据到 server,  mSocketID = " + SocketHandle.this.f + "   group = " + ((int) httpDataTake.getGroup()));
                    if (httpDataTake.getGroup() == 4) {
                        ProxyLog.D(SocketHandle.l, "客户端要求关闭连接，结束socket连接");
                        SocketHandle.this.finish();
                        ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ServerThread 线程退出 <<<<<< [CONNECTION CLOSE]");
                        return;
                    }
                    try {
                        SocketHandle.this.c.write(httpDataTake.getData());
                        SocketHandle.this.c.flush();
                    } catch (IOException e) {
                        ProxyLog.E(SocketHandle.l, "Https2ServerThread : " + e.toString());
                        SocketHandle.this.finish();
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ServerThread 线程退出 <<<<<<" + e2.toString());
                    return;
                }
            }
            ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " Https2ServerThread 线程退出 <<<<<<");
        }
    }

    public abstract class c extends Thread {
        public boolean a;

        private c() {
            this.a = false;
        }

        public boolean a() {
            return this.a;
        }

        public void b() {
            this.a = true;
            interrupt();
        }
    }

    public class d extends Thread {
        private d() {
        }

        public void a() {
            interrupt();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            String header;
            ProxyLog.I(SocketHandle.l, ">>>>>> Socket " + SocketHandle.this.f + " 启动SendThread线程 >>>>>>");
            int i2 = SocketHandle.this.e;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (i2 != 1537) {
                if (i2 != 1543) {
                    ProxyLog.D(SocketHandle.l, "未知的请求类型：" + SocketHandle.this.e);
                    header = null;
                    i = 0;
                } else {
                    i = 443;
                    header = ApplicationLayerParser.TLSPackage.findDestHost(SocketHandle.this.k);
                }
            } else {
                if (SocketHandle.this.d == null) {
                    ProxyLog.D(SocketHandle.l, "请求消息为空，放弃！");
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
                    return;
                }
                i = 80;
                ((RequestStartLine) SocketHandle.this.d.getStartLine()).getMethod();
                ProxyLog.D(SocketHandle.l, "mSocketID : " + SocketHandle.this.f + "  请求服务端：" + SocketHandle.this.d);
                header = SocketHandle.this.d.getHeader("host");
                if (header.contains(":")) {
                    String[] strArrSplit = header.split(":");
                    header = strArrSplit[0];
                    i = Integer.parseInt(strArrSplit[1]);
                }
            }
            ProxyLog.V(SocketHandle.l, "host = " + header + " port = " + i);
            try {
                SocketHandle.this.a = SocketUtil.connectServer(header, i, 30000);
            } catch (ConnectServerError e) {
                e.printStackTrace();
            }
            if (SocketHandle.this.a == null) {
                ProxyLog.E(SocketHandle.l, "mServerSocket 连接失败，放弃请求，主机为:" + header);
                ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
                return;
            }
            ProxyLog.V(SocketHandle.l, "mServerSocket 连接成功 : " + SocketHandle.this.a);
            ProxyLog.I(SocketHandle.l, ">>>>>> Socket " + SocketHandle.this.f + " 获取ServerSocket >>>>>>");
            try {
                SocketHandle.this.a.setSoTimeout(30000);
                SocketHandle socketHandle = SocketHandle.this;
                socketHandle.b = socketHandle.a.getInputStream();
                SocketHandle socketHandle2 = SocketHandle.this;
                socketHandle2.c = socketHandle2.a.getOutputStream();
                ProxyLog.I(SocketHandle.l, ">>>>>> Socket " + SocketHandle.this.f + " 获取ServerSocket OutputStream>>>>>>");
                ProxyLog.I(SocketHandle.l, ">>>>>> Socket " + SocketHandle.this.f + " 获取ServerSocket InputStream>>>>>>");
            } catch (SocketException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            int i3 = SocketHandle.this.e;
            if (i3 != 1537) {
                if (i3 != 1543) {
                    ProxyLog.D(SocketHandle.l, "未支持的类型:" + SocketHandle.this.e + "直接返回！");
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
                    return;
                }
                ProxyLog.D(SocketHandle.l, "发送Client Hello ！");
                if (!SocketUtil.writeSocket(SocketHandle.this.c, SocketHandle.this.k, false)) {
                    ProxyLog.E(SocketHandle.l, "向服务端发送数据失败，退出。");
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
                    return;
                }
                SocketHandle socketHandle3 = SocketHandle.this;
                socketHandle3.i = new a();
                SocketHandle socketHandle4 = SocketHandle.this;
                socketHandle4.h = new b();
                HttpProxyServer.getThreadPool().execute(SocketHandle.this.i);
                HttpProxyServer.getThreadPool().execute(SocketHandle.this.h);
            } else {
                if (!SocketUtil.writeSocket(SocketHandle.this.c, (HttpMessage) SocketHandle.this.d, false)) {
                    ProxyLog.E(SocketHandle.l, "向服务端发送数据失败，退出！");
                    ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
                    return;
                }
                SocketHandle socketHandle5 = SocketHandle.this;
                socketHandle5.i = new a();
                SocketHandle socketHandle6 = SocketHandle.this;
                socketHandle6.h = new b();
                ExecutorService threadPool = HttpProxyServer.getThreadPool();
                if (threadPool != null) {
                    threadPool.execute(SocketHandle.this.i);
                    threadPool.execute(SocketHandle.this.h);
                }
            }
            ProxyLog.I(SocketHandle.l, "<<<<<< Socket " + SocketHandle.this.f + " 退出SendThread线程 <<<<<<");
        }
    }

    public SocketHandle(byte[] bArr, long j, int i) {
        this.f = -1L;
        this.j = null;
        if (i == 1537) {
            try {
                this.d = new HttpRequestMessage(new ByteArrayInputStream(bArr));
            } catch (BuildHttpMessageError e) {
                e.printStackTrace();
            }
        }
        this.e = i;
        this.k = bArr;
        this.f = j;
        this.g = ServerTransportSession.getInstance();
        this.j = new d();
        HttpProxyServer.getThreadPool().execute(this.j);
    }

    private void p(HttpRequestMessage httpRequestMessage) {
        String header = httpRequestMessage.getHeader("Connection");
        if (header != null) {
            httpRequestMessage.removeHeaders(header.split(","));
        }
        if (this.enabledKeepAlive) {
            httpRequestMessage.addHeader("Connection", httpRequestMessage.getHeader("Proxy-Connection"));
        } else {
            httpRequestMessage.addHeader("Connection", "close");
        }
        httpRequestMessage.removeHeader("Proxy-Connection");
        if (!this.enabledAcceptEncoding) {
            httpRequestMessage.removeHeader("Accept-Encoding");
        }
        ProxyLog.D(l, "http代理修改请求:" + httpRequestMessage);
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.ISocketHandle
    public void finish() {
        HttpData httpBodyData = HttpDataFactory.getHttpBodyData(this.f, (byte) 4, HttpDataFactory.HTTP_DATA_EOT);
        ServerTransportSession serverTransportSession = this.g;
        if (serverTransportSession != null) {
            serverTransportSession.addData2SendQue(httpBodyData);
            this.g.removeHandler(this.f);
        } else {
            ProxyLog.E(l, "finish() mServerTransportSession is null");
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
            this.j = null;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.b();
            this.i = null;
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.b();
            this.h = null;
        }
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            try {
                outputStream.close();
                ProxyLog.I(l, "<<<<<< Socket " + this.f + " 关闭ServerSocket OutputStream <<<<<<");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
                ProxyLog.I(l, "<<<<<< Socket " + this.f + " 关闭ServerSocket InputStream<<<<<<");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        Socket socket = this.a;
        if (socket != null) {
            try {
                socket.close();
                ProxyLog.I(l, "<<<<<< Socket " + this.f + " 关闭ServerSocket <<<<<<");
            } catch (IOException e3) {
                ProxyLog.E(l, "close mServerSocket erroe: " + e3.toString());
            }
        }
        this.a = null;
    }

    @Override // com.huami.watch.companion.components.bluetoothproxyserver.session.ISocketHandle
    public void sendData2Client(byte[] bArr) {
    }
}
