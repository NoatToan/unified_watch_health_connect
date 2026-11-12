package kv0;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lkv0/i;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "d", "c", "b", "a", "h", "g", "f", "Lkv0/i$a;", "Lkv0/i$b;", "Lkv0/i$c;", "Lkv0/i$d;", "Lkv0/i$e;", "Lkv0/i$f;", "Lkv0/i$g;", "Lkv0/i$h;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkv0/i$a;", "Lkv0/i;", "Lev0/b;", "deviceModel", "<init>", "(Lev0/b;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ev0.b f106655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ev0.b bVar) {
            super(null);
            bVar.getClass();
            this.f106655a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f106655a, ((a) obj).f106655a);
        }

        public final int hashCode() {
            return this.f106655a.hashCode();
        }

        public final String toString() {
            return "DeviceNotConnected(deviceModel=" + this.f106655a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/i$b;", "Lkv0/i;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f106656a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1894025106;
        }

        public final String toString() {
            return "NoRecipientsOrConnections";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/i$c;", "Lkv0/i;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f106657a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -426458921;
        }

        public final String toString() {
            return "NoSharingMethod";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/i$d;", "Lkv0/i;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f106658a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -957054103;
        }

        public final String toString() {
            return "SessionEnded";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/i$e;", "Lkv0/i;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f106659a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -896431760;
        }

        public final String toString() {
            return "SessionStarted";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkv0/i$f;", "Lkv0/i;", "Llv0/d;", "shareData", "<init>", "(Llv0/d;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final lv0.d f106660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lv0.d dVar) {
            super(null);
            dVar.getClass();
            this.f106660a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f106660a, ((f) obj).f106660a);
        }

        public final int hashCode() {
            return this.f106660a.hashCode();
        }

        public final String toString() {
            return "ShareLiveTrackSession(shareData=" + this.f106660a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkv0/i$g;", "Lkv0/i;", "Lev0/b;", "deviceModel", "<init>", "(Lev0/b;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ev0.b f106661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ev0.b bVar) {
            super(null);
            bVar.getClass();
            this.f106661a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f106661a, ((g) obj).f106661a);
        }

        public final int hashCode() {
            return this.f106661a.hashCode();
        }

        public final String toString() {
            return "StartDeviceActivity(deviceModel=" + this.f106661a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkv0/i$h;", "Lkv0/i;", "Lev0/b;", "deviceModel", "<init>", "(Lev0/b;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ev0.b f106662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ev0.b bVar) {
            super(null);
            bVar.getClass();
            this.f106662a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f106662a, ((h) obj).f106662a);
        }

        public final int hashCode() {
            return this.f106662a.hashCode();
        }

        public final String toString() {
            return "StartWithoutDevice(deviceModel=" + this.f106662a + ")";
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }
}
