package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class foy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34336a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34337c;
    private Map<String, Object> d;
    private String e;

    public foy(String str, String str2) {
        this.f34337c = str;
        this.f34336a = str2;
    }

    public String c() {
        return this.f34337c;
    }

    public String a() {
        return this.f34336a;
    }

    public Map<String, Object> b() {
        return this.d;
    }

    public void a(Map<String, Object> map) {
        this.d = map;
    }

    public String e() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }
}
