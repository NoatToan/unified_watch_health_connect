package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class q69 implements Comparable {
    public static Gson h = new Gson();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31164b;
    public int c;
    public int d;
    public Map<String, String> e;
    public Map<String, JsonObject> f;
    public Map<String, mq5> g;

    public q69(int i, int i2, String str, Map<String, String> map, Map<String, mq5> map2) {
        this(i, i2, str, str, map, map2);
    }

    public void a(String str, String str2) {
        this.e.put(str, str2);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        q69 q69Var = (q69) obj;
        return c() == q69Var.c() ? q69Var.b() - b() : c() - q69Var.c();
    }

    public String d() {
        return this.f31164b;
    }

    public Map<String, mq5> e() {
        return new HashMap(this.g);
    }

    public Map<String, String> h() {
        return new HashMap(this.e);
    }

    public String i() {
        return this.f31163a;
    }

    public void k(Map<String, mq5> map) {
        if (map == null) {
            this.g = new HashMap();
        } else {
            this.g = new HashMap(map);
        }
    }

    public void l(Map<String, JsonObject> map) {
        if (map == null) {
            this.f = new HashMap();
        } else {
            this.f = new HashMap(map);
        }
    }

    public void m(Map<String, String> map) {
        if (map == null) {
            this.e = new HashMap();
        } else {
            this.e = new HashMap(map);
        }
    }

    public String toString() {
        return h.toJson(this);
    }

    public q69(int i, int i2, String str, String str2, Map<String, String> map, Map<String, mq5> map2) {
        this.f31164b = "";
        this.e = new HashMap();
        this.c = i;
        this.d = i2;
        this.f31163a = str;
        this.f31164b = str2;
        if (map == null) {
            this.e = new HashMap();
        } else {
            this.e = new HashMap(map);
        }
        if (map2 == null) {
            this.g = new HashMap();
        } else {
            this.g = new HashMap(map2);
        }
        this.f = new HashMap();
    }
}
