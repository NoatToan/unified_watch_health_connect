package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
abstract class an extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53425b;

    public an(int i14, int i15) {
        al.b(i15, i14, FirebaseAnalytics.Param.INDEX);
        this.f53424a = i14;
        this.f53425b = i15;
    }

    public abstract Object a(int i14);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f53425b < this.f53424a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f53425b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            c22.t.g();
            return null;
        }
        int i14 = this.f53425b;
        this.f53425b = i14 + 1;
        return a(i14);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f53425b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            c22.t.g();
            return null;
        }
        int i14 = this.f53425b - 1;
        this.f53425b = i14;
        return a(i14);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f53425b - 1;
    }
}
