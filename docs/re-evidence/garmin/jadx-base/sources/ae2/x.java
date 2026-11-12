package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lae2/x;", "", "Lorg/joda/time/DateTime;", "sessionEndTime", "Lae2/e0;", "publisher", "Lorg/joda/time/Period;", "viewableDuration", "<init>", "(Lorg/joda/time/DateTime;Lae2/e0;Lorg/joda/time/Period;)V", "a", "Lorg/joda/time/DateTime;", "getSessionEndTime", "()Lorg/joda/time/DateTime;", "b", "Lae2/e0;", "getPublisher", "()Lae2/e0;", "c", "Lorg/joda/time/Period;", "getViewableDuration", "()Lorg/joda/time/Period;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionEndTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime sessionEndTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewableDuration")
    @JsonAdapter(PeriodAdapter.class)
    private final Period viewableDuration;

    public /* synthetic */ x(DateTime dateTime, e0 e0Var, Period period, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : e0Var, (i14 & 4) != 0 ? null : period);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.sessionEndTime, xVar.sessionEndTime) && p005kotlin.jvm.internal.s.g(this.publisher, xVar.publisher) && p005kotlin.jvm.internal.s.g(this.viewableDuration, xVar.viewableDuration);
    }

    public final int hashCode() {
        DateTime dateTime = this.sessionEndTime;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        e0 e0Var = this.publisher;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Period period = this.viewableDuration;
        return iHashCode2 + (period != null ? period.hashCode() : 0);
    }

    public final String toString() {
        return "PatchGroupSessionRequest(sessionEndTime=" + this.sessionEndTime + ", publisher=" + this.publisher + ", viewableDuration=" + this.viewableDuration + ")";
    }

    public x(DateTime dateTime, e0 e0Var, Period period) {
        this.sessionEndTime = dateTime;
        this.publisher = e0Var;
        this.viewableDuration = period;
    }

    public x() {
        this(null, null, null, 7, null);
    }
}
