package l90;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ll90/h;", "", "", "firstPhaseDurationMillis", "secondPhaseDurationMillis", "thirdPhaseDurationMillis", "<init>", "(JJJ)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f111558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111560c;

    static {
        new a(null);
    }

    public /* synthetic */ h(long j8, long j14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? AbstractComponentTracker.LINGERING_TIMEOUT : j8, (i14 & 2) != 0 ? 5000L : j14, (i14 & 4) != 0 ? 5000L : j15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f111558a == hVar.f111558a && this.f111559b == hVar.f111559b && this.f111560c == hVar.f111560c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f111560c) + q6.f.e(Long.hashCode(this.f111558a) * 31, 31, this.f111559b);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f111558a, "DeviceTypeDiscoveryTime(firstPhaseDurationMillis=", ", secondPhaseDurationMillis=");
        sbK.append(this.f111559b);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f111560c, ", thirdPhaseDurationMillis=", ")", sbK);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ll90/h$a;", "", "<init>", "()V", "", "DEFAULT_FIRST_PHASE_DURATION_MILLIS", "J", "DEFAULT_SECOND_PHASE_DURATION_MILLIS", "DEFAULT_THIRD_PHASE_DURATION_MILLIS", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(long j8, long j14, long j15) {
        this.f111558a = j8;
        this.f111559b = j14;
        this.f111560c = j15;
    }

    public h() {
        this(0L, 0L, 0L, 7, null);
    }
}
