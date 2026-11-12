package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import defpackage.k0t;
import defpackage.l0t;
import defpackage.uxs;
import defpackage.v5t;
import defpackage.xts;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u<T, V> extends l0t {
    public T s;
    public Context v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6269r = true;
    public int t = 1;
    public String u = "";
    public int w = 1;
    public String x = "";

    public u(Context context, T t) {
        g(context, t);
    }

    private void g(Context context, T t) {
        this.v = context;
        this.s = t;
        this.t = 1;
        setSoTimeout(ServiceSettings.getInstance().getSoTimeOut());
        setConnectionTimeout(ServiceSettings.getInstance().getConnectionTimeOut());
    }

    private V i(byte[] bArr) throws AMapException {
        return f(bArr);
    }

    private String o() {
        return this.x;
    }

    public abstract V e(String str) throws AMapException;

    public V f(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            xts.i(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        xts.l(str);
        return e(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getSDKName() {
        return "sea";
    }

    public final byte[] h(int i, f1 f1Var, l0t l0tVar) throws ik {
        setHttpProtocol(i == 1 ? la.c.HTTP : la.c.HTTPS);
        v5t v5tVarD = this.f6269r ? b1.d(l0tVar) : f1.r(l0tVar);
        if (v5tVarD == null) {
            return null;
        }
        byte[] bArr = v5tVarD.f36513a;
        this.x = v5tVarD.d;
        return bArr;
    }

    public final V m() throws AMapException {
        if (this.s == null) {
            return null;
        }
        try {
            return p();
        } catch (AMapException e) {
            uxs.f(g(), o(), e);
            throw e;
        }
    }

    public d0.b n() {
        return null;
    }

    public final V p() throws AMapException {
        Object obj;
        d0 d0VarB;
        d0.c cVarA;
        Object obj2;
        try {
            d0.b bVarN = n();
            boolean zH = d0.b().h(bVarN);
            boolean z = false;
            int i = 0;
            boolean z2 = false;
            V vI = null;
            while (i < this.t) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        try {
                            int protocol = ServiceSettings.getInstance().getProtocol();
                            k0t.a().c(this.v);
                            f1 f1VarP = f1.p();
                            if (zH && (cVarA = d0.b().a(bVarN)) != null && (obj2 = cVarA.f5987a) != null) {
                                try {
                                    uxs.e(this.v, bVarN.f5985a, cVarA.f5988b);
                                    z2 = true;
                                    vI = (V) obj2;
                                } catch (ik e) {
                                    e = e;
                                    z2 = true;
                                    vI = (V) obj2;
                                    uxs.d(this.v, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i++;
                                    if (i >= this.t) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOWN.equals(e.a()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new AMapException(e.a(), 1, e.c());
                                        }
                                        throw new AMapException(AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                    try {
                                        Thread.sleep(this.w * 1000);
                                        if (zH && !z2) {
                                            d0.b().e(bVarN, vI);
                                        }
                                    } catch (InterruptedException unused) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new AMapException(e.a(), 1, e.c());
                                        }
                                        throw new AMapException(AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                } catch (AMapException e2) {
                                    e = e2;
                                    z2 = true;
                                    vI = (V) obj2;
                                    uxs.d(this.v, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i++;
                                    if (i >= this.t) {
                                        throw e;
                                    }
                                    if (zH && !z2) {
                                        d0VarB = d0.b();
                                        d0VarB.e(bVarN, vI);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = true;
                                    obj = obj2;
                                    if (zH) {
                                        d0.b().e(bVarN, obj);
                                    }
                                    throw th;
                                }
                            }
                            if (vI == null) {
                                byte[] bArrH = h(protocol, f1VarP, this);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                vI = i(bArrH);
                                uxs.d(this.v, g(), jCurrentTimeMillis2 - jCurrentTimeMillis, true);
                            }
                            i = this.t;
                            if (!zH || z2) {
                                z = false;
                            } else {
                                d0VarB = d0.b();
                                d0VarB.e(bVarN, vI);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = vI;
                            if (zH && !z2) {
                                d0.b().e(bVarN, obj);
                            }
                            throw th;
                        }
                    } catch (ik e3) {
                        e = e3;
                    } catch (AMapException e4) {
                        e = e4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                }
            }
            return vI;
        } catch (AMapException e5) {
            throw e5;
        } catch (Throwable th4) {
            th4.printStackTrace();
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    private String g() {
        String ipv6url = getIPV6URL();
        if (ipv6url == null) {
            return null;
        }
        try {
            int iIndexOf = ipv6url.indexOf(".com/");
            int iIndexOf2 = ipv6url.indexOf("?");
            if (iIndexOf2 == -1) {
                return ipv6url.substring(iIndexOf + 5);
            }
            return ipv6url.substring(iIndexOf + 5, iIndexOf2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
