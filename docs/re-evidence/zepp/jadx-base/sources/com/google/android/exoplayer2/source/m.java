package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class m<V> {
    private int a;
    private final SparseArray<V> b;
    private final Consumer<V> c;

    public m() {
        this(new Consumer() { // from class: com.google.android.exoplayer2.source.l
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                m.i(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Object obj) {
    }

    public void b(int i, V v) {
        if (this.a == -1) {
            Assertions.checkState(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray<V> sparseArray = this.b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.checkArgument(i >= iKeyAt);
            if (iKeyAt == i) {
                Consumer<V> consumer = this.c;
                SparseArray<V> sparseArray2 = this.b;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, v);
    }

    public void c() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void d(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.a = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
    }

    public void e(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public V f(int key) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i = this.a;
            if (i <= 0 || key >= this.b.keyAt(i)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && key >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        return this.b.size() == 0;
    }

    public m(Consumer<V> removeCallback) {
        this.b = new SparseArray<>();
        this.c = removeCallback;
        this.a = -1;
    }
}
