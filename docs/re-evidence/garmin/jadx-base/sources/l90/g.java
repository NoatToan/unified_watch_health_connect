package l90;

import o53.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ll90/g;", "", "<init>", "()V", "a", "b", "Ll90/g$a;", "Ll90/g$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll90/g$b;", "Ll90/g;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f111557a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1978111762;
        }

        public final String toString() {
            return "DiscoveryTimeout";
        }
    }

    public /* synthetic */ g(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private g() {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll90/g$a;", "Ll90/g;", "Ldk2/d;", "scannedDevice", "Ll90/b;", "device", "Lo53/r;", "Ll90/c;", "confirmDevice", "<init>", "(Ldk2/d;Ll90/b;Lo53/r;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dk2.d f111554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f111555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<c> f111556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dk2.d dVar, l90.b bVar, r<c> rVar) {
            super(null);
            dVar.getClass();
            bVar.getClass();
            rVar.getClass();
            this.f111554a = dVar;
            this.f111555b = bVar;
            this.f111556c = rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f111554a, aVar.f111554a) && s.g(this.f111555b, aVar.f111555b) && s.g(this.f111556c, aVar.f111556c);
        }

        public final int hashCode() {
            return this.f111556c.hashCode() + ((this.f111555b.hashCode() + (this.f111554a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DeviceFound(scannedDevice=" + this.f111554a + ", device=" + this.f111555b + ", confirmDevice=" + this.f111556c + ")";
        }

        public /* synthetic */ a(dk2.d dVar, l90.b bVar, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(dVar, bVar, (i14 & 4) != 0 ? gl.b.b() : rVar);
        }
    }
}
