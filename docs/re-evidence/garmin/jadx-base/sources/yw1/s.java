package yw1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyw1/s;", "", "", "calendarDate", "", "Lyw1/t;", "exerciseSummaries", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSummaries")
    private final List<t> exerciseSummaries;

    public s(String str, List<t> list) {
        this.calendarDate = str;
        this.exerciseSummaries = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final List<t> b() {
        return this.exerciseSummaries;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.calendarDate, sVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.exerciseSummaries, sVar.exerciseSummaries);
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<t> list = this.exerciseSummaries;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return fb1.c.o("StrengthDailyStatsDTO(calendarDate=", this.calendarDate, ", exerciseSummaries=", this.exerciseSummaries, ")");
    }
}
