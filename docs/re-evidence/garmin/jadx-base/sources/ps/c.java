package ps;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0017\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0019\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b\u001e\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lps/c;", "", "", "calendarEventId", "", "calendarEventUuid", "completionTargetUnitType", "", "completionTargetValue", "customGoalUnitType", "customGoalValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/Long;", "getCalendarEventId", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "getCalendarEventUuid", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "c", "getCompletionTargetUnitType", "d", "Ljava/lang/Double;", "getCompletionTargetValue", "()Ljava/lang/Double;", "(Ljava/lang/Double;)V", JWKParameterNames.RSA_EXPONENT, "getCustomGoalUnitType", "f", "getCustomGoalValue", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventId")
    private Long calendarEventId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventUuid")
    private String calendarEventUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetUnitType")
    private String completionTargetUnitType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetValue")
    private Double completionTargetValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customGoalUnitType")
    private String customGoalUnitType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customGoalValue")
    private Double customGoalValue;

    public /* synthetic */ c(Long l14, String str, String str2, Double d14, String str3, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : d15);
    }

    public final void a(Long l14) {
        this.calendarEventId = l14;
    }

    public final void b(String str) {
        this.calendarEventUuid = str;
    }

    public final void c(String str) {
        this.completionTargetUnitType = str;
    }

    public final void d(Double d14) {
        this.completionTargetValue = d14;
    }

    public final void e(String str) {
        this.customGoalUnitType = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.calendarEventId, cVar.calendarEventId) && p005kotlin.jvm.internal.s.g(this.calendarEventUuid, cVar.calendarEventUuid) && p005kotlin.jvm.internal.s.g(this.completionTargetUnitType, cVar.completionTargetUnitType) && p005kotlin.jvm.internal.s.g(this.completionTargetValue, cVar.completionTargetValue) && p005kotlin.jvm.internal.s.g(this.customGoalUnitType, cVar.customGoalUnitType) && p005kotlin.jvm.internal.s.g(this.customGoalValue, cVar.customGoalValue);
    }

    public final void f(Double d14) {
        this.customGoalValue = d14;
    }

    public final int hashCode() {
        Long l14 = this.calendarEventId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.calendarEventUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.completionTargetUnitType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.completionTargetValue;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.customGoalUnitType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d15 = this.customGoalValue;
        return iHashCode5 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.calendarEventId;
        String str = this.calendarEventUuid;
        String str2 = this.completionTargetUnitType;
        Double d14 = this.completionTargetValue;
        String str3 = this.customGoalUnitType;
        Double d15 = this.customGoalValue;
        StringBuilder sbJ = b71.i.j("ActivityCalendarEventInfoDTO(calendarEventId=", ", calendarEventUuid=", str, l14, ", completionTargetUnitType=");
        b71.i.x(sbJ, str2, ", completionTargetValue=", d14, ", customGoalUnitType=");
        sbJ.append(str3);
        sbJ.append(", customGoalValue=");
        sbJ.append(d15);
        sbJ.append(")");
        return sbJ.toString();
    }

    public c(Long l14, String str, String str2, Double d14, String str3, Double d15) {
        this.calendarEventId = l14;
        this.calendarEventUuid = str;
        this.completionTargetUnitType = str2;
        this.completionTargetValue = d14;
        this.customGoalUnitType = str3;
        this.customGoalValue = d15;
    }
}
