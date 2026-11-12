package ab1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lab1/m;", "", "", "eventName", "", "eventDistance", "Lorg/joda/time/LocalDate;", "eventDate", "", "eventCourseId", "powerGuideId", "", "isSharable", "<init>", "(Ljava/lang/String;DLorg/joda/time/LocalDate;JLjava/lang/Long;Ljava/lang/Boolean;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f2608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f2610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f2611f;

    public m(String str, double d14, LocalDate localDate, long j8, Long l14, Boolean bool) {
        str.getClass();
        localDate.getClass();
        this.f2606a = str;
        this.f2607b = d14;
        this.f2608c = localDate;
        this.f2609d = j8;
        this.f2610e = l14;
        this.f2611f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2606a.equals(mVar.f2606a) && Double.compare(this.f2607b, mVar.f2607b) == 0 && this.f2608c.equals(mVar.f2608c) && this.f2609d == mVar.f2609d && s.g(this.f2610e, mVar.f2610e) && s.g(this.f2611f, mVar.f2611f);
    }

    public final int hashCode() {
        int iE = q6.f.e((this.f2608c.hashCode() + org.apache.commons.lang3.e.b(this.f2606a.hashCode() * 31, 31, this.f2607b)) * 31, 31, this.f2609d);
        Long l14 = this.f2610e;
        int iHashCode = (iE + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.f2611f;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ScheduledEventAdapterItem(eventName=" + this.f2606a + ", eventDistance=" + this.f2607b + ", eventDate=" + this.f2608c + ", eventCourseId=" + this.f2609d + ", powerGuideId=" + this.f2610e + ", isSharable=" + this.f2611f + ")";
    }
}
