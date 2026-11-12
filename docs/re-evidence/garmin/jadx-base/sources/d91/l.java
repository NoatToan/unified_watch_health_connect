package d91;

import com.garmin.android.apps.connectmobile.util.adapters.LocalDateTimeAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ld91/l;", "", "Lorg/joda/time/LocalDateTime;", "timestampUtc", "timestampLocal", "", "requestedLanguage", "Ld91/m;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ld91/m;)V", "a", "Lorg/joda/time/LocalDateTime;", "getTimestampUtc", "()Lorg/joda/time/LocalDateTime;", "b", "getTimestampLocal", "c", "Ljava/lang/String;", "getRequestedLanguage", "()Ljava/lang/String;", "d", "Ld91/m;", "getLocation", "()Ld91/m;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampUtc")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime timestampUtc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampLocal")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime timestampLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestedLanguage")
    private final String requestedLanguage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final m location;

    public l(LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, m mVar) {
        localDateTime.getClass();
        localDateTime2.getClass();
        this.timestampUtc = localDateTime;
        this.timestampLocal = localDateTime2;
        this.requestedLanguage = str;
        this.location = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.timestampUtc, lVar.timestampUtc) && p005kotlin.jvm.internal.s.g(this.timestampLocal, lVar.timestampLocal) && p005kotlin.jvm.internal.s.g(this.requestedLanguage, lVar.requestedLanguage) && p005kotlin.jvm.internal.s.g(this.location, lVar.location);
    }

    public final int hashCode() {
        int iHashCode = (this.timestampLocal.hashCode() + (this.timestampUtc.hashCode() * 31)) * 31;
        String str = this.requestedLanguage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.location;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "MessageRequestDTO(timestampUtc=" + this.timestampUtc + ", timestampLocal=" + this.timestampLocal + ", requestedLanguage=" + this.requestedLanguage + ", location=" + this.location + ")";
    }
}
