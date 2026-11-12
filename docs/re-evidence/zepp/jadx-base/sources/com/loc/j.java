package com.loc;

import com.amap.api.maps.AMapException;
import com.facebook.internal.NativeProtocol;

/* JADX INFO: loaded from: classes18.dex */
public final class j extends Exception {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;

    public j(String str) {
        super(str);
        this.a = AMapException.ERROR_UNKNOWN;
        this.b = "";
        this.c = "";
        this.d = "1900";
        this.e = NativeProtocol.ERROR_UNKNOWN_ERROR;
        this.f = -1;
        this.a = str;
        if (AMapException.ERROR_IO.equals(str)) {
            this.f = 21;
            this.d = "1902";
            this.e = "IOException";
            return;
        }
        if (AMapException.ERROR_SOCKET.equals(str)) {
            this.f = 22;
            return;
        }
        if (AMapException.ERROR_SOCKE_TIME_OUT.equals(str)) {
            this.f = 23;
            this.d = "1802";
            this.e = "SocketTimeoutException";
            return;
        }
        if (AMapException.ERROR_INVALID_PARAMETER.equals(str)) {
            this.f = 24;
            this.d = "1901";
            this.e = "IllegalArgumentException";
            return;
        }
        if (AMapException.ERROR_NULL_PARAMETER.equals(str)) {
            this.f = 25;
            this.d = "1903";
            this.e = "NullPointException";
            return;
        }
        if (AMapException.ERROR_URL.equals(str)) {
            this.f = 26;
            this.d = "1803";
            this.e = "MalformedURLException";
            return;
        }
        if (AMapException.ERROR_UNKNOW_HOST.equals(str)) {
            this.f = 27;
            this.d = "1804";
            this.e = "UnknownHostException";
            return;
        }
        if (AMapException.ERROR_UNKNOW_SERVICE.equals(str)) {
            this.f = 28;
            this.d = "1805";
            this.e = "CannotConnectToHostException";
            return;
        }
        if (AMapException.ERROR_PROTOCOL.equals(str)) {
            this.f = 29;
            this.d = "1801";
            this.e = "ProtocolException";
            return;
        }
        if (AMapException.ERROR_CONNECTION.equals(str)) {
            this.f = 30;
            this.d = "1806";
            this.e = "ConnectionException";
            return;
        }
        if (AMapException.ERROR_UNKNOWN.equals(str)) {
            this.f = 31;
            return;
        }
        if (AMapException.ERROR_FAILURE_AUTH.equals(str)) {
            this.f = 32;
            return;
        }
        if ("requeust is null".equals(str)) {
            this.f = 1;
            return;
        }
        if ("request url is empty".equals(str)) {
            this.f = 2;
            return;
        }
        if ("response is null".equals(str)) {
            this.f = 3;
            return;
        }
        if ("thread pool has exception".equals(str)) {
            this.f = 4;
            return;
        }
        if ("sdk name is invalid".equals(str)) {
            this.f = 5;
            return;
        }
        if ("sdk info is null".equals(str)) {
            this.f = 6;
            return;
        }
        if ("sdk packages is null".equals(str)) {
            this.f = 7;
            return;
        }
        if ("线程池为空".equals(str)) {
            this.f = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f = 101;
        } else {
            this.f = -1;
        }
    }

    public j(String str, String str2, String str3) {
        this(str);
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final int f() {
        return this.f;
    }
}
