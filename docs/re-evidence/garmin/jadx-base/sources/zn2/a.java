package zn2;

import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzn2/a;", "", "<init>", "()V", "d", "c", "f", "g", "a", JWKParameterNames.RSA_EXPONENT, "b", "Lzn2/a$a;", "Lzn2/a$b;", "Lzn2/a$c;", "Lzn2/a$d;", "Lzn2/a$e;", "Lzn2/a$f;", "Lzn2/a$g;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: zn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/a$a;", "Lzn2/a;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3841a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205404a;

        public C3841a(long j8) {
            super(null);
            this.f205404a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3841a) && this.f205404a == ((C3841a) obj).f205404a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f205404a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f205404a, "ActivatingDevice(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzn2/a$c;", "Lzn2/a;", "", "deviceUnitId", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(JLjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f205408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, String str) {
            super(null);
            str.getClass();
            this.f205407a = j8;
            this.f205408b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f205407a == cVar.f205407a && p005kotlin.jvm.internal.s.g(this.f205408b, cVar.f205408b);
        }

        public final int hashCode() {
            return this.f205408b.hashCode() + (Long.hashCode(this.f205407a) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f205407a, "CheckingDeviceError(deviceUnitId=", ", error=", this.f205408b);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/a$d;", "Lzn2/a;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205409a;

        public d(long j8) {
            super(null);
            this.f205409a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f205409a == ((d) obj).f205409a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f205409a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f205409a, "CheckingDeviceStatus(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/a$e;", "Lzn2/a;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205410a;

        public e(long j8) {
            super(null);
            this.f205410a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f205410a == ((e) obj).f205410a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f205410a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f205410a, "DeviceActivated(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/a$f;", "Lzn2/a;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205411a;

        public f(long j8) {
            super(null);
            this.f205411a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f205411a == ((f) obj).f205411a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f205411a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f205411a, "DeviceIsActive(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/a$g;", "Lzn2/a;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205412a;

        public g(long j8) {
            super(null);
            this.f205412a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f205412a == ((g) obj).f205412a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f205412a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f205412a, "DeviceIsNotActive(deviceUnitId=", ")");
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return androidx.room.a0.f(((d) this).f205409a, "DeviceActivationStatus - Checking device(", ") status...");
        }
        if (this instanceof c) {
            c cVar = (c) this;
            return v.h.u(cVar.f205407a, "DeviceActivationStatus - There was an error trying to check device(", ") status: ", cVar.f205408b);
        }
        if (this instanceof f) {
            return androidx.room.a0.f(((f) this).f205411a, "DeviceActivationStatus - Device(", ") is active. No need to activate.");
        }
        if (this instanceof g) {
            return androidx.room.a0.f(((g) this).f205412a, "DeviceActivationStatus - Device(", ") is not active.");
        }
        if (this instanceof C3841a) {
            return androidx.room.a0.f(((C3841a) this).f205404a, "DeviceActivationStatus - Activating device(", ")....");
        }
        if (this instanceof e) {
            return androidx.room.a0.f(((e) this).f205410a, "DeviceActivationStatus - Device(", ") was activated successfully.");
        }
        if (!(this instanceof b)) {
            lc.u0.r();
            return null;
        }
        b bVar = (b) this;
        return v.h.u(bVar.f205405a, "DeviceActivationStatus - Device(", ") was not activated due to an error: ", bVar.f205406b);
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzn2/a$b;", "Lzn2/a;", "", "deviceUnitId", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(JLjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f205406b;

        public b(long j8, String str) {
            super(null);
            this.f205405a = j8;
            this.f205406b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f205405a == bVar.f205405a && p005kotlin.jvm.internal.s.g(this.f205406b, bVar.f205406b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f205405a) * 31;
            String str = this.f205406b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f205405a, "ActivatingDeviceError(deviceUnitId=", ", error=", this.f205406b);
            sbK.append(")");
            return sbK.toString();
        }

        public /* synthetic */ b(long j8, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? null : str);
        }
    }
}
