package hd0;

import com.garmin.proto.generated.WifiSetup;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lhd0/h;", "", "<init>", "()V", "a", "h", "c", JWKParameterNames.RSA_EXPONENT, "f", "d", "g", "b", "Lhd0/h$a;", "Lhd0/h$b;", "Lhd0/h$c;", "Lhd0/h$d;", "Lhd0/h$e;", "Lhd0/h$f;", "Lhd0/h$g;", "Lhd0/h$h;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhd0/h$a;", "Lhd0/h;", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f83351a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhd0/h$b;", "Lhd0/h;", "", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "scannedNetworks", "<init>", "(Ljava/util/List;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<WifiSetup.ScannedAccessPoint> f83352a;

        public b(List<WifiSetup.ScannedAccessPoint> list) {
            super(null);
            this.f83352a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f83352a, ((b) obj).f83352a);
        }

        public final int hashCode() {
            List<WifiSetup.ScannedAccessPoint> list = this.f83352a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return k.h("ScannedNetworks(scannedNetworks=", ")", this.f83352a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhd0/h$c;", "Lhd0/h;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f83353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WifiSetup.StoredAccessPoint storedAccessPoint) {
            super(null);
            storedAccessPoint.getClass();
            this.f83353a = storedAccessPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f83353a, ((c) obj).f83353a);
        }

        public final int hashCode() {
            return this.f83353a.hashCode();
        }

        public final String toString() {
            return "StoredNetworkActions(network=" + this.f83353a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhd0/h$d;", "Lhd0/h;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "", "success", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f83354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WifiSetup.StoredAccessPoint storedAccessPoint, boolean z14) {
            super(null);
            storedAccessPoint.getClass();
            this.f83354a = storedAccessPoint;
            this.f83355b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f83354a, dVar.f83354a) && this.f83355b == dVar.f83355b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83355b) + (this.f83354a.hashCode() * 31);
        }

        public final String toString() {
            return "StoredNetworkAdded(network=" + this.f83354a + ", success=" + this.f83355b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhd0/h$e;", "Lhd0/h;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "Lcom/garmin/proto/generated/WifiSetup$StatusType;", "status", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;Lcom/garmin/proto/generated/WifiSetup$StatusType;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f83356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WifiSetup.StatusType f83357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WifiSetup.StoredAccessPoint storedAccessPoint, WifiSetup.StatusType statusType) {
            super(null);
            storedAccessPoint.getClass();
            statusType.getClass();
            this.f83356a = storedAccessPoint;
            this.f83357b = statusType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f83356a, eVar.f83356a) && this.f83357b == eVar.f83357b;
        }

        public final int hashCode() {
            return this.f83357b.hashCode() + (this.f83356a.hashCode() * 31);
        }

        public final String toString() {
            return "StoredNetworkConnectionTest(network=" + this.f83356a + ", status=" + this.f83357b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhd0/h$f;", "Lhd0/h;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "", "success", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f83358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83359b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(WifiSetup.StoredAccessPoint storedAccessPoint, boolean z14) {
            super(null);
            storedAccessPoint.getClass();
            this.f83358a = storedAccessPoint;
            this.f83359b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f83358a, fVar.f83358a) && this.f83359b == fVar.f83359b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83359b) + (this.f83358a.hashCode() * 31);
        }

        public final String toString() {
            return "StoredNetworkRemoved(network=" + this.f83358a + ", success=" + this.f83359b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhd0/h$g;", "Lhd0/h;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "network", "", "success", "<init>", "(Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WifiSetup.StoredAccessPoint f83360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(WifiSetup.StoredAccessPoint storedAccessPoint, boolean z14) {
            super(null);
            storedAccessPoint.getClass();
            this.f83360a = storedAccessPoint;
            this.f83361b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return s.g(this.f83360a, gVar.f83360a) && this.f83361b == gVar.f83361b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83361b) + (this.f83360a.hashCode() * 31);
        }

        public final String toString() {
            return "StoredNetworkUpdated(network=" + this.f83360a + ", success=" + this.f83361b + ")";
        }
    }

    /* JADX INFO: renamed from: hd0.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhd0/h$h;", "Lhd0/h;", "Lgn2/c$d;", "retrievedNetworks", "<init>", "(Lgn2/c$d;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1643h extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final gn2.c.d f83362a;

        public C1643h(gn2.c.d dVar) {
            super(null);
            this.f83362a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1643h) && s.g(this.f83362a, ((C1643h) obj).f83362a);
        }

        public final int hashCode() {
            gn2.c.d dVar = this.f83362a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "StoredNetworks(retrievedNetworks=" + this.f83362a + ")";
        }
    }

    public /* synthetic */ h(j jVar) {
        this();
    }

    private h() {
    }
}
