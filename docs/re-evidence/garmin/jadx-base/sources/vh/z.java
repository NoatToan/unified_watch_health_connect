package vh;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\f\rB1\b\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lvh/z;", "Lvh/g0$b;", "", "", "Lvh/a;", "customScalarAdapters", "Lvh/b;", "adapterContext", "", "unsafe", "<init>", "(Ljava/util/Map;Lvh/b;Z)V", "a", "b", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class z implements g0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f178396e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f178397f = new a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.b f178398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, vh.a<?>> f178400d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh/z$a;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f178401a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public vh.b f178402b = new vh.b.a().a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f178403c;

        public final z a() {
            return new z(this.f178401a, this.f178402b, this.f178403c, null);
        }
    }

    static {
        a aVar = new a();
        aVar.f178403c = true;
        aVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z(Map<String, ? extends vh.a<?>> map, vh.b bVar, boolean z14) {
        this.f178398b = bVar;
        this.f178399c = z14;
        this.f178400d = map;
    }

    @Override // vh.g0
    public final g0 a(g0.c<?> cVar) {
        return g0.b.a.c(this, cVar);
    }

    @Override // vh.g0
    public final <E extends g0.b> E b(g0.c<E> cVar) {
        return (E) g0.b.a.b(this, cVar);
    }

    @Override // vh.g0
    public final g0 c(g0 g0Var) {
        return g0.b.a.d(g0Var, this);
    }

    public final <T> vh.a<T> d(a0 a0Var) {
        vh.a<T> q0Var;
        a0Var.getClass();
        String str = a0Var.f178257b;
        String str2 = a0Var.f178393a;
        Map<String, vh.a<?>> map = this.f178400d;
        if (map.get(str2) != null) {
            q0Var = (vh.a) map.get(str2);
        } else if (p005kotlin.jvm.internal.s.g(str, "com.apollographql.apollo3.api.Upload")) {
            q0Var = c.f178273h;
        } else if (p13.x.k("kotlin.String", "java.lang.String").contains(str)) {
            q0Var = c.f178266a;
        } else if (p13.x.k("kotlin.Boolean", "java.lang.Boolean").contains(str)) {
            q0Var = c.f178271f;
        } else if (p13.x.k("kotlin.Int", "java.lang.Int").contains(str)) {
            q0Var = c.f178267b;
        } else if (p13.x.k("kotlin.Double", "java.lang.Double").contains(str)) {
            q0Var = c.f178268c;
        } else if (p13.x.k("kotlin.Long", "java.lang.Long").contains(str)) {
            q0Var = c.f178270e;
        } else if (p13.x.k("kotlin.Float", "java.lang.Float").contains(str)) {
            q0Var = c.f178269d;
        } else if (p13.x.k("kotlin.Any", "java.lang.Object").contains(str)) {
            q0Var = c.f178272g;
        } else {
            if (!this.f178399c) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + str2 + "` to: `" + str + "`. Did you forget to add a CustomScalarAdapter?").toString());
            }
            q0Var = new q0<>();
        }
        q0Var.getClass();
        return q0Var;
    }

    @Override // vh.g0
    public final <R> R fold(R r14, e23.p<? super R, ? super g0.b, ? extends R> pVar) {
        return (R) g0.b.a.a(this, r14, pVar);
    }

    @Override // vh.g0.b
    public final g0.c<?> getKey() {
        return f178396e;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/z$b;", "Lvh/g0$c;", "Lvh/z;", "<init>", "()V", "Empty", "Lvh/z;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements g0.c<z> {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ z(Map map, vh.b bVar, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(map, bVar, z14);
    }
}
