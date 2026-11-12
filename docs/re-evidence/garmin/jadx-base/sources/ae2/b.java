package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lae2/b;", "", "Lorg/joda/time/DateTime;", TtmlNode.START, TtmlNode.END, "Lae2/e0;", "publisher", "", "groupTrackSessionId", "", "Lae2/h0;", "liveTrackSessions", "Lae2/d;", "errors", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lae2/e0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "b", "c", "Lae2/e0;", "f", "()Lae2/e0;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "()Ljava/util/List;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.START)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.END)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupTrackSessionId")
    private final String groupTrackSessionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackSessions")
    private final List<h0> liveTrackSessions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errors")
    private final List<d> errors;

    public /* synthetic */ b(DateTime dateTime, DateTime dateTime2, e0 e0Var, String str, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dateTime2, (i14 & 4) != 0 ? null : e0Var, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : list2);
    }

    public static void a(b bVar, ArrayList arrayList) {
        new b(bVar.start, bVar.end, bVar.publisher, bVar.groupTrackSessionId, arrayList, bVar.errors);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getEnd() {
        return this.end;
    }

    public final List<d> c() {
        return this.errors;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGroupTrackSessionId() {
        return this.groupTrackSessionId;
    }

    public final List<h0> e() {
        return this.liveTrackSessions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.start, bVar.start) && p005kotlin.jvm.internal.s.g(this.end, bVar.end) && p005kotlin.jvm.internal.s.g(this.publisher, bVar.publisher) && p005kotlin.jvm.internal.s.g(this.groupTrackSessionId, bVar.groupTrackSessionId) && p005kotlin.jvm.internal.s.g(this.liveTrackSessions, bVar.liveTrackSessions) && p005kotlin.jvm.internal.s.g(this.errors, bVar.errors);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e0 getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getStart() {
        return this.start;
    }

    public final int hashCode() {
        DateTime dateTime = this.start;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.end;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        e0 e0Var = this.publisher;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str = this.groupTrackSessionId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<h0> list = this.liveTrackSessions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.errors;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        DateTime dateTime = this.start;
        DateTime dateTime2 = this.end;
        e0 e0Var = this.publisher;
        String str = this.groupTrackSessionId;
        List<h0> list = this.liveTrackSessions;
        List<d> list2 = this.errors;
        StringBuilder sb3 = new StringBuilder("CreateSessionResponseDTO(start=");
        sb3.append(dateTime);
        sb3.append(", end=");
        sb3.append(dateTime2);
        sb3.append(", publisher=");
        sb3.append(e0Var);
        sb3.append(", groupTrackSessionId=");
        sb3.append(str);
        sb3.append(", liveTrackSessions=");
        return n23.j.j(sb3, list, ", errors=", list2, ")");
    }

    public b(DateTime dateTime, DateTime dateTime2, e0 e0Var, String str, List<h0> list, List<d> list2) {
        this.start = dateTime;
        this.end = dateTime2;
        this.publisher = e0Var;
        this.groupTrackSessionId = str;
        this.liveTrackSessions = list;
        this.errors = list2;
    }

    public b() {
        this(null, null, null, null, null, null, 63, null);
    }
}
