package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class id<T, V> extends df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected T f2740a;
    protected Context g;
    protected String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f2741b = 1;
    protected boolean i = false;

    protected V a(lb lbVar) throws ic {
        return null;
    }

    protected abstract V a(String str) throws ic;

    protected abstract String c();

    public id(Context context, T t) {
        a(context, t);
    }

    private void a(Context context, T t) {
        this.g = context;
        this.f2740a = t;
        this.f2741b = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    protected V a(byte[] bArr) throws ic {
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
        Cif.a(str);
        return a(str);
    }

    public final V d() throws ic {
        if (this.f2740a == null) {
            return null;
        }
        try {
            return e();
        } catch (ic e) {
            eb.a(e);
            throw e;
        }
    }

    private V e() throws ic {
        V vB = null;
        int i = 0;
        while (i < this.f2741b) {
            try {
                setProxy(iw.a(this.g));
                if (this.i) {
                    vB = b(makeHttpRequestNeedHeader());
                } else {
                    vB = b(makeHttpRequest());
                }
                i = this.f2741b;
            } catch (ic e) {
                i++;
                if (i >= this.f2741b) {
                    throw new ic(e.a());
                }
            } catch (ik e2) {
                i++;
                if (i < this.f2741b) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                        if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                            throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                        }
                        throw new ic(e2.a());
                    }
                } else {
                    if (AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || AMapException.ERROR_SOCKET.equals(e2.getMessage()) || AMapException.ERROR_UNKNOWN.equals(e2.a()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new ic(e2.a());
                }
            } catch (Throwable unused2) {
                throw new ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
            }
        }
        return vB;
    }

    private V b(byte[] bArr) throws ic {
        return a(bArr);
    }

    private V b(lb lbVar) throws ic {
        return a(lbVar);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        ix ixVarA = eb.a();
        String strB = ixVarA != null ? ixVarA.b() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", y.d);
        hashtable.put(j2.v, Constants.GZIP);
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strB, "3dmap"));
        hashtable.put("X-INFO", io.b(this.g));
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.g));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }
}
