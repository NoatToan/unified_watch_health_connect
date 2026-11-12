package di1;

import com.garmin.proto.generated.WifiSetup;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ldi1/k;", "", "<init>", "()V", "b", "a", "Ldi1/k$a;", "Ldi1/k$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldi1/k$a;", "Ldi1/k;", "", "maxNetworks", "<init>", "(I)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f59760b;

        public a(int i14) {
            super(null);
            this.f59759a = i14;
            this.f59760b = i14;
        }

        @Override // di1.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF59763c() {
            return this.f59760b;
        }

        @Override // di1.k
        /* JADX INFO: renamed from: b */
        public final long getF59762b() {
            return 0L;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f59759a == ((a) obj).f59759a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59759a);
        }

        public final String toString() {
            return e0.f(this.f59759a, "Footer(maxNetworks=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldi1/k$b;", "Ldi1/k;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f59761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f59762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f59763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WifiSetup.StoredAccessPoint storedAccessPoint) {
            super(null);
            storedAccessPoint.getClass();
            this.f59761a = storedAccessPoint;
            long jHashCode = storedAccessPoint.getSsid().hashCode();
            this.f59762b = jHashCode;
            this.f59763c = jHashCode;
        }

        @Override // di1.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF59763c() {
            return this.f59763c;
        }

        @Override // di1.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF59762b() {
            return this.f59762b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f59761a, ((b) obj).f59761a);
        }

        public final int hashCode() {
            return this.f59761a.hashCode();
        }

        public final String toString() {
            return "NetworkItem(network=" + this.f59761a + ")";
        }
    }

    public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF59763c();

    /* JADX INFO: renamed from: b */
    public abstract long getF59762b();

    private k() {
    }
}
