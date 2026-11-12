package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class o7i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f28821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28822b;
    public float c;

    public o7i() {
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.f28822b;
    }

    public long c() {
        return this.f28821a;
    }

    public void d(float f) {
        this.c = f;
    }

    public void e(float f) {
        this.f28822b = f;
    }

    public void f(long j) {
        this.f28821a = j;
    }

    public String toString() {
        return "{时间：" + dfp.b(this.f28821a) + "==" + this.f28821a + ", 气压：" + this.f28822b + ", 海拔：" + this.c + "}";
    }

    public o7i(long j, float f, float f2) {
        this.f28821a = j;
        this.f28822b = f;
        this.c = f2;
    }
}
