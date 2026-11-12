package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.net.Proxy;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ir {
    public static final int DEFAULT_RETRY_TIMEOUT = 5000;
    public ik.a d;
    private String h;
    private boolean i;
    private boolean j;
    public int a = 20000;
    public int b = 20000;
    public Proxy c = null;
    private boolean e = false;
    private int f = 20000;
    private boolean g = true;
    private a k = a.NORMAL;
    private b l = b.FIRST_NONDEGRADE;

    public enum a {
        NORMAL(0),
        INTERRUPT_IO(1),
        NEVER(2),
        FIX(3),
        SINGLE(4);

        private int f;

        a(int i) {
            this.f = i;
        }
    }

    public enum b {
        FIRST_NONDEGRADE(0),
        NEVER_GRADE(1),
        DEGRADE_BYERROR(2),
        DEGRADE_ONLY(3),
        FIX_NONDEGRADE(4),
        FIX_DEGRADE_BYERROR(5),
        FIX_DEGRADE_ONLY(6);

        private int h;

        b(int i2) {
            this.h = i2;
        }

        public final int a() {
            return this.h;
        }

        public final boolean b() {
            int i2 = this.h;
            return i2 == FIRST_NONDEGRADE.h || i2 == NEVER_GRADE.h || i2 == FIX_NONDEGRADE.h;
        }

        public final boolean c() {
            int i2 = this.h;
            return i2 == DEGRADE_BYERROR.h || i2 == DEGRADE_ONLY.h || i2 == FIX_DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_ONLY.h;
        }

        public final boolean d() {
            int i2 = this.h;
            return i2 == DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_BYERROR.h;
        }

        public final boolean e() {
            return this.h == NEVER_GRADE.h;
        }
    }

    public enum c {
        HTTP(0),
        HTTPS(1);

        private int c;

        c(int i) {
            this.c = i;
        }
    }

    String a() {
        return a(getURL());
    }

    String b() {
        return a(getIPV6URL());
    }

    public byte[] c() {
        byte[] entityBytes = getEntityBytes();
        if (entityBytes != null && entityBytes.length != 0) {
            return entityBytes;
        }
        String strA = io.a(getParams());
        return !TextUtils.isEmpty(strA) ? gu.a(strA) : entityBytes;
    }

    public int getConntectionTimeout() {
        return this.a;
    }

    public a getDegradeAbility() {
        return this.k;
    }

    public b getDegradeType() {
        return this.l;
    }

    public byte[] getEntityBytes() {
        return null;
    }

    public String getIPDNSName() {
        return "";
    }

    public String getIPV6URL() {
        return getURL();
    }

    public String getNon_degrade_final_Host() {
        return this.h;
    }

    public abstract Map<String, String> getParams();

    public Proxy getProxy() {
        return this.c;
    }

    public int getReal_max_timeout() {
        return this.f;
    }

    public abstract Map<String, String> getRequestHead();

    public String getSDKName() {
        return "";
    }

    public int getSoTimeout() {
        return this.b;
    }

    public abstract String getURL();

    public ik.a getUrlConnectionImpl() {
        return this.d;
    }

    public boolean isBinary() {
        return this.e;
    }

    public boolean isHostToIP() {
        return this.g;
    }

    public boolean isHttps() {
        return this.j;
    }

    public boolean isIPRequest() {
        return !TextUtils.isEmpty(getIPDNSName());
    }

    public boolean isIPV6Request() {
        return this.i;
    }

    public boolean isIgnoreGZip() {
        return false;
    }

    public boolean isSupportIPV6() {
        return false;
    }

    public String parseSDKNameFromPlatInfo(String str) {
        String str2;
        String strTrim = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(com.alipay.sdk.m.s.a.l);
                if (strArrSplit.length > 1) {
                    int length = strArrSplit.length;
                    int i = 0;
                    String str3 = "";
                    while (true) {
                        if (i >= length) {
                            str2 = "";
                            break;
                        }
                        str2 = strArrSplit[i];
                        if (str2.contains("sdkversion")) {
                            str3 = str2;
                        }
                        if (str2.contains("product")) {
                            break;
                        }
                        i++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit2 = str2.split(SearchCriteria.EQ);
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(hj.a(strTrim))) {
                                String[] strArrSplit3 = str3.split(SearchCriteria.EQ);
                                if (strArrSplit3.length > 1) {
                                    hj.a(strTrim, strArrSplit3[1].trim());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            hk.a(th, "ht", "pnfp");
        }
        return strTrim;
    }

    public String parseSdkNameFromHeader(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            if (map.containsKey("platinfo")) {
                return parseSDKNameFromPlatInfo(map.get("platinfo"));
            }
            return null;
        } catch (Throwable th) {
            hk.a(th, "ht", "pnfh");
            return null;
        }
    }

    public String parseSdkNameFromRequest() {
        String sDKName;
        try {
            sDKName = getSDKName();
            try {
                if (TextUtils.isEmpty(sDKName)) {
                    sDKName = this.e ? parseSDKNameFromPlatInfo(((il) this).h()) : parseSdkNameFromHeader(getRequestHead());
                }
            } catch (Throwable th) {
                th = th;
                hk.a(th, "ht", "pnfr");
            }
        } catch (Throwable th2) {
            th = th2;
            sDKName = "";
        }
        return sDKName;
    }

    public void setBinary(boolean z) {
        this.e = z;
    }

    public final void setConnectionTimeout(int i) {
        this.a = i;
    }

    public void setDegradeAbility(a aVar) {
        this.k = aVar;
    }

    public void setDegradeType(b bVar) {
        this.l = bVar;
    }

    public void setHostToIP(boolean z) {
        this.g = z;
    }

    public void setHttpProtocol(c cVar) {
        this.j = cVar == c.HTTPS;
    }

    public void setIPV6Request(boolean z) {
        this.i = z;
    }

    public void setNon_degrade_final_Host(String str) {
        this.h = str;
    }

    public final void setProxy(Proxy proxy) {
        this.c = proxy;
    }

    public void setReal_max_timeout(int i) {
        this.f = i;
    }

    public final void setSoTimeout(int i) {
        this.b = i;
    }

    public void setUrlConnectionImpl(ik.a aVar) {
        this.d = aVar;
    }

    private String a(String str) {
        Map<String, String> params;
        byte[] entityBytes = getEntityBytes();
        if (entityBytes == null || entityBytes.length == 0 || (params = getParams()) == null) {
            return str;
        }
        String strA = io.a(params);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("?");
        stringBuffer.append(strA);
        return stringBuffer.toString();
    }
}
