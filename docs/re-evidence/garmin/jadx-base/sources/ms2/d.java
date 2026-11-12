package ms2;

import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
public interface d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120497a;

        static {
            int[] iArr = new int[w.a.values().length];
            try {
                iArr[w.a.REMOVED_GC_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.a.FACTORY_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.a.SIGN_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f120497a = iArr;
        }
    }

    is2.b a();

    default void b() {
    }

    void c(js2.b bVar, cs2.a<Boolean> aVar);

    default void d(hs2.a aVar, js2.b bVar, ps2.b bVar2) {
        aVar.getClass();
        k(aVar);
        i(bVar2);
    }

    void e();

    void g();

    hs2.d getDevice();

    hs2.a getMetadata();

    void h(ps2.b bVar);

    void i(ps2.b bVar);

    default void j(w.a aVar) {
        if (aVar == null) {
            return;
        }
        int i14 = a.f120497a[aVar.ordinal()];
    }

    void k(hs2.a aVar);

    void l();
}
