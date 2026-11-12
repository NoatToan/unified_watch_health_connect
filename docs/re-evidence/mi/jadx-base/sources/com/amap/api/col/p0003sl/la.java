package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import defpackage.gv5;
import defpackage.j2t;
import defpackage.t1t;
import defpackage.t4t;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class la {
    public static final int DEFAULT_RETRY_TIMEOUT = 5000;
    b1.a f;
    private String h;
    private boolean i;
    private boolean j;
    int c = ErrorCode.ERROR_CODE_INVALID_PARAM;
    int d = ErrorCode.ERROR_CODE_INVALID_PARAM;
    Proxy e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6197a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6198b = ErrorCode.ERROR_CODE_INVALID_PARAM;
    private boolean g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f6199k = a.NORMAL;
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

    public final String a() {
        return a(getURL());
    }

    public final String b() {
        return a(getIPV6URL());
    }

    public int getConntectionTimeout() {
        return this.c;
    }

    public a getDegradeAbility() {
        return this.f6199k;
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
        return this.e;
    }

    public int getReal_max_timeout() {
        return this.f6198b;
    }

    public abstract Map<String, String> getRequestHead();

    public String getSDKName() {
        return "";
    }

    public int getSoTimeout() {
        return this.d;
    }

    public abstract String getURL();

    public b1.a getUrlConnectionImpl() {
        return null;
    }

    public boolean isBinary() {
        return this.f6197a;
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
                String[] strArrSplit = str.split(gv5.CONNECT_STR);
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
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(t1t.a(strTrim))) {
                                String[] strArrSplit3 = str3.split("=");
                                if (strArrSplit3.length > 1) {
                                    t1t.b(strTrim, strArrSplit3[1].trim());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            j2t.e(th, "ht", "pnfp");
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
            j2t.e(th, "ht", "pnfh");
            return null;
        }
    }

    public String parseSdkNameFromRequest() {
        String sDKName;
        try {
            sDKName = getSDKName();
            try {
                if (TextUtils.isEmpty(sDKName)) {
                    sDKName = this.f6197a ? parseSDKNameFromPlatInfo(((t4t) this).g()) : parseSdkNameFromHeader(getRequestHead());
                }
            } catch (Throwable th) {
                th = th;
                j2t.e(th, "ht", "pnfr");
            }
        } catch (Throwable th2) {
            th = th2;
            sDKName = "";
        }
        return sDKName;
    }

    public void setBinary(boolean z) {
        this.f6197a = z;
    }

    public final void setConnectionTimeout(int i) {
        this.c = i;
    }

    public void setDegradeAbility(a aVar) {
        this.f6199k = aVar;
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
        this.e = proxy;
    }

    public void setReal_max_timeout(int i) {
        this.f6198b = i;
    }

    public final void setSoTimeout(int i) {
        this.d = i;
    }

    public void setUrlConnectionImpl(b1.a aVar) {
    }

    private String a(String str) {
        byte[] entityBytes = getEntityBytes();
        if (entityBytes == null || entityBytes.length == 0) {
            return str;
        }
        Map<String, String> params = getParams();
        HashMap<String, String> map = b1.e;
        if (map != null) {
            if (params != null) {
                params.putAll(map);
            } else {
                params = map;
            }
        }
        if (params == null) {
            return str;
        }
        String strH = d1.h(params);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("?");
        stringBuffer.append(strH);
        return stringBuffer.toString();
    }
}
