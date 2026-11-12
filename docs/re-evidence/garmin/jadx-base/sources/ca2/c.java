package ca2;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26614a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f26605d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f26606e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f26607f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26614a = iArr;
        }
    }

    public static final b a(b bVar) {
        bVar.getClass();
        int i14 = a.f26614a[bVar.ordinal()];
        if (i14 == 1) {
            return b.f26606e;
        }
        if (i14 == 2 || i14 == 3) {
            return b.f26608g;
        }
        return null;
    }
}
