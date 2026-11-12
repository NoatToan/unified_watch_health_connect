package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class gze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Double> f36265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36266c;
    private float d;
    private float e;
    private int f;
    private String g;
    private int h;
    private int i;
    private float j;
    private float m;

    public gze(String str, int i, float f) {
        this(str, i, f, 1, 1);
    }

    public gze(String str, int i, float f, int i2, int i3) {
        this.f = -1;
        this.m = -1.0f;
        this.f36264a = 0.0f;
        this.j = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f36265b = new HashMap();
        this.h = i2;
        this.g = str;
        this.f = i;
        this.m = f;
        this.i = i3;
    }

    public void c(float f) {
        this.j = f;
    }

    public void d(float f) {
        this.d = f;
        if (k()) {
            this.f36264a = (this.d - this.j) / this.m;
        } else {
            this.f36264a = 0.0f;
        }
    }

    public void a(float f) {
        this.d = f;
        if (k()) {
            this.f36264a = Math.round((this.d - this.j) / 1000.0f) / (TimeUnit.MILLISECONDS.toSeconds((long) this.m) * 1.0f);
        } else {
            this.f36264a = 0.0f;
        }
    }

    public void b(float f, int i) {
        this.d = f;
        if (i == 4) {
            if (f >= this.m) {
                this.f36264a = 1.0f;
                return;
            } else {
                this.f36264a = 0.0f;
                return;
            }
        }
        if (f <= this.m && f > 0.0f) {
            this.f36264a = 1.0f;
        } else {
            this.f36264a = 0.0f;
        }
    }

    public void e(float f) {
        if (k()) {
            this.e = this.m - f;
        }
    }

    private boolean k() {
        float f = this.j;
        return f >= 0.0f && this.d >= f && this.m > 0.0f;
    }

    public float a() {
        return this.e;
    }

    public float b() {
        return this.f36264a;
    }

    public int i() {
        return this.f;
    }

    public float h() {
        return this.m;
    }

    public float d() {
        return this.j;
    }

    public String f() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public float g() {
        return this.d;
    }

    public int j() {
        return this.i;
    }

    public void d(String str) {
        this.f36266c = str;
    }

    public String e() {
        return this.f36266c;
    }

    public Map<String, Double> m() {
        return this.f36265b;
    }

    public void d(Map<String, Double> map) {
        this.f36265b.putAll(map);
    }
}
