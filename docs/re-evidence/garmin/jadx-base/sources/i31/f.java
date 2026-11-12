package i31;

import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Li31/f;", "", "Lb31/a;", "deviceOnboardingRepository", "Lb31/f;", "onboardingChecksRepository", "Li31/c;", "fetchDeviceOnboardingItemsUseCase", "Lrd2/j;", "deviceSelectQuery", "Li31/s;", "getOnboardingDeviceFilterTypeUseCase", "Li31/v;", "getSupportedOnboardingTypes", "<init>", "(Lb31/a;Lb31/f;Li31/c;Lrd2/j;Li31/s;Li31/v;)V", "b", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b31.a f90670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f90671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f90672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rd2.j f90673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f90674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f90675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f90676g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li31/f$b;", "", "", "deviceId", "", "sortOrder", "<init>", "(JI)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f90677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90678b;

        public b(long j8, int i14) {
            this.f90677a = j8;
            this.f90678b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f90677a == bVar.f90677a && this.f90678b == bVar.f90678b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90678b) + (Long.hashCode(this.f90677a) * 31);
        }

        public final String toString() {
            StringBuilder sbW = v.h.w(this.f90678b, "DeviceOrder(deviceId=", ", sortOrder=", this.f90677a);
            sbW.append(")");
            return sbW.toString();
        }
    }

    static {
        new a(null);
    }

    public f(b31.a aVar, b31.f fVar, c cVar, rd2.j jVar, s sVar, v vVar) {
        aVar.getClass();
        fVar.getClass();
        cVar.getClass();
        jVar.getClass();
        sVar.getClass();
        vVar.getClass();
        this.f90670a = aVar;
        this.f90671b = fVar;
        this.f90672c = cVar;
        this.f90673d = jVar;
        this.f90674e = sVar;
        this.f90675f = vVar;
        this.f90676g = q2.a(0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Li31/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_ONBOARDING_ITEMS", "I", "MAX_ONBOARDING_EDGE_ITEMS", "MAX_DEVICE_COUNT", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
