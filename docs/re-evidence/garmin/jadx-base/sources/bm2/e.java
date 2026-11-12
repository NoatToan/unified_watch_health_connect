package bm2;

import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbm2/e;", "", "", "primaryActivityTrackerID", "", "primaryActivityTrackerName", "deviceID", "", "aatOnThisAccount", "thisDeviceAATOnOtherAccount", "previousAssociationWithOther", "<init>", "(JLjava/lang/String;JZZZ)V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f18956g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18962f;

    public /* synthetic */ e(long j8, String str, long j14, boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? 0L : j14, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18957a == eVar.f18957a && s.g(this.f18958b, eVar.f18958b) && this.f18959c == eVar.f18959c && this.f18960d == eVar.f18960d && this.f18961e == eVar.f18961e && this.f18962f == eVar.f18962f;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f18957a) * 31;
        String str = this.f18958b;
        return Boolean.hashCode(this.f18962f) + q6.f.g(q6.f.g(q6.f.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18959c), 31, this.f18960d), 31, this.f18961e);
    }

    public final String toString() {
        long j8 = this.f18957a;
        String str = this.f18958b;
        long j14 = this.f18959c;
        boolean z14 = this.f18960d;
        boolean z15 = this.f18961e;
        boolean z16 = this.f18962f;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "DeviceRegistrationDTO(primaryActivityTrackerID=", ", primaryActivityTrackerName=", str);
        x.j(j14, ", deviceID=", ", aatOnThisAccount=", sbK);
        kg.f.q(", thisDeviceAATOnOtherAccount=", ", previousAssociationWithOther=", sbK, z14, z15);
        return hb.a.k(sbK, z16, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbm2/e$a;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(long j8, String str, long j14, boolean z14, boolean z15, boolean z16) {
        this.f18957a = j8;
        this.f18958b = str;
        this.f18959c = j14;
        this.f18960d = z14;
        this.f18961e = z15;
        this.f18962f = z16;
    }

    public e() {
        this(0L, null, 0L, false, false, false, 63, null);
    }
}
