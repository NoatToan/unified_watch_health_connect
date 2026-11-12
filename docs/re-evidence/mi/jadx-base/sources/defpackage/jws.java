package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class jws implements Cloneable {
    public static String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23210b;
    public int c;
    public boolean d = gws.s;
    public boolean e = true;
    public String f;

    public jws(Map<String, Integer> map, int i, String str, ows owsVar) {
        d(map, i, str, owsVar);
    }

    public static final String b() {
        String str = g;
        if (str != null) {
            return str;
        }
        if (hht.c()) {
            return "sandbox.xmpush.xiaomi.com";
        }
        return hht.d() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    public static final void c(String str) {
        if (hht.d()) {
            return;
        }
        g = str;
    }

    public int a() {
        return this.c;
    }

    public final void d(Map<String, Integer> map, int i, String str, ows owsVar) {
        this.c = i;
        this.f23209a = str;
    }

    public void e(boolean z) {
        this.d = z;
    }

    public boolean f() {
        return this.d;
    }

    public byte[] g() {
        throw null;
    }

    public String h() {
        return this.f;
    }

    public void i(String str) {
        this.f = str;
    }

    public String j() {
        if (this.f23210b == null) {
            this.f23210b = b();
        }
        return this.f23210b;
    }

    public void k(String str) {
        this.f23210b = str;
    }
}
