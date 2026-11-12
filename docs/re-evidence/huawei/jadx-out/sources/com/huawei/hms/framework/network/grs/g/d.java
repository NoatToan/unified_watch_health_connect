package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.embedded.k;
import com.huawei.hms.network.embedded.q0;
import com.huawei.hms.network.embedded.r3;
import com.huawei.up.request.HttpRequestBase;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static final String o = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f13309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f13310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13311c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    private void d(String str) {
    }

    private void e(String str) {
    }

    public void a(int i) {
    }

    public boolean o() {
        return this.f13311c == 200;
    }

    public boolean n() {
        return this.f13311c == 503;
    }

    public boolean m() {
        return this.f13311c == 304;
    }

    public String l() {
        return this.n;
    }

    public long k() {
        return this.k;
    }

    public String j() {
        return this.g;
    }

    public long i() {
        return this.d;
    }

    public long h() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public int f() {
        return this.h;
    }

    public String e() {
        return this.l;
    }

    public Exception d() {
        return this.m;
    }

    public int c() {
        return this.i;
    }

    public void b(String str) {
        this.n = str;
    }

    public void b(long j) {
        this.e = j;
    }

    public int b() {
        return this.f13311c;
    }

    public void a(String str) {
        this.l = str;
    }

    public void a(long j) {
        this.f = j;
    }

    public String a() {
        return this.j;
    }

    private void s() {
        q();
        p();
    }

    private Map<String, String> r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.f13309a;
        if (map2 == null || map2.size() <= 0) {
            Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry<String, List<String>> entry : this.f13309a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map.put(key, it.next());
            }
        }
        return map;
    }

    private void q() {
        if (o() || n() || m()) {
            Map<String, String> mapR = r();
            if (mapR.size() <= 0) {
                Logger.w(o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (o() || m()) {
                    b(mapR);
                    a(mapR);
                }
                if (n()) {
                    c(mapR);
                }
            } catch (JSONException e) {
                Logger.w(o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    private void p() {
        int i;
        if (m()) {
            Logger.i(o, "GRSSDK get httpcode{304} not any changed.");
            c(1);
            return;
        }
        if (!o()) {
            Logger.i(o, "GRSSDK parse server body all failed.");
            c(2);
            return;
        }
        try {
            String strByte2Str = StringUtils.byte2Str(this.f13310b);
            JSONObject jSONObject = new JSONObject(strByte2Str);
            if (jSONObject.has(r3.A)) {
                if (jSONObject.getInt(r3.A) == 1) {
                    i = 1;
                } else {
                    i = 2;
                }
            } else if (!jSONObject.has("resultCode")) {
                Logger.e(o, "sth. wrong because server errorcode's key.");
                i = -1;
            } else if (jSONObject.getInt("resultCode") == 0) {
                i = 1;
            } else {
                i = 2;
            }
            if (i == 2) {
                Logger.i(o, "server responseBody:" + StringUtils.anonymizeMessage(strByte2Str));
            }
            if (i != 1 && jSONObject.has("services")) {
                i = 0;
            }
            c(i);
            if (i == 1 || i == 0) {
                f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                b(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : 9001);
                d(jSONObject.has(HttpRequestBase.TAG_ERROR_DESC) ? jSONObject.getString(HttpRequestBase.TAG_ERROR_DESC) : "");
            }
        } catch (JSONException e) {
            Logger.w(o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            c(2);
        }
    }

    private void f(String str) {
        this.g = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    private void c(Map<String, String> map) {
        long j;
        if (map.containsKey(q0.f)) {
            String str = map.get(q0.f);
            if (TextUtils.isEmpty(str)) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                    j = 0;
                }
            }
        } else {
            j = 0;
        }
        long j2 = j * 1000;
        Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j2));
        c(j2);
    }

    private void c(String str) {
        this.j = str;
    }

    private void c(long j) {
        this.k = j;
    }

    private void c(int i) {
        this.h = i;
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (TextUtils.isEmpty(str) || !str.contains("max-age=")) {
                time = 0;
            } else {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e) {
                        e = e;
                        Logger.w(o, "getExpireTime addHeadersToResult NumberFormatException", e);
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    time = 0;
                }
            }
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.w(o, "getExpireTime ParseException.", e3);
                    time = 0;
                }
            } else {
                Logger.i(o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time <= 0 || time > 2592000) {
            time = k.b.m;
        }
        long j = time * 1000;
        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j));
        c(String.valueOf(j + System.currentTimeMillis()));
    }

    private void b(int i) {
        this.i = i;
    }

    private void a(Map<String, String> map) {
        if (!map.containsKey("ETag")) {
            Logger.i(o, "Response Heads has not Etag");
            return;
        }
        String str = map.get("ETag");
        if (TextUtils.isEmpty(str)) {
            Logger.i(o, "The Response Heads Etag is Empty");
        } else {
            Logger.i(o, "success get Etag from server");
            a(str);
        }
    }

    public d(Exception exc, long j) {
        this.f13311c = 0;
        this.h = 2;
        this.i = 9001;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.h = 2;
        this.i = 9001;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.f13311c = i;
        this.f13309a = map;
        this.f13310b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }
}
