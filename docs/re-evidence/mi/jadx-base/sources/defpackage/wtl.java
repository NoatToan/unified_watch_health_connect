package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class wtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38347b;
    public float c;
    public float d;

    public wtl(long j, int i, float f, float f2) {
        this.f38346a = j;
        this.f38347b = i;
        this.c = f;
        this.d = f2;
    }

    public int a() {
        return this.f38347b;
    }

    public float b() {
        return this.d;
    }

    public long c() {
        return this.f38346a;
    }

    public String toString() {
        return "{时间：" + dfp.b(this.f38346a) + "--" + this.f38346a + ", 运动类型：" + this.f38347b + ", 置信度：" + this.c + ", 气压：" + this.d + "}";
    }

    public wtl() {
        this.d = 996.0f;
    }
}
