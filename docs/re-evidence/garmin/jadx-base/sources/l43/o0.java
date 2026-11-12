package l43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u33.d f110076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.h f110077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.y0 f110078c;

    public static final class a extends o0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s33.c f110079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f110080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final x33.b f110081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s33.c.EnumC2957c f110082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f110083h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s33.c cVar, u33.d dVar, u33.h hVar, t23.y0 y0Var, a aVar) {
            super(dVar, hVar, y0Var, null);
            cVar.getClass();
            dVar.getClass();
            hVar.getClass();
            this.f110079d = cVar;
            this.f110080e = aVar;
            this.f110081f = m0.a(dVar, cVar.f156526e);
            s33.c.EnumC2957c enumC2957c = (s33.c.EnumC2957c) u33.b.f168300f.d(cVar.f156525d);
            this.f110082g = enumC2957c == null ? s33.c.EnumC2957c.CLASS : enumC2957c;
            this.f110083h = u33.b.f168301g.d(cVar.f156525d).booleanValue();
            u33.b.f168302h.getClass();
        }

        @Override // l43.o0
        public final x33.c a() {
            return this.f110081f.a();
        }
    }

    public static final class b extends o0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x33.c f110084d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x33.c cVar, u33.d dVar, u33.h hVar, t23.y0 y0Var) {
            super(dVar, hVar, y0Var, null);
            cVar.getClass();
            dVar.getClass();
            hVar.getClass();
            this.f110084d = cVar;
        }

        @Override // l43.o0
        public final x33.c a() {
            return this.f110084d;
        }
    }

    private o0(u33.d dVar, u33.h hVar, t23.y0 y0Var) {
        this.f110076a = dVar;
        this.f110077b = hVar;
        this.f110078c = y0Var;
    }

    public abstract x33.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    public /* synthetic */ o0(u33.d dVar, u33.h hVar, t23.y0 y0Var, p005kotlin.jvm.internal.j jVar) {
        this(dVar, hVar, y0Var);
    }
}
