package q90;

import com.garmin.device.pairing.PairingException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lq90/b;", "", "<init>", "()V", "c", "d", "a", "b", "Lq90/b$a;", "Lq90/b$b;", "Lq90/b$c;", "Lq90/b$d;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/b$a;", "Lq90/b;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f143483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l90.b bVar) {
            super(null);
            bVar.getClass();
            this.f143483a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f143483a, ((a) obj).f143483a);
        }

        public final int hashCode() {
            return this.f143483a.hashCode();
        }

        public final String toString() {
            return "Aborted(device=" + this.f143483a + ")";
        }
    }

    /* JADX INFO: renamed from: q90.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/b$b;", "Lq90/b;", "Lcom/garmin/device/pairing/PairingException;", "pairingException", "Ll90/b;", "device", "<init>", "(Lcom/garmin/device/pairing/PairingException;Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2705b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PairingException f143484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143485b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2705b(PairingException pairingException, l90.b bVar) {
            super(null);
            pairingException.getClass();
            bVar.getClass();
            this.f143484a = pairingException;
            this.f143485b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2705b)) {
                return false;
            }
            C2705b c2705b = (C2705b) obj;
            return s.g(this.f143484a, c2705b.f143484a) && s.g(this.f143485b, c2705b.f143485b);
        }

        public final int hashCode() {
            return this.f143485b.hashCode() + (this.f143484a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(pairingException=" + this.f143484a + ", device=" + this.f143485b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq90/b$d;", "Lq90/b;", "", "deviceUnitId", "", "deviceMacAddress", "Ll90/b;", "device", "", "shouldSync", "<init>", "(JLjava/lang/String;Ll90/b;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f143490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l90.b f143491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f143492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, String str, l90.b bVar, boolean z14) {
            super(null);
            str.getClass();
            bVar.getClass();
            this.f143489a = j8;
            this.f143490b = str;
            this.f143491c = bVar;
            this.f143492d = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f143489a == dVar.f143489a && s.g(this.f143490b, dVar.f143490b) && s.g(this.f143491c, dVar.f143491c) && this.f143492d == dVar.f143492d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143492d) + ((this.f143491c.hashCode() + wr.g.j(Long.hashCode(this.f143489a) * 31, 31, this.f143490b)) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f143489a, "Success(deviceUnitId=", ", deviceMacAddress=", this.f143490b);
            sbK.append(", device=");
            sbK.append(this.f143491c);
            sbK.append(", shouldSync=");
            sbK.append(this.f143492d);
            sbK.append(")");
            return sbK.toString();
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq90/b$c;", "Lq90/b;", "", "progress", "Ll90/b;", "device", "", "finishingSetup", "<init>", "(FLl90/b;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f143486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f143488c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f14, l90.b bVar, boolean z14) {
            super(null);
            bVar.getClass();
            this.f143486a = f14;
            this.f143487b = bVar;
            this.f143488c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f143486a, cVar.f143486a) == 0 && s.g(this.f143487b, cVar.f143487b) && this.f143488c == cVar.f143488c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143488c) + ((this.f143487b.hashCode() + (Float.hashCode(this.f143486a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Progress(progress=");
            sb3.append(this.f143486a);
            sb3.append(", device=");
            sb3.append(this.f143487b);
            sb3.append(", finishingSetup=");
            return hb.a.k(sb3, this.f143488c, ")");
        }

        public /* synthetic */ c(float f14, l90.b bVar, boolean z14, int i14, j jVar) {
            this(f14, bVar, (i14 & 4) != 0 ? false : z14);
        }
    }
}
