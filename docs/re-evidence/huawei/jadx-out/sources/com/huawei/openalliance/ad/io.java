package com.huawei.openalliance.ad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19243a = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19244b = Pattern.compile("Range: (.*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19245c = Pattern.compile("bytes=(\\d+)");
    private String d;
    private String e;
    private String f;
    private String g;
    private int h = 0;

    public int f() {
        return this.h;
    }

    public String e() {
        return this.g;
    }

    public Long d() {
        Matcher matcher = f19245c.matcher(a());
        if (!matcher.find()) {
            return 0L;
        }
        hw.b("HttpGetRequest", "request Range bytes:" + matcher.group(1));
        return Long.valueOf(matcher.group(1));
    }

    public String c() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public String a() {
        return this.e;
    }

    private String c(String str) {
        Matcher matcher = f19244b.matcher(str);
        if (!matcher.find()) {
            hw.b("HttpGetRequest", "request header not have range");
            return "";
        }
        hw.b("HttpGetRequest", "request Range:" + matcher.group(1));
        return matcher.group(1);
    }

    private String b(String str) {
        Matcher matcher = f19243a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request, url not found");
    }

    private void a(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length >= 2) {
                String str3 = strArrSplit[0];
                String str4 = strArrSplit[1];
                try {
                    map.put(str3, URLDecoder.decode(str4, "UTF-8"));
                } catch (Throwable th) {
                    hw.d("HttpGetRequest", "decode failed error: %s for key = %s ,rawValue = %s", th.getClass().getSimpleName(), str3, str4);
                }
            }
        }
        this.f = (String) map.get("nonsense");
        this.g = (String) map.get("sha256");
        this.h = com.huawei.openalliance.ad.utils.dg.a((String) map.get("checkFlag"), 0);
    }

    public static io a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (com.huawei.openalliance.ad.utils.dg.b(line)) {
                return new io(sb.toString());
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    private io(String str) {
        hw.a("HttpGetRequest", "Media Player request header: %s", str);
        this.e = c(str);
        String strB = b(str);
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            hw.d("HttpGetRequest", "parse uri failed, source is empty");
            return;
        }
        int iIndexOf = strB.indexOf("?");
        try {
            this.d = URLDecoder.decode(strB.substring(0, iIndexOf == -1 ? strB.length() : iIndexOf), "UTF-8");
        } catch (Throwable th) {
            hw.d("HttpGetRequest", "decode failed error: %s", th.getClass().getSimpleName());
        }
        if (iIndexOf != -1) {
            a(strB.substring(iIndexOf + 1));
            hw.a("HttpGetRequest", "url: %s, nonsense: %s", this.d, this.f);
        }
    }
}
