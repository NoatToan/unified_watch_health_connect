package ad2;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2789a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177706f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve2.e.f177710j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ve2.e.f177707g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ve2.e.f177708h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2789a = iArr;
        }
    }

    public static final d a(ve2.e eVar) {
        eVar.getClass();
        switch (a.f2789a[eVar.ordinal()]) {
            case 1:
                return d.PROD;
            case 2:
                return d.CHINA;
            case 3:
                return d.CHINA_TEST;
            case 4:
                return d.DEMO;
            case 5:
                return d.TEST;
            case 6:
                return d.TEST_SSO_CHINA;
            default:
                return d.STAGE;
        }
    }
}
