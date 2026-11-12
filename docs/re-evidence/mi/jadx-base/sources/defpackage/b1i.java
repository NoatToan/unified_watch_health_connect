package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class b1i {
    public static final String e = "b1i";
    public static b1i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3684b;
    public boolean c = false;
    public hdm d = new a();

    public class a extends hdm {
        public a() {
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onPause() {
            super.onPause();
            b1i.this.g();
            String unused = b1i.e;
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onResume() {
            super.onResume();
            b1i.this.h();
            String unused = b1i.e;
        }

        @Override // defpackage.hdm, defpackage.w0i
        public void onStart() {
            super.onStart();
            b1i.this.h();
            String unused = b1i.e;
        }
    }

    public static b1i d() {
        if (f == null) {
            f = new b1i();
        }
        return f;
    }

    public final long e() {
        return System.currentTimeMillis();
    }

    public void f() {
        this.f3683a = e();
        this.f3684b = 0L;
        x0i.g().h(this.d);
    }

    public final void g() {
        this.f3684b += e() - this.f3683a;
        this.f3683a = e();
        this.c = false;
    }

    public final void h() {
        this.f3683a = e();
        this.c = true;
    }
}
