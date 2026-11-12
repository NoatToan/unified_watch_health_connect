package qe1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lqe1/h;", "", "", "calendarDate", "", FirebaseAnalytics.Param.SCORE, "classification", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Integer score;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("classification")
    private final String classification;

    public h(String str, Integer num, String str2) {
        this.calendarDate = str;
        this.score = num;
        this.classification = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getClassification() {
        return this.classification;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.calendarDate, hVar.calendarDate) && s.g(this.score, hVar.score) && s.g(this.classification, hVar.classification);
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.score;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.classification;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.calendarDate;
        return am.j.o(this.classification, ")", u0.n("RunningEconomyDailyDTO(calendarDate=", this.score, str, ", score=", ", classification="));
    }
}
