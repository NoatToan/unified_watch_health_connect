package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes4.dex */
public class j3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22381b;
    public final SparseIntArray c;
    public final int d;
    public final int e;
    public boolean f;
    public final int g;

    public j3i(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public j3i(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        b6i.i(i >= 0 && i2 >= i);
        this.f22381b = i;
        this.f22380a = i2;
        this.c = sparseIntArray;
        this.d = i3;
        this.e = i4;
        this.g = i5;
    }
}
