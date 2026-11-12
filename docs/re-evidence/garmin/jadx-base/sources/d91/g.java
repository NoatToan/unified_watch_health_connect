package d91;

import com.garmin.android.apps.connectmobile.util.adapters.LocalDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Ld91/g;", "", "Lorg/joda/time/LocalDateTime;", "timestampLocal", "timestampUtc", "Ld91/f;", "reaction", "feedbackSentiment", "", "Ld91/b;", "concerns", "", "review", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ld91/f;Ld91/f;Ljava/util/List;Ljava/lang/String;)V", "a", "Lorg/joda/time/LocalDateTime;", "getTimestampLocal", "()Lorg/joda/time/LocalDateTime;", "b", "getTimestampUtc", "c", "Ld91/f;", "()Ld91/f;", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "()Ljava/util/List;", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampLocal")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime timestampLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampUtc")
    @JsonAdapter(LocalDateTimeAdapter.class)
    private final LocalDateTime timestampUtc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reaction")
    private final f reaction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackSentiment")
    private final f feedbackSentiment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("concerns")
    private final List<b> concerns;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("review")
    private final String review;

    /* JADX WARN: Multi-variable type inference failed */
    public g(LocalDateTime localDateTime, LocalDateTime localDateTime2, f fVar, f fVar2, List<? extends b> list, String str) {
        this.timestampLocal = localDateTime;
        this.timestampUtc = localDateTime2;
        this.reaction = fVar;
        this.feedbackSentiment = fVar2;
        this.concerns = list;
        this.review = str;
    }

    public final List<b> a() {
        return this.concerns;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getFeedbackSentiment() {
        return this.feedbackSentiment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReview() {
        return this.review;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.timestampLocal, gVar.timestampLocal) && p005kotlin.jvm.internal.s.g(this.timestampUtc, gVar.timestampUtc) && this.reaction == gVar.reaction && this.feedbackSentiment == gVar.feedbackSentiment && p005kotlin.jvm.internal.s.g(this.concerns, gVar.concerns) && p005kotlin.jvm.internal.s.g(this.review, gVar.review);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.timestampLocal;
        int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
        LocalDateTime localDateTime2 = this.timestampUtc;
        int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        f fVar = this.reaction;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.feedbackSentiment;
        int iHashCode4 = (iHashCode3 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        List<b> list = this.concerns;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.review;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MessageFeedbackDTO(timestampLocal=" + this.timestampLocal + ", timestampUtc=" + this.timestampUtc + ", reaction=" + this.reaction + ", feedbackSentiment=" + this.feedbackSentiment + ", concerns=" + this.concerns + ", review=" + this.review + ")";
    }
}
