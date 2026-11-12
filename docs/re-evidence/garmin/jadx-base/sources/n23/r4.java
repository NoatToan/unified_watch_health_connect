package n23;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB5\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ln23/r4;", "", "", "Ln23/t3;", "ownTypeParameters", "", "", "Lk23/q;", "map", "parent", "<init>", "(Ljava/util/List;Ljava/util/Map;Ln23/r4;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f122597d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r4 f122598e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t3> f122599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, k23.q> f122600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4 f122601c;

    static {
        p13.j0 j0Var = p13.j0.f134944a;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        f122598e = new r4(j0Var, k0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r4(List<t3> list, Map<Integer, ? extends k23.q> map, r4 r4Var) {
        this.f122599a = list;
        this.f122600b = map;
        this.f122601c = r4Var;
    }

    public final k23.q a(int i14) {
        k23.q qVar = this.f122600b.get(Integer.valueOf(i14));
        if (qVar != null) {
            return qVar;
        }
        r4 r4Var = this.f122601c;
        if (r4Var != null) {
            return r4Var.a(i14);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln23/r4$a;", "", "<init>", "()V", "Ln23/r4;", "EMPTY", "Ln23/r4;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ r4(List list, Map map, r4 r4Var, p005kotlin.jvm.internal.j jVar) {
        this(list, map, r4Var);
    }
}
