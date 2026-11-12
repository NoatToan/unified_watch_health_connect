package j23;

import p005kotlin.Metadata;
import p13.p0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj23/k;", "Lp13/p0;", "", "first", "last", "step", "<init>", "(III)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96802d;

    public k(int i14, int i15, int i16) {
        this.f96799a = i16;
        this.f96800b = i15;
        boolean z14 = false;
        if (i16 <= 0 ? i14 >= i15 : i14 <= i15) {
            z14 = true;
        }
        this.f96801c = z14;
        this.f96802d = z14 ? i14 : i15;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96801c;
    }

    @Override // p13.p0
    public final int nextInt() {
        int i14 = this.f96802d;
        if (i14 != this.f96800b) {
            this.f96802d = this.f96799a + i14;
            return i14;
        }
        if (this.f96801c) {
            this.f96801c = false;
            return i14;
        }
        c22.t.g();
        return 0;
    }
}
