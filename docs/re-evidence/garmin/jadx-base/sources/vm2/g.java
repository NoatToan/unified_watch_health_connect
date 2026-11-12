package vm2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvm2/g;", "", "", "isActivityTrackerUpdated", "isNewRegistration", "<init>", "(ZZ)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178830b;

    public /* synthetic */ g(boolean z14, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f178829a == gVar.f178829a && this.f178830b == gVar.f178830b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178830b) + (Boolean.hashCode(this.f178829a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("RegistrationResult(isActivityTrackerUpdated=", ", isNewRegistration=", ")", this.f178829a, this.f178830b);
    }

    public g(boolean z14) {
        this(z14, false, 2, null);
    }

    public g(boolean z14, boolean z15) {
        this.f178829a = z14;
        this.f178830b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
