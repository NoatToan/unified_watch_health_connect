package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class bb8 implements Comparable<bb8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4011b;

    public bb8(int i, int i2) {
        this.f4010a = i;
        this.f4011b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bb8 bb8Var) {
        int i = bb8Var.f4010a;
        this.f4010a = i;
        return i;
    }
}
