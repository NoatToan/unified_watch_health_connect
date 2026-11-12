package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23296b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23297k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23298a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23299b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public k0i i = new k0i();

        public k0i a(JSONObject jSONObject) {
            k0i k0iVar = new k0i();
            k0iVar.e(jSONObject);
            return k0iVar;
        }
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.f;
    }

    public boolean d(int i, int i2) {
        return ((i & (1 << i2)) >> i2) == 1;
    }

    public void e(JSONObject jSONObject) {
        try {
            this.f = jSONObject.getInt(this.c);
            this.g = jSONObject.getInt(this.d);
            this.h = jSONObject.getInt(this.e);
            this.i = d(this.f, 0);
            this.j = d(this.f, 1);
            this.f23297k = d(this.f, 2);
            this.l = d(this.f, 3);
            this.m = d(this.g, 0);
            this.n = d(this.h, 0);
            this.o = d(this.h, 1);
            this.p = d(this.h, 2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("initFromJson error:");
            sb.append(e.getMessage());
        }
    }

    public boolean f() {
        return this.m;
    }

    public boolean g() {
        return this.f23297k;
    }

    public boolean h() {
        return this.n;
    }

    public boolean i() {
        return this.l;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.o;
    }

    public boolean m() {
        return this.p;
    }

    public k0i() {
        this.f23295a = "playCapacity";
        this.f23296b = "PlayCapacity";
        this.c = "canPlay";
        this.d = "canList";
        this.e = "canLoop";
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.f23297k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
    }
}
