package ll1;

import androidx.room.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public interface k {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lll1/k$a;", "Lll1/k;", "", "deviceId", "", "deviceName", "<init>", "(JLjava/lang/String;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f113408b;

        public a(long j8, String str) {
            this.f113407a = j8;
            this.f113408b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f113407a == aVar.f113407a && s.g(this.f113408b, aVar.f113408b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f113407a) * 31;
            String str = this.f113408b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f113407a, "Onboarding(deviceId=", ", deviceName=", this.f113408b);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll1/k$b;", "Lll1/k;", "", "deviceId", "<init>", "(J)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113409a;

        public b(long j8) {
            this.f113409a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f113409a == ((b) obj).f113409a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f113409a);
        }

        public final String toString() {
            return a0.f(this.f113409a, "SelectActivity(deviceId=", ")");
        }
    }
}
