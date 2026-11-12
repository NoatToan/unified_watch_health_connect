package ll1;

import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: ll1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lll1/a$a;", "Lll1/a;", "", "deviceId", "", "deviceName", "<init>", "(JLjava/lang/String;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2168a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f113366b;

        public C2168a(long j8, String str) {
            str.getClass();
            this.f113365a = j8;
            this.f113366b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2168a)) {
                return false;
            }
            C2168a c2168a = (C2168a) obj;
            return this.f113365a == c2168a.f113365a && this.f113366b.equals(c2168a.f113366b);
        }

        public final int hashCode() {
            return this.f113366b.hashCode() + (Long.hashCode(this.f113365a) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f113365a, "Onboarding(deviceId=", ", deviceName=", this.f113366b);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll1/a$b;", "Lll1/a;", "", "deviceId", "<init>", "(J)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113367a;

        public b(long j8) {
            this.f113367a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f113367a == ((b) obj).f113367a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f113367a);
        }

        public final String toString() {
            return a0.f(this.f113367a, "RecordActivityInProgress(deviceId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll1/a$c;", "Lll1/a;", "", "deviceId", "<init>", "(J)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113368a;

        public c(long j8) {
            this.f113368a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f113368a == ((c) obj).f113368a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f113368a);
        }

        public final String toString() {
            return a0.f(this.f113368a, "SelectActivity(deviceId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lll1/a$d;", "Lll1/a;", "<init>", "()V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f113369a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -230665216;
        }

        public final String toString() {
            return "SelectDevice";
        }
    }
}
