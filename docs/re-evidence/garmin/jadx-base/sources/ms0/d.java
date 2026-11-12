package ms0;

import com.google.firebase.messaging.Constants;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lms0/d;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "locationTitle", "locationValue", "dateTitle", "Lorg/joda/time/LocalDate;", "date", "timeTitle", "Lorg/joda/time/LocalTime;", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Ljava/lang/String;Lorg/joda/time/LocalTime;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LocalDate f120462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f120463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalTime f120464g;

    public d(String str, String str2, String str3, String str4, LocalDate localDate, String str5, LocalTime localTime) {
        kg.f.p(str, str2, str4, str5);
        this.f120458a = str;
        this.f120459b = str2;
        this.f120460c = str3;
        this.f120461d = str4;
        this.f120462e = localDate;
        this.f120463f = str5;
        this.f120464g = localTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f120458a.equals(dVar.f120458a) && this.f120459b.equals(dVar.f120459b) && s.g(this.f120460c, dVar.f120460c) && this.f120461d.equals(dVar.f120461d) && s.g(this.f120462e, dVar.f120462e) && this.f120463f.equals(dVar.f120463f) && s.g(this.f120464g, dVar.f120464g);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f120458a.hashCode() * 31, 31, this.f120459b);
        String str = this.f120460c;
        int iJ2 = wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f120461d);
        LocalDate localDate = this.f120462e;
        int iJ3 = wr.g.j((iJ2 + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f120463f);
        LocalTime localTime = this.f120464g;
        return iJ3 + (localTime != null ? localTime.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FlightDetailsViewData(label=", this.f120458a, ", locationTitle=", this.f120459b, ", locationValue=");
        sn.a.t(sbI, this.f120460c, ", dateTitle=", this.f120461d, ", date=");
        sbI.append(this.f120462e);
        sbI.append(", timeTitle=");
        sbI.append(this.f120463f);
        sbI.append(", time=");
        sbI.append(this.f120464g);
        sbI.append(")");
        return sbI.toString();
    }
}
