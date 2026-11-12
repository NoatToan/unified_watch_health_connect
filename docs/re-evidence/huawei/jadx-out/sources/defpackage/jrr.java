package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class jrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38943a = 0.0f;
    private jpg e = new jpg(0.0d, 0.0d);
    private float d = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38944b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38945c = 0.0f;

    public static jrr b(jrr jrrVar) {
        if (jrrVar == null) {
            return new jrr();
        }
        jrr jrrVar2 = new jrr();
        jrrVar2.a(jrrVar.e()).c(jrrVar.d()).b(jrrVar.c()).d(jrrVar.a()).e(jrrVar.b());
        return jrrVar2;
    }

    public float b() {
        return this.f38945c;
    }

    public jrr e(float f) {
        this.f38945c = f;
        return this;
    }

    public float c() {
        return this.f38943a;
    }

    public jrr b(float f) {
        this.f38943a = f;
        return this;
    }

    public jpg a() {
        return this.e;
    }

    public jrr d(jpg jpgVar) {
        this.e = jpgVar;
        return this;
    }

    public float d() {
        return this.d;
    }

    public jrr c(float f) {
        this.d = f;
        return this;
    }

    public float e() {
        return this.f38944b;
    }

    public jrr a(float f) {
        this.f38944b = f;
        return this;
    }
}
