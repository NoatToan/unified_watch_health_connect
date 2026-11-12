package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.ic;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.l;
import com.amap.api.maps.AMapException;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class szs<T, V> extends l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f34139r;
    public Context t;
    public String u;
    public int s = 1;
    public boolean v = false;

    public szs(Context context, T t) {
        h(context, t);
    }

    public abstract V e(String str) throws ic;

    public V f(v5t v5tVar) throws ic {
        return null;
    }

    public V g(byte[] bArr) throws ic {
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
        xzs.c(str);
        return e(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        o0t o0tVarT = zns.t();
        String strE = o0tVarT != null ? o0tVarT.e() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", ugt.d);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strE, "3dmap"));
        hashtable.put("X-INFO", g0t.i(this.t));
        hashtable.put("key", e0t.k(this.t));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    public final void h(Context context, T t) {
        this.t = context;
        this.f34139r = t;
        this.s = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    public final V i(v5t v5tVar) throws ic {
        return f(v5tVar);
    }

    public final V j(byte[] bArr) throws ic {
        return g(bArr);
    }

    public final V m() throws ic {
        if (this.f34139r == null) {
            return null;
        }
        try {
            return n();
        } catch (ic e) {
            zns.E(e);
            throw e;
        }
    }

    public final V n() throws ic {
        V vI = null;
        int i = 0;
        while (i < this.s) {
            try {
                setProxy(n0t.a(this.t));
                vI = this.v ? i(makeHttpRequestNeedHeader()) : j(makeHttpRequest());
                i = this.s;
            } catch (ic e) {
                i++;
                if (i >= this.s) {
                    throw new ic(e.a());
                }
            } catch (ik e2) {
                i++;
                if (i >= this.s) {
                    if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOWN.equals(e2.a()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new ic(e2.a());
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new ic(e2.a());
                }
            } catch (Throwable unused2) {
                throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
            }
        }
        return vI;
    }
}
