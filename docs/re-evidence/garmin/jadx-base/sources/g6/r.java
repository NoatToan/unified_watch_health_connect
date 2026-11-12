package g6;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/r;", "", "a", NotificationConstants.KEY_DATA_MIME_TYPE, "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76022b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f76023c = 4294967296L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f76024d = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76025a;

    private /* synthetic */ r(long j8) {
        this.f76025a = j8;
    }

    public static final /* synthetic */ r a(long j8) {
        return new r(j8);
    }

    public static final boolean b(long j8, long j14) {
        return j8 == j14;
    }

    public static String c(long j8) {
        if (b(j8, 0L)) {
            return "Unspecified";
        }
        if (b(j8, f76023c)) {
            return "Sp";
        }
        return b(j8, f76024d) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f76025a == ((r) obj).f76025a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76025a);
    }

    public final String toString() {
        return c(this.f76025a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/r$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
