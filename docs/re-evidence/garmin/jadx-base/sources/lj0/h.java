package lj0;

/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f113008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f113010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f113012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e.b f113014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f113015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f113016i;

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f113017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f113018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f113019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f113020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f113021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f113022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e.b f113023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f113024h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f113025i;

        public a(h hVar, d dVar, int[] iArr, String str, int i14, d dVar2, String str2, e.b bVar, String str3, byte[] bArr) {
            this.f113017a = dVar;
            this.f113018b = iArr;
            this.f113019c = str;
            this.f113020d = i14;
            this.f113021e = dVar2;
            this.f113022f = str2;
            this.f113023g = bVar;
            this.f113024h = str3;
            this.f113025i = bArr;
        }

        @Override // lj0.g
        public final byte[] a() {
            return this.f113025i;
        }

        @Override // lj0.g
        public final d b() {
            return this.f113017a;
        }

        @Override // lj0.g
        public final int[] c() {
            return this.f113018b;
        }

        @Override // lj0.g
        public final int d() {
            return this.f113020d;
        }

        @Override // lj0.g
        public final e.b e() {
            return this.f113023g;
        }

        @Override // lj0.g
        public final d f() {
            return this.f113021e;
        }

        @Override // lj0.g
        public final String g() {
            return this.f113022f;
        }

        @Override // lj0.g
        public final String getContentType() {
            return this.f113024h;
        }

        @Override // lj0.g
        public final String getURI() {
            return this.f113019c;
        }
    }

    public h(g gVar) {
        this.f113015h = "application/json";
        this.f113008a = gVar.b();
        this.f113009b = gVar.getURI();
        this.f113010c = gVar.c();
        this.f113011d = gVar.d();
        this.f113012e = gVar.f();
        this.f113013f = gVar.g();
        this.f113014g = gVar.e();
        this.f113015h = gVar.getContentType();
        this.f113016i = gVar.a();
    }

    public h() {
        this.f113015h = "application/json";
    }
}
