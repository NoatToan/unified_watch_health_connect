package mk;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f119094b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f119095c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f119096d;

    public a(int i14) {
        this.f119096d = i14;
    }

    public final void a(int i14) {
        if (!this.f119094b) {
            this.f119093a = i14;
            this.f119094b = true;
        }
        long j8 = this.f119095c + ((long) i14);
        int i15 = this.f119093a;
        long j14 = j8 - ((long) i15);
        if (i15 > i14) {
            j14 = j14 + 1 + ((long) this.f119096d);
        }
        this.f119093a = i14;
        this.f119095c = j14;
    }
}
