package vh;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB+\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvh/b;", "", "Lvh/e0$b;", "variables", "", "Lvh/b0;", "mergedDeferredFragmentIds", "", "serializeVariablesWithDefaultBooleanValues", "<init>", "(Lvh/e0$b;Ljava/util/Set;Z)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.b f178258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<b0> f178259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178260c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh/b$a;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e0.b f178261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set<b0> f178262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f178263c;

        public final b a() {
            return new b(this.f178261a, this.f178262b, p005kotlin.jvm.internal.s.g(this.f178263c, Boolean.TRUE), null);
        }
    }

    private b(e0.b bVar, Set<b0> set, boolean z14) {
        this.f178258a = bVar;
        this.f178259b = set;
        this.f178260c = z14;
    }

    public final a a() {
        a aVar = new a();
        aVar.f178261a = this.f178258a;
        aVar.f178262b = this.f178259b;
        aVar.f178263c = Boolean.valueOf(this.f178260c);
        return aVar;
    }

    public final Set<String> b() {
        e0.b bVar = this.f178258a;
        if (bVar == null) {
            return p13.l0.f134950a;
        }
        Map<String, Object> map = bVar.f178306a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (p005kotlin.jvm.internal.s.g(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public /* synthetic */ b(e0.b bVar, Set set, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, set, z14);
    }
}
