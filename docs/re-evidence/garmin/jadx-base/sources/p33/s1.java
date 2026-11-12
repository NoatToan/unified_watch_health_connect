package p33;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f135515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f135516b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135517a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135517a = iArr;
        }
    }

    static {
        x33.c cVar = h33.c0.f81434p;
        cVar.getClass();
        f135515a = new h(cVar);
        x33.c cVar2 = h33.c0.f81435q;
        cVar2.getClass();
        f135516b = new h(cVar2);
    }
}
