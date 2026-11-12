package com.huawei.agconnect.apms;

import android.text.TextUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes22.dex */
public final class ihg extends EventListener {
    public EventListener abc;
    public b bcd;

    public ihg(EventListener eventListener, b bVar) {
        if (eventListener == null) {
            throw new NullPointerException("eventListener is null.");
        }
        this.abc = eventListener;
        this.bcd = bVar;
    }

    public final void abc(Throwable th) {
        b bVar = this.bcd;
        if (bVar != null) {
            bVar.def(th.getMessage());
            this.bcd.qpo = v0.abc();
        }
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        this.bcd.abc(abc());
        this.abc.callEnd(call);
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        this.bcd.abc(abc());
        this.abc.callFailed(call, iOException);
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        String strHost;
        try {
            b bVar = this.bcd;
            try {
                strHost = call.request().url().host();
                if (strHost == null || Pattern.matches("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)", strHost)) {
                    strHost = "";
                }
            } catch (Throwable unused) {
            }
            bVar.cde(strHost);
            this.bcd.cde(System.currentTimeMillis());
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.callStart(call);
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        try {
            if (TextUtils.isEmpty(this.bcd.xwv())) {
                this.bcd.fgh(inetSocketAddress.getAddress().getHostAddress());
            }
            n0 n0VarStu = this.bcd.stu();
            if (n0VarStu != null) {
                n0VarStu.abc(abc());
                n0VarStu.lmn();
                n0VarStu.cde(protocol.getProtocol());
                n0VarStu.abc(true);
            }
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.connectEnd(call, inetSocketAddress, proxy, protocol);
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        try {
            n0 n0VarStu = this.bcd.stu();
            if (n0VarStu != null) {
                n0VarStu.abc(abc());
                n0VarStu.bcd(iOException.getMessage());
                n0VarStu.lmn();
                n0VarStu.abc(false);
            }
            this.bcd.edc();
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        try {
            this.bcd.abc(new n0(inetSocketAddress.toString(), abc()));
            this.bcd.h();
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.connectStart(call, inetSocketAddress, proxy);
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(Call call, Connection connection) {
        try {
            String strAbc = abc(connection);
            if (!TextUtils.isEmpty(strAbc)) {
                this.bcd.fgh(strAbc);
                c.abc(call.request().url().host(), strAbc);
            }
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.connectionAcquired(call, connection);
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        this.abc.connectionReleased(call, connection);
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        try {
            jih jihVarRst = this.bcd.rst();
            if (jihVarRst != null) {
                jihVarRst.abc(abc());
                jihVarRst.abc(list.toString());
                jihVarRst.abc(true);
            }
            this.bcd.i();
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.dnsEnd(call, str, list);
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        try {
            this.bcd.abc(new jih(str, abc()));
            this.bcd.j();
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.dnsStart(call, str);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(Call call, long j) {
        this.bcd.efg(abc());
        this.abc.requestBodyEnd(call, j);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(Call call) {
        this.bcd.fgh(abc());
        this.abc.requestBodyStart(call);
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(Call call, Request request) {
        this.bcd.ghi(abc());
        this.abc.requestHeadersEnd(call, request);
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(Call call) {
        this.bcd.hij(abc());
        this.abc.requestHeadersStart(call);
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j) {
        this.abc.responseBodyEnd(call, j);
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        this.abc.responseBodyStart(call);
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        this.bcd.klm(abc());
        if (response.isRedirect()) {
            this.bcd.a();
        }
        this.abc.responseHeadersEnd(call, response);
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        this.bcd.lmn(abc());
        this.abc.responseHeadersStart(call);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        try {
            n0 n0VarStu = this.bcd.stu();
            if (n0VarStu != null) {
                n0VarStu.bcd(abc());
                n0VarStu.def(handshake.tlsVersion().javaName());
                n0VarStu.abc(handshake.cipherSuite().javaName());
            }
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.secureConnectEnd(call, handshake);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        try {
            n0 n0VarStu = this.bcd.stu();
            if (n0VarStu != null) {
                n0VarStu.cde(abc());
            }
        } catch (Throwable th) {
            abc(th);
        }
        this.abc.secureConnectStart(call);
    }

    public static String abc(Connection connection) {
        if (connection == null) {
            return "";
        }
        if (connection.socket() != null) {
            Socket socket = connection.socket();
            return socket.getInetAddress() == null ? "" : socket.getInetAddress().getHostAddress();
        }
        if (connection.getRoute() != null) {
            Route route = connection.getRoute();
            if (route.socketAddress() != null && route.socketAddress().getAddress() != null) {
                return route.socketAddress().getAddress().getHostAddress();
            }
        }
        return "";
    }

    public final int abc() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.bcd.xyz;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis >= 2147483647L) {
            return -1;
        }
        return (int) jCurrentTimeMillis;
    }
}
