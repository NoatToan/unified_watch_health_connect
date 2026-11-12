package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class njf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27978b;
    public final int c;
    public final long d;
    public final int e;

    public njf(Object obj) {
        this(obj, -1L);
    }

    public njf a(Object obj) {
        return this.f27977a.equals(obj) ? this : new njf(obj, this.f27978b, this.c, this.d, this.e);
    }

    public boolean b() {
        return this.f27978b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njf)) {
            return false;
        }
        njf njfVar = (njf) obj;
        return this.f27977a.equals(njfVar.f27977a) && this.f27978b == njfVar.f27978b && this.c == njfVar.c && this.d == njfVar.d && this.e == njfVar.e;
    }

    public int hashCode() {
        return ((((((((527 + this.f27977a.hashCode()) * 31) + this.f27978b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public njf(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public njf(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public njf(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public njf(njf njfVar) {
        this.f27977a = njfVar.f27977a;
        this.f27978b = njfVar.f27978b;
        this.c = njfVar.c;
        this.d = njfVar.d;
        this.e = njfVar.e;
    }

    public njf(Object obj, int i, int i2, long j, int i3) {
        this.f27977a = obj;
        this.f27978b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
