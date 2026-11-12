package av1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lav1/c;", "", "", "mostRecentValue", "chargedValue", "drainedValue", "", "last7DaysDataAvailable", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f13247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f13248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13249d;

    public /* synthetic */ c(Integer num, Integer num2, Integer num3, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f13246a, cVar.f13246a) && s.g(this.f13247b, cVar.f13247b) && s.g(this.f13248c, cVar.f13248c) && this.f13249d == cVar.f13249d;
    }

    public final int hashCode() {
        Integer num = this.f13246a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f13247b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13248c;
        return Boolean.hashCode(this.f13249d) + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f13246a, "FBTDashboardBodyBatteryDTO(mostRecentValue=", ", chargedValue=", ", drainedValue=", this.f13247b);
        sbL.append(this.f13248c);
        sbL.append(", last7DaysDataAvailable=");
        sbL.append(this.f13249d);
        sbL.append(")");
        return sbL.toString();
    }

    public c(Integer num, Integer num2, Integer num3, boolean z14) {
        this.f13246a = num;
        this.f13247b = num2;
        this.f13248c = num3;
        this.f13249d = z14;
    }

    public c() {
        this(null, null, null, false, 15, null);
    }
}
