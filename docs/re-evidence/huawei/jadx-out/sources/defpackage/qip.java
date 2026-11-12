package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class qip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f46280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f46281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f46282c;

    public qip() {
    }

    public qip(float f) {
        this(f, f, f);
    }

    public qip(float f, float f2, float f3) {
        this.f46280a = f;
        this.f46281b = f2;
        this.f46282c = f3;
    }

    public qip e(qip qipVar) {
        qip qipVar2 = new qip();
        qipVar2.f46280a = this.f46280a + qipVar.f46280a;
        qipVar2.f46281b = this.f46281b + qipVar.f46281b;
        qipVar2.f46282c = this.f46282c + qipVar.f46282c;
        return qipVar2;
    }

    public qip b(float f, float f2, float f3) {
        qip qipVar = new qip();
        qipVar.f46280a += f;
        qipVar.f46281b = qipVar.f46281b + f2 + f2;
        return qipVar;
    }

    public String toString() {
        return "Vec3{x=" + this.f46280a + ", y=" + this.f46281b + ", z=" + this.f46282c + '}';
    }
}
