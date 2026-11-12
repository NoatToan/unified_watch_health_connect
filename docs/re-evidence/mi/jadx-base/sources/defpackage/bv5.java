package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes4.dex */
public class bv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4632a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    public static j3i b() {
        int i = f4632a;
        return new j3i(4194304, i * 4194304, a(131072, 4194304, i), 131072, 4194304, i);
    }
}
