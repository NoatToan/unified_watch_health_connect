package en0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64701a;

        static {
            int[] iArr = new int[yl2.b.values().length];
            try {
                iArr[yl2.b.K1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yl2.b.L1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64701a = iArr;
        }
    }

    public static final vd2.e a(int i14) {
        yl2.b bVar = (yl2.b) yl2.b.B6.get(String.valueOf(i14));
        int i15 = bVar == null ? -1 : a.f64701a[bVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? vd2.e.Vivomove3 : vd2.e.Jade;
        }
        return vd2.e.Quartz;
    }
}
