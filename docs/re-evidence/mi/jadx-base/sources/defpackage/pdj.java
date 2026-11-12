package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class pdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f30294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f30295b;
    public String c;
    public String d;
    public ReadableMap e;
    public Boolean f;
    public Boolean g;
    public String h;
    public String i;
    public Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f30296k;
    public long l;
    public Boolean m;
    public Boolean n;
    public ReadableArray o;

    public pdj(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.g = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f30296k = bool2;
        this.l = 60000L;
        this.m = bool;
        this.n = bool2;
        this.o = null;
        if (readableMap == null) {
            return;
        }
        this.f30294a = Boolean.valueOf(readableMap.hasKey("fileCache") && readableMap.getBoolean("fileCache"));
        this.f30295b = Boolean.valueOf(readableMap.hasKey("transformFile") ? readableMap.getBoolean("transformFile") : false);
        this.c = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        this.d = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
        this.f = Boolean.valueOf(readableMap.hasKey("trusty") && readableMap.getBoolean("trusty"));
        this.g = Boolean.valueOf(readableMap.hasKey("wifiOnly") && readableMap.getBoolean("wifiOnly"));
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.e = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.o = readableMap.getArray("binaryContentTypes");
        }
        String str = this.c;
        if (str != null && str.toLowerCase(Locale.ROOT).contains("?append=true")) {
            this.f30296k = bool;
        }
        if (readableMap.hasKey("overwrite")) {
            this.f30296k = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.n = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.h = readableMap.hasKey("key") ? readableMap.getString("key") : null;
        this.i = readableMap.hasKey("contentType") ? readableMap.getString("contentType") : null;
        this.m = Boolean.valueOf(readableMap.hasKey("increment") && readableMap.getBoolean("increment"));
        this.j = Boolean.valueOf(readableMap.hasKey("auto") && readableMap.getBoolean("auto"));
        if (readableMap.hasKey("timeout")) {
            this.l = readableMap.getInt("timeout");
        }
    }
}
