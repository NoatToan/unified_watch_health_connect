package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class j0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f6748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f6749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f6750c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1 f6751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f6752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1 f6753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f6754d;

        public a(s1 s1Var, K k14, s1 s1Var2, V v14) {
            this.f6751a = s1Var;
            this.f6752b = k14;
            this.f6753c = s1Var2;
            this.f6754d = v14;
        }
    }

    private j0(s1 s1Var, K k14, s1 s1Var2, V v14) {
        this.f6748a = new a<>(s1Var, k14, s1Var2, v14);
        this.f6749b = k14;
        this.f6750c = v14;
    }

    public static <K, V> int a(a<K, V> aVar, K k14, V v14) {
        return t.b(aVar.f6753c, 2, v14) + t.b(aVar.f6751a, 1, k14);
    }

    public static j0 b(s1 s1Var, s1 s1Var2, x7.g gVar) {
        return new j0(s1Var, "", s1Var2, gVar);
    }

    public static <K, V> void c(CodedOutputStream codedOutputStream, a<K, V> aVar, K k14, V v14) {
        t.n(codedOutputStream, aVar.f6751a, 1, k14);
        t.n(codedOutputStream, aVar.f6753c, 2, v14);
    }

    private j0(a<K, V> aVar, K k14, V v14) {
        this.f6748a = aVar;
        this.f6749b = k14;
        this.f6750c = v14;
    }
}
