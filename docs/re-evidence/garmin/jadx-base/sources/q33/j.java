package q33;

import java.util.ArrayList;
import java.util.List;
import p13.h0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends e<u23.c, d43.g<?>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t23.c0 f142484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t23.g0 f142485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l43.g f142486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u33.c f142487h;

    public abstract class a implements x.a {

        /* JADX INFO: renamed from: q33.j$a$a, reason: collision with other inner class name */
        public static final class C2676a implements x.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x.a f142489a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x.a f142490b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f142491c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x33.f f142492d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ArrayList<u23.c> f142493e;

            public C2676a(x.a aVar, a aVar2, x33.f fVar, ArrayList<u23.c> arrayList) {
                this.f142490b = aVar;
                this.f142491c = aVar2;
                this.f142492d = fVar;
                this.f142493e = arrayList;
                this.f142489a = aVar;
            }

            @Override // q33.x.a
            public final void a() {
                this.f142490b.a();
                this.f142491c.h(this.f142492d, new d43.a((u23.c) h0.I0(this.f142493e)));
            }

            @Override // q33.x.a
            public final x.b b(x33.f fVar) {
                return this.f142489a.b(fVar);
            }

            @Override // q33.x.a
            public final void c(x33.f fVar, Object obj) {
                this.f142489a.c(fVar, obj);
            }

            @Override // q33.x.a
            public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
                this.f142489a.d(fVar, bVar, fVar2);
            }

            @Override // q33.x.a
            public final void e(x33.f fVar, d43.f fVar2) {
                this.f142489a.e(fVar, fVar2);
            }

            @Override // q33.x.a
            public final x.a f(x33.b bVar, x33.f fVar) {
                return this.f142489a.f(bVar, fVar);
            }
        }

        public static final class b implements x.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<d43.g<?>> f142494a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f142495b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x33.f f142496c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f142497d;

            /* JADX INFO: renamed from: q33.j$a$b$a, reason: collision with other inner class name */
            public static final class C2677a implements x.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x.a f142498a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x.a f142499b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f142500c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ArrayList<u23.c> f142501d;

                public C2677a(x.a aVar, b bVar, ArrayList<u23.c> arrayList) {
                    this.f142499b = aVar;
                    this.f142500c = bVar;
                    this.f142501d = arrayList;
                    this.f142498a = aVar;
                }

                @Override // q33.x.a
                public final void a() {
                    this.f142499b.a();
                    this.f142500c.f142494a.add(new d43.a((u23.c) h0.I0(this.f142501d)));
                }

                @Override // q33.x.a
                public final x.b b(x33.f fVar) {
                    return this.f142498a.b(fVar);
                }

                @Override // q33.x.a
                public final void c(x33.f fVar, Object obj) {
                    this.f142498a.c(fVar, obj);
                }

                @Override // q33.x.a
                public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
                    this.f142498a.d(fVar, bVar, fVar2);
                }

                @Override // q33.x.a
                public final void e(x33.f fVar, d43.f fVar2) {
                    this.f142498a.e(fVar, fVar2);
                }

                @Override // q33.x.a
                public final x.a f(x33.b bVar, x33.f fVar) {
                    return this.f142498a.f(bVar, fVar);
                }
            }

            public b(j jVar, x33.f fVar, a aVar) {
                this.f142495b = jVar;
                this.f142496c = fVar;
                this.f142497d = aVar;
            }

            @Override // q33.x.b
            public final void a() {
                x33.f fVar = this.f142496c;
                this.f142497d.g(this.f142494a, fVar);
            }

            @Override // q33.x.b
            public final void b(x33.b bVar, x33.f fVar) {
                this.f142494a.add(new d43.k(bVar, fVar));
            }

            @Override // q33.x.b
            public final void c(Object obj) {
                this.f142494a.add(j.y(this.f142495b, this.f142496c, obj));
            }

            @Override // q33.x.b
            public final x.a d(x33.b bVar) {
                ArrayList arrayList = new ArrayList();
                y0.a aVar = y0.f162076a;
                aVar.getClass();
                return new C2677a(this.f142495b.s(bVar, aVar, arrayList), this, arrayList);
            }

            @Override // q33.x.b
            public final void e(d43.f fVar) {
                this.f142494a.add(new d43.t(fVar));
            }
        }

        public a() {
        }

        @Override // q33.x.a
        public final x.b b(x33.f fVar) {
            return new b(j.this, fVar, this);
        }

        @Override // q33.x.a
        public final void c(x33.f fVar, Object obj) {
            h(fVar, j.y(j.this, fVar, obj));
        }

        @Override // q33.x.a
        public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
            h(fVar, new d43.k(bVar, fVar2));
        }

        @Override // q33.x.a
        public final void e(x33.f fVar, d43.f fVar2) {
            h(fVar, new d43.t(fVar2));
        }

        @Override // q33.x.a
        public final x.a f(x33.b bVar, x33.f fVar) {
            ArrayList arrayList = new ArrayList();
            y0.a aVar = y0.f162076a;
            aVar.getClass();
            return new C2676a(j.this.s(bVar, aVar, arrayList), this, fVar, arrayList);
        }

        public abstract void g(ArrayList arrayList, x33.f fVar);

        public abstract void h(x33.f fVar, d43.g<?> gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t23.c0 c0Var, t23.g0 g0Var, o43.n nVar, v vVar) {
        super(nVar, vVar);
        c0Var.getClass();
        g0Var.getClass();
        nVar.getClass();
        vVar.getClass();
        this.f142484e = c0Var;
        this.f142485f = g0Var;
        this.f142486g = new l43.g(c0Var, g0Var);
        this.f142487h = u33.c.f168324g;
    }

    public static final d43.g y(j jVar, x33.f fVar, Object obj) {
        jVar.getClass();
        d43.g<?> gVarB = d43.i.f57483a.b(obj, jVar.f142484e);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + fVar;
        d43.l.f57486b.getClass();
        return new d43.l.b(str);
    }

    @Override // q33.f
    public final u33.c q() {
        return this.f142487h;
    }

    @Override // q33.f
    public final k s(x33.b bVar, y0 y0Var, List list) {
        y0Var.getClass();
        list.getClass();
        return new k(this, t23.u.c(this.f142484e, bVar, this.f142485f), bVar, list, y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q33.e
    public final d43.g x(Object obj) {
        d43.g gVar = (d43.g) obj;
        if (gVar instanceof d43.d) {
            return new d43.a0(((Number) ((d43.d) gVar).f57481a).byteValue());
        }
        if (gVar instanceof d43.w) {
            return new d43.d0(((Number) ((d43.w) gVar).f57481a).shortValue());
        }
        if (gVar instanceof d43.n) {
            return new d43.b0(((Number) ((d43.n) gVar).f57481a).intValue());
        }
        return gVar instanceof d43.u ? new d43.c0(((Number) ((d43.u) gVar).f57481a).longValue()) : gVar;
    }
}
