package bu0;

import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface k {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbu0/k$a;", "Lbu0/k;", "", "deviceUnitId", "<init>", "(J)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21212a;

        public a(long j8) {
            this.f21212a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f21212a == ((a) obj).f21212a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f21212a);
        }

        public final String toString() {
            return a0.f(this.f21212a, "Active(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbu0/k$b;", "Lbu0/k;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21213a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -201991444;
        }

        public final String toString() {
            return "NoSession";
        }
    }
}
