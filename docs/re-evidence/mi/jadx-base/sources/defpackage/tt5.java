package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes4.dex */
public class tt5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f35012a = new SparseIntArray(0);

    public static j3i a() {
        return new j3i(0, b(), f35012a);
    }

    public static int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
