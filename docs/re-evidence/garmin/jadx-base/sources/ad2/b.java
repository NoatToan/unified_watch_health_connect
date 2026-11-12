package ad2;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2775a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177707g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177708h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177714n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ve2.e.f177706f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2775a = iArr;
        }
    }

    public static final ad2.a a(ve2.e eVar) {
        eVar.getClass();
        int i14 = a.f2775a[eVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return ad2.a.TEST;
        }
        return (i14 == 4 || i14 == 5) ? ad2.a.CHINA : ad2.a.PROD;
    }
}
