package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lae2/y;", "", "", "isDefaultName", "Lorg/joda/time/DateTime;", TtmlNode.END, "Lae2/e0;", "publisher", "Lorg/joda/time/Period;", "viewable", "", "name", "<init>", "(Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lae2/e0;Lorg/joda/time/Period;Ljava/lang/String;)V", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "Lorg/joda/time/DateTime;", "getEnd", "()Lorg/joda/time/DateTime;", "c", "Lae2/e0;", "getPublisher", "()Lae2/e0;", "d", "Lorg/joda/time/Period;", "getViewable", "()Lorg/joda/time/Period;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultName")
    private final Boolean isDefaultName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.END)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewable")
    @JsonAdapter(PeriodAdapter.class)
    private final Period viewable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    public /* synthetic */ y(Boolean bool, DateTime dateTime, e0 e0Var, Period period, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : e0Var, (i14 & 8) != 0 ? null : period, (i14 & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.isDefaultName, yVar.isDefaultName) && p005kotlin.jvm.internal.s.g(this.end, yVar.end) && p005kotlin.jvm.internal.s.g(this.publisher, yVar.publisher) && p005kotlin.jvm.internal.s.g(this.viewable, yVar.viewable) && p005kotlin.jvm.internal.s.g(this.name, yVar.name);
    }

    public final int hashCode() {
        Boolean bool = this.isDefaultName;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        DateTime dateTime = this.end;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        e0 e0Var = this.publisher;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Period period = this.viewable;
        int iHashCode4 = (iHashCode3 + (period == null ? 0 : period.hashCode())) * 31;
        String str = this.name;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isDefaultName;
        DateTime dateTime = this.end;
        e0 e0Var = this.publisher;
        Period period = this.viewable;
        String str = this.name;
        StringBuilder sb3 = new StringBuilder("PatchSessionsRequest(isDefaultName=");
        sb3.append(bool);
        sb3.append(", end=");
        sb3.append(dateTime);
        sb3.append(", publisher=");
        sb3.append(e0Var);
        sb3.append(", viewable=");
        sb3.append(period);
        sb3.append(", name=");
        return am.j.o(str, ")", sb3);
    }

    public y(Boolean bool, DateTime dateTime, e0 e0Var, Period period, String str) {
        this.isDefaultName = bool;
        this.end = dateTime;
        this.publisher = e0Var;
        this.viewable = period;
        this.name = str;
    }

    public y() {
        this(null, null, null, null, null, 31, null);
    }
}
