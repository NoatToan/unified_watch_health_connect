package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class itk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22079b;
    public int c;

    public itk() {
        a();
    }

    public void a() {
        this.f22078a = false;
        this.f22079b = 4;
        c();
    }

    public void b() {
        this.c++;
    }

    public void c() {
        this.c = 0;
    }

    public void d(boolean z) {
        this.f22078a = z;
    }

    public boolean e() {
        return this.f22078a && this.c < this.f22079b;
    }
}
