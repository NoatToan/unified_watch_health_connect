package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface t {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/t$a;", "Lc80/t;", "", "activityId", "<init>", "(J)V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25586a;

        public a(long j8) {
            this.f25586a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f25586a == ((a) obj).f25586a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f25586a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f25586a, "GetGearUsedForActivity(activityId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/t$b;", "Lc80/t;", "<init>", "()V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25587a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/t$c;", "Lc80/t;", "<init>", "()V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25588a = new c();

        private c() {
        }
    }
}
