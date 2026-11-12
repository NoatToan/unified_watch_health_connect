package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class v0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f7796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f7797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f7798c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b3 f7799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f7800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b3 f7801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f7802d;

        public a(b3 b3Var, K k14, b3 b3Var2, V v14) {
            this.f7799a = b3Var;
            this.f7800b = k14;
            this.f7801c = b3Var2;
            this.f7802d = v14;
        }
    }

    private v0(b3 b3Var, K k14, b3 b3Var2, V v14) {
        this.f7796a = new a<>(b3Var, k14, b3Var2, v14);
        this.f7797b = k14;
        this.f7798c = v14;
    }

    public static <K, V> int a(a<K, V> aVar, K k14, V v14) {
        return f0.c(aVar.f7801c, 2, v14) + f0.c(aVar.f7799a, 1, k14);
    }

    public static v0 b(b3 b3Var, b3 b3Var2, Object obj) {
        return new v0(b3Var, "", b3Var2, obj);
    }

    public static <K, V> void c(CodedOutputStream codedOutputStream, a<K, V> aVar, K k14, V v14) {
        f0.o(codedOutputStream, aVar.f7799a, 1, k14);
        f0.o(codedOutputStream, aVar.f7801c, 2, v14);
    }

    private v0(a<K, V> aVar, K k14, V v14) {
        this.f7796a = aVar;
        this.f7797b = k14;
        this.f7798c = v14;
    }
}
