package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f23933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f23934b;

    public kk() {
        this.f23933a = b.WRIST;
        this.f23934b = a.LEFT;
    }

    public a a() {
        return this.f23934b;
    }

    public void b(a aVar) {
        this.f23934b = aVar;
    }

    public void c(b bVar) {
        this.f23933a = bVar;
    }

    public b d() {
        return this.f23933a;
    }

    public String toString() {
        return "[Wear:" + this.f23933a + ",Way:" + this.f23934b + "]";
    }

    public enum a {
        OTHER(-1),
        LEFT(0),
        RIGHT(1);

        public int t;

        a(int i) {
            this.t = i;
        }

        public static a a(byte b2) {
            for (a aVar : values()) {
                if (aVar.a() == b2) {
                    return aVar;
                }
            }
            return LEFT;
        }

        public int a() {
            return this.t;
        }
    }

    public enum b {
        OTHER(0),
        CHEST(1),
        WRIST(2),
        FINGER(3),
        HAND(4),
        EAR_LOBE(5),
        FOOT(6);

        public int t;

        b(int i) {
            this.t = i;
        }

        public static b a(byte b2) {
            for (b bVar : values()) {
                if (bVar.a() == b2) {
                    return bVar;
                }
            }
            return OTHER;
        }

        public int a() {
            return this.t;
        }
    }

    public kk(b bVar, a aVar) {
        this.f23933a = b.WRIST;
        a aVar2 = a.OTHER;
        this.f23933a = bVar;
        this.f23934b = aVar;
    }
}
