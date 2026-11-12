package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qlj implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46443c;
    private float d;

    public qlj(float f, float f2, int i, String str) {
        this.d = f;
        this.f46441a = f2;
        this.f46443c = i;
        this.f46442b = str;
    }

    public float b() {
        return this.d;
    }

    public void d(float f) {
        this.d = f;
    }

    public float e() {
        return this.f46441a;
    }

    public void e(float f) {
        this.f46441a = f;
    }

    public int a() {
        return this.f46443c;
    }

    public String d() {
        return this.f46442b;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public qlj clone() throws CloneNotSupportedException {
        return new qlj(this.d, this.f46441a, this.f46443c, this.f46442b);
    }
}
