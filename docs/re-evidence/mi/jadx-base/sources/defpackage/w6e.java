package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum w6e {
    CREATE,
    UPDATE,
    DELETE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37659a;

        static {
            int[] iArr = new int[w6e.values().length];
            f37659a = iArr;
            try {
                iArr[w6e.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37659a[w6e.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37659a[w6e.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(w6e w6eVar) {
        int i = a.f37659a[w6eVar.ordinal()];
        if (i == 1) {
            return "create";
        }
        if (i == 2) {
            return "update";
        }
        if (i == 3) {
            return "delete";
        }
        throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + w6eVar);
    }
}
