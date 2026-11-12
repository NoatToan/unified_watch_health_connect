package vc2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lvc2/b;", "", "", "priority", "<init>", "(D)V", JWKParameterNames.RSA_EXPONENT, "c", "a", "d", "b", "Lvc2/b$a;", "Lvc2/b$b;", "Lvc2/b$c;", "Lvc2/b$d;", "Lvc2/b$e;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f177081a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvc2/b$a;", "Lvc2/b;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f177082b = new a();

        private a() {
            super(100.0d, null);
        }

        public final String toString() {
            return "CaptivePortal";
        }
    }

    /* JADX INFO: renamed from: vc2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvc2/b$b;", "Lvc2/b;", "Lvc2/d;", "metered", "<init>", "(Lvc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3312b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vc2.d f177083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3312b(vc2.d dVar) {
            super(dVar.f177102a + 300.0d, null);
            dVar.getClass();
            this.f177083b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3312b) && this.f177083b == ((C3312b) obj).f177083b;
        }

        public final int hashCode() {
            return this.f177083b.hashCode();
        }

        public final String toString() {
            return fb1.c.n("Connected: metered - ", this.f177083b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvc2/b$c;", "Lvc2/b;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f177084b = new c();

        private c() {
            super(0.0d, null);
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvc2/b$d;", "Lvc2/b;", "Lvc2/l;", "serverStatusData", "Lvc2/d;", "metered", "<init>", "(Lvc2/l;Lvc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f177085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vc2.d f177086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar, vc2.d dVar) {
            super(dVar.f177102a + 200.0d, null);
            dVar.getClass();
            this.f177085b = lVar;
            this.f177086c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f177085b, dVar.f177085b) && this.f177086c == dVar.f177086c;
        }

        public final int hashCode() {
            l lVar = this.f177085b;
            return this.f177086c.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31);
        }

        public final String toString() {
            return "ServerNotAvailable: server status data - " + this.f177085b + ", metered - " + this.f177086c;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvc2/b$e;", "Lvc2/b;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f177087b = new e();

        private e() {
            super(-100.0d, null);
        }

        public final String toString() {
            return "Unknown";
        }
    }

    private b(double d14) {
        this.f177081a = d14;
    }

    public /* synthetic */ b(double d14, p005kotlin.jvm.internal.j jVar) {
        this(d14);
    }
}
