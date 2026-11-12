package ka;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f103666d = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103669c;

    private c(b bVar) {
        this.f103667a = bVar.f103670a;
        this.f103668b = bVar.f103671b;
        this.f103669c = bVar.f103672c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f103667a == cVar.f103667a && this.f103668b == cVar.f103668b && this.f103669c == cVar.f103669c;
    }

    public final int hashCode() {
        return ((this.f103667a ? 1 : 0) << 2) + ((this.f103668b ? 1 : 0) << 1) + (this.f103669c ? 1 : 0);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f103670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f103671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f103672c;

        public b(c cVar) {
            this.f103670a = cVar.f103667a;
            this.f103671b = cVar.f103668b;
            this.f103672c = cVar.f103669c;
        }

        public final c a() {
            if (this.f103670a || !(this.f103671b || this.f103672c)) {
                return new c(this);
            }
            vb.h.z("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }

        public b() {
        }
    }
}
