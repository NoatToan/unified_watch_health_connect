package u0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.a f167324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f167325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f167326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f167327d;

    public c(u0.a aVar, d dVar, b bVar, int i14) {
        this.f167324a = aVar;
        this.f167325b = dVar;
        this.f167326c = bVar;
        this.f167327d = i14;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u0.a f167328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f167329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f167330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f167331d;

        private a(c cVar) {
            this.f167328a = u0.a.f167321c;
            this.f167329b = null;
            this.f167330c = null;
            this.f167331d = 0;
            this.f167328a = cVar.f167324a;
            this.f167329b = cVar.f167325b;
            this.f167330c = cVar.f167326c;
            this.f167331d = cVar.f167327d;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public final c a() {
            return new c(this.f167328a, this.f167329b, this.f167330c, this.f167331d);
        }

        public a() {
            this.f167328a = u0.a.f167321c;
            this.f167329b = null;
            this.f167330c = null;
            this.f167331d = 0;
        }
    }
}
