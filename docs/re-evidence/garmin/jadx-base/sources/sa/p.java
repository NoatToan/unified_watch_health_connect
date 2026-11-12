package sa;

import android.util.SparseArray;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public final class p<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f158148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.g<V> f158149c;

    public p(fa.g<V> gVar) {
        this.f158148b = new SparseArray<>();
        this.f158149c = gVar;
        this.f158147a = -1;
    }

    public final V a(int i14) {
        SparseArray<V> sparseArray;
        if (this.f158147a == -1) {
            this.f158147a = 0;
        }
        while (true) {
            int i15 = this.f158147a;
            sparseArray = this.f158148b;
            if (i15 <= 0 || i14 >= sparseArray.keyAt(i15)) {
                break;
            }
            this.f158147a--;
        }
        while (this.f158147a < sparseArray.size() - 1 && i14 >= sparseArray.keyAt(this.f158147a + 1)) {
            this.f158147a++;
        }
        return sparseArray.valueAt(this.f158147a);
    }

    public p() {
        this(new q2(29));
    }
}
