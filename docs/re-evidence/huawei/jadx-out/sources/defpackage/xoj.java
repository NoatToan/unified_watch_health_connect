package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xoj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53240b;
    private boolean d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f53241c = new HashMap();

    public String a() {
        return this.f53240b;
    }

    public void e(String str) {
        this.f53240b = str;
    }

    public String e() {
        return this.f53239a;
    }

    public void a(String str) {
        this.f53239a = str;
    }

    public boolean b() {
        return this.d;
    }

    public Map<String, Object> d() {
        return this.f53241c;
    }
}
