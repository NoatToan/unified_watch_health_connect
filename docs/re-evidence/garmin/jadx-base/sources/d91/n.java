package d91;

import com.garmin.android.apps.connectmobile.util.adapters.LocalDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ld91/n;", "", "Ld91/d;", "status", "Lorg/joda/time/LocalDateTime;", "timestampUtc", "<init>", "(Ld91/d;Lorg/joda/time/LocalDateTime;)V", "a", "Ld91/d;", "()Ld91/d;", "b", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final d status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampUtc")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime timestampUtc;

    public n(d dVar, LocalDateTime localDateTime) {
        this.status = dVar;
        this.timestampUtc = localDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDateTime getTimestampUtc() {
        return this.timestampUtc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.status == nVar.status && p005kotlin.jvm.internal.s.g(this.timestampUtc, nVar.timestampUtc);
    }

    public final int hashCode() {
        d dVar = this.status;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        LocalDateTime localDateTime = this.timestampUtc;
        return iHashCode + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public final String toString() {
        return "MessageStatusDTO(status=" + this.status + ", timestampUtc=" + this.timestampUtc + ")";
    }
}
