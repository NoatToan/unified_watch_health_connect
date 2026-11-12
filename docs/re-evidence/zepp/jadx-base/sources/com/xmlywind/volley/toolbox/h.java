package com.xmlywind.volley.toolbox;

import android.text.TextUtils;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.common.net.HttpHeaders;
import com.loopj.android.http.AsyncHttpClient;
import com.xmlywind.volley.t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.cybergarage.http.HTTP;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class h {
    public static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            t.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static com.xmlywind.volley.b.a a(com.xmlywind.volley.i iVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = iVar.c;
        String str = map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals(HTTP.NO_CACHE) || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Throwable unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j3 = jCurrentTimeMillis + (j * 1000);
            if (i == 0) {
                Long.signum(j2);
                j4 = (j2 * 1000) + j3;
            }
            com.xmlywind.volley.b.a aVar = new com.xmlywind.volley.b.a();
            aVar.a = iVar.b;
            aVar.b = str5;
            aVar.f = j3;
            aVar.e = j4;
            aVar.c = jA;
            aVar.d = jA3;
            aVar.g = map;
            aVar.h = iVar.d;
            return aVar;
        }
        j3 = (jA <= 0 || jA2 < jA) ? 0L : jCurrentTimeMillis + (jA2 - jA);
        j4 = j3;
        com.xmlywind.volley.b.a aVar2 = new com.xmlywind.volley.b.a();
        aVar2.a = iVar.b;
        aVar2.b = str5;
        aVar2.f = j3;
        aVar2.e = j4;
        aVar2.c = jA;
        aVar2.d = jA3;
        aVar2.g = map;
        aVar2.h = iVar.d;
        return aVar2;
    }

    public static String a(long j) {
        return a().format(new Date(j));
    }

    public static String a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 == null) {
            return str;
        }
        String[] strArrSplit = str2.split(";", 0);
        for (int i = 1; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(SearchCriteria.EQ, 0);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                return strArrSplit2[1];
            }
        }
        return str;
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_RFC1123, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static boolean a(Map<String, String> map) {
        String strB;
        return TextUtils.equals(b(map, HttpHeaders.ACCEPT_RANGES), HTTP.CONTENT_RANGE_BYTES) || ((strB = b(map, "Content-Range")) != null && strB.startsWith(HTTP.CONTENT_RANGE_BYTES));
    }

    public static String b(Map<String, String> map, String str) {
        return map.get(str);
    }

    public static boolean b(Map<String, String> map) {
        return TextUtils.equals(b(map, "Content-Encoding"), AsyncHttpClient.ENCODING_GZIP);
    }
}
