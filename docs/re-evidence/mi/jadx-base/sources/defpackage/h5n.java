package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class h5n<V> {
    public final ag4<V> c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f19723b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19722a = -1;

    public h5n(ag4<V> ag4Var) {
        this.c = ag4Var;
    }

    public void a(int i, V v) {
        if (this.f19722a == -1) {
            rk1.g(this.f19723b.size() == 0);
            this.f19722a = 0;
        }
        if (this.f19723b.size() > 0) {
            SparseArray<V> sparseArray = this.f19723b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            rk1.a(i >= iKeyAt);
            if (iKeyAt == i) {
                ag4<V> ag4Var = this.c;
                SparseArray<V> sparseArray2 = this.f19723b;
                ag4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f19723b.append(i, v);
    }

    public void b() {
        for (int i = 0; i < this.f19723b.size(); i++) {
            this.c.accept(this.f19723b.valueAt(i));
        }
        this.f19722a = -1;
        this.f19723b.clear();
    }

    public void c(int i) {
        for (int size = this.f19723b.size() - 1; size >= 0 && i < this.f19723b.keyAt(size); size--) {
            this.c.accept(this.f19723b.valueAt(size));
            this.f19723b.removeAt(size);
        }
        this.f19722a = this.f19723b.size() > 0 ? Math.min(this.f19722a, this.f19723b.size() - 1) : -1;
    }

    public void d(int i) {
        int i2 = 0;
        while (i2 < this.f19723b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f19723b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.f19723b.valueAt(i2));
            this.f19723b.removeAt(i2);
            int i4 = this.f19722a;
            if (i4 > 0) {
                this.f19722a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public V e(int i) {
        if (this.f19722a == -1) {
            this.f19722a = 0;
        }
        while (true) {
            int i2 = this.f19722a;
            if (i2 <= 0 || i >= this.f19723b.keyAt(i2)) {
                break;
            }
            this.f19722a--;
        }
        while (this.f19722a < this.f19723b.size() - 1 && i >= this.f19723b.keyAt(this.f19722a + 1)) {
            this.f19722a++;
        }
        return this.f19723b.valueAt(this.f19722a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f19723b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f19723b.size() == 0;
    }
}
