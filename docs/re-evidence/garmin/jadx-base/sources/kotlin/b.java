package kotlin;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Li5/b;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f91084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f91085b = new int[2];

    public abstract int[] a(int i14);

    public final int[] b(int i14, int i15) {
        if (i14 < 0 || i15 < 0 || i14 == i15) {
            return null;
        }
        int[] iArr = this.f91085b;
        iArr[0] = i14;
        iArr[1] = i15;
        return iArr;
    }

    public final String c() {
        String str = this.f91084a;
        if (str != null) {
            return str;
        }
        s.m("text");
        throw null;
    }

    public abstract int[] d(int i14);
}
