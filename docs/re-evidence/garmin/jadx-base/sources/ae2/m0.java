package ae2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001e¨\u00063"}, d2 = {"Lae2/m0;", "", "", "", "courseIds", "", "isDefaultName", "Lorg/joda/time/Period;", "duration", "name", "Lae2/z;", ModelSourceWrapper.POSITION, "Lae2/e0;", "publisher", "shortUrl", "Lorg/joda/time/DateTime;", TtmlNode.START, "viewable", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lorg/joda/time/Period;Ljava/lang/String;Lae2/z;Lae2/e0;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lorg/joda/time/Period;)V", "a", "Ljava/util/List;", "getCourseIds", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Lorg/joda/time/Period;", "getDuration", "()Lorg/joda/time/Period;", "d", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Lae2/z;", "getPosition", "()Lae2/z;", "f", "Lae2/e0;", "getPublisher", "()Lae2/e0;", "g", "getShortUrl", "h", "Lorg/joda/time/DateTime;", "getStart", "()Lorg/joda/time/DateTime;", IntegerTokenConverter.CONVERTER_KEY, "getViewable", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseIds")
    private final List<String> courseIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultName")
    private final Boolean isDefaultName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    @JsonAdapter(PeriodAdapter.class)
    private final Period duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final z position;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortUrl")
    private final Boolean shortUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.START)
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime start;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewable")
    @JsonAdapter(PeriodAdapter.class)
    private final Period viewable;

    public /* synthetic */ m0(List list, Boolean bool, Period period, String str, z zVar, e0 e0Var, Boolean bool2, DateTime dateTime, Period period2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? Boolean.TRUE : bool, (i14 & 4) != 0 ? null : period, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : zVar, (i14 & 32) != 0 ? null : e0Var, (i14 & 64) != 0 ? null : bool2, (i14 & 128) != 0 ? null : dateTime, (i14 & 256) != 0 ? null : period2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p005kotlin.jvm.internal.s.g(this.courseIds, m0Var.courseIds) && p005kotlin.jvm.internal.s.g(this.isDefaultName, m0Var.isDefaultName) && p005kotlin.jvm.internal.s.g(this.duration, m0Var.duration) && p005kotlin.jvm.internal.s.g(this.name, m0Var.name) && p005kotlin.jvm.internal.s.g(this.position, m0Var.position) && p005kotlin.jvm.internal.s.g(this.publisher, m0Var.publisher) && p005kotlin.jvm.internal.s.g(this.shortUrl, m0Var.shortUrl) && p005kotlin.jvm.internal.s.g(this.start, m0Var.start) && p005kotlin.jvm.internal.s.g(this.viewable, m0Var.viewable);
    }

    public final int hashCode() {
        List<String> list = this.courseIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isDefaultName;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Period period = this.duration;
        int iHashCode3 = (iHashCode2 + (period == null ? 0 : period.hashCode())) * 31;
        String str = this.name;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        z zVar = this.position;
        int iHashCode5 = (iHashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        e0 e0Var = this.publisher;
        int iHashCode6 = (iHashCode5 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Boolean bool2 = this.shortUrl;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DateTime dateTime = this.start;
        int iHashCode8 = (iHashCode7 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Period period2 = this.viewable;
        return iHashCode8 + (period2 != null ? period2.hashCode() : 0);
    }

    public final String toString() {
        return "SingleSessionRequestDto(courseIds=" + this.courseIds + ", isDefaultName=" + this.isDefaultName + ", duration=" + this.duration + ", name=" + this.name + ", position=" + this.position + ", publisher=" + this.publisher + ", shortUrl=" + this.shortUrl + ", start=" + this.start + ", viewable=" + this.viewable + ")";
    }

    public m0(List<String> list, Boolean bool, Period period, String str, z zVar, e0 e0Var, Boolean bool2, DateTime dateTime, Period period2) {
        this.courseIds = list;
        this.isDefaultName = bool;
        this.duration = period;
        this.name = str;
        this.position = zVar;
        this.publisher = e0Var;
        this.shortUrl = bool2;
        this.start = dateTime;
        this.viewable = period2;
    }

    public m0() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
