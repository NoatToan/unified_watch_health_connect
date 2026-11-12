package q23;

import java.util.Set;
import o13.n;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<h> f142322e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.f f142332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.f f142333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f142334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f142335d;

    static {
        h hVar = CHAR;
        h hVar2 = BYTE;
        h hVar3 = SHORT;
        h hVar4 = INT;
        h hVar5 = FLOAT;
        h hVar6 = LONG;
        h hVar7 = DOUBLE;
        new a(null);
        f142322e = u.m0(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7});
    }

    h(String str) {
        this.f142332a = x33.f.e(str);
        this.f142333b = x33.f.e(str.concat("Array"));
        n nVar = n.PUBLICATION;
        this.f142334c = o13.m.a(nVar, new f(this));
        this.f142335d = o13.m.a(nVar, new g(this));
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
