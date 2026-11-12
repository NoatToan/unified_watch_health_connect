package defpackage;

import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class tr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f49559c;
    private String f;
    private String i;
    private Map<String, String> e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f49558b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49557a = "";
    private final int h = 30000;
    private final int d = 30000;

    tr() {
    }

    tr d(String str) {
        this.f = str;
        return this;
    }

    tr a(String str) {
        this.f49557a = str;
        return this;
    }

    tr e(String str) {
        this.f49559c = str.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    tr b(String str) {
        this.i = str;
        return this;
    }

    tr d(String str, String str2) {
        this.f49558b.put(str, str2);
        return this;
    }

    String j() {
        return this.f;
    }

    byte[] e() {
        return this.f49559c;
    }

    void d() {
        byte[] bArr = this.f49559c;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    String c() {
        return this.i;
    }

    Map<String, String> a() {
        if (this.e == null) {
            HashMap map = new HashMap();
            this.e = map;
            map.put(j2.v, Constants.GZIP);
            this.e.put("Accept-Language", Locale.getDefault().getLanguage());
            this.e.putAll(this.f49558b);
        }
        return Collections.unmodifiableMap(this.e);
    }

    int f() {
        return this.h;
    }

    int b() {
        return this.d;
    }

    URL g() throws MalformedURLException, URISyntaxException {
        if (this.f.startsWith("http")) {
            return new URL(this.f);
        }
        URI uri = new URL(this.f49557a).toURI();
        return uri.resolve(a(uri.getPath(), this.f)).normalize().toURL();
    }

    private static String a(String str, String str2) {
        return new File(new File(str), str2).getPath();
    }
}
