package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fl<T, V> extends is {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected T f2534b;
    protected Context i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f2533a = true;
    protected int g = 1;
    protected String h = "";
    private int k = 1;
    protected String j = "";

    protected abstract V a(String str) throws AMapException;

    protected abstract String c();

    protected gt.b e() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        return null;
    }

    public fl(Context context, T t) {
        a(context, t);
    }

    private void a(Context context, T t) {
        this.i = context;
        this.f2534b = t;
        this.g = 1;
        setSoTimeout(ServiceSettings.getInstance().getSoTimeOut());
        setConnectionTimeout(ServiceSettings.getInstance().getConnectionTimeOut());
    }

    private String f() {
        return this.j;
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

    protected V a(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            fu.a(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        fu.b(str);
        return a(str);
    }

    public final V d() throws AMapException {
        if (this.f2534b == null) {
            return null;
        }
        try {
            return h();
        } catch (AMapException e) {
            hd.a(g(), f(), e);
            throw e;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getSDKName() {
        return "sea";
    }

    private V h() throws AMapException {
        V v;
        gt gtVarA;
        int i;
        gt.c cVarA;
        try {
            gt.b bVarE = e();
            boolean zB = gt.a().b(bVarE);
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            V vB = null;
            while (i2 < this.g) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z3 = true;
                try {
                    try {
                        try {
                            int protocol = ServiceSettings.getInstance().getProtocol();
                            ir.a().a(this.i);
                            kz kzVarC = kz.c();
                            if (zB && (cVarA = gt.a().a(bVarE)) != null && cVarA.f2598a != null) {
                                vB = (V) cVarA.f2598a;
                                try {
                                    hd.a(this.i, bVarE.f2596a, cVarA.f2599b);
                                    z2 = true;
                                } catch (ik e) {
                                    e = e;
                                    z2 = true;
                                    hd.a(this.i, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i2++;
                                    if (i2 >= this.g) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOWN.equals(e.a()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new AMapException(e.a(), 1, e.c());
                                        }
                                        throw new AMapException(AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                    try {
                                        Thread.sleep(this.k * 1000);
                                        if (zB && !z2) {
                                            gt.a().a(bVarE, vB);
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
                                    hd.a(this.i, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i2++;
                                    if (i2 >= this.g) {
                                        throw e;
                                    }
                                    if (zB && !z2) {
                                        gtVarA = gt.a();
                                        i = i2;
                                        gtVarA.a(bVarE, vB);
                                        i2 = i;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    v = vB;
                                    if (zB) {
                                        gt.a().a(bVarE, v);
                                    }
                                    throw th;
                                }
                            }
                            if (vB == null) {
                                byte[] bArrA = a(protocol, kzVarC, this);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                vB = b(bArrA);
                                hd.a(this.i, g(), jCurrentTimeMillis2 - jCurrentTimeMillis, true);
                            }
                            i = this.g;
                            if (!zB || z2) {
                                i2 = i;
                                z = false;
                            } else {
                                gtVarA = gt.a();
                                gtVarA.a(bVarE, vB);
                                i2 = i;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z3 = z2;
                            v = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        v = vB;
                        z3 = z2;
                        if (zB && !z3) {
                            gt.a().a(bVarE, v);
                        }
                        throw th;
                    }
                } catch (ik e3) {
                    e = e3;
                } catch (AMapException e4) {
                    e = e4;
                }
            }
            return vB;
        } catch (AMapException e5) {
            throw e5;
        } catch (Throwable th4) {
            th4.printStackTrace();
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    private byte[] a(int i, kz kzVar, is isVar) throws ik {
        lb lbVarE;
        setHttpProtocol(i == 1 ? la.c.HTTP : la.c.HTTPS);
        if (this.f2533a) {
            lbVarE = kz.a(isVar);
        } else {
            lbVarE = kz.e(isVar);
        }
        if (lbVarE == null) {
            return null;
        }
        byte[] bArr = lbVarE.f3037a;
        this.j = lbVarE.d;
        return bArr;
    }

    private V b(byte[] bArr) throws AMapException {
        return a(bArr);
    }
}
