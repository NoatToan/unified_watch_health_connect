package wi0;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwi0/a;", "", "", Constants.MessagePayloadKeys.FROM, "until", "series", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "b", "getUntil", "c", "d", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.MessagePayloadKeys.FROM)
    private final String from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("until")
    private final String until;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("series")
    private final String series;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    public /* synthetic */ a(String str, String str2, String str3, Double d14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : d14);
    }

    public final DateTime a() {
        return k.q(this.from, "yyyy-MM-dd", DateTimeZone.UTC);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSeries() {
        return this.series;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.from, aVar.from) && s.g(this.until, aVar.until) && s.g(this.series, aVar.series) && s.g(this.value, aVar.value);
    }

    public final int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.until;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.series;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.value;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.from;
        String str2 = this.until;
        String str3 = this.series;
        Double d14 = this.value;
        StringBuilder sbI = b.i("FtpReportSummaryDTO(from=", str, ", until=", str2, ", series=");
        sbI.append(str3);
        sbI.append(", value=");
        sbI.append(d14);
        sbI.append(")");
        return sbI.toString();
    }

    public a(String str, String str2, String str3, Double d14) {
        this.from = str;
        this.until = str2;
        this.series = str3;
        this.value = d14;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
