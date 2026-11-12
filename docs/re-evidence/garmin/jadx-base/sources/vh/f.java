package vh;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import p005kotlin.Metadata;
import vh.n0.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0016Bc\b\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvh/f;", "Lvh/n0$a;", "D", "", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Lvh/n0;", "operation", "data", "", "Lvh/d0;", "errors", "", "", "extensions", "Lvh/g0;", "executionContext", "", "isLast", "<init>", "(Ljava/util/UUID;Lvh/n0;Lvh/n0$a;Ljava/util/List;Ljava/util/Map;Lvh/g0;Z)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f<D extends n0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f178307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<D> f178308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f178309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d0> f178310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f178311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f178312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f178313g;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvh/f$a;", "Lvh/n0$a;", "D", "", "Lvh/n0;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "data", "<init>", "(Lvh/n0;Ljava/util/UUID;Lvh/n0$a;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D extends n0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0<D> f178314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f178315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D f178316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g0 f178317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<d0> f178318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, ? extends Object> f178319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f178320g;

        public a(n0<D> n0Var, UUID uuid, D d14) {
            n0Var.getClass();
            uuid.getClass();
            this.f178314a = n0Var;
            this.f178315b = uuid;
            this.f178316c = d14;
            this.f178317d = g0.f178322a;
        }

        public final void a(g0 g0Var) {
            g0Var.getClass();
            this.f178317d = this.f178317d.c(g0Var);
        }

        public final f<D> b() {
            UUID uuid = this.f178315b;
            g0 g0Var = this.f178317d;
            Map map = this.f178319f;
            if (map == null) {
                map = p13.k0.f134949a;
                map.getClass();
            }
            List<d0> list = this.f178318e;
            return new f<>(uuid, this.f178314a, this.f178316c, list, map, g0Var, this.f178320g, null);
        }
    }

    private f(UUID uuid, n0<D> n0Var, D d14, List<d0> list, Map<String, ? extends Object> map, g0 g0Var, boolean z14) {
        this.f178307a = uuid;
        this.f178308b = n0Var;
        this.f178309c = d14;
        this.f178310d = list;
        this.f178311e = map;
        this.f178312f = g0Var;
        this.f178313g = z14;
    }

    public final a<D> a() {
        a<D> aVar = new a<>(this.f178308b, this.f178307a, this.f178309c);
        aVar.f178318e = this.f178310d;
        aVar.f178319f = this.f178311e;
        aVar.a(this.f178312f);
        aVar.f178320g = this.f178313g;
        return aVar;
    }

    public /* synthetic */ f(UUID uuid, n0 n0Var, n0.a aVar, List list, Map map, g0 g0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(uuid, n0Var, aVar, list, map, g0Var, z14);
    }
}
