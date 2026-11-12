package qf1;

import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: qf1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2724a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144603a;

        static {
            int[] iArr = new int[kx2.a.values().length];
            try {
                iArr[kx2.a.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f144603a = iArr;
        }
    }

    public static final rf1.b a(kx2.a aVar) {
        aVar.getClass();
        if (C2724a.f144603a[aVar.ordinal()] == 1) {
            return rf1.b.ECG;
        }
        u0.r();
        return null;
    }
}
