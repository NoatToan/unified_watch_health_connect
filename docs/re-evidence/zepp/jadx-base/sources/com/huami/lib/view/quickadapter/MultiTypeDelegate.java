package com.huami.lib.view.quickadapter;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MultiTypeDelegate<T> {
    private static final int d = -255;
    private static final int e = -404;
    private SparseIntArray a;
    private boolean b;
    private boolean c;

    public MultiTypeDelegate(SparseIntArray sparseIntArray) {
        this.a = sparseIntArray;
    }

    private void a(int i, @LayoutRes int i2) {
        if (this.a == null) {
            this.a = new SparseIntArray();
        }
        this.a.put(i, i2);
    }

    private void b(boolean z) {
        if (z) {
            throw new RuntimeException("Don't mess two register mode");
        }
    }

    public final int getDefItemViewType(List<T> list, int i) {
        T t = list.get(i);
        return t != null ? getItemType(t) : d;
    }

    public abstract int getItemType(T t);

    public final int getLayoutId(int i) {
        return this.a.get(i, -404);
    }

    public MultiTypeDelegate registerItemType(int i, @LayoutRes int i2) {
        this.c = true;
        b(this.b);
        a(i, i2);
        return this;
    }

    public MultiTypeDelegate registerItemTypeAutoIncrease(@LayoutRes int... iArr) {
        this.b = true;
        b(this.c);
        for (int i = 0; i < iArr.length; i++) {
            a(i, iArr[i]);
        }
        return this;
    }

    public MultiTypeDelegate() {
    }
}
