package q90;

import com.garmin.device.pairing.PairingException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lq90/a;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "g", "f", "a", "c", "b", "d", "Lq90/a$a;", "Lq90/a$b;", "Lq90/a$c;", "Lq90/a$d;", "Lq90/a$e;", "Lq90/a$f;", "Lq90/a$g;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: q90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/a$a;", "Lq90/a;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2704a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f143460a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2704a(l90.b bVar) {
            super(null);
            bVar.getClass();
            this.f143460a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2704a) && s.g(this.f143460a, ((C2704a) obj).f143460a);
        }

        public final int hashCode() {
            return this.f143460a.hashCode();
        }

        public final String toString() {
            return "Aborted(device=" + this.f143460a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq90/a$b;", "Lq90/a;", "", "deviceUnitId", "", "deviceMacAddress", "Ll90/b;", "device", "", "shouldSync", "<init>", "(JLjava/lang/String;Ll90/b;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f143462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l90.b f143463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f143464d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, String str, l90.b bVar, boolean z14) {
            super(null);
            str.getClass();
            bVar.getClass();
            this.f143461a = j8;
            this.f143462b = str;
            this.f143463c = bVar;
            this.f143464d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f143461a == bVar.f143461a && s.g(this.f143462b, bVar.f143462b) && s.g(this.f143463c, bVar.f143463c) && this.f143464d == bVar.f143464d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143464d) + ((this.f143463c.hashCode() + wr.g.j(Long.hashCode(this.f143461a) * 31, 31, this.f143462b)) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f143461a, "CtkdDualPairFailure(deviceUnitId=", ", deviceMacAddress=", this.f143462b);
            sbK.append(", device=");
            sbK.append(this.f143463c);
            sbK.append(", shouldSync=");
            sbK.append(this.f143464d);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/a$c;", "Lq90/a;", "Lcom/garmin/device/pairing/PairingException;", "pairingException", "Ll90/b;", "device", "<init>", "(Lcom/garmin/device/pairing/PairingException;Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PairingException f143465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PairingException pairingException, l90.b bVar) {
            super(null);
            pairingException.getClass();
            bVar.getClass();
            this.f143465a = pairingException;
            this.f143466b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f143465a, cVar.f143465a) && s.g(this.f143466b, cVar.f143466b);
        }

        public final int hashCode() {
            return this.f143466b.hashCode() + (this.f143465a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(pairingException=" + this.f143465a + ", device=" + this.f143466b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/a$d;", "Lq90/a;", "", "deviceUnitId", "Ll90/b;", "device", "<init>", "(JLl90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, l90.b bVar) {
            super(null);
            bVar.getClass();
            this.f143467a = j8;
            this.f143468b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f143467a == dVar.f143467a && s.g(this.f143468b, dVar.f143468b);
        }

        public final int hashCode() {
            return this.f143468b.hashCode() + (Long.hashCode(this.f143467a) * 31);
        }

        public final String toString() {
            return "InReachBlocked(deviceUnitId=" + this.f143467a + ", device=" + this.f143468b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/a$f;", "Lq90/a;", "Ll90/b;", "device", "Lp90/c;", "pairReset", "<init>", "(Ll90/b;Lp90/c;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f143476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p90.c f143477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l90.b bVar, p90.c cVar) {
            super(null);
            bVar.getClass();
            cVar.getClass();
            this.f143476a = bVar;
            this.f143477b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f143476a, fVar.f143476a) && s.g(this.f143477b, fVar.f143477b);
        }

        public final int hashCode() {
            return this.f143477b.hashCode() + (this.f143476a.hashCode() * 31);
        }

        public final String toString() {
            return "Reset(device=" + this.f143476a + ", pairReset=" + this.f143477b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq90/a$g;", "Lq90/a;", "", "deviceUnitId", "", "deviceMacAddress", "Ll90/b;", "device", "", "shouldSync", "guidMismatchFactoryReset", "<init>", "(JLjava/lang/String;Ll90/b;ZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f143479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l90.b f143480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f143481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f143482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j8, String str, l90.b bVar, boolean z14, boolean z15) {
            super(null);
            str.getClass();
            bVar.getClass();
            this.f143478a = j8;
            this.f143479b = str;
            this.f143480c = bVar;
            this.f143481d = z14;
            this.f143482e = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f143478a == gVar.f143478a && s.g(this.f143479b, gVar.f143479b) && s.g(this.f143480c, gVar.f143480c) && this.f143481d == gVar.f143481d && this.f143482e == gVar.f143482e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143482e) + q6.f.g((this.f143480c.hashCode() + wr.g.j(Long.hashCode(this.f143478a) * 31, 31, this.f143479b)) * 31, 31, this.f143481d);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f143478a, "Success(deviceUnitId=", ", deviceMacAddress=", this.f143479b);
            sbK.append(", device=");
            sbK.append(this.f143480c);
            sbK.append(", shouldSync=");
            sbK.append(this.f143481d);
            return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", guidMismatchFactoryReset=", this.f143482e, ")");
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lq90/a$e;", "Lq90/a;", "", "progress", "Ll90/b;", "device", "", "bonding", "resetting", "finishingSetup", "Lp90/b;", "pairRequestPasskey", "Lp90/a;", "pairGuidMismatch", "<init>", "(FLl90/b;ZZZLp90/b;Lp90/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f143469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f143471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f143472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f143473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p90.b f143474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p90.a f143475g;

        public /* synthetic */ e(float f14, l90.b bVar, boolean z14, boolean z15, boolean z16, p90.b bVar2, p90.a aVar, int i14, j jVar) {
            this(f14, bVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? null : bVar2, (i14 & 64) != 0 ? null : aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f143469a, eVar.f143469a) == 0 && s.g(this.f143470b, eVar.f143470b) && this.f143471c == eVar.f143471c && this.f143472d == eVar.f143472d && this.f143473e == eVar.f143473e && s.g(this.f143474f, eVar.f143474f) && s.g(this.f143475g, eVar.f143475g);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g(q6.f.g((this.f143470b.hashCode() + (Float.hashCode(this.f143469a) * 31)) * 31, 31, this.f143471c), 31, this.f143472d), 31, this.f143473e);
            p90.b bVar = this.f143474f;
            int iHashCode = (iG + (bVar == null ? 0 : bVar.hashCode())) * 31;
            p90.a aVar = this.f143475g;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Progress(progress=");
            sb3.append(this.f143469a);
            sb3.append(", device=");
            sb3.append(this.f143470b);
            sb3.append(", bonding=");
            kg.f.q(", resetting=", ", finishingSetup=", sb3, this.f143471c, this.f143472d);
            sb3.append(this.f143473e);
            sb3.append(", pairRequestPasskey=");
            sb3.append(this.f143474f);
            sb3.append(", pairGuidMismatch=");
            sb3.append(this.f143475g);
            sb3.append(")");
            return sb3.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f14, l90.b bVar, boolean z14, boolean z15, boolean z16, p90.b bVar2, p90.a aVar) {
            super(null);
            bVar.getClass();
            this.f143469a = f14;
            this.f143470b = bVar;
            this.f143471c = z14;
            this.f143472d = z15;
            this.f143473e = z16;
            this.f143474f = bVar2;
            this.f143475g = aVar;
        }
    }
}
