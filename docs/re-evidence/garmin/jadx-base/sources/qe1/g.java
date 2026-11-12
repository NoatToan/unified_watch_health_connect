package qe1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqe1/g;", "", "", "calendarDate", "", FirebaseAnalytics.Param.SCORE, "Laf1/e;", "classification", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Laf1/e;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Laf1/e;", "()Laf1/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Integer score;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("classification")
    private final af1.e classification;

    public g(String str, Integer num, af1.e eVar) {
        this.calendarDate = str;
        this.score = num;
        this.classification = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final af1.e getClassification() {
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.calendarDate, gVar.calendarDate) && s.g(this.score, gVar.score) && this.classification == gVar.classification;
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.score;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        af1.e eVar = this.classification;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.calendarDate;
        Integer num = this.score;
        af1.e eVar = this.classification;
        StringBuilder sbN = u0.n("RunningEconomyDTO(calendarDate=", num, str, ", score=", ", classification=");
        sbN.append(eVar);
        sbN.append(")");
        return sbN.toString();
    }
}
