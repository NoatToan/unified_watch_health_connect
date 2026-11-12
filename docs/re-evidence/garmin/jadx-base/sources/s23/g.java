package s23;

import java.util.Collection;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p13.a1;
import p13.l0;
import t23.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements v23.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x33.f f156258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x33.b f156259h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f156260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<c0, t23.l> f156261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.j f156262c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f156256e = {s0.f105811a.h(new i0(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f156255d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x33.c f156257f = p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l;

    static {
        x33.d dVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105873d;
        f156258g = dVar.g();
        x33.b.a aVar = x33.b.f188590d;
        x33.c cVarI = dVar.i();
        aVar.getClass();
        f156259h = x33.b.a.b(cVarI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(o43.n nVar, c0 c0Var, e23.l<? super c0, ? extends t23.l> lVar) {
        nVar.getClass();
        c0Var.getClass();
        lVar.getClass();
        this.f156260a = c0Var;
        this.f156261b = lVar;
        this.f156262c = nVar.g(new e(this, nVar));
    }

    @Override // v23.b
    public final boolean a(x33.c cVar, x33.f fVar) {
        cVar.getClass();
        fVar.getClass();
        return fVar.equals(f156258g) && cVar.equals(f156257f);
    }

    @Override // v23.b
    public final t23.e b(x33.b bVar) {
        if (!bVar.equals(f156259h)) {
            return null;
        }
        return (w23.m) gl1.d.B(this.f156262c, f156256e[0]);
    }

    @Override // v23.b
    public final Collection<t23.e> c(x33.c cVar) {
        cVar.getClass();
        if (!cVar.equals(f156257f)) {
            return l0.f134950a;
        }
        return a1.b((w23.m) gl1.d.B(this.f156262c, f156256e[0]));
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(o43.n nVar, c0 c0Var, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(nVar, c0Var, (i14 & 4) != 0 ? f.f156254a : lVar);
    }
}
