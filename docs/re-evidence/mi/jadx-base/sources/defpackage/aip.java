package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class aip {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aip f1071b = new qdm(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aip f1072a;

    public aip(aip aipVar) {
        this.f1072a = aipVar;
    }

    public final aip a(int i, int i2) {
        return new qdm(this, i, i2);
    }

    public final aip b(int i, int i2) {
        return new gj2(this, i, i2);
    }

    public abstract void c(zo2 zo2Var, byte[] bArr);

    public final aip d() {
        return this.f1072a;
    }
}
