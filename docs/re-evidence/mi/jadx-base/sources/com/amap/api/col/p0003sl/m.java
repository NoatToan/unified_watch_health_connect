package com.amap.api.col.p0003sl;

import com.tencent.wcdb.database.SQLiteDatabase;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.gv5;
import defpackage.m2t;
import defpackage.n0t;
import defpackage.p4s;
import defpackage.ugt;
import defpackage.zns;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends l {
    public m() {
        setProxy(n0t.a(p4s.f));
        setConnectionTimeout(5000);
        setSoTimeout(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
    }

    private static String a(String str) {
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(b(str2));
            stringBuffer.append(gv5.CONNECT_STR);
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            m2t.r(e, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            m2t.r(e2, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    public String appendTsScode(String str) {
        String strA = a(str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        String strA2 = g0t.a();
        stringBuffer.append("&ts=".concat(String.valueOf(strA2)));
        stringBuffer.append("&scode=" + g0t.c(p4s.f, strA2, strA));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getIPV6URL() {
        String url = getURL();
        return (url == null || !url.contains("http://restsdk.amap.com/v4/gridmap?")) ? url : zns.y(url);
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", ugt.d);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.300", "3dmap"));
        hashtable.put("x-INFO", g0t.b(p4s.f));
        hashtable.put("key", e0t.k(p4s.f));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public boolean isSupportIPV6() {
        String url = getURL();
        return url != null && url.contains("http://restsdk.amap.com/v4/gridmap?");
    }
}
