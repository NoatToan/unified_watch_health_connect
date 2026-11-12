package z80;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz80/m;", "", "", "sleepTimeInSeconds", "sleepEndTimeInSeconds", "", "isDefaultSleepTime", "isDefaultWakeTime", "<init>", "(IIZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f203088d;

    public /* synthetic */ m(int i14, int i15, boolean z14, boolean z15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? false : z14, (i16 & 8) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f203085a == mVar.f203085a && this.f203086b == mVar.f203086b && this.f203087c == mVar.f203087c && this.f203088d == mVar.f203088d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203088d) + q6.f.g(q2.d(this.f203086b, Integer.hashCode(this.f203085a) * 31, 31), 31, this.f203087c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", isDefaultWakeTime=", ")", e5.j(this.f203085a, this.f203086b, "UserSleepData(sleepTimeInSeconds=", ", sleepEndTimeInSeconds=", ", isDefaultSleepTime="), this.f203087c, this.f203088d);
    }

    public m(int i14, int i15, boolean z14, boolean z15) {
        this.f203085a = i14;
        this.f203086b = i15;
        this.f203087c = z14;
        this.f203088d = z15;
    }
}
