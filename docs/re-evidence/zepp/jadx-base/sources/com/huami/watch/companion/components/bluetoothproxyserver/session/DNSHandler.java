package com.huami.watch.companion.components.bluetoothproxyserver.session;

import android.content.Context;
import com.huami.watch.companion.components.bluetoothproxyserver.HttpProxyServer;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ApplicationLayerParser;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpData;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.HttpDataFactory;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.ProxyLog;
import com.huami.watch.companion.components.bluetoothproxyserver.utils.Utils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes16.dex */
public class DNSHandler {
    private static final String e = "DNSHandler";
    private DatagramSocket a;
    private BlockingDeque<HttpData> b = new LinkedBlockingDeque();
    private a c;
    private Context d;

    public class a extends Thread {
        private boolean a = false;

        public a() {
        }

        public void a() {
            this.a = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                DNSHandler.this.b.put(HttpDataFactory.getHttpData(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                e.printStackTrace();
                stop();
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ProxyLog.I(DNSHandler.e, ">>>>>> DNS请求发送线程启动 >>>>>>");
            while (!this.a) {
                ProxyLog.D(DNSHandler.e, "等待DNS请求数据...");
                try {
                    HttpData httpData = (HttpData) DNSHandler.this.b.take();
                    if (httpData.getType() == 1536) {
                        ProxyLog.I(DNSHandler.e, "<<<<<< DNS请求发送线程退出 <<<<<< [NO_MORE_DATA]");
                        return;
                    }
                    ProxyLog.D(DNSHandler.e, "收到DNS请求数据..." + new ApplicationLayerParser.DNSPackage(httpData.getData()));
                    DatagramPacket datagramPacket = new DatagramPacket(httpData.getData(), httpData.getLength(), Utils.getDNSServerAddr(DNSHandler.this.d, 0), 53);
                    if (DNSHandler.this.a == null) {
                        return;
                    }
                    DNSHandler.this.a.send(datagramPacket);
                    ProxyLog.D(DNSHandler.e, "DNS请求发送完毕，等待回复...");
                    DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1024], 1024);
                    DNSHandler.this.a.receive(datagramPacket2);
                    ProxyLog.D(DNSHandler.e, "收到DNS回复... 插入发送到手表端队列  数据长度：" + datagramPacket2.getLength() + "收到的DNS 回复的 DatagramPacket 端口号:" + datagramPacket2.getPort() + " 地址:" + datagramPacket2.getAddress());
                    byte[] bArr = new byte[datagramPacket2.getLength()];
                    System.arraycopy(datagramPacket2.getData(), 0, bArr, 0, datagramPacket2.getLength());
                    HttpData httpData2 = HttpDataFactory.getHttpData(HttpDataFactory.DNS_RES, -1L, (byte) 0, (short) datagramPacket2.getLength(), bArr);
                    ServerTransportSession serverTransportSession = ServerTransportSession.getInstance();
                    if (serverTransportSession != null) {
                        serverTransportSession.addData2SendQue(httpData2);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    ProxyLog.I(DNSHandler.e, "<<<<<< DNS请求发送线程退出 <<<<<< " + e2.toString());
                    return;
                }
            }
            ProxyLog.I(DNSHandler.e, "<<<<<< DNS请求发送线程退出 <<<<<<");
        }
    }

    public DNSHandler(Context context) {
        try {
            this.d = context;
            DatagramSocket datagramSocket = new DatagramSocket();
            this.a = datagramSocket;
            datagramSocket.setSoTimeout(10000);
        } catch (SocketException e2) {
            ProxyLog.D(e, " 错误 ：" + e2.toString());
            e2.printStackTrace();
        }
        this.c = new a();
        HttpProxyServer.getThreadPool().execute(this.c);
    }

    public void addDnsRquest(HttpData httpData) {
        try {
            this.b.put(httpData);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public void finish() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public HttpData takeData() {
        try {
            return this.b.take();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
