package rf1;

import lc.u0;
import ve2.j;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152419a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f152419a = iArr;
        }
    }

    public static final e a(j jVar) {
        jVar.getClass();
        int i14 = a.f152419a[jVar.ordinal()];
        if (i14 == 1) {
            return e.EMAIL;
        }
        if (i14 == 2) {
            return e.PHONE;
        }
        if (i14 == 3) {
            return e.ALL;
        }
        u0.r();
        return null;
    }
}
