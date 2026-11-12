package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.loopj.android.http.AsyncHttpClient;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gb<T, V> extends dq {
    public T e;
    public int f;
    public Context g;
    public String h;
    public boolean i = false;

    public gb(Context context, T t) {
        this.f = 1;
        this.g = context;
        this.e = t;
        this.f = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    private V f() throws ga {
        V vA = null;
        int i = 0;
        while (i < this.f) {
            try {
                setProxy(gs.a(this.g));
                vA = this.i ? a(makeHttpRequestNeedHeader()) : a(makeHttpRequest());
                i = this.f;
            } catch (ga e) {
                i++;
                if (i >= this.f) {
                    throw new ga(e.a());
                }
            } catch (gi e2) {
                i++;
                if (i >= this.f) {
                    if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOWN.equals(e2.a()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new ga("http或socket连接失败 - ConnectionException");
                    }
                    throw new ga(e2.a());
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new ga("http或socket连接失败 - ConnectionException");
                    }
                    throw new ga(e2.a());
                }
            } catch (Throwable unused2) {
                throw new ga("未知错误");
            }
        }
        return vA;
    }

    public V a(is isVar) throws ga {
        return null;
    }

    public abstract V a(String str) throws ga;

    public V a(byte[] bArr) throws ga {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null || "".equals(str)) {
            return null;
        }
        gd.a(str);
        return a(str);
    }

    public abstract String d();

    public final V e() throws ga {
        if (this.e == null) {
            return null;
        }
        try {
            return f();
        } catch (ga e) {
            er.a(e);
            throw e;
        }
    }

    @Override // com.amap.api.mapcore.util.ir
    public Map<String, String> getRequestHead() {
        gt gtVarF = er.f();
        String strB = gtVarF != null ? gtVarF.b() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", l.c);
        hashtable.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strB, "3dmap"));
        hashtable.put("X-INFO", gm.b(this.g));
        hashtable.put("key", gj.f(this.g));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }
}
